
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;






public class PACVM {
	
	boolean flag = false;
    
    public static enum TokenType {
    	
        INTEGER ("(\\+|-)?[0-9]+"),BOOLEAN ( "true|false"),
        
        STARTBLOCK( "SCOPEBEGINS"), STARTINNERBLOCK("INNERSCOPEBEGINS"), BLOCKEND("SCOPEENDS"),
        OPERATOR ( "MUL|ADD|SUB|ORR|AND|LET|LEQ|DIV|GTN|EQU|GRE"),EXECUTE("EXECUTE"),
        IDENTIFIER ( "[A-Za-z_][A-Za-z0-9]*"),STRING("\"(\\.|[^\"])*\"")
        ;
        
        public final String pattern;
        private TokenType(String pattern){
            this.pattern = pattern;
        }
    }
    
    
    public static class Token{
        TokenType type;
        String stringValue;

        public Token(TokenType type, String token) {
            this.type = type;
            this.stringValue = token;
        }
    }

    class Tokenizer implements Iterator<String> {
        private final BufferedReader source;
        Queue<Token> tokens = new ArrayDeque<>();
        Pattern pattern;

        Tokenizer(String s) {
            this(new BufferedReader(new StringReader(s)));
        }

        Tokenizer(Reader source) {
            this(new BufferedReader(source));
        }

        Tokenizer(BufferedReader source) {
            this.source = source;

            StringBuilder regex = new StringBuilder();
            for (TokenType t: TokenType.values()) {
                regex.append("|(?<").append(t.name()).append(">").append(t.pattern).append(")");
            }
            this.pattern = Pattern.compile(regex.substring(1)); 
            //System.out.println(this.pattern);// skip the first |
        }

        void tokenize(String src){

            Matcher matcher = this.pattern.matcher(src);
            while (matcher.find()) {
                String tv;
                for (TokenType tt : TokenType.values()){
                    if ( (tv = matcher.group(tt.name())) != null) {
                        tokens.add(new Token(tt, tv));
                        break;
                    }
                }
            }

        }

        public boolean hasNext() {

            while (tokens.isEmpty()) {
                String line = null;

                try {
                    line = source.readLine();
                } catch (IOException e) {
                    return false;
                }

                if (line == null)
                    return false;
                else {
                    tokenize(line);
                }
            }

            return true;
        }

        public String next() {
            if (!hasNext()) {
                return null;
            } else {
//                if (trace) {
//                    System.out.println("-->" +  tokens.element().stringValue);
//                    showEnvironment();
//                }
                return tokens.remove().stringValue;
            }
        }

        TokenType nextType() {
            if (!hasNext()) {
                return null;
            } else {
                return tokens.element().type;
            }
        }

		@Override
		public void remove() {
			
		}
    }
    

    class SymbolEntry{
        String name;
        String value;

        
        SymbolEntry(String name, String value) {
            this.name = name;
            this.value = value;
        }
        


        @Override
        public String toString() {
            return value;
        }
    }
    
    class SymbolTable{
        LinkedList<HashMap<String, SymbolEntry> > symbols = new LinkedList< HashMap<String, SymbolEntry>>();
        LinkedList<HashMap <String, Stack<String>>> stackMap = new LinkedList<HashMap<String, Stack<String>> >();
        
//        void stackEnters(String name){
//        	stackMap.addFirst(new HashMap <String, Stack<String>>());
//        	//stackMap.put(name,new Stack<String>());
//        }
        
        void stackPush(String name,String value){
        	//stackMap.get(name).push(value);
        	if(stackMap.getFirst().containsKey(name)){
        	stackMap.getFirst().get(name).push(value);
        	}
        	else {
        		System.out.println("Cannot push to stack:" + name + ". Stack does not exist");
        	}
        }
        
        String stackPop(String name){
        	//return stackMap.get(name).pop();
        	for(HashMap<String, Stack<String>> table : stackMap){
        		if(table.containsKey(name)){
        			try{
        			return table.get(name).pop();
        			}
        			catch(EmptyStackException e){
        				return null;
        			}
        		}
        		
        	}
        	return null;
        }
        
        
        SymbolEntry get(String symbol) {
            for (HashMap<String, SymbolEntry> table: symbols) {
                if (table.containsKey(symbol)) {
                    return table.get(symbol);
                }
            }
            error("Attempted to access undefined symbol: "+ symbol);
            return null;
        }

