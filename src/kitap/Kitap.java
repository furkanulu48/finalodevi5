
package kitap;


public class Kitap {
    public String isim, yazar;
    public int sayfano;
    
    Kitap(String isim, int sayfano, String yazar)
    {
        this.isim=isim;
        this.yazar=yazar;
        if(sayfano < 1) {
            this.sayfano=10;
        }
        else {
            this.sayfano=sayfano;
        }   
    }
    public int getsayfano()
    {
    return this.sayfano;
    }
    
    public void setsayfano(int size) 
    {
        if(size<1) {
            System.out.println("Sayfa sayısı negatif olamaz");
            this.sayfano=10; 
        }
        else
        {
            this.sayfano=size;
        }
    
    
    }
    public String getIsım() 
    {
        return this.isim;
    }
    
    
    public void setName(String isim) 
    {
        this.isim=isim;
       
    }
    public void setyazar(String yazar) 
    {
        this.yazar=yazar;
       
    }
    public String getyazar() 
    {
        return this.yazar;
    }
    
}
