package com.PBOALZIDAN;

import java.util.*;

class mahasiswaUPJ{
    String nama;
    String nim;
    String prodi;
    String angkatan;
}

public class TugasPBO {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        mahasiswaUPJ  dataMHS = new mahasiswaUPJ();

        System.out.println("----Silahkan isi data  mahasiswa anda----");
        System.out.print("Nama : ");
        dataMHS.nama = inputUser.next();

        System.out.print("NIM : ");
        dataMHS.nim = inputUser.next();

        System.out.print("Program Studi : ");
        dataMHS.prodi = inputUser.next();

        System.out.print("Angkatan : ");
        dataMHS.angkatan = inputUser.next();

        System.out.println("**************************************");
        System.out.println("Berikut Merupakan Data Mahasiswa Anda");
        System.out.println("**************************************");
        System.out.println("Nama : " + dataMHS.nama);
        System.out.println("NIM : " + dataMHS.nim);
        System.out.println("Program Studi : " + dataMHS.prodi);
        System.out.println("Angkatan : " + dataMHS.angkatan);
    }

}
