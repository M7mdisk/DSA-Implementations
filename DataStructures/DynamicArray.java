package DataStructures;

@SuppressWarnings("unchecked")
public class DynamicArray<T> {

    private T[] ar;
    private int size =0; // The length of the Dynamic Array as the user expects it to be.
    private int capacity = 0; // The actual size of the array.

    public DynamicArray(){
        this(32);
    }

    DynamicArray(int n){
        if (n <=0) throw new IllegalArgumentException("Invalid Capacity: " + n);
        capacity = n;
        ar = (T[]) new Object[n];
    }

    public int len(){
        return size;
    }

    public void expandArray(){
        capacity*=2;
        T[] new_ar = (T[]) new Object[capacity];
        for (int i =0;i< size;i++)
            new_ar[i] = ar[i];

        ar = new_ar;
    }

    public void append(T added){
        if (capacity == size){
            expandArray(); // double the capacity
        }
        ar[size]= added;
        size++;

    }
    public T pop(){
        if (size == 0) throw new UnsupportedOperationException("Can't pop from empty array");
        size--;
        T x = ar[size];
        ar[size] = null;
        return x;
    }

    public T pop(int idx){
        if (size == 0) throw new UnsupportedOperationException("Can't pop from empty array");
        if (idx>= size || idx<0) throw new IndexOutOfBoundsException("Index out of bound: "+idx);
        size--;
        T x = ar[size];
        for (int i =idx; i <size;i++){
            ar[i] = ar[i+1];
        }
        return x;
    }
    public T get(int idx){
        if (idx>= size || idx<0) throw new IndexOutOfBoundsException("Index out of bound: "+idx);
        return ar[idx];
    }

    public void set(int idx, T elem){
        if (idx>= size || idx<0) throw new IndexOutOfBoundsException("Index out of bound: "+idx);
        ar[idx] = elem;
    }

    // Delete everything in the array
    public void nuke(){
        for(int i =0;i<size;i++){
            ar[i] = null;
        }
        size=0;
    }

    public DynamicArray<T> subArray(int start,int end){
        if (end >size || start > size || start <0 || end <0) throw  new IndexOutOfBoundsException();
        DynamicArray<T> res =  new DynamicArray<T>();
        for (int i = start;i<end;i++){
            res.append(ar[i]);
        }
        return res;
    }

    public DynamicArray<T> subArray(int end){
        if (end >size || end <0) throw  new IndexOutOfBoundsException();
        int len = end;
        DynamicArray<T> res =  new DynamicArray<T>();
        for (int i = 0;i<len;i++){
            res.append(ar[i]);
        }
        return res;
    }

    @Override
    public String toString(){
        if (size == 0){
            return "[]";
        }
        String x = "[";
        for (int i =0;i<size-1;i++){
            x+=ar[i] + ", ";
        }
        x+= ar[size-1] + "]";
        return x;
    }

}
