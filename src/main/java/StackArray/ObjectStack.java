package StackArray;


import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
@SuppressWarnings("unchecked")
public class ObjectStack<E> {
    private Object[] elements;

    public ObjectStack() {
        elements = new Object[0];
    }

    public void push(E object){
        Object[] newElements = Arrays.copyOf(elements, elements.length + 1);
        newElements[newElements.length - 1] = object;
        this.elements = newElements;
    }

    public E pop(){
        E result = (E) elements[elements.length - 1];
        this.elements = Arrays.copyOf(elements, elements.length - 1);
        return result;
    }

    public boolean isEmpty(){
        if(elements.length == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
