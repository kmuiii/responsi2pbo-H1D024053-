class mesinTraktorListrik extends mesinTraktor {
    // Variabel khusus mesin traktor listrik (kapasitasBaterai)
    int kapasitasBaterai;

    // Constructor
    mesinTraktorListrik(String namaMesin, int tenagaHP, double kapasitasTarik, int kapasitasBaterai){
        super(namaMesin, tenagaHP, kapasitasTarik);
        this.kapasitasBaterai = kapasitasBaterai;
    }

    @Override
    void tampilInfo() {
        // Override info traktor listrik
        System.out.println("Mesin Traktor " + namaMesin + " | Tarik: " + kapasitasTarik + " ton | Baterai: " + kapasitasBaterai + " kWh | Tenaga: " + tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        // Override performa traktor listrik
        return (tenagaHP * 1.1) + (kapasitasBaterai * 5);
    }

    @Override
    String kategoriMesin() {
        // Override kategori listrik
        return "Mesin Traktor Listrik";
    }

    @Override
    void suaraMesin() {
        // Suara traktor listrik
        System.out.println("Bzzzzz! Mesin traktor listrik aktif!");
    }
}
