public class ObatCair extends Obat implements ObatInterface {
    private int volume;

    public ObatCair(String nama, int stok, float harga, int volume) {
        super(nama, stok, harga);
        this.volume = volume;
    }

    // Getter dan setter untuk volume
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Override method getHarga untuk menghitung harga berdasarkan volume
    @Override
    public float getHarga() {
        return super.getHarga() * volume;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Obat Cair: " + getNama());
        System.out.println("Stok Obat Cair: " + getStok());
        System.out.println("Harga Obat Cair: " + getHarga());
        System.out.println("Volume Obat Cair: " + volume + " ml");
    }

    @Override
    public boolean isStokHabis() {
        return getStok() <= 0;
    }
}