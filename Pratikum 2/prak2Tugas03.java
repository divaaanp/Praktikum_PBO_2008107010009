public class prak2Tugas03 {
    public static void main(String[] args) {

        System.out.println("Mencetak segitiga bintang terbalik");
        System.out.print("======================================");
       
        for (int p = 0; p <=5; p++){
            System.out.println();
      
            for (int m = 5; m > p; m--) {
                System.out.print("*");
                
            }
        }
    }
}
