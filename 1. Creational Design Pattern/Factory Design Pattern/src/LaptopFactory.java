public class LaptopFactory {
    public static Laptop getLaptop(LaptopType laptopType){
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
}