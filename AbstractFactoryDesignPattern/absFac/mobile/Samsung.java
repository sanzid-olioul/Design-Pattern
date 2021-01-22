package absFac.mobile;
public class Samsung implements Mobile {
    private String ram;
    private String processor;
    public Samsung(String ram,String processor){
        this.ram = ram;
        this.processor = processor;
    }
    @Override
    public  String getMobileConfigertion(){
        return "The Samsung Mobile Processore is : "+processor+" and the ram is : "+ram;
    }
}
