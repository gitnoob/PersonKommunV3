/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author melias
 * Miguel Elias
 * nobody.su@gmail.com
 */
public class Address {
    
    //Instanzveriablen
    private int id;
    private String strasse;
    private String hausnummer;
    private String plz;
    private String ort;
    
    //Default-Konstruktor
    public Address() {
        id = -1;
        strasse = "";
        hausnummer = "";
        plz = "";
        ort = "";
    }
    
    //Konstruktor mit Parametern
    public Address(int _id, String _strasse, String _hausnummer, String _plz, String _ort) {
        
        id = _id;
        strasse = _strasse;
        hausnummer = _hausnummer;
        plz = _plz;
        ort = _ort;               
    }
    
    // get / set ID
    public void setId(int _id){
		id = _id;
	}
	
	public int getId(){
		return id;
	}
    // get / set Strasse        
        public void setStrasse(String _strasse){
            strasse = _strasse;
        }
        
        public String getStrasse(){
            return strasse;
        }
    // get / set Hausnummer
        public void setHausnummer(String _hausnummer){
            hausnummer  = _hausnummer;
        }
        
        public String getHausnummer(){
            return hausnummer;
        }
    // get / set PLZ    
        public void setPlz(String _plz){
            plz  = _plz;
        }
        
        public String getPlz(){
            return plz;
        }
    // get / set Ort
        public void setOrt(String _ort){
            ort  = _ort;
        }
        
        public String getOrt(){
            return ort;
        }
        
        public boolean getSearchString(String _searchString){
            
            return (strasse+hausnummer+plz+ort).contains(_searchString);  
        }
}
