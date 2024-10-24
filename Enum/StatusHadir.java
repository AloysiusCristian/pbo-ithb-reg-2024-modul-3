package Enum;

public enum StatusHadir {
    HADIR(0), ALPHA(1);

    private final int value;

    StatusHadir(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
