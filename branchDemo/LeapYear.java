import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("연도를 입력하세요 : ");

		int year = scan.nextInt();
		String result ="평년";

		if((((year%4)==0)||((year%400)==0))&&((year%100)!=0)){
			result = "윤년";
		}
		System.out.print("결과 : "+year+"은 "+result+"입니다.");
	}
}