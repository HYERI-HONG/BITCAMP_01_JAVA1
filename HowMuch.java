import java.util.Scanner;
public class HowMuch{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�մ� : �󸶿���?\n�ݾ� : ");

		int itemPrice = scan.nextInt();

		System.out.print("���� : "+itemPrice+"�� �Դϴ�.\n���� : � �帱���?\n���� : ");
		
		int itemNum = scan.nextInt();
		System.out.print("�մ� : "+itemNum+"�� �ּ���.\n");

		int sum = itemPrice * itemNum;
		System.out.print("���� : �� �ݾ��� "+sum+"�� �Դϴ�.\n�մ� : ��ο�, ����ּ���!\n���� : �� �ۼ�Ʈ DC�ص帱���?\n�ۼ�Ʈ : ");
		double percent = scan.nextDouble();

		String result="";

		if(percent>=10){
			result = "���� : �� �Ⱦƿ�!\n";
		}
		else{
			sum *=1.0 -(percent / 100.0);
			result = "���� : "+sum +"�� �Դϴ�.\n";
		}
		System.out.print(result);
	}
}