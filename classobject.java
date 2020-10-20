package com.PBOALZIDAN;


// Membuat Class
class Mahasiswa{
    String nama;
    String NIM;
    String Jurusan;
    double IPK;
    int umur;
}

public class classobject {

    public static void main(String[] args) {

        // Membuat Object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "alzidan";
        mahasiswa1.NIM = "2019071004";
        mahasiswa1.Jurusan = "informatika";
        mahasiswa1.IPK = 3.8;
        mahasiswa1.umur = 19;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.Jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);
    }

}
