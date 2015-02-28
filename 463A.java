import java.util.Scanner;

public class Main {
//bitti
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int counter = scanner.nextInt();
		int Dollar = scanner.nextInt();

		boolean bool = false;

		int result = 0;
		int newresult =0;
		int[] butun = new int[counter];
		int[] bozuk = new int[counter];
		for (int i = 0; i < counter; i++) {
			butun[i] = scanner.nextInt();
			bozuk[i] = scanner.nextInt();

			int	Tempbutun = butun[i];
			int Tempbozuk = bozuk[i];

			if(Dollar >= Tempbutun){
				if(Dollar == Tempbutun && Tempbozuk==0){
					bool = true;
					if(newresult == 0)
				    	newresult = 0;
				}else if(Dollar > Tempbutun){
					bool = true;
					if(Tempbozuk != 0){
						result = 100 - Tempbozuk;
						if(result > newresult){
							newresult = result;
						}
					}
				}
			}

		}

		if(bool){
			System.out.println(newresult);
		}else
			System.out.println("-1");




	}

}
