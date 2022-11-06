package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class6
{

    public static void method190(byte byte0, Class10 class10)
    {
        Buffer class39_sub3_sub3 = new Buffer(class10.method193("varbit.dat", null));
        if(byte0 == 6)
        {
            byte0 = 0;
        } else
        {
            for(int i = 1; i > 0; i++);
        }
        anInt121 = class39_sub3_sub3.readShort();
        if(aClass6Array122 == null)
            aClass6Array122 = new Class6[anInt121];
        for(int j = 0; j < anInt121; j++)
        {
            if(aClass6Array122[j] == null)
                aClass6Array122[j] = new Class6();
            aClass6Array122[j].method191(class39_sub3_sub3, j, anInt120);
            if(aClass6Array122[j].aBoolean127)
                Class42.aClass42Array710[aClass6Array122[j].anInt124].aBoolean722 = true;
        }

        if(class39_sub3_sub3.currentOffset != class39_sub3_sub3.payload.length)
            System.out.println("varbit load mismatch");
    }

    public void method191(Buffer class39_sub3_sub3, int i, int j)
    {
        if(j != 0)
            return;
        do
        {
            int k = class39_sub3_sub3.readUByte();
            if(k == 0)
                return;
            if(k == 1)
            {
                anInt124 = class39_sub3_sub3.readShort();
                anInt125 = class39_sub3_sub3.readUByte();
                anInt126 = class39_sub3_sub3.readUByte();
            } else
            if(k == 10)
                aString123 = class39_sub3_sub3.readString();
            else
            if(k == 2)
                aBoolean127 = true;
            else
            if(k == 3)
                anInt128 = class39_sub3_sub3.readIntBE();
            else
            if(k == 4)
                anInt129 = class39_sub3_sub3.readIntBE();
            else
            if(k == 5)
                aBoolean130 = false;
            else
                System.out.println("Error unrecognised config code: " + k);
        } while(true);
    }

    public Class6()
    {
        aBoolean127 = false;
        anInt128 = -1;
        aBoolean130 = true;
    }

    public static int anInt120;
    public static int anInt121;
    public static Class6 aClass6Array122[];
    public String aString123;
    public int anInt124;
    public int anInt125;
    public int anInt126;
    public boolean aBoolean127;
    public int anInt128;
    public int anInt129;
    public boolean aBoolean130;
}
