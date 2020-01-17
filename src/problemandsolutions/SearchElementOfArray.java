package problemandsolutions;

public class SearchElementOfArray {
    // By using the sequential search algorithm,
    // write a Java program to search for an element of an integer array of 10 elements.

    public static int sequentialSearch(int[] elements, int target)
    {
        for (int j = 0; j < elements.length; j++)
        {
            if (elements[j] == target)
            {
                return j;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr1 = {81, 3, -20, 15, 432, 11, 57, -92, -4443, 10};

        // test when the target is in the array
        int index = sequentialSearch(arr1,-92);
        System.out.println(index);

        // test when the target is not in the array
        index = sequentialSearch(arr1,53);
        System.out.println(index);
    }
}
