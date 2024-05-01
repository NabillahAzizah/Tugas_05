package pemlan_05;

// Kelas untuk menyimpan informasi pemesanan tiket
class Pemesanan {
    private String nama;
    private String tahap;
    private Tiket tiket;
    private int jumlah;

    public Pemesanan(String nama, String tahap, Tiket tiket, int jumlah) {
        this.nama = nama;
        this.tahap = tahap;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }

    public void cetakNota() {
        // Do your magic here
        System.out.println("--- Nota Pemesanan Tiket ---");
        System.out.println("Nama Pembeli: " + nama);
        System.out.println("Tahap Pembelian: " + tahap);
        System.out.println("Jenis Tiket: " + tiket.getJenis());
        System.out.println("Jumlah Tiket: " + jumlah);
        System.out.printf("Total Harga: Rp.%,.1f",(double) getTotalHarga());
        //memastikan dibaca sebagai pecahan dengan double dan 1f menjadikan format 1 desimal setelah , (0.0)
    }

    //menerapkan operasi diskon untuk tahapan presale selain jenis tiket festival
    private int getTotalHarga() {
        int hargaPerTiket = tiket.getHarga();
        if (tahap.equalsIgnoreCase("Presale") && !(tiket instanceof Festival)) {
            hargaPerTiket *= 0.8;
            //bentuk dari diskon 20%
        }

        //mengembalikan total harga tiket keseluruhan
        return hargaPerTiket * jumlah;
    }
}
