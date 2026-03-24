package collections.parcel_management;

public class ParcelBox {
    private static int counter = 0;

    private int id;
    private String sender;
    private String recipient;
    private double weight;
    private double volume;
    private double cost;
    private String city;
    private String office;

    public ParcelBox(String sender, String recipient, double weight, double volume,
               double cost, String city, String office) {

        this.id = ++counter;
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
        this.volume = volume;
        this.cost = cost;
        this.city = city;
        this.office = office;
    }

    public int getId() {
        return id;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public double getWeight() {
        return weight;
    }

    public double getVolume() {
        return volume;
    }

    public double getCost() {
        return cost;
    }

    public String getCity() {
        return city;
    }

    public String getOffice() {
        return office;
    }

    @Override
    public String toString() {
        return "Box{id=" + id + ", sender='" + sender + "', recipient='" + recipient +
                "', weight=" + weight + ", cost=" + cost + "}";
    }
}
