package DataStructures;

public class Stack<T> {
    private DynamicArray<T> ar;

    Stack(){
        ar = new DynamicArray<T>();
    }

    public void push(T item){
        ar.append(item);
    }

    public T pop(){
        return (T) ar.pop();
    }

    @Override
    public String toString(){
        return ar.toString();
    }
}