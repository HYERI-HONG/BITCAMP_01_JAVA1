import java.util.Scanner;
public class Calc01{

	public static void main(String[] args){

		System.out.print("�� ������ �Է��ϼ��� : \n");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.print("\n\n���� : +, ���� : -, ���� : *, ������ : /, ������ : %\n\n���ϴ� ������ �Է��ϼ��� : ");
		String opcode = scan.next();

		int sum = 0;

		switch(opcode){
			case "+" :
				sum = num1+num2;
				break;
			case "-" :
				sum = num1-num2;
				break;
			case "*" :
				sum = num1*num2;
				break;
			case "/" :
				sum = num1/num2;
				break;
			case "%" :
				sum = num1%num2;
				break;
		}
		System.out.print("\n\n��� : "+num1+" "+opcode+" "+num2+" = "+ sum);
	}	
}