package Assessment1.Soal1;

public class Soal1 {
    static int nomorTransaksi = 1;

    public static void main(String[] args) {
        //Asuransi dan dropship
        Pengiriman pengiriman1 = new Pengiriman(nomorTransaksi,"N0001","JNE",21000,"Dropship1","Surabaya","Bejo","DayeuhKolot",true,true,40000);
        //Asuransi
        Pengiriman pengiriman2 = new Pengiriman(nomorTransaksi,"N0003","J&T",21000,"Tini","DayeuhKolot",true, 40000);
        //Normal
        Pengiriman pengiriman3 = new Pengiriman(nomorTransaksi,"N0004","Pos Indonesia",23000,"Bambang","DayeuhKolot");
        //Dropshipper
        Pengiriman pengiriman4 = new Pengiriman(nomorTransaksi,"N0002","siCepat",24000,"Dropship2","Pontianak","Joko","DayeuhKolot", true);
    }
}
