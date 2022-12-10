import java.lang.*;
import java.util.*;
class ArrayGenerator extends Thread{
    int []arr = new int[500];
    @Override
    public void run(){
        synchronized(arr){
            Random rd = new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=rd.nextInt(1000);
            }
        }
    }
    public int[] getArray(){

        return arr;
    }
}
class F1 extends Thread{
    int[] arr;
    int n;
    boolean found=false;
    F1(int[] arr, int n){
        this.arr=arr;
        this.n=n;
    }
    @Override
    public void run(){
        int[] arrL=new int[250];
        for(int i=0;i<250;i++){
            arrL[i]=arr[i];
        }
        for(int i=0;i<arrL.length;i++){
            if(n==arrL[i]){
                found = true;
                break;
            }
        }
    }
    public boolean getCheck(){
        return found;
    }
}
class F2 extends Thread{
    int[] arr;
    int n;
    boolean found=false;
    F2(int[] arr, int n){
        this.arr=arr;
        this.n=n;
    }
    @Override
    public void run(){
        int[] arrR=new int[250];
        for(int i=250;i<500;i++){
            arrR[i-250]=arr[i];
        }
        for(int i=0;i<arrR.length;i++){
            if(n==arrR[i]){
                found = true;
                break;
            }
        }
    }
    public boolean getCheck(){
        return found;
    }
}

public class multithreadarraygen {
    public static void main(String[] args) throws InterruptedException  {
        Scanner sc = new Scanner(System.in);
        ArrayGenerator obj = new ArrayGenerator();
        obj.start();
        obj.join();
        int[] arr = obj.getArray();
        System.out.println(arr[1]);
        System.out.println("Enter a number to searhc in the array:");
        int n = sc.nextInt();
        F1 t1=new F1(arr, n);
        F2 t2=new F2(arr, n);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(t1.getCheck()||t2.getCheck()?"Found":"Not Found");


    }
}
