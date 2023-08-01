// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int [] arr = new int[]{1,45, 2, 3, 11};
        int temp = 0;
        //Sort the array in ascending order
        for (int i = 0; 1 < arr.length;i++) {
            for (int j= i+1;j< arr.length;i++) {
                //using swap for array
                if(arr[i] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[i];
                    arr [i] = temp;
                }
            }
            }
// elements after sorting
                System.out.println("array after sorting : ");
                for (int i = 0; 1 < arr.length;i++) {
                    System.out.print(arr[1] + " ");
                }
            }
}