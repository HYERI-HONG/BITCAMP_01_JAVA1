import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.println("���� : 1, ���� : 0");
			switch(scan.nextInt()){
				case 0 : return;
				case 1 : 
					System.out.print("������ �Է��ϼ��� : ");

					int year = scan.nextInt();
					String result ="���";

					if((((year%4)==0)||((year%400)==0))&&((year%100)!=0)){
					result = "����";
					}
					System.out.println("��� : "+year+"�� "+result+"�Դϴ�.");
					break;
				default : 
					System.out.print("ERROR");
					break;
			}
		}
		
	}
}