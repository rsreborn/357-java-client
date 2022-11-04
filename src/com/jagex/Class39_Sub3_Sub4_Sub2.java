package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.util.Random;

public class Class39_Sub3_Sub4_Sub2 extends Class39_Sub3_Sub4
{

    public Class39_Sub3_Sub4_Sub2(String s, byte byte0, boolean flag, Class10 class10)
    {
        anInt1692 = 182;
        aBoolean1693 = false;
        anInt1694 = 1;
        aBoolean1695 = false;
        anInt1696 = -16;
        aByteArrayArray1697 = new byte[256][];
        anIntArray1698 = new int[256];
        anIntArray1699 = new int[256];
        anIntArray1700 = new int[256];
        anIntArray1701 = new int[256];
        anIntArray1702 = new int[256];
        aRandom1704 = new Random();
        aBoolean1705 = false;
        Buffer class39_sub3_sub3 = new Buffer(class10.method193(s + ".dat", null));
        if(byte0 != -40)
            aBoolean1693 = !aBoolean1693;
        Buffer class39_sub3_sub3_1 = new Buffer(class10.method193("index.dat", null));
        byte byte1 = -1;
        class39_sub3_sub3_1.currentOffset = class39_sub3_sub3.readShort() + 4;
        int j = class39_sub3_sub3_1.readUByte();
        if(j > 0)
            class39_sub3_sub3_1.currentOffset += 3 * (j - 1);
        for(int k = 0; k < 256; k++)
        {
            int i = k;
            anIntArray1700[k] = class39_sub3_sub3_1.readUByte();
            anIntArray1701[k] = class39_sub3_sub3_1.readUByte();
            int l = anIntArray1698[k] = class39_sub3_sub3_1.readShort();
            int i1 = anIntArray1699[k] = class39_sub3_sub3_1.readShort();
            int j1 = class39_sub3_sub3_1.readUByte();
            int k1 = l * i1;
            aByteArrayArray1697[k] = new byte[k1];
            if(j1 == 0)
            {
                for(int l1 = 0; l1 < k1; l1++)
                    aByteArrayArray1697[k][l1] = class39_sub3_sub3.getByte();

            } else
            if(j1 == 1)
            {
                for(int i2 = 0; i2 < l; i2++)
                {
                    for(int k2 = 0; k2 < i1; k2++)
                        aByteArrayArray1697[k][i2 + k2 * l] = class39_sub3_sub3.getByte();

                }

            }
            if(i1 > anInt1703 && k < 128)
                anInt1703 = i1;
            anIntArray1700[k] = 1;
            anIntArray1702[k] = l + 2;
            int j2 = 0;
            for(int l2 = i1 / 7; l2 < i1; l2++)
                j2 += aByteArrayArray1697[k][l2 * l];

            if(j2 <= i1 / 7)
            {
                anIntArray1702[k]--;
                anIntArray1700[k] = 0;
            }
            j2 = 0;
            for(int i3 = i1 / 7; i3 < i1; i3++)
                j2 += aByteArrayArray1697[k][(l - 1) + i3 * l];

            if(j2 <= i1 / 7)
                anIntArray1702[k]--;
        }

        if(flag)
        {
            anIntArray1702[32] = anIntArray1702[73];
            return;
        } else
        {
            anIntArray1702[32] = anIntArray1702[105];
            return;
        }
    }

    public void method502(int i, int j, String s, int k, int l)
    {
        method507(l, (byte)118, s, i, j - method506(-16, s));
        while(k >= 0) 
            aBoolean1695 = !aBoolean1695;
    }

    public void method503(int i, int j, int k, String s, int l)
    {
        if(j != 41480)
        {
            return;
        } else
        {
            method507(k, (byte)118, s, l, i - method506(-16, s) / 2);
            return;
        }
    }

    public void method504(int i, int j, int k, boolean flag, int l, String s)
    {
        method511(s, l - method505(1, s) / 2, i, flag, 0, j);
        if(k != 0)
        {
            for(int i1 = 1; i1 > 0; i1++);
        }
    }

