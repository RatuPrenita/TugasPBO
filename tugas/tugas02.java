
package tugas1;

import java.util.Scanner;

public class tugas02 {
    public static void main(String[] args){
        float jari,keliling,luas;
        final float Pl=3.14f;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("jari =");
        jari = input.nextFloat();
                
        luas=Pl*jari*jari;
        keliling=2*Pl*jari;
        
        System.out.println("luas*keliling = "+luas+keliling);
    }
    
    
}
