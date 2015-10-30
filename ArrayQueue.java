package customStructures;

/**
* This class implements An ArrayQueue, performing all the action that the library
* function does.
*/



public class ArrayQueue<E> {
    //variables, all private of course
    private E[] data;
    private int front = 0;
    private int rear = 0;
    private int size = 0;
    //default constructor
    public ArrayQueue() {
        this(0);
    }
    //oh, look, they gave us a minimum size, that's nice
    public ArrayQueue(int capacity) {
        data = (E[]) new Object[capacity];
    }
    //basic accessors
    public boolean isEmpty() {
        return (size == 0);
    }
    
    public int size() {
        return size;
    }
    
    public E front() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException( "It's empty!");
        }
        return data[front];
    }
    /**
     * This adds elements to the queue
     * @param e
     * @throws IllegalStateException
     * @throws InvalidDataException
     * @throws QueueEmptyException 
     */
    public void enqueue(E e) throws IllegalStateException, InvalidDataException, QueueEmptyException{
        //checking for bad input first
        if (e == null) {
            throw new InvalidDataException("No null input, please. KTHXBYE.");
        }       
        //making sure queue isn't full
        if (size == data.length) {
            data = expandingArray(data);
            rear = size;
            front = 0;
        }

        //all good, so proceeding
        data[rear] = e;
        //allowing for wrapping
        rear = (rear +1) % data.length;
        size++;
    }
    /**
     * Takes the front element out of Queue
     * @return E
     * @throws QueueEmptyException 
     */
    public E dequeue() throws QueueEmptyException{
        //ensures queue is full of something
        if (isEmpty()) {
            throw new QueueEmptyException( "It's empty, yo!");
        }
        //accessing the actual object
        E pulledObject = data[front];
        //allowing for wrap
        front = (front + 1) % data.length;
        size--;
        return pulledObject;
    } 
    /**
     * Doubles size of array to allow more input
     * @param a
     * @return E[]
     * @throws QueueEmptyException 
     */
    public E[] expandingArray( E[] a) throws QueueEmptyException{
            E[] array1 = (E[]) new Object [a.length*2];
            for (int i = 0; i < a.length; i++) {
            array1[i] = a[front];
            front = (front + 1) % data.length;
            }
            return array1;  
        }
}
