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
public class Apple implements Mobile{
    String Ram;
    String Processor;
    String ScreenSize;
    Apple(String Ram,String Processor, String ScreenSize){
        this.Ram = Ram;
        this.Processor = Processor;
        this.ScreenSize = ScreenSize;
    }
    
    
    @Override
    public String getMobileConfigatation() {
        return "The Apple Phone Has Ram :"+this.Ram+" Processor :"+this.Processor+" Screen Size : "+this.ScreenSize;
    }
}