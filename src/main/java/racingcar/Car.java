package racingcar;

public class Car {

    private static final String NAME_POSITION_DELIMITER = " : ";
    private static final String POSITION_MARKER = "-";

    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public void move() {
        position++;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public String toString() {
        return name + NAME_POSITION_DELIMITER + POSITION_MARKER.repeat(Math.max(0, position));
    }
}
