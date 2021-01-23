/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.abstractfactory.absfac;

import com.mycompany.abstractfactory.absfac.laptop.Laptop;
import com.mycompany.abstractfactory.absfac.laptop.LaptopFactory;
import com.mycompany.abstractfactory.absfac.laptop.LaptopType;
import com.mycompany.abstractfactory.absfac.mobile.Mobile;
import com.mycompany.abstractfactory.absfac.mobile.MobileFactory;
import com.mycompany.abstractfactory.absfac.mobile.MobileType;

/**
 *
 * @author sanzid
 */
public class DeviceFactory {
    public static Device getDevice(DeviceType deviceType){
        switch(deviceType){
            case Mobile:
                return new MobileSelector();
            case Laptop:
                return new LaptopSelector();
            default:
                return null;
        }
    }
    
    
}
class LaptopSelector implements Device{

    @Override
    public Laptop getLaptop(LaptopType laptopType) {
        return LaptopFactory.getLaptop(laptopType);
    }

    @Override
    public Mobile getMobile(MobileType mobileType) {
        return null;
    }
    
}
class MobileSelector implements Device{

    @Override
    public Laptop getLaptop(LaptopType laptopType) {
        return null;
    }

    @Override
    public Mobile getMobile(MobileType mobileType) {
        return new MobileFactory().getMobile(mobileType);
    }
    
}