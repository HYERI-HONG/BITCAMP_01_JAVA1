import java.util.Scanner;
public class WhileDemo2{
	public static void main(String[] args){
		
		int tmp=0, sum=0;
		String result=" ", opcode = " + ";

		Scanner scan = new Scanner(System.in);
		System.out.print("���۰��� �Է��ϼ��� : ");
		int strNum = scan.nextInt();

		System.out.print("���ᰪ�� �Է��ϼ��� : ");
		int endNum = scan.nextInt();

		if(endNum < strNum){ //��������
			tmp = endNum;
			endNum = strNum;
			strNum = tmp;
		}

		while(strNum<(endNum+1)){
			
			if(strNum == endNum){
				opcode = " = ";
			}
			result += strNum + opcode;
			sum += strNum;
			strNum++;
		}
		System.out.print(result+sum);	
	}
}