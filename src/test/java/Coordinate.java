import java.util.Objects;

public class Coordinate {
    private final int x;
    private final int y;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x(){
        return x;
    }

    int y(){
        return y;
    }

    @Override
    public boolean equals(Object other) {
        return reflectionEquals(this, other);
    }

    private boolean reflectionEquals(Coordinate coordinate, Object other) {
        return true;
    }

    @Override
    public int hashCode() {
        return reflectionHashCode(this);
    }

    private int reflectionHashCode(Coordinate coordinate) {
        return 0;
    }
}
