public class TestStore {

    public static void main(String[] args) {
        Store store = Store.getInstance();
        Customer customer = new Customer();

        //Adding some shampoos to inventory
        store.addInventory(Product.Shampoo, 2);
        //Customer buying three shampoos
        customer.purchase( store,Product.Shampoo, 3);
        //Total quantity of shampoos after sell
        System.out.println(store.getInventory(Product.Shampoo));
    }
}
