import java.util.Arrays;
import java.util.List;

public class StreamLearning3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 8, 5, 1, 4, 6, 3, 7, 9, 10);
       int result = numbers.stream()
               // Use the filter method to create a new stream that only contains even numbers
               //filter is an intermediate operation that takes a predicate (a boolean-valued function) and returns a new stream that contains only the elements of the original stream that match the predicate. In this case, we are using a lambda expression n -> n % 2 == 0 to filter out all the odd numbers from the stream. The resulting stream will only contain even numbers.
                .filter(n -> n % 2 == 0)

                // Use map() method to double each even number in the stream
               //map is an intermediate operation that takes a function and returns a new stream that contains the results of applying the function to each element of the original stream. In this case, we are using a lambda expression n -> n * 2 to double each even number in the stream. The resulting stream will contain the even numbers doubled.
                .map(n -> n * 2)

               //use reduce() method to sum the doubled even numbers
               //explanation: The reduce() method is a terminal operation that takes a binary operator and applies it to the elements of the stream, reducing them to a single value. In this case, we are using a lambda expression (a, b) -> a + b to sum the doubled even numbers. The first argument to reduce() is the identity value, which is 0 in this case, and the second argument is the binary operator that defines how to combine the elements of the stream.
               //reduce is a terminal operation, which means that it produces a result and closes the stream. After the reduce() method is called, the stream can no longer be used.
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of doubled even numbers: " + result);
    }
}
