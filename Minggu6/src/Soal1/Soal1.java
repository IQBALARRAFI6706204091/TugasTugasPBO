package Soal1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Soal1 {
    static ArrayList<Driver> driver = new ArrayList<>();
    static ArrayList<Customer> customer = new ArrayList<>();
    static BufferedReader iqbal = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception{
        int pilihan = 0;

        while (pilihan!=4){
            System.out.println("1.Input Member\n2.Info Member\n3.Transaksi\n4.Keluar");
            pilihan = Integer.parseInt(iqbal.readLine());
            switch (pilihan){
                case 1:
                    inputMember();
                    break;
                case 2:
                    infoMember();
                    break;
                case 3:
                    transaksi();
                    break;
                case 4:
                    break;
            }
        }
    }
    static void inputMember() throws Exception {
        int pilihan = 0;
        System.out.println("1.Input Driver\n2.Input Customer");
        pilihan = Integer.parseInt(iqbal.readLine());
        System.out.println("Masukkan NIK:");
        String nik = iqbal.readLine();
        System.out.println("Masukkan Nama:");
        String nama = iqbal.readLine();
        System.out.println("Masukkan Nomor Telepon:");
        String noTelp = iqbal.readLine();
        System.out.println("Masukkan Saldo:");
        int saldo = Integer.parseInt(iqbal.readLine());
        switch (pilihan){
            case 1:
                System.out.println("Masukkan Plat Nomor:");
                String noPlat = iqbal.readLine();
                System.out.println("Masukkan Jenis Mobil:");
                String jenisMobil = iqbal.readLine();
                driver.add(new Driver(nik,nama,noTelp,saldo,noPlat,jenisMobil));
                break;
            case 2:
                customer.add(new Customer(nik,nama,noTelp,saldo));
                break;
        }
    }
    static void infoMember() throws Exception{
        int pilihan = 0;
        System.out.println("1.Info Driver\n2.Info Customer");
        pilihan = Integer.parseInt(iqbal.readLine());
        switch (pilihan){
            case 1:
                for (Driver i : driver){
                    i.infoMember();
                }
                break;
            case 2:
                for (Customer i : customer){
                    i.infoMember();
                }
                break;
        }
    }
    static void transaksi() throws Exception{
        int pilihan = 0;
        System.out.println("1.Transaksi ke Driver\n2.Transaksi ke Customer");
        pilihan = Integer.parseInt(iqbal.readLine());
        System.out.println("Masukkan nama customer:");
        String namaCust = iqbal.readLine();
        System.out.println("Masukkan nama driver:");
        String namaDriv = iqbal.readLine();
        System.out.println("Masukkan Saldo yang diisi:");
        int saldo = Integer.parseInt(iqbal.readLine());
        for (Customer customer : customer){
            if(customer.getNama().equalsIgnoreCase(namaCust)){
                for (Driver driver : driver){
                    if(driver.getNama().equalsIgnoreCase(namaDriv)){
                        switch (pilihan){
                            case 1:
                                if(customer.getSaldo() >= saldo) {
                                    driver.transaksi(saldo);
                                    customer.saldo -= saldo;
                                }else {
                                    System.out.println("Saldo tidak mencukupi");
                                }
                                break;
                            case 2:
                                if(driver.getSaldo() >= saldo) {
                                    customer.transaksi(saldo);
                                    driver.saldo -= saldo;
                                }else {
                                    System.out.println("Saldo tidak mencukupi");
                                }
                        }
                    }else{
                        System.out.println("Nama driver tidak ditemukan");
                    }
                }
            }else{
                System.out.println("Nama customer tidak ditemukan");
            }
        }
    }
}