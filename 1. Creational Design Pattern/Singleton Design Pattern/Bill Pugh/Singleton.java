public class Singleton{
    private int data;
    private Singleton(){};
    private static class SingletonHelper{
        private static final Singleton instance = new Singleton();
    }
    public static Singleton get_instance(){
        return SingletonHelper.instance;
    }
    public void set_data(int data){
        this.data = data;
    }
    public int get_data(){
        return this.data;
    }
}