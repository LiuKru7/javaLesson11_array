package example_3.package2;

import example_3.package1.Liudvikas;

public class KitaPaskaita {
    public static void main(String[] args) {
        Liudvikas liudvikas = new Liudvikas();
        System.out.println(liudvikas.name);
//        System.out.println(liudvikas.nickname); default negalima pasiekti kitame package
//        System.out.println(liudvikas.pinCode) ; Private can not be accessed
    }

}
