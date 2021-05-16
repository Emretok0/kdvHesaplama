import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.print("Tutar: ");
	    double tutar = input.nextInt();
		double kdv = (tutar > 0 && tutar < 1000) ? 0.18 : 0.8;
		double kdvTutari = tutar*kdv;
    	double sonTutar = tutar + kdvTutari;
    	System.out.println("KDV Oranı: " + kdv);
    	System.out.println("KDV Tutarı: " + kdvTutari);
    	System.out.println("KDV'li Tutar: " + sonTutar);
    }
}
