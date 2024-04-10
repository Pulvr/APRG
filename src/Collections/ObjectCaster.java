package Collections;

import java.util.ArrayList;
import java.util.List;

public class ObjectCaster {

    public static void main(String[] args) {
        List<Object> numbers = new ArrayList<>();

        numbers.addAll(List.of("1",1,"2",2,3,4,5,6,7,8,9));

        System.out.println(toSquaredIntegerList(numbers));
    }

    public static List<Integer> toSquaredIntegerList(List<Object> objectList) {
        List <Integer> numbersSquared = new ArrayList<>();

        for (Object o : objectList) {
            if (o instanceof Integer) {
                Integer object = (int) o;
                object = object * object;
                numbersSquared.add(object);
            }
        }
        return numbersSquared;
    }
}