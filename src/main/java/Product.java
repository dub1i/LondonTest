enum Product {
    Shampoo(0),
    Book(0);

    int quantity;

    Product(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
