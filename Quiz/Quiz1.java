
package Quiz;

import java.util.Scanner;

public class Quiz1 {
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         
         System.out.println("=============================");
         System.out.println("  SISTEM PENGOLAHAN NILAI    ");
         System.out.println("=============================");
         
         System.out.print("Masukan jumlah mahasiswa : ");
         int jum = input.nextInt();
         input.nextLine();
         
         String[] npm = new String[jum];
         String[] nama = new String[jum];
         float[] NTugas = new float[jum];
         float[] NUts = new float[jum];
         float[] NUas = new float[jum];
         float[] Nakhir = new float[jum];
         char[] huruf = new char[jum];
         String[] status = new String[jum];
         
         for(int i=0; i<jum; i++){   
             System.out.println("Data Mahasiswa ke-"+(i+1));
             System.out.println("-------------------------");
             
             System.out.print("NPM         :");
             npm[i] = input.nextLine();
             
             System.out.print("Nama        :");
             nama [i]= input.nextLine();
             do{
                 System.out.print("Nilai Tugas :");
                 NTugas[i] = input.nextFloat();
                 if(NTugas[i]<0 || NTugas[i]>100){
                     System.out.println("Nilai Tidak Valid");
                 }
             }while(NTugas[i]<0 || NTugas[i]>100);
             
             do{
                 System.out.print("Nilai UTS :");
                 NUts[i] = input.nextFloat();
                 if(NUts[i]<0 || NUts[i]>100){
                     System.out.println("Nilai Tidak Valid");
                 }
             }while(NUts[i]<0 || NUts[i]>100);
             
             do{
                 System.out.print("Nilai UAS :");
                 NUas[i] = input.nextFloat();
                 if(NUas[i]<0 || NUas[i]>100){
                     System.out.println("Nilai Tidak Valid");
                 }
             }while(NUas[i]<0 || NUas[i]>100);
             
             input.nextLine();
            
             Nakhir[i] = akhir(NTugas[i], NUts[i], NUas[i]);
             
         if (Nakhir[i] >= 80){
             huruf[i] = 'A';
             status[i] = "LULUS";
         }else if (Nakhir[i] >= 70){
             huruf[i] = 'B';
             status[i] = "LULUS";
         }else if (Nakhir[i] >= 60){
             huruf[i] = 'C';
             status[i] = "LULUS";
         }else if (Nakhir[i] >= 50){
             huruf[i] = 'D';
             status[i] = "TIDAK LULUS";
         }else{
             huruf[i] = 'E';
             status[i] = "TIDAK LULUS";
         }
       }
    
        
         System.out.println("===================================================================");
         System.out.println("                     DAFTAR NILAI MAHASISWA                        ");
         System.out.println("===================================================================");
         System.out.printf("%-4s %-12s %-10s %-7s %-5s %-5s %-7s %-7s %-10s",
                           "NO", "NPM", "Nama", "Tugas", "UTS", "UAS", "Akhir", "Huruf", "Status");
         System.out.println(" ");
         
         int jLulus = 0;
         int jTdkLulus = 0;
         float totN = 0;
         float maxN = Nakhir[0];
         float minN = Nakhir[0];
        
         for (int i=0; i<jum; i++){
         System.out.printf("%-4d %-12s %-10s %-7.0f %-5.0f %-5.0f %-7.1f %-7c %-10s\n",
                 (i+1), npm[i], nama[i], NTugas[i], NUts[i], NUas[i], Nakhir[i], huruf[i], status[i]);
         
         totN += Nakhir[i];
         if (status [i].equals("LULUS")){
             jLulus++;
         }else{
             jTdkLulus++;
         }
         if (Nakhir[i] > maxN) maxN = Nakhir[i];
         if(Nakhir[i] < minN) minN = Nakhir[i];
     }
         float rataRata = totN /jum;
         
         System.out.println("==================================================================");
         System.out.println("\n STATISTIK NILAI");
         System.out.println("==================================================================");
         System.out.println("Jumlah Mahasiswa  : "+jum);
         System.out.println("Jumlah Mahasiswa  : "+jLulus);
         System.out.println("Jumlah Tidak Lulus : "+ jTdkLulus);
         System.out.println("Nilai Tertinggi : "+ maxN);
         System.out.println("Nilai Terendah  : "+ minN);
         System.out.println("Rata-Rata kelas :"+rataRata);
         
         input.close();
     }
    static float akhir(float tugas, float uts, float uas){
        return (tugas * 0.3f) + (uts * 0.3f) + (uas * 0.4f);
    }
}