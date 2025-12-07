public class KapalEksplorasi extends KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT KHUSUS
    // ==========================================================

    // TODO:
    // private int modulScan   // kemampuan scan planet (level 1–5)
    private int modulScan;

    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    // TODO:
    // Constructor menerima:
    //   - namaKendaraan
    //   - kapasitasPenumpang
    //   - modulScan
    public KapalEksplorasi (String nama, int kapasitas, int modulScan){
        super(nama, kapasitas);
        this.modulScan = modulScan;
    }


    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================

    // @Override aktifkanMesin()
    // Jika energi < 15 → "Energi tidak mencukupi untuk memulai ekspedisi!"
    // Jika cukup → "Kapal eksplorasi siap berangkat!"

    @Override
    public void aktifkanMesin() {
        if (getEnergi() < 15){
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }


    // @Override jelajah(int jarak)
    // Konsumsi energi: 2% per 1 km (lebih efisien).
    // Jika cukup → kurangi energi & tampilkan jarak perjalanan.

    @Override
    public void jelajah(int jarak) {
        int konsumsi = jarak * 2;
        if (getEnergi() < konsumsi) {
            System.out.println("Energi tidak cukup untuk menjelajah sejauh " + jarak + " km.");
        } else {
            setEnergi(getEnergi() - konsumsi);
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
        }
    }


    // @Override isiEnergi(int jumlah)
    // Tambah energi secara bertahap sampai 100%.
    // Tampilkan pesan pengisian.

    @Override
    public void isiEnergi(int jumlah) {
        int sebelum = getEnergi();
        setEnergi(sebelum + jumlah);

        System.out.println("Energi bertambah dari " + sebelum + "% menjadi " + getEnergi() + "%.");
    }


    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================

    // TODO:
    // void scanPlanet(String namaPlanet)
    // Tampilkan:
    // "Melakukan scan pada planet [namaPlanet] dengan modul level [modulScan]."
    public void scanPlanet(String namaPlanet){
        System.out.println("Melakukan scan pada planet " + namaPlanet + " dengan modul level " + modulScan);
    }
}
