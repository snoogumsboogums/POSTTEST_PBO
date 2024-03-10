import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException {
        ArrayList<Obat> dataObat = new ArrayList<>();

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
    
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
            String menu = br.readLine();
            if (menu.equals("1")) {
                String nama;
                while (true) {
                    System.out.print("Masukkan Nama Obat : ");
                    nama = br.readLine();
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
                        stok = Integer.parseInt(br.readLine());
                        break;
                    } catch (Exception e){
                        System.out.println("Stok obat tidak valid");
                    }
                }
                float harga;
                while(true) {
                    System.out.print("Masukkan Harga Obat : ");
                    try {
                        harga = Float.parseFloat(br.readLine());
                        break;
                    } catch (Exception e){
                        System.out.println("Harga obat tidak valid");
                    }
                }

                Obat obatBaru = new Obat(nama, stok, harga);
                dataObat.add(obatBaru);

            } else if (menu.equals("2")) {
                for (int i = 0; i < dataObat.size(); i++) {
                    System.out.println("----------------------");
                    System.out.println("Data obat ke-" + (i+1));
                    dataObat.get(i).tampil();
                    System.out.println("----------------------");
                }

            } else if (menu.equals("3")) {
                for (int i = 0; i < dataObat.size(); i++) {
                    System.out.println("----------------------");
                    System.out.println("Data obat ke-" + (i+1));
                    dataObat.get(i).tampil();
                    System.out.println("----------------------");
                }
                System.out.print("Mau ubah data obat nomor berapa? : ");
                int ubah = Integer.parseInt(br.readLine());
                
                int index = ubah - 1;
                
                if (index < 0 || index >= dataObat.size()) {
                    System.out.println("Data obat tidak ditemukan");
                } else {
                    System.out.print("Masukkan Nama Obat Baru : ");
                    String nama = br.readLine();
                    if (nama.isEmpty()) {
                        System.out.println("Nama obat tidak boleh kosong");
                    } else {
                        int stok;
                        while (true) {
                            System.out.print("Masukkan Stok Obat Baru : ");
                            try {
                                stok = Integer.parseInt(br.readLine());
                                break;
                            } catch (Exception e) {
                                System.out.println("Stok obat tidak valid");
                            }
                        }
                        float harga;
                        while (true) {
                            System.out.print("Masukkan Harga Obat : ");
                            try {
                                harga = Float.parseFloat(br.readLine());
                                break;
                            } catch (Exception e) {
                                System.out.println("Harga obat tidak valid");
                            }
                        }
                
                        dataObat.get(index).nama = nama;
                        dataObat.get(index).stok = stok;
                        dataObat.get(index).harga = harga;
                        System.out.println("\nBerhasil ubah data!");
                    }
                }            
            
            } else if (menu.equals("4")) {
                for (int i = 0 ; i < dataObat.size() ; i++){
                    System.out.println("Data obat ke-"+ (i+1));
                    dataObat.get(i).tampil();
                    System.out.println("----------------------");
                }
                System.out.print("Mau hapus data obat nomor berapa? : ");
                int hapus = Integer.parseInt(br.readLine());
            
                if (hapus > 0 && hapus <= dataObat.size()) { 
                    dataObat.remove(hapus - 1); 
                    System.out.println("Data berhasil dihapus!");
                } else {
                    System.out.println("Data tidak tersedia!!");
                }            

            } else if (menu.equals("0")) {
                System.out.println("Terimakasih sudah menggunakan program ini!");
                break;
                
            } else {
                System.out.println("Input Salah!!");
            }
        }
    }
}