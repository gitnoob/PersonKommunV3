public class DBPerson {
	// Klassenvariable (weil static davor steht)
	static Person[] personList;
	
	// default init
	public static void init(){
		//Instanzvariable instanzieren
		DBPerson.personList = new Person[5];
		
		Person p = new Person(1,"Plüss","Fritz",0);
		DBPerson.personList[0] = p;
		p=new Person(2,"Müller","Karl", 10);
		DBPerson.personList[1] = p;
		p=new Person(3,"Meier","Pauline", 20);	
		DBPerson.personList[2] = p;
		p=new Person(4,"Marti","Eva", 33);
		DBPerson.personList[3] = p;
		p=new Person(5,"Jesus","Gomez", 44);
		DBPerson.personList[4] = p;
	}
	
	public static Person [] GetPersonList (String Name) {
		Person[] _personList;
		int founded = 0;
		
		// init();
		
		//Es wird überprüft ob ein Suchstring übergeben worden ist.
		if(0 == Name.length()) return DBPerson.personList;
		
		//Es wird nach der Anzahl Übereinstimmungen gesucht
		for (int i=0; i < DBPerson.personList.length; i++){
			char _Name = DBPerson.personList[i].getName().toUpperCase().charAt(0);
			if(Name.toUpperCase().charAt(0) == _Name){
				founded++;
			}
		}
		
		//Ist die Anzahl gleich dem Original, so wird das Original zurückgegeben.
		if(DBPerson.personList.length -1 == founded) return DBPerson.personList;

		//interne Liste gleich der Anzahl gefundenen erstellen.
		_personList = new Person[founded];
		founded = 0;
				
		//Gefundene Personen übertragen ins interne Array.
		for (int i=0; i < DBPerson.personList.length; i++){
			char _Name = DBPerson.personList[i].getName().toUpperCase().charAt(0);
			if(Name.toUpperCase().charAt(0) == _Name){
				_personList[founded++] = DBPerson.personList [i];
			}
		}	
	return _personList;
	}
	
	public static Person GetPersonByID(int PersonId) {
	
		//Set up a retourn value
		Person _person = null;
		
		switch (PersonId)
		{
			case 1: _person = DBPerson.personList[0]; break;
			case 2: _person = DBPerson.personList[1]; break;
			case 3: _person = DBPerson.personList[2]; break;
			case 4: _person = DBPerson.personList[3]; break;
			case 5: _person = DBPerson.personList[4]; break;
			default: _person = new Person(); break;
		}
		return _person;
/*		
		for (int i=0; i< DBPerson.personList.length - 1; i++){
			if(DBPerson.personList[i].getId() == PersonID) {
			_person = DBPerson.personList [i];
			break;
			}
		}	
		return _person;
		*/		
	}
	
        
        public static boolean UpdatePerson(Person _person){
            DBPerson.personList[_person.getId()-1] = _person;         
            return true;        
        }
        
        public static boolean InsertPerson(Person _person){
            Person[] _personList = new Person[DBPerson.personList.length];
				
		for (int i=0; i < DBPerson.personList.length; i++){
                    _personList[i] = DBPerson.personList [i];
		}
            DBPerson.personList = new Person[_personList.length+1];
				
		for (int i=0; i < _personList.length; i++){
                    DBPerson.personList[i] = _personList [i];
            }
            _person.setId(DBPerson.personList.length);
            DBPerson.personList[DBPerson.personList.length-1] = _person;
            return true;
        }
        
}