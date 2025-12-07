public class EWalletPayment implements PaymentMethod {

    // TODO: Buat atribut yang diperlukan, misalnya:
    // - nama penyedia layanan (contoh: Dana, OVO, Gopay)
    // - jumlah saldo
    // - nominal transaksi
    String namaLayanan;
    double jumlahSaldo;
    double jumlahTransaksi;

    // TODO: Buat constructor untuk mengisi nilai atribut
    public EWalletPayment(String namaLayanan, double jumlahSaldo, double jumlahTransaksi){
        this.namaLayanan = namaLayanan;
        this.jumlahSaldo = jumlahSaldo;
        this.jumlahTransaksi = jumlahTransaksi;
    }

    // TODO: Implementasikan semua method yang ada pada interface PaymentMethod

    // Catatan:
    // - Pada method processPayment(), lakukan pengecekan kecukupan saldo
    // - Jika saldo cukup, kurangi saldo lalu tampilkan pesan berhasil
    // - Jika saldo tidak cukup, tampilkan pesan gagal

    @Override
    public double processPayment(){
        double total = jumlahTransaksi + this.getTransactionFee();
        System.out.println("Saldo awal: " + (int)jumlahSaldo);
        System.out.println("Memproses pembayaran sebesar " + jumlahTransaksi + "...");

        if (jumlahSaldo < jumlahTransaksi){
            System.out.println("Pembayaran gagal, saldo tidak cukup!");
            return jumlahSaldo;
        } else{

            jumlahSaldo -= total;
            System.out.println("Pembayaran berhasil!");
            System.out.println("Sisa saldo: " + jumlahSaldo);

            return jumlahSaldo;
        }
    }

    @Override
    public void getPaymentDetails(){
        System.out.println("Detail Transaksi: Pembayaran dilakukan melalui " + namaLayanan);
    }

    @Override
    public double getTransactionFee() {
        return 2000;
    }

    @Override
    public double getBalance() {
        return jumlahSaldo;
    }
}
