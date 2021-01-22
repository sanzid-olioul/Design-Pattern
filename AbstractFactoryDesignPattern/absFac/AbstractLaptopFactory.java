package absFac;
import absFac.laptop.LaptopType;
import absFac.laptop.Laptop;
import absFac.mobile.Mobile;
import absFac.mobile.MobileType;
import absFac.laptop.Dell;
import absFac.laptop.HP;
import absFac.laptop.Mack;
public class AbstractLaptopFactory implements Device{
    @Override
    public Laptop getLaptop(LaptopType laptopType){
        switch(laptopType){
            case Dell:
                return new Dell("4 GB", "Intel Core i 7");
            case HP:
                return new HP("8 GB", "Intel Core i 7");
            case Mack:
                return new Mack("16 GB", "Intel Core i 5");
            default:
                return null;
        }
    }
    @Override
    public Mobile getMobile(MobileType mobileType){
        return null;
    }
}
