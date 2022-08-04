import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Grid{
        private static final int MAX_HEIGHT = 10;
        private static final int MAX_WIDTH = 10;

        private List<Coordinate> obstacles = Collections.emptyList();
        Grid(){

        }
        public Grid(List<Coordinate> obstacles) {

        }

        Optional<Coordinate> nextCoordinateFor(Coordinate coordinate, Direction direction) {
            int x = coordinate.x();
            int y = coordinate.y();

            if(direction == Direction.NORTH){
                y = (y + 1) % MAX_HEIGHT;
            }
            if(direction == Direction.EAST){
                x = (x + 1) % MAX_WIDTH;
            }
            if(direction == Direction.SOUTH){
                y = (y > 0) ? y - 1 : MAX_HEIGHT - 1;
            }
            if(direction == Direction.WEST){
                x = (x > 0)? x - 1 : MAX_HEIGHT - 1;
            }
            Coordinate newCoordinate = new Coordinate(x, y);

            return obstacles.contains(newCoordinate)
                    ? Optional.empty()
                    : Optional.of(newCoordinate);
        }
    }

