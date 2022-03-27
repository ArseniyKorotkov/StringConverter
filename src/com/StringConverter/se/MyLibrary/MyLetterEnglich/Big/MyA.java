package com.StringConverter.se.MyLibrary.MyLetterEnglich.Big;
import com.StringConverter.se.WorkClasses.WriterTXT;

public class MyA
{
    /**УКАЗАННЫМИ СИМВОЛАМИ
     * в столбик
     */
    public void Write(int shrift, String txt, String spc,int txtLength)
    {
        WriterTXT writerTXT = new WriterTXT();

        //Строка0
        for (int q = 0; q < shrift*txtLength; q++)
        {
            for (int w = 0; w < shrift*txtLength; w++)
            {
                writerTXT.writeTXT(spc + spc + spc + spc + spc + spc + spc + spc);
            }
            writerTXT.writeNewString();
        }


        //Строка1
        for(int q = 0; q<shrift*txtLength; q++)
        {
            for(int w = 0; w<shrift*txtLength; w++)
            {
                writerTXT.writeTXT(spc);
            }

            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT(txt + txt + txt + txt + txt);
            }

            for(int w = 0; w<shrift*txtLength; w++)
            {
                writerTXT.writeTXT(spc + spc);
            }
            writerTXT.writeNewString();
        }

        //Строка2
        for(int q = 0; q<shrift*txtLength; q++)
        {
            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT(txt + txt);
            }

            for(int w = 0; w<shrift*txtLength; w++)
            {
                writerTXT.writeTXT(spc + spc + spc);
            }

            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT(txt + txt);
            }

            for(int w = 0; w<shrift*txtLength; w++)
            {
                writerTXT.writeTXT(spc);
            }
            writerTXT.writeNewString();
        }

        //Строка3
        for(int q = 0; q<shrift*txtLength; q++)
        {
            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT(txt + txt + txt + txt + txt + txt + txt);
            }

            for(int w = 0; w<shrift*txtLength; w++)
            {
                writerTXT.writeTXT(spc);
            }

            writerTXT.writeNewString();
        }

        //Строка4
        for(int q = 0; q<shrift*txtLength; q++)
        {
            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT(txt + txt);
            }

            for(int w = 0; w<shrift*txtLength; w++)
            {
                writerTXT.writeTXT(spc + spc + spc);
            }


            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT(txt + txt);
            }

            for(int w = 0; w<shrift*txtLength; w++)
            {
                writerTXT.writeTXT(spc);
            }

            writerTXT.writeNewString();
        }

        //Строка5
        for(int q = 0; q<shrift*txtLength; q++)
        {
            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT(txt + txt);
            }

            for(int w = 0; w<shrift*txtLength; w++)
            {
                writerTXT.writeTXT(spc + spc + spc);
            }


            for(int w = 0; w<shrift; w++)
            {
                writerTXT.writeTXT(txt + txt);
            }

            for(int w = 0; w<shrift*txtLength; w++)
            {
                writerTXT.writeTXT(spc);
            }
            writerTXT.writeNewString();
        }
    }

    /**
     * в одну строку
     */
    public String returnWrite(int shrift, int stringNumber,String txt, String spc, int txtLength)
    {
        String str = "";
        //Строка0
        if(stringNumber == 0)
        {
            for (int q = 0; q < shrift*txtLength; q++)
            {
                str += (spc + spc + spc + spc + spc + spc + spc + spc);
            }
        }

        //Строка1
        if(stringNumber == 1)
        {
            for (int w = 0; w < shrift*txtLength; w++)
            {
                str += (spc);
            }

            for (int w = 0; w < shrift; w++)
            {
                str += (txt + txt + txt + txt + txt);
            }

            for (int w = 0; w < shrift*txtLength; w++)
            {
                str += (spc + spc);
            }
        }

        //Строка2
        if(stringNumber == 2)
        {
            for (int w = 0; w < shrift; w++)
            {
                str += (txt + txt);
            }

            for (int w = 0; w < shrift*txtLength; w++)
            {
                str += (spc + spc + spc);
            }

            for (int w = 0; w < shrift; w++)
            {
                str += (txt + txt);
            }

            for (int w = 0; w < shrift*txtLength; w++)
            {
                str += (spc);
            }
        }

        //Строка3
        if(stringNumber == 3)
        {
            for (int w = 0; w < shrift; w++)
            {
                str += (txt + txt + txt + txt + txt + txt + txt);
            }

            for (int w = 0; w < shrift*txtLength; w++)
            {
                str += (spc);
            }
        }

        //Строка4
        if(stringNumber == 4)
        {
            for (int w = 0; w < shrift; w++)
            {
                str += (txt + txt);
            }

            for (int w = 0; w < shrift*txtLength; w++)
            {
                str += (spc + spc +spc);
            }

            for (int w = 0; w < shrift; w++)
            {
                str += (txt + txt);
            }

            for (int w = 0; w < shrift*txtLength; w++)
            {
                str += (spc);
            }
        }

        //Строка5
        if(stringNumber == 5)
        {
            for (int w = 0; w < shrift; w++)
            {
                str += (txt + txt);
            }

            for (int w = 0; w < shrift*txtLength; w++)
            {
                str += (spc + spc + spc);
            }

            for (int w = 0; w < shrift; w++)
            {
                str += (txt + txt);
            }

            for (int w = 0; w < shrift*txtLength; w++)
            {
                str += (spc);
            }
        }

        //Строка6
        if(stringNumber == 6)
        {
            for (int w = 0; w < shrift*txtLength; w++)
            {
                str += (spc + spc + spc + spc + spc + spc + spc + spc);
            }
        }
        return str;
    }
}
