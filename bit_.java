import java.util.Scanner;
public class bit_ {

	
	public static void main(String[] args) {
		int x=0;
		int m=0;
		Scanner abc=new Scanner(System.in);
		int sayi=abc.nextInt();
		String sex[]=new String[sayi];
		for (int i = 0; i < sayi; i++) {
			String sayi1=abc.next();
			sex[i]=sayi1;
		}
        for (int i = 0; i < sex.length; i++) {
			if (sex[i].charAt(m)=='-') {
				x--;
				
			}
			else if (sex[i].charAt(m)=='+') {
				x++;
				
			}
			else {
				if (sex[i].charAt(m+1)=='-') {
					x--;
					
									}
				else {
					x++;
					
				}
			}
		}
        System.out.println(x);
	}

}
