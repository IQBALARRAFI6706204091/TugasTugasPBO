package Assessment1.Soal2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ShowroomJaya {

    static BufferedReader iqbal = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Mobil> arrMobil = new ArrayList<>();

    public static void main(String[] args) throws IOException{
        int pilihan = 0;

        while (pilihan!=5){
            System.out.println("\n1.Tambah mobil\n2.Beli mobil\n3.Lihat stok yang tersedia\n4.Cari informasi mobil\n5.Keluar");
            pilihan = Integer.parseInt(iqbal.readLine());
            switch (pilihan){
                case 1:
                    tambahMobil();
                    break;
                case 2:
                    beliMobil();
                    break;
                case 3:
                    viewStok();
                    break;
                case 4:
                    System.out.print("Masukkan merk mobil: ");
                    String merk = iqbal.readLine();
                    System.out.print("Masukkan tahun keluaran: ");
                    String tahunKeluaran = iqbal.readLine();
                    Mobil.displayInfo(merk, tahunKeluaran);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Pilihan tersebut tidak tersedia");
            }
        }
    }
    static void tambahMobil() throws IOException {
        System.out.print("\nMasukkan nama merk: ");
        String merk = iqbal.readLine();
        System.out.print("Masukkan harga: ");
        double harga = Double.parseDouble(iqbal.readLine());
        System.out.print("Masukkan tahun keluaran: ");
        String tahunKeluaran = iqbal.readLine();
        System.out.print("Masukkan jumlah stok: ");
        int jumlahStok = Integer.parseInt(iqbal.readLine());
        arrMobil.add(new Mobil(merk,tahunKeluaran,harga,jumlahStok));
    }
    static void beliMobil() throws IOException {
        System.out.print("\nShowroom Mobil Jaya - Penjualan\nMasukkan nama merk: ");
        String merk = iqbal.readLine();
        System.out.print("Masukkan tahun keluaran: ");
        String tahun = iqbal.readLine();
        System.out.print("Masukkan jumlah pembelian: ");
        int jumlahPembelian = Integer.parseInt(iqbal.readLine());
        for (Mobil i : arrMobil){
            if(i.getMerk().equalsIgnoreCase(merk) && i.getTahunKeluaran().equalsIgnoreCase(tahun) && i.getStok()>=jumlahPembelian && jumlahPembelian>2){
                System.out.println("\nMerk: "+i.getMerk()+"\nHarga Satuan: "+String.format("%.1f%n",i.getHarga())+"Tahun Keluaran: "+i.getTahunKeluaran()+"\nJumlah Beli: "+jumlahPembelian+"\nTotal Horga: "+String.format("%.1f%n",jumlahPembelian*i.getHarga())+"Diskon: 20.0 persen\nTotal Diskon: "+String.format("%.1f%n",jumlahPembelian*i.getHarga()/5)+"Total bayar :"+String.format("%.1f%n",(jumlahPembelian*i.getHarga() - jumlahPembelian*i.getHarga()/5)));
                i.setStok(i.getStok()-jumlahPembelian);
            }else if(i.getMerk().equalsIgnoreCase(merk) && i.getTahunKeluaran().equalsIgnoreCase(tahun) && i.getStok()>=jumlahPembelian && jumlahPembelian==2) {
                System.out.println("\nMerk: " + i.getMerk() + "\nHarga Satuan: " + String.format("%.1f%n", i.getHarga()) + "Tahun Keluaran: " + i.getTahunKeluaran() + "\nJumlah Beli: " + jumlahPembelian + "\nTotal Horga: " + String.format("%.1f%n", jumlahPembelian * i.getHarga()) + "Diskon: 10.0 persen\nTotal Diskon: " + String.format("%.1f%n", jumlahPembelian * i.getHarga() / 10) + "Total bayar :" + String.format("%.1f%n", (jumlahPembelian * i.getHarga() - jumlahPembelian * i.getHarga() / 10)));
                i.setStok(i.getStok() - jumlahPembelian);
            } else if(i.getMerk().equalsIgnoreCase(merk) && i.getTahunKeluaran().equalsIgnoreCase(tahun) && i.getStok()>=jumlahPembelian && jumlahPembelian==1){
                System.out.println("\nMerk: "+i.getMerk()+"\nHarga Satuan: "+String.format("%.1f%n",i.getHarga())+"Tahun Keluaran: "+i.getTahunKeluaran()+"\nJumlah Beli: "+jumlahPembelian+"\nTotal Horga: "+String.format("%.1f%n",jumlahPembelian*i.getHarga())+"Diskon: 0.0 persen\nTotal Diskon: 0.00\nTotal bayar :"+String.format("%.1f%n",(jumlahPembelian*i.getHarga())));
                i.setStok(i.getStok()-jumlahPembelian);
            }else{
                System.out.println("\nMaaf, Jumlah Stok Tidak Mencukupi");
            }
        }
    }
    static void viewStok(){
        for (Mobil i : arrMobil){
            System.out.println("\nMerk: "+i.getMerk()+"\nTahun Keluaran: "+i.getTahunKeluaran()+"\nJumlah Stok: "+i.getStok());
        }
    }
}
