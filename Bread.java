public class Bread {

    private String barcodeNumber;
    private double price;
    Breadx x;

    public Bread(String barcodeNumber, double price,
                 Type type,Yeast yeast,Sliced sliced) {
        this.barcodeNumber = barcodeNumber;
        this.price = price;
        this.x = new Breadx(type,yeast,sliced);
    }

    public String getbarcodeNumber() {
        return barcodeNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float newPrice) {
        this.price = newPrice;
    }

    public Breadx getx() {
        return x;
    }
}