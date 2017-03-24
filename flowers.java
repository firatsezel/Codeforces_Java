import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class flowers {

	public static void main(String[] args) {
		int array[]=new int[12];
		
		int count=0;
	
		Scanner abc=new Scanner(System.in);
		int sayi=abc.nextInt();
		int k=sayi;
		for (int i = 0; i < 12; i++) {
			int sayi1=abc.nextInt();
			array[i]=sayi1;
		}
		Arrays.sort(array);
		
			
		
		
	}

}
