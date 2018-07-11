package datastructure;

import java.util.*;

public class SetMain {

	public static void main(String[] args) {
		TreeSet<String> vegetable = new TreeSet<>();
		vegetable.add("토마토");
		vegetable.add("오이");
		vegetable.add("양배추");
		vegetable.add("가지");
		vegetable.add("토마토");
		
		System.out.println(vegetable);
		
		for(String veg : vegetable) {
			System.out.println(veg);
		}

	}

}
