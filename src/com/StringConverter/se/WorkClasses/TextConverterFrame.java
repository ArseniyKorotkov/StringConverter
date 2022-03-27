package com.StringConverter.se.WorkClasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextConverterFrame extends JFrame
{
    /**
     * строки текста
     */
    public JLabel textLabel = new JLabel("Enter text for conversion:");
    private JLabel sizeLabel = new JLabel("Enter the desired text size:");
    private JLabel singsForTextLabel = new JLabel("Enter characters for text:");
    private JLabel singsForSpaceLabel = new JLabel("Enter characters for space:");
    private JLabel formatTextLabel = new JLabel("Select the conversion format:");
    private JLabel out = new JLabel("");

    /**
     * строки для ввода
     */
    public JTextField textField = new JTextField();
    public JTextField sizeField = new JTextField("1");
    public JTextField singsForTextField = new JTextField();
    public JTextField singsForSpaceField = new JTextField();

    /**
     * кнопки
     */
    public JButton startButton = new JButton("Conversion");
    private JButton instructionButton = new JButton("Read me");

    /**
     * кнопки для выбора
     */
    public JRadioButton formatTextButton1 = new JRadioButton("String format");
    public JRadioButton formatTextButton2 = new JRadioButton("Column format");

    /**
     * создание конструктора для внедрения вышенаписанных полей
     */
    public TextConverterFrame()
    {
        //даем название рамочке
        super("StringConverter");
        //определяем ху верхнего левого угла угла рамочки и ее размеры
        //this.setBounds(0,0,435,210);
        this.setBounds(0,0,435,160);
        //закрываем все процессы при закрытии формочки
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //создаем контейнер полей для формочки
        Container container = this.getContentPane();
        //определяем контейнеру кол-во строк, столбцов, отступы между ними
        //container.setLayout(new GridLayout(7,2,1,1));
        container.setLayout(new GridLayout(5,2,1,1));

        //объединяем кнопки для выбора в одну группу
        ButtonGroup group = new ButtonGroup();
        group.add(formatTextButton1);
        group.add(formatTextButton2);

        //выбираем кнопку для выбора нажатой по умолчанию
        formatTextButton1.setSelected(true);

        //назначаем старт работы класса нажатию кнопки
        startButton.addActionListener(new OutputWindow());
        instructionButton.addActionListener(new InformationWindow());


        //добавляем все поля в формочку
        container.add(textLabel);
        container.add(textField);
        container.add(sizeLabel);
        container.add(sizeField);
        //container.add(singsForTextLabel);
        //container.add(singsForTextField);
        //container.add(singsForSpaceLabel);
        //container.add(singsForSpaceField);
        container.add(formatTextLabel);
        container.add(out);
        container.add(formatTextButton1);
        container.add(formatTextButton2);
        container.add(instructionButton);
        container.add(startButton);
    }

    /**
     * создаем действие для кнопки startButton
     */
    class OutputWindow implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            String string = textField.getText();
            String singsForText = singsForTextField.getText();
            String singsForSpace = singsForSpaceField.getText();
            boolean perekluk = formatTextButton1.isSelected() ? false : true;
            int singsForTextLength = singsForTextField.getText().length();
            try
            {
                int shrift = Integer.parseInt(sizeField.getText());
                sizeLabel.setText("Enter the desired text size:");

                if(shrift <= 0)
                {
                    sizeLabel.setText("Enter an integer positive here >>>>>");
                    if( !singsForText.isEmpty() && singsForSpace.isEmpty() )
                    {
                        singsForTextLabel.setText("Enter characters for text:");
                        singsForSpaceLabel.setText("Enter here or delete the second one>");
                    }
                    else if( singsForText.isEmpty() && !singsForSpace.isEmpty() )
                    {
                        singsForTextLabel.setText("Enter here or delete the second one>");
                        singsForSpaceLabel.setText("Enter characters for space:");
                    }
                    else
                    {
                        singsForTextLabel.setText("Enter characters for text:");
                        singsForSpaceLabel.setText("Enter characters for space:");
                    }
                }
                else
                {
                    if(singsForText.isEmpty() && singsForSpace.isEmpty())
                    {
                        Convertion.Job(string, shrift, perekluk);
                        singsForTextLabel.setText("Enter characters for text:");
                        singsForSpaceLabel.setText("Enter characters for space:");
                    }
                    else
                    {
                        if( !singsForText.isEmpty() && singsForSpace.isEmpty() )
                        {
                            singsForTextLabel.setText("Enter characters for text:");
                            singsForSpaceLabel.setText("Enter here or delete the second one>");
                        }
                        else if( singsForText.isEmpty() && !singsForSpace.isEmpty() )
                        {
                            singsForTextLabel.setText("Enter here or delete the second one>");
                            singsForSpaceLabel.setText("Enter characters for space:");
                        }
                        else
                        {
                            singsForTextLabel.setText("Enter characters for text:");
                            singsForSpaceLabel.setText("Enter characters for space:");
                            new MyConversion().Job(string, shrift, perekluk,
                                    singsForText, singsForSpace, singsForTextLength);
                        }
                    }
                }
            }
            catch (NumberFormatException exception)
            {
                sizeLabel.setText("Enter an integer here >>>>>>>>>>>>");
                if( !singsForText.isEmpty() && singsForSpace.isEmpty() )
                {
                    singsForTextLabel.setText("Enter characters for text:");
                    singsForSpaceLabel.setText("Enter here or delete the second one>");
                }
                else if( singsForText.isEmpty() && !singsForSpace.isEmpty() )
                {
                    singsForTextLabel.setText("Enter here or delete the second one>");
                    singsForSpaceLabel.setText("Enter characters for space:");
                }
                else
                {
                    singsForTextLabel.setText("Enter characters for text:");
                    singsForSpaceLabel.setText("Enter characters for space:");
                }
            }



        }
    }

    /**
     * создаем действие для кнопки instructionButton
     */
    public class InformationWindow implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String informationMassage =
                    "В поле \"Enter text for conversion\" введите желаемый текст. \r\n" +
                    "В поле \"Enter the desired text size\" введите желаемое увеличение текта. \r\n" +
                    //"Если желаете выбрать знаки для создания конвертации, то: \n"+
                    //"- в поле \"Enter characters for text\" введите знаки для создания текста\n"+
                    //"- в поле \"Enter characters for space\" введите знаки для создания пробелов\n"+
                    //"*если выбираете знаки для конвертацци, то необходимо выбрать что-либо для обеих строк\n"+
                    //"**иходный размер конветации зависит от количества знаков в строке \"Enter characters for text\" \n"+
                    //"***работает только для StringConverter2\n"+
                    "Если не желаете выбрать знаки для создания конвертации, то оставьте эти поля пустыми.\n"+
                    "В поле \"Select the conversion format\" отметьте точкой желаемый формат конвертации:\n"+
                    " -\"String format\" - строчная конвертация;\n"+
                    " -\"Column format\" - конвертация в столбик.\n"+
                    "Нажмите на клавишу \"Conversion\". Результат находится в папке нахождения приложения в файле формата \"txt\".";





            JOptionPane.showMessageDialog(null, informationMassage,
                    "Instruction", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
