package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class7
{

    public Class7(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, int j2, int k2, int l2, int i3, int j3, 
            int k3, int l3, int i4, byte byte0, int j4, int k4)
    {
        aBoolean131 = false;
        aBoolean142 = true;
        if(i4 != k2 || i4 != k || i4 != k3)
            aBoolean142 = false;
        anInt143 = l3;
        anInt144 = i2;
        anInt145 = l1;
        anInt146 = k4;
        char c = '\200';
        int l4 = c / 2;
        int i5 = c / 4;
        int j5 = (c * 3) / 4;
        int ai[] = anIntArrayArray155[l3];
        if(byte0 == 6)
            byte0 = 0;
        else
            aBoolean131 = !aBoolean131;
        int k5 = ai.length;
        anIntArray132 = new int[k5];
        anIntArray133 = new int[k5];
        anIntArray134 = new int[k5];
        int ai1[] = new int[k5];
        int ai2[] = new int[k5];
        int l5 = i3 * c;
        int i6 = j * c;
        for(int j6 = 0; j6 < k5; j6++)
        {
            int k6 = ai[j6];
            if((k6 & 1) == 0 && k6 <= 8)
                k6 = (k6 - i2 - i2 - 1 & 7) + 1;
            if(k6 > 8 && k6 <= 12)
                k6 = (k6 - 9 - i2 & 3) + 9;
            if(k6 > 12 && k6 <= 16)
                k6 = (k6 - 13 - i2 & 3) + 13;
            int l6;
            int j7;
            int l7;
            int j8;
            int i9;
            if(k6 == 1)
            {
                l6 = l5;
                j7 = i6;
                l7 = i4;
                j8 = l2;
                i9 = j4;
            } else
            if(k6 == 2)
            {
                l6 = l5 + l4;
                j7 = i6;
                l7 = i4 + k2 >> 1;
                j8 = l2 + j3 >> 1;
                i9 = j4 + i >> 1;
            } else
            if(k6 == 3)
            {
                l6 = l5 + c;
                j7 = i6;
                l7 = k2;
                j8 = j3;
                i9 = i;
            } else
            if(k6 == 4)
            {
                l6 = l5 + c;
                j7 = i6 + l4;
                l7 = k2 + k >> 1;
                j8 = j3 + k1 >> 1;
                i9 = i + j2 >> 1;
            } else
            if(k6 == 5)
            {
                l6 = l5 + c;
                j7 = i6 + c;
                l7 = k;
                j8 = k1;
                i9 = j2;
            } else
            if(k6 == 6)
            {
                l6 = l5 + l4;
                j7 = i6 + c;
                l7 = k + k3 >> 1;
                j8 = k1 + l >> 1;
                i9 = j2 + i1 >> 1;
            } else
            if(k6 == 7)
            {
                l6 = l5;
                j7 = i6 + c;
                l7 = k3;
                j8 = l;
                i9 = i1;
            } else
            if(k6 == 8)
            {
                l6 = l5;
                j7 = i6 + l4;
                l7 = k3 + i4 >> 1;
                j8 = l + l2 >> 1;
                i9 = i1 + j4 >> 1;
            } else
            if(k6 == 9)
            {
                l6 = l5 + l4;
                j7 = i6 + i5;
                l7 = i4 + k2 >> 1;
                j8 = l2 + j3 >> 1;
                i9 = j4 + i >> 1;
            } else
            if(k6 == 10)
            {
                l6 = l5 + j5;
                j7 = i6 + l4;
                l7 = k2 + k >> 1;
                j8 = j3 + k1 >> 1;
                i9 = i + j2 >> 1;
            } else
            if(k6 == 11)
            {
                l6 = l5 + l4;
                j7 = i6 + j5;
                l7 = k + k3 >> 1;
                j8 = k1 + l >> 1;
                i9 = j2 + i1 >> 1;
            } else
            if(k6 == 12)
            {
                l6 = l5 + i5;
                j7 = i6 + l4;
                l7 = k3 + i4 >> 1;
                j8 = l + l2 >> 1;
                i9 = i1 + j4 >> 1;
            } else
            if(k6 == 13)
            {
                l6 = l5 + i5;
                j7 = i6 + i5;
                l7 = i4;
                j8 = l2;
                i9 = j4;
            } else
            if(k6 == 14)
            {
                l6 = l5 + j5;
                j7 = i6 + i5;
                l7 = k2;
                j8 = j3;
                i9 = i;
            } else
            if(k6 == 15)
            {
                l6 = l5 + j5;
                j7 = i6 + j5;
                l7 = k;
                j8 = k1;
                i9 = j2;
            } else
            {
                l6 = l5 + i5;
                j7 = i6 + j5;
                l7 = k3;
                j8 = l;
                i9 = i1;
            }
            anIntArray132[j6] = l6;
            anIntArray133[j6] = l7;
            anIntArray134[j6] = j7;
            ai1[j6] = j8;
            ai2[j6] = i9;
        }

        int ai3[] = anIntArrayArray156[l3];
        int i7 = ai3.length / 4;
        anIntArray138 = new int[i7];
        anIntArray139 = new int[i7];
        anIntArray140 = new int[i7];
        anIntArray135 = new int[i7];
        anIntArray136 = new int[i7];
        anIntArray137 = new int[i7];
        if(j1 != -1)
            anIntArray141 = new int[i7];
        int k7 = 0;
        for(int i8 = 0; i8 < i7; i8++)
        {
            int k8 = ai3[k7];
            int j9 = ai3[k7 + 1];
            int l9 = ai3[k7 + 2];
            int i10 = ai3[k7 + 3];
            k7 += 4;
            if(j9 < 4)
                j9 = j9 - i2 & 3;
            if(l9 < 4)
                l9 = l9 - i2 & 3;
            if(i10 < 4)
                i10 = i10 - i2 & 3;
            anIntArray138[i8] = j9;
            anIntArray139[i8] = l9;
            anIntArray140[i8] = i10;
            if(k8 == 0)
            {
                anIntArray135[i8] = ai1[j9];
                anIntArray136[i8] = ai1[l9];
                anIntArray137[i8] = ai1[i10];
                if(anIntArray141 != null)
                    anIntArray141[i8] = -1;
            } else
            {
                anIntArray135[i8] = ai2[j9];
                anIntArray136[i8] = ai2[l9];
                anIntArray137[i8] = ai2[i10];
                if(anIntArray141 != null)
                    anIntArray141[i8] = j1;
            }
        }

        int l8 = i4;
        int k9 = k2;
        if(k2 < l8)
            l8 = k2;
        if(k2 > k9)
            k9 = k2;
        if(k < l8)
            l8 = k;
        if(k > k9)
            k9 = k;
        if(k3 < l8)
            l8 = k3;
        if(k3 > k9)
            k9 = k3;
        l8 /= 14;
        k9 /= 14;
    }

    public boolean aBoolean131;
    public int anIntArray132[];
    public int anIntArray133[];
    public int anIntArray134[];
    public int anIntArray135[];
    public int anIntArray136[];
    public int anIntArray137[];
    public int anIntArray138[];
    public int anIntArray139[];
    public int anIntArray140[];
    public int anIntArray141[];
    public boolean aBoolean142;
    public int anInt143;
    public int anInt144;
    public int anInt145;
    public int anInt146;
    public static int anIntArray147[] = new int[6];
    public static int anIntArray148[] = new int[6];
    public static int anIntArray149[] = new int[6];
    public static int anIntArray150[] = new int[6];
    public static int anIntArray151[] = new int[6];
    public static int anIntArray152[] = {
        1, 0
    };
    public static int anIntArray153[] = {
        2, 1
    };
    public static int anIntArray154[] = {
        3, 3
    };
    public static final int anIntArrayArray155[][] = {
        {
            1, 3, 5, 7
        }, {
            1, 3, 5, 7
        }, {
            1, 3, 5, 7
        }, {
            1, 3, 5, 7, 6
        }, {
            1, 3, 5, 7, 6
        }, {
            1, 3, 5, 7, 6
        }, {
            1, 3, 5, 7, 6
        }, {
            1, 3, 5, 7, 2, 6
        }, {
            1, 3, 5, 7, 2, 8
        }, {
            1, 3, 5, 7, 2, 8
        }, {
            1, 3, 5, 7, 11, 12
        }, {
            1, 3, 5, 7, 11, 12
        }, {
            1, 3, 5, 7, 13, 14
        }
    };
    public static final int anIntArrayArray156[][] = {
        {
            0, 1, 2, 3, 0, 0, 1, 3
        }, {
            1, 1, 2, 3, 1, 0, 1, 3
        }, {
            0, 1, 2, 3, 1, 0, 1, 3
        }, {
            0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 
            4, 3
        }, {
            0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 
            2, 4
        }, {
            0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 
            2, 4
        }, {
            0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 
            4, 3
        }, {
            0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 
            4, 5, 1, 0, 5, 3
        }, {
            0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 
            3, 5, 1, 0, 4, 5
        }, {
            0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 
            2, 3, 1, 4, 3, 5
        }, {
            0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 
            2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 
            1, 4, 2, 3
        }, {
            1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 
            2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 
            0, 4, 2, 3
        }, {
            1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 
            4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 
            0, 1, 2, 5
        }
    };

}
