import java.util.Scanner;
public class Calc01{

	public static void main(String[] args){

		System.out.print("µÎ Á¤¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä : \n");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.print("\n\nµ¡¼À : +, »¬¼À : -, °ö¼À : *, ³ª´°¼À : /, ³ª¸ÓÁö : %\n\n¿øÇÏ´Â ¿¬»êÀ» ÀÔ·ÂÇÏ¼¼¿ä : ");
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
		System.out.print("\n\n°á°ú : "+num1+" "+opcode+" "+num2+" = "+ sum);
	}	
}