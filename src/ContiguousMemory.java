public class ContiguousMemory {
    public static void main(String[] args) {

        //Java reserves a contiguous block of memory for an array, which means that all the elements of the array are stored in adjacent memory locations.
        // This allows for efficient access to the elements of the array using their index.
        //Elements are stored back to back : [10][20][30][40][50]
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        /*Fast access: java uses instant math to calculate the memory address of each element based on its index,
        which allows for fast access to the elements of the array.*/
        //here it jumps straight to index 3 and retrieves the value 40 without having to iterate through the entire array.
        System.out.println("The value at index 3 is: " + numbers[3]);

        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
