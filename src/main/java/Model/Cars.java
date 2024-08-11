/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
/**
 *
 * @author Benji
 */
public class Cars implements java.io.Serializable{
    private String Brand;
    private String Model; 
    private String Colour;
    private String Rego;
    private int Year;
       public Cars(String Brand, String Model, String Colour, String Rego, int Years){
           this.Brand = Brand;
           this.Model = Model;
           this.Colour = Colour;
           this.Rego = Rego; 
           this.Year = Year;
       }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public String getRego() {
        return Rego;
    }

    public void setRego(String Rego) {
        this.Rego = Rego;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }
       
}
