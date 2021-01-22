package absFac;
import absFac.laptop.LaptopType;
public class DeviceFactory implements Device{
    
    public Laptop getLaptop(Laptop laptopType){
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
    public Mobile getMobile(Mobile deviceType){
        return null;
    }
}
