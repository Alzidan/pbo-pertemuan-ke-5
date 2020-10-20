package com.PBOALZIDAN;

public class ModulAccessing {

    int x = 5;
    int y;

    public static void main(String[] args){
        ModulAccessing myObj = new ModulAccessing();
        System.out.println(myObj.x);

        //Modify Attributes
        ModulAccessing myObj1 = new ModulAccessing();
        myObj1.y = 40;
        System.out.println(myObj1.y);
    }

}
