package collections.newpost_storage_service;

import java.math.BigDecimal;

public class Box {
    private String sender;
    private String recipient;
    private double weight;
    private double volume;
    private BigDecimal cost;
    private String city;
    private int office;

    public Box(String sender, String recipient, double weight, double volume,
               BigDecimal cost, String city, int office) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
        this.volume = volume;
        this.cost = cost;
        this.city = city;
        this.office = office;
    }

    public String getSender() { return sender; }
    public String getRecipient() { return recipient; }
    public double getWeight() { return weight; }
    public double getVolume() { return volume; }
    public BigDecimal getCost() { return cost; }
    public String getCity() { return city; }
    public int getOffice() { return office; }

    public void setOffice(int office) { this.office = office; }

    @Override
    public String toString() {
        return sender + " -> " + recipient + " | " + weight + "kg | " + cost;
    }
}
