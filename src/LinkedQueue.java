public class LinkedQueue<T> implements QueueInterface<T>{
    private LLNode<T> node;

    @Override
    public int size() {
        var count = 0;
        var currentNode = node;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.getLink();
        }
        return count;
    }

    @Override
    public boolean empty() {
        return size() == 0;
    }

    @Override
    public T add(T item) {
        LLNode<T> currentNode = node;
        if(node==null) {
            node = new LLNode<>(item);
            return item;
        }
        while (currentNode.getLink() != null) {
            currentNode = currentNode.getLink();
        }
        return item;
    }

    @Override
    public T peek() throws QueueUnderflowException {
        if (node != null){
            return node.getInfo();
        } else {
            throw new QueueUnderflowException();
        }
    }

    @Override
    public T remove() throws QueueUnderflowException {
        if (node != null) {
            var temp = node.getInfo();
            if (node.getLink() != null) {
                node = node.getLink();
                return temp;
            } else {
                node = null;
            }
            return temp;
        } else {
            throw new QueueUnderflowException();
        }
    }

    @Override
    public void clear() {
        node = null;
    }
}