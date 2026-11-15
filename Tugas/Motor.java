package Tugas;

public class Motor extends Kendaraan {
    public String jenisMotor;

    public Motor(String merk, String platNomor, int tahunProduksi, String jenisMotor) {
        super(merk, platNomor, tahunProduksi);
        this.jenisMotor = jenisMotor;
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Menekan tombol starter, mesin motor menyala");
    }

    @Override
    public double hitungPajak() {
        return 500000;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jenis Motor    : " + this.jenisMotor);
    }
}
