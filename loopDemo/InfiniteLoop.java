import java.util.Scanner;

public class InfiniteLoop{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
	
		while(true){
			System.out.println("0 = ����, 1 = ����");
			int flag = scan.nextInt();

			switch(flag){
				case 0 : 
					//result = "�����մϴ�";
					System.out.print("�����մϴ�");
					return;
				case 1 : 
					System.out.print("�ֹ��ϼ���");
					break;
				default : break;
			}
		}
	}
}