        void bind(String name, String initialValue) {
            symbols.getFirst().put(name, new SymbolEntry(name, initialValue));
            
            
        }
        void bindStack(String name){
        	stackMap.getFirst().put(name, new Stack<String>());
        }
        String showStack(String name){
        	for(HashMap<String, Stack<String>> table : stackMap){
        		if(table.containsKey(name)){
        			try{
        			return table.get(name).toString();
        			}
        			catch(EmptyStackException e){
        				return null;
        			}
        		}
        		
        	}
        	return null;
        }

        void enter() {
            symbols.addFirst(new HashMap<String, SymbolEntry>());
            stackMap.addFirst(new HashMap <String, Stack<String>>());
            
        }
        


        void exit() {
            symbols.removeFirst();
            stackMap.removeFirst();
            
        }
     }
    

    
    Stack<String> stack = new java.util.Stack<String>();
    //Stack<String> vmStack = new java.util.Stack<String>();
    SymbolTable symbols = new SymbolTable();
    LineNumberReader source = null;
    Boolean trace = false;
    String filename = "<stdin>";
    
    PACVM(File src) throws FileNotFoundException {
        this(new FileReader(src));
        this.filename = src.getName();
    }

    PACVM(InputStream src) {
        this(new InputStreamReader(src));
    }

    PACVM(Reader src) {
        source = new LineNumberReader(src);
    }
    
    
    
    void error(String message) {
        throw new RuntimeException("ERROR(" + source.getLineNumber() + "):" + message);
    }
    
    void push(String value) {
        stack.push(value);
        
    }
    void showEnvironment() {
        System.out.println(" ,:");
        for (HashMap<String, SymbolEntry> scope : symbols.symbols){
            System.out.println(":::   scope:" + scope);
        }
        System.out.println(":::");
        System.out.println(":::   stack" + stack);
        System.out.println(" `:");
    }

    String pop() {
        String result = stack.pop();
        
        return result;
    }
    
    void processOperator(Tokenizer scanner) { 
        String op = scanner.next();
        String s2 = pop();
        String s1 = pop();
        switch (op) {
            case "ADD":
                push(String.valueOf(Integer.parseInt(s1) + Integer.parseInt(s2)));
                break;
            case "SUB":
                push(String.valueOf(Integer.parseInt(s1) - Integer.parseInt(s2)));
                break;
            case "MUL":
                push(String.valueOf(Integer.parseInt(s1) * Integer.parseInt(s2)));
                break;
            case "DIV":
                push(String.valueOf(Integer.parseInt(s1) / Integer.parseInt(s2)));
                break;

            case "LET":
                push(String.valueOf(Integer.parseInt(s1) < Integer.parseInt(s2)));
                break;
            case "GTN":
                push(String.valueOf(Integer.parseInt(s1) > Integer.parseInt(s2)));
                break;
            case "EQU":
            	//System.out.println("REACHED EQU "+ String.valueOf(Integer.parseInt(s1) == Integer.parseInt(s2))
            		//	);
                push(String.valueOf(Integer.parseInt(s1) == Integer.parseInt(s2)));
                break;
            case "LEQ":
                push(String.valueOf(Integer.parseInt(s1) <= Integer.parseInt(s2)));
                break;
            case "GRE":
                push(String.valueOf(Integer.parseInt(s1) >= Integer.parseInt(s2)));
                break;

            case "AND":
                push(String.valueOf(Boolean.parseBoolean(s1) & Boolean.parseBoolean(s2)));
                break;
            case "ORR":
                push(String.valueOf(Boolean.parseBoolean(s1) | Boolean.parseBoolean(s2)));
                break;
        }
    }
    
