package com.StringConverter.se.WorkClasses;

import com.StringConverter.se.MyLibrary.MyLetterEnglich.Big.MyA;

public class MyConversion
{
    public void Job (String string, int shrift, boolean perekluk, String textSing, String spaceSing, int txtLength)
    {
        try
        {
            //разбиваем слово на символы в массив
            char [] charString = string.toCharArray();

            /**
             * перебор строк для печатания конверсии в стролбик
             */
            if (perekluk)
            {
                //перебор элементов в массиве
                for (int q = 0; q < string.length(); q++)
                {//поиск совпадений символов
                    if (charString[q] == 'A')
                    {//используем перегрузку метода для напечатания конверсии в столбик
                        new MyA().Write(shrift, textSing, spaceSing, txtLength);
                    }
                }

            }


            /**
             * перебор строк для печатания конверсии в строку
             */
            else
            {
                WriterTXT writerTXT = new WriterTXT();
                for (int stringNum = 0; stringNum < 7; stringNum++)
                {
                    for (int w = 0; w < shrift*txtLength; w++)
                    {
                        boolean ln = false;
                        //перебор элементов в массиве
                        for (int q = 0; q < string.length(); q++)
                        {//поиск совпадений символов
                            if (charString[q] == 'A')
                            {//используем перегрузку метода для напечатания конверсии в строку
                                writerTXT.writeTXT(new MyA().returnWrite(shrift, stringNum, textSing, spaceSing, txtLength));
                                ln = true;
                            }
                        }
                        if(ln)
                        {
                            writerTXT.writeNewString();
                        }
                    }
                }
            }
        }
        catch (NullPointerException e)
        {
            System.out.println("Enter!!!");
        }
    }
}
