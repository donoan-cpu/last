import java.util.Scanner;
/**
 * Write a description of class num7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num7
{
  public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int[] arr = {-3, 5, -7, 2};

for (int i = 0; i < arr.length; i++) {
    if (arr[i] < 0) arr[i] = -arr[i];
}
 
  }
}