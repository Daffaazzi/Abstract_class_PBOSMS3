package Tugas;

public abstract class Kendaraan {
    public String merk;
    public String platNomor;
    public int tahunProduksi;

    public Kendaraan(String merk, String platNomor, int tahunProduksi) {
        this.merk = merk;
        this.platNomor = platNomor;
        this.tahunProduksi = tahunProduksi;
    }

    // abstract method: cara tiap kendaraan berbeda
    public abstract void nyalakanMesin();
    public abstract double hitungPajak();

    // concrete method: sama untuk semua kendaraan
    public void cetakInfo() {
        System.out.println("Merk           : " + this.merk);
        System.out.println("Plat Nomor     : " + this.platNomor);
        System.out.println("Tahun Produksi : " + this.tahunProduksi);
    }
}
