import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List breads;

    public Inventory() {
        breads = new LinkedList();
    }

    public void addBread(String barcodeNumber, double price,
                         Type type, Yeast yeast, Sliced sliced) {
        Bread bread = new Bread(barcodeNumber, price, type,yeast,sliced);
        breads.add(bread);
    }

    public Bread getBread(String barcodeNumber) {
        for (Iterator i = breads.iterator(); i.hasNext(); ) {
            Bread bread = (Bread) i.next();
            if (bread.getbarcodeNumber().equals(barcodeNumber)) {
                return bread;
            }
        }
        return null;
    }

    public List search(Breadx searchx) {
        List matchingBreads = new LinkedList();
        for (Iterator i = breads.iterator(); i.hasNext(); ) {
            Bread bread = (Bread)i.next();
            Breadx breadx = bread.getx();
            if (searchx.getSliced() != breadx.getSliced())
                continue;
            if (searchx.getType() != breadx.getType())
                continue;
            if (searchx.getYeast() != breadx.getYeast())
                continue;
            matchingBreads.add(bread);
        }
        return matchingBreads;
    }
}
