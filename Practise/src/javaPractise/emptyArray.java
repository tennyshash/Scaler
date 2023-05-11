package javaPractise;

import java.util.*;
public class emptyArray {
    static int findGCD(int a, int b)
    {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }
    public static int empty(int []arr, int i , int j){
        //base condition
        if(i>j) return  0;
        int ans=0;
        int m=(i+j+1)/2;
        int cost1=findGCD(arr[i],arr[j])+empty(arr,i+1,j-1);
        int cost2=findGCD(arr[i],arr[m])+empty(arr,i+1,m-1)+empty(arr,m+1,j);
        int cost3=findGCD(arr[m],arr[j])+empty(arr,m+1,j-1)+empty(arr,i,m-1);
        ans=Math.min(Math.min(cost1,cost2),cost3);
        return  ans;
    }
    public static void main(String[] args) {
        int []arr= {18468,6335,26501,19170,15725,11479};
        Arrays.sort(arr);
        int n=arr.length;
        int x=empty(arr,0,n-1);
        System.out.println(x);
    }
}
