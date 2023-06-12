package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika adit = new Matematika(7,7);
        
        System.out.println("Hasil penjumlahan: "+adit.setPenjumlahan());
        System.out.println("Hasil pengurangan: "+adit.setPengurangan());
        System.out.println("Hasil perkalian: "+adit.setPerkalian());
        System.out.println("Hasil pembagian: "+adit.setPembagian());
    }
}
