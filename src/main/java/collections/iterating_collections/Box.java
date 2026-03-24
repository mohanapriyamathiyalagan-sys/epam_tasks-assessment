package collections.iterating_collections;

import java.math.BigDecimal;

public class Box {
    private String sender;
    private String recipient;
    private Double volume;
    private Double weight;
    private int value;
    private BigDecimal cost;

    public Box(String sender, String recipient, Double volume, Double weight, int value, BigDecimal cost) {
        this.sender = sender;
        this.recipient = recipient;
        this.volume = volume;
        this.weight = weight;
        this.value = value;
        this.cost = cost;
    }

    public String getRecipient() {
        return recipient;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Box{" +
                "sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", cost=" + cost +
                '}';
    }
}
