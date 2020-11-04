package s9_dsa_danh_sach.bai_tap.arraylist_theo_thu_vien_java_util_arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        if(capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    public void add(int index, E element) {
        if(index > elements.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if(elements.length == size) {
            this.ensureCapacity(1);
        }
        if(elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for(int i = size+1; i >= index; i--) {
                elements[i] = elements[i-1];
            }
            elements[index] = element;
            size++;
        }
    }

    public E remove(int index) {
        if(index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        E element = (E) elements[index];
        for(int i = index; i < size-1; i++) {
            elements[i] = elements[i+1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }

    public int size() {
        return this.size;
    }

    public MyList<E> clone() {
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(this.elements, this.size);
        v.size = this.size;
        return v;
    }

    public boolean contains(E element) {
        return this.indexOf(element) >= 0;
    }

    public int indexOf(E element) {
        int index = -1;
        for(int i = 0; i < size; i++) {
            if(this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }

    public boolean add(E element) {
        if(elements.length == size) {
            this.ensureCapacity(1);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if(minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    public E get(int index) {
        return (E) elements[index];
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }
}
