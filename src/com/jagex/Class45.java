package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class45
{

    public static void method584(byte byte0, Class10 class10)
    {
        Buffer class39_sub3_sub3 = new Buffer(class10.method193("flo.dat", null));
        anInt753 = class39_sub3_sub3.readShort();
        if(byte0 != 6)
            return;
        if(aClass45Array754 == null)
            aClass45Array754 = new Class45[anInt753];
        for(int i = 0; i < anInt753; i++)
        {
            if(aClass45Array754[i] == null)
                aClass45Array754[i] = new Class45();
            aClass45Array754[i].method585(5, class39_sub3_sub3);
        }

    }

    public void method585(int i, Buffer class39_sub3_sub3)
    {
        if(i != 5)
        {
            for(int j = 1; j > 0; j++);
        }
        do
        {
            int k = class39_sub3_sub3.readUByte();
            if(k == 0)
                return;
            if(k == 1)
            {
                anInt756 = class39_sub3_sub3.getTribyte();
                method586(anInt756, 548);
            } else
            if(k == 2)
                anInt757 = class39_sub3_sub3.readUByte();
            else
            if(k == 3)
                aBoolean758 = true;
            else
            if(k == 5)
                aBoolean759 = false;
            else
            if(k == 6)
                aString755 = class39_sub3_sub3.getRs2String();
            else
            if(k == 7)
            {
                int l = anInt760;
                int i1 = anInt761;
                int j1 = anInt762;
                int k1 = anInt763;
                int l1 = class39_sub3_sub3.getTribyte();
                method586(l1, 548);
                anInt760 = l;
                anInt761 = i1;
                anInt762 = j1;
                anInt763 = k1;
                anInt764 = k1;
            } else
            {
                System.out.println("Error unrecognised config code: " + k);
            }
        } while(true);
    }

    public void method586(int i, int j)
    {
        if(i == 0xff00ff)
            i = 0;
        double d = (double)(i >> 16 & 0xff) / 256D;
        double d1 = (double)(i >> 8 & 0xff) / 256D;
        double d2 = (double)(i & 0xff) / 256D;
        double d3 = d;
        if(d1 < d3)
            d3 = d1;
        if(d2 < d3)
            d3 = d2;
        double d4 = d;
        if(j <= 0)
            return;
        if(d1 > d4)
            d4 = d1;
        if(d2 > d4)
            d4 = d2;
        double d5 = 0.0D;
        double d6 = 0.0D;
        double d7 = (d3 + d4) / 2D;
        if(d3 != d4)
        {
            if(d7 < 0.5D)
                d6 = (d4 - d3) / (d4 + d3);
            if(d7 >= 0.5D)
                d6 = (d4 - d3) / (2D - d4 - d3);
            if(d == d4)
                d5 = (d1 - d2) / (d4 - d3);
            else
            if(d1 == d4)
                d5 = 2D + (d2 - d) / (d4 - d3);
            else
            if(d2 == d4)
                d5 = 4D + (d - d1) / (d4 - d3);
        }
        d5 /= 6D;
        anInt760 = (int)(d5 * 256D);
        anInt761 = (int)(d6 * 256D);
        anInt762 = (int)(d7 * 256D);
        if(anInt761 < 0)
            anInt761 = 0;
        else
        if(anInt761 > 255)
            anInt761 = 255;
        if(anInt762 < 0)
            anInt762 = 0;
        else
        if(anInt762 > 255)
            anInt762 = 255;
        if(d7 > 0.5D)
            anInt764 = (int)((1.0D - d7) * d6 * 512D);
        else
            anInt764 = (int)(d7 * d6 * 512D);
        if(anInt764 < 1)
            anInt764 = 1;
        anInt763 = (int)(d5 * (double)anInt764);
        int k = (anInt760 + (int)(Math.random() * 16D)) - 8;
        if(k < 0)
            k = 0;
        else
        if(k > 255)
            k = 255;
        int l = (anInt761 + (int)(Math.random() * 48D)) - 24;
        if(l < 0)
            l = 0;
        else
        if(l > 255)
            l = 255;
        int i1 = (anInt762 + (int)(Math.random() * 48D)) - 24;
        if(i1 < 0)
            i1 = 0;
        else
        if(i1 > 255)
            i1 = 255;
        anInt765 = method587(k, l, i1);
    }

    public int method587(int i, int j, int k)
    {
        if(k > 179)
            j /= 2;
        if(k > 192)
            j /= 2;
        if(k > 217)
            j /= 2;
        if(k > 243)
            j /= 2;
        int l = (i / 4 << 10) + (j / 32 << 7) + k / 2;
        return l;
    }

    public Class45()
    {
        anInt757 = -1;
        aBoolean758 = false;
        aBoolean759 = true;
    }

    public static int anInt753;
    public static Class45 aClass45Array754[];
    public String aString755;
    public int anInt756;
    public int anInt757;
    public boolean aBoolean758;
    public boolean aBoolean759;
    public int anInt760;
    public int anInt761;
    public int anInt762;
    public int anInt763;
    public int anInt764;
    public int anInt765;
}
