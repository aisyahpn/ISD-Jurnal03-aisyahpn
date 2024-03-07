import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SinglyLinkedList buku = new SinglyLinkedList();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Buku di Awal");
            System.out.println("2. Tambah Buku di Akhir");
            System.out.println("3. Hapus Buku dari Awal");
            System.out.println("4. Hapus Buku dari Akhir");
            System.out.println("5. Cetak Daftar Buku");
            System.out.println("6. Keluar");
            System.out.print("Pilih operasi: ");
            int choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Judul Buku: ");
                    String judulBuku = s.nextLine();
                    System.out.print("Masukkan Penulis: ");
                    String penulis = s.nextLine();
                    System.out.print("Masukkan Tahun Terbit: ");
                    int tahunTerbit = s.nextInt();
                    s.nextLine();
                    buku.tambahDepan(new Buku(judulBuku, penulis, tahunTerbit));
                    break;
                case 2:
                    System.out.print("Masukkan Judul Buku: ");
                    judulBuku = s.nextLine();
                    System.out.print("Masukkan Penulis: ");
                    penulis = s.nextLine();
                    System.out.print("Masukkan Tahun Terbit: ");
                    tahunTerbit = s.nextInt();
                    s.nextLine();
                    buku.tambahBelakang(new Buku(judulBuku, penulis, tahunTerbit));
                    break;
                case 3:
                    buku.hapusDepan();
                    break;
                case 4:
                    buku.hapusBelakang();
                    break;
                case 5:
                    buku.printBuku();
                    break;
                case 6:
                    System.out.println("Terima Kasih!");
                    System.exit(0);
                default:
                System.out.println("Pilihan tidak tersedia!");
            }
        }
    }
}
