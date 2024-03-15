import java.util.Scanner;
public class admin {
    String adminUsername = "nabilaa";
    String adminPassword = "123";
    user[] studentList = new user[100];
    int studentCount = 0;

    void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        String nim;
        do {
            System.out.print("Masukkan NIM: ");
            nim = scanner.nextLine();
            if (nim.length() != 15) {
                System.out.println("NIM tidak valid. NIM harus memiliki panjang 15 karakter.");
            }
        } while (nim.length() != 15);
        System.out.print("Masukkan fakultas: ");
        String fakultas = scanner.nextLine();
        System.out.print("Masukkan prodi: ");
        String programStudi = scanner.nextLine();

        user newUser = new user(nim, nama, fakultas, programStudi);
        studentList[studentCount] = newUser;
        studentCount++;
    }

    void displayStudents() {
        for (int i = 0; i < studentCount; i++) {
            user user = studentList[i];
            System.out.println(user.nama + " (" + user.nim + ") - " + user.fakultas + ", " + user.prodi);
        }
    }
}
