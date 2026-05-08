public class Main {

    public static void main(String[] args) {
        // Your code goes here
        Marker marker = new Marker(1, "blue", 10);
        Invoice invoice = new Invoice(marker, 2);
        Dao dao = new DaoDb();
        dao.save(invoice);
    }
}
