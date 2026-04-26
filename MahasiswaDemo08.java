import java.util.Scanner;

public class MahasiswaDemo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StackTugasMahasiswa08 stack = new StackTugasMahasiswa08(5);

        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Jumlah Tugas");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine(); // biar input aman

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();

                    System.out.print("NIM: ");
                    String nim = sc.nextLine();

                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();

                    Mahasiswa08 mhs = new Mahasiswa08(nama, nim, kelas);
                    stack.push(mhs);

                    System.out.println("Tugas " + nama + " berhasil dikumpulkan.");
                    break;

                case 2:
                    Mahasiswa08 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.print("Masukkan nilai tugas: ");
                        int nilai = sc.nextInt();
                        dinilai.tugasDinilai(nilai);

                        System.out.println("Tugas milik " + dinilai.nama + 
                                           " telah dinilai dengan nilai " + dinilai.nilai);
                    }
                    break;

                case 3:
                    Mahasiswa08 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh: " + lihat.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas:");
                    stack.print();
                    break;

                case 5:
                    System.out.println("Jumlah tugas saat ini: " + stack.jumlahTugas());
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 0);

        sc.close();
    }
}