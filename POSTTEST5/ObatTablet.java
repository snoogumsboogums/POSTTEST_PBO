public class ObatTablet extends Obat {
    private int jumlahTablet;

    public ObatTablet(String nama, int stok, float harga, int jumlahTablet) {
        super(nama, stok, harga);
        this.jumlahTablet = jumlahTablet;
    }

    // Overloading
    public ObatTablet(String nama, int stok, float harga) {
        super(nama, stok, harga);
        this.jumlahTablet = 0; 
    }

    public int getJumlahTablet() {
        return jumlahTablet;
    }

    public void setJumlahTablet(int jumlahTablet) {
        this.jumlahTablet = jumlahTablet;
    }

    @Override
    public float getHarga() {
        return super.getHarga() * jumlahTablet;
    }
}
