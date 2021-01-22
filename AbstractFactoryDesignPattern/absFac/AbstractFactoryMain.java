package absFac;
import absFac.laptop.Laptop;
import absFac.laptop.LaptopFactory;
import absFac.laptop.LaptopType;
import absFac.mobile.Mobile;
import absFac.mobile.MobileFactory;
import absFac.mobile.MobileType;
public class AbstractFactoryMain {
    public static void main(String[] args) {
        Laptop dell = new AbstractLaptopFactory().getLaptop(LaptopType.Dell);

        System.out.println(dell.getLaptopConfigertion());

        /*
        Laptop dell = LaptopFactory.getLaptop(LaptopType.Dell);
        Laptop mack = LaptopFactory.getLaptop(LaptopType.Mack);
        Laptop hp = LaptopFactory.getLaptop(LaptopType.HP);

        Mobile samsung = MobileFactory.getMobile(MobileType.Samsung);

        System.out.println(dell.getConfigertion());
        System.out.println(mack.getConfigertion());
        System.out.println(hp.getConfigertion());
        System.out.println(samsung.getConfigertion());
        */
    }
}
