package absFac.mobile;
public class MobileFactory {
    public static Mobile getMobile(MobileType mobileType){
        switch(mobileType){
            case Samsung:
                return new Samsung("8 GB", "Qualcomm Snapdragon 865 ");
            case Nokia:
                return new Nokia("4 GB", "Helio P65");
            case Apple:
                return new Apple("3 GB", "Apple A13 Bionic");
            default:
                return null;
        }
    }
}