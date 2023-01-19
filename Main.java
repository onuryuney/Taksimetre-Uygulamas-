import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Taksimetre Tutar Hesaplama");
        double
                toplamTutar = 0,
                mesafe = 0,
                km = 8.5,
                ilkTutar = 12;

        System.out.print("Mesafeyi giriniz: ");
        mesafe = input.nextDouble();

        input.close();

        toplamTutar = ilkTutar + mesafe * km;
        toplamTutar= (toplamTutar < 28) ? 28 : toplamTutar;

        System.out.println("-");
        System.out.format("Toplam Tutar: %.2f TL\n", toplamTutar);
    }
}