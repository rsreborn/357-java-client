package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public abstract class Class39_Sub3_Sub2_Sub5 extends Class39_Sub3_Sub2
{

    public void method413(int y, int j, int x, boolean flag)
    {
        if(anInt1615 != -1 && SEQ.aClass20Array271[anInt1615].anInt284 == 1)
            anInt1615 = -1;
        if(!flag)
        {
            int l = y - anIntArray1629[0];
            int i1 = x - anIntArray1630[0];
            if(l >= -8 && l <= 8 && i1 >= -8 && i1 <= 8)
            {
                if(anInt1604 < 9)
                    anInt1604++;
                for(int j1 = anInt1604; j1 > 0; j1--)
                {
                    anIntArray1629[j1] = anIntArray1629[j1 - 1];
                    anIntArray1630[j1] = anIntArray1630[j1 - 1];
                    aBooleanArray1613[j1] = aBooleanArray1613[j1 - 1];
                }

                anIntArray1629[0] = y;
                anIntArray1630[0] = x;
                aBooleanArray1613[0] = false;
                return;
            }
        }
        anInt1604 = 0;
        anInt1614 = 0;
        if(j != -9787)
            aBoolean1596 = !aBoolean1596;
        anInt1602 = 0;
        anIntArray1629[0] = y;
        anIntArray1630[0] = x;
        anInt1621 = anIntArray1629[0] * 128 + anInt1608 * 64;
        anInt1622 = anIntArray1630[0] * 128 + anInt1608 * 64;
    }

    public void moveInDirection(int i, boolean running) {
        int k = anIntArray1629[0];
        int l = anIntArray1630[0];
        if(i == 0)
        {
            k--;
            l++;
        }
        if(i == 1)
            l++;
        if(i == 2)
        {
            k++;
            l++;
        }
        if(i == 3)
            k--;
        if(i == 4)
            k++;
        if(i == 5)
        {
            k--;
            l--;
        }
        if(i == 6)
            l--;
        if(i == 7)
        {
            k++;
            l--;
        }
        if(anInt1615 != -1 && SEQ.aClass20Array271[anInt1615].anInt284 == 1)
            anInt1615 = -1;
        if(anInt1604 < 9)
            anInt1604++;
        for(int i1 = anInt1604; i1 > 0; i1--)
        {
            anIntArray1629[i1] = anIntArray1629[i1 - 1];
            anIntArray1630[i1] = anIntArray1630[i1 - 1];
            aBooleanArray1613[i1] = aBooleanArray1613[i1 - 1];
        }

        anIntArray1629[0] = k;
        anIntArray1630[0] = l;
        aBooleanArray1613[0] = running;
    }

    public boolean method415(boolean flag)
    {
        if(!flag)
            aBoolean1596 = !aBoolean1596;
        return false;
    }

    public void method416(byte byte0, int i, int j, int k)
    {
        if(byte0 != 16)
            aBoolean1638 = !aBoolean1638;
        for(int l = 0; l < 4; l++)
            if(anIntArray1612[l] <= i)
            {
                anIntArray1610[l] = j;
                anIntArray1611[l] = k;
                anIntArray1612[l] = i + 70;
                return;
            }

    }

    public void method417(int i)
    {
        if(i <= 0)
            anInt1642 = 282;
        anInt1604 = 0;
        anInt1614 = 0;
    }

    public Class39_Sub3_Sub2_Sub5()
    {
        aBoolean1592 = false;
        anInt1593 = -1000;
        aBoolean1596 = false;
        anInt1597 = -1;
        anInt1603 = -1;
        anInt1606 = 200;
        anInt1608 = 1;
        anInt1609 = 32;
        anIntArray1610 = new int[4];
        anIntArray1611 = new int[4];
        anIntArray1612 = new int[4];
        aBooleanArray1613 = new boolean[10];
        anInt1615 = -1;
        anInt1620 = -1;
        anInt1624 = -1;
        anInt1628 = 100;
        anIntArray1629 = new int[10];
        anIntArray1630 = new int[10];
        aBoolean1638 = false;
        anInt1639 = 8378;
        anInt1640 = -1;
        anInt1641 = -1;
        anInt1642 = 951;
        anInt1644 = -1;
        anInt1645 = -1;
        anInt1646 = -1;
        anInt1647 = -1;
    }

    public boolean aBoolean1592;
    public int anInt1593;
    public int anInt1594;
    public int anInt1595;
    public boolean aBoolean1596;
    public int anInt1597;
    public int anInt1598;
    public int anInt1599;
    public int anInt1600;
    public int anInt1601;
    public int anInt1602;
    public int anInt1603;
    public int anInt1604;
    public String aString1605;
    public int anInt1606;
    public int anInt1607;
    public int anInt1608;
    public int anInt1609;
    public int anIntArray1610[];
    public int anIntArray1611[];
    public int anIntArray1612[];
    public boolean aBooleanArray1613[];
    public int anInt1614;
    public int anInt1615;
    public int anInt1616;
    public int anInt1617;
    public int anInt1618;
    public int anInt1619;
    public int anInt1620;
    public int anInt1621;
    public int anInt1622;
    public int anInt1623;
    public int anInt1624;
    public int anInt1625;
    public int anInt1626;
    public int anInt1627;
    public int anInt1628;
    public int anIntArray1629[];
    public int anIntArray1630[];
    public int anInt1631;
    public int anInt1632;
    public int anInt1633;
    public int anInt1634;
    public int anInt1635;
    public int anInt1636;
    public int anInt1637;
    public boolean aBoolean1638;
    public int anInt1639;
    public int anInt1640;
    public int anInt1641;
    public int anInt1642;
    public int anInt1643;
    public int anInt1644;
    public int anInt1645;
    public int anInt1646;
    public int anInt1647;
    public int anInt1648;
    public int anInt1649;
    public int anInt1650;
}
