package javaPractise;

import java.util.ArrayList;
import java.util.Scanner;

public class Recursion {
    public static  void getfibo(int a, int b, int n){
        if(n==0 )     return;
        int c= a+b;
        System.out.print(c+" ");
        getfibo(b,c,n-1);
    }
    public  static  void toh( int n, String src, String mid, String des){
        if(n==0) return ;
        toh(n-1,src,des,mid);
        System.out.println( src +" Moving to " + des);
        toh(n-1,mid,src,des);
    }
    public  static   void rev( String st, int idx){
        if(idx==0){
            System.out.print(st.charAt(idx));
            return;
        }
        System.out.print(st.charAt(idx));
        rev(st,idx-1);
    }
    public  static  void getSubsequences( String str, String new_string, int idx){
        if(idx==str.length()){
            System.out.println(new_string);
            return;
        }
        //choose
        getSubsequences(str,new_string+str.charAt((idx)), idx+1 );
        //not choose
        getSubsequences(str, new_string , idx+1);
    }
    public static String [] keypad={".", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public  static void print_KEY_COMBO(String str, int idx ,  String combo){
        if(idx==str.length()){
            System.out.println(combo);
            return;
        }
        char ind_key=str.charAt(idx);
        String map_str=keypad[ind_key-'0']; // converting char into index
        for (int i=0;i<map_str.length();i++){
            print_KEY_COMBO(str,idx+1,combo+map_str.charAt(i));
        }
    }
    public static  void get_permutaion(String str,String result){
        if(str.length()==0){
            System.out.println(result);
            return;
        }
        for( int i=0;i<str.length();i++){
            char chosen=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            get_permutaion(newstr,result+chosen);
        }
    }
    public  static  int maze_rat(int i, int j, int n, int m){
        if(i==n || j==m)    return 0;
        if(i==n-1 && j==m-1)    return 1;
        int right=maze_rat(i,j+1,n,m);
        int down=maze_rat(i+1,j,n,m);
        return right+ down;
    }
    public  static int  place_tile(int n, int m){
        if(n==m)   return 2;
        if(n<m) return 1;
        int vertical_placements=place_tile(n-m,m);
        int horizantal_placement=place_tile(n-1,m);
        return  vertical_placements+horizantal_placement;
    }
    public static int ways_to_invite( int n){
        if(n<=1)    return 1;
        int alone=ways_to_invite(n-1);
        int pair=(n-1)*ways_to_invite(n-2);
        return alone+pair;
    }
    public static void find_subsets(int n, ArrayList<Integer> subsets){
        if(n==0){
            for( int i : subsets){
                System.out.print(i);
            }
            System.out.println();
            return;
        }
        //elements choosen
        subsets.add(n);
        find_subsets(n-1,subsets);
        //not chooosen
       // subsets.remove(subsets.size()-1);
        find_subsets(n-1,subsets);
    }
    public static  void  main(String  [] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Integer> subset= new ArrayList<Integer>();
        find_subsets(n,subset);
    }
}
