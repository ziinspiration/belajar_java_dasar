package tugas;

public class bandros {
    public static void main(String[] args) {
        hitungPembelianBandros();
    }

    public static void hitungPembelianBandros() {
        // Inisialisasi variabel
        int hargaBandros = 7000;
        int jumlahUang = 51000;
        int jumlahPembelian = 0;
        double diskon = 0.1;

        // Perulangan hingga jumlah pembelian mencapai 3 atau uang tidak mencukupi
        while (jumlahPembelian < 3 && jumlahUang >= hargaBandros) {
            // Tambahkan 1 ke jumlah pembelian
            jumlahPembelian = jumlahPembelian + 1;

            // Kurangi jumlah uang dengan harga bandros
            jumlahUang = jumlahUang - hargaBandros;

            // Jika jumlah pembelian lebih dari 1, berikan potongan diskon
            if (jumlahPembelian > 1) {
                // Hitung potongan diskon
                double potonganDiskon = hargaBandros * diskon;
                // Tambahkan potongan diskon ke jumlah uang
                jumlahUang = (int) (jumlahUang + potonganDiskon);
            }
        }

        // Tampilkan jumlah bandros yang dibeli oleh Ali
        System.out.println("Jumlah bandros yang dibeli oleh Ali: " + jumlahPembelian);
        // Tampilkan sisa uang Ali
        System.out.println("Sisa uang Ali: " + jumlahUang);
    }
}
