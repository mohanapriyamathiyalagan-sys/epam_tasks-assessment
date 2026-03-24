package collections.parcel_management;

import java.util.*;

public class NewPostOfficeManageImpl implements NewPostOfficeManage{
    private List<ParcelBox> boxes;

    public NewPostOfficeManageImpl(List<ParcelBox> boxes) {
        this.boxes = boxes;
    }

    public Optional<ParcelBox> getBoxById(int id) {

        List<ParcelBox> sorted = new ArrayList<ParcelBox>(boxes);

        Collections.sort(sorted, new Comparator<ParcelBox>() {
            public int compare(ParcelBox b1, ParcelBox b2) {
                return b1.getId() - b2.getId();
            }
        });

        for (ParcelBox b : sorted) {
            if (b.getId() == id) {
                return Optional.of(b);
            }
        }

        return Optional.empty();
    }

    public String getDescSortedBoxesByWeight() {

        List<ParcelBox> sorted = new ArrayList<ParcelBox>(boxes);

        Collections.sort(sorted, new Comparator<ParcelBox>() {
            public int compare(ParcelBox b1, ParcelBox b2) {
                return Double.compare(b2.getWeight(), b1.getWeight());
            }
        });

        String result = "";

        for (ParcelBox b : sorted) {
            result += b.toString() + "\n";
        }

        return result;
    }

    public String getAscSortedBoxesByCost() {

        List<ParcelBox> sorted = new ArrayList<ParcelBox>(boxes);

        Collections.sort(sorted, new Comparator<ParcelBox>() {
            public int compare(ParcelBox b1, ParcelBox b2) {
                return Double.compare(b1.getCost(), b2.getCost());
            }
        });

        String result = "";

        for (ParcelBox b : sorted) {
            result += b.toString() + "\n";
        }

        return result;
    }

    // 4. Get boxes by recipient
    public List<ParcelBox> getBoxesByRecipient(String recipient) {

        if (recipient == null) {
            throw new NullPointerException();
        }

        List<ParcelBox> sorted = new ArrayList<ParcelBox>(boxes);

        Collections.sort(sorted, new Comparator<ParcelBox>() {
            public int compare(ParcelBox b1, ParcelBox b2) {
                return b1.getRecipient().compareTo(b2.getRecipient());
            }
        });

        List<ParcelBox> result = new ArrayList<ParcelBox>();

        for (ParcelBox b : sorted) {
            if (recipient.equals(b.getRecipient())) {
                result.add(b);
            }
        }

        return result;
    }
}
