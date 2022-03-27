package com.StringConverter.se.Library.LetterRussia.Small;
import com.StringConverter.se.WorkClasses.WriterTXT;

public class Rus25SHs
{
    /**САМА СОБОЙ
     * в столбик
     */
    public void Write(int shrift)
    {
        WriterTXT writerTXT = new WriterTXT();

        //Строка0
        for(int q = 0; q<shrift; q++)
        {
            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT("шш");
            }

            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT("   ");
            }

            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT("шш");
            }

            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT(" ");
            }
            writerTXT.writeNewString();
        }

        //Строка1
        for(int q = 0; q<shrift; q++)
        {
            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT("шш");
            }

            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT(" ");
            }

            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT("ш");
            }

            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT(" ");
            }

            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT("шш");
            }

            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT(" ");
            }
            writerTXT.writeNewString();
        }

        //Строка2
        for(int q = 0; q<shrift; q++)
        {
            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT("шш");
            }

            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT(" ");
            }

            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT("ш");
            }

            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT(" ");
            }

            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT("шш");
            }

            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT(" ");
            }
            writerTXT.writeNewString();
        }

        //Строка3
        for(int q = 0; q<shrift; q++)
        {
            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT("шш");
            }

            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT(" ");
            }

            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT("ш");
            }

            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT(" ");
            }

            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT("шш");
            }

            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT(" ");
            }
            writerTXT.writeNewString();
        }

        //Строка4
        for(int q = 0; q<shrift; q++)
        {
            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT("шшшшшшш");
            }

            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT(" ");
            }
            writerTXT.writeNewString();
        }

        //Строка5
        for(int q = 0; q<shrift; q++)
        {
            for (int w = 0; w < shrift; w++)
            {
                writerTXT.writeTXT("        ");
            }
            writerTXT.writeNewString();
        }

    }


    /**
     * в одну строку
     */
    public String returnWrite(int shrift, int stringNumber)
    {
        String str = "";
        //Строка0
        if(stringNumber == 0)
        {
            for (int q = 0; q < shrift; q++)
            {
                str += "        ";
            }
        }

        //Строка1
        if(stringNumber == 1)
        {
            for (int q = 0; q < shrift; q++)
            {
                str += "        ";
            }
        }

        //Строка2
        if(stringNumber == 2)
        {
            for (int q = 0; q < shrift; q++)
            {
                str += "        ";
            }
        }

        //Строка3
        if(stringNumber == 3)
        {
            for (int q = 0; q < shrift; q++)
            {
                str += "        ";
            }
        }

        //Строка4
        if(stringNumber == 4)
        {
            for (int q = 0; q < shrift; q++)
            {
                str += "        ";
            }
        }

        //Строка5
        if(stringNumber == 5)
        {
            for (int w = 0; w < shrift; w++)
            {
                str += "шш";
            }

            for (int w = 0; w < shrift; w++)
            {
                str += "   ";
            }

            for (int w = 0; w < shrift; w++)
            {
                str += "шш";
            }

            for (int w = 0; w < shrift; w++)
            {
                str += " ";
            }
        }

        //Строка6
        if(stringNumber == 6)
        {
            for (int w = 0; w < shrift; w++)
            {
                str += "шш";
            }

            for (int w = 0; w < shrift; w++)
            {
                str += " ";
            }

            for (int w = 0; w < shrift; w++)
            {
                str += "ш";
            }

            for (int w = 0; w < shrift; w++)
            {
                str += " ";
            }

            for (int w = 0; w < shrift; w++)
            {
                str += "шш";
            }

            for (int w = 0; w < shrift; w++)
            {
                str += " ";
            }
        }

        //Строка7
        if(stringNumber == 7)
        {
            for (int w = 0; w < shrift; w++)
            {
                str += "шш";
            }

            for (int w = 0; w < shrift; w++)
            {
                str += " ";
            }

            for (int w = 0; w < shrift; w++)
            {
                str += "ш";
            }

            for (int w = 0; w < shrift; w++)
            {
                str += " ";
            }

            for (int w = 0; w < shrift; w++)
            {
                str += "шш";
            }

            for (int w = 0; w < shrift; w++)
            {
                str += " ";
            }
        }

        //Строка8
        if(stringNumber == 8)
        {
            for (int w = 0; w < shrift; w++)
            {
                str += "шш";
            }

            for (int w = 0; w < shrift; w++)
            {
                str += " ";
            }

            for (int w = 0; w < shrift; w++)
            {
                str += "ш";
            }

            for (int w = 0; w < shrift; w++)
            {
                str += " ";
            }

            for (int w = 0; w < shrift; w++)
            {
                str += "шш";
            }

            for (int w = 0; w < shrift; w++)
            {
                str += " ";
            }
        }

        //Строка9
        if(stringNumber == 9)
        {
            for (int w = 0; w < shrift; w++)
            {
                str += "шшшшшшш";
            }

            for (int w = 0; w < shrift; w++)
            {
                str += " ";
            }
        }

        //Строка10
        if(stringNumber == 10)
        {
            for (int w = 0; w < shrift; w++)
            {
                str += "        ";
            }
        }

        //Строка11
        if(stringNumber == 11)
        {
            for (int w = 0; w < shrift; w++)
            {
                str += "        ";
            }
        }

        //Строка12
        if(stringNumber == 12)
        {
            for (int w = 0; w < shrift; w++)
            {
                str += "        ";
            }
        }
        return str;
    }
}
