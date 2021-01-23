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
public class MobileFactory {
    public Mobile getMobile(MobileType mobileType){
        switch(mobileType ){
            case Apple:
                return new Apple("3GB","Apple Bionic ","5.5");
            case Samsung:
                return new Samsung("8GB","Helio P65","5.5");
            case OnePlus:
                return new OnePlus("12GB","SnapDragon 820","6");
            default:
                return null;
        }
    }
}
