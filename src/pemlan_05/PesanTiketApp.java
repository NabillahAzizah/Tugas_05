package pemlan_05;
import java.util.Scanner;

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!");

        // Do your magic here
        //tampilan input untuk nama pembeli
        System.out.print("Masukkan nama pembeli: ");
        String nama = scanner.nextLine();
        System.out.println();

        //tampilan input untuk pilihan tahap beli tiket
        System.out.println("Pilih tahap pembelian: ");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.print("Pilih tahap pembelian (1/2): ");
        int tahapPembelian = scanner.nextInt();
        System.out.println();

        //inisialisasi global
        String tahap;
        int jenisTiket;
        Tiket tiket;

        //output dari pilihan presale
        if (tahapPembelian == 1) {
            tahap = "Presale";
            System.out.println("Pilih jenis tiket:");
            System.out.println("1. VIP");
            System.out.println("2. VVIP");
            System.out.print("Pilih jenis tiket (1/2): ");
            jenisTiket = scanner.nextInt();
            System.out.println();

            //operasi tiap jenis tiket
            //break tiap case agar berhenti setelah selesai dijalankan
            switch (jenisTiket){
                case 1:
                    tiket = new VIP(150);
                    break;
                case 2:
                    tiket = new VVIP(200);
                    break;
                default:
                    System.out.println("Input tidak valid!");
                    return;
            }
        }
        //output dari pilihan reguler
        else if (tahapPembelian == 2) {
            tahap = "Reguler";
            System.out.println("Pilih jenis tiket:");
            System.out.println("1. Festival");
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
            System.out.print("Pilih jenis tiket (1/2/3): ");
            jenisTiket = scanner.nextInt();
            System.out.println();

            //operasi tiap jenis tiket
            //break tiap case agar berhenti setelah selesai dijalankan
            switch (jenisTiket){
                case 1:
                    tiket = new Festival(100);
                    break;
                case 2:
                    tiket = new VIP(150);
                    break;
                case 3:
                    tiket = new VVIP(200);
                    break;
                default:
                    System.out.println("Input tidak valid");
                    return;
            }
        } else {
            System.out.println("Input tidak valid");
            return;
        }

        //tampilan input untuk jumlah tiket dibeli
        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        int jumlahTiket = scanner.nextInt();
        System.out.println();

        //membuat objek pemesanan dengan parameter sesuai class
        Pemesanan pemesanan = new Pemesanan(nama, tahap, tiket, jumlahTiket);

        //memanggil method dari objek untuk mencetak nota pemesanan
        pemesanan.cetakNota();

    }
}
