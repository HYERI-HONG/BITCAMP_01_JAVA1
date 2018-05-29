import java.util.Scanner;

public class Calc03{
	public static void main(String[] args){

		System.out.print("두 정수를 입력하세요 : \n");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.print("연산을 지정하세요 : ");
		String opcode = scan.next();

		int sum = 0;

		if(opcode.equals("+")){
			sum = num1+num2;
		}
		else if(opcode.equals("-")){
			sum = num1-num2;
		}
		else if(opcode.equals("*")){
			sum = num1*num2;
		}
		else if(opcode.equals("/")){
			sum = num1/num2;
		}
		else if(opcode.equals("%")){
			sum = num1%num2;		
		}
		else{
			System.out.print("잘못된 연산을 입력하였습니다.");
		}
		System.out.print("결과 : "+num1+" "+opcode+" "+ num2+" = "+sum);
	}
}