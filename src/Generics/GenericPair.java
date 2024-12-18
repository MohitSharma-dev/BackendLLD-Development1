package Generics;

public class GenericPair<T , V>{
   T first;
   V second;

   public void setFirst(T first){
       this.first = first;
   }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public static <S, K> K doSomething(S data , K data2){
        System.out.println(data);
        return data2;
    }
}
