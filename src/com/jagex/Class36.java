package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class36
{

    public void method364(int i, Buffer class39_sub3_sub3)
    {
        anInt671 = class39_sub3_sub3.readUByte();
        anInt669 = class39_sub3_sub3.readIntBE();
        if(i < 5 || i > 5)
        {
            throw new NullPointerException();
        } else
        {
            anInt670 = class39_sub3_sub3.readIntBE();
            method365(0, class39_sub3_sub3);
            return;
        }
    }

    public void method365(int i, Buffer class39_sub3_sub3)
    {
        anInt666 = class39_sub3_sub3.readUByte();
        anIntArray667 = new int[anInt666];
        anIntArray668 = new int[anInt666];
        for(int j = 0; j < anInt666; j++)
        {
            anIntArray667[j] = class39_sub3_sub3.readUShortBE();
            anIntArray668[j] = class39_sub3_sub3.readUShortBE();
        }

        if(i == 0);
    }

    public void method366(int i)
    {
        while(i >= 0) 
            anInt665 = 406;
        anInt672 = 0;
        anInt673 = 0;
        anInt674 = 0;
        anInt675 = 0;
        anInt676 = 0;
    }

    public int method367(int i, int j)
    {
        if(anInt676 >= anInt672)
        {
            anInt675 = anIntArray668[anInt673++] << 15;
            if(anInt673 >= anInt666)
                anInt673 = anInt666 - 1;
            anInt672 = (int)(((double)anIntArray667[anInt673] / 65536D) * (double)i);
            if(anInt672 > anInt676)
                anInt674 = ((anIntArray668[anInt673] << 15) - anInt675) / (anInt672 - anInt676);
        }
        anInt675 += anInt674;
        anInt676++;
        if(j != -16419)
            anInt665 = -395;
        return anInt675 - anInt674 >> 15;
    }

    public Class36()
    {
    }

    public int anInt665;
    public int anInt666;
    public int anIntArray667[];
    public int anIntArray668[];
    public int anInt669;
    public int anInt670;
    public int anInt671;
    public int anInt672;
    public int anInt673;
    public int anInt674;
    public int anInt675;
    public int anInt676;
    public static int anInt677;
}
