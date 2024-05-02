import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public abstract class App {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<ObatCair> cairObat = new ArrayList<>();
    static ArrayList<ObatTablet> tabletObat = new ArrayList<>();
    private static int totalObat = 0;

    public final static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("╔═════════════════════════╗");
            System.out.println("║          Menu           ║");
            System.out.println("╠═════════════════════════╣");
            System.out.println("║ 1. Tambah Data          ║");
            System.out.println("║ 2. Lihat Data           ║");
            System.out.println("║ 3. Ubah Data            ║");
            System.out.println("║ 4. Hapus Data           ║");
            System.out.println("║ 0. Exit                 ║");
            System.out.println("╚═════════════════════════╝");
            System.out.print("Input : ");
            String pilih = input.readLine();
            if ("1".equals(pilih)) {
                tambah();
            } else if ("2".equals(pilih)) {
                lihat();
            } else if ("3".equals(pilih)) {
                ubah();
            } else if ("4".equals(pilih)) {
                hapus();
            } else if ("0".equals(pilih)) {
                System.out.println("Terimakasih sudah menggunakan program ini!");
                break;
            } else {
                System.out.println("Input tidak valid, silakan coba lagi.");
            }
        }
    }

    public static void tambah() throws IOException {
        System.out.println("╔═════════════════════════╗");
        System.out.println("║       Tambah Data       ║");
        System.out.println("╠═════════════════════════╣");
        System.out.println("║ 1. Obat Cair            ║");
        System.out.println("║ 2. Obat Tablet          ║");
        System.out.println("╚═════════════════════════╝");
        System.out.print("Input : ");
        String pilih = input.readLine();
        if ("1".equals(pilih)) {
            tambahObatCair();
        } else if ("2".equals(pilih)) {
            tambahObatTablet();
        }
    }

    public static void lihat() throws IOException {
        System.out.println("╔═════════════════════════╗");
        System.out.println("║       Lihat Data        ║");
        System.out.println("╠═════════════════════════╣");
        System.out.println("║ 1. Obat Cair            ║");
        System.out.println("║ 2. Obat Tablet          ║");
        System.out.println("╚═════════════════════════╝");
        System.out.print("Input : ");
        String pilih = input.readLine();
        if ("1".equals(pilih)) {
            lihatObatCair();
        } else if ("2".equals(pilih)) {
            lihatObatTablet();
        }
    }
    
    public static void ubah() throws IOException {
        System.out.println("╔═════════════════════════╗");
        System.out.println("║        Ubah Data        ║");
        System.out.println("╠═════════════════════════╣");
        System.out.println("║ 1. Obat Cair            ║");
        System.out.println("║ 2. Obat Tablet          ║");
        System.out.println("╚═════════════════════════╝");
        System.out.print("Input : ");
        String pilih = input.readLine();
        if ("1".equals(pilih)) {
            ubahObatCair();
        } else if ("2".equals(pilih)) {
            ubahObatTablet();
        }
    }
    
    public static void hapus() throws IOException {
        System.out.println("╔═════════════════════════╗");
        System.out.println("║       Hapus Data        ║");
        System.out.println("╠═════════════════════════╣");
        System.out.println("║ 1. Obat Cair            ║");
        System.out.println("║ 2. Obat Tablet          ║");
        System.out.println("╚═════════════════════════╝");
        System.out.print("Input : ");
        String pilih = input.readLine();
        if ("1".equals(pilih)) {
            hapusObatCair();
        } else if ("2".equals(pilih)) {
            hapusObatTablet();
        }
    }
    
    public static void tambahObatCair() throws IOException {
        System.out.println("----------------");
        System.out.println("Tambah Obat Cair");
        System.out.println("----------------");
        String nama;
        while (true) {
            System.out.print("Masukkan Nama Obat : ");
            nama = input.readLine();
            if (nama.isEmpty()) {
                System.out.println("Nama obat tidak boleh kosong");
            } else {
                break;
            }
        }
        int stok;
        while (true) {
            System.out.print("Masukkan Stok Obat : ");
            try {
                stok = Integer.parseInt(input.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Stok obat harus berupa angka");
            }
        }
        float harga;
        while (true) {
            System.out.print("Masukkan Harga Obat : ");
            try {
                harga = Float.parseFloat(input.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Harga obat harus berupa angka");
            }
        }
        int volume;
        while (true) {
            System.out.print("Masukkan Volume Obat : ");
            try {
                volume = Integer.parseInt(input.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Volume obat harus berupa angka");
            }
        }
        ObatCair dataObatCair = new ObatCair(nama, stok, harga, volume);
        cairObat.add(dataObatCair);
        totalObat++;
    }
    
    public static void tambahObatTablet() throws IOException {
        System.out.println("------------------");
        System.out.println("Tambah Obat Tablet");
        System.out.println("------------------");
        String nama;
        while (true) {
            System.out.print("Masukkan Nama Obat : ");
            nama = input.readLine();
            if (nama.isEmpty()) {
                System.out.println("Nama obat tidak boleh kosong");
            } else {
                break;
            }
        }
        int stok;
        while (true) {
            System.out.print("Masukkan Stok Obat : ");
            try {
                stok = Integer.parseInt(input.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Stok obat harus berupa angka");
            }
        }
        float harga;
        while (true) {
            System.out.print("Masukkan Harga Obat : ");
            try {
                harga = Float.parseFloat(input.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Harga obat harus berupa angka");
            }
        }
        int jumlahTablet;
        while (true) {
            System.out.print("Masukkan Jumlah Tablet Obat : ");
            try {
                jumlahTablet = Integer.parseInt(input.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Jumlah tablet obat harus berupa angka");
            }
        }
        ObatTablet dataObatTablet = new ObatTablet(nama, stok, harga, jumlahTablet);
        tabletObat.add(dataObatTablet);
        totalObat++;
    }
    
    public static void lihatObatCair() {
        System.out.println("Data Obat Cair");
        if (cairObat.isEmpty()) {
            System.out.println("Data Kosong");
        } else {
            for (ObatCair obat : cairObat) {
                obat.tampilkanInfo();
                System.out.println("------------------------");
            }
        }
    }
    
    public static void lihatObatTablet() {
        System.out.println("Data Obat Tablet");
        if (tabletObat.isEmpty()) {
            System.out.println("Data Kosong");
        } else {
            for (ObatTablet obat : tabletObat) {
                obat.tampilkanInfo();
                System.out.println("------------------------");
            }
        }
    }
    
    public static void ubahObatCair() throws IOException {
        System.out.println("Mau ubah data obat nomor berapa? : ");
        int index = getIndex(cairObat);
        if (index != -1) {
            ObatCair obat = cairObat.get(index);
            System.out.print("Masukkan Nama Obat Baru : ");
            String nama = input.readLine();
            obat.setNama(nama);
            System.out.print("Masukkan Stok Obat Baru : ");
            int stok = Integer.parseInt(input.readLine());
            obat.setStok(stok);
            System.out.print("Masukkan Harga Obat : ");
            float harga = Float.parseFloat(input.readLine());
            obat.setHarga(harga);
            System.out.print("Masukkan Volume Obat : ");
            int volume = Integer.parseInt(input.readLine());
            obat.setVolume(volume);
            System.out.println("Berhasil ubah data!");
        }
    }
    
    public static void ubahObatTablet() throws IOException {
        System.out.println("Mau ubah data obat nomor berapa? : ");
        int index = getIndex(tabletObat);
        if (index != -1) {
            ObatTablet obat = tabletObat.get(index);
            System.out.print("Masukkan Nama Obat Baru : ");
            String nama = input.readLine();
            obat.setNama(nama);
            System.out.print("Masukkan Stok Obat Baru : ");
            int stok = Integer.parseInt(input.readLine());
            obat.setStok(stok);
            System.out.print("Masukkan Harga Obat : ");
            float harga = Float.parseFloat(input.readLine());
            obat.setHarga(harga);
            System.out.print("Masukkan Jumlah Tablet Obat : ");
            int jumlahTablet = Integer.parseInt(input.readLine());
            obat.setJumlahTablet(jumlahTablet);
            System.out.println("Berhasil ubah data!");
        }
    }
    
    public static void hapusObatCair() throws IOException {
        System.out.println("Pilih Nomor : ");
        int index = getIndex(cairObat);
        if (index != -1) {
            cairObat.remove(index);
            System.out.println("Berhasil hapus data!");
        }
    }
    
    public static void hapusObatTablet() throws IOException {
        System.out.println("Pilih Nomor : ");
        int index = getIndex(tabletObat);
        if (index != -1) {
            tabletObat.remove(index);
            System.out.println("Berhasil hapus data!");
        }
    }
    
    private static int getIndex(ArrayList<?> list) throws IOException {
        int index;
        while (true) {
            try {
                index = Integer.parseInt(input.readLine()) - 1;
                if (index < 0 || index >= list.size()) {
                    System.out.println("Input tidak valid, silakan coba lagi.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka, silakan coba lagi.");
            }
        }
        return index;
    }
}
    