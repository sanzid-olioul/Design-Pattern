public class HP implements Laptop {
    private String ram;
    private String processor;
    public HP(String ram,String processor){
        this.ram = ram;
        this.processor = processor;
    }
    @Override
    public  String getConfigertion(){
        return "The HP Laptop Processore is : "+processor+" and the ram is : "+ram;
    }
}
