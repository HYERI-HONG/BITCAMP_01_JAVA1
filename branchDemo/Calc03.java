import java.util.Scanner;

public class Calc03{
	public static void main(String[] args){

		System.out.print("�� ������ �Է��ϼ��� : \n");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.print("������ �����ϼ��� : ");
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
			System.out.print("�߸��� ������ �Է��Ͽ����ϴ�.");
		}
		System.out.print("��� : "+num1+" "+opcode+" "+ num2+" = "+sum);
	}
}