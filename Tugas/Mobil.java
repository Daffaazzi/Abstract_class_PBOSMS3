package Tugas;

public class Mobil extends Kendaraan {
    public int jumlahPintu;

    public Mobil(String merk, String platNomor, int tahunProduksi, int jumlahPintu) {
        super(merk, platNomor, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Menekan tombol start, mesin mobil menyala");
    }

    @Override
    public double hitungPajak() {
        return 3000000;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Pintu   : " + this.jumlahPintu);
    }
}
