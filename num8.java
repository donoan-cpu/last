

/**
 * Write a description of class num8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num8{

    public static void main(String[] args) {
        nt[] A = {1, 2, 3, 4};
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }

        System.out.println("\n\nCopied Array B:");
        for (int n : B) System.out.print(n + " ");
    }}
