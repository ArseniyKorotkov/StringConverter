package com.StringConverter.se.WorkClasses;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class WriterTXT
{
    public void writeTXT(String TXT)
    {
        try
        {
            File myFile = new File("StringConverterFile.txt");
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
            writer.print(TXT);
            writer.close();
        }
        catch (Exception e)
        {
            System.err.println("Error");
        }
    }

    public void writeNewString()
    {
        try
        {
            File myFile = new File("StringConverterFile.txt");
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
            writer.println();
            writer.close();
        }
        catch (Exception e)
        {
            System.err.println("Error");
        }
    }
}
