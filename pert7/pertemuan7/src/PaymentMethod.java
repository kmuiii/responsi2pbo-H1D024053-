public interface PaymentMethod {

    // TODO: Tambahkan method abstract berikut:
    // - processPayment(): digunakan untuk memproses pembayaran
    // - getPaymentDetails(): mengembalikan informasi pembayaran
    // - getTransactionFee(): mengembalikan biaya transaksi
    // - getBalance(): mengembalikan saldo
    double  processPayment();
    void getPaymentDetails();
    double getTransactionFee();
    double getBalance();
}
