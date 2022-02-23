import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        int array[] =new int[] {1 , 2 , 3 , 4 , 5 , 6 , 7 };
        System.out.println("Enter the number of rotations required : ");
        Scanner sc = new Scanner(System.in);
        int noOfRotations = sc.nextInt();

        for(int i = 1 ; i <= noOfRotations ; i++ ){
            int last = array[array.length-1];
            for (int j = array.length-1 ; j > 0 ; j --){
                array[j] = array[j-1];
            }
            array[0] = last;
        }
        System.out.println("Array after rotation : ");
        for (int k = 0; k < array.length ; k++){
            System.out.print(array[k] + "  ");
        }


    }
}
