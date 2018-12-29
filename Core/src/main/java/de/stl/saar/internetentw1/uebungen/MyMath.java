package de.stl.saar.internetentw1.uebungen;

import org.apache.commons.math3.util.ArithmeticUtils;

import java.io.*;

public class MyMath {
    public int add(int a, int b){
        return ArithmeticUtils.addAndCheck(a,b);
    }

    public static void main (String[] args)throws IOException
    {
        System.out.println("Hauptklasse");
        InputStream inputStream = MyMath.class.getResourceAsStream("/test.txt");




        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);

    }
}
