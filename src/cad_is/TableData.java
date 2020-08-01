/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cad_is;

/**
TableData is the data object class that stores the data like Ac_ID, Ac_Name, Ac_Category, Ac_Price, Ac_Recomendation and Range.
* It consists of a parameterized Constructor  i.e. TableData(int Ac_ID, String Ac_Category, String Ac_Name, String Range, double Ac_Price,
  String Ac_Recomendation). 
* Data is passed with the help of Constructor and retrieved with the help of object 
  of the Class and the call of the respective methods for the needed data.
 */
public class TableData {
    private int Ac_ID;
    private String Ac_Name;
    private String Ac_Category;
    private double Ac_Price;
    private String Ac_Recomendation;
    private String Range;

   
    public TableData(int Ac_ID,String Ac_Category, String Ac_Name,String Range, double Ac_Price, String Ac_Recomendation) {
        this.Ac_ID = Ac_ID;
        this.Ac_Name = Ac_Name;
        this.Ac_Category = Ac_Category;
        this.Ac_Price = Ac_Price;
        this.Ac_Recomendation = Ac_Recomendation;
        this.Range = Range;
    }

    public String getRange() { //It returns the range of the Accessory.
        return Range;
    }

    public int getAc_ID() { // It returns the ID of the Accessory.
        return Ac_ID;
    }

    public String getAc_Name() { // It returns the Name of the Accessory.
        return Ac_Name;
    }

    public String getAc_Category() { // It returns the Category of the Accessory.
        return Ac_Category;
    }

    public double getAc_Price() { // It returns the Price of the Accessory.
        return Ac_Price;
    }

    public String getAc_Recomendation() { // It returns the recommendation of the Accessory.
        return Ac_Recomendation;
    }
    
    
    
}
