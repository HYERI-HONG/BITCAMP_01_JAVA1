import java.util.Scanner;
public class Bmi{
	public static void main(String[] args){
		
		Scanner scan =new Scanner(System.in);
		System.out.println("\t\t<BMI ����>\n\n����� �̸��� �Է��ϼ��� : ");
		String name = scan.next();

		System.out.println("\n����� ü��(kg)�� �Է��ϼ��� : ");
		double weight = scan.nextDouble();

		System.out.println("\n����� Ű(cm)�� �Է��ϼ��� : ");
		Double height = scan.nextDouble();
		height /= 100;

		double result = weight/Math.pow(height,2);
		String state ="";

		if(result<18.5){
			state ="��ü��";
		}else if(18.5<=result&&result<23){
			state ="����";
		}else if(23<=result&&result<25){
			state ="�� ���ܰ�";
		}else if(25<=result&&result<30){
			state ="1�ܰ� ��";
		}else if(30<=result&&result<35){
			state ="2�ܰ� ��";
		}else{
			state ="3�ܰ� ��";
		}
		System.out.println("\n\n��� : "+name+"���� "+state+"�Դϴ�.");
	}
}