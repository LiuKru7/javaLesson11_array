package example_3.package1;

public class Liudvikas {
    //Public -> kintamasis pasiekiamas visame projekte
    public String name = "Liudvikas";

    //Default/Package private -> kintamsis/ metodas yra matomas toje pacioje klaseje arba tame paciame package
    String nickname = "DarkDragon433";

    private  int pinCode = 1564;

    public void tellMysSecretPinCode () {
        System.out.println("my pin code is : " + pinCode);
    }







}
