import java.util.Scanner;

public class Calc04{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.print("\n두 정수를 입력하세요 : \n");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.print("원하는 연산을 입력하세요 :");
		String opcode = scan.next();
		int sum = 0;
		String result = " ";

		switch(opcode){
			case "+" : 
				sum = num1 + num2;
				break;
			case "-" : 
				sum = num1 - num2;
				break;
			case "*" : 
				sum = num1 * num2;
				break;
			case "/" : 
				sum = num1 / num2;
				break;
			case "%" : 
				sum = num1 % num2;
				break;
			default :
				result = "ERROR";
				break;
		}
		if(!result.equals("ERROR"))
			result = num1+" "+opcode+" "+num2+" = "+ sum;
		

		System.out.print("\n\n결과 : "+ result);
	}
}