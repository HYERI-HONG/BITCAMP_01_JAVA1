import java.util.Scanner;
public class HowMuch{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("손님 : 얼마에요?\n금액 : ");

		int itemPrice = scan.nextInt();

		System.out.print("주인 : "+itemPrice+"원 입니다.\n주인 : 몇개 드릴까요?\n개수 : ");
		
		int itemNum = scan.nextInt();
		System.out.print("손님 : "+itemNum+"개 주세요.\n");

		int sum = itemPrice * itemNum;
		System.out.print("주인 : 총 금액은 "+sum+"원 입니다.\n손님 : 비싸요, 깎아주세요!\n주인 : 몇 퍼센트 DC해드릴까요?\n퍼센트 : ");
		double percent = scan.nextDouble();

		String result="";

		if(percent>=10){
			result = "주인 : 안 팔아요!\n";
		}
		else{
			sum *=1.0 -(percent / 100.0);
			result = "주인 : "+sum +"원 입니다.\n";
		}
		System.out.print(result);
	}
}