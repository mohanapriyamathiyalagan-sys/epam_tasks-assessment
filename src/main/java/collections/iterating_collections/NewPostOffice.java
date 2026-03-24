package collections.iterating_collections;

import org.checkerframework.checker.units.qual.A;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class NewPostOffice {

    List<Box> boxes = new ArrayList<>();

    public static BigDecimal calculateCost(double weight, double volume, int value) {
        double cost = weight * 10 + volume * 100 + value * 0.01;
        return BigDecimal.valueOf(cost);
    }

    public Collection<Box> deliveredToRecipient(String recipient) {
        List<Box> delivered = new ArrayList<>();
        Iterator<Box> it = boxes.iterator();

        while (it.hasNext()) {
            Box box = it.next();
            if (box.getRecipient().equals(recipient)) {
                delivered.add(box);
                it.remove();
            }
        }
        return delivered;
    }

    public void declineCostOfBox(double percent) {
        Iterator<Box> it = boxes.iterator();
        while (it.hasNext()) {
            Box box = it.next();
            BigDecimal newCost = box.getCost().multiply(BigDecimal.valueOf(1 - percent / 100));
            box.setCost(newCost);
        }
    }
        public List<Box> getListBox() {
            return boxes;
        }
    public boolean addBox(String sender, String recipient, double weight, double volume, int value
                          ){

        if(sender==null ||recipient ==null){
            throw new IllegalArgumentException();
        }
        if(weight <0.5 || weight>20){
            throw new IllegalArgumentException();

        }
        if(volume<=0 || volume>=0.25){
            throw new IllegalArgumentException();
        }
        if(value<=0){
            throw new IllegalArgumentException();

        }
        BigDecimal cost1 = calculateCost(weight, volume, value);
        Box box = new Box(sender, recipient, weight, volume, value, cost1);
        boxes.add(box);
        return true;
    }
}


