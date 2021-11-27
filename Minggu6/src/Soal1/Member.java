package Soal1;

public class Member {
    String nik;
    String nama;
    String noTelp;
    int saldo;

    public Member(String nik, String nama, String noTelp, int saldo) {
        this.nik = nik;
        this.nama = nama;
        this.noTelp = noTelp;
        this.saldo = saldo;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public int getSaldo() {
        return saldo;
    }
    public void infoMember(){
        System.out.println("Info Member:");
    }
    public void transaksi(int saldo){}
}
