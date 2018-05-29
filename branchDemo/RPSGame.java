import java.util.Scanner;

public class RPSGame{
	public static void main(String args[]){

		System.out.print("\t\t<가위바위보 게임>\n\n가위 : S, 바위: R, 보 : P\n\n");
		Scanner scan = new Scanner(System.in);

		System.out.print("사용자1 : ");
		String user1 = scan.next();

		System.out.print("사용자2 : ");
		String user2 = scan.next();

		String result = "무승부";  

	
		if((user1.equals("s")&&user2.equals("p"))||(user1.equals("r")&&user2.equals("s"))||(user1.equals("p")&&user2.equals("r"))){
			result = "사용자1승리";
		}
		else if((user1.equals("s")&&user2.equals("r"))||(user1.equals("r")&&user2.equals("p"))||(user1.equals("p")&&user2.equals("s"))){
			result = "사용자2승리";
		}
		System.out.print("\n\n결과 : " + result + "!!\n" );
	}	
}