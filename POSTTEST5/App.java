import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public abstract class App {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Obat> dataObat = new ArrayList<>();
    static ArrayList<ObatCair> cairObat = new ArrayList<>();
    static ArrayList<ObatTablet> tabletObat = new ArrayList<>();
    
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
            if("1".equals(pilih)) {
                tambah();
            } else if("2".equals(pilih)) {
               lihat();
            } else if("3".equals(pilih)) {
                ubah();
            } else if("4".equals(pilih)) {
                hapus();
            } else if("0".equals(pilih)) {
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
        System.out.println("Input : ");
        String pilih = input.readLine();
        if("1".equals(pilih)){
            System.out.println("----------------");
            System.out.println("Tambah Obat Cair");
            System.out.println("----------------");
            String nama;
            while (true){
                System.out.print("Masukkan Nama Obat : ");
                nama = input.readLine();
                if (nama.isEmpty()){
                    System.out.println("Nama obat tidak boleh kosong");
                } else {
                    break;
                }
            }
            int stok; 
            while(true) {
                System.out.print("Masukkan Stok Obat : ");
                try {
                    stok = Integer.parseInt(input.readLine());
                    break;
                } catch (Exception e){
                    System.out.println("Stok obat tidak valid");
                }
            }
            float harga;
            while (true) {
                System.out.print("Masukkan Harga Obat : ");
                try{
                    harga = Float.parseFloat(input.readLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Harga obat tidak valid");
                }
            }
            int volume;
            while(true) {
                System.out.print("Masukkan Volume Obat : ");
                volume = Integer.parseInt(input.readLine());
                break;
            }
            ObatCair dataObatCair = new ObatCair(nama, stok, harga, volume);
            cairObat.add(dataObatCair);
        } else if("2".equals(pilih)){
            System.out.println("------------------");
            System.out.println("Tambah Obat Tablet");
            System.out.println("------------------");
            String nama;
            while (true){
                System.out.print("Masukkan Nama Obat : ");
                nama = input.readLine();
                if (nama.isEmpty()){
                    System.out.println("Nama obat tidak boleh kosong");
                } else {
                    break;
                }
            }
            int stok; 
            while(true) {
                System.out.print("Masukkan Stok Obat : ");
                try {
                    stok = Integer.parseInt(input.readLine());
                    break;
                } catch (Exception e){
                    System.out.println("Stok obat tidak valid");
                }
            }
            float harga;
            while (true) {
                System.out.print("Masukkan Harga Obat : ");
                try{
                    harga = Float.parseFloat(input.readLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Harga obat tidak valid");
                }
            }
            int jumlahTablet;
            while (true) {
                System.out.print("Masukkan Jumlah Tablet Obat : ");
                try{
                    jumlahTablet = Integer.parseInt(input.readLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Jumlah tablet tidak valid");
                }
            }
            ObatTablet dataObatTablet = new ObatTablet(nama, stok, harga, jumlahTablet);
            tabletObat.add(dataObatTablet);
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
        if("1".equals(pilih)){
            System.out.println("Data Obat Cair");
            if(cairObat.size() < 1){
                System.out.println("Data Kosong");
            } else {
                for (int i = 0 ; i < cairObat.size(); i++) {
                    System.out.println("---------------------------------------------------");
                    System.out.println("Data obat ke-" + (i+1));
                    System.out.println("Nama Obat : " + cairObat.get(i).getNama());
                    System.out.println("Stok Obat : " + cairObat.get(i).getStok());
                    System.out.printf("Harga Obat : %.3f\n", cairObat.get(i).getHarga());
                    System.out.println("Volume Obat : " + cairObat.get(i).getVolume() +" ml");
                    System.out.println("---------------------------------------------------");
                }
            }
        } else if ("2".equals(pilih)) {
            System.out.println("Data Obat Tablet");
            if(tabletObat.size() < 1){
                System.out.println("Data Kosong");
            } else {
                for (int i = 0; i < tabletObat.size(); i++) {
                    System.out.println("---------------------------------------------------");
                    System.out.println("Data obat ke-" + (i+1));
                    System.out.println("Nama Obat : " + tabletObat.get(i).getNama());
                    System.out.println("Stok Obat : " + tabletObat.get(i).getStok());
                    System.out.printf("Harga Obat : %.3f\n", tabletObat.get(i).getHarga());
                    System.out.println("Jumlah Tablet Obat : " + tabletObat.get(i).getJumlahTablet());
                    System.out.println("---------------------------------------------------");
                }
            }
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
            lihat();
            System.out.print("Mau ubah data obat nomor berapa? : ");
            int ubah = Integer.parseInt(input.readLine());
            int index = ubah - 1;
            if (index < 0 || index >= cairObat.size()) {
                System.out.println("Data obat tidak ditemukan");
            } else {
                String nama = "";
                while (nama.isEmpty()) {
                    System.out.print("Masukkan Nama Obat Baru : ");
                    nama = input.readLine();
                    if (nama.isEmpty()) {
                        System.out.println("Nama obat tidak boleh kosong");
                    }
                }
                int stok;
                while (true) {
                    System.out.print("Masukkan Stok Obat Baru : ");
                    try {
                        stok = Integer.parseInt(input.readLine());
                        break;
                    } catch (Exception e) {
                        System.out.println("Stok obat tidak valid");
                    }
                }
                float harga;
                while (true) {
                    System.out.print("Masukkan Harga Obat : ");
                    try {
                        harga = Float.parseFloat(input.readLine());
                        break;
                    } catch (Exception e) {
                        System.out.println("Harga obat tidak valid");
                    }
                }
                int volume;
                while (true) {
                    System.out.print("Masukkan Volume Obat : ");
                    try {
                        volume = Integer.parseInt(input.readLine());
                        break;
                    } catch (Exception e) {
                        System.out.println("Volume obat tidak valid");
                    }
                }
                ObatCair dataObatCair = cairObat.get(index);
                dataObatCair.setNama(nama);
                dataObatCair.setStok(stok);
                dataObatCair.setHarga(harga);
                dataObatCair.setVolume(volume);
                System.out.println("Berhasil ubah data!");
            }
        
        } else if ("2".equals(pilih)) {
            lihat();
            System.out.print("Mau ubah data obat nomor berapa? : ");
            int ubah = Integer.parseInt(input.readLine());
            int index = ubah - 1;
            if (index < 0 || index >= tabletObat.size()) {
                System.out.println("Data obat tidak ditemukan");
            } else {
                String nama = "";
                while (nama.isEmpty()) {
                    System.out.print("Masukkan Nama Obat Baru : ");
                    nama = input.readLine();
                    if (nama.isEmpty()) {
                        System.out.println("Nama obat tidak boleh kosong");
                    }
                }
                int stok;
                while (true) {
                    System.out.print("Masukkan Stok Obat Baru : ");
                    try {
                        stok = Integer.parseInt(input.readLine());
                        break;
                    } catch (Exception e) {
                        System.out.println("Stok obat harus berupa angka");
                    }
                }
                float harga;
                while (true) {
                    System.out.print("Masukkan Harga Obat : ");
                    try {
                        harga = Float.parseFloat(input.readLine());
                        break;
                    } catch (Exception e) {
                        System.out.println("Harga obat harus berupa angka");
                    }
                }
                int jumlahTablet;
                while (true) {
                    System.out.println("Masukkan Jumlah Tablet Obat : ");
                    try {
                        jumlahTablet = Integer.parseInt(input.readLine());
                        break;
                    } catch (Exception e) {
                        System.out.println("Jumlah tablet obat tidak valid");
                    }
                }
                ObatTablet dataObatTablet = tabletObat.get(index);
                dataObatTablet.setNama(nama);
                dataObatTablet.setStok(stok);
                dataObatTablet.setHarga(harga);
                dataObatTablet.setJumlahTablet(jumlahTablet);
                System.out.println("Berhasil ubah data!");
    
            }
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
        if("1".equals(pilih)){
            System.out.println("Data Obat Cair");
            if(cairObat.size() < 1){
                System.out.println("Data Kosong");
            } else {
                for (int i = 0; i < cairObat.size(); i++) {
                    System.out.println("---------------------------------------------------");
                    System.out.println("Data obat ke-" + (i+1));
                    System.out.println("Nama Obat : " + cairObat.get(i).getNama());
                    System.out.println("Stok Obat : " + cairObat.get(i).getStok());
                    System.out.printf("Harga Obat : %.3f\n", cairObat.get(i).getHarga());
                    System.out.println("Volume Obat : " + cairObat.get(i).getVolume());
                    System.out.println("---------------------------------------------------");
                }
                System.out.print("Pilih Nomor : ");
                int hapus = Integer.parseInt(input.readLine());
                cairObat.remove(hapus-1);
            }
        } else if ("2".equals(pilih)) {
            System.out.println("Data Obat Tablet");
            if(tabletObat.size() < 1){
                System.out.println("Data Kosong");
            } else {
                for (int i = 0; i < tabletObat.size(); i++) {
                    System.out.println("---------------------------------------------------");
                    System.out.println("Data obat ke-" + (i+1));
                    System.out.println("Nama Obat : " + tabletObat.get(i).getNama());
                    System.out.println("Stok Obat : " + tabletObat.get(i).getStok());
                    System.out.printf("Harga Obat : %.3f\n", tabletObat.get(i).getHarga());
                    System.out.println("Jumlah Tablet Obat : " + tabletObat.get(i).getJumlahTablet());
                    System.out.println("---------------------------------------------------");
                }
                System.out.print("Pilih Nomor : ");
                int hapus = Integer.parseInt(input.readLine());
                tabletObat.remove(hapus-1);
            }
        }
    }
}