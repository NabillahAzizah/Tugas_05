package pemlan_05;

// Kelas abstrak untuk semua jenis tiket
abstract class Tiket {
    //Do your magic here
    protected int harga;

    public Tiket(int harga){
        this.harga=harga;
    }

    public int getHarga(){
        return harga;
    }

    public abstract String getJenis();
}