

public class PersonBLL {
	// Attribute
	Person[] personList;
	
	// default Konstruktor
	PersonBLL (){
	}
	
	public static Person [] GetPersonList (String Name) {

		Person[] _personList = DBPerson.GetPersonList(Name);
		
		return _personList;
	}
	
	public static Person GetPersonByID(int PersonId) {
		Person _person = DBPerson.GetPersonByID(PersonId);
		return _person;
	}
        
        public boolean UpdatePerson(Person _person){
            return DBPerson.UpdatePerson(_person);
        }
        
        public boolean InsertPerson(Person _person){
            return DBPerson.InsertPerson(_person);
        }
        
        public boolean SavePerson (Person _person){
            boolean rc;
            if(0 > _person.getId()){
                rc =InsertPerson(_person);
            } else {
                rc = UpdatePerson(_person);            
            }
            return rc;
        }
}