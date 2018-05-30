import java.util.Scanner;

public class CheckGender{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		while(true){

			System.out.println("\n실행 : 1, 종료 : 0");

			switch(scan.nextInt()){
				case 0:
					return;
				case 1: 
					System.out.print("이름을 입력하세요 : ");
					String name = scan.next();
					System.out.print("주민번호를 입력하세요 : ");
					String idNum = scan.next();

					char genderNum = idNum.charAt(7);
					String result="";

					if(genderNum=='1'||genderNum=='3'){
						result="남자";
					}else if(genderNum=='2'||genderNum=='4'){
						result="여자";
					}else if(genderNum=='5'||genderNum=='6'){
						result="외국인";
					}else{
						result="다시 입력하세요!";
					}
					System.out.print("\n\n결과 :"+result);
				default : 
					System.out.println("ERROR");
					break;

			}

		}
		
	}
}