public class FabricMethod {
    public static void main(String[] args) {
        Product product;
        product = createProduct(1);
        product.doStuff();
        product = createProduct(2);
        product.doStuff();
    }
    static Product createProduct(int i) {
        if (i==1){
            return new Product1();
        } else if (i==2){
            return new Product2();
        } else {
            System.out.println("Такого продукта нет");
            return null;
        }
    }
}
