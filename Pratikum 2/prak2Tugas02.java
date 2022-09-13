import java.util.Scanner;

public class prak2Tugas02 {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
         
        int nilai;
        String nama;
        String nim;
        String MK;

        System.out.println("======Menghitung Nilai mahasiswa=====");
        
        System.out.print("Masukkan nama mahasiswa: ");
        nama = input.next();

        System.out.print("Masukkan nim mahasiswa: ");
        nim = input.next();

        System.out.print("Masukkan nama mata kuliah (MK): ");
        MK = input.next();

        System.out.print("Masukkan nilai rata rata: ") ;
        nilai = input.nextInt();

        if (nilai >= 87){
            System.out.println("Nilainya adalah: 4.00 grade A");
        }
        else if(nilai < 87 && nilai >= 78){
            System.out.println("Nilainya adalah : 3.50 grade AB");
        }
        else if(nilai < 78 && nilai >= 69){
            System.out.println("Nilainya adalah : 3.00 grade B");
        }
        else if(nilai < 69 && nilai >= 60){
            System.out.println("Nilainya adalah : 2.50 grade BC");
        }
        else if(nilai < 60 && nilai >= 51){
            System.out.println("Nilainya adalah: 2.00 grade C");
        }
        else if(nilai < 51 && nilai >= 41){
            System.out.println("Nilainya adalah: 1.00 grade D");
        }
        else {
            System.out.println("Nilainya adalah: 0.00 grade E");
        }
    }
}
