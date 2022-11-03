package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.io.*;

public class Class13
{

    public Class13(int i, int j, byte byte0, RandomAccessFile randomaccessfile, RandomAccessFile randomaccessfile1)
    {
        anInt209 = 3;
        aBoolean210 = true;
        aBoolean211 = false;
        anInt216 = 65000;
        anInt215 = j;
        aRandomAccessFile213 = randomaccessfile;
        aRandomAccessFile214 = randomaccessfile1;
        anInt216 = i;
        if(byte0 == 7)
        {
            byte0 = 0;
            return;
        } else
        {
            throw new NullPointerException();
        }
    }

    public synchronized byte[] method203(int i, int j)
    {
        if(i != 5)
            aBoolean210 = !aBoolean210;
        try
        {
            method206(aRandomAccessFile214, (byte)4, j * 6);
            int i1;
            for(int k = 0; k < 6; k += i1)
            {
                i1 = aRandomAccessFile214.read(aByteArray212, k, 6 - k);
                if(i1 == -1)
                    return null;
            }

            int j1 = ((aByteArray212[0] & 0xff) << 16) + ((aByteArray212[1] & 0xff) << 8) + (aByteArray212[2] & 0xff);
            int k1 = ((aByteArray212[3] & 0xff) << 16) + ((aByteArray212[4] & 0xff) << 8) + (aByteArray212[5] & 0xff);
            if(j1 < 0 || j1 > anInt216)
                return null;
            if(k1 <= 0 || (long)k1 > aRandomAccessFile213.length() / 520L)
                return null;
            byte abyte0[] = new byte[j1];
            int l1 = 0;
            for(int i2 = 0; l1 < j1; i2++)
            {
                if(k1 == 0)
                    return null;
                method206(aRandomAccessFile213, (byte)4, k1 * 520);
                int l = 0;
                int j2 = j1 - l1;
                if(j2 > 512)
                    j2 = 512;
                int k2;
                for(; l < j2 + 8; l += k2)
                {
                    k2 = aRandomAccessFile213.read(aByteArray212, l, (j2 + 8) - l);
                    if(k2 == -1)
                        return null;
                }

                int l2 = ((aByteArray212[0] & 0xff) << 8) + (aByteArray212[1] & 0xff);
                int i3 = ((aByteArray212[2] & 0xff) << 8) + (aByteArray212[3] & 0xff);
                int j3 = ((aByteArray212[4] & 0xff) << 16) + ((aByteArray212[5] & 0xff) << 8) + (aByteArray212[6] & 0xff);
                int k3 = aByteArray212[7] & 0xff;
                if(l2 != j || i3 != i2 || k3 != anInt215)
                    return null;
                if(j3 < 0 || (long)j3 > aRandomAccessFile213.length() / 520L)
                    return null;
                for(int l3 = 0; l3 < j2; l3++)
                    abyte0[l1++] = aByteArray212[l3 + 8];

                k1 = j3;
            }

            return abyte0;
        }
        catch(IOException _ex)
        {
            return null;
        }
    }

    public synchronized boolean method204(boolean flag, int i, int j, byte abyte0[])
    {
        boolean flag1 = method205(i, abyte0, j, 3, true);
        if(flag)
            throw new NullPointerException();
        if(!flag1)
            flag1 = method205(i, abyte0, j, 3, false);
        return flag1;
    }

