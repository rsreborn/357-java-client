package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class49
{

    public Class49(int i, Buffer class39_sub3_sub3)
    {
        aBoolean828 = false;
        anInt829 = class39_sub3_sub3.readUByte();
        if(i <= 0)
            aBoolean828 = !aBoolean828;
        anIntArray830 = new int[anInt829];
        anIntArrayArray831 = new int[anInt829][];
        for(int j = 0; j < anInt829; j++)
            anIntArray830[j] = class39_sub3_sub3.readUByte();

        for(int k = 0; k < anInt829; k++)
        {
            int l = class39_sub3_sub3.readUByte();
            anIntArrayArray831[k] = new int[l];
            for(int i1 = 0; i1 < l; i1++)
                anIntArrayArray831[k][i1] = class39_sub3_sub3.readUByte();

        }

    }

    public boolean aBoolean828;
    public int anInt829;
    public int anIntArray830[];
    public int anIntArrayArray831[][];
}
