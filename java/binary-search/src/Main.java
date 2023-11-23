// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int target = 8;
        int result = binarySearch(numbers,target);
        verify(result);

        target= 12;
        result = binarySearch(numbers,target);
        verify(result);
    }

    public static int binarySearch(int[] list, int target){
        int first = 0;
        int last = list.length -1;
        int midpoint=0;
        while (first<=last){
            midpoint = (first+last)/2;
            if(list[midpoint] == target){
                return midpoint;
            }
            if(list[midpoint]<target){
                first = midpoint +1;

            }
            if(list[midpoint]>target){
                last = midpoint-1;
            }
        }
        return -1;
    }
    public static void verify(int result){
        if(result == -1){
            System.out.println("Target not found");
        }else{
            System.out.println("Target found at index: "+ result);
        }
    }
}