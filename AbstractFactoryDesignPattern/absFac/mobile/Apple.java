package absFac.mobile;
public class Apple implements Mobile {
    private String ram;
    private String processor;
    public Apple(String ram,String processor){
        this.ram = ram;
        this.processor = processor;
    }
    @Override
    public  String getMobileConfigertion(){
        return "The Apple Mobile Processore is : "+processor+" and the ram is : "+ram;
    }
}
