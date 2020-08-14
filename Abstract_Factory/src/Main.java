public class Main {
    public static void main(String[] args) {
        Factory factoryRed = new RedFactory();
        Factory factoryGreen = new GreenFactory();
        ShowALL(factoryGreen);
        ShowALL(factoryRed);
    }
    public static void ShowALL(Factory factory){
        factory.getRounde().showColor();
        factory.getCube().showColor();
    }
}
