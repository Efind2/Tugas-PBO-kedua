/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuankeduapbo;

/**
 *
 * @author Achmad
 */
public class Aku extends Ayah implements Mahasiswa, PengajarLes, PenulisLepas {
    
    public Aku(){
        System.out.println("Hallo ini dengan aku sendiri");
        super.setNama("Gaga");
        super.setUsia(18);
        super.setPendidikan("Perguruan Tinggi");
    
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
    
}
