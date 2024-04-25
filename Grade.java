public class Grade {

    private int value;
    private String name;

    public Grade(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Grade: ");
        sb.append("\n");
        sb.append("Name: ");
        sb.append(name);
        sb.append("\n");
        sb.append("Value: ");
        sb.append(value);
        sb.append("\n");
        return sb.toString();
    }
}
