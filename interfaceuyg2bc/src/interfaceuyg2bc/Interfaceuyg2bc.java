/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceuyg2bc;

class VizeFinalHesapla
{
    public void toplama(IDortIslem islem)
    {
        islem.toplama();
    }
    public void cikarma(IDortIslem islem)
    {
        islem.cikarma();
    }
    public void carpma(IDortIslem islem)
    {
        islem.carpma();
    }
    public void bolme(IDortIslem islem)
    {
        islem.bolme();
    }
}
public class Interfaceuyg2bc {

    
    public static void main(String[] args) {
        
        VizeFinalHesapla hesapla = new VizeFinalHesapla();
        
        hesapla.toplama(new VizeNotuHesaplama());
        hesapla.toplama(new FinalNotuHesaplama());
    }
    
}
