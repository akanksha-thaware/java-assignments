package singleresponsibility.good;
// responsibility of this class is to only calculate total.
public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        int totalPrice = ((marker.price) * this.quantity);
        return totalPrice;
    }
}
