package arrays;
import java.util.Arrays;
import static java.lang.Math.*; // static import
public class ArrayDemo {
	public static void main(String[] args) {
		String[] cities = {"Hyderabad","Mumbai","Chennai","Delhi","Kolkata"};
        int[] arr = new int[30]; // all 0's
        
        // for-each style
        for(String city : cities)
        System.out.print(city+" ");
        
        //populate arr with random number
        for(int i=0; i<arr.length; i++)
        	arr[i] = 1 + (int)(random()*100); // 1 -100
       
        System.out.println();
        for(int i:arr)
        	System.out.print(i+" ");
        
        Arrays.sort(cities); // ASC
        System.out.println();
        for(String s:cities)
        	System.out.print(s+" ");
        	
       int index = Arrays.binarySearch(arr, 99);
       System.out.println(index);
       
	}

}
