package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class30
{

    public static int method282(byte abyte0[], int i, byte abyte1[], int j, int k)
    {
        synchronized(aClass29_468)
        {
            aClass29_468.aByteArray429 = abyte1;
            aClass29_468.anInt430 = k;
            aClass29_468.aByteArray434 = abyte0;
            aClass29_468.anInt435 = 0;
            aClass29_468.anInt431 = j;
            aClass29_468.anInt436 = i;
            aClass29_468.anInt443 = 0;
            aClass29_468.anInt442 = 0;
            aClass29_468.anInt432 = 0;
            aClass29_468.anInt433 = 0;
            aClass29_468.anInt437 = 0;
            aClass29_468.anInt438 = 0;
            aClass29_468.anInt445 = 0;
            method284(aClass29_468);
            i -= aClass29_468.anInt436;
            int l = i;
            return l;
        }
    }

    public static void method283(Class29 class29)
    {
        byte byte4 = class29.aByte439;
        int i = class29.anInt440;
        int j = class29.anInt450;
        int k = class29.anInt448;
        int ai[] = Class29.anIntArray453;
        int l = class29.anInt447;
        byte abyte0[] = class29.aByteArray434;
        int i1 = class29.anInt435;
        int j1 = class29.anInt436;
        int k1 = j1;
        int l1 = class29.anInt467 + 1;
label0:
        do
        {
            if(i > 0)
            {
                do
                {
                    if(j1 == 0)
                        break label0;
                    if(i == 1)
                        break;
                    abyte0[i1] = byte4;
                    i--;
                    i1++;
                    j1--;
                } while(true);
                if(j1 == 0)
                {
                    i = 1;
                    break;
                }
                abyte0[i1] = byte4;
                i1++;
                j1--;
            }
            boolean flag = true;
            while(flag) 
            {
                flag = false;
                if(j == l1)
                {
                    i = 0;
                    break label0;
                }
                byte4 = (byte)k;
                l = ai[l];
                byte byte0 = (byte)(l & 0xff);
                l >>= 8;
                j++;
                if(byte0 != k)
                {
                    k = byte0;
                    if(j1 == 0)
                    {
                        i = 1;
                    } else
                    {
                        abyte0[i1] = byte4;
                        i1++;
                        j1--;
                        flag = true;
                        continue;
                    }
                    break label0;
                }
                if(j != l1)
                    continue;
                if(j1 == 0)
                {
                    i = 1;
                    break label0;
                }
                abyte0[i1] = byte4;
                i1++;
                j1--;
                flag = true;
            }
            i = 2;
            l = ai[l];
            byte byte1 = (byte)(l & 0xff);
            l >>= 8;
            if(++j != l1)
                if(byte1 != k)
                {
                    k = byte1;
                } else
                {
                    i = 3;
                    l = ai[l];
                    byte byte2 = (byte)(l & 0xff);
                    l >>= 8;
                    if(++j != l1)
                        if(byte2 != k)
                        {
                            k = byte2;
                        } else
                        {
                            l = ai[l];
                            byte byte3 = (byte)(l & 0xff);
                            l >>= 8;
                            j++;
                            i = (byte3 & 0xff) + 4;
                            l = ai[l];
                            k = (byte)(l & 0xff);
                            l >>= 8;
                            j++;
                        }
                }
        } while(true);
        int i2 = class29.anInt437;
        class29.anInt437 += k1 - j1;
        if(class29.anInt437 < i2)
            class29.anInt438++;
        class29.aByte439 = byte4;
        class29.anInt440 = i;
        class29.anInt450 = j;
        class29.anInt448 = k;
        Class29.anIntArray453 = ai;
        class29.anInt447 = l;
        class29.aByteArray434 = abyte0;
        class29.anInt435 = i1;
        class29.anInt436 = j1;
    }

    public static void method284(Class29 class29)
    {
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        boolean flag6 = false;
        boolean flag7 = false;
        boolean flag8 = false;
        boolean flag9 = false;
        boolean flag10 = false;
        boolean flag11 = false;
        boolean flag12 = false;
        boolean flag13 = false;
        boolean flag14 = false;
        boolean flag15 = false;
        boolean flag16 = false;
        boolean flag17 = false;
        boolean flag18 = false;
        int k8 = 0;
        int ai[] = null;
        int ai1[] = null;
        int ai2[] = null;
        class29.anInt444 = 1;
        if(Class29.anIntArray453 == null)
            Class29.anIntArray453 = new int[class29.anInt444 * 0x186a0];
        boolean flag19 = true;
        while(flag19) 
        {
            byte byte0 = method285(class29);
            if(byte0 == 23)
                return;
            byte0 = method285(class29);
            byte0 = method285(class29);
            byte0 = method285(class29);
            byte0 = method285(class29);
            byte0 = method285(class29);
            class29.anInt445++;
            byte0 = method285(class29);
            byte0 = method285(class29);
            byte0 = method285(class29);
            byte0 = method285(class29);
            byte0 = method286(class29);
            if(byte0 != 0)
                class29.aBoolean441 = true;
            else
                class29.aBoolean441 = false;
            if(class29.aBoolean441)
                System.out.println("PANIC! RANDOMISED BLOCK!");
            class29.anInt446 = 0;
            byte0 = method285(class29);
            class29.anInt446 = class29.anInt446 << 8 | byte0 & 0xff;
            byte0 = method285(class29);
            class29.anInt446 = class29.anInt446 << 8 | byte0 & 0xff;
            byte0 = method285(class29);
            class29.anInt446 = class29.anInt446 << 8 | byte0 & 0xff;
            for(int j = 0; j < 16; j++)
            {
                byte byte1 = method286(class29);
                if(byte1 == 1)
                    class29.aBooleanArray456[j] = true;
                else
                    class29.aBooleanArray456[j] = false;
            }

            for(int k = 0; k < 256; k++)
                class29.aBooleanArray455[k] = false;

            for(int l = 0; l < 16; l++)
                if(class29.aBooleanArray456[l])
                {
                    for(int i3 = 0; i3 < 16; i3++)
                    {
                        byte byte2 = method286(class29);
                        if(byte2 == 1)
                            class29.aBooleanArray455[l * 16 + i3] = true;
                    }

                }

            method288(class29);
            int i4 = class29.anInt454 + 2;
            int j4 = method287(3, class29);
            int k4 = method287(15, class29);
            for(int i1 = 0; i1 < k4; i1++)
            {
                int j3 = 0;
                do
                {
                    byte byte3 = method286(class29);
                    if(byte3 == 0)
                        break;
                    j3++;
                } while(true);
                class29.aByteArray461[i1] = (byte)j3;
            }

            byte abyte0[] = new byte[6];
            for(byte byte16 = 0; byte16 < j4; byte16++)
                abyte0[byte16] = byte16;

            for(int j1 = 0; j1 < k4; j1++)
            {
                byte byte17 = class29.aByteArray461[j1];
                byte byte15 = abyte0[byte17];
                for(; byte17 > 0; byte17--)
                    abyte0[byte17] = abyte0[byte17 - 1];

                abyte0[0] = byte15;
                class29.aByteArray460[j1] = byte15;
            }

            for(int k3 = 0; k3 < j4; k3++)
            {
                int l6 = method287(5, class29);
                for(int k1 = 0; k1 < i4; k1++)
                {
                    do
                    {
                        byte byte4 = method286(class29);
                        if(byte4 == 0)
                            break;
                        byte4 = method286(class29);
                        if(byte4 == 0)
                            l6++;
                        else
                            l6--;
                    } while(true);
                    class29.aByteArrayArray462[k3][k1] = (byte)l6;
                }

            }

            for(int l3 = 0; l3 < j4; l3++)
            {
                byte byte8 = 32;
                int i = 0;
                for(int l1 = 0; l1 < i4; l1++)
                {
                    if(class29.aByteArrayArray462[l3][l1] > i)
                        i = class29.aByteArrayArray462[l3][l1];
                    if(class29.aByteArrayArray462[l3][l1] < byte8)
                        byte8 = class29.aByteArrayArray462[l3][l1];
                }

                method289(class29.anIntArrayArray463[l3], class29.anIntArrayArray464[l3], class29.anIntArrayArray465[l3], class29.aByteArrayArray462[l3], byte8, i, i4);
                class29.anIntArray466[l3] = byte8;
            }

            int l4 = class29.anInt454 + 1;
            int l5 = 0x186a0 * class29.anInt444;
            int i5 = -1;
            int j5 = 0;
            for(int i2 = 0; i2 <= 255; i2++)
                class29.anIntArray449[i2] = 0;

            int j9 = 4095;
            for(int l8 = 15; l8 >= 0; l8--)
            {
                for(int i9 = 15; i9 >= 0; i9--)
                {
                    class29.aByteArray458[j9] = (byte)(l8 * 16 + i9);
                    j9--;
                }

                class29.anIntArray459[l8] = j9 + 1;
            }

            int i6 = 0;
            if(j5 == 0)
            {
                i5++;
                j5 = 50;
                byte byte12 = class29.aByteArray460[i5];
                k8 = class29.anIntArray466[byte12];
                ai = class29.anIntArrayArray463[byte12];
                ai2 = class29.anIntArrayArray465[byte12];
                ai1 = class29.anIntArrayArray464[byte12];
            }
            j5--;
            int i7 = k8;
            int l7;
            byte byte9;
            for(l7 = method287(i7, class29); l7 > ai[i7]; l7 = l7 << 1 | byte9)
            {
                i7++;
                byte9 = method286(class29);
            }

            for(int k5 = ai2[l7 - ai1[i7]]; k5 != l4;)
                if(k5 == 0 || k5 == 1)
                {
                    int j6 = -1;
                    int k6 = 1;
                    do
                    {
                        if(k5 == 0)
                            j6 += k6;
                        else
                        if(k5 == 1)
                            j6 += 2 * k6;
                        k6 *= 2;
                        if(j5 == 0)
                        {
                            i5++;
                            j5 = 50;
                            byte byte13 = class29.aByteArray460[i5];
                            k8 = class29.anIntArray466[byte13];
                            ai = class29.anIntArrayArray463[byte13];
                            ai2 = class29.anIntArrayArray465[byte13];
                            ai1 = class29.anIntArrayArray464[byte13];
                        }
                        j5--;
                        int j7 = k8;
                        int i8;
                        byte byte10;
                        for(i8 = method287(j7, class29); i8 > ai[j7]; i8 = i8 << 1 | byte10)
                        {
                            j7++;
                            byte10 = method286(class29);
                        }

                        k5 = ai2[i8 - ai1[j7]];
                    } while(k5 == 0 || k5 == 1);
                    j6++;
                    byte byte5 = class29.aByteArray457[class29.aByteArray458[class29.anIntArray459[0]] & 0xff];
                    class29.anIntArray449[byte5 & 0xff] += j6;
                    for(; j6 > 0; j6--)
                    {
                        Class29.anIntArray453[i6] = byte5 & 0xff;
                        i6++;
                    }

                } else
                {
                    int j11 = k5 - 1;
                    byte byte6;
                    if(j11 < 16)
                    {
                        int j10 = class29.anIntArray459[0];
                        byte6 = class29.aByteArray458[j10 + j11];
                        for(; j11 > 3; j11 -= 4)
                        {
                            int k11 = j10 + j11;
                            class29.aByteArray458[k11] = class29.aByteArray458[k11 - 1];
                            class29.aByteArray458[k11 - 1] = class29.aByteArray458[k11 - 2];
                            class29.aByteArray458[k11 - 2] = class29.aByteArray458[k11 - 3];
                            class29.aByteArray458[k11 - 3] = class29.aByteArray458[k11 - 4];
                        }

                        for(; j11 > 0; j11--)
                            class29.aByteArray458[j10 + j11] = class29.aByteArray458[(j10 + j11) - 1];

                        class29.aByteArray458[j10] = byte6;
                    } else
                    {
                        int l10 = j11 / 16;
                        int i11 = j11 % 16;
                        int k10 = class29.anIntArray459[l10] + i11;
                        byte6 = class29.aByteArray458[k10];
                        for(; k10 > class29.anIntArray459[l10]; k10--)
                            class29.aByteArray458[k10] = class29.aByteArray458[k10 - 1];

                        class29.anIntArray459[l10]++;
                        for(; l10 > 0; l10--)
                        {
                            class29.anIntArray459[l10]--;
                            class29.aByteArray458[class29.anIntArray459[l10]] = class29.aByteArray458[(class29.anIntArray459[l10 - 1] + 16) - 1];
                        }

                        class29.anIntArray459[0]--;
                        class29.aByteArray458[class29.anIntArray459[0]] = byte6;
                        if(class29.anIntArray459[0] == 0)
                        {
                            int i10 = 4095;
                            for(int k9 = 15; k9 >= 0; k9--)
                            {
                                for(int l9 = 15; l9 >= 0; l9--)
                                {
                                    class29.aByteArray458[i10] = class29.aByteArray458[class29.anIntArray459[k9] + l9];
                                    i10--;
                                }

                                class29.anIntArray459[k9] = i10 + 1;
                            }

                        }
                    }
                    class29.anIntArray449[class29.aByteArray457[byte6 & 0xff] & 0xff]++;
                    Class29.anIntArray453[i6] = class29.aByteArray457[byte6 & 0xff] & 0xff;
                    i6++;
                    if(j5 == 0)
                    {
                        i5++;
                        j5 = 50;
                        byte byte14 = class29.aByteArray460[i5];
                        k8 = class29.anIntArray466[byte14];
                        ai = class29.anIntArrayArray463[byte14];
                        ai2 = class29.anIntArrayArray465[byte14];
                        ai1 = class29.anIntArrayArray464[byte14];
                    }
                    j5--;
                    int k7 = k8;
                    int j8;
                    byte byte11;
                    for(j8 = method287(k7, class29); j8 > ai[k7]; j8 = j8 << 1 | byte11)
                    {
                        k7++;
                        byte11 = method286(class29);
                    }

                    k5 = ai2[j8 - ai1[k7]];
                }

            class29.anInt440 = 0;
            class29.aByte439 = 0;
            class29.anIntArray451[0] = 0;
            for(int j2 = 1; j2 <= 256; j2++)
                class29.anIntArray451[j2] = class29.anIntArray449[j2 - 1];

            for(int k2 = 1; k2 <= 256; k2++)
                class29.anIntArray451[k2] += class29.anIntArray451[k2 - 1];

            for(int l2 = 0; l2 < i6; l2++)
            {
                byte byte7 = (byte)(Class29.anIntArray453[l2] & 0xff);
                Class29.anIntArray453[class29.anIntArray451[byte7 & 0xff]] |= l2 << 8;
                class29.anIntArray451[byte7 & 0xff]++;
            }

            class29.anInt447 = Class29.anIntArray453[class29.anInt446] >> 8;
            class29.anInt450 = 0;
            class29.anInt447 = Class29.anIntArray453[class29.anInt447];
            class29.anInt448 = (byte)(class29.anInt447 & 0xff);
            class29.anInt447 >>= 8;
            class29.anInt450++;
            class29.anInt467 = i6;
            method283(class29);
            if(class29.anInt450 == class29.anInt467 + 1 && class29.anInt440 == 0)
                flag19 = true;
            else
                flag19 = false;
        }
    }

    public static byte method285(Class29 class29)
    {
        return (byte)method287(8, class29);
    }

    public static byte method286(Class29 class29)
    {
        return (byte)method287(1, class29);
    }

    public static int method287(int i, Class29 class29)
    {
        int j;
        do
        {
            if(class29.anInt443 >= i)
            {
                int k = class29.anInt442 >> class29.anInt443 - i & (1 << i) - 1;
                class29.anInt443 -= i;
                j = k;
                break;
            }
            class29.anInt442 = class29.anInt442 << 8 | class29.aByteArray429[class29.anInt430] & 0xff;
            class29.anInt443 += 8;
            class29.anInt430++;
            class29.anInt431--;
            class29.anInt432++;
            if(class29.anInt432 == 0)
                class29.anInt433++;
        } while(true);
        return j;
    }

    public static void method288(Class29 class29)
    {
        class29.anInt454 = 0;
        for(int i = 0; i < 256; i++)
            if(class29.aBooleanArray455[i])
            {
                class29.aByteArray457[class29.anInt454] = (byte)i;
                class29.anInt454++;
            }

    }

    public static void method289(int ai[], int ai1[], int ai2[], byte abyte0[], int i, int j, int k)
    {
        int l = 0;
        for(int i1 = i; i1 <= j; i1++)
        {
            for(int l2 = 0; l2 < k; l2++)
                if(abyte0[l2] == i1)
                {
                    ai2[l] = l2;
                    l++;
                }

        }

        for(int j1 = 0; j1 < 23; j1++)
            ai1[j1] = 0;

        for(int k1 = 0; k1 < k; k1++)
            ai1[abyte0[k1] + 1]++;

        for(int l1 = 1; l1 < 23; l1++)
            ai1[l1] += ai1[l1 - 1];

        for(int i2 = 0; i2 < 23; i2++)
            ai[i2] = 0;

        int i3 = 0;
        for(int j2 = i; j2 <= j; j2++)
        {
            i3 += ai1[j2 + 1] - ai1[j2];
            ai[j2] = i3 - 1;
            i3 <<= 1;
        }

        for(int k2 = i + 1; k2 <= j; k2++)
            ai1[k2] = (ai[k2 - 1] + 1 << 1) - ai1[k2];

    }

    public static Class29 aClass29_468 = new Class29();

}
