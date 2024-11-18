package Sorting;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //naturalOrder duzune ,reverseOrder tersine siralayir
        Integer[] integers = {5, null, 3, 9, null, null, 1};
        Arrays.sort(integers, Comparator.nullsLast(Comparator.reverseOrder()));
        for (Integer el : integers)
            if (Objects.nonNull(el)) System.out.println(el + " ");


        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("Ibrahim", 20));
        arrayList.add(new Student("Azer", 22));
        arrayList.add(new Student("Bil", 21));

        Comparator<Student> comparatorForName = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        };
        Comparator<Student> comparatorForNameLength = new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.length() - o2.name.length();
            }
        };

        Collections.sort(arrayList);
        System.out.println(arrayList);
        
        arrayList.sort(comparatorForName);
        System.out.println(arrayList);

        arrayList.sort(comparatorForNameLength);
        System.out.println(arrayList);
    }
}
