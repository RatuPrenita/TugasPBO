
package tugas1;

import java.util.Scanner;

public class tugas002 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int jam,menit,detik,totdet;
        
        System.out.print("jam = ");
        jam=input.nextInt();
        
        System.out.print("Menit = ");
        menit=input.nextInt();
        
        System.out.print("Detik = ");
        detik=input.nextInt();
        
        totdet=jam*3600+menit*60+detik;
        
        System.out.println("total detik = "+totdet);
    }
}
