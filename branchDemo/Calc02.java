import java.util.Scanner;

public class Calc02{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("두 정수를 입력하세요 : \n");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.print("덧셈은 1번, 뺄셈은 2번,\n곱셈은 3번, 나눗셈은 4번,\n나머지는 5번을 누르세요.\n");

		System.out.print("\n\n원하는 연산을 입력하세요 : ");
		int opcode = scan.nextInt();

		int sum = 0;
		String op = null;

		if(opcode ==1){
			sum =num1+num2;
			op = "+";
		}else if(opcode ==2){
			sum =num1-num2;
			op = "-";
		}else if(opcode ==3){
			sum =num1*num2;
			op = "x";
		}else if(opcode ==4){
			sum =num1/num2;
			op = "/";
		}else{
			sum =num1%num2;
			op = "%";
			
		}
		System.out.print("\n결과 : "+ num1 +" "+ op +" "+ num2 + " = "+ sum);
	}
}