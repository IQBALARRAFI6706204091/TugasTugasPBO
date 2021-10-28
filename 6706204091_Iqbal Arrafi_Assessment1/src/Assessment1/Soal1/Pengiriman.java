package Assessment1.Soal1;

public class Pengiriman {

    private int nomorTransaksi;
    private String namaPenjual="Eiger";
    private String alamatPenjual="Bandung Kopo";
    private String namaPembeli;
    private String alamatPembeli;
    private double ongkosKirim;
    private String namaEkspedisi;
    private String noResi;
    private boolean statusAsuransi;
    private boolean statusDropshipper;
    private double nominalAsuransi;

    //normal
    public Pengiriman(int nomorTransaksi, String noResi, String namaEkspedisi, double ongkosKirim, String namaPembeli, String alamatPembeli){
        this.nomorTransaksi = nomorTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        System.out.println("\nNormal\nNo Transaksi: "+this.nomorTransaksi+"\nNo Resi: "+this.noResi+"\nNama Ekspedisi: "+this.namaEkspedisi+"\nOngkos Kirim: "+this.ongkosKirim+"\nNama Pengirim: "+this.namaPenjual+"\nAlamat Pengirim: "+this.alamatPenjual+"\nNama Penerima: "+this.namaPembeli+"\nAlamat Penerima: "+this.alamatPembeli);
        Soal1.nomorTransaksi++;
    }
    //dropship
    public Pengiriman(int nomorTransaksi, String noResi, String namaEkspedisi, double ongkosKirim, String namaPenjual, String alamatPenjual, String namaPembeli, String alamatPembeli, boolean statusDropshipper){
        this.nomorTransaksi = nomorTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.statusDropshipper = statusDropshipper;
        System.out.println("\nDropship\nNo Transaksi: "+this.nomorTransaksi+"\nNo Resi: "+this.noResi+"\nNama Ekspedisi: "+this.namaEkspedisi+"\nOngkos Kirim: "+this.ongkosKirim+"\nNama Pengirim: "+this.namaPenjual+"\nAlamat Pengirim: "+this.alamatPenjual+"\nNama Penerima: "+this.namaPembeli+"\nAlamat Penerima: "+this.alamatPembeli);
        Soal1.nomorTransaksi++;
    }
    //asuransi
    public Pengiriman(int nomorTransaksi, String noResi, String namaEkspedisi, double ongkosKirim, String namaPembeli, String alamatPembeli, boolean statusAsuransi, int nominalAsuransi){
        if(ongkosKirim>20000){
            ongkosKirim = ongkosKirim - 5000;
        }
        this.nomorTransaksi = nomorTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.statusAsuransi = statusAsuransi;
        this.nominalAsuransi = nominalAsuransi;
        System.out.println("\nAsuransi\nNo Transaksi: "+this.nomorTransaksi+"\nNo Resi: "+this.noResi+"\nNama Ekspedisi: "+this.namaEkspedisi+"\nOngkos Kirim: "+this.ongkosKirim+"\nNama Pengirim: "+this.namaPenjual+"\nAlamat Pengirim: "+this.alamatPenjual+"\nNama Penerima: "+this.namaPembeli+"\nAlamat Penerima: "+this.alamatPembeli+"\nNominal Asuransi: "+this.nominalAsuransi);
        Soal1.nomorTransaksi++;
    }
    //Asuransi dan dropship
    public Pengiriman(int nomorTransaksi, String noResi, String namaEkspedisi, double ongkosKirim, String namaPenjual, String alamatPenjual, String namaPembeli, String alamatPembeli, boolean statusDropshipper, boolean statusAsuransi, int nominalAsuransi){
        this.nomorTransaksi = nomorTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.statusDropshipper = statusDropshipper;
        this.statusAsuransi = statusAsuransi;
        this.nominalAsuransi = nominalAsuransi;
        System.out.println("\nAsuransi dan Dropship\nNo Transaksi: "+this.nomorTransaksi+"\nNo Resi: "+this.noResi+"\nNama Ekspedisi: "+this.namaEkspedisi+"\nOngkos Kirim: "+this.ongkosKirim+"\nNama Pengirim: "+this.namaPenjual+"\nAlamat Pengirim: "+this.alamatPenjual+"\nNama Penerima: "+this.namaPembeli+"\nAlamat Penerima: "+this.alamatPembeli+"\nNominal Asuransi: "+this.nominalAsuransi);
        Soal1.nomorTransaksi++;
    }
}
