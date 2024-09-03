package pertemuankeduapbo;

public class PertemuanKeduaPBO {

    public static void main(String[] args) {
        System.out.println("");
        Anak gaga = new Anak();
        gaga.belajar();
        gaga.mengajar();
        gaga.menulis();
        gaga.ujian();
        gaga.getBermain();
        
        int uang = 20000;
        System.out.println("Aku memiliki uang "+uang);
        double uangku = (double) uang;
        System.out.println("aku memiliki uang sejumlah " + uangku);
        
    }

}
