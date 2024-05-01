package pemlan_05;

// Kelas turunan untuk tiket VIP
class VIP extends Tiket {
    // Do your magic here
    public VIP(int harga){
        super(harga);
    }

    public String getJenis(){
        return "VIP";
    }
}
