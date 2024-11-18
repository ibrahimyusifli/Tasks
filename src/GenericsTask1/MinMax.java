package GenericsTask1;

import java.util.List;

public class MinMax <T extends Comparable<T>>{
    private T[] array;

    public MinMax(T[] array){
        this.array =array;
    }

   public T findMin(){
        T min = array[0];
        for(T element: array){
            if(element.compareTo(min)<0){
                min=element;
            }
        }
        return min;
   }

   public T findMax(){
        T max = array[0];
        for (T element:array){
            if(element.compareTo(max)>0){
                max=element;
            }
        }
        return max;
   }

   public static <T> void printArray(T[] array){
        for (T element:array){
            System.out.print(element + " ");
        }
       System.out.println();
   }

   public static <T> int findFirst(List<T> list,T item){
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals(item)){
                return i;
            }
        }
        return -1;
   }





}
