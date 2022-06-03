import javax.xml.crypto.Data;

public class Main {

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product =new Product();
        product.name="monitor";
        product.price=500;
        manager.add(product);

        //tercih edilmeyen ve önerilmeyen kullanım
        DatabaseHelper.Crud.delete();
        DatabaseHelper.Connection.createConnection();
    }
}
