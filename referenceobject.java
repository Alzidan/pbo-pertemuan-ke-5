package com.PBOALZIDAN;

class Buku{
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul=judul;
        this.penulis=penulis;
    }

    void display(){
        System.out.println("\nJudul\t: "+this.judul);
        System.out.println("\nPenulis\t: "+this.penulis);
    }
}

public class referenceobject {

    public static void main(String[] args) {
        Buku dataBuku1 = new Buku("forrest gump","gumpo");


        dataBuku1.display();


        String addressBuku1 = Integer.toHexString(System.identityHashCode(dataBuku1));
        System.out.println(addressBuku1);

        //assignment object
        Buku databuku2 = dataBuku1;
        databuku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(databuku2));
        System.out.println(addressBuku2);
        //karena buku1 dan buku2 berada pada 1 address yang sama
        databuku2.judul="run forrest run";
        dataBuku1.display();
        databuku2.display();

        //kita akan memasukkan object ke dalam methods
        fungsi(databuku2);
        dataBuku1.display();
        databuku2.display();
    }

    public static void fungsi(Buku databuku){
        String addressDataBuku = Integer.toHexString(System.identityHashCode(databuku));
        System.out.println("address dalam fungsi "+addressDataBuku);
        databuku.penulis = "gumpo";
    }

}
