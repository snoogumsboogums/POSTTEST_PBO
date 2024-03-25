public class ObatCair extends Obat {
    private int volume;

    public ObatCair(String nama, int stok, float harga, int volume) {
        super(nama, stok, harga);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
}
