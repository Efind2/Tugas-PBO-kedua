package pertemuankeduapbo;

public class PertemuanKeduaPBO {

    public static void main(String[] args) {
        Adik Rara = new Adik();

        System.out.println("Nama saya : " + Rara.getNama() + " |Umur : " + Rara.getUsia()+  " Sedang "+ Rara.getBermain());
        System.out.println(Rara.getMemberiUangSaku());
        System.out.println("");
        Ayah Kohan = new Ayah();
        System.out.println("Nama saya : " + Kohan.getNama() + " |Umur : " + Kohan.getUsia() + " |Pekerjaan :" + Kohan.getPekerjaan() + " |Pendidikan :" + Kohan.getPendidikan() +  " dan memberi uang saku anak " + Kohan.getMemberiUangSaku());
        
        System.out.println("");
        Kakek Bohan = (Kakek) Kohan;
        System.out.println("Nama saya : " + Bohan.getNama() + " |Umur : " + Bohan.getUsia() + " |Aset :" + Bohan.getAset());

        System.out.println("");
        Aku Gaga = new Aku();
        Gaga.belajar();
        Gaga.mengajar();
        Gaga.menulis();
        Gaga.ujian();
        int uang = 20000;
        System.out.println(uang);
        double uangku = (double) uang;
        System.out.println("aku memiliki uang sejumlah "+uangku);
    }

}
