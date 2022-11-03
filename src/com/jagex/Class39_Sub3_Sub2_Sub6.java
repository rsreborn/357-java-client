package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class39_Sub3_Sub2_Sub6 extends Class39_Sub3_Sub2
{

    public Class39_Sub3_Sub2_Sub4 method379(int i)
    {
        int j = -1;
        if(aClass20_1656 != null)
        {
            int k = Game.loopCycle - anInt1664;
            if(k > 100 && aClass20_1656.anInt276 > 0)
                k = 100;
            while(k > aClass20_1656.method220((byte)0, anInt1659)) 
            {
                k -= aClass20_1656.method220((byte)0, anInt1659);
                anInt1659++;
                if(anInt1659 < aClass20_1656.anInt272)
                    continue;
                anInt1659 -= aClass20_1656.anInt276;
                if(anInt1659 >= 0 && anInt1659 < aClass20_1656.anInt272)
                    continue;
                aClass20_1656 = null;
                break;
            }
            anInt1664 = Game.loopCycle - k;
            if(aClass20_1656 != null)
                j = aClass20_1656.anIntArray273[anInt1659];
        }
        Class27 class27;
        if(anIntArray1658 != null)
            class27 = method422(true);
        else
            class27 = Class27.method272(anInt1653);
        if(class27 == null)
            return null;
        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4 = class27.method277(anInt1654, anInt1655, anInt1660, anInt1661, anInt1662, anInt1663, j);
        if(i != -12617)
        {
            for(int l = 1; l > 0; l++);
        }
        return class39_sub3_sub2_sub4;
    }

    public Class39_Sub3_Sub2_Sub6(int i, int j, int k, int l, int i1, int j1, int k1, 
            boolean flag, boolean flag1, int l1)
    {
        aBoolean1665 = true;
        anInt1653 = l1;
        anInt1654 = i1;
        anInt1655 = j;
        anInt1660 = j1;
        anInt1661 = i;
        anInt1662 = k;
        anInt1663 = l;
        if(k1 != -1)
        {
            aClass20_1656 = SEQ.aClass20Array271[k1];
            anInt1659 = 0;
            anInt1664 = Game.loopCycle;
            if(flag1 && aClass20_1656.anInt276 != -1)
            {
                anInt1659 = (int)(Math.random() * (double)aClass20_1656.anInt272);
                anInt1664 -= (int)(Math.random() * (double)aClass20_1656.method220((byte)0, anInt1659));
            }
        }
        Class27 class27 = Class27.method272(anInt1653);
        anInt1651 = class27.anInt363;
        anInt1652 = class27.anInt403;
        if(!flag)
        {
            throw new NullPointerException();
        } else
        {
            anIntArray1658 = class27.anIntArray367;
            return;
        }
    }

    public Class27 method422(boolean flag)
    {
        if(!flag)
            throw new NullPointerException();
        int i = -1;
        if(anInt1651 != -1)
        {
            Class6 class6 = Class6.aClass6Array122[anInt1651];
            int j = class6.anInt124;
            int k = class6.anInt125;
            int l = class6.anInt126;
            int i1 = Game.anIntArray880[l - k];
            i = aGame1657.anIntArray943[j] >> k & i1;
        } else
        if(anInt1652 != -1)
            i = aGame1657.anIntArray943[anInt1652];
        if(i < 0 || i >= anIntArray1658.length || anIntArray1658[i] == -1)
            return null;
        else
            return Class27.method272(anIntArray1658[i]);
    }

    public int anInt1651;
    public int anInt1652;
    public int anInt1653;
    public int anInt1654;
    public int anInt1655;
    public SEQ aClass20_1656;
    public static Game aGame1657;
    public int anIntArray1658[];
    public int anInt1659;
    public int anInt1660;
    public int anInt1661;
    public int anInt1662;
    public int anInt1663;
    public int anInt1664;
    public boolean aBoolean1665;
}
