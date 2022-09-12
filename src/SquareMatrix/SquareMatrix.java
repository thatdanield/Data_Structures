package SquareMatrix;

public class SquareMatrix implements SquareMatrixInterface {
    int size;
    int[][] array;

    public SquareMatrix(int size, int[][] array) {
        this.size = size;
        this.array = array;
    }

    public SquareMatrix(int size) {
        this.size = size;
        array = new int[size][size];
    }

    public SquareMatrix add(SquareMatrix other) {
        SquareMatrix returnMatrix = new SquareMatrix(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                returnMatrix.setValue(i, j, this.getValue(i, j) + other.getValue(i, j));
            }
        };
        return returnMatrix;
    }
    public SquareMatrix subtract(SquareMatrix other) {
        SquareMatrix returnMatrix = new SquareMatrix(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                returnMatrix.setValue(i, j, this.getValue(i, j) - other.getValue(i, j));
            }
        };
        return returnMatrix;
    }
    public SquareMatrix clone(SquareMatrix other) {
        SquareMatrix returnMatrix = new SquareMatrix(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                returnMatrix.setValue(i, j, this.getValue(i, j));
            }
        };
        return returnMatrix;
    }
    public int getSize() {
        return size;
    }
    public void setValue(int row, int col, int value) {
        array[row][col] = value;
    }
    public int getValue(int row, int col) {
        return array[row][col];
    }
    public int fillValue(int value) {
        for (int[] array :
                this.array) {
            for (int oldValue :
                    array) {
                oldValue = value;
            }
        }
        return value;
    }
    public void makeZero() {
        for (int[] array :
                this.array) {
            for (int oldValue :
                    array) {
                oldValue = 0;
            }
        }
    }
    public String toString() {
        return array.toString();
    }
}