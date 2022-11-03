package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class39_Sub3_Sub2_Sub5_Sub2 extends Class39_Sub3_Sub2_Sub5
{

    public Class39_Sub3_Sub2_Sub4 method421(int i)
    {
        if(super.anInt1615 >= 0 && super.anInt1618 == 0)
        {
            int j = SEQ.aClass20Array271[super.anInt1615].anIntArray273[super.anInt1616];
            int l = -1;
            if(super.anInt1624 >= 0 && super.anInt1624 != super.anInt1640)
                l = SEQ.aClass20Array271[super.anInt1624].anIntArray273[super.anInt1625];
            return aClass47_1772.method597(l, j, anInt1771, SEQ.aClass20Array271[super.anInt1615].anIntArray277);
        }
        int k = -1;
        if(i != 4245)
            aBoolean1770 = !aBoolean1770;
        if(super.anInt1624 >= 0)
            k = SEQ.aClass20Array271[super.anInt1624].anIntArray273[super.anInt1625];
        return aClass47_1772.method597(-1, k, anInt1771, null);
    }

    public Class39_Sub3_Sub2_Sub4 method379(int i)
    {
        if(aClass47_1772 == null)
            return null;
        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4 = method421(4245);
        if(class39_sub3_sub2_sub4 == null)
            return null;
        super.anInt1606 = ((Class39_Sub3_Sub2) (class39_sub3_sub2_sub4)).anInt1431;
        if(i != -12617)
            throw new NullPointerException();
        if(super.anInt1597 != -1 && super.anInt1598 != -1)
        {
            SpotAnim class11 = SpotAnim.aClass11Array188[super.anInt1597];
            Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4_1 = class11.method196();
            if(class39_sub3_sub2_sub4_1 != null)
            {
                int j = class11.aClass20_192.anIntArray273[super.anInt1598];
                Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4_2 = new Class39_Sub3_Sub2_Sub4(Class33.method350((byte)9, j), true, true, class39_sub3_sub2_sub4_1, false);
                class39_sub3_sub2_sub4_2.method400(0, -super.anInt1601, (byte)1, 0);
                class39_sub3_sub2_sub4_2.method394(false);
                class39_sub3_sub2_sub4_2.method395(j, 0);
                class39_sub3_sub2_sub4_2.anIntArrayArray1557 = null;
                class39_sub3_sub2_sub4_2.anIntArrayArray1556 = null;
                if(class11.anInt195 != 128 || class11.anInt196 != 128)
                    class39_sub3_sub2_sub4_2.method403(class11.anInt195, true, class11.anInt195, class11.anInt196);
                class39_sub3_sub2_sub4_2.method404(64 + class11.anInt198, 850 + class11.anInt199, -30, -50, -30, true);
                Class39_Sub3_Sub2_Sub4 aclass39_sub3_sub2_sub4[] = {
                    class39_sub3_sub2_sub4, class39_sub3_sub2_sub4_2
                };
                class39_sub3_sub2_sub4 = new Class39_Sub3_Sub2_Sub4(-426, 2, true, aclass39_sub3_sub2_sub4);
            }
        }
        if(aClass47_1772.aByte820 == 1)
            class39_sub3_sub2_sub4.aBoolean1558 = true;
        return class39_sub3_sub2_sub4;
    }

    public boolean method415(boolean flag)
    {
        if(!flag)
            aBoolean1769 = !aBoolean1769;
        return aClass47_1772 != null;
    }

    public Class39_Sub3_Sub2_Sub5_Sub2()
    {
        aBoolean1769 = true;
        aBoolean1770 = true;
        anInt1771 = 8;
    }

    public boolean aBoolean1769;
    public boolean aBoolean1770;
    public int anInt1771;
    public Class47 aClass47_1772;
}
