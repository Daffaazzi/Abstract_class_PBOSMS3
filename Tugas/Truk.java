package Tugas;

public class Truk extends Kendaraan {
    public double kapasitasMuatan; // dalam ton

    public Truk(String merk, String platNomor, int tahunProduksi, double kapasitasMuatan) {
        super(merk, platNomor, tahunProduksi);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Memutar kunci kontak, mesin diesel truk menyala");
    }

    @Override
    public double hitungPajak() {
        return 2000000 + (this.kapasitasMuatan * 500000);
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Kapasitas      : " + this.kapasitasMuatan + " ton");
    }
}
