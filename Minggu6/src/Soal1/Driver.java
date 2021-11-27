package Soal1;

public class Driver extends Member{
    String noPlat;
    String jenisMobil;

    public Driver(String nik, String nama, String noTelp,int saldo, String noPlat, String jenisMobil) {
        super(nik, nama, noTelp, saldo);
        this.noPlat = noPlat;
        this.jenisMobil = jenisMobil;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public String getJenisMobil() {
        return jenisMobil;
    }

    @Override
    public void infoMember(){
        super.infoMember();
        for (Driver i : Soal1.driver){
            System.out.println("NIK: "+i.getNik()+"\nNama: "+i.getNama()+"\nNo Telepon: "+i.getNoTelp()+"\nSaldo: "+i.getSaldo()+"\nNo Plat: "+i.getNoPlat()+"\nJenis Mobil: "+i.getJenisMobil()+"\n");
        }
    }
    @Override
    public void transaksi(int saldo){
        this.saldo += saldo;
    }
}
