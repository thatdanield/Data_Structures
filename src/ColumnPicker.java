import kareltherobot.*;
/**
 * Counts the number of beepers in a column and puts the same
 * number of beepers at the base of the column
 * 
 * @author
 * @version 
 */
public class ColumnPicker extends Robot
{
    public ColumnPicker(int street, int avenue, Direction direction, int beepers)
    {
        super(street, avenue, direction, beepers);
    }
    
    public void countColumns()
    {
        if(!nextToABeeper()){
            int count = countColumn();
            putBeepers(count);
            turnLeft();
            move();
            turnLeft();
            countColumns();
        }

    }
    int countBeepers() {
        if(nextToABeeper()) {
            pickBeeper();
            int count = countBeepers() + 1;
            putBeeper();
            return count;
        } else {
            return 0;
        }
    }
    int countColumn(int height) {
        int count = 0;
        if(height<9) {
            move();
            count = countBeepers() + countColumn(height+1);
            move();
        } else {
            turnLeft();
            turnLeft();
        }
        return count;
    }
    int countColumn() {
        return countColumn(1);
    }
    void putBeepers(int number) {
        if(number>0) {
            putBeeper();
            putBeepers(number - 1);
        }
    }
}