package collections.shop;

import java.util.ArrayDeque;
import java.util.Deque;

public class Shop {
    private CashBox[] boxes;

    public Shop(int n) {
        boxes = new CashBox[n];
        for (int i = 0; i < n; i++) {
            boxes[i] = new CashBox();
        }
    }

    public void print() {
        for (int i = 0; i < boxes.length; i++) {
            System.out.println("#" + i + boxes[i]);
        }
        System.out.println("==============");
    }

    public CashBox getCashBox(int num) {
        return boxes[num];
    }

    public void setCashBoxState(int num, CashBox.State state) {
        boxes[num].setState(state);
    }

    public void addBuyer(Buyer buyer) {
        if (buyer == null) throw new NullPointerException();

        CashBox best = null;

        for (CashBox cb : boxes) {
            if (cb.inState(CashBox.State.ENABLED)) {
                if (best == null || cb.getQueue().size() < best.getQueue().size()) {
                    best = cb;
                }
            }
        }

        if (best != null) {
            best.addLast(buyer);
        }
    }

    public void tact() {

        for (CashBox cb : boxes) {
            if (!cb.getQueue().isEmpty()) {
                cb.serveBuyer();
            }
        }
        balance();
    }

    private void balance() {

        int total = 0;
        int enabledCount = 0;

        for (CashBox cb : boxes) {
            if (cb.inState(CashBox.State.ENABLED)) {
                total += cb.getQueue().size();
                enabledCount++;
            }
        }

        if (enabledCount == 0) return;

        int min = total / enabledCount;
        int max = (total % enabledCount == 0) ? min : min + 1;

        Deque<Buyer> defectors = new ArrayDeque<>();

        for (CashBox cb : boxes) {
            if (cb.inState(CashBox.State.ENABLED)) {

                while (cb.getQueue().size() > max) {
                    defectors.addLast(cb.removeLast());
                }
            }
        }

        for (CashBox cb : boxes) {
            if (cb.inState(CashBox.State.ENABLED)) {

                while (cb.getQueue().size() < min && !defectors.isEmpty()) {
                    cb.addLast(defectors.pollFirst());
                }
            }
        }
    }

    public static void main(String[] args) {

        Shop shop = new Shop(5);

        System.out.println("Initial state");
        shop.print();

        System.out.println("Enable cboxes 0, 2, 4");
        shop.setCashBoxState(0, CashBox.State.ENABLED);
        shop.setCashBoxState(2, CashBox.State.ENABLED);
        shop.setCashBoxState(4, CashBox.State.ENABLED);
        shop.print();

        System.out.println("Add 5 buyers");
        shop.addBuyer(new Buyer("A"));
        shop.addBuyer(new Buyer("B"));
        shop.addBuyer(new Buyer("C"));
        shop.addBuyer(new Buyer("D"));
        shop.addBuyer(new Buyer("E"));
        shop.print();

        System.out.println("Add 8 buyers");
        shop.addBuyer(new Buyer("F"));
        shop.addBuyer(new Buyer("G"));
        shop.addBuyer(new Buyer("H"));
        shop.addBuyer(new Buyer("I"));
        shop.addBuyer(new Buyer("J"));
        shop.addBuyer(new Buyer("K"));
        shop.addBuyer(new Buyer("L"));
        shop.addBuyer(new Buyer("M"));
        shop.print();

        System.out.println("Set cbox #2 is closing");
        shop.setCashBoxState(2, CashBox.State.IS_CLOSING);
        shop.print();

        System.out.println("Do 1 tact");
        shop.tact();
        shop.print();
    }
}
