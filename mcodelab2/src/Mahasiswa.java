import java.util.Scanner;

public class Mahasiswa {
    //Deklarasi Variabel
    public static String nama;
    public static String nim;
    public static String jurusan;

    public static String tampiluniversitas() {
       // return "UNIVERSITAS MUHAMMSADIYAH MALANG\n";

        //return false;
        return "Universitas Muhammadiyah Malang";
    }

    public static void inputdata() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama mahasiswa : ");
        nama = input.nextLine();

        System.out.println("Masukkan Nim : ");
        nim = input.nextLine();

        System.out.println("Masukkan jurusan : ");
        jurusan = input.nextLine();

        if (nim.length() >= 15) {
            System.out.println("Selamat, data berhasil ditambahkan");

        } else {
            System.out.println("NIM HARUS 15 DIGIT KAK!!!");
        }
       // System.out.println("Masukkan Jurusan");
       // jurusan = input.nextLine();
    }

    public static String tampildataMahasiswa() {
        return "Nama : " + nama + "\n NIM : " + nim + "\njurusan : " + jurusan;

    }
}











