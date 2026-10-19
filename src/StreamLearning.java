import java.util.Arrays;
import java.util.List;

public class StreamLearning {
    public static void main(String[] args) {

        //.asList() method is used to convert an array into a List. It takes an array as an argument and returns a fixed-size List that contains the elements of the array. The returned List is backed by the original array, which means that any changes made to the List will also affect the original array, and vice versa.
        //List<Integer> is a collection that can hold a fixed number of elements, and it provides methods for accessing and manipulating those elements. In this case, the List is created from an array of integers using the Arrays.asList() method.
        List<Integer> numbers = Arrays.asList(2, 8, 5, 1, 4, 6, 3, 7, 9, 10);

        //create a stream from the List of numbers using the stream() method. A stream is a sequence of elements that can be processed in parallel or sequentially. In this case, we are creating a sequential stream of integers from the List of numbers.
//        java.util.stream.Stream<Integer> numberStream = numbers.stream();
        numbers.stream()
                //The filter() method is used to filter the elements of the stream based on a given condition. In this case, we are using a lambda expression n -> n % 2 == 0 to filter out all the odd numbers from the stream. The resulting stream will only contain even numbers.
                .filter(n -> n % 2 == 0)
                //sort() method is used to sort the elements of the stream in ascending order. The resulting stream will contain the even numbers sorted in ascending order.
                .sorted()
                //map() method is used to transform the elements of the stream. In this case, we are using a lambda expression n -> n * 2 to double each even number in the stream. The resulting stream will contain the even numbers sorted in ascending order and doubled.
                .map(n -> n * 2)
                //The forEach() method is used to perform an action on each element of the stream. In this case, we are using a method reference System.out::println to print out each even number in the stream.
                .forEach(System.out::println);
        // Streams are a new feature in Java 8 that allow for functional-style operations on collections of data.
        // Streams can be used to perform operations such as filtering, mapping, and reducing on collections of data in a more concise and expressive way than traditional for-loops.
    }
}
