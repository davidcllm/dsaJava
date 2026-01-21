import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Dynamic Arrays

        DynamicArray dynamicArray = new DynamicArray();

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        dynamicArray.insert(1,"X");
        dynamicArray.delete("A");

        System.out.println(dynamicArray);
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println("empty: " + dynamicArray.isEmpty());
    }
}

class DynamicArray {
    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray() {
        this.array = new Object[capacity];
    }
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
    public void add(Object data) {
        if (size >= capacity) {
            grow();
        }
        array[size] = data; // array[size] is the end of the array
        size++;
    }
    public void insert(int index, Object data) {
        if (size >= capacity) {
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i-1]; // Moves the elements to the right to make room for the insertion
        }
        array[index] = data;
        size++;
    }
    public void delete(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                for (int j = 0; j < (size - i - 1); j++) {
                    array[i+j] = array[i+j+1]; // Move the elements to the left
                }
                array[size-1] = null;
                size--;

                if (size <= (int) (capacity/3)) {
                    shrink();
                }
                break;
            }
        }
    }
    public int search(Object data) {
        return -1;
    }
    private void grow() {

    }
    private void shrink() {

    }
    public boolean isEmpty() {
        return size == 0;
    }
    public String toString() {
        String string = "";
        for (int i = 0; i < size; i++) {
            string += array[i] + ", ";
        }
        if (string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        }
        else {
            string = "[]";
        }

        return string;
    }
}