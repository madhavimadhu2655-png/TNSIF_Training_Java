package org.tnsif.acc.c2tc.generics;

class DataContainer<T>
{
	private T data;

public DataContainer(T data)
{
	this.data=data;
}
public T getData()
{
	return data;
}
public void displayData()
{
	System.out.println("Data type " +data.getClass().getSimpleName());
	System.out.println("Data Value "+data);
}
}

public class GenericClass {

	public static void main(String[] args) {
		DataContainer<Integer> integerContainer=new DataContainer<>(123);
		integerContainer.displayData();
		
		DataContainer<String> integerContainer1=new DataContainer<>("Java Generics");
		integerContainer1.displayData();
		
		DataContainer<Double> integerContainer2=new DataContainer<>(11.32452);
		integerContainer2.displayData();

	}

}