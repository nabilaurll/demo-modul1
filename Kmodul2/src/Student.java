import java.util.Scanner;

public class Student {
    String nama;
    String fakultas;
    String prodi;
    book[] borrowedBooks = new book[100];
    int borrowedCount = 0;

    public Student(String name, String faculty, String programStudi) {
        this.nama = name;
        this.fakultas = faculty;
        this.prodi = programStudi;
    }

    void displayBooks(book[] bookList, int bookCount) {
        for (int i = 0; i < bookCount; i++) {
            book book = bookList[i];
            System.out.println(book.id + ": " + book.judul+ " by " + book.penulis + ", stok: " + book.jumlah);
        }
    }
    void borrowBook(book[] bookList, int bookCount) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Masukkan ID buku yang ingin dipinjam: ");
            String id = scanner.nextLine();
            for (int i = 0; i < bookCount; i++) {
                book book = bookList[i];
                if (book.id.equals(id)) {
                    if (book.jumlah > 0) {
                        book.jumlah--;
                        borrowedBooks[borrowedCount++] = book;
                        System.out.println("Anda telah meminjam buku " + book.judul + ".");
                        return;
                    } else {
                        System.out.println("Maaf, buku ini sedang tidak tersedia.");
                        break;
                    }
                }
                if (i == bookCount - 1) {
                    System.out.println("Buku dengan ID tersebut tidak ditemukan.");
                }
            }
        }
    }

    void displayBorrowedBooks() {
        if (borrowedCount == 0) {
            System.out.println("Anda belum meminjam buku apapun.");
            return;
        }
        System.out.println("Buku yang Anda pinjam:");
        for (int i = 0; i < borrowedCount; i++) {
            book book = borrowedBooks[i];
            System.out.println(book.id + ": " + book.judul + " by " + book.penulis);
        }
    }

    void logout() {
        System.out.println("System logout....");
    }
}

