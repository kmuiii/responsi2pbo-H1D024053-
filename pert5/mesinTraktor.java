class mesinTraktor extends defaultMesin {
    // Variabel khusus mesin traktor (kapasitasTarik)
    double kapasitasTarik;

    // Constructor
    mesinTraktor(String namaMesin, int tenagaHP, double kapasitasTarik) {
        super(namaMesin, tenagaHP);
        this.kapasitasTarik = kapasitasTarik;
    }

    @Override
    void tampilInfo() {
        // Override info mesin traktor
        System.out.println("Mesin Traktor " + namaMesin + " | Tarik: " + kapasitasTarik + " ton | Tenaga: " + tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        // Override performa traktor
        return (tenagaHP * 0.9) + (kapasitasTarik * 10);
    }

    @Override
    String kategoriMesin() {
        // Override kategori traktor
        return "Mesin Traktor";
    }

    void suaraMesin() {
        // Suara traktor
        System.out.println("GGGRRRR! Hidup mesinnn!");
    }
}
