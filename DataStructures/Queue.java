package DataStructures;

public class Queue <T>{
    private DynamicArray<T> ar;
    int front = 0;
    Queue(){
        ar = new DynamicArray<T>();
    }

    public void push(T item){
        ar.append(item);
    }

    public T pop(){
        return (T) ar.get(front++);
    }

    @Override
    public String toString(){
        return ar.subArray(front,ar.len()).toString();
    }
}