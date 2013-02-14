/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author melias
 */
public class AddressBLL {
	
	// default Konstruktor
	AddressBLL (){
	}
	
	public static Address [] GetAddressList (String _address) {

		Address[] _addressList = DBAddress.GetAddressList(_address);
		
		return _addressList;
	}
	
	public static Address GetAddressByID(int AddressId) {
		Address _Address = DBAddress.GetAddressByID(AddressId);
		return _Address;
	}
        
        public boolean UpdateAddress(Address _Address){
            return DBAddress.UpdateAddress(_Address);
        }
        
        public boolean InsertAddress(Address _Address){
            return DBAddress.InsertAddress(_Address);
        }
        
        public boolean SaveAddress (Address _Address){
            boolean rc;
            if(0 > _Address.getId()){
                rc =InsertAddress(_Address);
            } else {
                rc = UpdateAddress(_Address);            
            }
            return rc;
        }  
}
