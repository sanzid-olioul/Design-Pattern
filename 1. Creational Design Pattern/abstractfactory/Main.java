/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.abstractfactory;

import com.mycompany.abstractfactory.absfac.Device;
import com.mycompany.abstractfactory.absfac.DeviceFactory;
import com.mycompany.abstractfactory.absfac.DeviceType;
import com.mycompany.abstractfactory.absfac.laptop.LaptopType;
import com.mycompany.abstractfactory.absfac.mobile.MobileType;

/**
 *
 * @author sanzid
 */

public class Main {
    public static void main(String[] args) {
          
       // Laptop hp = LaptopFactory.getLaptop(LaptopType.HP);
       Device laptop = DeviceFactory.getDevice(DeviceType.Laptop);
       Device mobile = DeviceFactory.getDevice(DeviceType.Mobile);
       System.out.println(laptop.getLaptop(LaptopType.Dell).getLaptopConfigaration());
       System.out.println(mobile.getMobile(MobileType.OnePlus).getMobileConfigatation());
       
       
       
       System.out.println(laptop.getLaptop(LaptopType.Mack).getLaptopConfigaration());
       System.out.println(mobile.getMobile(MobileType.Apple).getMobileConfigatation());
       
       
       
       
       System.out.println(laptop.getLaptop(LaptopType.HP).getLaptopConfigaration());
       System.out.println(mobile.getMobile(MobileType.Samsung).getMobileConfigatation());
    }
}
