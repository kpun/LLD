public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateCost() {
        return this.marker.cost*this.quantity;
    }

    //print invoice
    public void printInvoice(){

    }

    //save to db

    public void saveToDb() {

    }

}