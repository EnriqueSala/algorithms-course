
public class Main {
    public static void main(String[] args) {
        verify(11);
    }

    //returns index position of the target if found, else returns none
    public static Integer linearSearch(int[] list, int target){
        for(int number: list){
            if(target == number){
                return number;
            }
        }
        return null;
    }
    public static void verify(Integer index){
        Integer result = linearSearch(new int[]{1,2,3,4,5,6,7,8,9,10},index);
        if( result != null){
            System.out.println("target found at index: "+ result);
        }else{
            System.out.println("target not found");
        }
    }
}