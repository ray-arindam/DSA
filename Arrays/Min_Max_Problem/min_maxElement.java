package Min_Max_Problem;

import java.util.Scanner;

public class min_maxElement {
    public static void getMinMax(int arr[], int n){
        int min,max;
            if(arr[0]<arr[1]) {
                min = arr[0];
                max = arr[1];
            }
            else{
                min = arr[1];
                max = arr[0];
            }
        for(int i = 2; i<n; i++){
            if(arr[i]<min)
                min = arr[i];
            else if(arr[i]>max)
                max = arr[i];
        }
        System.out.println("Min no: "+min);
        System.out.println("Max no: "+max);
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        int n,i=0;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Number of inputs");
        n = sc.nextInt();
        for(i=0;i<n;i++)
            a[i] = sc.nextInt();
        getMinMax(a,n);

    }
}
