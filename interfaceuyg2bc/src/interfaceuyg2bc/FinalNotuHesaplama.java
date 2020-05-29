/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceuyg2bc;

/**
 *
 * @author burak
 */
public class FinalNotuHesaplama implements IDortIslem{

    @Override
    public void toplama() {
        System.out.println("Final notu toplandı");
    }
    @Override
    public void cikarma() {
        System.out.println("Final notu çıkartıldı");
    }
    @Override
    public void carpma() {
        System.out.println("Final notu çarpıldı");
    }
    @Override
    public void bolme() {
        System.out.println("Final notu bölündü");
    }
    
}
