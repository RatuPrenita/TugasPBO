package pertemuan6;

public class LuasLingkaran extends BangunDatar{
    float r;
    
    public LuasLingkaran(float r){
        this.r = r;
    }
    
    public void luas(){
        System.out.println("Luas Lingkaran : " + (3.14 * r * r));
    }
    
    public void keliling(){
        System.out.println("Keliling Lingkaran : " + (2 * 3.14 * r));
    }
}