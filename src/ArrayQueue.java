public class ArrayQueue<T> implements QueueInterface<T> {

    private T[] array;

    public ArrayQueue(){
        array = (T[]) new Object[0];
    }

    @Override
    public int size() {
        var counter = 0;
        for (var item : array) {
            if (item != null) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public boolean empty() {
        return size() == 0;
    }

    @Override
    public T add(T item) {
        T[] newArray = array;
        array = (T[]) new Object[newArray.length + 1];
        for (var i = 0; i < newArray.length; i++) {
            array[i] = newArray[i];
        }
        array[array.length - 1] = item;
        return item;
    }

    @Override
    public T peek() throws QueueUnderflowException {
        for (var i = 0; i < array.length; i++) {
            if (array[i] != null) {
                return array[i];
            }
        }
        throw new QueueUnderflowException();
    }

    @Override
    public T remove() throws QueueUnderflowException {
        for (var i = 0; i < array.length; i++) {
            if (array[i] != null) {
                var temp = array[i];
                array[i] = null;
                return temp;
            }
        }
        throw new QueueUnderflowException();
    }

    @Override
    public void clear() {
        array = (T[]) new Object[0];
    }
}