// Gunakan keyword untuk mewarisi class Karyawan
class Manajer extends Karyawan {
    // Deklarasikan variabel tambahan khusus Manajer (tunjangan)
    double tunjangan;
    
    // Constructor
    // Tips: Gunakan 'super' untuk memanggil constructor parent
    public Manajer (String nama, double gajiPokok, double tunjangan){
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }
    
    // Method Override tampilInfo
    // Tips: Tampilkan info dasar, lalu tambahkan info tunjangan dan total gaji
    @Override
    void tampilInfo() {
        super.tampilInfo();
        System.out.println("Total Pendapatan: Rp" + (gajiPokok+tunjangan));
    }
}