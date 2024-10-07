### HAI 👋😁
Ini adalah tugas untuk memenuhi mata kuliah Pemograman Berorientasi Objek
di file ini berisi java interface, pengunaan this dan super, pengunaan casting, dan pengunaan constructor.
saya menggunakan tiga interface yaitu PenulisLepas, PengajarLes dan Mahasiswa yang saya subclasskan di class Anak
## Aplikasi
- IDE NetBeans
- JDK 16

## Kode untuk Interface
### Pengajar Les
    public interface PengajarLes {
    public void mengajar();
    }
### Penulis Lepas
    public interface PenulisLepas {
    public void menulis();
    }
### Mahasiswa
    public interface Mahasiswa {
    public void belajar();
    public void ujian();
    }
## Kode this, super dan penggunaan Contruktor
semua implementasi this, super dan Construktor ada pada method Anak pada kode ini
    
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
## Kode Penggunaan Casting
disini saya melakukan casting pada variabel uang yang ber type data int saya rubah menjadi type  data double
    int uang = 20000;
    System.out.println("Aku memiliki uang "+uang);
    double uangku = (double) uang;
    System.out.println("aku memiliki uang sejumlah " + uangku);
Cukup ini yang bisa yang jelaskan semoga mudah dipahami terimakasih 😁

