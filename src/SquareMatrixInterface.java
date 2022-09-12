public interface SquareMatrixInterface {

    public int getSize();
    public void setValue(int row, int col, int value) ;
    public int getValue(int row, int col);
    public void fillValue(int value);
    public void makeZero();
    public String toString();

    SquareMatrix add(SquareMatrix input);
    SquareMatrix subtract(SquareMatrix input);
    SquareMatrix copy();
}
