public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.get_instance();
        Singleton s2 = Singleton.get_instance();
        s1.set_data(25);
        System.out.println(s1.get_data());
        s2.set_data(75);
        System.out.println(s1.get_data());
        System.out.println(s1);
        System.out.println(s2);
    }
}
