package pemlan_05;
import java.util.Scanner;

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!");

        // Do your magic here
        System.out.print("Masukkan nama pembeli: ");
        String nama = scanner.nextLine();
        System.out.println();

        System.out.println("Pilih tahap pembelian: ");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.print("Pilih tahap pembelian (1/2): ");
        int tahapPembelian = scanner.nextInt();
        System.out.println();

        String tahap;
        int jenisTiket;
        Tiket tiket;
        if (tahapPembelian == 1) {
            tahap = "Presale";
            System.out.println("Pilih jenis tiket:");
            System.out.println("1. VIP");
            System.out.println("2. VVIP");
            System.out.print("Pilih jenis tiket (1/2): ");
            jenisTiket = scanner.nextInt();
            System.out.println();

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


        else if (tahapPembelian == 2) {
            tahap = "Reguler";
            System.out.println("Pilih jenis tiket:");
            System.out.println("1. Festival");
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
            System.out.print("Pilih jenis tiket (1/2/3): ");
            jenisTiket = scanner.nextInt();
            System.out.println();

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

        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        int jumlahTiket = scanner.nextInt();
        System.out.println();

        Pemesanan pemesanan = new Pemesanan(nama, tahap, tiket, jumlahTiket);

        pemesanan.cetakNota();

    }
}
