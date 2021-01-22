package absFac.laptop;
public class Dell implements Laptop {
    private String ram;
    private String processor;
    public Dell(String ram,String processor){
        this.ram = ram;
        this.processor = processor;
    }
    @Override
    public  String getLaptopConfigertion(){
        return "The Dell Laptop Processore is : "+processor+" and the ram is : "+ram;
    }
}
