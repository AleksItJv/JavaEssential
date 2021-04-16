package homework10.task2;

class Box<TKey, TValue> {

    private TKey key;
    private TValue value;

    Box(TKey key, TValue value) {
        this.key = key;
        this.value = value;
    }

    public TKey getKey() {
        return key;
    }

    public void setKey(TKey key) {
        this.key = key;
    }

    public TValue getValue() {
        return value;
    }

    public void setValue(TValue value) {
        this.value = value;
    }


    @Override
    public int hashCode() {
        int result = 13;
        result = 33 * result + key.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Box: " +
                "key - " + key +
                ", value - " + value;
    }
}