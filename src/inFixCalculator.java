import java.util.Scanner;

/*
 * InFixCalc, V0.0 (concept borrowed from Carol Zander's Infix Calculator)
 * Exercise author: Rob Nash
 * Complete the calculate() function below to build a simple, infix
 * calculator that evaluates a compound expression from left to right,
 * regardless of operator precedence
 *
 * Example: " 1 * -3 + 6 / 3"
 * Execution: calculate 1 * -3 first, then -3 + 6 next, then 3 / 3
 * last to obtain the value 1
 *
 * Solution by <your name goes here>6
 */
public class inFixCalculator {
	//example pattern: "3 + 5"
	//general pattern: <lhs='3'> <operation='+'> <rhs='5'>
	//extended pattern: <int> <op> <int> <op> <int>...<op> <int>
	//special case: <int>
	//other special cases?
	public static void main(String[] args) {
		//String input = "4 + 4";
		//String input = "4 + 4 / 2";
		//String input ="1 * -3";
		String input ="1 * -3 + 6 / 3";
		//String input ="5";
		//String input ="-5";
		int answer = calculate(input);
		System.out.println("Answer is " + answer);
	}
	//preconditions: all binary operations are separated via a space
	//postconditions: returns the result of the processed string
	public static int calculate(String input){
		int lhs = 0,rhs = 0; //short for left-hand & right-hand side
		char operation = ' ';
		/*todo: your name and code goes here*/
		/*You need a Scanner(or StringTokenizer) to get tokens
		 *Then you need a loop, and switch inside that loop*/

		Scanner sc = new Scanner(input).useDelimiter(" ");		

		while(sc.hasNext()){
			lhs = sc.nextInt();
			operation = sc.next().charAt(0);
			rhs = sc.nextInt();
			
			for(int i=0;i<input.length();i++){
				switch(operation){
				case '+' : return lhs+rhs;
				case '-' : return lhs-rhs;
				case '*' : return lhs*rhs;
				case '/' : return lhs/rhs;
				}
			}
		}
		sc.close();
		return lhs;
	}
}