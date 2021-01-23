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
public class LaptopFactory {
    public static Laptop getLaptop(LaptopType laptopType){
        switch(laptopType){
            case HP:
                return new HP("8GB","Intel Core i5");
            case Dell:
                return new Dell("4GB","Intel Core i5");
            case Mack:
                return new Mack("12GB","Intel Core i5");
            default:
                return null;
        }
    }
}
