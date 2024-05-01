package pemlan_05;

// Kelas turunan untuk tiket VVIP
class VVIP extends Tiket {
    // Do your magic here
    public VVIP (int harga){
        super(harga);
    }

    public String getJenis(){
        return "VVIP";
    }
}