    public int method505(int i, String s)
    {
        if(s == null)
            return 0;
        int j = 0;
        for(int k = 0; k < s.length(); k++)
            if(s.charAt(k) == '@' && k + 4 < s.length() && s.charAt(k + 4) == '@')
                k += 4;
            else
                j += anIntArray1702[s.charAt(k)];

        if(i < anInt1694 || i > anInt1694)
            return 2;
        else
            return j;
    }

    public int method506(int i, String s)
    {
        while(i >= 0) 
            return 3;
        if(s == null)
            return 0;
        int j = 0;
        for(int k = 0; k < s.length(); k++)
            j += anIntArray1702[s.charAt(k)];

        return j;
    }

    public void method507(int i, byte byte0, String s, int j, int k)
    {
        if(byte0 != 118)
            return;
        if(s == null)
            return;
        j -= anInt1703;
        for(int l = 0; l < s.length(); l++)
        {
            char c = s.charAt(l);
            if(c != ' ')
                method514(aByteArrayArray1697[c], k + anIntArray1700[c], j + anIntArray1701[c], anIntArray1698[c], anIntArray1699[c], i);
            k += anIntArray1702[c];
        }

    }

    public void method508(String s, int i, int j, int k, byte byte0, int l)
    {
        if(s == null)
            return;
        j -= method506(-16, s) / 2;
        k -= anInt1703;
        for(int i1 = 0; i1 < s.length(); i1++)
        {
            char c = s.charAt(i1);
            if(c != ' ')
                method514(aByteArrayArray1697[c], j + anIntArray1700[c], k + anIntArray1701[c] + (int)(Math.sin((double)i1 / 2D + (double)l / 5D) * 5D), anIntArray1698[c], anIntArray1699[c], i);
            j += anIntArray1702[c];
        }

        if(byte0 == 1)
        {
            byte0 = 0;
            return;
        }
        for(int j1 = 1; j1 > 0; j1++);
    }

    public void method509(int i, int j, int k, int l, String s, int i1)
    {
        if(s == null)
            return;
        j -= method506(-16, s) / 2;
        if(l <= 0)
        {
            for(int j1 = 1; j1 > 0; j1++);
        }
        i -= anInt1703;
        for(int k1 = 0; k1 < s.length(); k1++)
        {
            char c = s.charAt(k1);
            if(c != ' ')
                method514(aByteArrayArray1697[c], j + anIntArray1700[c] + (int)(Math.sin((double)k1 / 5D + (double)k / 5D) * 5D), i + anIntArray1701[c] + (int)(Math.sin((double)k1 / 3D + (double)k / 5D) * 5D), anIntArray1698[c], anIntArray1699[c], i1);
            j += anIntArray1702[c];
        }

    }

    public void method510(byte byte0, int i, int j, int k, int l, int i1, String s)
    {
        if(s == null)
            return;
        double d = 7D - (double)i / 8D;
        if(d < 0.0D)
            d = 0.0D;
        l -= method506(-16, s) / 2;
        k -= anInt1703;
        for(int j1 = 0; j1 < s.length(); j1++)
        {
            char c = s.charAt(j1);
            if(c != ' ')
                method514(aByteArrayArray1697[c], l + anIntArray1700[c], k + anIntArray1701[c] + (int)(Math.sin((double)j1 / 1.5D + (double)i1) * d), anIntArray1698[c], anIntArray1699[c], j);
            l += anIntArray1702[c];
        }

        if(byte0 == 102);
    }

    public void method511(String s, int i, int j, boolean flag, int k, int l)
    {
        aBoolean1705 = false;
        int i1 = i;
        if(k != 0)
            return;
        if(s == null)
            return;
        j -= anInt1703;
        for(int j1 = 0; j1 < s.length(); j1++)
            if(s.charAt(j1) == '@' && j1 + 4 < s.length() && s.charAt(j1 + 4) == '@')
            {
                int k1 = method513(s.substring(j1 + 1, j1 + 4), true);
                if(k1 != -1)
                    l = k1;
                j1 += 4;
            } else
            {
                char c = s.charAt(j1);
                if(c != ' ')
                {
                    if(flag)
                        method514(aByteArrayArray1697[c], i + anIntArray1700[c] + 1, j + anIntArray1701[c] + 1, anIntArray1698[c], anIntArray1699[c], 0);
                    method514(aByteArrayArray1697[c], i + anIntArray1700[c], j + anIntArray1701[c], anIntArray1698[c], anIntArray1699[c], l);
                }
                i += anIntArray1702[c];
            }

        if(aBoolean1705)
            Class39_Sub3_Sub4.method481(i1, i - i1, 893, j + (int)((double)anInt1703 * 0.69999999999999996D), 0x800000);
    }

