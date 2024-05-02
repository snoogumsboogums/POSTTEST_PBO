public class ObatTablet extends Obat implements ObatInterface {
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

    // Override method getHarga untuk menghitung harga berdasarkan jumlahTablet
    @Override
    public float getHarga() {
        return super.getHarga() * jumlahTablet;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Obat Tablet: " + getNama());
        System.out.println("Stok Obat Tablet: " + getStok());
        System.out.println("Harga Obat Tablet: " + getHarga());
        System.out.println("Jumlah Tablet Obat: " + jumlahTablet);
    }

    @Override
    public boolean isStokHabis() {
        return getStok() <= 0;
    }
}