package collections.parcel_management;

import java.util.List;
import java.util.Optional;

public interface NewPostOfficeManage {

    Optional<ParcelBox> getBoxById(int id);

    String getDescSortedBoxesByWeight();

    String getAscSortedBoxesByCost();

    List<ParcelBox> getBoxesByRecipient(String recipient);
}
