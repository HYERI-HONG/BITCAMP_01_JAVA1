import java.util.Scanner;

public class CheckGender{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = scan.next();
		System.out.print("�ֹι�ȣ�� �Է��ϼ��� : ");
		String idNum = scan.next();

		char genderNum = idNum.charAt(7);
		String result="";

		if(genderNum=='1'||genderNum=='3'){
			result="����";
		}else if(genderNum=='2'||genderNum=='4'){
			result="����";
		}else if(genderNum=='5'||genderNum=='6'){
			result="�ܱ���";
		}else{
			result="�ٽ� �Է��ϼ���!";
		}
		System.out.print("\n\n��� :"+result);
	}
}