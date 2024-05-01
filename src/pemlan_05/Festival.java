package pemlan_05;

// Kelas turunan untuk tiket Festival dan subclass dari kelas abstract Tiket
class Festival extends Tiket {
    //memanggil superclass untuk inisialisasai atribut harga dari kelas Tiket
    public Festival (int harga){
        super(harga);
    }

    //mengembalikan nilai jenis tiket yang sesuai dari metode dalam kelas abstract Tiket,
    @Override
    public String getJenis(){
        return "Festival";
    }
}