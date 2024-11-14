public class User {

public static void main(String[] args) throws Exception{
    
    SmartTV SmartTV = new SmartTV ();

    SmartTV.diminuirVolume();
    SmartTV.diminuirVolume();
    SmartTV.diminuirVolume();
    SmartTV.aumentarVolume();
    
   
    System.out.println("Canal Atual: " +SmartTV.canal);
    
    SmartTV.mudarCanal(13);
    
    System.out.println("Canal Atual: " +SmartTV.canal);
    
    System.out.println("Volume Atual :" +SmartTV.volume);
    
    
    System.out.println("TV ligada ? " + SmartTV.ligada);
    System.out.println("Canal Atual : " +SmartTV.canal);
    System.out.println("Volume Atual : " +SmartTV.volume);
   

    SmartTV.ligar ();
    System.out.println("Novo status -> TV Ligada ? " + SmartTV.ligada);

    SmartTV.desligar ();
    System.out.println("Novo status -> TV Ligada ? " + SmartTV.ligada);







    }
}