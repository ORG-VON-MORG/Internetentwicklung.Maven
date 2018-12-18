package de.stl.saar.internetentw1.uebungen;

import org.apache.commons.math3.util.ArithmeticUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MyMath {
    public int add(int a, int b){
        return ArithmeticUtils.addAndCheck(a,b);
    }

    public static void main (String[] args)throws IOException
    {
        File file = new File("resources/test.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
}
