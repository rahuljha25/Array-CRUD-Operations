public class Array_U
{
    public static void main(String[] args)
    {
            int[] array = {10, 20, 30};
            array[1] = 50;
            System.out.println("Array after updating element at index 1 to 50:");
            for (int i = 0; i < array.length; i++)
            {
                System.out.print(array[i] + " ");
            }
        }
    }


