package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class1
{

    public static int method153(int i, int j, byte byte0, int k)
    {
        j &= 3;
        if(byte0 != -68)
            return 2;
        if(j == 0)
            return k;
        if(j == 1)
            return i;
        if(j == 2)
            return 7 - k;
        else
            return 7 - i;
    }

    public static int method154(int i, int j, int k, int l)
    {
        if(j != -17707)
            return anInt39;
        i &= 3;
        if(i == 0)
            return k;
        if(i == 1)
            return 7 - l;
        if(i == 2)
            return 7 - k;
        else
            return l;
    }

    public static int method155(int i, int j, int k, byte byte0, int l, int i1, int j1)
    {
        if((l & 1) == 1)
        {
            int k1 = i;
            i = k;
            k = k1;
        }
        j1 &= 3;
        if(byte0 != 101)
            return 4;
        if(j1 == 0)
            return i1;
        if(j1 == 1)
            return j;
        if(j1 == 2)
            return 7 - i1 - (i - 1);
        else
            return 7 - j - (k - 1);
    }

    public static int method156(int i, int j, boolean flag, int k, int l, int i1, int j1)
    {
        if(!flag)
            return anInt39;
        if((i & 1) == 1)
        {
            int k1 = k;
            k = j1;
            j1 = k1;
        }
        l &= 3;
        if(l == 0)
            return j;
        if(l == 1)
            return 7 - i1 - (k - 1);
        if(l == 2)
            return 7 - j - (j1 - 1);
        else
            return i1;
    }

    public static int anInt39 = 1;

}
