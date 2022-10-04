
/**
 * This LinkedStack object represents a Stack ADT implemented as
 * a LinkedList using the StackInterface.
 * 
 * @author
 * @version
 */
public class LinkedStack<T> implements StackInterface<T>
{
    private LLNode<T> top;
    private int size;

    public LinkedStack()
    {
    }

    // returns the logical size of the stack
    public int size()    
    {
        int count = 0;
        LLNode<T> node = top;
        while(node!=null) {
            count++;
            node = node.getLink();
        }
        return count;
    }

    // tests if this stack is empty
    public boolean empty()
    {
        return top==null;
    }

    // looks at the object at the top of this stack
    // without removing it from the stack
    public T peek()
    {
        if(size()==0) {
            throw new StackUnderflowException();
        }
        return top.getInfo();
    }

    // removes the object at the top of this stack 
    // and returns that object as the value of this function
    public T pop() throws StackUnderflowException
    {
        if(size()==0) {
            throw new StackUnderflowException();
        }
        T info = top.getInfo();
        top = top.getLink();
        return info;
    }

    // pushes an item onto the top of this stack
    public T push(T item)
    {
        LLNode<T> oldTop = top;
        LLNode<T> newTop = new LLNode<T>(item);
        newTop.setLink(oldTop);
        top = newTop;
        return item;
    }

    // removes all of the elements from this stack
    public void clear()
    {
        top.setLink(null);
        top = null;
    }

    // returns the 1 based position where an object is on this stack
    // note: when the method ends, the stack is the same as it was at the start
    public int search(Object o)
    {
        int count = 1;
        LLNode<T> node = top;
        while(!node.getInfo().equals(o)) {
            System.out.println(node.getInfo() + " " + o);
            node = node.getLink();
            count++;
            if (node==null) {
                return -1;
            }
        }
        return count;
    }
}
