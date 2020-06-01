
package kitap;


public class main {
    
  public static void main(String[]args) 
  {
      Kitap k1= new Kitap("Sefiller", 100, "Victor Hugo");
      k1.setsayfano(200);
      k1.setName("Sefiller");
      k1.setyazar("Victor Hugo");
      System.out.println(k1.getIsım());
      System.out.println(k1.getsayfano());
      System.out.println(k1.getyazar());
      
     
  
  
  }  
    
    
    
}
