public class Obat {
    String nama;
    int stok;
    float harga; 

    public Obat(String nama, int stok, float harga){
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    void tampil(){
        System.out.println("Nama Obat : " + this.nama);
        System.out.println("Stok Obat : " + this.stok);
        System.out.println("Harga Obat : " +  String.format("%.3f", this.harga));
    }
}