import java.util.Scanner;
public class capitalisation {

	
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		String sayi=abc.next();
		String result1="";
		result1+=sayi.substring(0, 1).toUpperCase()+sayi.substring(1, sayi.length());
		System.out.print(result1);
	}

}
