
package Pertemuan2;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        sepeda Sep = new sepeda();
        Sep.melaju = 10;
        Sep.mundur = 5;
        Sep.jarak = 0;
        Sep.merek = "Polygon";
        int pil;
        
        do{
            System.out.println("\nMenu :");
            System.out.println("Bergerak Maju(1)");
            System.out.println("Bergerak Mundur(2)");
            System.out.println("Berhenti(3)");
            
            System.out.print("Pilih : ");
            pil = input.nextInt();
            
            if(pil == 1){
                Sep.jarak+=10;
                Sep.Melaju();
            }
            else if(pil == 2){
                Sep.jarak+=5;
                Sep.Mundur();
            }
            else if(pil == 3){
                Sep.Henti();
            }
            else if(pil == 0){
                Sep.keluar();
            }else{
                System.out.println("Tidak valid");
            }
        }while(pil != 0);       
    }
}
