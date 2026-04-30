public class InvoiceCalculator {
    private Marker marker;
    private int quantity;

    public InvoiceCalculator(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateCost() {
        return this.marker.cost * this.quantity;
    }

}