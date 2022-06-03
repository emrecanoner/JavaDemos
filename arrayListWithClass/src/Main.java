import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer emre = new Customer(1,"Emre","Can");
        customers.add(new Customer(2,"Can","Öner"));
        customers.add(new Customer(3,"Öner","Emre"));

        customers.remove(emre);
        for (Customer customer :customers){
            System.out.println(customer.firstName);
        }
    }
}
