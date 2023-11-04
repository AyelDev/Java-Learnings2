package com.BehindScreenFunctionalInterfaces;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;




class PrintForEach implements Consumer<Integer>{

	@Override
	public void accept(Integer number) {
		System.out.println(number);
	}
	
}
class EvenNumberPredicate implements Predicate<Integer>{

	@Override
	public boolean test(Integer number) {
		return number%2==0;
	}
}
class SquareMap implements Function<Integer, Integer>{

	@Override
	public Integer apply(Integer number) {
		// TODO Auto-generated method stub
		return number * number ;
	}
	
}

public class LamdaBehindScreenStart {

	public static void main(String[] args) {
		// Topic : Implement Predicate In
		
		List.of(22,33,55,23,21,57,31,24,26).stream()
		.filter(n -> n%2==0)
		.map(n -> n*n)
		.forEach(n -> System.out.println(n));

		//.map(n -> n*n)
		//<R> Stream<R> map(Function<? super T, ? extends R> mapper);
		// R apply(T t);
		
		List.of(22,33,55,23,21,57,31).stream()
		.filter(new EvenNumberPredicate())
		.map(new SquareMap())
		.forEach(new PrintForEach());
		
		//Stream<T> filter(Predicate<? super T> predicate);
		//boolean test(T t);
	}

}
