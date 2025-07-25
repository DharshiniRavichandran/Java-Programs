package Encapsulation;

class EncasulationUsingGetterSetter {

	private int id = 11;
	private String name = "Ravichandran";

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class GetterAndSetter {

	public static void main(String[] args) {
		
		EncasulationUsingGetterSetter obj = new EncasulationUsingGetterSetter();
		
//	    obj.setId(10);
//	    obj.setName("Dharshini");
	    int id =obj.getId();
	    String name =obj.getName();
	    System.out.println("ID:"+id+" Name:"+name);
	    //Initializing values using setter and getting values using getter
		

	}

}
