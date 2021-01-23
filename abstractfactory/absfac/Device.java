/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.abstractfactory.absfac;

import com.mycompany.abstractfactory.absfac.laptop.Laptop;
import com.mycompany.abstractfactory.absfac.laptop.LaptopType;
import com.mycompany.abstractfactory.absfac.mobile.Mobile;
import com.mycompany.abstractfactory.absfac.mobile.MobileType;

/**
 *
 * @author sanzid
 */
public interface Device {
    Laptop getLaptop(LaptopType laptopType);
    Mobile getMobile(MobileType mobileType);
}
