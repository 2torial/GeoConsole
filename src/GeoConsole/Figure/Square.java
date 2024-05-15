package GeoConsole.Figure;

import GeoConsole.UserInput.Context.Pair;

public class Square extends Figure {
    double side, diagonal;

    public Square(double sideValue, double diagonalValue, double areaValue) {
        checkForPositives(1, sideValue, diagonalValue, areaValue);
        if (sideValue <= 0.0 && diagonalValue <= 0.0 && areaValue < 0.0)
            throw new IllegalArgumentException("An argument (side/diagonal/area) has to be greater than 0");
        if (sideValue > 0.0) {
            side = sideValue;
            diagonal = side * Math.sqrt(2.0);
            area = side * side;
            perimeter = 4.0 * side;
        }
        else if (diagonalValue > 0.0) {
            diagonal = diagonalValue;
            side = diagonal / Math.sqrt(2.0);
            area = diagonal * diagonal / 2.0;
            perimeter = 4.0 * side;
        }
        else if (areaValue > 0.0) {
            area = areaValue;
            side = Math.sqrt(area);
            diagonal = Math.sqrt(area * 2.0);
            perimeter = 4.0 * side;
        }
        throwIfZero(area, perimeter, side, diagonal);
        throwIfNaN(area, perimeter, side, diagonal);
    }

    @Override
    public Circle getCircumcircle(){
        return new Circle(diagonal / 2.0, -1, -1 );
    }

    @Override
    public String getDescription(int roundTo) {
        return stringRounded("[ID:%d] Square: side: %f, diagonal: %f, area: %f, perimeter: %f\n",
                roundTo, id, side, diagonal, area, perimeter);
    }

    @Override
    public Pair<Figure, Class<? extends Figure>> doubleSelf() {
        return new Pair<>(new Square(side*Math.sqrt(2), -1, -1), Square.class);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return roundedComparator.compare(side, square.side) == 0;
    }
}
