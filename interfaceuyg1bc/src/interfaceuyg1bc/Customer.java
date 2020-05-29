/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceuyg1bc;

/**
 *
 * @author burak
 */
public class Customer implements IDatabase {

    @Override
    public void log() {
        System.out.println("Müşteri Eklendi...!");
    }
    
}
