package pro.wings.prblms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindSecondHighestNumberFromArrayList {
public static void main(String[] args) {
	ArrayList<Integer>al=new ArrayList<>();
	al.add(72);
	al.add(37);
	al.add(99);
	al.add(5);
	
	System.out.println(al);
	Integer[] a=al.toArray(new Integer[al.size()]);
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	System.out.println(a[a.length-2]);
	
	
}
}
