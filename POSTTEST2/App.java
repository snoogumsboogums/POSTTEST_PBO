import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {
    static ArrayList<Obat> dataObat = new ArrayList<>();

    public static void displayObat(){
        for (int i = 0; i < dataObat.size(); i++){
            System.out.println("----------------------------------------");
            System.out.println("Data obat ke-" + (i+1));
            System.out.println("Nama Obat : " + dataObat.get(i).getNama());
            System.out.println("Stok Obat : " + dataObat.get(i).getStok());
            System.out.printf("Harga Obat : %.3f\n", dataObat.get(i).getHarga());
            System.out.println("----------------------------------------");
        }
    }
    
    public static void main(String[] args) throws IOException {
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
               displayObat();
            } else if (menu.equals("3")) {
                    displayObat();
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
                    
                            dataObat.get(index).setNama(nama);
                            dataObat.get(index).setStok(stok);
                            dataObat.get(index).setHarga(harga);
                            System.out.println("\nBerhasil ubah data!");
                        }
                    }         

            } else if (menu.equals("4")) {
               displayObat();
                System.out.print("Mau hapus data obat nomor berapa? : ");
                int hapus = Integer.parseInt(br.readLine());
            
                for (int i = 0 ; i < dataObat.size() ; i++) {
                    if (hapus <= dataObat.size()){
                        dataObat.remove(hapus - 1);
                        System.out.println("Data berhasil dihapus!");
                        } else {
                        System.out.println("Data tidak tersedia!!");
                        }
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