import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int pilihan = 0;
        while (pilihan != 3){
        System.out.println("\n===LIBRARY SYSTEM===\n");
        System.out.println("1. Login as student");
        System.out.println("2. Login as admin");
        System.out.println("3. Exit");
        System.out.println("Choose Option (1-3) : ");
        Scanner objInput = new Scanner(System.in);

        pilihan = objInput.nextInt();

            switch (pilihan) {
                case 1:
                    student();
                    break;
                case 2:
                    admin();
                    break;
                case 3:
                    System.out.println("thx u gais");
                    break;
                default:
                    System.out.println("tidak terdaftar");
            }
        }


    }


    public static void student() {
        Scanner objInput = new Scanner(System.in);
        System.out.println("Masukkan Nim : ");
        String nim = objInput.nextLine();
        if (nim.length() >= 15) {
            System.out.print("Input berhasil\n");
        } else {
            System.out.print("Anda tidak terdaftar\n");
        }
    }

    public static void admin() {
        Scanner objInput = new Scanner(System.in);
        System.out.println("masukkan username : ");
        String username = objInput.nextLine();
        System.out.println("masukkan password : ");
        String password = objInput.nextLine();
        if (username.equals(password)) {
            System.out.print("login berhasil\n");
        } else {
            System.out.print("tidak terdata\n");
        }
    }
}




   // private static void student() {
        //Scanner objInput = new Scanner(System.in);
       // System.out.println("masukkan nim : ");
       // String nim = objInput.nextLine();
       // if (nim.length() == 15) {
            //System.out.print("input berhasil");
       // } else {
            //System.out.print("anda tidak terdaftar");
       // }
   // }

   // private static void admin() {
        //Scanner objInput = new Scanner(System.in);
       // System.out.println("masukkan username : ");
        //String username = objInput.nextLine();
       // System.out.println("masukkan password : ");
       // String password = objInput.nextLine();
       // if (username.equals(password)) {
           // System.out.print("login berhasil");
       // } else {
           // System.out.print("tidak terdata");
       // }
   // }
//}




