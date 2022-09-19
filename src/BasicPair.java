public class BasicPair<T> implements PairInterface<T> {
    T t1;
    T t2;
    public BasicPair(T t3, T t4) {
        this.t1 = t3;
        this.t2 = t4;
    }
    public void setFirst(T t1) {this.t1 = t1;}
    public void setSecond(T t2) {this.t2 = t2;}
    public T getFirst() {return t1;}
    public T getSecond() {return t2;}
}
