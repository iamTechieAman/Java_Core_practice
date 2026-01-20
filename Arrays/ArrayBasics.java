package Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
//       int[] x = {6,19,7,69,9,171,5};
//        // indexing
//        System.out.println(x[5]); // access
//        // updating elements - mutability
//        x[3] = 89;
//        System.out.println(x[3]);
        int[] arr = new int[4]; // 4 size ka array | 0 to 3
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 150;
        arr[3] = -8;
        System.out.println(arr[1]);

        String[] cars={"ford","Bmw","Lambo"};
        cars[0]="s";
        System.out.println(cars[0]);
        String[] Cars= new String[3];// 0 to n-1 - 0 to 2-1=1;
        Cars[0]="first";
        Cars[1]="Second";
        Cars[2]="third";
        System.out.println(Cars[0]);

    }
}
