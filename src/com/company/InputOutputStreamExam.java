package com.company;

import java.io.*;


public class InputOutputStreamExam {

    // ����� ��� ������ �����
    private InputStream inputstream;

    // ����� ��� ������ � ����
    private OutputStream outputStream;

    // ���� � ����� ������� ����� ������ � ����������
    private String path;

    public InputOutputStreamExam(String path) {
        this.path = path;
    }

    // ������ ����� ��������� InputStream
    public void read() throws IOException {
        // �������������� ����� �� ������
        inputstream = new FileInputStream(path);

        // ������ ������ ������ � ������ (ASCII)
        int data = inputstream.read();
        char content;
        // �� ������� ������ ���� ����
        while(data != -1) {
            // ����������� ���������� ���� � ������
            content = (char) data;
            // ������� �����������
            System.out.print(content);
            data = inputstream.read();
        }
        // ��������� �����
        inputstream.close();
    }

    // ������ � ���� ��������� OutputStream
    public void write(String st) throws IOException {
        // �������������� ����� ��� ������ ������
        // ��� �������� ��� �������� ����� ������ � ����
        outputStream = new FileOutputStream(path);
        // �������� ���������� ������ st � �������� � � byte �������.
        outputStream.write(st.getBytes());
        // ��������� ����� ������
        // ������ ����� ���� ��� �� ������� ����� ������ ������� � ����.
        outputStream.close();
    }

}
