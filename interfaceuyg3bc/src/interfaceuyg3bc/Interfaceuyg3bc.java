/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceuyg3bc;

interface Canli
{
    public void nefesAl();
}
interface Hayvan extends Canli 
{
    public void avlan();
}
interface Surungen extends Hayvan {
    public void surun();
}
//Yukarıda 3 adet arayüz tanımladık

//Tavşan Sınıfı
class Tavsan implements Hayvan {
    
    @Override
    public void nefesAl() {
        System.out.println("Nefes Alıyor");
    }

    @Override
    public void avlan() {
        System.out.println("Avlanıyor");
    }
}

//Timsah Sınıfı
class Timsah implements Surungen{

    @Override
    public void surun() {
        System.out.println("Sürünüyor..!");
    }

    @Override
    public void avlan() {
        System.out.println("Avlanıyor..!");
    }

    @Override
    public void nefesAl() {
        System.out.println("Nefes Alıyor..!");
    }
    
}


public class Interfaceuyg3bc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tavsan durum1 = new Tavsan();
        
        durum1.nefesAl();
        durum1.avlan();
           
        
    }
    
}
