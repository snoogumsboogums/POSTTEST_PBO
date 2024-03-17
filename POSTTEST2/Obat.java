public class Obat {
    private String nama;
    private int stok;
    private float harga; 

    public Obat(String nama, int stok, float harga){
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    void setNama (String nama) {
        this.nama = nama;
    }

    String getNama() {
        return this.nama;
    }

    void setStok (int stok) {
        this.stok = stok;
    }

    int getStok() {
        return this.stok;
    }

    void setHarga (float harga) {
        this.harga = harga;
    }

    float getHarga() {
        return this.harga;
    }

}






