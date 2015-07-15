
package org.mypackage.hello;
    
public class NameHandler {
    
    private String name;
    private String date;
    private String ad;
    
    public NameHandler(){
        
        name = "";
        date = "";
        ad = "";
        

    } // end constructor NameHandler

   
    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        this.name = name;
    }

    
    public String getDate() {
        return date;
    }

    
    public void setDate(String date) {
        this.date = date;
    }

    
    public String getAd() {
        return ad;
    }

    
    public void setAd(String ad) {
        this.ad = ad;
    }

} // end class NameHandler



