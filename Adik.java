/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuankeduapbo;


public class Adik extends Ayah {
    private String bermain;

    
    
    public Adik(){
        System.out.println("Hallo ini Adik");
        super.setNama("Rara");
        super.setUsia(12);
        super.setPendidikan("SD");
        this.setBermain("Bermain Lego");
        this.setMemberiUangSaku("1000");
    
    }
    /**
     * @return the bermain
     */
    public String getBermain() {
        return bermain;
    }

    /**
     * @param bermain the bermain to set
     */
    public void setBermain(String bermain) {
        this.bermain = bermain;
    }
    
}
