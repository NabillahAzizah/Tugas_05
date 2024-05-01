package pemlan_05;

// Kelas abstrak untuk semua jenis tiket (VIP, VVIP, Festival)
abstract class Tiket {
    //inisialisasi harga agar bisa diakses kelas turunan
    protected int harga;

    public Tiket(int harga){
        this.harga=harga;
    }

    public int getHarga(){
        return harga;
    }

    //mengembalikan jenis tiket dengan tujuan implementasinya berbeda tiap kelas turunan
    public abstract String getJenis();
}