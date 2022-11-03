package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class39_Sub3_Sub2_Sub1 extends Class39_Sub3_Sub2
{

    public Class39_Sub3_Sub2_Sub4 method379(int i)
    {
        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4 = aClass11_1475.method196();
        if(class39_sub3_sub2_sub4 == null)
            return null;
        int j = aClass11_1475.aClass20_192.anIntArray273[anInt1480];
        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4_1 = new Class39_Sub3_Sub2_Sub4(Class33.method350((byte)9, j), true, true, class39_sub3_sub2_sub4, false);
        if(!aBoolean1474)
        {
            class39_sub3_sub2_sub4_1.method394(false);
            class39_sub3_sub2_sub4_1.method395(j, 0);
            class39_sub3_sub2_sub4_1.anIntArrayArray1557 = null;
            class39_sub3_sub2_sub4_1.anIntArrayArray1556 = null;
        }
        if(aClass11_1475.anInt195 != 128 || aClass11_1475.anInt196 != 128)
            class39_sub3_sub2_sub4_1.method403(aClass11_1475.anInt195, true, aClass11_1475.anInt195, aClass11_1475.anInt196);
        if(aClass11_1475.anInt197 != 0)
        {
            if(aClass11_1475.anInt197 == 90)
                class39_sub3_sub2_sub4_1.method398(-54);
            if(aClass11_1475.anInt197 == 180)
            {
                class39_sub3_sub2_sub4_1.method398(-54);
                class39_sub3_sub2_sub4_1.method398(-54);
            }
            if(aClass11_1475.anInt197 == 270)
            {
                class39_sub3_sub2_sub4_1.method398(-54);
                class39_sub3_sub2_sub4_1.method398(-54);
                class39_sub3_sub2_sub4_1.method398(-54);
            }
        }
        class39_sub3_sub2_sub4_1.method404(64 + aClass11_1475.anInt198, 850 + aClass11_1475.anInt199, -30, -50, -30, true);
        if(i != -12617)
            aBoolean1472 = !aBoolean1472;
        return class39_sub3_sub2_sub4_1;
    }

    public void method380(int i, byte byte0)
    {
        if(byte0 == aByte1471)
        {
            byte0 = 0;
        } else
        {
            for(int j = 1; j > 0; j++);
        }
        for(anInt1481 += i; anInt1481 > aClass11_1475.aClass20_192.method220((byte)0, anInt1480);)
        {
            anInt1481 -= aClass11_1475.aClass20_192.method220((byte)0, anInt1480) + 1;
            anInt1480++;
            if(anInt1480 >= aClass11_1475.aClass20_192.anInt272 && (anInt1480 < 0 || anInt1480 >= aClass11_1475.aClass20_192.anInt272))
            {
                anInt1480 = 0;
                aBoolean1474 = true;
            }
        }

    }

    public Class39_Sub3_Sub2_Sub1(int i, int j, int k, int l, int i1, int j1, int k1, 
            byte byte0)
    {
        aByte1470 = -126;
        aByte1471 = 0;
        aBoolean1472 = false;
        aBoolean1474 = false;
        if(byte0 != aByte1470)
        {
            throw new NullPointerException();
        } else
        {
            aClass11_1475 = SpotAnim.aClass11Array188[j];
            anInt1476 = j1;
            anInt1477 = k1;
            anInt1478 = l;
            anInt1479 = k;
            anInt1473 = i + i1;
            aBoolean1474 = false;
            return;
        }
    }

    public byte aByte1470;
    public byte aByte1471;
    public boolean aBoolean1472;
    public int anInt1473;
    public boolean aBoolean1474;
    public SpotAnim aClass11_1475;
    public int anInt1476;
    public int anInt1477;
    public int anInt1478;
    public int anInt1479;
    public int anInt1480;
    public int anInt1481;
}
