class BarangMusik {
    // Deklarasikan variabel/state yang diperlukan di sini
    String kodeBarang;
    String nama;
    double hargaSatuan;
    int jumlahStok;
    
    // Constructor
    public BarangMusik(String kodeBarang, String nama){
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.hargaSatuan = 0.0;
        this.jumlahStok = 0;
    }

    public BarangMusik(String kodeBarang, String nama, double hargaSatuan){
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.hargaSatuan = hargaSatuan;
        this.jumlahStok = 0;
    }

    public BarangMusik(String kodeBarang, String nama, double hargaSatuan, int jumlahStok){
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.hargaSatuan = hargaSatuan;
        this.jumlahStok = jumlahStok;
    }
    
    void ubahHarga(double hargaBaru) {
        this.hargaSatuan = hargaBaru;
    }
    
    void tambahStok(int jumlah) {
        jumlahStok += jumlah;
    }

    void tampilInfo() {
        System.out.println("Alat musik " + nama + " | Kode: " + kodeBarang + " | Harga: Rp" + hargaSatuan + "  | Stok: " + jumlahStok + "unit");
    }
}