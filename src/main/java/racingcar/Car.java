package racingcar;

public class Car {

    private static final int MOVE_CONDITION = 4;

    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public void move(int randomValue) {
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
}
