package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class42
{

    public static void method544(byte byte0, Class10 class10)
    {
        Buffer class39_sub3_sub3 = new Buffer(class10.method193("varp.dat", null));
        anInt711 = 0;
        anInt709 = class39_sub3_sub3.readShort();
        if(byte0 != 6)
            return;
        if(aClass42Array710 == null)
            aClass42Array710 = new Class42[anInt709];
        if(anIntArray712 == null)
            anIntArray712 = new int[anInt709];
        for(int i = 0; i < anInt709; i++)
        {
            if(aClass42Array710[i] == null)
                aClass42Array710[i] = new Class42();
            aClass42Array710[i].method545(class39_sub3_sub3, i, anInt707);
        }

        if(class39_sub3_sub3.currentOffset != class39_sub3_sub3.payload.length)
            System.out.println("varptype load mismatch");
    }

    public void method545(Buffer class39_sub3_sub3, int i, int j)
    {
        if(j != 0)
            aBoolean708 = !aBoolean708;
        do
        {
            int k = class39_sub3_sub3.readUByte();
            if(k == 0)
                return;
            if(k == 1)
                anInt714 = class39_sub3_sub3.readUByte();
            else
            if(k == 2)
                anInt715 = class39_sub3_sub3.readUByte();
            else
            if(k == 3)
            {
                aBoolean716 = true;
                anIntArray712[anInt711++] = i;
            } else
            if(k == 4)
                aBoolean717 = false;
            else
            if(k == 5)
                anInt718 = class39_sub3_sub3.readShort();
            else
            if(k == 6)
                aBoolean719 = true;
            else
            if(k == 7)
                anInt720 = class39_sub3_sub3.readIntBE();
            else
            if(k == 8)
            {
                anInt721 = 1;
                aBoolean722 = true;
            } else
            if(k == 10)
                aString713 = class39_sub3_sub3.getRs2String();
            else
            if(k == 11)
                aBoolean722 = true;
            else
            if(k == 12)
                anInt723 = class39_sub3_sub3.readIntBE();
            else
            if(k == 13)
            {
                anInt721 = 2;
                aBoolean722 = true;
            } else
            if(k == 14)
                aBoolean724 = false;
            else
                System.out.println("Error unrecognised config code: " + k);
        } while(true);
    }

    public Class42()
    {
        aBoolean708 = true;
        aBoolean716 = false;
        aBoolean717 = true;
        aBoolean719 = false;
        aBoolean722 = false;
        anInt723 = -1;
        aBoolean724 = true;
    }

    public static int anInt707;
    public boolean aBoolean708;
    public static int anInt709;
    public static Class42 aClass42Array710[];
    public static int anInt711;
    public static int anIntArray712[];
    public String aString713;
    public int anInt714;
    public int anInt715;
    public boolean aBoolean716;
    public boolean aBoolean717;
    public int anInt718;
    public boolean aBoolean719;
    public int anInt720;
    public int anInt721;
    public boolean aBoolean722;
    public int anInt723;
    public boolean aBoolean724;
}
