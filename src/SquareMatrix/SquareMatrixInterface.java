package SquareMatrix;

public interface SquareMatrixInterface {

    public int getSize();
    public void setValue(int row, int col, int value) ;
    public int getValue(int row, int col);
    public int fillValue(int value);
    public void makeZero();
    public String toString();
}
