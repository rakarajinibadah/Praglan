import java.util.Scanner;

/**
 * Kelas ini menghitung luas layang-layang broww
 */
class LayangLayang {
    private double diagonal1;
    private double diagonal2;

    /**
     *
     * @param diagonal1 diagonal layang-layang 1
     * @param diagonal2 diagonal layang-layang 2
     */
    public LayangLayang(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    /**
     *
     * @return Hitung luas
     */
    public double hitungLuas() {
        return 0.5 * diagonal1 * diagonal2;
    }
}


public class layang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Luas Layang-Layang");

        System.out.print("Masukkan panjang diagonal 1: ");
        double diagonal1 = input.nextDouble();
        System.out.print("Masukkan panjang diagonal 2: ");
        double diagonal2 = input.nextDouble();

        LayangLayang layangLayang = new LayangLayang(diagonal1, diagonal2);

        double luas = layangLayang.hitungLuas();

        System.out.println("Luas layang-layang adalah: " + luas);
    }
}
