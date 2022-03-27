package com.StringConverter.se.WorkClasses;

import com.StringConverter.se.Library.LetterEnglich.Big.*;
import com.StringConverter.se.Library.LetterEnglich.Small.*;
import com.StringConverter.se.Library.LetterRussia.Big.*;
import com.StringConverter.se.Library.LetterRussia.Small.*;
import com.StringConverter.se.Library.Numbers.*;
import com.StringConverter.se.Library.Sings.*;

public class Convertion
{
    public static void Job (String string, int shrift, boolean perekluk)
    {
        try
        {
            //разбиваем слово на символы в массив
            char [] charString = string.toCharArray();

            /**
             * перебор строк для печатания конверсии в столбик
             */
            if (perekluk)
            {
                //перебор элементов в массиве
                for (int q = 0; q < string.length(); q++)
                {//поиск совпадений символов
                    /**
                     * Английские большие буквы для печатания конверсии в столбик
                     */
                    if (charString[q] == 'A')
                    {//используем перегрузку метода для напечатания конверсии в столбик
                        new A().Write(shrift);
                    }

                    if (charString[q] == 'B')
                    {
                        new B().Write(shrift);
                    }

                    if (charString[q] == 'C')
                    {
                        new C().Write(shrift);
                    }

                    if (charString[q] == 'D')
                    {
                        new D().Write(shrift);
                    }

                    if (charString[q] == 'E')
                    {
                        new E().Write(shrift);
                    }

                    if (charString[q] == 'F')
                    {
                        new F().Write(shrift);
                    }

                    if (charString[q] == 'G')
                    {
                        new G().Write(shrift);
                    }

                    if (charString[q] == 'H')
                    {
                        new H().Write(shrift);
                    }

                    if (charString[q] == 'I')
                    {
                        new I().Write(shrift);
                    }

                    if (charString[q] == 'J')
                    {
                        new J().Write(shrift);
                    }

                    if (charString[q] == 'K')
                    {
                        new K().Write(shrift);
                    }

                    if (charString[q] == 'L')
                    {
                        new L().Write(shrift);
                    }

                    if (charString[q] == 'M')
                    {
                        new M().Write(shrift);
                    }

                    if (charString[q] == 'N')
                    {
                        new N().Write(shrift);
                    }

                    if (charString[q] == 'O')
                    {
                        new O().Write(shrift);
                    }

                    if (charString[q] == 'P')
                    {
                        new P().Write(shrift);
                    }

                    if (charString[q] == 'Q')
                    {
                        new Q().Write(shrift);
                    }

                    if (charString[q] == 'R')
                    {
                        new R().Write(shrift);
                    }

                    if (charString[q] == 'S')
                    {
                        new S().Write(shrift);
                    }

                    if (charString[q] == 'T')
                    {
                        new T().Write(shrift);
                    }

                    if (charString[q] == 'U')
                    {
                        new U().Write(shrift);
                    }

                    if (charString[q] == 'V')
                    {
                        new V().Write(shrift);
                    }

                    if (charString[q] == 'W')
                    {
                        new W().Write(shrift);
                    }

                    if (charString[q] == 'X')
                    {
                        new X().Write(shrift);
                    }

                    if (charString[q] == 'Y')
                    {
                        new Y().Write(shrift);
                    }

                    if (charString[q] == 'Z')
                    {
                        new Z().Write(shrift);
                    }

                    /**
                     * Английские маленькие буквы для печатания конверсии в столбик
                     */
                    if (charString[q] == 'a')
                    {
                        new As().Write(shrift);
                    }

                    if (charString[q] == 'b')
                    {
                        new Bs().Write(shrift);
                    }

                    if (charString[q] == 'c')
                    {
                        new Cs().Write(shrift);
                    }

                    if (charString[q] == 'd')
                    {
                        new Ds().Write(shrift);
                    }

                    if (charString[q] == 'e')
                    {
                        new Es().Write(shrift);
                    }

                    if (charString[q] == 'f')
                    {
                        new Fs().Write(shrift);
                    }

                    if (charString[q] == 'g')
                    {
                        new Gs().Write(shrift);
                    }

                    if (charString[q] == 'h')
                    {
                        new Hs().Write(shrift);
                    }

                    if (charString[q] == 'i')
                    {
                        new Is().Write(shrift);
                    }

                    if (charString[q] == 'j')
                    {
                        new Js().Write(shrift);
                    }

                    if (charString[q] == 'k')
                    {
                        new Ks().Write(shrift);
                    }

                    if (charString[q] == 'l')
                    {
                        new Ls().Write(shrift);
                    }

                    if (charString[q] == 'm')
                    {
                        new Ms().Write(shrift);
                    }

                    if (charString[q] == 'n')
                    {
                        new Ns().Write(shrift);
                    }

                    if (charString[q] == 'o')
                    {
                        new Os().Write(shrift);
                    }

                    if (charString[q] == 'p')
                    {
                        new Ps().Write(shrift);
                    }

                    if (charString[q] == 'q')
                    {
                        new Qs().Write(shrift);
                    }

                    if (charString[q] == 'r')
                    {
                        new Rs().Write(shrift);
                    }

                    if (charString[q] == 's')
                    {
                        new Ss().Write(shrift);
                    }

                    if (charString[q] == 't')
                    {
                        new Ts().Write(shrift);
                    }

                    if (charString[q] == 'u')
                    {
                        new Us().Write(shrift);
                    }

                    if (charString[q] == 'v')
                    {
                        new Vs().Write(shrift);
                    }

                    if (charString[q] == 'w')
                    {
                        new Ws().Write(shrift);
                    }

                    if (charString[q] == 'x')
                    {
                        new Xs().Write(shrift);
                    }

                    if (charString[q] == 'y')
                    {
                        new Ys().Write(shrift);
                    }

                    if (charString[q] == 'z')
                    {
                        new Zs().Write(shrift);
                    }

                    /**
                     * Русские большие буквы для печатания конверсии в столбик
                     */
                    if (charString[q] == 'А')
                    {
                        new Rus00A().Write(shrift);
                    }

                    if (charString[q] == 'Б')
                    {
                        new Rus01B().Write(shrift);
                    }

                    if (charString[q] == 'В')
                    {
                        new Rus02V().Write(shrift);
                    }

                    if (charString[q] == 'Г')
                    {
                        new Rus03G().Write(shrift);
                    }

                    if (charString[q] == 'Д')
                    {
                        new Rus04D().Write(shrift);
                    }

                    if (charString[q] == 'Е')
                    {
                        new Rus05E().Write(shrift);
                    }

                    if (charString[q] == 'Ё')
                    {
                        new Rus06YO().Write(shrift);
                    }

                    if (charString[q] == 'Ж')
                    {
                        new Rus07ZH().Write(shrift);
                    }

                    if (charString[q] == 'З')
                    {
                        new Rus08Z().Write(shrift);
                    }

                    if (charString[q] == 'И')
                    {
                        new Rus09I().Write(shrift);
                    }

                    if (charString[q] == 'Й')
                    {
                        new Rus10IsHORT().Write(shrift);
                    }

                    if (charString[q] == 'К')
                    {
                        new Rus11K().Write(shrift);
                    }

                    if (charString[q] == 'Л')
                    {
                        new Rus12L().Write(shrift);
                    }

                    if (charString[q] == 'М')
                    {
                        new Rus13M().Write(shrift);
                    }

                    if (charString[q] == 'Н')
                    {
                        new Rus14N().Write(shrift);
                    }

                    if (charString[q] == 'О')
                    {
                        new Rus15O().Write(shrift);
                    }

                    if (charString[q] == 'П')
                    {
                        new Rus16P().Write(shrift);
                    }

                    if (charString[q] == 'Р')
                    {
                        new Rus17R().Write(shrift);
                    }

                    if (charString[q] == 'С')
                    {
                        new Rus18S().Write(shrift);
                    }

                    if (charString[q] == 'Т')
                    {
                        new Rus19T().Write(shrift);
                    }

                    if (charString[q] == 'У')
                    {
                        new Rus20U().Write(shrift);
                    }

                    if (charString[q] == 'Ф')
                    {
                        new Rus21F().Write(shrift);
                    }

                    if (charString[q] == 'Х')
                    {
                        new Rus22H().Write(shrift);
                    }

                    if (charString[q] == 'Ц')
                    {
                        new Rus23C().Write(shrift);
                    }

                    if (charString[q] == 'Ч')
                    {
                        new Rus24CH().Write(shrift);
                    }

                    if (charString[q] == 'Ш')
                    {
                        new Rus25SH().Write(shrift);
                    }

                    if (charString[q] == 'Щ')
                    {
                        new Rus26SHCH().Write(shrift);
                    }

                    if (charString[q] == 'Ь')
                    {
                        new Rus27SOFTsIGN().Write(shrift);
                    }

                    if (charString[q] == 'Ы')
                    {
                        new Rus28Y().Write(shrift);
                    }

                    if (charString[q] == 'Ъ')
                    {
                        new Rus29HARDsIGN().Write(shrift);
                    }

                    if (charString[q] == 'Э')
                    {
                        new Rus30EsOFT().Write(shrift);
                    }

                    if (charString[q] == 'Ю')
                    {
                        new Rus31YU().Write(shrift);
                    }

                    if (charString[q] == 'Я')
                    {
                        new Rus32YA().Write(shrift);
                    }

                    /**
                     * Русские маленькие буквы для печатания конверсии в столбик
                     */

                    if (charString[q] == 'а')
                    {
                        new Rus00As().Write(shrift);
                    }

                    if (charString[q] == 'б')
                    {
                        new Rus01Bs().Write(shrift);
                    }

                    if (charString[q] == 'в')
                    {
                        new Rus02Vs().Write(shrift);
                    }

                    if (charString[q] == 'г')
                    {
                        new Rus03Gs().Write(shrift);
                    }

                    if (charString[q] == 'д')
                    {
                        new Rus04Ds().Write(shrift);
                    }

                    if (charString[q] == 'е')
                    {
                        new Rus05Es().Write(shrift);
                    }

                    if (charString[q] == 'ё')
                    {
                        new Rus06YOs().Write(shrift);
                    }

                    if (charString[q] == 'ж')
                    {
                        new Rus07ZHs().Write(shrift);
                    }

                    if (charString[q] == 'з')
                    {
                        new Rus08Zs().Write(shrift);
                    }

                    if (charString[q] == 'и')
                    {
                        new Rus09Is().Write(shrift);
                    }

                    if (charString[q] == 'й')
                    {
                        new Rus10IsHORTs().Write(shrift);
                    }

                    if (charString[q] == 'к')
                    {
                        new Rus11Ks().Write(shrift);
                    }

                    if (charString[q] == 'л')
                    {
                        new Rus12Ls().Write(shrift);
                    }

                    if (charString[q] == 'м')
                    {
                        new Rus13Ms().Write(shrift);
                    }

                    if (charString[q] == 'н')
                    {
                        new Rus14Ns().Write(shrift);
                    }

                    if (charString[q] == 'о')
                    {
                        new Rus15Os().Write(shrift);
                    }

                    if (charString[q] == 'п')
                    {
                        new Rus16Ps().Write(shrift);
                    }

                    if (charString[q] == 'р')
                    {
                        new Rus17Rs().Write(shrift);
                    }

                    if (charString[q] == 'с')
                    {
                        new Rus18Ss().Write(shrift);
                    }

                    if (charString[q] == 'т')
                    {
                        new Rus19Ts().Write(shrift);
                    }

                    if (charString[q] == 'у')
                    {
                        new Rus20Us().Write(shrift);
                    }

                    if (charString[q] == 'ф')
                    {
                        new Rus21Fs().Write(shrift);
                    }

                    if (charString[q] == 'х')
                    {
                        new Rus22Hs().Write(shrift);
                    }

                    if (charString[q] == 'ц')
                    {
                        new Rus23Cs().Write(shrift);
                    }

                    if (charString[q] == 'ч')
                    {
                        new Rus24CHs().Write(shrift);
                    }

                    if (charString[q] == 'ш')
                    {
                        new Rus25SHs().Write(shrift);
                    }

                    if (charString[q] == 'щ')
                    {
                        new Rus26SHCHs().Write(shrift);
                    }

                    if (charString[q] == 'ь')
                    {
                        new Rus27SOFTsIGNs().Write(shrift);
                    }

                    if (charString[q] == 'ы')
                    {
                        new Rus28Ys().Write(shrift);
                    }

                    if (charString[q] == 'ъ')
                    {
                        new Rus29HARDsIGNs().Write(shrift);
                    }

                    if (charString[q] == 'э')
                    {
                        new Rus30EsOFTs().Write(shrift);
                    }

                    if (charString[q] == 'ю')
                    {
                        new Rus31YUs().Write(shrift);
                    }

                    if (charString[q] == 'я')
                    {
                        new Rus32YAs().Write(shrift);
                    }

                    /**
                     * Цифры для печатания конверсии в столбик
                     */

                    if (charString[q] == '0')
                    {
                        new Number0().Write(shrift);
                    }

                    if (charString[q] == '1')
                    {
                        new Number1().Write(shrift);
                    }

                    if (charString[q] == '2')
                    {
                        new Number2().Write(shrift);
                    }

                    if (charString[q] == '3')
                    {
                        new Number3().Write(shrift);
                    }

                    if (charString[q] == '4')
                    {
                        new Number4().Write(shrift);
                    }

                    if (charString[q] == '5')
                    {
                        new Number5().Write(shrift);
                    }

                    if (charString[q] == '6')
                    {
                        new Number6().Write(shrift);
                    }

                    if (charString[q] == '7')
                    {
                        new Number7().Write(shrift);
                    }

                    if (charString[q] == '8')
                    {
                        new Number8().Write(shrift);
                    }

                    if (charString[q] == '9')
                    {
                        new Number9().Write(shrift);
                    }

                    /**
                     * Знаки для печатания конверсии в столбик
                     */

                    if (charString[q] == '!')
                    {
                        new ExclumationMark().Write(shrift);
                    }

                    if (charString[q] == '@')
                    {
                        new Dog().Write(shrift);
                    }

                    if (charString[q] == ' ')
                    {
                        new Space().Write(shrift);
                    }

                    if (charString[q] == '\"')
                    {
                        new DoubleBuckets().Write(shrift);
                    }

                    if (charString[q] == '#')
                    {
                        new HTag().Write(shrift);
                    }

                    if (charString[q] == ';')
                    {
                        new Semicolon().Write(shrift);
                    }

                    if (charString[q] == ',')
                    {
                        new Comma().Write(shrift);
                    }

                    if (charString[q] == '.')
                    {
                        new Point().Write(shrift);
                    }

                    if (charString[q] == ':')
                    {
                        new Colon().Write(shrift);
                    }

                    if (charString[q] == '_')
                    {
                        new Underscore().Write(shrift);
                    }

                    if (charString[q] == '-')
                    {
                        new Minus().Write(shrift);
                    }

                    if (charString[q] == '+')
                    {
                        new Plus().Write(shrift);
                    }

                    if (charString[q] == '=')
                    {
                        new Equally().Write(shrift);
                    }

                    if (charString[q] == '*')
                    {
                        new Multiplication().Write(shrift);
                    }

                    if (charString[q] == '(')
                    {
                        new BracketLeft().Write(shrift);
                    }

                    if (charString[q] == ')')
                    {
                        new BracketRight().Write(shrift);
                    }

                    if (charString[q] == '$')
                    {
                        new NoBacks().Write(shrift);
                    }

                    if (charString[q] == '?')
                    {
                        new QuestionMark().Write(shrift);
                    }

                    if (charString[q] == '/')
                    {
                        new Division().Write(shrift);
                    }

                    if (charString[q] == '%')
                    {
                        new Procent().Write(shrift);
                    }

                    if (charString[q] == '\\')
                    {
                        new ReSlash().Write(shrift);
                    }

                    if (charString[q] == '[')
                    {
                        new SquareBracketLeft().Write(shrift);
                    }

                    if (charString[q] == ']')
                    {
                        new SquareBracketRight().Write(shrift);
                    }

                    if (charString[q] == '№')
                    {
                        new NumberInOrder().Write(shrift);
                    }

                    if (charString[q] == '^')
                    {
                        new Cap().Write(shrift);
                    }

                    if (charString[q] == '&')
                    {
                        new Ampersant().Write(shrift);
                    }

                    if (charString[q] == '|')
                    {
                        new VerticalLine().Write(shrift);
                    }

                    if (charString[q] == '{')
                    {
                        new CurlyBracketLeft().Write(shrift);
                    }

                    if (charString[q] == '}')
                    {
                        new CurlyBracketRight().Write(shrift);
                    }

                    if (charString[q] == '`')
                    {
                        new Apostrophe().Write(shrift);
                    }

                    if (charString[q] == '~')
                    {
                        new Snake().Write(shrift);
                    }

                    if (charString[q] == '\'')
                    {
                        new Buckets().Write(shrift);
                    }

                    if (charString[q] == '<')
                    {
                        new ArrowLeft().Write(shrift);
                    }

                    if (charString[q] == '>')
                    {
                        new ArrowRight().Write(shrift);
                    }








                }
            }

            /**
             * перебор строк для печатания конверсии в строку
             */
            else
            {
                WriterTXT writerTXT = new WriterTXT();
                for (int stringNum = 0; stringNum <= 12; stringNum++)
                {
                    for (int w = 0; w < shrift; w++)
                    {
                        boolean ln = false;
                        //перебор элементов в массиве
                        for (int q = 0; q < string.length(); q++)
                        {//поиск совпадений символов
                            /**
                             * Английские большие буквы для печатания конверсии в строку
                             */
                            if (charString[q] == 'A')
                            {//используем перегрузку метода для напечатания конверсии в строку
                                writerTXT.writeTXT(new A().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'B')
                            {
                                writerTXT.writeTXT(new B().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'C')
                            {
                                writerTXT.writeTXT(new C().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'D')
                            {
                                writerTXT.writeTXT(new D().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'E')
                            {
                                writerTXT.writeTXT(new E().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'F')
                            {
                                writerTXT.writeTXT(new F().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'G')
                            {
                                writerTXT.writeTXT(new G().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'H')
                            {
                                writerTXT.writeTXT(new H().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'I')
                            {
                                writerTXT.writeTXT(new I().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'J')
                            {
                                writerTXT.writeTXT(new J().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'K')
                            {
                                writerTXT.writeTXT(new K().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'L')
                            {
                                writerTXT.writeTXT(new L().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'M')
                            {
                                writerTXT.writeTXT(new M().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'N')
                            {
                                writerTXT.writeTXT(new N().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'O')
                            {
                                writerTXT.writeTXT(new O().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'P')
                            {
                                writerTXT.writeTXT(new P().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Q')
                            {
                                writerTXT.writeTXT(new Q().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'R')
                            {
                                writerTXT.writeTXT(new R().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'S')
                            {
                                writerTXT.writeTXT(new S().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'T')
                            {
                                writerTXT.writeTXT(new T().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'U')
                            {
                                writerTXT.writeTXT(new U().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'V')
                            {
                                writerTXT.writeTXT(new V().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'W')
                            {
                                writerTXT.writeTXT(new W().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'X')
                            {
                                writerTXT.writeTXT(new X().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Y')
                            {
                                writerTXT.writeTXT(new Y().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Z')
                            {
                                writerTXT.writeTXT(new Z().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            /**
                             * Английские маленькие буквы для печатания конверсии в строку
                             */
                            if (charString[q] == 'a')
                            {
                                writerTXT.writeTXT(new As().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'b')
                            {
                                writerTXT.writeTXT(new Bs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'c')
                            {
                                writerTXT.writeTXT(new Cs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'd')
                            {
                                writerTXT.writeTXT(new Ds().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'e')
                            {
                                writerTXT.writeTXT(new Es().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'f')
                            {
                                writerTXT.writeTXT(new Fs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'g')
                            {
                                writerTXT.writeTXT(new Gs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'h')
                            {
                                writerTXT.writeTXT(new Hs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'i')
                            {
                                writerTXT.writeTXT(new Is().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'j')
                            {
                                writerTXT.writeTXT(new Js().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'k')
                            {
                                writerTXT.writeTXT(new Ks().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'l')
                            {
                                writerTXT.writeTXT(new Ls().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'm')
                            {
                                writerTXT.writeTXT(new Ms().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'n')
                            {
                                writerTXT.writeTXT(new Ns().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'o')
                            {
                                writerTXT.writeTXT(new Os().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'p')
                            {
                                writerTXT.writeTXT(new Ps().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'q')
                            {
                                writerTXT.writeTXT(new Qs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'r')
                            {
                                writerTXT.writeTXT(new Rs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 's')
                            {
                                writerTXT.writeTXT(new Ss().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 't')
                            {
                                writerTXT.writeTXT(new Ts().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'u')
                            {
                                writerTXT.writeTXT(new Us().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'v')
                            {
                                writerTXT.writeTXT(new Vs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'w')
                            {
                                writerTXT.writeTXT(new Ws().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'x')
                            {
                                writerTXT.writeTXT(new Xs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'y')
                            {
                                writerTXT.writeTXT(new Ys().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'z')
                            {
                                writerTXT.writeTXT(new Zs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            /**
                             * Русские большие буквы для печатания конверсии в строку
                             */
                            if (charString[q] == 'А')
                            {
                                writerTXT.writeTXT(new Rus00A().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Б')
                            {
                                writerTXT.writeTXT(new Rus01B().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'В')
                            {
                                writerTXT.writeTXT(new Rus02V().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Г')
                            {
                                writerTXT.writeTXT(new Rus03G().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Д')
                            {
                                writerTXT.writeTXT(new Rus04D().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Е')
                            {
                                writerTXT.writeTXT(new Rus05E().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Ё')
                            {
                                writerTXT.writeTXT(new Rus06YO().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Ж')
                            {
                                writerTXT.writeTXT(new Rus07ZH().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'З')
                            {
                                writerTXT.writeTXT(new Rus08Z().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'И')
                            {
                                writerTXT.writeTXT(new Rus09I().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Й')
                            {
                                writerTXT.writeTXT(new Rus10IsHORT().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'К')
                            {
                                writerTXT.writeTXT(new Rus11K().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Л')
                            {
                                writerTXT.writeTXT(new Rus12L().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'М')
                            {
                                writerTXT.writeTXT(new Rus13M().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Н')
                            {
                                writerTXT.writeTXT(new Rus14N().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'О')
                            {
                                writerTXT.writeTXT(new Rus15O().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'П')
                            {
                                writerTXT.writeTXT(new Rus16P().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Р')
                            {
                                writerTXT.writeTXT(new Rus17R().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'С')
                            {
                                writerTXT.writeTXT(new Rus18S().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Т')
                            {
                                writerTXT.writeTXT(new Rus19T().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'У')
                            {
                                writerTXT.writeTXT(new Rus20U().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Ф')
                            {
                                writerTXT.writeTXT(new Rus21F().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Х')
                            {
                                writerTXT.writeTXT(new Rus22H().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Ц')
                            {
                                writerTXT.writeTXT(new Rus23C().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Ч')
                            {
                                writerTXT.writeTXT(new Rus24CH().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Ш')
                            {
                                writerTXT.writeTXT(new Rus25SH().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Щ')
                            {
                                writerTXT.writeTXT(new Rus26SHCH().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Ь')
                            {
                                writerTXT.writeTXT(new Rus27SOFTsIGN().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Ы')
                            {
                                writerTXT.writeTXT(new Rus28Y().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Ъ')
                            {
                                writerTXT.writeTXT(new Rus29HARDsIGN().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Э')
                            {
                                writerTXT.writeTXT(new Rus30EsOFT().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Ю')
                            {
                                writerTXT.writeTXT(new Rus31YU().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'Я')
                            {
                                writerTXT.writeTXT(new Rus32YA().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            /**
                             * Русские маленькие буквы для печатания конверсии в строку
                             */

                            if (charString[q] == 'а')
                            {
                                writerTXT.writeTXT(new Rus00As().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'б')
                            {
                                writerTXT.writeTXT(new Rus01Bs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'в')
                            {
                                writerTXT.writeTXT(new Rus02Vs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'г')
                            {
                                writerTXT.writeTXT(new Rus03Gs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'д')
                            {
                                writerTXT.writeTXT(new Rus04Ds().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'е')
                            {
                                writerTXT.writeTXT(new Rus05Es().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'ё')
                            {
                                writerTXT.writeTXT(new Rus06YOs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'ж')
                            {
                                writerTXT.writeTXT(new Rus07ZHs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'з')
                            {
                                writerTXT.writeTXT(new Rus08Zs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'и')
                            {
                                writerTXT.writeTXT(new Rus09Is().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'й')
                            {
                                writerTXT.writeTXT(new Rus10IsHORTs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'к')
                            {
                                writerTXT.writeTXT(new Rus11Ks().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'л')
                            {
                                writerTXT.writeTXT(new Rus12Ls().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'м')
                            {
                                writerTXT.writeTXT(new Rus13Ms().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'н')
                            {
                                writerTXT.writeTXT(new Rus14Ns().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'о')
                            {
                                writerTXT.writeTXT(new Rus15Os().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'п')
                            {
                                writerTXT.writeTXT(new Rus16Ps().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'р')
                            {
                                writerTXT.writeTXT(new Rus17Rs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'с')
                            {
                                writerTXT.writeTXT(new Rus18Ss().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'т')
                            {
                                writerTXT.writeTXT(new Rus19Ts().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'у')
                            {
                                writerTXT.writeTXT(new Rus20Us().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'ф')
                            {
                                writerTXT.writeTXT(new Rus21Fs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'х')
                            {
                                writerTXT.writeTXT(new Rus22Hs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'ц')
                            {
                                writerTXT.writeTXT(new Rus23Cs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'ч')
                            {
                                writerTXT.writeTXT(new Rus24CHs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'ш')
                            {
                                writerTXT.writeTXT(new Rus25SHs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'щ')
                            {
                                writerTXT.writeTXT(new Rus26SHCHs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'ь')
                            {
                                writerTXT.writeTXT(new Rus27SOFTsIGNs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'ы')
                            {
                                writerTXT.writeTXT(new Rus28Ys().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'ъ')
                            {
                                writerTXT.writeTXT(new Rus29HARDsIGNs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'э')
                            {
                                writerTXT.writeTXT(new Rus30EsOFTs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'ю')
                            {
                                writerTXT.writeTXT(new Rus31YUs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == 'я')
                            {
                                writerTXT.writeTXT(new Rus32YAs().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            /**
                             * Цифры для печатания конверсии в строку
                             */

                            if (charString[q] == '0')
                            {
                                writerTXT.writeTXT(new Number0().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '1')
                            {
                                writerTXT.writeTXT(new Number1().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '2')
                            {
                                writerTXT.writeTXT(new Number2().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '3')
                            {
                                writerTXT.writeTXT(new Number3().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '4')
                            {
                                writerTXT.writeTXT(new Number4().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '5')
                            {
                                writerTXT.writeTXT(new Number5().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '6')
                            {
                                writerTXT.writeTXT(new Number6().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '7')
                            {
                                writerTXT.writeTXT(new Number7().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '8')
                            {
                                writerTXT.writeTXT(new Number8().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '9')
                            {
                                writerTXT.writeTXT(new Number9().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            /**
                             * Знаки для печатания конверсии в строку
                             */

                            if (charString[q] == '!')
                            {
                                writerTXT.writeTXT(new ExclumationMark().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '@')
                            {
                                writerTXT.writeTXT(new Dog().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == ' ')
                            {
                                writerTXT.writeTXT(new Space().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '\"')
                            {
                                writerTXT.writeTXT(new DoubleBuckets().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '#')
                            {
                                writerTXT.writeTXT(new HTag().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == ';')
                            {
                                writerTXT.writeTXT(new Semicolon().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == ',')
                            {
                                writerTXT.writeTXT(new Comma().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '.')
                            {
                                writerTXT.writeTXT(new Point().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == ':')
                            {
                                writerTXT.writeTXT(new Colon().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '_')
                            {
                                writerTXT.writeTXT(new Underscore().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '-')
                            {
                                writerTXT.writeTXT(new Minus().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '+')
                            {
                                writerTXT.writeTXT(new Plus().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '=')
                            {
                                writerTXT.writeTXT(new Equally().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '*')
                            {
                                writerTXT.writeTXT(new Multiplication().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '(')
                            {
                                writerTXT.writeTXT(new BracketLeft().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == ')')
                            {
                                writerTXT.writeTXT(new BracketRight().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '$')
                            {
                                writerTXT.writeTXT(new NoBacks().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '?')
                            {
                                writerTXT.writeTXT(new QuestionMark().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '/')
                            {
                                writerTXT.writeTXT(new Division().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '%')
                            {
                                writerTXT.writeTXT(new Procent().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '\\')
                            {
                                writerTXT.writeTXT(new ReSlash().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '[')
                            {
                                writerTXT.writeTXT(new SquareBracketLeft().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == ']')
                            {
                                writerTXT.writeTXT(new SquareBracketRight().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '№')
                            {
                                writerTXT.writeTXT(new NumberInOrder().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '^')
                            {
                                writerTXT.writeTXT(new Cap().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '&')
                            {
                                writerTXT.writeTXT(new Ampersant().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '|')
                            {
                                writerTXT.writeTXT(new VerticalLine().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '{')
                            {
                                writerTXT.writeTXT(new CurlyBracketLeft().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '}')
                            {
                                writerTXT.writeTXT(new CurlyBracketRight().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '`')
                            {
                                writerTXT.writeTXT(new Apostrophe().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '~')
                            {
                                writerTXT.writeTXT(new Snake().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '\'')
                            {
                                writerTXT.writeTXT(new Buckets().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '<')
                            {
                                writerTXT.writeTXT(new ArrowLeft().returnWrite(shrift, stringNum));
                                ln = true;
                            }

                            if (charString[q] == '>')
                            {
                                writerTXT.writeTXT(new ArrowRight().returnWrite(shrift, stringNum));
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