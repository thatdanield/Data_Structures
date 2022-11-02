public class ArrayQueue<T> implements QueueInterface<T> {

    private T[] data;

    public ArrayQueue(){
        data = (T[]) new Object[0];
    }

    @Override
    public int size() {
        var counter = 0;
        for (var item : data) {
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
        var temp = data;
        data = (T[]) new Object[temp.length + 1];
        for (var i = 0; i < temp.length; i++)
            data[i] = temp[i];
        data[data.length - 1] = item;
        return item;
    }

    @Override
    public T peek() throws QueueUnderflowException {
        for (var i = 0; i < data.length; i++) {
            if (data[i] != null) {
                return data[i];
            }
        }
        throw new QueueUnderflowException();
    }

    @Override
    public T remove() throws QueueUnderflowException {
        for (var i = 0; i < data.length; i++) {
            if (data[i] != null) {
                var temp = data[i];
                data[i] = null;
                return temp;
            }
        }
        throw new QueueUnderflowException();
    }

    @Override
    public void clear() {
        data = (T[]) new Object[0];
    }
}