public class BirdFactory extends PetSpeciesFactory{

	public Animal getAnimal(String type) {
	if ("owls".equals(type)) {
		return new Owls();
	} else {
		return new Mallard();
	}
 }

}