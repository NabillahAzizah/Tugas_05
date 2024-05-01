package pemlan_05;

// Kelas turunan untuk tiket VIP dan subclass dari kelas abstract Tiket
class VIP extends Tiket {
    //memanggil superclass untuk inisialisasai atribut harga dari kelas Tiket
    public VIP(int harga){
        super(harga);
    }

    //mengembalikan nilai jenis tiket yang sesuai dari metode dalam kelas abstract Tiket,
    public String getJenis(){
        return "VIP";
    }
}
