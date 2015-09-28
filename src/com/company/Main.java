package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        String fileName="input.txt";//обращаемся к локальному файлу
        Scanner sc= null;
        try {

            sc = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int n = Integer.parseInt(sc.nextLine());//считываем n из файла

        double P = Double.parseDouble(sc.nextLine());//считываем P из файла

        double timeValue = (-1)*(n * Math.log(P))/(Math.pow((Math.log(2)), 2));
        int m = (int) timeValue; //вычисляем m
        timeValue = (m * Math.log(2))/(n);
        int k = (int) timeValue;//вычисляем k
        k += 1;

        //задаем 20 солей

        String[] sol = new String[20];
        sol[0] = "HJBFhz%Q8>)8B{№s&RUf";
        sol[1] = "yvX<(zY7c^kYbi&]3gB{";
        sol[2] = ":NW{xTu.№}73@#[)<gsg";
        sol[3] = "uY3@DshX5№CgKVugf2R,";
        sol[4] = ")3%4!Fgn!]od&Q<ynwy}";
        sol[5] = "}]::t06{@#._IS@RyrZ7";
        sol[6] = "iWFqj<P7Lrv#D2_}9$ul";
        sol[7] = "!9W^xsKKes*zLmu:4Km]";
        sol[8] = "xPrasH#d_F3o%AXPk>qd";
        sol[9] = ">aX_T>pT6c%d8R18p(6r";
        sol[10] = "u]lN@n8OYeJUhz$^ju[(";
        sol[11] = "D9*4d%df@{1s:R@>>I<^";
        sol[12] = "fmcCX)jZn}-,)rC{do]r";
        sol[13] = "6F({?KPus-!92(q[0f:u";
        sol[14] = "kDGoE;mcEXV9Cux7!YTn";
        sol[15] = "*VYfZOf1Nh)I{H3H1&va";
        sol[16] = "]@#k4dr*)!!}b0&6Ps№G";
        sol[17] = "THi{c%g^ZBoXYw24-%Cp";
        sol[18] = "q<)m!Nf(NIGh#OuhP0%%";
        sol[19] = "ERvz(,G2h^%bIpuWHe&O";

        //
        int[] hash = new int[m/32 + 1];//задаем массив в котором будем хранить информацию о поступивших строках

        for (int i = 0; i < n; ++i)
        {
            for(int j = 0; j < k; ++j)
            {

                String nowS = sc.nextLine();
                nowS+=sol[j];
                int index = nowS.hashCode();
                index = Math.abs(index % m);
                if (0 == (hash[index / 32] & (1 << (index % 32))))
                {
                    hash[index / 32] = hash[index / 32] | (1 << (index % 32));
                }
            }
        }
        for(int i=0;i<m/32 +1;++i)
        {

            System.out.println(hash[i]);
        }
    }
}
