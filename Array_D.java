public class Array_D
{
    public static void main(String[] args)
    {
            int[] array = {10, 20, 30};
            array[1] = 0;
            System.out.println("Array after deleting element at index 1: ");
            for (int i = 0; i < array.length; i++)
            {
                System.out.print(array[i] + " ");
            }
        }
    }


