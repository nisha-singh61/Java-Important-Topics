import java.util.Arrays;
import java.util.List;

public class StreamLearning3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 8, 5, 1, 4, 6, 3, 7, 9, 10);
       int result = numbers.stream()
               // Use the filter method to create a new stream that only contains even numbers
                .filter(n -> n % 2 == 0)
                // Use map() method to double each even number in the stream
                .map(n -> n * 2)
               //use reduce() method to sum the doubled even numbers
               //explanation: The reduce() method is a terminal operation that takes a binary operator and applies it to the elements of the stream, reducing them to a single value. In this case, we are using a lambda expression (a, b) -> a + b to sum the doubled even numbers. The first argument to reduce() is the identity value, which is 0 in this case, and the second argument is the binary operator that defines how to combine the elements of the stream.
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of doubled even numbers: " + result);
    }
}
