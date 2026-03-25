package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions.
 *
 * @author Nora Shoemaker
 *
 */
public class DelegationSortedIntList implements IntegerList {

    private SortedIntList list;
    private int totalAdded;

    public DelegationSortedIntList() {
        list = new SortedIntList();
        totalAdded = 0;
    }

    @Override
    public boolean add(int num) {
        boolean changed = list.add(num);
        totalAdded++;
        return changed;
    }

    @Override
    public boolean addAll(IntegerList other) {
        boolean changed = list.addAll(other);
        totalAdded += other.size();
        return changed;
    }

    @Override
    public int get(int index) {
        return list.get(index);
    }

    @Override
    public boolean remove(int num) {
        return list.remove(num);
    }

    @Override
    public boolean removeAll(IntegerList other) {
        return list.removeAll(other);
    }

    @Override
    public int size() {
        return list.size();
    }

    public int getTotalAdded() {
        return totalAdded;
    }
}