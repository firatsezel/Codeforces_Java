import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		int x=abc.nextInt();
		int[] array=new int[x];
		for (int i = 0; i < x; i++) {
			int y=abc.nextInt();
			array[i]=y;
		}
		
	}

}
