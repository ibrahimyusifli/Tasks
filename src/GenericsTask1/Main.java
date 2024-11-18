package GenericsTask1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer[] intArray = {1,2,3,4,5,6};
        MinMax<Integer> intMinMax = new MinMax<>(intArray);
        System.out.println("Minimum :" + intMinMax.findMin());
        System.out.println("Maximum :" + intMinMax.findMax());
        System.out.println("Integer Array:");
        MinMax.printArray(intArray);

        String[] strArray = {"Ibrahim","Cuma","Ughur","Arif"};
        MinMax<String> strMinMax = new MinMax<>(strArray);
        System.out.println("Minimum :" + strMinMax.findMin());
        System.out.println("Maximum :" + strMinMax.findMax());
        System.out.println("String Array:");
        MinMax.printArray(strArray);

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(4);
        intList.add(23);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        int index1 = MinMax.findFirst(intList,4);
        int index3 = MinMax.findFirst(intList,99);
        System.out.println("List de 4 un ilk indeksi:" + index1);
        System.out.println("List de 99 un ilk indeksi:" + index3);

        List<String> strList = new ArrayList<>();
        strList.add("Ibrahim");
        strList.add("Azer");
        strList.add("Nihat");
        strList.add("Nihat");
        strList.add("Nurlan");
        int index2 = MinMax.findFirst(strList,"Nihat");
        System.out.println("List daxilinde 'Nihat' ilk indeksi:" + index2);

        //Calculator
        Calculator<Integer> intCalculator = new Calculator<>();
        System.out.println(intCalculator.calculate(1,2,"add"));
        System.out.println(intCalculator.calculate(10,8,"subtract"));
        System.out.println(intCalculator.calculate(3,4,"multiply"));
        System.out.println(intCalculator.calculate(5,2,"divide"));
        System.out.println(intCalculator.calculate(4,0,"divide"));

    }

}


