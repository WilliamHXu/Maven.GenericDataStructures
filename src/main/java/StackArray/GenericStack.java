package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
@SuppressWarnings("unchecked")
public class GenericStack<E> {
    private E[] elements;

    public GenericStack() {
        elements = (E[]) new Object[0];
    }

    public void push(E object){
        E[] newElements = Arrays.copyOf(elements, elements.length + 1);
        newElements[newElements.length - 1] = object;
        this.elements = newElements;
    }

    public E pop(){
        E result = elements[elements.length - 1];
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
