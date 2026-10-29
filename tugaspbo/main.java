
package tugaspboper1;


public class main {
    public static void main(String[] args) {
        Unsur unsur = new Unsur();
        SukaBelajar suka = new SukaBelajar();
        Informatika infor = new Informatika();
        
        unsur.universitas ="Suryakancana";
        unsur.kota = "Cianjur";
        unsur.fakultas="Teknik";
        unsur.jurusan = "Informatika";
        
        infor.nama="Ratu";
        
       suka.saya();
        System.out.println("");
       unsur.kampus();
        System.out.println("");
       infor.aku();
       
       
    }
    
}
