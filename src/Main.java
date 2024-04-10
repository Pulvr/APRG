import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        //Iterator
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        //Iterator <Integer> gibt auch objekte vom typ integer zurück
        //Iterator ohne generic gibt nur "objekte" zurück
        Iterator<Integer> iterator = Arrays.stream(numbers).iterator();
        while(iterator.hasNext()){
            Object current = iterator.next();
            System.out.print(current + " ");
        }

        System.out.println();

        for ( int number : numbers ) {
            System.out.print(number + " ");
        }

        System.out.println();

        //Name Iterator, alle names ausgeben und dann in Uppercase
        String[] names = new String[] {"Chani", "Elon", "Leto"};
        Iterator<String> nameIterator  = Arrays.stream(names).iterator();
        while(nameIterator.hasNext()){
            String current = nameIterator.next();
            System.out.print(current.toUpperCase() + " ");
        }

        System.out.println();

        //mit der for schleife iterieren und alle o mit i ersetzen
        //Array selber wird nicht verändert
        for ( String name : names){
            if(name.contains("o")){
                name = name.replace("o", "i");
            }
            System.out.print(name+ " ");
        }

        System.out.println();
        for ( String name : names){
            System.out.print(name+" ");
        }
    }
}