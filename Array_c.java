
public class Array_c {

    public static void main(String[] args)
    {
        int[] array = new int[3];
        array[0] = 10;
        System.out.println("Array after inserting 10 at index 0: " + array[0]);
        array[1] = 20;
        System.out.println("Array after inserting 20 at index 1: " + array[1]);
        array[2] = 30;
        System.out.println("Array after inserting 30 at index 2: " + array[2]);
        System.out.print("Final Array: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
