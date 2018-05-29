import java.util.Scanner;

public class MonthEndday{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("월을 입력하세요 : ");
		int month = scan.nextInt();
		int date =31;

		if(month==2){
			date=28;
		}else if(month<8){
			if((month%2)==0){
				date = 30;
			}
		}else{
			if((month%2)==1){
				date = 30;
			}
		}

		System.out.print("\n결과 : "+month+"월 "+date+"일");
	}
}