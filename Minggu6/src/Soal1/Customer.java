package Soal1;

public class Customer extends Member{

    public Customer(String nik, String nama, String noTelp, int saldo) {
        super(nik, nama, noTelp, saldo);
    }
    @Override
    public void infoMember(){
        super.infoMember();
        for (Customer i : Soal1.customer){
            System.out.println("NIK: "+i.getNik()+"\nNama: "+i.getNama()+"\nNo Telepon: "+i.getNoTelp()+"\nSaldo: "+i.getSaldo()+"\n");
        }
    }
    @Override
    public void transaksi(int saldo){
        this.saldo += saldo;
    }
}
