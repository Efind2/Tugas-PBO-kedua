/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuankeduapbo;

/**
 *
 * @author Achmad
 */
public class Anak extends Ayah implements Mahasiswa, PengajarLes, PenulisLepas {
    public void makan(){
        System.out.println("Sedang Makan Bakso");
    }
    private String bermain;
    
    public Anak() {
        System.out.println("Hallo ini dengan aku sendiri");
        this.setBermain("sedang Bermain Robot-Robotan");
        super.setNama("Gaga");
        this.makan();
        super.makan();
        
        

    }

    @Override
    public void belajar() {
        System.out.println("Aku belajar dengan benar");
    }

    @Override
    public void ujian() {
        System.out.println("Aku sedang Ujian");
    }

    @Override
    public void mengajar() {
        System.out.println("Aku mengajar");
    }

    @Override
    public void menulis() {
        System.out.println("Aku sedang menulis");
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
