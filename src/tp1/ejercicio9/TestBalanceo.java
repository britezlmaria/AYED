package tp1.ejercicio9;
import java.util.Stack;


public class TestBalanceo {
	public static boolean estaBalanceado(String s) {
	Stack<Character>pila=new Stack<>();
	
	for(char c:s.toCharArray()) {
		if(c=='(' || c== '[' || c=='{') {
			pila.push(c);
		}else if(c==')' || c==']' || c=='}') {
			if(pila.isEmpty()) {
				return false;
			}
			char apertura=pila.pop();
			if(c== ')' && apertura!='(' || 
			(c==']' && apertura!='[')||
			 c=='}' && apertura!='{'){
				return false;
			}
		}
	}
	return pila.isEmpty();
}

public static void main(String [] args) {
	String s1="{( ) [ ( ) ] }";
	
	System.out.println("s1 esta balanceado?"+estaBalanceado(s1));
	
}
}

