import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class LondonTest {

    Store store;

    @BeforeEach
    public void setUp() {
        store = Store.newInstance();
    }

    @Test
    public void Purchase_succeeds_when_enough_inventory()
    {

        Store storeMock = Mockito.spy(store);
        Mockito.when(storeMock.hasEnoughInventory(Product.Shampoo, 10)).thenReturn(true);

        Customer customer =  new Customer();

        boolean success = customer.purchase(storeMock ,Product.Shampoo, 10);

        Assert.assertTrue(success);
        Assert.assertEquals(-10,storeMock.getInventory(Product.Shampoo));
    }

    @Test
    public void Purchase_succeeds_when_not_enough_inventory()
    {

        Store storeMock = Mockito.spy(store);
        Mockito.when(storeMock.hasEnoughInventory(Product.Shampoo, 5)).thenReturn(false);

        Customer customer =  new Customer();

        boolean success = customer.purchase(storeMock ,Product.Shampoo, 10);

        Assert.assertFalse(success);
        Assert.assertEquals(-10,storeMock.getInventory(Product.Shampoo));

    }
}
