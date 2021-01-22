package absFac;
import absFac.mobile.Mobile;
import absFac.laptop.LaptopType;
import absFac.mobile.MobileType;
import absFac.laptop.Laptop;
public interface Device{
    Laptop getLaptop(LaptopType laptopType);
    Mobile getMobile(MobileType mobileType);
}
