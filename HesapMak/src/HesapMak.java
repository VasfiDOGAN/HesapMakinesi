import java.util.Scanner;

public class HesapMak {

	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
		System.out.println("ilk sayıyı giriniz");
		int s1 = oku.nextInt();
		System.out.println("ikinci sayıyı giriniz");
		int s2 = oku.nextInt();
		System.out.println("1: toplama \n2: Çıkarma \n3: çarpma \n4: Bölme");
		System.out.println(" bir işlem seçiniz");
		int islem = oku.nextInt();
		
		if (islem== 1) {
			System.out.println("sonuç: "+ (s1 + s2));
		}
		
		else if (islem == 2) {
			System.out.println("sonuç: " + ( s1 - s2));
		}
		
		else if ( islem ==3) {
			System.out.println("sonuç:" + (s1/s2));
		}
		
		else if (islem == 4) {
			System.out.println("sonuç: " + ( s1*s2));
		
		}
		else {
			System.out.println("geçersiz işlem yaptınız.");
		}
		

	}

}
