/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.abstractfactory.absfac.laptop;

/**
 *
 * @author sanzid
 */
public class Dell implements Laptop{
    String Ram;
    String Processor;
    Dell(String Ram,String Processor){
        this.Ram = Ram;
        this.Processor = Processor;
    }

    @Override
    public String getLaptopConfigaration() {
        return "The Dell Laptop Processor : "+this.Processor+" Ram :"+this.Ram;
    }
}
