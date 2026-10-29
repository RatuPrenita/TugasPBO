
package tugas1;
import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int tahun;
   
                
        System.out.print("Masukan Tahun (1909-2024) : ");
        tahun = input.nextInt();
        
        if((tahun%4 == 0 && tahun%100 !=0) || (tahun%400 == 0)){
            System.out.println("adalah tahun kabisat");
        }else{
            System.out.println("bukan tahun kabisat");
        }
       
    
        
    }
}