    public synchronized boolean method205(int i, byte abyte0[], int j, int k, boolean flag)
    {
        if(k < anInt209 || k > anInt209)
            aBoolean211 = !aBoolean211;
        try
        {
            int l;
            if(flag)
            {
                method206(aRandomAccessFile214, (byte)4, j * 6);
                int k1;
                for(int i1 = 0; i1 < 6; i1 += k1)
                {
                    k1 = aRandomAccessFile214.read(aByteArray212, i1, 6 - i1);
                    if(k1 == -1)
                        return false;
                }

                l = ((aByteArray212[3] & 0xff) << 16) + ((aByteArray212[4] & 0xff) << 8) + (aByteArray212[5] & 0xff);
                if(l <= 0 || (long)l > aRandomAccessFile213.length() / 520L)
                    return false;
            } else
            {
                l = (int)((aRandomAccessFile213.length() + 519L) / 520L);
                if(l == 0)
                    l = 1;
            }
            aByteArray212[0] = (byte)(i >> 16);
            aByteArray212[1] = (byte)(i >> 8);
            aByteArray212[2] = (byte)i;
            aByteArray212[3] = (byte)(l >> 16);
            aByteArray212[4] = (byte)(l >> 8);
            aByteArray212[5] = (byte)l;
            method206(aRandomAccessFile214, (byte)4, j * 6);
            aRandomAccessFile214.write(aByteArray212, 0, 6);
            int j1 = 0;
            for(int l1 = 0; j1 < i; l1++)
            {
                int i2 = 0;
                if(flag)
                {
                    method206(aRandomAccessFile213, (byte)4, l * 520);
                    int j2;
                    int l2;
                    for(j2 = 0; j2 < 8; j2 += l2)
                    {
                        l2 = aRandomAccessFile213.read(aByteArray212, j2, 8 - j2);
                        if(l2 == -1)
                            break;
                    }

                    if(j2 == 8)
                    {
                        int i3 = ((aByteArray212[0] & 0xff) << 8) + (aByteArray212[1] & 0xff);
                        int j3 = ((aByteArray212[2] & 0xff) << 8) + (aByteArray212[3] & 0xff);
                        i2 = ((aByteArray212[4] & 0xff) << 16) + ((aByteArray212[5] & 0xff) << 8) + (aByteArray212[6] & 0xff);
                        int k3 = aByteArray212[7] & 0xff;
                        if(i3 != j || j3 != l1 || k3 != anInt215)
                            return false;
                        if(i2 < 0 || (long)i2 > aRandomAccessFile213.length() / 520L)
                            return false;
                    }
                }
                if(i2 == 0)
                {
                    flag = false;
                    i2 = (int)((aRandomAccessFile213.length() + 519L) / 520L);
                    if(i2 == 0)
                        i2++;
                    if(i2 == l)
                        i2++;
                }
                if(i - j1 <= 512)
                    i2 = 0;
                aByteArray212[0] = (byte)(j >> 8);
                aByteArray212[1] = (byte)j;
                aByteArray212[2] = (byte)(l1 >> 8);
                aByteArray212[3] = (byte)l1;
                aByteArray212[4] = (byte)(i2 >> 16);
                aByteArray212[5] = (byte)(i2 >> 8);
                aByteArray212[6] = (byte)i2;
                aByteArray212[7] = (byte)anInt215;
                method206(aRandomAccessFile213, (byte)4, l * 520);
                aRandomAccessFile213.write(aByteArray212, 0, 8);
                int k2 = i - j1;
                if(k2 > 512)
                    k2 = 512;
                aRandomAccessFile213.write(abyte0, j1, k2);
                j1 += k2;
                l = i2;
            }

            return true;
        }
        catch(IOException _ex)
        {
            return false;
        }
    }

    public synchronized void method206(RandomAccessFile randomaccessfile, byte byte0, int i)
        throws IOException
    {
        if(byte0 == 4)
            byte0 = 0;
        else
            anInt209 = -444;
        if(i < 0 || i > 0x3c00000)
        {
            System.out.println("Badseek - pos:" + i + " len:" + randomaccessfile.length());
            i = 0x3c00000;
            try
            {
                Thread.sleep(1000L);
            }
            catch(Exception _ex) { }
        }
        randomaccessfile.seek(i);
    }

    public int anInt209;
    public boolean aBoolean210;
    public boolean aBoolean211;
    public static byte aByteArray212[] = new byte[520];
    public RandomAccessFile aRandomAccessFile213;
    public RandomAccessFile aRandomAccessFile214;
    public int anInt215;
    public int anInt216;

}
