package Assessment1.Soal2;

public class Mobil {
    private String merk;
    private String tahunKeluaran;
    private double harga;
    private int stok;

    public Mobil(String merk, String tahunKeluaran, double harga, int stok){
        this.merk = merk;
        this.tahunKeluaran = tahunKeluaran;
        this.harga = harga;
        this.stok = stok;
    }

    public String getMerk() {
        return merk;
    }

    public String getTahunKeluaran() {
        return tahunKeluaran;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public static void displayInfo(String merk, String tahunKeluaran){
        for (Mobil i : ShowroomJaya.arrMobil){
            if(i.getMerk().equalsIgnoreCase(merk) && i.getTahunKeluaran().equalsIgnoreCase(tahunKeluaran)){
                System.out.println("\nInformasi Mobil\nMerk: "+i.getMerk()+"\nHarga: "+String.format("%.1f%n",i.getHarga())+"\nTahun Keluaran: "+i.getTahunKeluaran()+"\nSisa Stok: "+i.getStok());
            }
        }
    }
}