    public void method512(int i, String s, int j, int k, boolean flag, int l, int i1)
    {
        if(s == null)
            return;
        aRandom1704.setSeed(i1);
        j = 51 / j;
        int j1 = 192 + (aRandom1704.nextInt() & 0x1f);
        i -= anInt1703;
        for(int k1 = 0; k1 < s.length(); k1++)
            if(s.charAt(k1) == '@' && k1 + 4 < s.length() && s.charAt(k1 + 4) == '@')
            {
                int l1 = method513(s.substring(k1 + 1, k1 + 4), true);
                if(l1 != -1)
                    l = l1;
                k1 += 4;
            } else
            {
                char c = s.charAt(k1);
                if(c != ' ')
                {
                    if(flag)
                        method516(0, k + anIntArray1700[c] + 1, anIntArray1699[c], i + anIntArray1701[c] + 1, anIntArray1698[c], 192, 0, aByteArrayArray1697[c]);
                    method516(l, k + anIntArray1700[c], anIntArray1699[c], i + anIntArray1701[c], anIntArray1698[c], j1, 0, aByteArrayArray1697[c]);
                }
                k += anIntArray1702[c];
                if((aRandom1704.nextInt() & 3) == 0)
                    k++;
            }

    }

    public int method513(String s, boolean flag)
    {
        if(!flag)
            anInt1694 = 489;
        if(s.equals("red"))
            return 0xff0000;
        if(s.equals("gre"))
            return 65280;
        if(s.equals("blu"))
            return 255;
        if(s.equals("yel"))
            return 0xffff00;
        if(s.equals("cya"))
            return 65535;
        if(s.equals("mag"))
            return 0xff00ff;
        if(s.equals("whi"))
            return 0xffffff;
        if(s.equals("bla"))
            return 0;
        if(s.equals("lre"))
            return 0xff9040;
        if(s.equals("dre"))
            return 0x800000;
        if(s.equals("dbl"))
            return 128;
        if(s.equals("or1"))
            return 0xffb000;
        if(s.equals("or2"))
            return 0xff7000;
        if(s.equals("or3"))
            return 0xff3000;
        if(s.equals("gr1"))
            return 0xc0ff00;
        if(s.equals("gr2"))
            return 0x80ff00;
        if(s.equals("gr3"))
            return 0x40ff00;
        if(s.equals("str"))
            aBoolean1705 = true;
        if(s.equals("end"))
            aBoolean1705 = false;
        return -1;
    }

    public void method514(byte abyte0[], int i, int j, int k, int l, int i1)
    {
        int j1 = i + j * Class39_Sub3_Sub4.anInt1460;
        int k1 = Class39_Sub3_Sub4.anInt1460 - k;
        int l1 = 0;
        int i2 = 0;
        if(j < Class39_Sub3_Sub4.anInt1462)
        {
            int j2 = Class39_Sub3_Sub4.anInt1462 - j;
            l -= j2;
            j = Class39_Sub3_Sub4.anInt1462;
            i2 += j2 * k;
            j1 += j2 * Class39_Sub3_Sub4.anInt1460;
        }
        if(j + l >= Class39_Sub3_Sub4.anInt1463)
            l -= ((j + l) - Class39_Sub3_Sub4.anInt1463) + 1;
        if(i < Class39_Sub3_Sub4.anInt1464)
        {
            int k2 = Class39_Sub3_Sub4.anInt1464 - i;
            k -= k2;
            i = Class39_Sub3_Sub4.anInt1464;
            i2 += k2;
            j1 += k2;
            l1 += k2;
            k1 += k2;
        }
        if(i + k >= Class39_Sub3_Sub4.anInt1465)
        {
            int l2 = ((i + k) - Class39_Sub3_Sub4.anInt1465) + 1;
            k -= l2;
            l1 += l2;
            k1 += l2;
        }
        if(k <= 0 || l <= 0)
        {
            return;
        } else
        {
            method515(Class39_Sub3_Sub4.anIntArray1459, abyte0, i1, i2, j1, k, l, k1, l1);
            return;
        }
    }

