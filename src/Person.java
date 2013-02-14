public class Person {
	// Attribute
	private int id;
	private String name;
	private String vorname;
	private int alter;
	//Default Konstruktur
	public Person(){
		id = -1;
		name = "no name";
		vorname = "nothing";
		alter = -1;
	}
	//Konstruktur mit Parametern
	public Person(int _id, String _name, String _vorname, int _alter){
		id = _id;
		name = _name;
		vorname = _vorname;
		alter = _alter;
	}
	public void setId(int _id){
		id = _id;
	}
	
	public int getId(){
		return id;
	}
	
	//SetName
	public void setName(String _name){
		name = _name;
	}
	//GetName
	public String getName(){
		return name;
	}	
	
	public void setVorname(String _vorname){
		vorname = _vorname;
	}

	public String getVorname(){
		return vorname;
	}	
	
	public void setAlter(int _alter){
		alter = _alter;
	}

	public int getAlter(){
		return alter;
	}	
	
	public String getFullName(){
		return name + " " + vorname;
	}
}