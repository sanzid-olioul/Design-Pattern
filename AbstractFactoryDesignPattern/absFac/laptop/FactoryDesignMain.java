package absFac.laptop;
public class FactoryDesignMain{
    public static void main(String[] args) {
        Laptop dell = LaptopFactory.getLaptop(LaptopType.Dell);
        Laptop mack = LaptopFactory.getLaptop(LaptopType.Mack);
        Laptop hp = LaptopFactory.getLaptop(LaptopType.HP);

        System.out.println(dell.getLaptopConfigertion());
        System.out.println(mack.getLaptopConfigertion());
        System.out.println(hp.getLaptopConfigertion());
    }
}