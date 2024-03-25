public class ObatTablet extends Obat {
    private int jumlahTablet;

    public ObatTablet(String nama, int stok, float harga, int jumlahTablet) {
        super(nama, stok, harga);
        this.jumlahTablet = jumlahTablet;
    }

    public int getJumlahTablet() {
        return jumlahTablet;
    }

    public void setJumlahTablet(int jumlahTablet) {
        this.jumlahTablet = jumlahTablet;
    }
}
