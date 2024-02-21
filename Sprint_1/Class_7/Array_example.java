import java.io.Console;

public class Array_example {
    public static void main(String[] args){
        // How to create arrays
        String[] cars = {"FORD", "BMW", "MAZDA", "WV", "VOLVO"};
        char[] YMCA_chars = {'Y', 'M', 'C', 'A'};
        int[] prime_nums = {2, 3, 5, 7, 11};


        // Outputting values in an array
        // for (String i : cars) {
        //     System.out.println(i);
        // }

        // Outputting value in an array (with a for-loop)
        // for(int prime_index = 0; prime_index < prime_nums.length; prime_index++){
        //     if(prime_nums[prime_index] < 10){
        //         System.out.println(prime_nums[prime_index]);
        //     }
        // }

        // Accessing a single value in a list by positional index
        System.out.println(YMCA_chars[0]);

        // Changing a value in an array
        System.out.println("UNCHANGED 'CARS' ARRAY");
        for (String i : cars) {
            System.out.println(i);
        }

        cars[2] = "PORSCHE";

        System.out.println("MODIFIED 'CARS' ARRAY");
        for (String i : cars) {
            System.out.println(i);
        }

        // Create empty array of a specific size
        // int[] myInts = new int[10];
        // for(int i = 0; i < 10; i++){
        //     myInts[i] = i;
        //     System.out.println("Adding " +String.valueOf(i) + " to the array");
        // }


    }
}
