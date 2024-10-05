package example_3.package1;

public class Paskaita {
    public static void main(String[] args) {
        Liudvikas liudvikas = new Liudvikas();
        System.out.println(liudvikas.name);
        System.out.println(liudvikas.nickname);
//        System.out.println(liudvikas.pinCode) ; Private can not be accessed
        liudvikas.tellMysSecretPinCode();
    }


}
