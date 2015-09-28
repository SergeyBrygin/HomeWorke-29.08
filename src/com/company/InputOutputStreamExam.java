package com.company;

import java.io.*;


public class InputOutputStreamExam {

    // класс дл€ чтени€ файла
    private InputStream inputstream;

    // класс дл€ записи в файл
    private OutputStream outputStream;

    // путь к файлу который будем читать и записывать
    private String path;

    public InputOutputStreamExam(String path) {
        this.path = path;
    }

    // чтение файла использу€ InputStream
    public void read() throws IOException {
        // инициализируем поток на чтение
        inputstream = new FileInputStream(path);

        // читаем первый символ в байтах (ASCII)
        int data = inputstream.read();
        char content;
        // по байтово читаем весь файл
        while(data != -1) {
            // преобразуем полученный байт в символ
            content = (char) data;
            // выводим посимвольно
            System.out.print(content);
            data = inputstream.read();
        }
        // закрываем поток
        inputstream.close();
    }

    // запись в файл использу€ OutputStream
    public void write(String st) throws IOException {
        // инициализируем поток дл€ вывода данных
        // что позволит нам записать новые данные в файл
        outputStream = new FileOutputStream(path);
        // передаем полученную строку st и приводим еЄ к byte массиву.
        outputStream.write(st.getBytes());
        // закрываем поток вывода
        // только после того как мы закроем поток данные попадут в файл.
        outputStream.close();
    }

}
