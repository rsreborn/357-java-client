package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.awt.*;
import java.awt.image.PixelGrabber;

public class Class39_Sub3_Sub4_Sub4 extends Class39_Sub3_Sub4
{

    public Class39_Sub3_Sub4_Sub4(int i, int j)
    {
        anInt1724 = 1;
        aByte1725 = 2;
        anInt1726 = 4;
        aBoolean1727 = false;
        aBoolean1729 = true;
        aBoolean1730 = true;
        anIntArray1731 = new int[i * j];
        anInt1732 = anInt1736 = i;
        anInt1733 = anInt1737 = j;
        anInt1734 = anInt1735 = 0;
    }

    public Class39_Sub3_Sub4_Sub4(byte abyte0[], Component component)
    {
        anInt1724 = 1;
        aByte1725 = 2;
        anInt1726 = 4;
        aBoolean1727 = false;
        aBoolean1729 = true;
        aBoolean1730 = true;
        try
        {
            Image image = Toolkit.getDefaultToolkit().createImage(abyte0);
            MediaTracker mediatracker = new MediaTracker(component);
            mediatracker.addImage(image, 0);
            mediatracker.waitForAll();
            anInt1732 = image.getWidth(component);
            anInt1733 = image.getHeight(component);
            anInt1736 = anInt1732;
            anInt1737 = anInt1733;
            anInt1734 = 0;
            anInt1735 = 0;
            anIntArray1731 = new int[anInt1732 * anInt1733];
            PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1732, anInt1733, anIntArray1731, 0, anInt1732);
            pixelgrabber.grabPixels();
            return;
        }
        catch(Exception _ex)
        {
            System.out.println("Error converting jpg");
        }
    }

    public Class39_Sub3_Sub4_Sub4(Class10 class10, String s, int i)
    {
        anInt1724 = 1;
        aByte1725 = 2;
        anInt1726 = 4;
        aBoolean1727 = false;
        aBoolean1729 = true;
        aBoolean1730 = true;
        Buffer class39_sub3_sub3 = new Buffer(class10.method193(s + ".dat", null));
        Buffer class39_sub3_sub3_1 = new Buffer(class10.method193("index.dat", null));
        class39_sub3_sub3_1.position = class39_sub3_sub3.readUShortBE();
        anInt1736 = class39_sub3_sub3_1.readUShortBE();
        anInt1737 = class39_sub3_sub3_1.readUShortBE();
        int j = class39_sub3_sub3_1.readUByte();
        int ai[] = new int[j];
        for(int k = 0; k < j - 1; k++)
        {
            ai[k + 1] = class39_sub3_sub3_1.readMediumBE();
            if(ai[k + 1] == 0)
                ai[k + 1] = 1;
        }

        for(int l = 0; l < i; l++)
        {
            class39_sub3_sub3_1.position += 2;
            class39_sub3_sub3.position += class39_sub3_sub3_1.readUShortBE() * class39_sub3_sub3_1.readUShortBE();
            class39_sub3_sub3_1.position++;
        }

        anInt1734 = class39_sub3_sub3_1.readUByte();
        anInt1735 = class39_sub3_sub3_1.readUByte();
        anInt1732 = class39_sub3_sub3_1.readUShortBE();
        anInt1733 = class39_sub3_sub3_1.readUShortBE();
        int i1 = class39_sub3_sub3_1.readUByte();
        int j1 = anInt1732 * anInt1733;
        anIntArray1731 = new int[j1];
        if(i1 == 0)
        {
            for(int k1 = 0; k1 < j1; k1++)
                anIntArray1731[k1] = ai[class39_sub3_sub3.readUByte()];

            return;
        }
        if(i1 == 1)
        {
            for(int l1 = 0; l1 < anInt1732; l1++)
            {
                for(int i2 = 0; i2 < anInt1733; i2++)
                    anIntArray1731[l1 + i2 * anInt1732] = ai[class39_sub3_sub3.readUByte()];

            }

        }
    }

    public void method525(int i)
    {
        if(i != -5281)
            aBoolean1729 = !aBoolean1729;
        Class39_Sub3_Sub4.method473(false, anIntArray1731, anInt1732, anInt1733);
    }

    public void method526(int i, int j, int k, int l)
    {
        k = 93 / k;
        for(int i1 = 0; i1 < anIntArray1731.length; i1++)
        {
            int j1 = anIntArray1731[i1];
            if(j1 != 0)
            {
                int k1 = j1 >> 16 & 0xff;
                k1 += l;
                if(k1 < 1)
                    k1 = 1;
                else
                if(k1 > 255)
                    k1 = 255;
                int l1 = j1 >> 8 & 0xff;
                l1 += i;
                if(l1 < 1)
                    l1 = 1;
                else
                if(l1 > 255)
                    l1 = 255;
                int i2 = j1 & 0xff;
                i2 += j;
                if(i2 < 1)
                    i2 = 1;
                else
                if(i2 > 255)
                    i2 = 255;
                anIntArray1731[i1] = (k1 << 16) + (l1 << 8) + i2;
            }
        }

    }

    public void method527(int i)
    {
        int ai[] = new int[anInt1736 * anInt1737];
        if(i < 0 || i > 0)
            anInt1728 = 321;
        for(int j = 0; j < anInt1733; j++)
        {
            for(int k = 0; k < anInt1732; k++)
                ai[(j + anInt1735) * anInt1736 + (k + anInt1734)] = anIntArray1731[j * anInt1732 + k];

        }

        anIntArray1731 = ai;
        anInt1732 = anInt1736;
        anInt1733 = anInt1737;
        anInt1734 = 0;
        anInt1735 = 0;
    }

    public void method528(int i, int j, int k)
    {
        i += anInt1734;
        j += anInt1735;
        if(k < anInt1724 || k > anInt1724)
            aBoolean1729 = !aBoolean1729;
        int l = i + j * Class39_Sub3_Sub4.anInt1460;
        int i1 = 0;
        int j1 = anInt1733;
        int k1 = anInt1732;
        int l1 = Class39_Sub3_Sub4.anInt1460 - k1;
        int i2 = 0;
        if(j < Class39_Sub3_Sub4.anInt1462)
        {
            int j2 = Class39_Sub3_Sub4.anInt1462 - j;
            j1 -= j2;
            j = Class39_Sub3_Sub4.anInt1462;
            i1 += j2 * k1;
            l += j2 * Class39_Sub3_Sub4.anInt1460;
        }
        if(j + j1 > Class39_Sub3_Sub4.anInt1463)
            j1 -= (j + j1) - Class39_Sub3_Sub4.anInt1463;
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
            method529(l, i2, i1, l1, j1, aByte1725, Class39_Sub3_Sub4.anIntArray1459, k1, anIntArray1731);
            return;
        }
    }

    public void method529(int i, int j, int k, int l, int i1, byte byte0, int ai[], 
            int j1, int ai1[])
    {
        int k1 = -(j1 >> 2);
        j1 = -(j1 & 3);
        if(byte0 != 2)
        {
            for(int l1 = 1; l1 > 0; l1++);
        }
        for(int i2 = -i1; i2 < 0; i2++)
        {
            for(int j2 = k1; j2 < 0; j2++)
            {
                ai[i++] = ai1[k++];
                ai[i++] = ai1[k++];
                ai[i++] = ai1[k++];
                ai[i++] = ai1[k++];
            }

            for(int k2 = j1; k2 < 0; k2++)
                ai[i++] = ai1[k++];

            i += l;
            k += j;
        }

    }

    public void method530(int i, int j, int k)
    {
        i += anInt1734;
        k += anInt1735;
        int l = i + k * Class39_Sub3_Sub4.anInt1460;
        int i1 = 0;
        int j1 = anInt1733;
        int k1 = anInt1732;
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
            return;
        method531(Class39_Sub3_Sub4.anIntArray1459, anIntArray1731, 0, i1, l, k1, j1, l1, i2);
        if(j != 22912)
            aBoolean1729 = !aBoolean1729;
    }

    public void method531(int ai[], int ai1[], int i, int j, int k, int l, int i1, 
            int j1, int k1)
    {
        int l1 = -(l >> 2);
        l = -(l & 3);
        for(int i2 = -i1; i2 < 0; i2++)
        {
            for(int j2 = l1; j2 < 0; j2++)
            {
                i = ai1[j++];
                if(i != 0)
                    ai[k++] = i;
                else
                    k++;
                i = ai1[j++];
                if(i != 0)
                    ai[k++] = i;
                else
                    k++;
                i = ai1[j++];
                if(i != 0)
                    ai[k++] = i;
                else
                    k++;
                i = ai1[j++];
                if(i != 0)
                    ai[k++] = i;
                else
                    k++;
            }

            for(int k2 = l; k2 < 0; k2++)
            {
                i = ai1[j++];
                if(i != 0)
                    ai[k++] = i;
                else
                    k++;
            }

            k += j1;
            j += k1;
        }

    }

    public void method532(int i, boolean flag, int j, int k)
    {
        k += anInt1734;
        i += anInt1735;
        if(flag)
            return;
        int l = k + i * Class39_Sub3_Sub4.anInt1460;
        int i1 = 0;
        int j1 = anInt1733;
        int k1 = anInt1732;
        int l1 = Class39_Sub3_Sub4.anInt1460 - k1;
        int i2 = 0;
        if(i < Class39_Sub3_Sub4.anInt1462)
        {
            int j2 = Class39_Sub3_Sub4.anInt1462 - i;
            j1 -= j2;
            i = Class39_Sub3_Sub4.anInt1462;
            i1 += j2 * k1;
            l += j2 * Class39_Sub3_Sub4.anInt1460;
        }
        if(i + j1 > Class39_Sub3_Sub4.anInt1463)
            j1 -= (i + j1) - Class39_Sub3_Sub4.anInt1463;
        if(k < Class39_Sub3_Sub4.anInt1464)
        {
            int k2 = Class39_Sub3_Sub4.anInt1464 - k;
            k1 -= k2;
            k = Class39_Sub3_Sub4.anInt1464;
            i1 += k2;
            l += k2;
            i2 += k2;
            l1 += k2;
        }
        if(k + k1 > Class39_Sub3_Sub4.anInt1465)
        {
            int l2 = (k + k1) - Class39_Sub3_Sub4.anInt1465;
            k1 -= l2;
            i2 += l2;
            l1 += l2;
        }
        if(k1 <= 0 || j1 <= 0)
        {
            return;
        } else
        {
            method533(0, i1, anIntArray1731, false, i2, l, k1, j, l1, j1, Class39_Sub3_Sub4.anIntArray1459);
            return;
        }
    }

    public void method533(int i, int j, int ai[], boolean flag, int k, int l, int i1, 
            int j1, int k1, int l1, int ai1[])
    {
        int i2 = 256 - j1;
        if(flag)
            anInt1723 = -107;
        for(int j2 = -l1; j2 < 0; j2++)
        {
            for(int k2 = -i1; k2 < 0; k2++)
            {
                i = ai[j++];
                if(i != 0)
                {
                    int l2 = ai1[l];
                    ai1[l++] = ((i & 0xff00ff) * j1 + (l2 & 0xff00ff) * i2 & 0xff00ff00) + ((i & 0xff00) * j1 + (l2 & 0xff00) * i2 & 0xff0000) >> 8;
                } else
                {
                    l++;
                }
            }

            l += k1;
            j += k;
        }

    }

    public void method534(int i, int ai[], int j, int k, int l, int i1, int j1, 
            int k1, int l1, int i2, int ai1[])
    {
        if(k1 != 35958)
            return;
        try
        {
            int j2 = -j1 / 2;
            int k2 = -l1 / 2;
            int l2 = (int)(Math.sin((double)i2 / 326.11000000000001D) * 65536D);
            int i3 = (int)(Math.cos((double)i2 / 326.11000000000001D) * 65536D);
            l2 = l2 * i1 >> 8;
            i3 = i3 * i1 >> 8;
            int j3 = (j << 16) + (k2 * l2 + j2 * i3);
            int k3 = (l << 16) + (k2 * i3 - j2 * l2);
            int l3 = k + i * Class39_Sub3_Sub4.anInt1460;
            for(i = 0; i < l1; i++)
            {
                int i4 = ai1[i];
                int j4 = l3 + i4;
                int k4 = j3 + i3 * i4;
                int l4 = k3 - l2 * i4;
                for(k = -ai[i]; k < 0; k++)
                {
                    Class39_Sub3_Sub4.anIntArray1459[j4++] = anIntArray1731[(k4 >> 16) + (l4 >> 16) * anInt1732];
                    k4 += i3;
                    l4 -= l2;
                }

                j3 += l2;
                k3 += i3;
                l3 += Class39_Sub3_Sub4.anInt1460;
            }

            return;
        }
        catch(Exception _ex)
        {
            return;
        }
    }

    public void method535(double d, int i, boolean flag, int j, int k, int l, 
            int i1, int j1, int k1)
    {
        if(flag)
            aBoolean1729 = !aBoolean1729;
        try
        {
            int l1 = -j1 / 2;
            int i2 = -k / 2;
            int j2 = (int)(Math.sin(d) * 65536D);
            int k2 = (int)(Math.cos(d) * 65536D);
            j2 = j2 * i1 >> 8;
            k2 = k2 * i1 >> 8;
            int l2 = (k1 << 16) + (i2 * j2 + l1 * k2);
            int i3 = (l << 16) + (i2 * k2 - l1 * j2);
            int j3 = j + i * Class39_Sub3_Sub4.anInt1460;
            for(i = 0; i < k; i++)
            {
                int k3 = j3;
                int l3 = l2;
                int i4 = i3;
                for(j = -j1; j < 0; j++)
                {
                    int j4 = anIntArray1731[(l3 >> 16) + (i4 >> 16) * anInt1732];
                    if(j4 != 0)
                        Class39_Sub3_Sub4.anIntArray1459[k3++] = j4;
                    else
                        k3++;
                    l3 += k2;
                    i4 -= j2;
                }

                l2 += j2;
                i3 += k2;
                j3 += Class39_Sub3_Sub4.anInt1460;
            }

            return;
        }
        catch(Exception _ex)
        {
            return;
        }
    }

    public void method536(int i, Class39_Sub3_Sub4_Sub3 class39_sub3_sub4_sub3, int j, int k)
    {
        if(i != 22290)
        {
            for(int l = 1; l > 0; l++);
        }
        j += anInt1734;
        k += anInt1735;
        int i1 = j + k * Class39_Sub3_Sub4.anInt1460;
        int j1 = 0;
        int k1 = anInt1733;
        int l1 = anInt1732;
        int i2 = Class39_Sub3_Sub4.anInt1460 - l1;
        int j2 = 0;
        if(k < Class39_Sub3_Sub4.anInt1462)
        {
            int k2 = Class39_Sub3_Sub4.anInt1462 - k;
            k1 -= k2;
            k = Class39_Sub3_Sub4.anInt1462;
            j1 += k2 * l1;
            i1 += k2 * Class39_Sub3_Sub4.anInt1460;
        }
        if(k + k1 > Class39_Sub3_Sub4.anInt1463)
            k1 -= (k + k1) - Class39_Sub3_Sub4.anInt1463;
        if(j < Class39_Sub3_Sub4.anInt1464)
        {
            int l2 = Class39_Sub3_Sub4.anInt1464 - j;
            l1 -= l2;
            j = Class39_Sub3_Sub4.anInt1464;
            j1 += l2;
            i1 += l2;
            j2 += l2;
            i2 += l2;
        }
        if(j + l1 > Class39_Sub3_Sub4.anInt1465)
        {
            int i3 = (j + l1) - Class39_Sub3_Sub4.anInt1465;
            l1 -= i3;
            j2 += i3;
            i2 += i3;
        }
        if(l1 <= 0 || k1 <= 0)
        {
            return;
        } else
        {
            method537(l1, j2, j1, anIntArray1731, 0, i2, (byte)73, Class39_Sub3_Sub4.anIntArray1459, i1, k1, class39_sub3_sub4_sub3.aByteArray1715);
            return;
        }
    }

    public void method537(int i, int j, int k, int ai[], int l, int i1, byte byte0, 
            int ai1[], int j1, int k1, byte abyte0[])
    {
        int l1 = -(i >> 2);
        i = -(i & 3);
        for(int i2 = -k1; i2 < 0; i2++)
        {
            for(int j2 = l1; j2 < 0; j2++)
            {
                l = ai[k++];
                if(l != 0 && abyte0[j1] == 0)
                    ai1[j1++] = l;
                else
                    j1++;
                l = ai[k++];
                if(l != 0 && abyte0[j1] == 0)
                    ai1[j1++] = l;
                else
                    j1++;
                l = ai[k++];
                if(l != 0 && abyte0[j1] == 0)
                    ai1[j1++] = l;
                else
                    j1++;
                l = ai[k++];
                if(l != 0 && abyte0[j1] == 0)
                    ai1[j1++] = l;
                else
                    j1++;
            }

            for(int k2 = i; k2 < 0; k2++)
            {
                l = ai[k++];
                if(l != 0 && abyte0[j1] == 0)
                    ai1[j1++] = l;
                else
                    j1++;
            }

            j1 += i1;
            k += j;
        }

        if(byte0 == 73);
    }

    public static int anInt1723;
    public int anInt1724;
    public byte aByte1725;
    public int anInt1726;
    public boolean aBoolean1727;
    public int anInt1728;
    public boolean aBoolean1729;
    public boolean aBoolean1730;
    public int anIntArray1731[];
    public int anInt1732;
    public int anInt1733;
    public int anInt1734;
    public int anInt1735;
    public int anInt1736;
    public int anInt1737;
}
