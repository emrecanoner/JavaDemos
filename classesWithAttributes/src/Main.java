public class Main {

    public static void main(String[] args) {
        Product product = new Product(3,"Laptop","ASUS",5000,3,"Siyah");
        Product product1 =new Product();
        product.setName("Laptop");
        product.setId(3);
        product.setDescription("ASUS");
        product.setPrice(5000);
        product.setStockAmount(3);

        ProductManager productManager =new ProductManager();
        productManager.add(product);
        System.out.println(product.getKod());
    }
}
