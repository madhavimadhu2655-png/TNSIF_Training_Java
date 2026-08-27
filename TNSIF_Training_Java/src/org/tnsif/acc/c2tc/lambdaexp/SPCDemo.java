package org.tnsif.acc.c2tc.lambdaexp;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SPCDemo {

	public static void main(String[] args) {
		// supplier : No input ,return value
		Supplier<String> supplier = () -> "Hello from Cambridge";
		String supplierValue = supplier.get();
		System.out.println(supplierValue);

		// Predicate :Takes one input ,return boolean value
		Predicate<Integer> eligible = (salary) -> salary >= 30000;
		System.out.println(eligible.test(40000));

		// Consumer :Takes one input , return nothing
		Consumer<String> consumer = message -> System.out.println("consumer received " + message);
		consumer.accept("This is test message");
	}

}