package IOStreams;
import java.io.Serializable;

public class StudentSerial implements Serializable{

	int id;
	String name;
	public StudentSerial(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

}
