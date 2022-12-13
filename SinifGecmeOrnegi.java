import java.util.Scanner;

public class SinifGecmeOrnegi {

	public static void main(String[] args) {
		int mat, fizik, turkce, kimya, muzik;
		double average;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik notunu giriniz : ");
		mat = input.nextInt();
		
		while(mat < 0 || mat > 100) {
			System.out.println("[0-100] giriniz !");
			System.out.print("Matematik notunu giriniz : ");
			mat = input.nextInt();
		}
		
		System.out.print("Fizik notunu giriniz : ");
		fizik = input.nextInt();
		while(fizik<0 || fizik>100) {
			System.out.print("[0-100] giriniz !");
			System.out.println("Fizik notunu giriniz : ");
			fizik = input.nextInt();
		}
		
		System.out.print("Turkce notunu giriniz : ");
		turkce = input.nextInt();
		while(turkce<0 || turkce>100) {
			System.out.print("[0-100] giriniz !");
			System.out.println("Turkce notunu giriniz : ");
			turkce = input.nextInt();
		}
		
		System.out.print("Kimya notunu giriniz : ");
		kimya = input.nextInt();
		while(kimya<0 || kimya>100) {
			System.out.print("[0-100] giriniz !");
			System.out.println("Kimya notunu giriniz : ");
			kimya = input.nextInt();
		}
		
		System.out.print("Muzik notunu giriniz : ");
		muzik = input.nextInt();
		while(muzik<0 || mat>100) {
			System.out.print("[0-100] giriniz !");
			System.out.println("Muzik notunu giriniz : ");
			muzik = input.nextInt();
		}
		
		average = (mat + fizik + turkce + kimya + muzik) / 5;
		if(average < 55) {
			System.out.println("Kaldýnýz !");
		}
		else {
			System.out.println("Geçtiniz !");
		}
		System.out.println("Ortalamanýz : "+average);

	}


}
