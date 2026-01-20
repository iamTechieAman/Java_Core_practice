package Methods;

public class test {
    public static void main(String args[]){
        int[] arr={1,3,5,7,8,0,9,34,3,2,8};
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(2*sum);
    }
}
