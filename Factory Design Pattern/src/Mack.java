public class Mack implements Laptop {
    private String ram;
    private String processor;
    public Mack(String ram,String processor){
        this.ram = ram;
        this.processor = processor;
    }
    @Override
    public  String getConfigertion(){
        return "The Mack Laptop Processore is : "+processor+" and the ram is : "+ram;
    }
}
