import java.util.LinkedList;

public class NonContiguous {
    public static void main(String[] args) {

        //java creates a linked list, which is a non-contiguous data structure that stores elements in separate nodes that are connected by pointers.
        LinkedList<Integer> numbers = new LinkedList<>();

        //Elements are stored in separate nodes : [10] -> [20] -> [30] -> [40] -> [50]
        //10 is put in a random memory location, then 20 is put in another random memory location, and so on. Each node contains a reference to the next node in the list, which allows for traversal of the list.
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Accessing elements in a linked list is slower than in an array
        //To print 40 java cannot do instant math to calculate the memory address of the element based on its index, instead it has to traverse the list from the beginning until it reaches the desired index.
        //It must look at 10 , read the pointer to the next node, then look at 20, read the pointer to the next node, and so on until it reaches 40.
        System.out.println("The value at index 3 is: " + numbers.get(3));

        System.out.println("List elements:");
        //To print all the elements java must traverse the entire list, starting from the first node and following the pointers to each subsequent node until it reaches the end of the list.
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
