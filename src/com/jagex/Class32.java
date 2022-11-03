package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class32
{

    public static void method342()
    {
        anIntArray560 = new int[32768];
        for(int i = 0; i < 32768; i++)
            if(Math.random() > 0.5D)
                anIntArray560[i] = 1;
            else
                anIntArray560[i] = -1;

        anIntArray561 = new int[32768];
        for(int j = 0; j < 32768; j++)
            anIntArray561[j] = (int)(Math.sin((double)j / 5215.1903000000002D) * 16384D);

        anIntArray559 = new int[0x35d54];
    }

    public int[] method343(int i, int j)
    {
        for(int k = 0; k < i; k++)
            anIntArray559[k] = 0;

        if(j < 10)
            return anIntArray559;
        double d = (double)i / ((double)j + 0.0D);
        aClass36_542.method366(-560);
        aClass36_543.method366(-560);
        int l = 0;
        int i1 = 0;
        int j1 = 0;
        if(aClass36_544 != null)
        {
            aClass36_544.method366(-560);
            aClass36_545.method366(-560);
            l = (int)(((double)(aClass36_544.anInt670 - aClass36_544.anInt669) * 32.768000000000001D) / d);
            i1 = (int)(((double)aClass36_544.anInt669 * 32.768000000000001D) / d);
        }
        int k1 = 0;
        int l1 = 0;
        int i2 = 0;
        if(aClass36_546 != null)
        {
            aClass36_546.method366(-560);
            aClass36_547.method366(-560);
            k1 = (int)(((double)(aClass36_546.anInt670 - aClass36_546.anInt669) * 32.768000000000001D) / d);
            l1 = (int)(((double)aClass36_546.anInt669 * 32.768000000000001D) / d);
        }
        for(int j2 = 0; j2 < 5; j2++)
            if(anIntArray550[j2] != 0)
            {
                anIntArray562[j2] = 0;
                anIntArray563[j2] = (int)((double)anIntArray552[j2] * d);
                anIntArray564[j2] = (anIntArray550[j2] << 14) / 100;
                anIntArray565[j2] = (int)(((double)(aClass36_542.anInt670 - aClass36_542.anInt669) * 32.768000000000001D * Math.pow(1.0057929410678534D, anIntArray551[j2])) / d);
                anIntArray566[j2] = (int)(((double)aClass36_542.anInt669 * 32.768000000000001D) / d);
            }

        for(int k2 = 0; k2 < i; k2++)
        {
            int l2 = aClass36_542.method367(i, -16419);
            int j4 = aClass36_543.method367(i, -16419);
            if(aClass36_544 != null)
            {
                int j5 = aClass36_544.method367(i, -16419);
                int j6 = aClass36_545.method367(i, -16419);
                l2 += method344(j6, aClass36_544.anInt671, j1, 216) >> 1;
                j1 += (j5 * l >> 16) + i1;
            }
            if(aClass36_546 != null)
            {
                int k5 = aClass36_546.method367(i, -16419);
                int k6 = aClass36_547.method367(i, -16419);
                j4 = j4 * ((method344(k6, aClass36_546.anInt671, i2, 216) >> 1) + 32768) >> 15;
                i2 += (k5 * k1 >> 16) + l1;
            }
            for(int l5 = 0; l5 < 5; l5++)
                if(anIntArray550[l5] != 0)
                {
                    int l6 = k2 + anIntArray563[l5];
                    if(l6 < i)
                    {
                        anIntArray559[l6] += method344(j4 * anIntArray564[l5] >> 15, aClass36_542.anInt671, anIntArray562[l5], 216);
                        anIntArray562[l5] += (l2 * anIntArray565[l5] >> 16) + anIntArray566[l5];
                    }
                }

        }

        if(aClass36_548 != null)
        {
            aClass36_548.method366(-560);
            aClass36_549.method366(-560);
            int i3 = 0;
            boolean flag = false;
            boolean flag1 = true;
            for(int i7 = 0; i7 < i; i7++)
            {
                int k7 = aClass36_548.method367(i, -16419);
                int i8 = aClass36_549.method367(i, -16419);
                int k4;
                if(flag1)
                    k4 = aClass36_548.anInt669 + ((aClass36_548.anInt670 - aClass36_548.anInt669) * k7 >> 8);
                else
                    k4 = aClass36_548.anInt669 + ((aClass36_548.anInt670 - aClass36_548.anInt669) * i8 >> 8);
                if((i3 += 256) >= k4)
                {
                    i3 = 0;
                    flag1 = !flag1;
                }
                if(flag1)
                    anIntArray559[i7] = 0;
            }

        }
        if(anInt553 > 0 && anInt554 > 0)
        {
            int j3 = (int)((double)anInt553 * d);
            for(int l4 = j3; l4 < i; l4++)
                anIntArray559[l4] += (anIntArray559[l4 - j3] * anInt554) / 100;

        }
        if(aClass46_555.anIntArray770[0] > 0 || aClass46_555.anIntArray770[1] > 0)
        {
            aClass36_556.method366(-560);
            int k3 = aClass36_556.method367(i + 1, -16419);
            int i5 = aClass46_555.method591(0, (float)k3 / 65536F, anInt540);
            int i6 = aClass46_555.method591(1, (float)k3 / 65536F, anInt540);
            if(i >= i5 + i6)
            {
                int j7 = 0;
                int l7 = i6;
                if(l7 > i - i5)
                    l7 = i - i5;
                for(; j7 < l7; j7++)
                {
                    int j8 = (int)((long)anIntArray559[j7 + i5] * (long)Class46.anInt777 >> 16);
                    for(int k8 = 0; k8 < i5; k8++)
                        j8 += (int)((long)anIntArray559[(j7 + i5) - 1 - k8] * (long)Class46.anIntArrayArray775[0][k8] >> 16);

                    for(int j9 = 0; j9 < j7; j9++)
                        j8 -= (int)((long)anIntArray559[j7 - 1 - j9] * (long)Class46.anIntArrayArray775[1][j9] >> 16);

                    anIntArray559[j7] = j8;
                    k3 = aClass36_556.method367(i + 1, -16419);
                }

                char c = '\200';
                l7 = c;
                do
                {
                    if(l7 > i - i5)
                        l7 = i - i5;
                    for(; j7 < l7; j7++)
                    {
                        int l8 = (int)((long)anIntArray559[j7 + i5] * (long)Class46.anInt777 >> 16);
                        for(int k9 = 0; k9 < i5; k9++)
                            l8 += (int)((long)anIntArray559[(j7 + i5) - 1 - k9] * (long)Class46.anIntArrayArray775[0][k9] >> 16);

                        for(int i10 = 0; i10 < i6; i10++)
                            l8 -= (int)((long)anIntArray559[j7 - 1 - i10] * (long)Class46.anIntArrayArray775[1][i10] >> 16);

                        anIntArray559[j7] = l8;
                        k3 = aClass36_556.method367(i + 1, -16419);
                    }

                    if(j7 >= i - i5)
                        break;
                    i5 = aClass46_555.method591(0, (float)k3 / 65536F, anInt540);
                    i6 = aClass46_555.method591(1, (float)k3 / 65536F, anInt540);
                    l7 += c;
                } while(true);
                for(; j7 < i; j7++)
                {
                    int i9 = 0;
                    for(int l9 = (j7 + i5) - i; l9 < i5; l9++)
                        i9 += (int)((long)anIntArray559[(j7 + i5) - 1 - l9] * (long)Class46.anIntArrayArray775[0][l9] >> 16);

                    for(int j10 = 0; j10 < i6; j10++)
                        i9 -= (int)((long)anIntArray559[j7 - 1 - j10] * (long)Class46.anIntArrayArray775[1][j10] >> 16);

                    anIntArray559[j7] = i9;
                    int l3 = aClass36_556.method367(i + 1, -16419);
                }

            }
        }
        for(int i4 = 0; i4 < i; i4++)
        {
            if(anIntArray559[i4] < -32768)
                anIntArray559[i4] = -32768;
            if(anIntArray559[i4] > 32767)
                anIntArray559[i4] = 32767;
        }

        return anIntArray559;
    }

    public int method344(int i, int j, int k, int l)
    {
        l = 55 / l;
        if(j == 1)
            if((k & 0x7fff) < 16384)
                return i;
            else
                return -i;
        if(j == 2)
            return anIntArray561[k & 0x7fff] * i >> 14;
        if(j == 3)
            return ((k & 0x7fff) * i >> 14) - i;
        if(j == 4)
            return anIntArray560[k / 2607 & 0x7fff] * i;
        else
            return 0;
    }

    public void method345(int i, Buffer class39_sub3_sub3)
    {
        aClass36_542 = new Class36();
        aClass36_542.method364(5, class39_sub3_sub3);
        aClass36_543 = new Class36();
        aClass36_543.method364(5, class39_sub3_sub3);
        int j = class39_sub3_sub3.getUnsignedByte();
        if(j != 0)
        {
            class39_sub3_sub3.currentOffset--;
            aClass36_544 = new Class36();
            aClass36_544.method364(5, class39_sub3_sub3);
            aClass36_545 = new Class36();
            aClass36_545.method364(5, class39_sub3_sub3);
        }
        j = class39_sub3_sub3.getUnsignedByte();
        if(j != 0)
        {
            class39_sub3_sub3.currentOffset--;
            aClass36_546 = new Class36();
            aClass36_546.method364(5, class39_sub3_sub3);
            aClass36_547 = new Class36();
            aClass36_547.method364(5, class39_sub3_sub3);
        }
        j = class39_sub3_sub3.getUnsignedByte();
        if(j != 0)
        {
            class39_sub3_sub3.currentOffset--;
            aClass36_548 = new Class36();
            aClass36_548.method364(5, class39_sub3_sub3);
            aClass36_549 = new Class36();
            aClass36_549.method364(5, class39_sub3_sub3);
        }
        for(int k = 0; k < 10; k++)
        {
            int l = class39_sub3_sub3.getByteOrShortC();
            if(l == 0)
                break;
            anIntArray550[k] = l;
            anIntArray551[k] = class39_sub3_sub3.method448();
            anIntArray552[k] = class39_sub3_sub3.getByteOrShortC();
        }

        anInt553 = class39_sub3_sub3.getByteOrShortC();
        anInt554 = class39_sub3_sub3.getByteOrShortC();
        anInt557 = class39_sub3_sub3.getShort();
        anInt558 = class39_sub3_sub3.getShort();
        aClass46_555 = new Class46();
        aClass36_556 = new Class36();
        if(i < 5 || i > 5)
        {
            throw new NullPointerException();
        } else
        {
            aClass46_555.method592(class39_sub3_sub3, aClass36_556, anInt541);
            return;
        }
    }

    public Class32()
    {
        anIntArray550 = new int[5];
        anIntArray551 = new int[5];
        anIntArray552 = new int[5];
        anInt554 = 100;
        anInt557 = 500;
    }

    public static int anInt540 = 48306;
    public int anInt541;
    public Class36 aClass36_542;
    public Class36 aClass36_543;
    public Class36 aClass36_544;
    public Class36 aClass36_545;
    public Class36 aClass36_546;
    public Class36 aClass36_547;
    public Class36 aClass36_548;
    public Class36 aClass36_549;
    public int anIntArray550[];
    public int anIntArray551[];
    public int anIntArray552[];
    public int anInt553;
    public int anInt554;
    public Class46 aClass46_555;
    public Class36 aClass36_556;
    public int anInt557;
    public int anInt558;
    public static int anIntArray559[];
    public static int anIntArray560[];
    public static int anIntArray561[];
    public static int anIntArray562[] = new int[5];
    public static int anIntArray563[] = new int[5];
    public static int anIntArray564[] = new int[5];
    public static int anIntArray565[] = new int[5];
    public static int anIntArray566[] = new int[5];

}