    void run() {
        //The start rule is 'block'
        processBlock(new Tokenizer(source));
    }
    
    
    String unquoted(String s) {
        return s.substring(1, s.length()-1);
    }
    
    
    void processBlock(Tokenizer scanner){
    	TokenType next = scanner.nextType();
    	//System.out.println(next);
    	//flag=false; 
    	if (next ==  TokenType.STARTBLOCK)
    	{
    		scanner.next();
            symbols.enter();
            
            while (scanner.nextType() != TokenType.BLOCKEND ) {
            	//showEnvironment();
            	
            	//System.out.println(scanner.nextType());
            	switch (scanner.nextType()){

                case STRING:
                    // I encountered an issue that the quot characters were part of the string
                    // This is a hackish way to allow escaped quotes...
                	//System.out.println("THIS IS A STRING ");
                    push(unquoted(scanner.next()).replace("\\\"", "\""));
                    break;
                case INTEGER:
                case BOOLEAN:
                    push(scanner.next());
                    break;
                case IDENTIFIER:
                    String symbol = scanner.next();
                    switch(symbol){
                    case "PUSH"	: 	
                    				break;
                    
                    case "SHOW": 	System.out.println(pop()); 
                    				break;
                    
                    case "ASSIGN" : symbols.bind(pop(), pop());
                    				break;
                    				
                    case "STACK"  : 
                    				symbols.bindStack(pop());
                    				
                    				break;
                    case "SPUSH" :  symbols.stackPush(pop(), pop());
                    				
                    				break;
                    case "SSHOW" :  
                    				System.out.println(symbols.showStack(pop()));
                    				break;
                    				
                    				
                    case "SPOP"	:  

                    				push(symbols.stackPop(pop()));

                    				
                    				break;
                    case "WHILE" : 	
                    				flag=true;
                    				StringBuffer buffer = new StringBuffer();
                                	innerscope(scanner, buffer);
                                	String block = buffer.substring(5);
                                	buffer = new StringBuffer();
                                	innerscope(scanner, buffer);
                                	String cond = buffer.substring(5);
                                	push(cond);
                                	processBlock(new Tokenizer(pop()));
                                	while(pop()=="true"){
                                		push(block);
                                		processBlock(new Tokenizer(pop()));
                    					push(cond);
                    					processBlock(new Tokenizer(pop()));
                                	}
                                	//System.out.println("this  is Cuurent env:");
                                	//showEnvironment();
                                	flag=false;
                    				break;
                    
                    case "IF" : 	//System.out.println(":::   stack" + stack);
                    
                    				String condResult = pop();
                    				String falsePart = pop();
                    				String truePart = pop();
                    				//System.out.println(condResult);
                    				switch(condResult){
                    				
                    				case "true" : 
                    					push(truePart);
                    					break;
                    				case "false":
                    					push(falsePart);
                    					//System.out.println(":::   stack" + stack);
                    					break;
                    					
                    				default:
                                        error("The condition if an 'if' must be boolean.");
                                        break;
                    				
                    				
                    				}
                    				break;
                    				
                    case "LOAD":
                        			String file = pop();
                        			System.out.println("loading " + new File(file).getAbsolutePath());
                        			try {
                        				processBlock(new Tokenizer(new FileReader(file)));
                        			} catch (FileNotFoundException e) {
                        				e.printStackTrace();
                        					
                        			}
                        			break;
                    
                    default:		
                        			push(symbols.get(symbol).value);
                    	
                    }
                    break;
                    
                case STARTBLOCK:	//System.out.println("STARTING NEW BLOCK");
                					processBlock(scanner);
                					break;
                	
                
                case STARTINNERBLOCK:                        
                					StringBuffer buffer = new StringBuffer();
                					innerscope(scanner, buffer);
                					push(buffer.substring(5));  //Remove the quote
                					break;
                case EXECUTE :      scanner.next();
                					processBlock(new Tokenizer(pop()));
                					break;
                	
                
                	
                case OPERATOR:	processOperator(scanner);
                				break;
                	
                	
               
                default:
                    error("Syntax: " + scanner.next());
            	
            }
            
        }
            if(!flag){
            symbols.exit();
            }
            scanner.next();
    	}
    	
    	
    }
    
    void innerscope(Tokenizer scanner, StringBuffer buffer) {
        if (scanner.nextType() == TokenType.STARTBLOCK | scanner.nextType() == TokenType.STARTINNERBLOCK){
        	
            buffer.append(scanner.next());
            buffer.append(' ');
            while (scanner.nextType() != TokenType.BLOCKEND){
                switch (scanner.nextType()) {

                    case STRING:
                    case INTEGER:
                    case BOOLEAN:
                        buffer.append(scanner.next()).append(' ');
                        break;
                    case EXECUTE: 
                    	//System.out.println(buffer);
                    case IDENTIFIER:
                        buffer.append(scanner.next()).append(' ');
                        break;
                    case STARTBLOCK:
                    case STARTINNERBLOCK:
                    	
                        innerscope(scanner, buffer);
                        buffer.append(' ');
                        break;

                    case OPERATOR:
                        buffer.append(scanner.next()).append(' ');
                        break;
                    default:
                    	//System.out.println(buffer);
                    	//System.out.println(scanner);
                        error("Syntax");
                }
            }

            buffer.append(scanner.next());
        }
    }

    
	public static void main(String[] args) {
		PACVM pacVM = new PACVM(System.in);
		try {
            pacVM.run();
        } catch (RuntimeException e) {

            e.printStackTrace();
        }
    }

	}


