package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class33
{

    public static void method346(int i)
    {
        aClass33Array568 = new Class33[i + 1];
        aBooleanArray576 = new boolean[i + 1];
        for(int j = 0; j < i + 1; j++)
            aBooleanArray576[j] = true;

    }

    public static void method347(byte byte0, byte abyte0[])
    {
        Buffer class39_sub3_sub3 = new Buffer(abyte0);
        class39_sub3_sub3.currentOffset = abyte0.length - 8;
        int i = class39_sub3_sub3.getShort();
        int j = class39_sub3_sub3.getShort();
        int k = class39_sub3_sub3.getShort();
        int l = class39_sub3_sub3.getShort();
        int i1 = 0;
        Buffer class39_sub3_sub3_1 = new Buffer(abyte0);
        if(byte0 != -111)
            anInt567 = -338;
        class39_sub3_sub3_1.currentOffset = i1;
        i1 += i + 2;
        Buffer class39_sub3_sub3_2 = new Buffer(abyte0);
        class39_sub3_sub3_2.currentOffset = i1;
        i1 += j;
        Buffer class39_sub3_sub3_3 = new Buffer(abyte0);
        class39_sub3_sub3_3.currentOffset = i1;
        i1 += k;
        Buffer class39_sub3_sub3_4 = new Buffer(abyte0);
        class39_sub3_sub3_4.currentOffset = i1;
        i1 += l;
        Buffer class39_sub3_sub3_5 = new Buffer(abyte0);
        class39_sub3_sub3_5.currentOffset = i1;
        Class49 class49 = new Class49(453, class39_sub3_sub3_5);
        int j1 = class39_sub3_sub3_1.getShort();
        int ai[] = new int[500];
        int ai1[] = new int[500];
        int ai2[] = new int[500];
        int ai3[] = new int[500];
        for(int k1 = 0; k1 < j1; k1++)
        {
            int l1 = class39_sub3_sub3_1.getShort();
            Class33 class33 = aClass33Array568[l1] = new Class33();
            class33.anInt569 = class39_sub3_sub3_4.getUnsignedByte();
            class33.aClass49_570 = class49;
            int i2 = class39_sub3_sub3_1.getUnsignedByte();
            int j2 = -1;
            int k2 = 0;
            for(int l2 = 0; l2 < i2; l2++)
            {
                int i3 = class39_sub3_sub3_2.getUnsignedByte();
                if(i3 > 0)
                {
                    if(class49.anIntArray830[l2] != 0)
                    {
                        for(int k3 = l2 - 1; k3 > j2; k3--)
                        {
                            if(class49.anIntArray830[k3] != 0)
                                continue;
                            ai[k2] = k3;
                            ai1[k2] = 0;
                            ai2[k2] = 0;
                            ai3[k2] = 0;
                            k2++;
                            break;
                        }

                    }
                    ai[k2] = l2;
                    char c = '\0';
                    if(class49.anIntArray830[l2] == 3)
                        c = '\200';
                    if((i3 & 1) != 0)
                        ai1[k2] = class39_sub3_sub3_3.method448();
                    else
                        ai1[k2] = c;
                    if((i3 & 2) != 0)
                        ai2[k2] = class39_sub3_sub3_3.method448();
                    else
                        ai2[k2] = c;
                    if((i3 & 4) != 0)
                        ai3[k2] = class39_sub3_sub3_3.method448();
                    else
                        ai3[k2] = c;
                    j2 = l2;
                    k2++;
                    if(class49.anIntArray830[l2] == 5)
                        aBooleanArray576[l1] = false;
                }
            }

            class33.anInt571 = k2;
            class33.anIntArray572 = new int[k2];
            class33.anIntArray573 = new int[k2];
            class33.anIntArray574 = new int[k2];
            class33.anIntArray575 = new int[k2];
            for(int j3 = 0; j3 < k2; j3++)
            {
                class33.anIntArray572[j3] = ai[j3];
                class33.anIntArray573[j3] = ai1[j3];
                class33.anIntArray574[j3] = ai2[j3];
                class33.anIntArray575[j3] = ai3[j3];
            }

        }

    }

    public static void method348(int i)
    {
        aClass33Array568 = null;
        if(i == -29497);
    }

    public static Class33 method349(int i)
    {
        if(aClass33Array568 == null)
            return null;
        else
            return aClass33Array568[i];
    }

    public static boolean method350(byte byte0, int i)
    {
        if(byte0 != 9)
            throw new NullPointerException();
        return i == -1;
    }

    public Class33()
    {
    }

    public static int anInt567 = 18;
    public static Class33 aClass33Array568[];
    public int anInt569;
    public Class49 aClass49_570;
    public int anInt571;
    public int anIntArray572[];
    public int anIntArray573[];
    public int anIntArray574[];
    public int anIntArray575[];
    public static boolean aBooleanArray576[];

}
