package school;

public class Student {

    String name;
    int kehadiran;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiHarian;
    double nilaiAkhir;
    char grade;

    public Student(String name){
        this.name = name;
    }

    public void setUTS(double UTS){
        // range nilai (0-100)
        if (UTS > 100 || UTS < 0){
            System.out.println("Nilai harus ada diantara range 0-100.");
            nilaiUTS = 0;
        }
        else{
            nilaiUTS = UTS;
        }
    }
    public void setUAS(double UAS){
        // range nilai (0-100)
        if (UAS > 100 || UAS < 0){
            System.out.println("Nilai harus ada diantara range 0-100.");
            nilaiUAS = 0;
        }
        else{
            nilaiUAS = UAS;
        }
    }
    public void setHadir(int hadir){
        // maksimun kehadiran 18
        if (hadir > 100 || hadir < 0){
            System.out.println("Kehadiran harus ada diantara range 0-18.");
            kehadiran = 0;
        }
        else{
            kehadiran = hadir;
        }
    }
    public void setNilaiHarian(double harian){
        // range nilai (0-100)
        if (harian > 100 || harian < 0){
            System.out.println("Nilai harus ada diantara range 0-100.");
            nilaiHarian = 0;
        }
        else{
            nilaiHarian = harian;
        }
    }
    public void hitungNilaiAkhir(){
        // kehadiran 10% dari nilai akhir(maks 8 kehadiran)
        // nilai harian 20% dari nilai akhir
        // nilai UTS 30% ari nilai akhir
        // nilai UAS 40% dari nilai akhir
        nilaiAkhir = (kehadiran/18*10) + (nilaiHarian * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }
    public void setGrade(){
        // nilai >=85 grade A 
        // 75 <= nilai akhir < 85 grade B
        // 65 <= nilai akhir < 75 grade C 
        // 55 <= nilai akhir < 65 grade D
        // nilai < 55 grade E
        if( nilaiAkhir >= 85) {
            grade = 'A';
        } else if ( nilaiAkhir >= 75 && nilaiAkhir < 85){
            grade = 'B';
        } else if ( nilaiAkhir >= 65 && nilaiAkhir < 75){
            grade = 'C';
        } else if ( nilaiAkhir >= 55 && nilaiAkhir < 65){
            grade = 'D';
        } else {
            grade = 'E';
        }

    }

    public void getReport(){
        if (nilaiHarian<=0 || nilaiUTS<=0 || nilaiUAS<=0 ||kehadiran<=0 ){
            System.out.println("======================Error!!!============================");
            System.out.println("Salah satu komponen nilai tidak boleh ada yang kosong!");
            System.out.println("==========================================================");
        }
        else{
            this.hitungNilaiAkhir();
            // print nilai akhir
            this.setGrade();
            // print grade
            System.out.println("====================Success!!!=============================");
            System.out.println("Nama: "+ name);
            System.out.println("Nilai akhir anda: "+ nilaiAkhir);
            System.out.println("Dengan Grade: "+ grade);
            System.out.println("==========================================================");
        }
        
    }
}
