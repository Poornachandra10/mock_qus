package mockInterview;

public class Q13_Dog {

	private String name;
	private String breed;

//Write a Java program to create a class called 
//"Dog" with a name and breed attribute. Create two 
//instances of the "Dog" class, set their attributes using 
//the constructor and modify the attributes using the setter
//methods and print the updated values.
	public Q13_Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
public void printdogNameBreeedName() {
System.out.println("**Dog name :"+name+" Breed Name : "+breed);	

}
	public static void main(String[] args) {
		Q13_Dog dog = new Q13_Dog("mani", "wolfDog");
		Q13_Dog dog2 = new Q13_Dog("menu", "bullDog");

		System.out.println(dog.getName() + " is a " + dog.getBreed());
		System.out.println(dog2.getName() + "is a " + dog.getBreed());
		
		
System.out.println("before editing dog name and its breed name");
dog.printdogNameBreeedName();
dog2.printdogNameBreeedName();


		System.out.println("\n After setting new name and breed:");
		dog.setBreed("golden Retriever");
		dog.setName("manu");
		System.out.println(dog.getName() + " is a " + dog.getBreed());
		dog2.setBreed("Labrador");
		dog2.setName("muni");
		System.out.println(dog2.getName() + " is a " + dog2.getBreed());

	}

}
