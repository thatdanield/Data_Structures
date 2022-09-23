import java.util.Arrays;

/**
 * This ArrayStack object represents a Stack ADT implemented as
 * an array using the StackInterface
 * 
 * @author  
 * @version 
 */
public class ArrayStack<T> implements StackInterface<T>
{
    private int size = 0;
    private T[] stack;

    public ArrayStack()
    {
        // cannot create a generic array object, so has to be cast
        // from an Object back into the generic in order to compile
        stack = (T[]) new Object[1];
        size = 0;
    }

    // returns the logical size of the stack
    public int size()    
    {
        if ((stack.length<=1)&&(stack[0]==null)&&(size == 0)) {
            size = 0;
            return 0;
        }
        for (int i = 0; i < stack.length; i++) {
            if (stack[i]==null) {
                size = i;
                return i;
            }
        }
        return stack.length;
    }

    private void checkSize() {
        int newSize;
        if (size>=stack.length) {
            newSize = stack.length*2;
        } else if (size < stack.length / 4) {
            newSize = stack.length/2;
        } else {
            return;
        }
        T[] temp = (T[]) new Object[newSize];
        for (int i = 0; i < Math.min(temp.length, stack.length); i++) {
            temp[i] = stack[i];
        }
        size = size();
        stack = temp;
    }
    // tests if this stack is empty
    public boolean empty()
    {
        checkSize();
        return stack[0]==null;
    }

    // looks at the object at the top of this stack
    // without removing it from the stack
    public T peek()
    {
        checkSize();
        if (empty()) {
            throw new StackUnderflowException();
        }
        for (int i = 0; i < stack.length; i++) {
            if(stack[i]==null) {
                return stack[i-1];
            }
        }
        return stack[stack.length-1];
    }

    // removes the object at the top of this stack 
    // and returns that object as the value of this function
    public T pop()
    {
        checkSize();
        T returnT;
        if(empty()) {
            throw new StackUnderflowException();
        }
        for (int i = 0; i < stack.length; i++) {
            if(stack[i]==null) {
                returnT = stack[i-1];
                stack[i-1] = null;
                return returnT;
            }
        }
        returnT = stack[stack.length - 1];
        stack[stack.length - 1] = null;
        size = size - 1;
        return returnT;
    }

    // pushes an item onto the top of this stack
    public T push(T item)
    {
        size+=1;
        checkSize();

        for (int i = 0; i < stack.length; i++) {
            if (stack[i]==null) {
                stack[i] = item;
                break;
            }
        }
        return item;
    }

    // removes all of the elements from this stack
    public void clear()
    {
        size = 0;
        for (int i = 0; i < stack.length; i++) {
            stack[i] = null;
        }
        System.out.println(Arrays.toString(stack));
        checkSize();
    }

    // returns the 1 based position where an object is on this stack
    // note: when the method ends, the stack is the same as it was at the start
    public int search(Object o)
    {
        for (int i = 0; i < size(); i++) {
            if (stack[i].equals((T)o)) {
                System.out.println(stack[i]);
                System.out.println(o);
                System.out.println(Arrays.toString(stack));
                System.out.println(size() - i);
                return size() - i;
            }
        }
        return -1;

    }
}
