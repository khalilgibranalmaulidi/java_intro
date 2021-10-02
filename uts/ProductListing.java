import product.Product;

public class ProductListing {
    public static void main(String[] args) {
        Product product_a = new Product ();
        product_a.setPrice(2000);
        product_a.setname("sabun");
        product_a.getProductListing(5, 15, 10);
        
    }
}