import java.io.*;

public class main {

	public static void main(String[] args) throws IOException {
		Stack s = new LinkedStack();
		int c;
		
		System.out.println("Enter a string: ");
		System.out.flush();
		
		while((c=System.in.read())!='\r') {
			if( c == '(' || c == '{' || c == '[')s.push(new Integer(c));
		 
		}
		
		System.out.println("Input string reversed");
		while(!s.isEmpty()){
			System.out.println( (char)(((Integer)s.pop()).intValue()) );
		}
		
	}

}
