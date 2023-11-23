import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8,9,10};

        int target = 7;
        boolean result = recursiveBinarySearch(list,target);
        verify(result);

        target = 12;
        result = recursiveBinarySearch(list,target);
        verify(result);

    }
    public static boolean recursiveBinarySearch(int[] list, int target){
        int midpoint = 0;
        if(list.length == 0){
            return false;
        }else{
            midpoint = (list.length-1) / 2;
            if(list[midpoint] == target){
                return true;
            } else if (list[midpoint]<target) {
                return recursiveBinarySearch(Arrays.copyOfRange(list,midpoint+1,list.length),target);
            }else {
                return recursiveBinarySearch(Arrays.copyOfRange(list,0,midpoint+1),target);
            }
        }
    }
    public static void verify(boolean result){
        System.out.println("Target found: "+result);
    }

}