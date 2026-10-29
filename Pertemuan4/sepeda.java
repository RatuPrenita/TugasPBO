
package Pertemuan2;
public class sepeda {
    
        int jarak=0;
        int melaju;
        int mundur;
        String merek;
        int pilihan;
        
       void Melaju(){
           System.out.println("Bergerak maju " + melaju +"km");
           System.out.println("Obejct sepeda "+merek+",Jarak tempuh "+jarak+" km");
       }
       void Mundur(){
           System.out.println("Bergerak mundur "+mundur+" km");
           System.out.println("Obejct Sepeda "+merek+",jarak tempuh "+jarak+ " km"); 
       }
       void Henti(){
           System.out.println("Sepeda berhenti");
           System.out.println("Objek Sepeda "+merek+", jarak tempuh"+jarak+" km");
       }
        
       void keluar(){
           System.out.println("Keluar program..");
           System.out.println("Terima kasih sudah menggunakan program ini.");
       }
    }
