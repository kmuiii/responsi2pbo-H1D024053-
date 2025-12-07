public abstract class KendaraanGalaksi {
    // ==========================================================
    // ATRIBUT/STATE (semua private)
    // ==========================================================

    // TODO:
    // - String namaKendaraan
    private String nama;
    // - int levelEnergi         (0–100)
    private int energi;
    // - int kapasitasPenumpang
    private int kapasitas;


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    // TODO:
    // Constructor menerima:
    //   - namaKendaraan
    //   - kapasitasPenumpang
    // levelEnergi default = 100.
    public KendaraanGalaksi (String nama, int kapasitas){
        this.nama = nama;
        this.kapasitas = kapasitas;
        this.energi = 100;
    }

    // ==========================================================
    // GETTER
    // ==========================================================

    // TODO: Getter namaKendaraan
    String getNama(){
        return this.nama;
    }
    // TODO: Getter levelEnergi
    int getEnergi(){
        return this.energi;
    }
    // TODO: Getter kapasitasPenumpang
    int getKapasitas(){
        return this.kapasitas;
    }

    void setEnergi(int energiBaru){
        if (energiBaru < 0) energiBaru = 0;
        if (energiBaru > 100) energiBaru = 100;
        this.energi = energiBaru;
    }

    // ==========================================================
    // METHOD BIASA
    // ==========================================================

    // TODO:
    // Method final tampilStatus()
    // Format:
    // "[namaKendaraan] | Energi: [levelEnergi]% | Kapasitas: [kapasitasPenumpang] awak"
    public final void tampilStatus(){
        System.out.println(nama + " | Energi: " + energi + "% | Kapasitas: " + kapasitas + " awak");
    }

    // ==========================================================
    // ABSTRACT METHOD (WAJIB DIIMPLEMENTASI SUBCLASS)
    // ==========================================================

    // TODO:
    // abstract void aktifkanMesin();
    public abstract void aktifkanMesin();

    // TODO:
    // abstract void jelajah(int jarak);
    public abstract void jelajah(int jarak);

    // TODO:
    // abstract void isiEnergi(int jumlah);
    public abstract void isiEnergi(int jumlah);
}
