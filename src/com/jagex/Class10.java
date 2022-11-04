package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class10
{

    public Class10(byte byte0, byte abyte0[])
    {
        aBoolean178 = false;
        if(byte0 == 6)
            byte0 = 0;
        else
            throw new NullPointerException();
        method192(0, abyte0);
    }

    public void method192(int i, byte abyte0[])
    {
        Buffer class39_sub3_sub3 = new Buffer(abyte0);
        int j = class39_sub3_sub3.getTribyte();
        int k = class39_sub3_sub3.getTribyte();
        if(k != j)
        {
            byte abyte1[] = new byte[j];
            Class30.method282(abyte1, j, abyte0, k, 6);
            aByteArray179 = abyte1;
            class39_sub3_sub3 = new Buffer(aByteArray179);
            aBoolean185 = true;
        } else
        {
            aByteArray179 = abyte0;
            aBoolean185 = false;
        }
        anInt180 = class39_sub3_sub3.readShort();
        anIntArray181 = new int[anInt180];
        anIntArray182 = new int[anInt180];
        anIntArray183 = new int[anInt180];
        anIntArray184 = new int[anInt180];
        if(i < 0 || i > 0)
        {
            for(int l = 1; l > 0; l++);
        }
        int i1 = class39_sub3_sub3.currentOffset + anInt180 * 10;
        for(int j1 = 0; j1 < anInt180; j1++)
        {
            anIntArray181[j1] = class39_sub3_sub3.readIntBE();
            anIntArray182[j1] = class39_sub3_sub3.getTribyte();
            anIntArray183[j1] = class39_sub3_sub3.getTribyte();
            anIntArray184[j1] = i1;
            i1 += anIntArray183[j1];
        }

    }

    public byte[] method193(String s, byte abyte0[])
    {
        int i = 0;
        s = s.toUpperCase();
        for(int j = 0; j < s.length(); j++)
            i = (i * 61 + s.charAt(j)) - 32;

        for(int k = 0; k < anInt180; k++)
            if(anIntArray181[k] == i)
            {
                if(abyte0 == null)
                    abyte0 = new byte[anIntArray182[k]];
                if(!aBoolean185)
                {
                    Class30.method282(abyte0, anIntArray182[k], aByteArray179, anIntArray183[k], anIntArray184[k]);
                } else
                {
                    for(int l = 0; l < anIntArray182[k]; l++)
                        abyte0[l] = aByteArray179[anIntArray184[k] + l];

                }
                return abyte0;
            }

        return null;
    }

    public boolean aBoolean178;
    public byte aByteArray179[];
    public int anInt180;
    public int anIntArray181[];
    public int anIntArray182[];
    public int anIntArray183[];
    public int anIntArray184[];
    public boolean aBoolean185;
}
