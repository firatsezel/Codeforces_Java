import java.util.Scanner;

public class Main {
//bitmedi time limit error 2000ms
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String kelime = scanner.next();

		int teksayi=0,ciftsayi=0;

		int harfsayisi = kelime.length();
		teksayi += harfsayisi;

		if(Merging(kelime)){
			if(harfsayisi%2==1)
				teksayi++;
			else
				ciftsayi++;
		}
		int count = 2;
		int hece = 2;
		int curletter = 0;
		while(hece != harfsayisi){
			String yenikelime = "";
			for (int i = 0; i < harfsayisi - hece +1; i++) {
				yenikelime = kelime.substring(curletter, curletter + count);
				curletter++;
				if(Merging(yenikelime)){
					if(yenikelime.length()%2==1)
						teksayi++;
					else
						ciftsayi++;
				}
			}
			count++;
			curletter = 0;
			hece++;
		}
		System.out.println(ciftsayi + " " + teksayi);

	}

	public static boolean Merging(String word){
		boolean bool = false;
		String newword = "";
		char yeniharf;
		char olaganharf;
		olaganharf = word.charAt(0);
		newword += olaganharf;
		for (int i = 1; i < word.length(); i++) {
			yeniharf = word.charAt(i);
			if(yeniharf != olaganharf){
				newword += yeniharf;
				olaganharf = yeniharf;
			}
		}
		if(isItGood(newword))
			bool = true;
		else
			bool = false;

		return bool;
	}

	public static boolean isItGood(String word){
		String palindromword = "";
		if(word.length() != 1){
			for (int i = word.length() - 1; i > -1; i--) {
				palindromword += word.charAt(i);
			}
			if(palindromword.equals(word))
				return true;
			else
				return false;
		}else
			return true;

	}

}
