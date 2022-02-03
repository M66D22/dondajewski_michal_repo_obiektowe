public class CardObjects {
    private String name;
    private int value;

    public CardObjects(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "CardObjects{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
