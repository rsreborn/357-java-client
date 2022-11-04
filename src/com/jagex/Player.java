package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Player extends Class39_Sub3_Sub2_Sub5
{

    public void syncAppearance(boolean flag, Buffer class39_sub3_sub3)
    {
        class39_sub3_sub3.currentOffset = 0;
        anInt1748 = class39_sub3_sub3.readUByte();
        anInt1765 = class39_sub3_sub3.getByte();
        anInt1764 = class39_sub3_sub3.getByte();
        aClass47_1756 = null;
        anInt1753 = 0;
        for(int i = 0; i < 12; i++)
        {
            int j = class39_sub3_sub3.readUByte();
            if(j == 0)
            {
                anIntArray1760[i] = 0;
                continue;
            }
            int l = class39_sub3_sub3.readUByte();
            anIntArray1760[i] = (j << 8) + l;
            if(i == 0 && anIntArray1760[0] == 65535)
            {
                aClass47_1756 = Class47.method598(class39_sub3_sub3.readShort());
                break;
            }
            if(anIntArray1760[i] >= 512 && anIntArray1760[i] - 512 < Class4.anInt92)
            {
                int l1 = Class4.method174(anIntArray1760[i] - 512).anInt93;
                if(l1 != 0)
                    anInt1753 = l1;
            }
        }

        for(int k = 0; k < 5; k++)
        {
            int i1 = class39_sub3_sub3.readUByte();
            if(i1 < 0 || i1 >= Game.anIntArrayArray1020[k].length)
                i1 = 0;
            anIntArray1746[k] = i1;
        }

        super.anInt1640 = class39_sub3_sub3.readShort();
        if(super.anInt1640 == 65535)
            super.anInt1640 = -1;
        super.anInt1641 = class39_sub3_sub3.readShort();
        if(super.anInt1641 == 65535)
            super.anInt1641 = -1;
        super.anInt1644 = class39_sub3_sub3.readShort();
        if(super.anInt1644 == 65535)
            super.anInt1644 = -1;
        super.anInt1645 = class39_sub3_sub3.readShort();
        if(super.anInt1645 == 65535)
            super.anInt1645 = -1;
        super.anInt1646 = class39_sub3_sub3.readShort();
        if(super.anInt1646 == 65535)
            super.anInt1646 = -1;
        super.anInt1647 = class39_sub3_sub3.readShort();
        if(super.anInt1647 == 65535)
            super.anInt1647 = -1;
        super.anInt1603 = class39_sub3_sub3.readShort();
        if(super.anInt1603 == 65535)
            super.anInt1603 = -1;
        aString1754 = Class37.method372(Class37.method369(-39, class39_sub3_sub3.getLong()), false);
        anInt1768 = class39_sub3_sub3.readUByte();
        if(flag)
        {
            for(int j1 = 1; j1 > 0; j1++);
        }
        anInt1759 = class39_sub3_sub3.readShort();
        aBoolean1755 = true;
        aLong1758 = 0L;
        int k1 = anIntArray1760[5];
        int i2 = anIntArray1760[9];
        anIntArray1760[5] = i2;
        anIntArray1760[9] = k1;
        for(int j2 = 0; j2 < 12; j2++)
        {
            aLong1758 <<= 4;
            if(anIntArray1760[j2] >= 256)
                aLong1758 += anIntArray1760[j2] - 256;
        }

        if(anIntArray1760[0] >= 256)
            aLong1758 += anIntArray1760[0] - 256 >> 4;
        if(anIntArray1760[1] >= 256)
            aLong1758 += anIntArray1760[1] - 256 >> 8;
        anIntArray1760[5] = k1;
        anIntArray1760[9] = i2;
        for(int k2 = 0; k2 < 5; k2++)
        {
            aLong1758 <<= 3;
            aLong1758 += anIntArray1746[k2];
        }

        aLong1758 <<= 1;
        aLong1758 += anInt1748;
    }

    public Class39_Sub3_Sub2_Sub4 method419(int i)
    {
        if(i != 4245)
        {
            for(int j = 1; j > 0; j++);
        }
        if(aClass47_1756 != null)
        {
            int k = -1;
            if(super.anInt1615 >= 0 && super.anInt1618 == 0)
                k = SEQ.aClass20Array271[super.anInt1615].anIntArray273[super.anInt1616];
            else
            if(super.anInt1624 >= 0)
                k = SEQ.aClass20Array271[super.anInt1624].anIntArray273[super.anInt1625];
            Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4 = aClass47_1756.method597(-1, k, anInt1766, null);
            return class39_sub3_sub2_sub4;
        }
        long l = aLong1758;
        int i1 = -1;
        int j1 = -1;
        int k1 = -1;
        int l1 = -1;
        if(super.anInt1615 >= 0 && super.anInt1618 == 0)
        {
            SEQ class20 = SEQ.aClass20Array271[super.anInt1615];
            i1 = class20.anIntArray273[super.anInt1616];
            if(super.anInt1624 >= 0 && super.anInt1624 != super.anInt1640)
                j1 = SEQ.aClass20Array271[super.anInt1624].anIntArray273[super.anInt1625];
            if(class20.anInt280 >= 0)
            {
                k1 = class20.anInt280;
                l += k1 - anIntArray1760[5] << 40;
            }
            if(class20.anInt281 >= 0)
            {
                l1 = class20.anInt281;
                l += l1 - anIntArray1760[3] << 48;
            }
        } else
        if(super.anInt1624 >= 0)
            i1 = SEQ.aClass20Array271[super.anInt1624].anIntArray273[super.anInt1625];
        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4_1 = (Class39_Sub3_Sub2_Sub4)aClass35_1761.method361(l);
        if(class39_sub3_sub2_sub4_1 == null)
        {
            boolean flag = false;
            for(int i2 = 0; i2 < 12; i2++)
            {
                int k2 = anIntArray1760[i2];
                if(l1 >= 0 && i2 == 3)
                    k2 = l1;
                if(k1 >= 0 && i2 == 5)
                    k2 = k1;
                if(k2 >= 256 && k2 < 512 && !IDK.aClass15Array230[k2 - 256].method212(827))
                    flag = true;
                if(k2 >= 512 && !Class4.method174(k2 - 512).method170(anInt1748, -948))
                    flag = true;
            }

            if(flag)
            {
                if(aLong1763 != -1L)
                    class39_sub3_sub2_sub4_1 = (Class39_Sub3_Sub2_Sub4)aClass35_1761.method361(aLong1763);
                if(class39_sub3_sub2_sub4_1 == null)
                    return null;
            }
        }
        if(class39_sub3_sub2_sub4_1 == null)
        {
            Class39_Sub3_Sub2_Sub4 aclass39_sub3_sub2_sub4[] = new Class39_Sub3_Sub2_Sub4[12];
            int j2 = 0;
            for(int l2 = 0; l2 < 12; l2++)
            {
                int i3 = anIntArray1760[l2];
                if(l1 >= 0 && l2 == 3)
                    i3 = l1;
                if(k1 >= 0 && l2 == 5)
                    i3 = k1;
                if(i3 >= 256 && i3 < 512)
                {
                    Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4_3 = IDK.aClass15Array230[i3 - 256].method213(-15);
                    if(class39_sub3_sub2_sub4_3 != null)
                        aclass39_sub3_sub2_sub4[j2++] = class39_sub3_sub2_sub4_3;
                }
                if(i3 >= 512)
                {
                    Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4_4 = Class4.method174(i3 - 512).method172((byte)-8, anInt1748);
                    if(class39_sub3_sub2_sub4_4 != null)
                        aclass39_sub3_sub2_sub4[j2++] = class39_sub3_sub2_sub4_4;
                }
            }

            class39_sub3_sub2_sub4_1 = new Class39_Sub3_Sub2_Sub4(183, aclass39_sub3_sub2_sub4, j2);
            for(int j3 = 0; j3 < 5; j3++)
                if(anIntArray1746[j3] != 0)
                {
                    class39_sub3_sub2_sub4_1.method401(Game.anIntArrayArray1020[j3][0], Game.anIntArrayArray1020[j3][anIntArray1746[j3]]);
                    if(j3 == 1)
                        class39_sub3_sub2_sub4_1.method401(Game.anIntArray1320[0], Game.anIntArray1320[anIntArray1746[j3]]);
                }

            class39_sub3_sub2_sub4_1.method394(false);
            class39_sub3_sub2_sub4_1.method404(64, 850, -30, -50, -30, true);
            aClass35_1761.method362(l, class39_sub3_sub2_sub4_1, -501);
            aLong1763 = l;
        }
        if(aBoolean1757)
            return class39_sub3_sub2_sub4_1;
        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4_2 = Class39_Sub3_Sub2_Sub4.aClass39_Sub3_Sub2_Sub4_1521;
        class39_sub3_sub2_sub4_2.method389(Class33.method350((byte)9, i1) & Class33.method350((byte)9, j1), class39_sub3_sub2_sub4_1, 0);
        if(i1 != -1 && j1 != -1)
            class39_sub3_sub2_sub4_2.method396(j1, anInt1744, i1, SEQ.aClass20Array271[super.anInt1615].anIntArray277);
        else
        if(i1 != -1)
            class39_sub3_sub2_sub4_2.method395(i1, 0);
        class39_sub3_sub2_sub4_2.method391(aBoolean1745);
        class39_sub3_sub2_sub4_2.anIntArrayArray1557 = null;
        class39_sub3_sub2_sub4_2.anIntArrayArray1556 = null;
        return class39_sub3_sub2_sub4_2;
    }

    public Class39_Sub3_Sub2_Sub4 method420(int i)
    {
        if(!aBoolean1755)
            return null;
        if(aClass47_1756 != null)
            return aClass47_1756.method600(anInt1767);
        boolean flag = false;
        for(int j = 0; j < 12; j++)
        {
            int k = anIntArray1760[j];
            if(k >= 256 && k < 512 && !IDK.aClass15Array230[k - 256].method214(2))
                flag = true;
            if(k >= 512 && !Class4.method174(k - 512).method173(anInt1748, false))
                flag = true;
        }

        if(flag)
            return null;
        Class39_Sub3_Sub2_Sub4 aclass39_sub3_sub2_sub4[] = new Class39_Sub3_Sub2_Sub4[12];
        int l = 0;
        if(i != 0)
            anInt1766 = 388;
        for(int i1 = 0; i1 < 12; i1++)
        {
            int j1 = anIntArray1760[i1];
            if(j1 >= 256 && j1 < 512)
            {
                Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4_1 = IDK.aClass15Array230[j1 - 256].method215((byte)38);
                if(class39_sub3_sub2_sub4_1 != null)
                    aclass39_sub3_sub2_sub4[l++] = class39_sub3_sub2_sub4_1;
            }
            if(j1 >= 512)
            {
                Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4_2 = Class4.method174(j1 - 512).method176(5, anInt1748);
                if(class39_sub3_sub2_sub4_2 != null)
                    aclass39_sub3_sub2_sub4[l++] = class39_sub3_sub2_sub4_2;
            }
        }

        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4 = new Class39_Sub3_Sub2_Sub4(183, aclass39_sub3_sub2_sub4, l);
        for(int k1 = 0; k1 < 5; k1++)
            if(anIntArray1746[k1] != 0)
            {
                class39_sub3_sub2_sub4.method401(Game.anIntArrayArray1020[k1][0], Game.anIntArrayArray1020[k1][anIntArray1746[k1]]);
                if(k1 == 1)
                    class39_sub3_sub2_sub4.method401(Game.anIntArray1320[0], Game.anIntArray1320[anIntArray1746[k1]]);
            }

        return class39_sub3_sub2_sub4;
    }

    public Class39_Sub3_Sub2_Sub4 method379(int i)
    {
        if(!aBoolean1755)
            return null;
        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4 = method419(4245);
        if(i != -12617)
            anInt1747 = -306;
        if(class39_sub3_sub2_sub4 == null)
            return null;
        super.anInt1606 = ((Class39_Sub3_Sub2) (class39_sub3_sub2_sub4)).anInt1431;
        class39_sub3_sub2_sub4.aBoolean1558 = true;
        if(aBoolean1757)
            return class39_sub3_sub2_sub4;
        if(super.anInt1597 != -1 && super.anInt1598 != -1)
        {
            SpotAnim class11 = SpotAnim.aClass11Array188[super.anInt1597];
            Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4_2 = class11.method196();
            if(class39_sub3_sub2_sub4_2 != null)
            {
                Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4_3 = new Class39_Sub3_Sub2_Sub4(Class33.method350((byte)9, super.anInt1598), true, true, class39_sub3_sub2_sub4_2, false);
                class39_sub3_sub2_sub4_3.method400(0, -super.anInt1601, (byte)1, 0);
                class39_sub3_sub2_sub4_3.method394(false);
                class39_sub3_sub2_sub4_3.method395(class11.aClass20_192.anIntArray273[super.anInt1598], 0);
                class39_sub3_sub2_sub4_3.anIntArrayArray1557 = null;
                class39_sub3_sub2_sub4_3.anIntArrayArray1556 = null;
                if(class11.anInt195 != 128 || class11.anInt196 != 128)
                    class39_sub3_sub2_sub4_3.method403(class11.anInt195, true, class11.anInt195, class11.anInt196);
                class39_sub3_sub2_sub4_3.method404(64 + class11.anInt198, 850 + class11.anInt199, -30, -50, -30, true);
                Class39_Sub3_Sub2_Sub4 aclass39_sub3_sub2_sub4_1[] = {
                    class39_sub3_sub2_sub4, class39_sub3_sub2_sub4_3
                };
                class39_sub3_sub2_sub4 = new Class39_Sub3_Sub2_Sub4(-426, 2, true, aclass39_sub3_sub2_sub4_1);
            }
        }
        if(aClass39_Sub3_Sub2_Sub4_1743 != null)
        {
            if(Game.loopCycle >= anInt1739)
                aClass39_Sub3_Sub2_Sub4_1743 = null;
            if(Game.loopCycle >= anInt1738 && Game.loopCycle < anInt1739)
            {
                Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4_1 = aClass39_Sub3_Sub2_Sub4_1743;
                class39_sub3_sub2_sub4_1.method400(anInt1740 - super.anInt1621, anInt1741 - anInt1762, (byte)1, anInt1742 - super.anInt1622);
                if(super.anInt1627 == 512)
                {
                    class39_sub3_sub2_sub4_1.method398(-54);
                    class39_sub3_sub2_sub4_1.method398(-54);
                    class39_sub3_sub2_sub4_1.method398(-54);
                } else
                if(super.anInt1627 == 1024)
                {
                    class39_sub3_sub2_sub4_1.method398(-54);
                    class39_sub3_sub2_sub4_1.method398(-54);
                } else
                if(super.anInt1627 == 1536)
                    class39_sub3_sub2_sub4_1.method398(-54);
                Class39_Sub3_Sub2_Sub4 aclass39_sub3_sub2_sub4[] = {
                    class39_sub3_sub2_sub4, class39_sub3_sub2_sub4_1
                };
                class39_sub3_sub2_sub4 = new Class39_Sub3_Sub2_Sub4(-426, 2, true, aclass39_sub3_sub2_sub4);
                if(super.anInt1627 == 512)
                    class39_sub3_sub2_sub4_1.method398(-54);
                else
                if(super.anInt1627 == 1024)
                {
                    class39_sub3_sub2_sub4_1.method398(-54);
                    class39_sub3_sub2_sub4_1.method398(-54);
                } else
                if(super.anInt1627 == 1536)
                {
                    class39_sub3_sub2_sub4_1.method398(-54);
                    class39_sub3_sub2_sub4_1.method398(-54);
                    class39_sub3_sub2_sub4_1.method398(-54);
                }
                class39_sub3_sub2_sub4_1.method400(super.anInt1621 - anInt1740, anInt1762 - anInt1741, (byte)1, super.anInt1622 - anInt1742);
            }
        }
        class39_sub3_sub2_sub4.aBoolean1558 = true;
        return class39_sub3_sub2_sub4;
    }

    public boolean method415(boolean flag)
    {
        if(!flag)
            anInt1744 = 70;
        return aBoolean1755;
    }

    public Player()
    {
        anInt1744 = 42698;
        aBoolean1745 = false;
        anIntArray1746 = new int[5];
        aBoolean1755 = false;
        aBoolean1757 = false;
        anIntArray1760 = new int[12];
        aLong1763 = -1L;
        anInt1764 = -1;
        anInt1765 = -1;
        anInt1766 = 8;
    }

    public int anInt1738;
    public int anInt1739;
    public int anInt1740;
    public int anInt1741;
    public int anInt1742;
    public Class39_Sub3_Sub2_Sub4 aClass39_Sub3_Sub2_Sub4_1743;
    public int anInt1744;
    public boolean aBoolean1745;
    public int anIntArray1746[];
    public int anInt1747;
    public int anInt1748;
    public int anInt1749;
    public int anInt1750;
    public int anInt1751;
    public int anInt1752;
    public int anInt1753;
    public String aString1754;
    public boolean aBoolean1755;
    public Class47 aClass47_1756;
    public boolean aBoolean1757;
    public long aLong1758;
    public int anInt1759;
    public int anIntArray1760[];
    public static Class35 aClass35_1761 = new Class35(260, 5);
    public int anInt1762;
    public long aLong1763;
    public int anInt1764;
    public int anInt1765;
    public int anInt1766;
    public int anInt1767;
    public int anInt1768;

}
