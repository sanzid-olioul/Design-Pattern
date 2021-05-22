public class FactoryDesignMain{
    public static void main(String[] args) {
        Laptop dell = LaptopFactory.getLaptop(LaptopType.Dell);
        Laptop mack = LaptopFactory.getLaptop(LaptopType.Mack);
        Laptop hp = LaptopFactory.getLaptop(LaptopType.HP);

        System.out.println(dell.getConfigertion());
        System.out.println(mack.getConfigertion());
        System.out.println(hp.getConfigertion());
    }
}