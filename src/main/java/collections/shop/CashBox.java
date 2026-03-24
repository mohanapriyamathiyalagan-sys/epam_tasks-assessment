package collections.shop;

import java.util.ArrayDeque;
import java.util.Deque;

public class CashBox {
    public enum State {
        ENABLED, IS_CLOSING, DISABLED
    }

    private Deque<Buyer> queue = new ArrayDeque<>();
    private State state;

    public CashBox() {
        state = State.DISABLED;
    }

    public Deque<Buyer> getQueue() {
        return new ArrayDeque<>(queue);
    }

    public Buyer serveBuyer() {
        if (queue.isEmpty()) return null;

        Buyer b = queue.pollFirst();

        if (queue.isEmpty() && state == State.IS_CLOSING) {
            state = State.DISABLED;
        }
        return b;
    }

    public boolean inState(State state) {
        return this.state == state;
    }

    public boolean notInState(State state) {
        return this.state != state;
    }

    public void addLast(Buyer buyer) {
        if (buyer == null) throw new NullPointerException();
        queue.addLast(buyer);
    }

    public Buyer removeLast() {
        if (queue.isEmpty()) return null;
        return queue.pollLast();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (state == State.ENABLED) sb.append("[+]");
        else if (state == State.IS_CLOSING) sb.append("[|]");
        else sb.append("[-]");

        sb.append(" ");

        for (Buyer b : queue) {
            sb.append(b);
        }

        return sb.toString();
    }
}
