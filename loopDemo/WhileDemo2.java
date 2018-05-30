import java.util.Scanner;
public class WhileDemo2{
	public static void main(String[] args){
		
		int tmp=0, sum=0;
		String result=" ", opcode = " + ";

		Scanner scan = new Scanner(System.in);
		System.out.print("시작값을 입력하세요 : ");
		int strNum = scan.nextInt();

		System.out.print("종료값을 입력하세요 : ");
		int endNum = scan.nextInt();

		if(endNum < strNum){ //스왑정렬
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