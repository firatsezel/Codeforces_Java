import java.util.Scanner;//a f ve ı nın karşılaştırılması
public class cows_and_poker {

	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		int sayi=abc.nextInt();
		int sayac=0;
		int m=0;
		int s=0;int k=0;
		String sayi1=abc.next();
		sayi1=sayi1.toUpperCase();
		if (sayi==sayi1.length() & sayi>2 & sayi<20000) {
			for (int i = 0; i < sayi; i++) {
				if (sayi1.charAt(i)=='A') {
					sayac++;
					s++;
				}
				else if (sayi1.charAt(i)=='I') {
					m++;
				}
				else
					k++;
			}
			if (sayac!=0 & m==0) {
				System.out.println(sayac);
			}
			else if (sayac==0 & m==0) {
				System.out.println("0");
			}
			else if (sayac==0 & m>0 & k==0) {
				System.out.println("0");
			}
			else if (sayac!=0 & m!=0) {
				System.out.println(m);
			}
			else if (sayac==0 & m!=0 & k>0) {
				System.out.println(m);
			}
		}
	}

}
