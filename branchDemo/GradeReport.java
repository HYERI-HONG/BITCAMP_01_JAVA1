import java.util.Scanner;
public class GradeReport{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : \n");
		String name = scan.next();

		System.out.print("���� ���� : \n");
		int korean = scan.nextInt();
		System.out.print("���� ���� : \n");
		int english = scan.nextInt();
		System.out.print("���� ���� : \n");
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
		System.out.print(name + "�� ����� " + ave + " ������ "+grade);

	}
}