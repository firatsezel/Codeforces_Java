import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int m =0;
		int numara = 1;
		int kapanan = 0;
		int tempKapanan = kapanan;
		int toplam = scanner.nextInt();
		int basilan = scanner.nextInt();
	
		int[] array = new int[basilan];
		
		for (int i = 0; i < array.length; i++) {
			int saiy = scanner.nextInt();
		    array[i] = saiy;
		}
		

		int[] resultarray = new int[toplam];
		for (int i = 0; i < resultarray.length; i++) {
			resultarray[i] = 0;
		}
		
		for (int i = 0; i < basilan; i++) {
			int count = array[i];
			while(resultarray[toplam - count] == 0){
				if(resultarray[m]==0){
					resultarray[m] = numara;
				    kapanan++;
				    m++;
				}else
					m++;
			}
			numara += kapanan;
			kapanan = 0;
		}
		
		for (int i = 0; i < resultarray.length; i++) {
			System.out.print(resultarray[i] + " ");
		}
	}

}
