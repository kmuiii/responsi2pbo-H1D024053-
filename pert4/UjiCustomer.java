public class UjiCustomer {
    public static void main(String[] args) {

        // TODO: Buat object Customer
        Customer Budi = new Customer("Budi Santoso", "CST-001", 500000);

        // TODO: Buat object Member
        Customer Siti = new Member("Siti Aminah", "MBR-110", 1250000, 240, "Gold");

        // TODO: Tampilkan judul data pelanggan
        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        // TODO: Tampilkan info untuk Customer biasa
        Budi.tampilkanInfo();

        System.out.println();
        // TODO: Tampilkan info untuk pelanggan Member
        Siti.tampilkanInfo();
    }
}
