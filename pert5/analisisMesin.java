class analisisMesin {
    public static void main(String[] args) {

        // Buat array untuk menyimpan berbagai jenis mesin
        defaultMesin[] data = new defaultMesin[5];

        // Isi array dengan objek mesinMotor
        data[0] = new mesinMotor("Honda Supra X", 125, "Bebek");

        // Isi array dengan objek mesinTraktor
        data[1] = new mesinTraktor("Kubota MX5200", 520, 5);

        // Isi array dengan objek mesinTraktorListrik
        data[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);

        // Isi array dengan objek mesinMotor
        data[3] = new mesinMotor("Yamaha R25", 200, "Sport");

        // Isi array dengan objek mesinTraktorListrik
        data[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");
        for (defaultMesin mesin : data){
            // Loop untuk menampilkan info masing-masing mesin
            mesin.tampilInfo();

            // Loop untuk menampilkan kategori dan performa
            System.out.println("Kategori: " + mesin.kategoriMesin());
            System.out.println("Performa; " + mesin.nilaiPerforma());
            System.out.println();
        }

        System.out.println("=== SUARA MESIN ===");
        // Loop untuk menghasilkan suara tiap mesin (instanceof)
        for (defaultMesin mesin : data) {
            if (mesin instanceof mesinMotor motor) {
                motor.suaraMesin();
            } else if (mesin instanceof mesinTraktorListrik listrik) {
                listrik.suaraMesin();
            } else if (mesin instanceof mesinTraktor traktor) {
                traktor.suaraMesin();
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");
        // Logika menemukan mesin dengan performa tertinggi
        defaultMesin terbaik = data[0];

        for (defaultMesin mesin : data) {
            if (mesin.nilaiPerforma() > terbaik.nilaiPerforma()) {
                terbaik = mesin;
            }
        }

        System.out.println(terbaik.namaMesin + " → " + terbaik.nilaiPerforma());

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");
        // Logika sorting 3 performa tertinggi
        defaultMesin juara1 = null, juara2 = null, juara3 = null;

        for (defaultMesin mesin : data) {
            if (juara1 == null || mesin.nilaiPerforma() > juara1.nilaiPerforma()) {
                juara3 = juara2;
                juara2 = juara1;
                juara1 = mesin;
            } else if (juara2 == null || mesin.nilaiPerforma() > juara2.nilaiPerforma()) {
                juara3 = juara2;
                juara2 = mesin;
            } else if (juara3 == null || mesin.nilaiPerforma() > juara3.nilaiPerforma()) {
                juara3 = mesin;
            }
        }

        System.out.println("1. " + juara1.namaMesin + " → " + juara1.nilaiPerforma());
        System.out.println("2. " + juara2.namaMesin + " → " + juara2.nilaiPerforma());
        System.out.println("3. " + juara3.namaMesin + " → " + juara3.nilaiPerforma());
    }
}
