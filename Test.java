import java.util.Scanner; 
public class Test{
	public static void main(String[] args){

		System.out.print("이름을 입력하세요 :");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next(); 
		System.out.print("안녕!"+ name);
	}
}