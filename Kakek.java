/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuankeduapbo;

public class Kakek {

    private String nama;
    private int usia;
    private String pekerjaan;
    private String aset;
    
    public Kakek(){
        System.out.println("Hallo ini Kakek");
        this.setNama("Bohan");
        this.setUsia(67);
        this.setAset("Toko Kelontong");
        this.setPekerjaan("Wirausaha");
        
        
    }

    public void merayakanTradisi() {

    }

    /**
     * @return the aset
     */
    public String getAset() {
        return aset;
    }

    /**
     * @param aset the aset to set
     */
    public void setAset(String aset) {
        this.aset = aset;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    /**
     * @param pekerjaan the pekerjaan to set
     */
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the usia
     */
    public int getUsia() {
        return usia;
    }

    /**
     * @param usia the usia to set
     */
    public void setUsia(int usia) {
        this.usia = usia;
    }

}
