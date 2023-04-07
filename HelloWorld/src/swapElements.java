import java.util.Arrays;

public class swapElements {

    public static void main(String[] args) {
        //inits the array
        int[] elements = {1,2,3,4,5};

        //prints the current array
        System.out.println("the current array is " + Arrays.toString(elements));

        //defines the elements of the array to be swapped
        int x = elements[0];
        int y = elements[1];

        //swaps the elements of the array
        elements[0] = y;
        elements[1] = x;

        //prints the new array
        System.out.println("the new array is " + Arrays.toString(elements));
    }

    
    
}
