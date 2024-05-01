package pemlan_05;

// Kelas turunan untuk tiket VVIP dan subclass dari kelas abstract Tiket
class VVIP extends Tiket {
    //memanggil superclass untuk inisialisasai atribut harga dari kelas Tiket
    public VVIP (int harga){
        super(harga);
    }

    //mengembalikan nilai jenis tiket yang sesuai dari metode dalam kelas abstract Tiket,
    public String getJenis(){
        return "VVIP";
    }
}