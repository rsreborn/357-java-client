package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class ISAACCipher
{

    public ISAACCipher(int ai[], int i)
    {
        aBoolean255 = true;
        anIntArray258 = new int[256];
        anIntArray257 = new int[256];
        for(int j = 0; j < ai.length; j++)
            anIntArray257[j] = ai[j];

        if(i != 0)
            aBoolean255 = !aBoolean255;
        method218();
    }

    public int getNextKey()
    {
        if(anInt256-- == 0)
        {
            method217();
            anInt256 = 255;
        }
        return anIntArray257[anInt256];
    }

    public void method217()
    {
        anInt260 += ++anInt261;
        for(int i = 0; i < 256; i++)
        {
            int j = anIntArray258[i];
            if((i & 3) == 0)
                anInt259 ^= anInt259 << 13;
            else
            if((i & 3) == 1)
                anInt259 ^= anInt259 >>> 6;
            else
            if((i & 3) == 2)
                anInt259 ^= anInt259 << 2;
            else
            if((i & 3) == 3)
                anInt259 ^= anInt259 >>> 16;
            anInt259 += anIntArray258[i + 128 & 0xff];
            int k;
            anIntArray258[i] = k = anIntArray258[(j & 0x3fc) >> 2] + anInt259 + anInt260;
            anIntArray257[i] = anInt260 = anIntArray258[(k >> 8 & 0x3fc) >> 2] + j;
        }

    }

    public void method218()
    {
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l = i1 = j1 = k1 = l1 = i2 = j2 = k2 = 0x9e3779b9;
        for(int i = 0; i < 4; i++)
        {
            l ^= i1 << 11;
            k1 += l;
            i1 += j1;
            i1 ^= j1 >>> 2;
            l1 += i1;
            j1 += k1;
            j1 ^= k1 << 8;
            i2 += j1;
            k1 += l1;
            k1 ^= l1 >>> 16;
            j2 += k1;
            l1 += i2;
            l1 ^= i2 << 10;
            k2 += l1;
            i2 += j2;
            i2 ^= j2 >>> 4;
            l += i2;
            j2 += k2;
            j2 ^= k2 << 8;
            i1 += j2;
            k2 += l;
            k2 ^= l >>> 9;
            j1 += k2;
            l += i1;
        }

        for(int j = 0; j < 256; j += 8)
        {
            l += anIntArray257[j];
            i1 += anIntArray257[j + 1];
            j1 += anIntArray257[j + 2];
            k1 += anIntArray257[j + 3];
            l1 += anIntArray257[j + 4];
            i2 += anIntArray257[j + 5];
            j2 += anIntArray257[j + 6];
            k2 += anIntArray257[j + 7];
            l ^= i1 << 11;
            k1 += l;
            i1 += j1;
            i1 ^= j1 >>> 2;
            l1 += i1;
            j1 += k1;
            j1 ^= k1 << 8;
            i2 += j1;
            k1 += l1;
            k1 ^= l1 >>> 16;
            j2 += k1;
            l1 += i2;
            l1 ^= i2 << 10;
            k2 += l1;
            i2 += j2;
            i2 ^= j2 >>> 4;
            l += i2;
            j2 += k2;
            j2 ^= k2 << 8;
            i1 += j2;
            k2 += l;
            k2 ^= l >>> 9;
            j1 += k2;
            l += i1;
            anIntArray258[j] = l;
            anIntArray258[j + 1] = i1;
            anIntArray258[j + 2] = j1;
            anIntArray258[j + 3] = k1;
            anIntArray258[j + 4] = l1;
            anIntArray258[j + 5] = i2;
            anIntArray258[j + 6] = j2;
            anIntArray258[j + 7] = k2;
        }

        for(int k = 0; k < 256; k += 8)
        {
            l += anIntArray258[k];
            i1 += anIntArray258[k + 1];
            j1 += anIntArray258[k + 2];
            k1 += anIntArray258[k + 3];
            l1 += anIntArray258[k + 4];
            i2 += anIntArray258[k + 5];
            j2 += anIntArray258[k + 6];
            k2 += anIntArray258[k + 7];
            l ^= i1 << 11;
            k1 += l;
            i1 += j1;
            i1 ^= j1 >>> 2;
            l1 += i1;
            j1 += k1;
            j1 ^= k1 << 8;
            i2 += j1;
            k1 += l1;
            k1 ^= l1 >>> 16;
            j2 += k1;
            l1 += i2;
            l1 ^= i2 << 10;
            k2 += l1;
            i2 += j2;
            i2 ^= j2 >>> 4;
            l += i2;
            j2 += k2;
            j2 ^= k2 << 8;
            i1 += j2;
            k2 += l;
            k2 ^= l >>> 9;
            j1 += k2;
            l += i1;
            anIntArray258[k] = l;
            anIntArray258[k + 1] = i1;
            anIntArray258[k + 2] = j1;
            anIntArray258[k + 3] = k1;
            anIntArray258[k + 4] = l1;
            anIntArray258[k + 5] = i2;
            anIntArray258[k + 6] = j2;
            anIntArray258[k + 7] = k2;
        }

        method217();
        anInt256 = 256;
    }

    public boolean aBoolean255;
    public int anInt256;
    public int anIntArray257[];
    public int anIntArray258[];
    public int anInt259;
    public int anInt260;
    public int anInt261;
}
