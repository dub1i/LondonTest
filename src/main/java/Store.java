public class Store  {

    private static volatile Store instance;

    public static Store getInstance() {
        Store localInstance = instance;
        if (localInstance == null) {
            synchronized (Store.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Store();
                }
            }
        }
        return localInstance;
    }

    public static Store newInstance() {
        return new Store();
    }



    private Store() {
    }


    public void addInventory(Product product, int quantity) {
        product.setQuantity(quantity);

    }



    public int getInventory(Product product) {
        return product.getQuantity();
    }

    public boolean hasEnoughInventory(Product product, int quantity) {
        return product.getQuantity() >= quantity;

    }

}
