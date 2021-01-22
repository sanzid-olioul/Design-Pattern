package absFac;
import absFac.mobile.MobileType;
import absFac.laptop.Laptop;
import absFac.mobile.Mobile;
public class AbstractMobileFactory implements Device {
    public Laptop getLaptop(Laptop laptopType){
        return null;
    }
    public Mobile getMobile(DeviceType deviceType){
        switch(mobileType){
            case Samsung:
                return new Samsung("8 GB", "Qualcomm Snapdragon 865 ");
            case Nokia:
                return new Nokia("4 GB", "Helio P65");
            case Apple:
                return new Apple("3 GB", "Apple A13 Bionic");
            default:
                return null;
        }
    }
}
