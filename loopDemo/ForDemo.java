import java.util.Scanner;
public class ForDemo{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		while(true){

			System.out.println("���� : 1, ���� : 0");

			switch(scan.nextInt()){
				case 0 :
					return;
				case 1 :
					System.out.print("���۰� : ");
					int strNum = scan.nextInt();
					System.out.print("���ᰪ : ");
					int endNum = scan.nextInt();
					int temp =0, sum=0;
					String result="", opcode=" + ";

					if(strNum > endNum){
						temp = strNum;
						strNum = endNum;
						endNum = temp;
					}
					for(int i=strNum; i<(endNum+1); i++){

						if(i==endNum){
							opcode=" = ";
						}
						sum += i;
						result += i + opcode;

					}
					System.out.println(result+sum);
					break;

				default : 
					System.out.print("ERROR");
					break;
			}		
		}
	}
}