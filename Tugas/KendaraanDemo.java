package Tugas;

public class KendaraanDemo {
    public static void main(String[] args) {
        // Kendaraan k = new Kendaraan(...);  // ERROR: Kendaraan is abstract

        Mobil mobil1 = new Mobil("Toyota Avanza", "N 1234 AB", 2022, 4);
        mobil1.cetakInfo();
        mobil1.nyalakanMesin();
        System.out.println("Pajak          : Rp" + mobil1.hitungPajak());
        System.out.println();

        Motor motor1 = new Motor("Honda Vario", "N 5678 CD", 2023, "Matic");
        motor1.cetakInfo();
        motor1.nyalakanMesin();
        System.out.println("Pajak          : Rp" + motor1.hitungPajak());
        System.out.println();

        Truk truk1 = new Truk("Hino Dutro", "N 9012 EF", 2021, 4.5);
        truk1.cetakInfo();
        truk1.nyalakanMesin();
        System.out.println("Pajak          : Rp" + truk1.hitungPajak());
    }
}
