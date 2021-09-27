public class AbstractFactory {

	public PetSpeciesFactory getSpeciesFactory(String type) {
		if ("mammal".equals(type)) {
			return new MammalFactory();
		} else {
			return new BirdFactory();
		}
	}

}