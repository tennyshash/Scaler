package javaDSA;

import java.util.ArrayList;
import java.util.Scanner;

public class Backtracking {
    public static void merge_array( int [] array, int start, int mid, int end){
        int s1=start,e1=mid,s2=mid+1,e2=end;
        //ArrayList<Integer> result= new ArrayList<>();
        int [] result= new int [end-start+1];
        int k=0;
        while( s1<=e1 && s2 <=e2){
            if(array[s1]<=array[s2]){
                result[k++]=array[s1];
                s1++;
            }else{
                result[k++]=array[s2];
                s2++;
            }
        }
        while( s1<=e1){ result[k++]=array[s1]; s1++; }
        while( s2<=e2){ result[k++]=array[s2]; s2++; }

        for( int i=0;i<result.length;i++){
            array[start+i]=result[i];
        }
    }
    public static void divide_array( int [] array , int start, int end){
        if(start>=end)  return;
        int mid=start+((end-start)/2);
        divide_array(array, start,mid);
        divide_array(array,mid+1,end);
        merge_array(array,start,mid,end);
    }
    public  static int sort_pivotAtLast( int [] array , int start, int end){
        int pivot=array[end];
        int i=start-1;
        for (int j=start;j<end;j++){
            if(array[j]<pivot){
                i++;
                //swap
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }//array is sorted according to pivot now getting pivot in its place
        i++;//getting the location to be placed
        int temp= array[i];
        array[i]= array[end];
        array[end]=temp;
        return i;
    }
    public  static  int sort_pivotAtFirst( int [] array, int start, int end){
        int pivot=array[start];
        int s=start+1,e=end;
        while (s<=e){
            if(array[s]<=pivot) s++;
            else if(array[e]>=pivot)    e--;
            else{//swap
                int temp=array[s];
                array[s]=array[e];
                array[e]=temp;
                s++;    e--;
            }
        }
        //swap pivot and array[e]
        int temp = array[e];
        array[e]=pivot;
        array[start]=temp;
        return e;
    }
    public static void quick_sort( int []array, int start, int end){
        // selecting pivot on last end
        if(start<end){
//            int pivot_idx=sort_pivotAtLast(array, start, end);
            int pivot_idx=sort_pivotAtFirst(array,start,end);
            quick_sort(array,start,pivot_idx-1);
            quick_sort(array, pivot_idx+1,end);
        }
    }
    public static void main ( String[] args){
        Scanner sc = new Scanner(System.in);
        //int n =sc.nextInt();
        int [] array= {5,4,77,22,88,0};
        int n=array.length;
        quick_sort(array, 0, n-1);
        for( int i:array) {
            System.out.print(i + " ");
        }
    }
}
