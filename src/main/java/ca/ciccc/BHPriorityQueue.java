package ca.ciccc;

import java.util.ArrayList;
import java.util.List;

public class BHPriorityQueue<K extends Comparable, V> implements VCPriorityQueue{
    private List<Entry<K, V>> entries;

    public BHPriorityQueue() {
        this.entries = new ArrayList<Entry<K, V>>();
    }

    public BHPriorityQueue(List<Entry<K, V>> entries) {
        this.entries = entries;
    }

    public int size() {
        return this.entries.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public Entry enqueue(Comparable key, Object value) throws IllegalArgumentException {
        Entry<K, V> entry = new Entry<K, V>((K)key, (V)value);
        entries.add(entry);
        return entry;
    }

    @Override
    public Entry peek() {
        if (isEmpty()) {
            return null;
        }
        return this.entries.get(this.size() -1);
    }

    @Override
    public Entry dequeueMin() {
        if (isEmpty()) {
            return null;
        }
        return this.entries.get(this.size() -1);
    }

    @Override
    public VCPriorityQueue merge(VCPriorityQueue other) {



        return null;
    }
}