    public void method515(int ai[], byte abyte0[], int i, int j, int k, int l, int i1, 
            int j1, int k1)
    {
        int l1 = -(l >> 2);
        l = -(l & 3);
        for(int i2 = -i1; i2 < 0; i2++)
        {
            for(int j2 = l1; j2 < 0; j2++)
            {
                if(abyte0[j++] != 0)
                    ai[k++] = i;
                else
                    k++;
                if(abyte0[j++] != 0)
                    ai[k++] = i;
                else
                    k++;
                if(abyte0[j++] != 0)
                    ai[k++] = i;
                else
                    k++;
                if(abyte0[j++] != 0)
                    ai[k++] = i;
                else
                    k++;
            }

            for(int k2 = l; k2 < 0; k2++)
                if(abyte0[j++] != 0)
                    ai[k++] = i;
                else
                    k++;

            k += j1;
            j += k1;
        }

    }

    public void method516(int i, int j, int k, int l, int i1, int j1, int k1, 
            byte abyte0[])
    {
        if(k1 != 0)
            anInt1696 = -94;
        int l1 = j + l * Class39_Sub3_Sub4.anInt1460;
        int i2 = Class39_Sub3_Sub4.anInt1460 - i1;
        int j2 = 0;
        int k2 = 0;
        if(l < Class39_Sub3_Sub4.anInt1462)
        {
            int l2 = Class39_Sub3_Sub4.anInt1462 - l;
            k -= l2;
            l = Class39_Sub3_Sub4.anInt1462;
            k2 += l2 * i1;
            l1 += l2 * Class39_Sub3_Sub4.anInt1460;
        }
        if(l + k >= Class39_Sub3_Sub4.anInt1463)
            k -= ((l + k) - Class39_Sub3_Sub4.anInt1463) + 1;
        if(j < Class39_Sub3_Sub4.anInt1464)
        {
            int i3 = Class39_Sub3_Sub4.anInt1464 - j;
            i1 -= i3;
            j = Class39_Sub3_Sub4.anInt1464;
            k2 += i3;
            l1 += i3;
            j2 += i3;
            i2 += i3;
        }
        if(j + i1 >= Class39_Sub3_Sub4.anInt1465)
        {
            int j3 = ((j + i1) - Class39_Sub3_Sub4.anInt1465) + 1;
            i1 -= j3;
            j2 += j3;
            i2 += j3;
        }
        if(i1 <= 0 || k <= 0)
        {
            return;
        } else
        {
            method517(abyte0, i1, i, j2, i2, j1, k, 3, k2, Class39_Sub3_Sub4.anIntArray1459, l1);
            return;
        }
    }

    public void method517(byte abyte0[], int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1, int ai[], int i2)
    {
        j = ((j & 0xff00ff) * i1 & 0xff00ff00) + ((j & 0xff00) * i1 & 0xff0000) >> 8;
        if(k1 != 3)
            anInt1692 = -12;
        i1 = 256 - i1;
        for(int j2 = -j1; j2 < 0; j2++)
        {
            for(int k2 = -i; k2 < 0; k2++)
                if(abyte0[l1++] != 0)
                {
                    int l2 = ai[i2];
                    ai[i2++] = (((l2 & 0xff00ff) * i1 & 0xff00ff00) + ((l2 & 0xff00) * i1 & 0xff0000) >> 8) + j;
                } else
                {
                    i2++;
                }

            i2 += l;
            l1 += k;
        }

    }

    public int anInt1692;
    public boolean aBoolean1693;
    public int anInt1694;
    public boolean aBoolean1695;
    public int anInt1696;
    public byte aByteArrayArray1697[][];
    public int anIntArray1698[];
    public int anIntArray1699[];
    public int anIntArray1700[];
    public int anIntArray1701[];
    public int anIntArray1702[];
    public int anInt1703;
    public Random aRandom1704;
    public boolean aBoolean1705;
}
