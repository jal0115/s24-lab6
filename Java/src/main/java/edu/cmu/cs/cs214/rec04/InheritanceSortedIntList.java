package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions.
 *
 * @author Nora Shoemaker
 */
public class InheritanceSortedIntList extends SortedIntList {

    private int totalAdded;

    public InheritanceSortedIntList() {
        super();
        totalAdded = 0;
    }

    @Override
    public boolean add(int num) {
        boolean changed = super.add(num);
        totalAdded++;
        return changed;
    }

    @Override
    public boolean addAll(IntegerList list) {
        boolean changed = super.addAll(list);
        return changed;
    }

    public int getTotalAdded() {
        return totalAdded;
    }
}