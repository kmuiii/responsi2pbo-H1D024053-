public class PaymentTest {

    public static void main(String[] args) {

        // TODO:
        // - Buat objek dari EWalletPayment
        // - Panggil method yang telah dibuat untuk menguji fungsionalitas
        // - Tampilkan hasil akhir informasi saldo dan detail pembayaran
        //
        // Contoh alur (boleh diikuti atau dimodifikasi oleh praktikan):
        // 1. Menampilkan data sebelum transaksi
        // 2. Memproses pembayaran
        // 3. Menampilkan data setelah transaksi
        PaymentMethod p = new EWalletPayment("OVO", 150000, 50000);
        PaymentMethod q = new EWalletPayment("Gopay", 50000, 60000);

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");
        System.out.println();

        p.processPayment();
        p.getPaymentDetails();

        System.out.println();
        q.processPayment();
        q.getPaymentDetails();

    }
}
