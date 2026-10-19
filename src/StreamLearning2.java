public class StreamLearning2 {
    public static void main(String[] args) {
        // Create a stream of integers
        java.util.stream.Stream<Integer> numbers = java.util.stream.Stream.of(2, 8, 5, 1, 4, 6, 3, 7, 9, 10);

        // Use the filter method to create a new stream that only contains even numbers
        java.util.stream.Stream<Integer> evenNumbers = numbers.filter(n -> n % 2 == 0);

        //Use sorted() method to sort the even numbers in ascending order
        java.util.stream.Stream<Integer> sortedEvenNumbers = evenNumbers.sorted();

        //use map() method to double each even number in the stream
        java.util.stream.Stream<Integer> doubledEvenNumbers = sortedEvenNumbers.map(n -> n * 2);
        //use forEach() method to print out the doubled even numbers
        doubledEvenNumbers.forEach(System.out::println);
    }
}
