class calculator{
    double angka1,angka2;
    public double tambah(double angka1,double angka2){
            return angka1+angka2;
        }
    public double kali(double angka1,double angka2){
        return angka1*angka2;
    }

    void tampil(){
        System.out.println("Hasil penjumlahan: " + tambah(10,5));
        System.out.println("Hasil perkalian: " + kali(10,5));

    }
}



public class Main {
    public static void main(String[] args) {
        calculator obj = new calculator();
        obj.tampil();
    }
}