/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author josep
 */
public class TransporteTranvia extends Transporte{
    
    private String tranvia;
    
    public void establecerTranvia(String n){   
        tranvia = n;
    }
    
    @Override
    public void establecerTarifa() {
        tarifa = 1;
    }
    
    public String obtenerTranvia(){
    return tranvia;
    }
    
}
