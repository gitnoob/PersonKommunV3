/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author melias
 */
public class DBAddress {

    // Klassenvariable (weil static davor steht)
	static Address[] addressList;
	
	// default init
	public static void init(){
		//Instanzvariable instanzieren
		DBAddress.addressList = new Address[5];
		
		Address p = new Address(1,"Jurastrasse","7", "4500", "Solothurn");
		DBAddress.addressList[0] = p;
		p=new Address(2,"");
		DBAddress.addressList[1] = p;
		p=new Address(3,"Meier","Pauline", 20);	
		DBAddress.addressList[2] = p;
		p=new Address(4,"Marti","Eva", 33);
		DBAddress.addressList[3] = p;
		p=new Address(5,"Jesus","Gomez", 44);
		DBAddress.addressList[4] = p;
	}
	
	public static Address [] GetAddressList (String _address) {
		Address[] _addressList;
		int founded = 0;
		
		// init();
		
		//Es wird überprüft ob ein Suchstring übergeben worden ist.
		if(0 == _address.length()) return DBAddress.addressList;
		
		//Es wird nach der Anzahl Übereinstimmungen gesucht
		for (int i=0; i < DBAddress.addressList.length; i++){
			//char _Name = DBAddress.addressList[i].getName().toUpperCase().charAt(0);
			if(DBAddress.addressList[1].getSearchString(_address)){
				founded++;
			}
		}
		
		//Ist die Anzahl gleich dem Original, so wird das Original zurückgegeben.
		if(DBAddress.addressList.length -1 == founded) return DBAddress.addressList;

		//interne Liste gleich der Anzahl gefundenen erstellen.
		_addressList = new Address[founded];
		founded = 0; //laufveriable zurücksetzen
				
		//Gefundene Adressen übertragen ins interne Array.
		for (int i=0; i < DBAddress.addressList.length; i++){
			char _Name = DBAddress.addressList[i].getAddress().toUpperCase().charAt(0);
			if(_address.toUpperCase().charAt(0) == _Name){
				_addressList[founded++] = DBAddress.addressList [i];
			}
		}	
	return _addressList;
	}
	
	public static Address GetAddressByID(int AddressId) {
	
		//Set up a retourn value
		Address _Address = null;
		
		switch (AddressId)
		{
			case 1: _Address = DBAddress.addressList[0]; break;
			case 2: _Address = DBAddress.addressList[1]; break;
			case 3: _Address = DBAddress.addressList[2]; break;
			case 4: _Address = DBAddress.addressList[3]; break;
			case 5: _Address = DBAddress.addressList[4]; break;
			default: _Address = new Address(); break;
		}
		return _Address;
/*		
		for (int i=0; i< DBAddress.addressList.length - 1; i++){
			if(DBAddress.addressList[i].getId() == AddressID) {
			_Address = DBAddress.addressList [i];
			break;
			}
		}	
		return _Address;
		*/		
	}
	
        
        public static boolean UpdateAddress(Address _Address){
            DBAddress.addressList[_Address.getId()-1] = _Address;         
            return true;        
        }
        
        public static boolean InsertAddress(Address _Address){
            Address[] _addressList = new Address[DBAddress.addressList.length];
				
		for (int i=0; i < DBAddress.addressList.length; i++){
                    _addressList[i] = DBAddress.addressList [i];
		}
            DBAddress.addressList = new Address[_addressList.length+1];
				
		for (int i=0; i < _addressList.length; i++){
                    DBAddress.addressList[i] = _addressList [i];
            }
            _Address.setId(DBAddress.addressList.length);
            DBAddress.addressList[DBAddress.addressList.length-1] = _Address;
            return true;
        }
        
}
    
