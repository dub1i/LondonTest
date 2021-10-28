import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StoreTest {

    Store store;

    @BeforeEach
    public void setUp() {
        store = Store.newInstance();
    }


    @Test
    public void Purchase_succeeds_when_enough_inventory() {
        store.addInventory(Product.Shampoo, 10);
        var customer = new Customer();

        boolean success = customer.purchase(store,Product.Shampoo,5);

        Assert.assertTrue(success);
        Assert.assertEquals(5, store.getInventory(Product.Shampoo));
    }
    @Test
    public void Purchase_succeeds_when_not_enough_inventory() {

        store.addInventory(Product.Shampoo, 10);
        var customer = new Customer();

        boolean success = customer.purchase(store,Product.Shampoo,11);

        Assert.assertFalse(success);
        Assert.assertEquals(10, store.getInventory(Product.Shampoo));


    }



}
