package racingcar;

public class Car {

    private static final int MOVE_CONDITION = 4;
    private static final String NAME_POSITION_DELIMITER = " : ";
    private static final String POSITION_MARKER = "-";

    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public void tryMove(int randomValue) {
        if (randomValue >= MOVE_CONDITION) {
            position++;
        }
    }

    public boolean isPositionEqual(int position) {
        return this.position == position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public String moveResult() {
        return name + NAME_POSITION_DELIMITER + POSITION_MARKER.repeat(Math.max(0, position));
    }
}
