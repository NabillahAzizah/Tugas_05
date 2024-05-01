package pemlan_05;

// Kelas turunan untuk tiket Festival
class Festival extends Tiket {
    // Do your magic here
    public Festival (int harga){
        super(harga);
    }

    public String getJenis(){
        return "Festival";
    }
}