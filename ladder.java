import java.util.Scanner;
public class ladder {

	
	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		int sayi=abc.nextInt();
		int sayi1=abc.nextInt();
        int array[] = new int[sayi];
        int array2[][] = new int[2][sayi];
        for (int i = 0; i < array.length; i++) {
        	int sayi2=abc.nextInt();
			array[i]=sayi2;
		}
        for (int i = 0; i < sayi; i++) {
			for (int j = 0; j < 2; j++) {
				int sayi3=abc.nextInt();
				array2[j][i]=sayi3;
			}
		}
        
        
	}

}
