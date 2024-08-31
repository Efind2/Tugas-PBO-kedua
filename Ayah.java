/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuankeduapbo;

/**
 *
 * @author Achmad
 */
public class Ayah extends Kakek {

    private String memberiUangSaku;
    private String pendidikan;

    public Ayah() {
        System.out.println("Hallo Ini Ayah");
        super.setNama("Kohan");
        super.setPekerjaan("Guru");
        super.setUsia(35);
        this.setMemberiUangSaku("Rp. 100.000");
        this.setPendidikan("SMA");
        
        

    }

    /**
     * @return the memberiUangSaku
     */
    public String getMemberiUangSaku() {
        return memberiUangSaku;
    }

    /**
     * @param memberiUangSaku the memberiUangSaku to set
     */
    public void setMemberiUangSaku(String memberiUangSaku) {
        this.memberiUangSaku = memberiUangSaku;
    }

    /**
     * @return the pendidikan
     */
    public String getPendidikan() {
        return pendidikan;
    }

    /**
     * @param pendidikan the pendidikan to set
     */
    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

}
