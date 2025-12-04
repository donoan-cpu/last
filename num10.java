
/**
 * Write a description of class num10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num10
{

    public static void main(String[] args) {
     int[] arr = {1, 3, 5, 6, 7};
        int firstEvenIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                firstEvenIndex = i;
                 break;
         }
        }

        System.out.println("Index of first even number: " + firstEvenIndex);
    }
}
