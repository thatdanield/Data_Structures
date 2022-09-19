import java.util.ArrayList;
import java.util.List;

public class ArrayPair<T> implements PairInterface<T> {
    T[] array;
    public ArrayPair(T t1, T t2) {
        array =(T[]) new Object[]{t1, t2};
    }
    public void setFirst(T t1) {array[0] = t1;}
    public void setSecond(T t2) {array[1] = t2;}
    public T getFirst() {return array[0]; }
    public T getSecond() {return array[1];}


}
