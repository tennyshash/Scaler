package javaDSA;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

public class ImplementaionHashmap {
    static class myHashMap<k,v>{ // k and v is generic aas we dont knoe the type of it
        private   class node{
        k key;
        v value;
        public node( k key, v value){
            this.key=key;
            this.value=value;
        }
        }
        private int n;//n is no of nodes or key value pair in map;
        private int N;// size of array linked list
        private LinkedList<node> bucket[]; // N this bucket lenght

        public myHashMap(){
            this.N=4;
            this.bucket=new LinkedList[4];
            for( int i=0;i<4;i++){
                this.bucket[i]= new LinkedList<>();
            }
        }
        private int hashFunc(k key){
            int bi = key.hashCode();
            return (Math.abs(bi))%N;
        }
        private int searchLL(k key, int bi){
            LinkedList<node> ll=bucket[bi];
            for( int i=0;i<ll.size();i++){
                if(ll.get(i).key==key)  return i;
            }
            return -1;
        }
        private void rehash(){
            LinkedList<node> oldBucket[]= bucket;
            for (int i=0;i<bucket.length;i++){
                bucket[i]=new LinkedList<>();
            }
            bucket= new LinkedList[N*2];// increasing size of bucket
            for( int i=0;i<oldBucket.length;i++){
                LinkedList<node> ll= oldBucket[i];
                for (int j=0;j<ll.size();j++){
                    node data=ll.get(j);
                    put(data.key,data.value);
                }
            }
        }
        public void put(k key , v value){
            int bi=hashFunc(key);// we created a hash func to give a bucket index(bi) from hashcode;
           // int di=searchLL(key,bi);// getting index of key in javaDSA.LL;
            // alternative of serch function we can use inbuilt search function of Linkedlist
            int di=bucket[bi].indexOf(key);
            if(di==-1){//key not exist
                bucket[bi].add(new node(key, value));
                n++;
            }else{
                node data= bucket[bi].get(di);
                data.value=value;
            }
            double lambda=(double)n/N;
            if(lambda> 2.0){//rehashing
                rehash();
            }
        }
        public boolean contains(k key){
            int bi=hashFunc(key);// we created a hash func to give a bucket index(bi) from hashcode;
            int di=searchLL(key,bi);// getting index of key in javaDSA.LL;
            if(bi==-1){//key not exist
                return false;
            }else{
                return true;
            }
        }
        public v remove(k key){
            int bi=hashFunc(key);// we created a hash func to give a bucket index(bi) from hashcode;
            int di=searchLL(key,bi);// getting index of key in javaDSA.LL;
            if(bi==-1){//key not exist
                return null;
            }else{
                node data= bucket[bi].remove(di); // reove funct is of linked list which return node and the removes node
                n--;
                return data.value;
            }
        }
        public v get(k key){
            int bi=hashFunc(key);// we created a hash func to give a bucket index(bi) from hashcode;
            int di=searchLL(key,bi);// getting index of key in javaDSA.LL;
            if(di==-1){//key not exist
                return null;
            }else{
                node data= bucket[bi].get(di);
                return data.value;
            }
        }
        public boolean isEmpty(){
            return n==0;
        }
        public ArrayList<k> keySet(){
            ArrayList<k> keys=new ArrayList<>();
            for( int i=0;i<bucket.length;i++){
                LinkedList<node> ll=bucket[i];
                for (int j=0;j<ll.size();j++){
                    node data= ll.get(j);
                    keys.add(data.key);
                }
            }
            return keys;
        }

        public static void main(String[] args) {
            myHashMap<Integer ,String>map= new myHashMap<>();
            map.put(25,"Shashwat");
            map.put(22,"Samar");
            map.put(45,"Mummy");
            map.put(50,"daddy");
            //System.out.println(map);
            ArrayList<Integer> key= map.keySet();
            for (int i=0;i<key.size();i++){ // print map
                System.out.println(key.get(i)+"-"+map.get(key.get(i)));
            }
            System.out.println();
            map.remove(25);
            System.out.println(map.get(25));
            System.out.println(map.isEmpty());
        }

    }
}
