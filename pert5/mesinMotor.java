class mesinMotor extends defaultMesin {
    // Variabel khusus mesin motor (tipeMotor)
    String tipeMotor;

    // Constructor
    mesinMotor(String namaMesin, int tenagaHP, String tipeMotor) {
        super(namaMesin, tenagaHP);
        this.tipeMotor = tipeMotor;
    }

    @Override
    void tampilInfo() {
        // Override info mesin motor
        System.out.println("Mesin Motor " + namaMesin + " | Tipe: " + tipeMotor + " | Tenaga: " + tenagaHP + " HP");
    }

    @Override
    double nilaiPerforma() {
        // Override performa mesin motor
        return tenagaHP * 1.2;
    }

    @Override
    String kategoriMesin() {
        // Override kategori
        return "Mesin Motor";
    }

    void suaraMesin() {
        // Suara mesin motor
        System.out.println("Brummm! Mesin motor menyala!");
    }
}
