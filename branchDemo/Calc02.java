import java.util.Scanner;

public class Calc02{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("�� ������ �Է��ϼ��� : \n");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.print("������ 1��, ������ 2��,\n������ 3��, �������� 4��,\n�������� 5���� ��������.\n");

		System.out.print("\n\n���ϴ� ������ �Է��ϼ��� : ");
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
		System.out.print("\n��� : "+ num1 +" "+ op +" "+ num2 + " = "+ sum);
	}
}