package Minggu2.Tugas2_1;

public class Buku {
    private String isbn;
    private String judulBuku;
    private String pengarang;
    private int tahunTerbit;
    private float harga;
    private float rating;

    public Buku(String isbn, String judulBuku, String pengarang, int tahunTerbit, float harga, float rating) {
        this.isbn = isbn;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.rating = rating;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getJudulBuku() {
        return judulBuku;
    }
    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }
    public int getTahunTerbit() {
        return tahunTerbit;
    }
    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    public float getHarga() {
        return harga;
    }
    public void setHarga(float harga) {
        this.harga = harga;
    }
    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return isbn+" "+judulBuku+" "+pengarang+" "+tahunTerbit+" "+harga+" "+rating;
    }
}
