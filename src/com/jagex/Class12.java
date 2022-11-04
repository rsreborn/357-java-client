package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class12
{

    public Class12(int i)
    {
        aClass32Array206 = new Class32[10];
        if(i != 0)
            throw new NullPointerException();
        else
            return;
    }

    public static void method197(byte byte0, Buffer class39_sub3_sub3)
    {
        aByteArray204 = new byte[0x6baa8];
        if(byte0 != 6)
        {
            for(int i = 1; i > 0; i++);
        }
        aClass39_Sub3_Sub3_205 = new Buffer(aByteArray204);
        Class32.method342();
        do
        {
            int j = class39_sub3_sub3.readShort();
            if(j == 65535)
                return;
            aClass12Array202[j] = new Class12(0);
            aClass12Array202[j].method199(5, class39_sub3_sub3);
            anIntArray203[j] = aClass12Array202[j].method200(false);
        } while(true);
    }

    public static Buffer method198(int i, int j, int k)
    {
        if(k != 0)
            anInt201 = -444;
        if(aClass12Array202[i] != null)
        {
            Class12 class12 = aClass12Array202[i];
            return class12.method201((byte)-1, j);
        } else
        {
            return null;
        }
    }

    public void method199(int i, Buffer class39_sub3_sub3)
    {
        for(int j = 0; j < 10; j++)
        {
            int k = class39_sub3_sub3.readUByte();
            if(k != 0)
            {
                class39_sub3_sub3.currentOffset--;
                aClass32Array206[j] = new Class32();
                aClass32Array206[j].method345(5, class39_sub3_sub3);
            }
        }

        anInt207 = class39_sub3_sub3.readShort();
        anInt208 = class39_sub3_sub3.readShort();
        if(i < 5 || i > 5)
            throw new NullPointerException();
        else
            return;
    }

    public int method200(boolean flag)
    {
        int i = 0x98967f;
        for(int j = 0; j < 10; j++)
            if(aClass32Array206[j] != null && aClass32Array206[j].anInt558 / 20 < i)
                i = aClass32Array206[j].anInt558 / 20;

        if(anInt207 < anInt208 && anInt207 / 20 < i)
            i = anInt207 / 20;
        if(i == 0x98967f || i == 0)
            return 0;
        for(int k = 0; k < 10; k++)
            if(aClass32Array206[k] != null)
                aClass32Array206[k].anInt558 -= i * 20;

        if(flag)
            anInt201 = -374;
        if(anInt207 < anInt208)
        {
            anInt207 -= i * 20;
            anInt208 -= i * 20;
        }
        return i;
    }

    public Buffer method201(byte byte0, int i)
    {
        int j = method202(i);
        aClass39_Sub3_Sub3_205.currentOffset = 0;
        aClass39_Sub3_Sub3_205.putInt(0x52494646);
        aClass39_Sub3_Sub3_205.putLEInt(36 + j);
        aClass39_Sub3_Sub3_205.putInt(0x57415645);
        if(byte0 != -1)
            anInt201 = 269;
        aClass39_Sub3_Sub3_205.putInt(0x666d7420);
        aClass39_Sub3_Sub3_205.putLEInt(16);
        aClass39_Sub3_Sub3_205.putLEShort(1);
        aClass39_Sub3_Sub3_205.putLEShort(1);
        aClass39_Sub3_Sub3_205.putLEInt(22050);
        aClass39_Sub3_Sub3_205.putLEInt(22050);
        aClass39_Sub3_Sub3_205.putLEShort(1);
        aClass39_Sub3_Sub3_205.putLEShort(8);
        aClass39_Sub3_Sub3_205.putInt(0x64617461);
        aClass39_Sub3_Sub3_205.putLEInt(j);
        aClass39_Sub3_Sub3_205.currentOffset += j;
        return aClass39_Sub3_Sub3_205;
    }

    public int method202(int i)
    {
        int j = 0;
        for(int k = 0; k < 10; k++)
            if(aClass32Array206[k] != null && aClass32Array206[k].anInt557 + aClass32Array206[k].anInt558 > j)
                j = aClass32Array206[k].anInt557 + aClass32Array206[k].anInt558;

        if(j == 0)
            return 0;
        int l = (22050 * j) / 1000;
        int i1 = (22050 * anInt207) / 1000;
        int j1 = (22050 * anInt208) / 1000;
        if(i1 < 0 || i1 > l || j1 < 0 || j1 > l || i1 >= j1)
            i = 0;
        int k1 = l + (j1 - i1) * (i - 1);
        for(int l1 = 44; l1 < k1 + 44; l1++)
            aByteArray204[l1] = -128;

        for(int i2 = 0; i2 < 10; i2++)
            if(aClass32Array206[i2] != null)
            {
                int j2 = (aClass32Array206[i2].anInt557 * 22050) / 1000;
                int i3 = (aClass32Array206[i2].anInt558 * 22050) / 1000;
                int ai[] = aClass32Array206[i2].method343(j2, aClass32Array206[i2].anInt557);
                for(int l3 = 0; l3 < j2; l3++)
                    aByteArray204[l3 + i3 + 44] += (byte)(ai[l3] >> 8);

            }

        if(i > 1)
        {
            i1 += 44;
            j1 += 44;
            l += 44;
            int k2 = (k1 += 44) - l;
            for(int j3 = l - 1; j3 >= j1; j3--)
                aByteArray204[j3 + k2] = aByteArray204[j3];

            for(int k3 = 1; k3 < i; k3++)
            {
                int l2 = (j1 - i1) * k3;
                for(int i4 = i1; i4 < j1; i4++)
                    aByteArray204[i4 + l2] = aByteArray204[i4];

            }

            k1 -= 44;
        }
        return k1;
    }

    public static int anInt201 = -313;
    public static Class12 aClass12Array202[] = new Class12[5000];
    public static int anIntArray203[] = new int[5000];
    public static byte aByteArray204[];
    public static Buffer aClass39_Sub3_Sub3_205;
    public Class32 aClass32Array206[];
    public int anInt207;
    public int anInt208;

}
