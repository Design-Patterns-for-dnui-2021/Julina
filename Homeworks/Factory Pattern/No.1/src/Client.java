
public class Client {

	public static void main(String[] args) {
		
		TVFactory factory;
        TV tv;

      
        factory = new HaierTV();
        tv = factory.produceTV();
        tv.play();

      
        factory = new HisenseTVFactory();
        tv = factory.produceTV();
        tv.play();
    }

}


