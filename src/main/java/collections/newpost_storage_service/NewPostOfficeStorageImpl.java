package collections.newpost_storage_service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class NewPostOfficeStorageImpl implements NewPostOfficeStorage {
    private List<Box> storage = new ArrayList<>();

    public boolean acceptBox(Box box) {
        if (box == null) throw new NullPointerException();
        storage.add(box);
        return true;
    }

    public boolean acceptAllBoxes(Collection<Box> boxes) {
        if (boxes == null) throw new NullPointerException();

        List<Box> temp = new ArrayList<>();

        for (Box b : boxes) {
            if (b == null) throw new NullPointerException();
            temp.add(b);
        }

        for (Box b : temp) {
            storage.add(b);
        }
        return true;
    }

    public boolean carryOutBoxes(Collection<Box> boxes) {
        if (boxes == null) throw new NullPointerException();

        boolean removed = false;
        Iterator<Box> it = storage.iterator();

        while (it.hasNext()) {
            Box current = it.next();

            for (Box b : boxes) {
                if (b == null) throw new NullPointerException();

                if (current == b) {
                    it.remove();
                    removed = true;
                    break;
                }
            }
        }
        return removed;
    }

    public List<Box> carryOutBoxes(Predicate<Box> predicate) {
        if (predicate == null) throw new NullPointerException();

        List<Box> removedList = new ArrayList<>();
        Iterator<Box> it = storage.iterator();

        while (it.hasNext()) {
            Box b = it.next();
            if (predicate.test(b)) {
                removedList.add(b);
                it.remove();
            }
        }
        return removedList;
    }

    public List<Box> getAllWeightLessThan(double weight) {
        List<Box> result = new ArrayList<>();

        for (Box b : storage) {
            if (b.getWeight() < weight) {
                result.add(b);
            }
        }
        return result;
    }

    public List<Box> getAllCostGreaterThan(BigDecimal cost) {
        if (cost == null) throw new NullPointerException();

        List<Box> result = new ArrayList<>();

        for (Box b : storage) {
            if (b.getCost().compareTo(cost) > 0) {
                result.add(b);
            }
        }
        return result;
    }

    public List<Box> getAllVolumeGreaterOrEqual(double volume) {
        List<Box> result = new ArrayList<>();

        for (Box b : storage) {
            if (b.getVolume() >= volume) {
                result.add(b);
            }
        }
        return result;
    }

    public List<Box> searchBoxes(Predicate<Box> predicate) {
        if (predicate == null) throw new NullPointerException();

        List<Box> result = new ArrayList<>();

        for (Box b : storage) {
            if (predicate.test(b)) {
                result.add(b);
            }
        }
        return result;
    }

    public void updateOfficeNumber(Predicate<Box> predicate, int newOfficeNumber) {
        if (predicate == null) throw new NullPointerException();

        for (Box b : storage) {
            if (predicate.test(b)) {
                b.setOffice(newOfficeNumber);
            }
        }
    }
}
