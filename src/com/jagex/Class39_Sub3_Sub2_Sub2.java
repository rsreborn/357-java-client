package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class39_Sub3_Sub2_Sub2 extends Class39_Sub3_Sub2
{

    public void method381(byte byte0, int i, int j, int k, int l)
    {
        if(byte0 == 7)
            byte0 = 0;
        else
            anInt1506 = 22;
        if(!aBoolean1493)
        {
            double d = i - anInt1497;
            double d2 = k - anInt1498;
            double d3 = Math.sqrt(d * d + d2 * d2);
            aDouble1494 = (double)anInt1497 + (d * (double)anInt1503) / d3;
            aDouble1495 = (double)anInt1498 + (d2 * (double)anInt1503) / d3;
            aDouble1496 = anInt1499;
        }
        double d1 = (anInt1490 + 1) - l;
        aDouble1484 = ((double)i - aDouble1494) / d1;
        aDouble1485 = ((double)k - aDouble1495) / d1;
        aDouble1486 = Math.sqrt(aDouble1484 * aDouble1484 + aDouble1485 * aDouble1485);
        if(!aBoolean1493)
            aDouble1487 = -aDouble1486 * Math.tan((double)anInt1502 * 0.02454369D);
        aDouble1501 = (2D * ((double)j - aDouble1496 - aDouble1487 * d1)) / (d1 * d1);
    }

    public void method382(boolean flag, int i)
    {
        aBoolean1493 = true;
        aDouble1494 += aDouble1484 * (double)i;
        aDouble1495 += aDouble1485 * (double)i;
        if(flag)
        {
            for(int j = 1; j > 0; j++);
        }
        aDouble1496 += aDouble1487 * (double)i + 0.5D * aDouble1501 * (double)i * (double)i;
        aDouble1487 += aDouble1501 * (double)i;
        anInt1507 = (int)(Math.atan2(aDouble1484, aDouble1485) * 325.94900000000001D) + 1024 & 0x7ff;
        anInt1508 = (int)(Math.atan2(aDouble1487, aDouble1486) * 325.94900000000001D) & 0x7ff;
        if(aClass11_1491.aClass20_192 != null)
            for(anInt1483 += i; anInt1483 > aClass11_1491.aClass20_192.method220((byte)0, anInt1482);)
            {
                anInt1483 -= aClass11_1491.aClass20_192.method220((byte)0, anInt1482) + 1;
                anInt1482++;
                if(anInt1482 >= aClass11_1491.aClass20_192.anInt272)
                    anInt1482 = 0;
            }

    }

    public Class39_Sub3_Sub2_Sub2(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, int j2, int k2, int l2)
    {
        anInt1488 = 3;
        aBoolean1492 = false;
        aBoolean1493 = false;
        anInt1506 = 58;
        aClass11_1491 = SpotAnim.aClass11Array188[i2];
        anInt1505 = l2;
        anInt1497 = i;
        anInt1498 = k;
        anInt1499 = l1;
        anInt1489 = k2;
        anInt1490 = j2;
        anInt1502 = l;
        anInt1503 = j1;
        anInt1504 = k1;
        anInt1500 = j;
        if(i1 != -40800)
            aBoolean1492 = !aBoolean1492;
        aBoolean1493 = false;
    }

    public Class39_Sub3_Sub2_Sub4 method379(int i)
    {
        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4 = aClass11_1491.method196();
        if(class39_sub3_sub2_sub4 == null)
            return null;
        int j = -1;
        if(aClass11_1491.aClass20_192 != null)
            j = aClass11_1491.aClass20_192.anIntArray273[anInt1482];
        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4_1 = new Class39_Sub3_Sub2_Sub4(Class33.method350((byte)9, j), true, true, class39_sub3_sub2_sub4, false);
        if(j != -1)
        {
            class39_sub3_sub2_sub4_1.method394(false);
            class39_sub3_sub2_sub4_1.method395(j, 0);
            class39_sub3_sub2_sub4_1.anIntArrayArray1557 = null;
            class39_sub3_sub2_sub4_1.anIntArrayArray1556 = null;
        }
        if(aClass11_1491.anInt195 != 128 || aClass11_1491.anInt196 != 128)
            class39_sub3_sub2_sub4_1.method403(aClass11_1491.anInt195, true, aClass11_1491.anInt195, aClass11_1491.anInt196);
        class39_sub3_sub2_sub4_1.method399(true, anInt1508);
        if(i != -12617)
            anInt1488 = 381;
        class39_sub3_sub2_sub4_1.method404(64 + aClass11_1491.anInt198, 850 + aClass11_1491.anInt199, -30, -50, -30, true);
        return class39_sub3_sub2_sub4_1;
    }

    public int anInt1482;
    public int anInt1483;
    public double aDouble1484;
    public double aDouble1485;
    public double aDouble1486;
    public double aDouble1487;
    public int anInt1488;
    public int anInt1489;
    public int anInt1490;
    public SpotAnim aClass11_1491;
    public boolean aBoolean1492;
    public boolean aBoolean1493;
    public double aDouble1494;
    public double aDouble1495;
    public double aDouble1496;
    public int anInt1497;
    public int anInt1498;
    public int anInt1499;
    public int anInt1500;
    public double aDouble1501;
    public int anInt1502;
    public int anInt1503;
    public int anInt1504;
    public int anInt1505;
    public int anInt1506;
    public int anInt1507;
    public int anInt1508;
}
