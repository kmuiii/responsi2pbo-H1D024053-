class Pengguna {
    // Tuliskan state (variabel) yang diperlukan di sini
    // Jangan lupa tambahkan konstanta faktorAktivitas
    public int umur;
    public double beratBadan;
    public double tinggiBadan;
    public final double faktorAktivitas = 1.2;

    public Pengguna(int umur, double beratBadan, double tinggiBadan){
        this.umur = umur;
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

    double hitungBMI() {
        double tinggiMeter = tinggiBadan / 100;
        return beratBadan / (tinggiMeter * tinggiMeter );
    }

    void tampilKategori() {
        double BMI = hitungBMI();
        if (BMI < 18.5){
            System.out.println("Kategori: Kurus");
        } else if (BMI < 25) {
            System.out.println("Kategori: Normal");
        } else {
            System.out.println("Kategori: Obesitas");
        }
    }

    double hitungKalori() {
        return beratBadan * faktorAktivitas;
    }

    void tampilInfo() {
        System.out.println("=== Informasi Kesehatan pengguna ===");
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Berat badan: " + beratBadan + " kg");
        System.out.println("Tinggi badan: " + tinggiBadan + " cm");
        System.out.println("Nilai BMI: " + hitungBMI());
        tampilKategori();
        System.out.println("Kebutuhan kalori harian: " + hitungKalori());
        System.out.println("====================================");
    }
}