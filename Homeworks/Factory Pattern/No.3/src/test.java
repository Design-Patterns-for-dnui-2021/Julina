
public class test {

public static void main(String[] args) {
	
	AbstractFactory abstractFactory = new AbstractFactory();

	PetSpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory("mammal");
	Animal p1 = speciesFactory1.getAnimal("dog");
	System.out.println("Dog: " + p1.makeSound());
	Animal p2 = speciesFactory1.getAnimal("cat");
	System.out.println("Cat: " + p2.makeSound());
	
	PetSpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory("bird");
	Animal p3 = speciesFactory2.getAnimal("owls");
	System.out.println("Owl: " + p3.makeSound());
	Animal p4 = speciesFactory2.getAnimal("mallard");
	System.out.println("Mallard: " + p4.makeSound());

	}

}


