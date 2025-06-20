package facade.ShoppingList;

import java.util.Arrays;

public class StringArray {
    private String[] data;

    public void initialize(String[] values) {
        this.data = Arrays.copyOf(values, values.length);
    }

    public String get(int index) {
        if (index >= 0 && index < data.length) {
            return data[index];
        }
        throw new IndexOutOfBoundsException("Invalid index: " + index);
    }

    public void set(int index, String value) {
        if (index >= 0 && index < data.length) {
            data[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }

    public String[] getAll() {
        return data;
    }
}
