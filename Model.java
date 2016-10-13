import java.util.Observable;

public class Model extends Observable {

	public void Cleanup() {
		System.out.println("cleanup");
	}

	public void makeguess() {
		System.out.println("user made the guess");

	}
	
}
