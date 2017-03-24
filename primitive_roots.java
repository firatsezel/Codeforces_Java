import java.util.Scanner;//verilen asal sayının kendisinden önceki asalları bulma
public class primitive_roots {

	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		int sayi=abc.nextInt();
		int count=0;
		int count1=0;
		int a=0;
		int b=sayi;
		for (int i = 0; i < b; i++) {
			
			sayi--;
			a=sayi;
			if (sayi==1 || b==0) {
				break;
			}
			for (int j = 0; j < 100; j++) {
				sayi--;
				if (sayi==1) {
					break;
				}
				if (a%sayi==0) {
					sayi=a;
					count=0;
					break;
				}
				else
					count++;
				
			}
			if (count+2==a) {
				sayi=a;
				count=0;
				count1++;
			}
		}
		System.out.println(count1);

	}

}
