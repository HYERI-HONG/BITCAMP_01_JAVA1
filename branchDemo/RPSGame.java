import java.util.Scanner;

public class RPSGame{
	public static void main(String args[]){

		System.out.print("\t\t<���������� ����>\n\n���� : S, ����: R, �� : P\n\n");
		Scanner scan = new Scanner(System.in);

		System.out.print("�����1 : ");
		String user1 = scan.next();

		System.out.print("�����2 : ");
		String user2 = scan.next();

		String result = "���º�";  

	
		if((user1.equals("s")&&user2.equals("p"))||(user1.equals("r")&&user2.equals("s"))||(user1.equals("p")&&user2.equals("r"))){
			result = "�����1�¸�";
		}
		else if((user1.equals("s")&&user2.equals("r"))||(user1.equals("r")&&user2.equals("p"))||(user1.equals("p")&&user2.equals("s"))){
			result = "�����2�¸�";
		}
		System.out.print("\n\n��� : " + result + "!!\n" );
	}	
}