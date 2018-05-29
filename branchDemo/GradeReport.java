import java.util.Scanner;
public class GradeReport{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : \n");
		String name = scan.next();

		System.out.print("국어 점수 : \n");
		int korean = scan.nextInt();
		System.out.print("영어 점수 : \n");
		int english = scan.nextInt();
		System.out.print("수학 점수 : \n");
		int math = scan.nextInt();

		int ave = (korean + english + math)/3;
		int check = ave/10;
		String grade = "";

		switch(check){
			case 10 :
			case 9 :
				grade = "A";
				break;
			case 8 : 
				grade = "B";
				break;
			case 7 :
				grade = "C";
				break;
			case 6 :
				grade = "D";
				break;
			case 5 :
				grade = "E";
				break;
			default :
				grade = "F";
				break;
		} 
		System.out.print(name + "의 평균은 " + ave + " 학점은 "+grade);

	}
}