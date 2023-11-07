package com.Concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapStart {

	public static void main(String[] args) {
		
		ConcurrentMap<Character, LongAdder> occurances = new ConcurrentHashMap<>();
		String string = "THE BROWN FOX";
		for(char character:string.toCharArray()) {
			occurances.computeIfAbsent(character, ch -> new LongAdder()).increment();;
//			LongAdder longAdder = occurances.get(character);
//			if(longAdder == null) {
//				longAdder = new LongAdder();
//			}
//			longAdder.increment();
//			occurances.put(character, longAdder);
		}
		System.out.println(occurances);
		

	}

}
