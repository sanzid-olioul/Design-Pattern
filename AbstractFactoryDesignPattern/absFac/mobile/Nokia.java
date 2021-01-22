package absFac.mobile;
public class Nokia implements Mobile {
    private String ram;
    private String processor;
    public Nokia(String ram,String processor){
        this.ram = ram;
        this.processor = processor;
    }
    @Override
    public  String getMobileConfigertion(){
        return "The Nokia Mobile Processore is : "+processor+" and the ram is : "+ram;
    }
}
