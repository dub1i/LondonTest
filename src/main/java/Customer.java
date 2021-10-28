public class Customer {

    public boolean purchase(Store store,Product product, int quantity) {

        if (store.hasEnoughInventory(product, quantity)) {
            product.setQuantity(product.getQuantity() - quantity);
            return true;
        }
        return false;
    }
}
