/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.abstractfactory.absfac.mobile;

/**
 *
 * @author sanzid
 */
public class Samsung implements Mobile{
    String Ram;
    String Processor;
    String ScreenSize;
    Samsung(String Ram,String Processor, String ScreenSize){
        this.Ram = Ram;
        this.Processor = Processor;
        this.ScreenSize = ScreenSize;
    }
    
    
    @Override
    public String getMobileConfigatation() {
        return "The Samsung Phone Has Ram :"+this.Ram+" Processor :"+this.Processor+" Screen Size : "+this.ScreenSize;
    }
    
}
