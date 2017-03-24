import java.util.Scanner;
public class capsLock {

	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		String sayi=abc.next();
		String sayi1="";
		sayi1=sayi.toUpperCase();
		String manga="";
		String result1="";
		String result2="";
		result2 +=sayi.substring(0, 1).toLowerCase();
		manga+=sayi.substring(1, sayi.length()).toUpperCase();
		if (sayi1==sayi) {
			sayi=sayi.toLowerCase();
			System.out.print(sayi);
		}
		else if (result2.equals(sayi.substring(0, 1)) && manga.equals(sayi.substring(1, sayi.length()))) {
			result1+=sayi.substring(0, 1).toUpperCase();
			result1+=sayi.substring(1, sayi.length()).toLowerCase();
			System.out.print(result1);
		}
		else {
			System.out.print(sayi);
		}
			
		
	}

}
