import java.util.*;
class FindMax extends Thread{
    int[] subarr = new int[250];
    int max;
    FindMax(int start, int end, int[] arr){
        int x = 0;
        for(int i=start ;i<end;i++){
            subarr[x]=arr[i];
            x++;
        }
    }
    @Override
    public void run(){
         max = Arrays.stream(subarr).max().getAsInt();
        
    }
    public int getMax(){
        System.out.println("Max is = "+max);
        return max;
    }
}

public class MaxValue {
    public static void main(String[] args) throws InterruptedException {
        //Generate an array of 1000 elements
        int[] maxarr = new int[4];
        Random rd = new Random();
        int[] arr = new int[1000];
        for(int i=0;i<arr.length;i++){
            arr[i]=rd.nextInt(10000);
        }
        FindMax t1 = new FindMax(0, 250, arr);
        FindMax t2 = new FindMax(250, 500, arr);
        FindMax t3 = new FindMax(500, 750, arr);
        FindMax t4 = new FindMax(750, 1000, arr);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t4.join();
        t1.join();
        t2.join();
        t3.join();
        maxarr[0]=t1.getMax();
        maxarr[1]=t2.getMax();
        maxarr[2]=t3.getMax();
        maxarr[3]=t4.getMax();
        int highest = Arrays.stream(maxarr).max().getAsInt();
        System.out.println("Highest number is "+highest);
        


    }
}
