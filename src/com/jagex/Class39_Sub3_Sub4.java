package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class39_Sub3_Sub4 extends Class39_Sub3
{

    public static void method473(boolean flag, int ai[], int i, int j)
    {
        anIntArray1459 = ai;
        anInt1460 = i;
        if(flag)
            anInt1458 = -27;
        anInt1461 = j;
        method475(0, (byte)-98, j, i, 0);
    }

    public static void method474(byte byte0)
    {
        anInt1464 = 0;
        anInt1462 = 0;
        anInt1465 = anInt1460;
        anInt1463 = anInt1461;
        if(byte0 == 0)
            byte0 = 0;
        else
            return;
        anInt1466 = anInt1465 - 1;
        anInt1467 = anInt1465 / 2;
    }

    public static void method475(int i, byte byte0, int j, int k, int l)
    {
        if(byte0 != -98)
        {
            for(int i1 = 1; i1 > 0; i1++);
        }
        if(i < 0)
            i = 0;
        if(l < 0)
            l = 0;
        if(k > anInt1460)
            k = anInt1460;
        if(j > anInt1461)
            j = anInt1461;
        anInt1464 = i;
        anInt1462 = l;
        anInt1465 = k;
        anInt1463 = j;
        anInt1466 = anInt1465 - 1;
        anInt1467 = anInt1465 / 2;
        anInt1468 = anInt1463 / 2;
    }

    public static void method476(boolean flag)
    {
        int i = anInt1460 * anInt1461;
        if(flag)
        {
            for(int j = 1; j > 0; j++);
        }
        for(int k = 0; k < i; k++)
            anIntArray1459[k] = 0;

    }

    public static void method477(int i, int j, int k, int l, int i1, byte byte0, int j1)
    {
        if(i1 < anInt1464)
        {
            l -= anInt1464 - i1;
            i1 = anInt1464;
        }
        if(k < anInt1462)
        {
            i -= anInt1462 - k;
            k = anInt1462;
        }
        if(i1 + l > anInt1465)
            l = anInt1465 - i1;
        if(k + i > anInt1463)
            i = anInt1463 - k;
        int k1 = 256 - j;
        if(byte0 == 6)
        {
            byte0 = 0;
        } else
        {
            for(int l1 = 1; l1 > 0; l1++);
        }
        int i2 = (j1 >> 16 & 0xff) * j;
        int j2 = (j1 >> 8 & 0xff) * j;
        int k2 = (j1 & 0xff) * j;
        int k3 = anInt1460 - l;
        int l3 = i1 + k * anInt1460;
        for(int i4 = 0; i4 < i; i4++)
        {
            for(int j4 = -l; j4 < 0; j4++)
            {
                int l2 = (anIntArray1459[l3] >> 16 & 0xff) * k1;
                int i3 = (anIntArray1459[l3] >> 8 & 0xff) * k1;
                int j3 = (anIntArray1459[l3] & 0xff) * k1;
                int k4 = ((i2 + l2 >> 8) << 16) + ((j2 + i3 >> 8) << 8) + (k2 + j3 >> 8);
                anIntArray1459[l3++] = k4;
            }

            l3 += k3;
        }

    }

    public static void method478(byte byte0, int i, int j, int k, int l, int i1)
    {
        if(j < anInt1464)
        {
            i1 -= anInt1464 - j;
            j = anInt1464;
        }
        if(i < anInt1462)
        {
            l -= anInt1462 - i;
            i = anInt1462;
        }
        if(j + i1 > anInt1465)
            i1 = anInt1465 - j;
        if(i + l > anInt1463)
            l = anInt1463 - i;
        int j1 = anInt1460 - i1;
        int k1 = j + i * anInt1460;
        for(int l1 = -l; l1 < 0; l1++)
        {
            for(int i2 = -i1; i2 < 0; i2++)
                anIntArray1459[k1++] = k;

            k1 += j1;
        }

        if(byte0 == 4)
            byte0 = 0;
    }

    public static void method479(int i, int j, int k, int l, int i1, int j1)
    {
        method481(l, j1, 893, j, i1);
        k = 28 / k;
        method481(l, j1, 893, (j + i) - 1, i1);
        method483(anInt1455, i1, i, j, l);
        method483(anInt1455, i1, i, j, (l + j1) - 1);
    }

    public static void method480(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        method482(i, -32613, i1, j1, l, k1);
        method482(i, -32613, i1, (j1 + j) - 1, l, k1);
        if(k <= 0)
            aBoolean1456 = !aBoolean1456;
        if(j >= 3)
        {
            method484(k1, 29392, j - 2, l, j1 + 1, i1);
            method484(k1, 29392, j - 2, (l + i) - 1, j1 + 1, i1);
        }
    }

    public static void method481(int i, int j, int k, int l, int i1)
    {
        k = 73 / k;
        if(l < anInt1462 || l >= anInt1463)
            return;
        if(i < anInt1464)
        {
            j -= anInt1464 - i;
            i = anInt1464;
        }
        if(i + j > anInt1465)
            j = anInt1465 - i;
        int j1 = i + l * anInt1460;
        for(int k1 = 0; k1 < j; k1++)
            anIntArray1459[j1 + k1] = i1;

    }

    public static void method482(int i, int j, int k, int l, int i1, int j1)
    {
        if(l < anInt1462 || l >= anInt1463)
            return;
        if(i1 < anInt1464)
        {
            i -= anInt1464 - i1;
            i1 = anInt1464;
        }
        if(i1 + i > anInt1465)
            i = anInt1465 - i1;
        int k1 = 256 - k;
        int l1 = (j1 >> 16 & 0xff) * k;
        int i2 = (j1 >> 8 & 0xff) * k;
        int j2 = (j1 & 0xff) * k;
        int j3 = i1 + l * anInt1460;
        for(int k3 = 0; k3 < i; k3++)
        {
            int k2 = (anIntArray1459[j3] >> 16 & 0xff) * k1;
            int l2 = (anIntArray1459[j3] >> 8 & 0xff) * k1;
            int i3 = (anIntArray1459[j3] & 0xff) * k1;
            int l3 = ((l1 + k2 >> 8) << 16) + ((i2 + l2 >> 8) << 8) + (j2 + i3 >> 8);
            anIntArray1459[j3++] = l3;
        }

        if(j != -32613)
            aBoolean1456 = !aBoolean1456;
    }

    public static void method483(int i, int j, int k, int l, int i1)
    {
        if(i1 < anInt1464 || i1 >= anInt1465)
            return;
        if(l < anInt1462)
        {
            k -= anInt1462 - l;
            l = anInt1462;
        }
        if(l + k > anInt1463)
            k = anInt1463 - l;
        int j1 = i1 + l * anInt1460;
        if(i != 0)
            return;
        for(int k1 = 0; k1 < k; k1++)
            anIntArray1459[j1 + k1 * anInt1460] = j;

    }

    public static void method484(int i, int j, int k, int l, int i1, int j1)
    {
        if(l < anInt1464 || l >= anInt1465)
            return;
        if(i1 < anInt1462)
        {
            k -= anInt1462 - i1;
            i1 = anInt1462;
        }
        if(i1 + k > anInt1463)
            k = anInt1463 - i1;
        int k1 = 256 - j1;
        int l1 = (i >> 16 & 0xff) * j1;
        int i2 = (i >> 8 & 0xff) * j1;
        int j2 = (i & 0xff) * j1;
        int j3 = l + i1 * anInt1460;
        for(int k3 = 0; k3 < k; k3++)
        {
            int k2 = (anIntArray1459[j3] >> 16 & 0xff) * k1;
            int l2 = (anIntArray1459[j3] >> 8 & 0xff) * k1;
            int i3 = (anIntArray1459[j3] & 0xff) * k1;
            int l3 = ((l1 + k2 >> 8) << 16) + ((i2 + l2 >> 8) << 8) + (j2 + i3 >> 8);
            anIntArray1459[j3] = l3;
            j3 += anInt1460;
        }

        if(j != 29392)
        {
            for(int i4 = 1; i4 > 0; i4++);
        }
    }

    public Class39_Sub3_Sub4()
    {
    }

    public static int anInt1455;
    public static boolean aBoolean1456;
    public static int anInt1457 = 3;
    public static int anInt1458 = -1109;
    public static int anIntArray1459[];
    public static int anInt1460;
    public static int anInt1461;
    public static int anInt1462;
    public static int anInt1463;
    public static int anInt1464;
    public static int anInt1465;
    public static int anInt1466;
    public static int anInt1467;
    public static int anInt1468;
    public static boolean aBoolean1469;

}
