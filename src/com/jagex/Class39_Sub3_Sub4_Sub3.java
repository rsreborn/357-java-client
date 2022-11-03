package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class39_Sub3_Sub4_Sub3 extends Class39_Sub3_Sub4
{

    public Class39_Sub3_Sub4_Sub3(Class10 class10, String s, int i)
    {
        anInt1706 = 3;
        anInt1707 = 2276;
        anInt1708 = 4;
        aBoolean1709 = false;
        aByte1710 = 7;
        anInt1711 = 3;
        aBoolean1712 = false;
        aBoolean1713 = false;
        aBoolean1714 = true;
        Buffer class39_sub3_sub3 = new Buffer(class10.method193(s + ".dat", null));
        Buffer class39_sub3_sub3_1 = new Buffer(class10.method193("index.dat", null));
        class39_sub3_sub3_1.currentOffset = class39_sub3_sub3.getShort();
        anInt1721 = class39_sub3_sub3_1.getShort();
        anInt1722 = class39_sub3_sub3_1.getShort();
        int j = class39_sub3_sub3_1.getUnsignedByte();
        anIntArray1716 = new int[j];
        for(int k = 0; k < j - 1; k++)
            anIntArray1716[k + 1] = class39_sub3_sub3_1.getTribyte();

        for(int l = 0; l < i; l++)
        {
            class39_sub3_sub3_1.currentOffset += 2;
            class39_sub3_sub3.currentOffset += class39_sub3_sub3_1.getShort() * class39_sub3_sub3_1.getShort();
            class39_sub3_sub3_1.currentOffset++;
        }

        anInt1719 = class39_sub3_sub3_1.getUnsignedByte();
        anInt1720 = class39_sub3_sub3_1.getUnsignedByte();
        anInt1717 = class39_sub3_sub3_1.getShort();
        anInt1718 = class39_sub3_sub3_1.getShort();
        int i1 = class39_sub3_sub3_1.getUnsignedByte();
        int j1 = anInt1717 * anInt1718;
        aByteArray1715 = new byte[j1];
        if(i1 == 0)
        {
            for(int k1 = 0; k1 < j1; k1++)
                aByteArray1715[k1] = class39_sub3_sub3.getByte();

            return;
        }
        if(i1 == 1)
        {
            for(int l1 = 0; l1 < anInt1717; l1++)
            {
                for(int i2 = 0; i2 < anInt1718; i2++)
                    aByteArray1715[l1 + i2 * anInt1717] = class39_sub3_sub3.getByte();

            }

        }
    }

    public void method518(byte byte0)
    {
        anInt1721 /= 2;
        anInt1722 /= 2;
        byte abyte0[] = new byte[anInt1721 * anInt1722];
        int i = 0;
        if(byte0 == aByte1710)
            byte0 = 0;
        else
            anInt1706 = 130;
        for(int j = 0; j < anInt1718; j++)
        {
            for(int k = 0; k < anInt1717; k++)
                abyte0[(k + anInt1719 >> 1) + (j + anInt1720 >> 1) * anInt1721] = aByteArray1715[i++];

        }

        aByteArray1715 = abyte0;
        anInt1717 = anInt1721;
        anInt1718 = anInt1722;
        anInt1719 = 0;
        anInt1720 = 0;
    }

    public void method519(int i)
    {
        if(i != -12580)
            aBoolean1714 = !aBoolean1714;
        if(anInt1717 == anInt1721 && anInt1718 == anInt1722)
            return;
        byte abyte0[] = new byte[anInt1721 * anInt1722];
        int j = 0;
        for(int k = 0; k < anInt1718; k++)
        {
            for(int l = 0; l < anInt1717; l++)
                abyte0[l + anInt1719 + (k + anInt1720) * anInt1721] = aByteArray1715[j++];

        }

        aByteArray1715 = abyte0;
        anInt1717 = anInt1721;
        anInt1718 = anInt1722;
        anInt1719 = 0;
        anInt1720 = 0;
    }

    public void method520(int i)
    {
        byte abyte0[] = new byte[anInt1717 * anInt1718];
        if(i <= 0)
        {
            for(int j = 1; j > 0; j++);
        }
        int k = 0;
        for(int l = 0; l < anInt1718; l++)
        {
            for(int i1 = anInt1717 - 1; i1 >= 0; i1--)
                abyte0[k++] = aByteArray1715[i1 + l * anInt1717];

        }

        aByteArray1715 = abyte0;
        anInt1719 = anInt1721 - anInt1717 - anInt1719;
    }

    public void method521(int i)
    {
        byte abyte0[] = new byte[anInt1717 * anInt1718];
        int j = 0;
        if(i != 0)
            anInt1706 = 283;
        for(int k = anInt1718 - 1; k >= 0; k--)
        {
            for(int l = 0; l < anInt1717; l++)
                abyte0[j++] = aByteArray1715[l + k * anInt1717];

        }

        aByteArray1715 = abyte0;
        anInt1720 = anInt1722 - anInt1718 - anInt1720;
    }

    public void method522(int i, int j, int k, int l)
    {
        for(int i1 = 0; i1 < anIntArray1716.length; i1++)
        {
            int j1 = anIntArray1716[i1] >> 16 & 0xff;
            j1 += l;
            if(j1 < 0)
                j1 = 0;
            else
            if(j1 > 255)
                j1 = 255;
            int k1 = anIntArray1716[i1] >> 8 & 0xff;
            k1 += i;
            if(k1 < 0)
                k1 = 0;
            else
            if(k1 > 255)
                k1 = 255;
            int l1 = anIntArray1716[i1] & 0xff;
            l1 += j;
            if(l1 < 0)
                l1 = 0;
            else
            if(l1 > 255)
                l1 = 255;
            anIntArray1716[i1] = (j1 << 16) + (k1 << 8) + l1;
        }

        if(k <= 0)
            anInt1707 = 149;
    }

    public void method523(int i, int j, int k)
    {
        i += anInt1719;
        k += anInt1720;
        int l = i + k * Class39_Sub3_Sub4.anInt1460;
        int i1 = 0;
        int j1 = anInt1718;
        int k1 = anInt1717;
        int l1 = Class39_Sub3_Sub4.anInt1460 - k1;
        int i2 = 0;
        if(k < Class39_Sub3_Sub4.anInt1462)
        {
            int j2 = Class39_Sub3_Sub4.anInt1462 - k;
            j1 -= j2;
            k = Class39_Sub3_Sub4.anInt1462;
            i1 += j2 * k1;
            l += j2 * Class39_Sub3_Sub4.anInt1460;
        }
        if(k + j1 > Class39_Sub3_Sub4.anInt1463)
            j1 -= (k + j1) - Class39_Sub3_Sub4.anInt1463;
        if(i < Class39_Sub3_Sub4.anInt1464)
        {
            int k2 = Class39_Sub3_Sub4.anInt1464 - i;
            k1 -= k2;
            i = Class39_Sub3_Sub4.anInt1464;
            i1 += k2;
            l += k2;
            i2 += k2;
            l1 += k2;
        }
        if(i + k1 > Class39_Sub3_Sub4.anInt1465)
        {
            int l2 = (i + k1) - Class39_Sub3_Sub4.anInt1465;
            k1 -= l2;
            i2 += l2;
            l1 += l2;
        }
        if(k1 <= 0 || j1 <= 0)
        {
            return;
        } else
        {
            method524(k1, i1, Class39_Sub3_Sub4.anIntArray1459, anIntArray1716, l1, aByteArray1715, l, i2, false, j1);
            if(j == 22912);
            return;
        }
    }

    public void method524(int i, int j, int ai[], int ai1[], int k, byte abyte0[], int l, 
            int i1, boolean flag, int j1)
    {
        int k1 = -(i >> 2);
        i = -(i & 3);
        for(int l1 = -j1; l1 < 0; l1++)
        {
            for(int i2 = k1; i2 < 0; i2++)
            {
                byte byte0 = abyte0[j++];
                if(byte0 != 0)
                    ai[l++] = ai1[byte0 & 0xff];
                else
                    l++;
                byte0 = abyte0[j++];
                if(byte0 != 0)
                    ai[l++] = ai1[byte0 & 0xff];
                else
                    l++;
                byte0 = abyte0[j++];
                if(byte0 != 0)
                    ai[l++] = ai1[byte0 & 0xff];
                else
                    l++;
                byte0 = abyte0[j++];
                if(byte0 != 0)
                    ai[l++] = ai1[byte0 & 0xff];
                else
                    l++;
            }

            for(int k2 = i; k2 < 0; k2++)
            {
                byte byte1 = abyte0[j++];
                if(byte1 != 0)
                    ai[l++] = ai1[byte1 & 0xff];
                else
                    l++;
            }

            l += k;
            j += i1;
        }

        if(flag)
        {
            for(int j2 = 1; j2 > 0; j2++);
        }
    }

    public int anInt1706;
    public int anInt1707;
    public int anInt1708;
    public boolean aBoolean1709;
    public byte aByte1710;
    public int anInt1711;
    public boolean aBoolean1712;
    public boolean aBoolean1713;
    public boolean aBoolean1714;
    public byte aByteArray1715[];
    public int anIntArray1716[];
    public int anInt1717;
    public int anInt1718;
    public int anInt1719;
    public int anInt1720;
    public int anInt1721;
    public int anInt1722;
}
