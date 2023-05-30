
public class Main {

	public static void main(String[] args) {

		
		//generics
		
		//Integer[] intArray = {1,2,3,4,5,6};
		//Double[] doubleArray= {1.2,2.2,3.45,4.1};
		//Character[] charArray= {'H','I'};
		//String[]	stringArray= {"Hello", "Bye"};
		String name = "Josh";
		Integer age=22;
		Double wealth=67421.24;
		
		GenericClass <String>nameExample;
		GenericClass <Integer>ageExample;
		GenericClass <Double>wealthExample;

		nameExample = new GenericClass<String>(name);
		ageExample = new GenericClass<Integer>(age);
		wealthExample = new GenericClass<Double>(wealth);
		
		System.out.println(nameExample.getValue());
		System.out.println(ageExample.getValue());
		System.out.println(wealthExample.getValue());
		
		/*
		displayArray(intArray);
		displayArray(doubleArray);
		displayArray(charArray);
		displayArray(stringArray);
		System.out.println(getFirstElement(intArray));
		System.out.println(getFirstElement(doubleArray));
		System.out.println(getFirstElement(charArray));
		System.out.println(getFirstElement(stringArray));
		System.out.println(stringArray[0].charAt(0));
*/
		
		
		//bounded Types
		
		Double exampleNumber=4.0;
		GenericNumber boundedExample = new GenericNumber(exampleNumber);
		System.out.println(boundedExample.getValue());
		
	}
	
	public static <T> void displayArray(T[] array) {
		
		for(T x : array) {
			System.out.print(x+" ");
			
		}
		System.out.println();//newLine after each array
	}
	
	public static <T> T getFirstElement(T[] array) {
		return array[0];
	}
	
	

}
