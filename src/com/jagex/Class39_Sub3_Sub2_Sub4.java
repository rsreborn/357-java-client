package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class39_Sub3_Sub2_Sub4 extends Class39_Sub3_Sub2
{

    public static void method383(int i)
    {
        aClass25Array1560 = null;
        aBooleanArray1562 = null;
        aBooleanArray1563 = null;
        anIntArray1564 = null;
        anIntArray1565 = null;
        anIntArray1566 = null;
        anIntArray1567 = null;
        anIntArray1568 = null;
        anIntArray1569 = null;
        anIntArray1570 = null;
        anIntArrayArray1571 = null;
        anIntArray1572 = null;
        anIntArrayArray1573 = null;
        anIntArray1574 = null;
        if(i != -29497)
            aBoolean1515 = !aBoolean1515;
        anIntArray1575 = null;
        anIntArray1576 = null;
        anIntArray1588 = null;
        anIntArray1589 = null;
        anIntArray1590 = null;
        anIntArray1591 = null;
    }

    public static void method384(int i, Class21 class21)
    {
        aClass25Array1560 = new Class25[i];
        aClass21_1561 = class21;
    }

    public static void method385(int i, byte abyte0[], int j)
    {
        if(abyte0 == null)
        {
            Class25 class25 = aClass25Array1560[j] = new Class25();
            class25.anInt335 = 0;
            class25.anInt336 = 0;
            class25.anInt337 = 0;
            return;
        }
        Buffer class39_sub3_sub3 = new Buffer(abyte0);
        class39_sub3_sub3.currentOffset = abyte0.length - 18;
        Class25 class25_1 = aClass25Array1560[j] = new Class25();
        class25_1.aByteArray334 = abyte0;
        class25_1.anInt335 = class39_sub3_sub3.getShort();
        class25_1.anInt336 = class39_sub3_sub3.getShort();
        class25_1.anInt337 = class39_sub3_sub3.getUnsignedByte();
        int k = class39_sub3_sub3.getUnsignedByte();
        int l = class39_sub3_sub3.getUnsignedByte();
        int i1 = class39_sub3_sub3.getUnsignedByte();
        int j1 = class39_sub3_sub3.getUnsignedByte();
        if(i != 4)
            aBoolean1512 = !aBoolean1512;
        int k1 = class39_sub3_sub3.getUnsignedByte();
        int l1 = class39_sub3_sub3.getShort();
        int i2 = class39_sub3_sub3.getShort();
        int j2 = class39_sub3_sub3.getShort();
        int k2 = class39_sub3_sub3.getShort();
        int l2 = 0;
        class25_1.anInt338 = l2;
        l2 += class25_1.anInt335;
        class25_1.anInt344 = l2;
        l2 += class25_1.anInt336;
        class25_1.anInt347 = l2;
        if(l == 255)
            l2 += class25_1.anInt336;
        else
            class25_1.anInt347 = -l - 1;
        class25_1.anInt349 = l2;
        if(j1 == 1)
            l2 += class25_1.anInt336;
        else
            class25_1.anInt349 = -1;
        class25_1.anInt346 = l2;
        if(k == 1)
            l2 += class25_1.anInt336;
        else
            class25_1.anInt346 = -1;
        class25_1.anInt342 = l2;
        if(k1 == 1)
            l2 += class25_1.anInt335;
        else
            class25_1.anInt342 = -1;
        class25_1.anInt348 = l2;
        if(i1 == 1)
            l2 += class25_1.anInt336;
        else
            class25_1.anInt348 = -1;
        class25_1.anInt343 = l2;
        l2 += k2;
        class25_1.anInt345 = l2;
        l2 += class25_1.anInt336 * 2;
        class25_1.anInt350 = l2;
        l2 += class25_1.anInt337 * 6;
        class25_1.anInt339 = l2;
        l2 += l1;
        class25_1.anInt340 = l2;
        l2 += i2;
        class25_1.anInt341 = l2;
        l2 += j2;
    }

    public static void method386(int i, int j)
    {
        if(j != -40577)
            anInt1519 = -452;
        aClass25Array1560[i] = null;
    }

    public static Class39_Sub3_Sub2_Sub4 method387(int i)
    {
        if(aClass25Array1560 == null)
            return null;
        Class25 class25 = aClass25Array1560[i];
        if(class25 == null)
        {
            aClass21_1561.method222(i);
            return null;
        } else
        {
            return new Class39_Sub3_Sub2_Sub4(i, (byte)4);
        }
    }

    public static boolean method388(int i)
    {
        if(aClass25Array1560 == null)
            return false;
        Class25 class25 = aClass25Array1560[i];
        if(class25 == null)
        {
            aClass21_1561.method222(i);
            return false;
        } else
        {
            return true;
        }
    }

    public Class39_Sub3_Sub2_Sub4(int i)
    {
        aBoolean1513 = true;
        aBoolean1516 = true;
        aByte1517 = 3;
        anInt1518 = 1;
        aBoolean1558 = false;
        if(i != -16028)
            anInt1519 = -45;
    }

    public Class39_Sub3_Sub2_Sub4(int i, byte byte0)
    {
        aBoolean1513 = true;
        aBoolean1516 = true;
        aByte1517 = 3;
        anInt1518 = 1;
        aBoolean1558 = false;
        anInt1520++;
        Class25 class25 = aClass25Array1560[i];
        anInt1526 = class25.anInt335;
        anInt1530 = class25.anInt336;
        anInt1542 = class25.anInt337;
        anIntArray1527 = new int[anInt1526];
        anIntArray1528 = new int[anInt1526];
        anIntArray1529 = new int[anInt1526];
        anIntArray1531 = new int[anInt1530];
        anIntArray1532 = new int[anInt1530];
        anIntArray1533 = new int[anInt1530];
        anIntArray1543 = new int[anInt1542];
        anIntArray1544 = new int[anInt1542];
        anIntArray1545 = new int[anInt1542];
        if(class25.anInt342 >= 0)
            anIntArray1554 = new int[anInt1526];
        if(class25.anInt346 >= 0)
            anIntArray1537 = new int[anInt1530];
        if(class25.anInt347 >= 0)
            anIntArray1538 = new int[anInt1530];
        else
            anInt1541 = -class25.anInt347 - 1;
        if(class25.anInt348 >= 0)
            anIntArray1539 = new int[anInt1530];
        if(class25.anInt349 >= 0)
            anIntArray1555 = new int[anInt1530];
        anIntArray1540 = new int[anInt1530];
        Buffer class39_sub3_sub3 = new Buffer(class25.aByteArray334);
        class39_sub3_sub3.currentOffset = class25.anInt338;
        Buffer class39_sub3_sub3_1 = new Buffer(class25.aByteArray334);
        class39_sub3_sub3_1.currentOffset = class25.anInt339;
        Buffer class39_sub3_sub3_2 = new Buffer(class25.aByteArray334);
        class39_sub3_sub3_2.currentOffset = class25.anInt340;
        Buffer class39_sub3_sub3_3 = new Buffer(class25.aByteArray334);
        class39_sub3_sub3_3.currentOffset = class25.anInt341;
        Buffer class39_sub3_sub3_4 = new Buffer(class25.aByteArray334);
        class39_sub3_sub3_4.currentOffset = class25.anInt342;
        int j = 0;
        int k = 0;
        int l = 0;
        if(byte0 != 4)
            throw new NullPointerException();
        for(int i1 = 0; i1 < anInt1526; i1++)
        {
            int j1 = class39_sub3_sub3.getUnsignedByte();
            int l1 = 0;
            if((j1 & 1) != 0)
                l1 = class39_sub3_sub3_1.method448();
            int j2 = 0;
            if((j1 & 2) != 0)
                j2 = class39_sub3_sub3_2.method448();
            int l2 = 0;
            if((j1 & 4) != 0)
                l2 = class39_sub3_sub3_3.method448();
            anIntArray1527[i1] = j + l1;
            anIntArray1528[i1] = k + j2;
            anIntArray1529[i1] = l + l2;
            j = anIntArray1527[i1];
            k = anIntArray1528[i1];
            l = anIntArray1529[i1];
            if(anIntArray1554 != null)
                anIntArray1554[i1] = class39_sub3_sub3_4.getUnsignedByte();
        }

        class39_sub3_sub3.currentOffset = class25.anInt345;
        class39_sub3_sub3_1.currentOffset = class25.anInt346;
        class39_sub3_sub3_2.currentOffset = class25.anInt347;
        class39_sub3_sub3_3.currentOffset = class25.anInt348;
        class39_sub3_sub3_4.currentOffset = class25.anInt349;
        for(int k1 = 0; k1 < anInt1530; k1++)
        {
            anIntArray1540[k1] = class39_sub3_sub3.getShort();
            if(anIntArray1537 != null)
                anIntArray1537[k1] = class39_sub3_sub3_1.getUnsignedByte();
            if(anIntArray1538 != null)
                anIntArray1538[k1] = class39_sub3_sub3_2.getUnsignedByte();
            if(anIntArray1539 != null)
                anIntArray1539[k1] = class39_sub3_sub3_3.getUnsignedByte();
            if(anIntArray1555 != null)
                anIntArray1555[k1] = class39_sub3_sub3_4.getUnsignedByte();
        }

        class39_sub3_sub3.currentOffset = class25.anInt343;
        class39_sub3_sub3_1.currentOffset = class25.anInt344;
        int i2 = 0;
        int k2 = 0;
        int i3 = 0;
        int j3 = 0;
        for(int k3 = 0; k3 < anInt1530; k3++)
        {
            int l3 = class39_sub3_sub3_1.getUnsignedByte();
            if(l3 == 1)
            {
                i2 = class39_sub3_sub3.method448() + j3;
                j3 = i2;
                k2 = class39_sub3_sub3.method448() + j3;
                j3 = k2;
                i3 = class39_sub3_sub3.method448() + j3;
                j3 = i3;
                anIntArray1531[k3] = i2;
                anIntArray1532[k3] = k2;
                anIntArray1533[k3] = i3;
            }
            if(l3 == 2)
            {
                i2 = i2;
                k2 = i3;
                i3 = class39_sub3_sub3.method448() + j3;
                j3 = i3;
                anIntArray1531[k3] = i2;
                anIntArray1532[k3] = k2;
                anIntArray1533[k3] = i3;
            }
            if(l3 == 3)
            {
                i2 = i3;
                k2 = k2;
                i3 = class39_sub3_sub3.method448() + j3;
                j3 = i3;
                anIntArray1531[k3] = i2;
                anIntArray1532[k3] = k2;
                anIntArray1533[k3] = i3;
            }
            if(l3 == 4)
            {
                int j4 = i2;
                i2 = k2;
                k2 = j4;
                i3 = class39_sub3_sub3.method448() + j3;
                j3 = i3;
                anIntArray1531[k3] = i2;
                anIntArray1532[k3] = k2;
                anIntArray1533[k3] = i3;
            }
        }

        class39_sub3_sub3.currentOffset = class25.anInt350;
        for(int i4 = 0; i4 < anInt1542; i4++)
        {
            anIntArray1543[i4] = class39_sub3_sub3.getShort();
            anIntArray1544[i4] = class39_sub3_sub3.getShort();
            anIntArray1545[i4] = class39_sub3_sub3.getShort();
        }

    }

    public Class39_Sub3_Sub2_Sub4(int i, Class39_Sub3_Sub2_Sub4 aclass39_sub3_sub2_sub4[], int j)
    {
        aBoolean1513 = true;
        aBoolean1516 = true;
        aByte1517 = 3;
        anInt1518 = 1;
        aBoolean1558 = false;
        anInt1520++;
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        anInt1526 = 0;
        anInt1530 = 0;
        anInt1542 = 0;
        anInt1541 = -1;
        for(int k = 0; k < j; k++)
        {
            Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4 = aclass39_sub3_sub2_sub4[k];
            if(class39_sub3_sub2_sub4 != null)
            {
                anInt1526 += class39_sub3_sub2_sub4.anInt1526;
                anInt1530 += class39_sub3_sub2_sub4.anInt1530;
                anInt1542 += class39_sub3_sub2_sub4.anInt1542;
                flag |= class39_sub3_sub2_sub4.anIntArray1537 != null;
                if(class39_sub3_sub2_sub4.anIntArray1538 != null)
                {
                    flag1 = true;
                } else
                {
                    if(anInt1541 == -1)
                        anInt1541 = class39_sub3_sub2_sub4.anInt1541;
                    if(anInt1541 != class39_sub3_sub2_sub4.anInt1541)
                        flag1 = true;
                }
                flag2 |= class39_sub3_sub2_sub4.anIntArray1539 != null;
                flag3 |= class39_sub3_sub2_sub4.anIntArray1555 != null;
            }
        }

        anIntArray1527 = new int[anInt1526];
        anIntArray1528 = new int[anInt1526];
        anIntArray1529 = new int[anInt1526];
        anIntArray1554 = new int[anInt1526];
        anIntArray1531 = new int[anInt1530];
        anIntArray1532 = new int[anInt1530];
        anIntArray1533 = new int[anInt1530];
        anIntArray1543 = new int[anInt1542];
        anIntArray1544 = new int[anInt1542];
        anIntArray1545 = new int[anInt1542];
        if(flag)
            anIntArray1537 = new int[anInt1530];
        if(flag1)
            anIntArray1538 = new int[anInt1530];
        if(flag2)
            anIntArray1539 = new int[anInt1530];
        if(flag3)
            anIntArray1555 = new int[anInt1530];
        anIntArray1540 = new int[anInt1530];
        i = 14 / i;
        anInt1526 = 0;
        anInt1530 = 0;
        anInt1542 = 0;
        int l = 0;
        for(int i1 = 0; i1 < j; i1++)
        {
            Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4_1 = aclass39_sub3_sub2_sub4[i1];
            if(class39_sub3_sub2_sub4_1 != null)
            {
                for(int j1 = 0; j1 < class39_sub3_sub2_sub4_1.anInt1530; j1++)
                {
                    if(flag)
                        if(class39_sub3_sub2_sub4_1.anIntArray1537 == null)
                        {
                            anIntArray1537[anInt1530] = 0;
                        } else
                        {
                            int k1 = class39_sub3_sub2_sub4_1.anIntArray1537[j1];
                            if((k1 & 2) == 2)
                                k1 += l << 2;
                            anIntArray1537[anInt1530] = k1;
                        }
                    if(flag1)
                        if(class39_sub3_sub2_sub4_1.anIntArray1538 == null)
                            anIntArray1538[anInt1530] = class39_sub3_sub2_sub4_1.anInt1541;
                        else
                            anIntArray1538[anInt1530] = class39_sub3_sub2_sub4_1.anIntArray1538[j1];
                    if(flag2)
                        if(class39_sub3_sub2_sub4_1.anIntArray1539 == null)
                            anIntArray1539[anInt1530] = 0;
                        else
                            anIntArray1539[anInt1530] = class39_sub3_sub2_sub4_1.anIntArray1539[j1];
                    if(flag3 && class39_sub3_sub2_sub4_1.anIntArray1555 != null)
                        anIntArray1555[anInt1530] = class39_sub3_sub2_sub4_1.anIntArray1555[j1];
                    anIntArray1540[anInt1530] = class39_sub3_sub2_sub4_1.anIntArray1540[j1];
                    anIntArray1531[anInt1530] = method390(class39_sub3_sub2_sub4_1, class39_sub3_sub2_sub4_1.anIntArray1531[j1]);
                    anIntArray1532[anInt1530] = method390(class39_sub3_sub2_sub4_1, class39_sub3_sub2_sub4_1.anIntArray1532[j1]);
                    anIntArray1533[anInt1530] = method390(class39_sub3_sub2_sub4_1, class39_sub3_sub2_sub4_1.anIntArray1533[j1]);
                    anInt1530++;
                }

                for(int l1 = 0; l1 < class39_sub3_sub2_sub4_1.anInt1542; l1++)
                {
                    anIntArray1543[anInt1542] = method390(class39_sub3_sub2_sub4_1, class39_sub3_sub2_sub4_1.anIntArray1543[l1]);
                    anIntArray1544[anInt1542] = method390(class39_sub3_sub2_sub4_1, class39_sub3_sub2_sub4_1.anIntArray1544[l1]);
                    anIntArray1545[anInt1542] = method390(class39_sub3_sub2_sub4_1, class39_sub3_sub2_sub4_1.anIntArray1545[l1]);
                    anInt1542++;
                }

                l += class39_sub3_sub2_sub4_1.anInt1542;
            }
        }

    }

    public Class39_Sub3_Sub2_Sub4(int i, int j, boolean flag, Class39_Sub3_Sub2_Sub4 aclass39_sub3_sub2_sub4[])
    {
        aBoolean1513 = true;
        aBoolean1516 = true;
        aByte1517 = 3;
        anInt1518 = 1;
        aBoolean1558 = false;
        anInt1520++;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        anInt1526 = 0;
        anInt1530 = 0;
        anInt1542 = 0;
        anInt1541 = -1;
        for(int k = 0; k < j; k++)
        {
            Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4 = aclass39_sub3_sub2_sub4[k];
            if(class39_sub3_sub2_sub4 != null)
            {
                anInt1526 += class39_sub3_sub2_sub4.anInt1526;
                anInt1530 += class39_sub3_sub2_sub4.anInt1530;
                anInt1542 += class39_sub3_sub2_sub4.anInt1542;
                flag1 |= class39_sub3_sub2_sub4.anIntArray1537 != null;
                if(class39_sub3_sub2_sub4.anIntArray1538 != null)
                {
                    flag2 = true;
                } else
                {
                    if(anInt1541 == -1)
                        anInt1541 = class39_sub3_sub2_sub4.anInt1541;
                    if(anInt1541 != class39_sub3_sub2_sub4.anInt1541)
                        flag2 = true;
                }
                flag3 |= class39_sub3_sub2_sub4.anIntArray1539 != null;
                flag4 |= class39_sub3_sub2_sub4.anIntArray1540 != null;
            }
        }

        if(i >= 0)
            throw new NullPointerException();
        anIntArray1527 = new int[anInt1526];
        anIntArray1528 = new int[anInt1526];
        anIntArray1529 = new int[anInt1526];
        anIntArray1531 = new int[anInt1530];
        anIntArray1532 = new int[anInt1530];
        anIntArray1533 = new int[anInt1530];
        anIntArray1534 = new int[anInt1530];
        anIntArray1535 = new int[anInt1530];
        anIntArray1536 = new int[anInt1530];
        anIntArray1543 = new int[anInt1542];
        anIntArray1544 = new int[anInt1542];
        anIntArray1545 = new int[anInt1542];
        if(flag1)
            anIntArray1537 = new int[anInt1530];
        if(flag2)
            anIntArray1538 = new int[anInt1530];
        if(flag3)
            anIntArray1539 = new int[anInt1530];
        if(flag4)
            anIntArray1540 = new int[anInt1530];
        anInt1526 = 0;
        anInt1530 = 0;
        anInt1542 = 0;
        int l = 0;
        for(int i1 = 0; i1 < j; i1++)
        {
            Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4_1 = aclass39_sub3_sub2_sub4[i1];
            if(class39_sub3_sub2_sub4_1 != null)
            {
                int j1 = anInt1526;
                for(int k1 = 0; k1 < class39_sub3_sub2_sub4_1.anInt1526; k1++)
                {
                    anIntArray1527[anInt1526] = class39_sub3_sub2_sub4_1.anIntArray1527[k1];
                    anIntArray1528[anInt1526] = class39_sub3_sub2_sub4_1.anIntArray1528[k1];
                    anIntArray1529[anInt1526] = class39_sub3_sub2_sub4_1.anIntArray1529[k1];
                    anInt1526++;
                }

                for(int l1 = 0; l1 < class39_sub3_sub2_sub4_1.anInt1530; l1++)
                {
                    anIntArray1531[anInt1530] = class39_sub3_sub2_sub4_1.anIntArray1531[l1] + j1;
                    anIntArray1532[anInt1530] = class39_sub3_sub2_sub4_1.anIntArray1532[l1] + j1;
                    anIntArray1533[anInt1530] = class39_sub3_sub2_sub4_1.anIntArray1533[l1] + j1;
                    anIntArray1534[anInt1530] = class39_sub3_sub2_sub4_1.anIntArray1534[l1];
                    anIntArray1535[anInt1530] = class39_sub3_sub2_sub4_1.anIntArray1535[l1];
                    anIntArray1536[anInt1530] = class39_sub3_sub2_sub4_1.anIntArray1536[l1];
                    if(flag1)
                        if(class39_sub3_sub2_sub4_1.anIntArray1537 == null)
                        {
                            anIntArray1537[anInt1530] = 0;
                        } else
                        {
                            int i2 = class39_sub3_sub2_sub4_1.anIntArray1537[l1];
                            if((i2 & 2) == 2)
                                i2 += l << 2;
                            anIntArray1537[anInt1530] = i2;
                        }
                    if(flag2)
                        if(class39_sub3_sub2_sub4_1.anIntArray1538 == null)
                            anIntArray1538[anInt1530] = class39_sub3_sub2_sub4_1.anInt1541;
                        else
                            anIntArray1538[anInt1530] = class39_sub3_sub2_sub4_1.anIntArray1538[l1];
                    if(flag3)
                        if(class39_sub3_sub2_sub4_1.anIntArray1539 == null)
                            anIntArray1539[anInt1530] = 0;
                        else
                            anIntArray1539[anInt1530] = class39_sub3_sub2_sub4_1.anIntArray1539[l1];
                    if(flag4 && class39_sub3_sub2_sub4_1.anIntArray1540 != null)
                        anIntArray1540[anInt1530] = class39_sub3_sub2_sub4_1.anIntArray1540[l1];
                    anInt1530++;
                }

                for(int j2 = 0; j2 < class39_sub3_sub2_sub4_1.anInt1542; j2++)
                {
                    anIntArray1543[anInt1542] = class39_sub3_sub2_sub4_1.anIntArray1543[j2] + j1;
                    anIntArray1544[anInt1542] = class39_sub3_sub2_sub4_1.anIntArray1544[j2] + j1;
                    anIntArray1545[anInt1542] = class39_sub3_sub2_sub4_1.anIntArray1545[j2] + j1;
                    anInt1542++;
                }

                l += class39_sub3_sub2_sub4_1.anInt1542;
            }
        }

        method391(aBoolean1515);
    }

    public Class39_Sub3_Sub2_Sub4(boolean flag, boolean flag1, boolean flag2, Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4, boolean flag3)
    {
        aBoolean1513 = true;
        aBoolean1516 = true;
        aByte1517 = 3;
        anInt1518 = 1;
        aBoolean1558 = false;
        if(!flag1)
            throw new NullPointerException();
        anInt1520++;
        anInt1526 = class39_sub3_sub2_sub4.anInt1526;
        anInt1530 = class39_sub3_sub2_sub4.anInt1530;
        anInt1542 = class39_sub3_sub2_sub4.anInt1542;
        if(flag3)
        {
            anIntArray1527 = class39_sub3_sub2_sub4.anIntArray1527;
            anIntArray1528 = class39_sub3_sub2_sub4.anIntArray1528;
            anIntArray1529 = class39_sub3_sub2_sub4.anIntArray1529;
        } else
        {
            anIntArray1527 = new int[anInt1526];
            anIntArray1528 = new int[anInt1526];
            anIntArray1529 = new int[anInt1526];
            for(int i = 0; i < anInt1526; i++)
            {
                anIntArray1527[i] = class39_sub3_sub2_sub4.anIntArray1527[i];
                anIntArray1528[i] = class39_sub3_sub2_sub4.anIntArray1528[i];
                anIntArray1529[i] = class39_sub3_sub2_sub4.anIntArray1529[i];
            }

        }
        if(flag2)
        {
            anIntArray1540 = class39_sub3_sub2_sub4.anIntArray1540;
        } else
        {
            anIntArray1540 = new int[anInt1530];
            for(int j = 0; j < anInt1530; j++)
                anIntArray1540[j] = class39_sub3_sub2_sub4.anIntArray1540[j];

        }
        if(flag)
        {
            anIntArray1539 = class39_sub3_sub2_sub4.anIntArray1539;
        } else
        {
            anIntArray1539 = new int[anInt1530];
            if(class39_sub3_sub2_sub4.anIntArray1539 == null)
            {
                for(int k = 0; k < anInt1530; k++)
                    anIntArray1539[k] = 0;

            } else
            {
                for(int l = 0; l < anInt1530; l++)
                    anIntArray1539[l] = class39_sub3_sub2_sub4.anIntArray1539[l];

            }
        }
        anIntArray1554 = class39_sub3_sub2_sub4.anIntArray1554;
        anIntArray1555 = class39_sub3_sub2_sub4.anIntArray1555;
        anIntArray1537 = class39_sub3_sub2_sub4.anIntArray1537;
        anIntArray1531 = class39_sub3_sub2_sub4.anIntArray1531;
        anIntArray1532 = class39_sub3_sub2_sub4.anIntArray1532;
        anIntArray1533 = class39_sub3_sub2_sub4.anIntArray1533;
        anIntArray1538 = class39_sub3_sub2_sub4.anIntArray1538;
        anInt1541 = class39_sub3_sub2_sub4.anInt1541;
        anIntArray1543 = class39_sub3_sub2_sub4.anIntArray1543;
        anIntArray1544 = class39_sub3_sub2_sub4.anIntArray1544;
        anIntArray1545 = class39_sub3_sub2_sub4.anIntArray1545;
    }

    public Class39_Sub3_Sub2_Sub4(int i, boolean flag, boolean flag1, Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4)
    {
        aBoolean1513 = true;
        aBoolean1516 = true;
        aByte1517 = 3;
        anInt1518 = 1;
        aBoolean1558 = false;
        anInt1520++;
        anInt1526 = class39_sub3_sub2_sub4.anInt1526;
        anInt1530 = class39_sub3_sub2_sub4.anInt1530;
        anInt1542 = class39_sub3_sub2_sub4.anInt1542;
        if(flag)
        {
            anIntArray1528 = new int[anInt1526];
            for(int j = 0; j < anInt1526; j++)
                anIntArray1528[j] = class39_sub3_sub2_sub4.anIntArray1528[j];

        } else
        {
            anIntArray1528 = class39_sub3_sub2_sub4.anIntArray1528;
        }
        if(flag1)
        {
            anIntArray1534 = new int[anInt1530];
            anIntArray1535 = new int[anInt1530];
            anIntArray1536 = new int[anInt1530];
            for(int k = 0; k < anInt1530; k++)
            {
                anIntArray1534[k] = class39_sub3_sub2_sub4.anIntArray1534[k];
                anIntArray1535[k] = class39_sub3_sub2_sub4.anIntArray1535[k];
                anIntArray1536[k] = class39_sub3_sub2_sub4.anIntArray1536[k];
            }

            anIntArray1537 = new int[anInt1530];
            if(class39_sub3_sub2_sub4.anIntArray1537 == null)
            {
                for(int l = 0; l < anInt1530; l++)
                    anIntArray1537[l] = 0;

            } else
            {
                for(int i1 = 0; i1 < anInt1530; i1++)
                    anIntArray1537[i1] = class39_sub3_sub2_sub4.anIntArray1537[i1];

            }
            super.aClass18Array1430 = new Class18[anInt1526];
            for(int j1 = 0; j1 < anInt1526; j1++)
            {
                Class18 class18 = super.aClass18Array1430[j1] = new Class18();
                Class18 class18_1 = ((Class39_Sub3_Sub2) (class39_sub3_sub2_sub4)).aClass18Array1430[j1];
                class18.anInt262 = class18_1.anInt262;
                class18.anInt263 = class18_1.anInt263;
                class18.anInt264 = class18_1.anInt264;
                class18.anInt265 = class18_1.anInt265;
            }

            aClass18Array1559 = class39_sub3_sub2_sub4.aClass18Array1559;
        } else
        {
            anIntArray1534 = class39_sub3_sub2_sub4.anIntArray1534;
            anIntArray1535 = class39_sub3_sub2_sub4.anIntArray1535;
            anIntArray1536 = class39_sub3_sub2_sub4.anIntArray1536;
            anIntArray1537 = class39_sub3_sub2_sub4.anIntArray1537;
        }
        anIntArray1527 = class39_sub3_sub2_sub4.anIntArray1527;
        anIntArray1529 = class39_sub3_sub2_sub4.anIntArray1529;
        anIntArray1540 = class39_sub3_sub2_sub4.anIntArray1540;
        anIntArray1539 = class39_sub3_sub2_sub4.anIntArray1539;
        anIntArray1538 = class39_sub3_sub2_sub4.anIntArray1538;
        anInt1541 = class39_sub3_sub2_sub4.anInt1541;
        anIntArray1531 = class39_sub3_sub2_sub4.anIntArray1531;
        anIntArray1532 = class39_sub3_sub2_sub4.anIntArray1532;
        anIntArray1533 = class39_sub3_sub2_sub4.anIntArray1533;
        anIntArray1543 = class39_sub3_sub2_sub4.anIntArray1543;
        anIntArray1544 = class39_sub3_sub2_sub4.anIntArray1544;
        anIntArray1545 = class39_sub3_sub2_sub4.anIntArray1545;
        super.anInt1431 = ((Class39_Sub3_Sub2) (class39_sub3_sub2_sub4)).anInt1431;
        anInt1550 = class39_sub3_sub2_sub4.anInt1550;
        while(i >= 0) 
            aBoolean1515 = !aBoolean1515;
        anInt1549 = class39_sub3_sub2_sub4.anInt1549;
        anInt1552 = class39_sub3_sub2_sub4.anInt1552;
        anInt1551 = class39_sub3_sub2_sub4.anInt1551;
        anInt1547 = class39_sub3_sub2_sub4.anInt1547;
        anInt1548 = class39_sub3_sub2_sub4.anInt1548;
        anInt1546 = class39_sub3_sub2_sub4.anInt1546;
    }

    public void method389(boolean flag, Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4, int i)
    {
        anInt1526 = class39_sub3_sub2_sub4.anInt1526;
        if(i != 0)
            aBoolean1515 = !aBoolean1515;
        anInt1530 = class39_sub3_sub2_sub4.anInt1530;
        anInt1542 = class39_sub3_sub2_sub4.anInt1542;
        if(anIntArray1522.length < anInt1526)
        {
            anIntArray1522 = new int[anInt1526 + 100];
            anIntArray1523 = new int[anInt1526 + 100];
            anIntArray1524 = new int[anInt1526 + 100];
        }
        anIntArray1527 = anIntArray1522;
        anIntArray1528 = anIntArray1523;
        anIntArray1529 = anIntArray1524;
        for(int j = 0; j < anInt1526; j++)
        {
            anIntArray1527[j] = class39_sub3_sub2_sub4.anIntArray1527[j];
            anIntArray1528[j] = class39_sub3_sub2_sub4.anIntArray1528[j];
            anIntArray1529[j] = class39_sub3_sub2_sub4.anIntArray1529[j];
        }

        if(flag)
        {
            anIntArray1539 = class39_sub3_sub2_sub4.anIntArray1539;
        } else
        {
            if(anIntArray1525.length < anInt1530)
                anIntArray1525 = new int[anInt1530 + 100];
            anIntArray1539 = anIntArray1525;
            if(class39_sub3_sub2_sub4.anIntArray1539 == null)
            {
                for(int k = 0; k < anInt1530; k++)
                    anIntArray1539[k] = 0;

            } else
            {
                for(int l = 0; l < anInt1530; l++)
                    anIntArray1539[l] = class39_sub3_sub2_sub4.anIntArray1539[l];

            }
        }
        anIntArray1537 = class39_sub3_sub2_sub4.anIntArray1537;
        anIntArray1540 = class39_sub3_sub2_sub4.anIntArray1540;
        anIntArray1538 = class39_sub3_sub2_sub4.anIntArray1538;
        anInt1541 = class39_sub3_sub2_sub4.anInt1541;
        anIntArrayArray1557 = class39_sub3_sub2_sub4.anIntArrayArray1557;
        anIntArrayArray1556 = class39_sub3_sub2_sub4.anIntArrayArray1556;
        anIntArray1531 = class39_sub3_sub2_sub4.anIntArray1531;
        anIntArray1532 = class39_sub3_sub2_sub4.anIntArray1532;
        anIntArray1533 = class39_sub3_sub2_sub4.anIntArray1533;
        anIntArray1534 = class39_sub3_sub2_sub4.anIntArray1534;
        anIntArray1535 = class39_sub3_sub2_sub4.anIntArray1535;
        anIntArray1536 = class39_sub3_sub2_sub4.anIntArray1536;
        anIntArray1543 = class39_sub3_sub2_sub4.anIntArray1543;
        anIntArray1544 = class39_sub3_sub2_sub4.anIntArray1544;
        anIntArray1545 = class39_sub3_sub2_sub4.anIntArray1545;
    }

    public int method390(Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4, int i)
    {
        int j = -1;
        int k = class39_sub3_sub2_sub4.anIntArray1527[i];
        int l = class39_sub3_sub2_sub4.anIntArray1528[i];
        int i1 = class39_sub3_sub2_sub4.anIntArray1529[i];
        for(int j1 = 0; j1 < anInt1526; j1++)
        {
            if(k != anIntArray1527[j1] || l != anIntArray1528[j1] || i1 != anIntArray1529[j1])
                continue;
            j = j1;
            break;
        }

        if(j == -1)
        {
            anIntArray1527[anInt1526] = k;
            anIntArray1528[anInt1526] = l;
            anIntArray1529[anInt1526] = i1;
            if(class39_sub3_sub2_sub4.anIntArray1554 != null)
                anIntArray1554[anInt1526] = class39_sub3_sub2_sub4.anIntArray1554[i];
            j = anInt1526++;
        }
        return j;
    }

    public void method391(boolean flag)
    {
        super.anInt1431 = 0;
        anInt1549 = 0;
        anInt1550 = 0;
        for(int i = 0; i < anInt1526; i++)
        {
            int j = anIntArray1527[i];
            int k = anIntArray1528[i];
            int l = anIntArray1529[i];
            if(-k > super.anInt1431)
                super.anInt1431 = -k;
            if(k > anInt1550)
                anInt1550 = k;
            int i1 = j * j + l * l;
            if(i1 > anInt1549)
                anInt1549 = i1;
        }

        anInt1549 = (int)(Math.sqrt(anInt1549) + 0.98999999999999999D);
        anInt1552 = (int)(Math.sqrt(anInt1549 * anInt1549 + super.anInt1431 * super.anInt1431) + 0.98999999999999999D);
        anInt1551 = anInt1552 + (int)(Math.sqrt(anInt1549 * anInt1549 + anInt1550 * anInt1550) + 0.98999999999999999D);
        if(flag)
            anInt1518 = -457;
    }

    public void method392(byte byte0)
    {
        super.anInt1431 = 0;
        anInt1550 = 0;
        for(int i = 0; i < anInt1526; i++)
        {
            int j = anIntArray1528[i];
            if(-j > super.anInt1431)
                super.anInt1431 = -j;
            if(j > anInt1550)
                anInt1550 = j;
        }

        anInt1552 = (int)(Math.sqrt(anInt1549 * anInt1549 + super.anInt1431 * super.anInt1431) + 0.98999999999999999D);
        if(byte0 != -57)
        {
            return;
        } else
        {
            anInt1551 = anInt1552 + (int)(Math.sqrt(anInt1549 * anInt1549 + anInt1550 * anInt1550) + 0.98999999999999999D);
            return;
        }
    }

    public void method393(boolean flag)
    {
        super.anInt1431 = 0;
        anInt1549 = 0;
        anInt1550 = 0;
        int i = 32767;
        int j = -32767;
        int k = -32767;
        int l = 32767;
        for(int i1 = 0; i1 < anInt1526; i1++)
        {
            int j1 = anIntArray1527[i1];
            int k1 = anIntArray1528[i1];
            int l1 = anIntArray1529[i1];
            if(j1 < i)
                i = j1;
            if(j1 > j)
                j = j1;
            if(l1 < l)
                l = l1;
            if(l1 > k)
                k = l1;
            if(-k1 > super.anInt1431)
                super.anInt1431 = -k1;
            if(k1 > anInt1550)
                anInt1550 = k1;
            int i2 = j1 * j1 + l1 * l1;
            if(i2 > anInt1549)
                anInt1549 = i2;
        }

        anInt1549 = (int)Math.sqrt(anInt1549);
        anInt1552 = (int)Math.sqrt(anInt1549 * anInt1549 + super.anInt1431 * super.anInt1431);
        if(!flag)
            anInt1518 = -454;
        anInt1551 = anInt1552 + (int)Math.sqrt(anInt1549 * anInt1549 + anInt1550 * anInt1550);
        anInt1547 = (i << 16) + (j & 0xffff);
        anInt1548 = (k << 16) + (l & 0xffff);
    }

    public void method394(boolean flag)
    {
        if(flag)
            return;
        if(anIntArray1554 != null)
        {
            int ai[] = new int[256];
            int i = 0;
            for(int k = 0; k < anInt1526; k++)
            {
                int i1 = anIntArray1554[k];
                ai[i1]++;
                if(i1 > i)
                    i = i1;
            }

            anIntArrayArray1556 = new int[i + 1][];
            for(int j1 = 0; j1 <= i; j1++)
            {
                anIntArrayArray1556[j1] = new int[ai[j1]];
                ai[j1] = 0;
            }

            for(int i2 = 0; i2 < anInt1526; i2++)
            {
                int k2 = anIntArray1554[i2];
                anIntArrayArray1556[k2][ai[k2]++] = i2;
            }

            anIntArray1554 = null;
        }
        if(anIntArray1555 != null)
        {
            int ai1[] = new int[256];
            int j = 0;
            for(int l = 0; l < anInt1530; l++)
            {
                int k1 = anIntArray1555[l];
                ai1[k1]++;
                if(k1 > j)
                    j = k1;
            }

            anIntArrayArray1557 = new int[j + 1][];
            for(int l1 = 0; l1 <= j; l1++)
            {
                anIntArrayArray1557[l1] = new int[ai1[l1]];
                ai1[l1] = 0;
            }

            for(int j2 = 0; j2 < anInt1530; j2++)
            {
                int l2 = anIntArray1555[j2];
                anIntArrayArray1557[l2][ai1[l2]++] = j2;
            }

            anIntArray1555 = null;
        }
    }

    public void method395(int i, int j)
    {
        if(anIntArrayArray1556 == null)
            return;
        if(i == -1)
            return;
        Class33 class33 = Class33.method349(i);
        if(class33 == null)
            return;
        Class49 class49 = class33.aClass49_570;
        anInt1580 = 0;
        if(j != 0)
            return;
        anInt1581 = 0;
        anInt1582 = 0;
        for(int k = 0; k < class33.anInt571; k++)
        {
            int l = class33.anIntArray572[k];
            method397(class49.anIntArray830[l], class49.anIntArrayArray831[l], class33.anIntArray573[k], class33.anIntArray574[k], class33.anIntArray575[k]);
        }

    }

    public void method396(int i, int j, int k, int ai[])
    {
        if(k == -1)
            return;
        if(ai == null || i == -1)
        {
            method395(k, 0);
            return;
        }
        Class33 class33 = Class33.method349(k);
        if(class33 == null)
            return;
        Class33 class33_1 = Class33.method349(i);
        if(class33_1 == null)
        {
            method395(k, 0);
            return;
        }
        Class49 class49 = class33.aClass49_570;
        anInt1580 = 0;
        anInt1581 = 0;
        anInt1582 = 0;
        int l = 0;
        int i1 = ai[l++];
        for(int j1 = 0; j1 < class33.anInt571; j1++)
        {
            int k1;
            for(k1 = class33.anIntArray572[j1]; k1 > i1; i1 = ai[l++]);
            if(k1 != i1 || class49.anIntArray830[k1] == 0)
                method397(class49.anIntArray830[k1], class49.anIntArrayArray831[k1], class33.anIntArray573[j1], class33.anIntArray574[j1], class33.anIntArray575[j1]);
        }

        anInt1580 = 0;
        anInt1581 = 0;
        anInt1582 = 0;
        l = 0;
        if(j != 42698)
            return;
        i1 = ai[l++];
        for(int l1 = 0; l1 < class33_1.anInt571; l1++)
        {
            int i2;
            for(i2 = class33_1.anIntArray572[l1]; i2 > i1; i1 = ai[l++]);
            if(i2 == i1 || class49.anIntArray830[i2] == 0)
                method397(class49.anIntArray830[i2], class49.anIntArrayArray831[i2], class33_1.anIntArray573[l1], class33_1.anIntArray574[l1], class33_1.anIntArray575[l1]);
        }

    }

    public void method397(int i, int ai[], int j, int k, int l)
    {
        int i1 = ai.length;
        if(i == 0)
        {
            int j1 = 0;
            anInt1580 = 0;
            anInt1581 = 0;
            anInt1582 = 0;
            for(int k2 = 0; k2 < i1; k2++)
            {
                int l3 = ai[k2];
                if(l3 < anIntArrayArray1556.length)
                {
                    int ai5[] = anIntArrayArray1556[l3];
                    for(int i5 = 0; i5 < ai5.length; i5++)
                    {
                        int j6 = ai5[i5];
                        anInt1580 += anIntArray1527[j6];
                        anInt1581 += anIntArray1528[j6];
                        anInt1582 += anIntArray1529[j6];
                        j1++;
                    }

                }
            }

            if(j1 > 0)
            {
                anInt1580 = anInt1580 / j1 + j;
                anInt1581 = anInt1581 / j1 + k;
                anInt1582 = anInt1582 / j1 + l;
                return;
            } else
            {
                anInt1580 = j;
                anInt1581 = k;
                anInt1582 = l;
                return;
            }
        }
        if(i == 1)
        {
            for(int k1 = 0; k1 < i1; k1++)
            {
                int l2 = ai[k1];
                if(l2 < anIntArrayArray1556.length)
                {
                    int ai1[] = anIntArrayArray1556[l2];
                    for(int i4 = 0; i4 < ai1.length; i4++)
                    {
                        int j5 = ai1[i4];
                        anIntArray1527[j5] += j;
                        anIntArray1528[j5] += k;
                        anIntArray1529[j5] += l;
                    }

                }
            }

            return;
        }
        if(i == 2)
        {
            for(int l1 = 0; l1 < i1; l1++)
            {
                int i3 = ai[l1];
                if(i3 < anIntArrayArray1556.length)
                {
                    int ai2[] = anIntArrayArray1556[i3];
                    for(int j4 = 0; j4 < ai2.length; j4++)
                    {
                        int k5 = ai2[j4];
                        anIntArray1527[k5] -= anInt1580;
                        anIntArray1528[k5] -= anInt1581;
                        anIntArray1529[k5] -= anInt1582;
                        int k6 = (j & 0xff) * 8;
                        int l6 = (k & 0xff) * 8;
                        int i7 = (l & 0xff) * 8;
                        if(i7 != 0)
                        {
                            int j7 = anIntArray1588[i7];
                            int i8 = anIntArray1589[i7];
                            int l8 = anIntArray1528[k5] * j7 + anIntArray1527[k5] * i8 >> 16;
                            anIntArray1528[k5] = anIntArray1528[k5] * i8 - anIntArray1527[k5] * j7 >> 16;
                            anIntArray1527[k5] = l8;
                        }
                        if(k6 != 0)
                        {
                            int k7 = anIntArray1588[k6];
                            int j8 = anIntArray1589[k6];
                            int i9 = anIntArray1528[k5] * j8 - anIntArray1529[k5] * k7 >> 16;
                            anIntArray1529[k5] = anIntArray1528[k5] * k7 + anIntArray1529[k5] * j8 >> 16;
                            anIntArray1528[k5] = i9;
                        }
                        if(l6 != 0)
                        {
                            int l7 = anIntArray1588[l6];
                            int k8 = anIntArray1589[l6];
                            int j9 = anIntArray1529[k5] * l7 + anIntArray1527[k5] * k8 >> 16;
                            anIntArray1529[k5] = anIntArray1529[k5] * k8 - anIntArray1527[k5] * l7 >> 16;
                            anIntArray1527[k5] = j9;
                        }
                        anIntArray1527[k5] += anInt1580;
                        anIntArray1528[k5] += anInt1581;
                        anIntArray1529[k5] += anInt1582;
                    }

                }
            }

            return;
        }
        if(i == 3)
        {
            for(int i2 = 0; i2 < i1; i2++)
            {
                int j3 = ai[i2];
                if(j3 < anIntArrayArray1556.length)
                {
                    int ai3[] = anIntArrayArray1556[j3];
                    for(int k4 = 0; k4 < ai3.length; k4++)
                    {
                        int l5 = ai3[k4];
                        anIntArray1527[l5] -= anInt1580;
                        anIntArray1528[l5] -= anInt1581;
                        anIntArray1529[l5] -= anInt1582;
                        anIntArray1527[l5] = (anIntArray1527[l5] * j) / 128;
                        anIntArray1528[l5] = (anIntArray1528[l5] * k) / 128;
                        anIntArray1529[l5] = (anIntArray1529[l5] * l) / 128;
                        anIntArray1527[l5] += anInt1580;
                        anIntArray1528[l5] += anInt1581;
                        anIntArray1529[l5] += anInt1582;
                    }

                }
            }

            return;
        }
        if(i == 5 && anIntArrayArray1557 != null && anIntArray1539 != null)
        {
            for(int j2 = 0; j2 < i1; j2++)
            {
                int k3 = ai[j2];
                if(k3 < anIntArrayArray1557.length)
                {
                    int ai4[] = anIntArrayArray1557[k3];
                    for(int l4 = 0; l4 < ai4.length; l4++)
                    {
                        int i6 = ai4[l4];
                        anIntArray1539[i6] += j * 8;
                        if(anIntArray1539[i6] < 0)
                            anIntArray1539[i6] = 0;
                        if(anIntArray1539[i6] > 255)
                            anIntArray1539[i6] = 255;
                    }

                }
            }

        }
    }

    public void method398(int i)
    {
        while(i >= 0) 
            anInt1514 = -294;
        for(int j = 0; j < anInt1526; j++)
        {
            int k = anIntArray1527[j];
            anIntArray1527[j] = anIntArray1529[j];
            anIntArray1529[j] = -k;
        }

    }

    public void method399(boolean flag, int i)
    {
        int j = anIntArray1588[i];
        int k = anIntArray1589[i];
        for(int l = 0; l < anInt1526; l++)
        {
            int i1 = anIntArray1528[l] * k - anIntArray1529[l] * j >> 16;
            anIntArray1529[l] = anIntArray1528[l] * j + anIntArray1529[l] * k >> 16;
            anIntArray1528[l] = i1;
        }

        if(!flag)
            anInt1519 = 140;
    }

    public void method400(int i, int j, byte byte0, int k)
    {
        for(int l = 0; l < anInt1526; l++)
        {
            anIntArray1527[l] += i;
            anIntArray1528[l] += j;
            anIntArray1529[l] += k;
        }

        if(byte0 != 1)
            aBoolean1513 = !aBoolean1513;
    }

    public void method401(int i, int j)
    {
        for(int k = 0; k < anInt1530; k++)
            if(anIntArray1540[k] == i)
                anIntArray1540[k] = j;

    }

    public void method402(int i)
    {
        i = 37 / i;
        for(int j = 0; j < anInt1526; j++)
            anIntArray1529[j] = -anIntArray1529[j];

        for(int k = 0; k < anInt1530; k++)
        {
            int l = anIntArray1531[k];
            anIntArray1531[k] = anIntArray1533[k];
            anIntArray1533[k] = l;
        }

    }

    public void method403(int i, boolean flag, int j, int k)
    {
        for(int l = 0; l < anInt1526; l++)
        {
            anIntArray1527[l] = (anIntArray1527[l] * j) / 128;
            anIntArray1528[l] = (anIntArray1528[l] * k) / 128;
            anIntArray1529[l] = (anIntArray1529[l] * i) / 128;
        }

        if(!flag)
            anInt1519 = -240;
    }

    public void method404(int i, int j, int k, int l, int i1, boolean flag)
    {
        int j1 = (int)Math.sqrt(k * k + l * l + i1 * i1);
        int k1 = j * j1 >> 8;
        if(anIntArray1534 == null)
        {
            anIntArray1534 = new int[anInt1530];
            anIntArray1535 = new int[anInt1530];
            anIntArray1536 = new int[anInt1530];
        }
        if(super.aClass18Array1430 == null)
        {
            super.aClass18Array1430 = new Class18[anInt1526];
            for(int l1 = 0; l1 < anInt1526; l1++)
                super.aClass18Array1430[l1] = new Class18();

        }
        for(int i2 = 0; i2 < anInt1530; i2++)
        {
            int j2 = anIntArray1531[i2];
            int l2 = anIntArray1532[i2];
            int i3 = anIntArray1533[i2];
            int j3 = anIntArray1527[l2] - anIntArray1527[j2];
            int k3 = anIntArray1528[l2] - anIntArray1528[j2];
            int l3 = anIntArray1529[l2] - anIntArray1529[j2];
            int i4 = anIntArray1527[i3] - anIntArray1527[j2];
            int j4 = anIntArray1528[i3] - anIntArray1528[j2];
            int k4 = anIntArray1529[i3] - anIntArray1529[j2];
            int l4 = k3 * k4 - j4 * l3;
            int i5 = l3 * i4 - k4 * j3;
            int j5;
            for(j5 = j3 * j4 - i4 * k3; l4 > 8192 || i5 > 8192 || j5 > 8192 || l4 < -8192 || i5 < -8192 || j5 < -8192; j5 >>= 1)
            {
                l4 >>= 1;
                i5 >>= 1;
            }

            int k5 = (int)Math.sqrt(l4 * l4 + i5 * i5 + j5 * j5);
            if(k5 <= 0)
                k5 = 1;
            l4 = (l4 * 256) / k5;
            i5 = (i5 * 256) / k5;
            j5 = (j5 * 256) / k5;
            if(anIntArray1537 == null || (anIntArray1537[i2] & 1) == 0)
            {
                Class18 class18_2 = super.aClass18Array1430[j2];
                class18_2.anInt262 += l4;
                class18_2.anInt263 += i5;
                class18_2.anInt264 += j5;
                class18_2.anInt265++;
                class18_2 = super.aClass18Array1430[l2];
                class18_2.anInt262 += l4;
                class18_2.anInt263 += i5;
                class18_2.anInt264 += j5;
                class18_2.anInt265++;
                class18_2 = super.aClass18Array1430[i3];
                class18_2.anInt262 += l4;
                class18_2.anInt263 += i5;
                class18_2.anInt264 += j5;
                class18_2.anInt265++;
            } else
            {
                int l5 = i + (k * l4 + l * i5 + i1 * j5) / (k1 + k1 / 2);
                anIntArray1534[i2] = method407(anIntArray1540[i2], l5, anIntArray1537[i2]);
            }
        }

        if(flag)
        {
            method406(i, k1, k, l, i1);
        } else
        {
            aClass18Array1559 = new Class18[anInt1526];
            for(int k2 = 0; k2 < anInt1526; k2++)
            {
                Class18 class18 = super.aClass18Array1430[k2];
                Class18 class18_1 = aClass18Array1559[k2] = new Class18();
                class18_1.anInt262 = class18.anInt262;
                class18_1.anInt263 = class18.anInt263;
                class18_1.anInt264 = class18.anInt264;
                class18_1.anInt265 = class18.anInt265;
            }

            anInt1546 = (i << 16) + (k1 & 0xffff);
        }
        if(flag)
        {
            method391(aBoolean1515);
            return;
        } else
        {
            method393(true);
            return;
        }
    }

    public void method405(int i, int j, int k, int l)
    {
        if(k <= 0)
        {
            for(int i1 = 1; i1 > 0; i1++);
        }
        int j1 = anInt1546 >> 16;
        int k1 = (anInt1546 << 16) >> 16;
        method406(j1, k1, j, i, l);
    }

    public void method406(int i, int j, int k, int l, int i1)
    {
        for(int j1 = 0; j1 < anInt1530; j1++)
        {
            int k1 = anIntArray1531[j1];
            int i2 = anIntArray1532[j1];
            int j2 = anIntArray1533[j1];
            if(anIntArray1537 == null)
            {
                int i3 = anIntArray1540[j1];
                Class18 class18 = super.aClass18Array1430[k1];
                int k2 = i + (k * class18.anInt262 + l * class18.anInt263 + i1 * class18.anInt264) / (j * class18.anInt265);
                anIntArray1534[j1] = method407(i3, k2, 0);
                class18 = super.aClass18Array1430[i2];
                k2 = i + (k * class18.anInt262 + l * class18.anInt263 + i1 * class18.anInt264) / (j * class18.anInt265);
                anIntArray1535[j1] = method407(i3, k2, 0);
                class18 = super.aClass18Array1430[j2];
                k2 = i + (k * class18.anInt262 + l * class18.anInt263 + i1 * class18.anInt264) / (j * class18.anInt265);
                anIntArray1536[j1] = method407(i3, k2, 0);
            } else
            if((anIntArray1537[j1] & 1) == 0)
            {
                int j3 = anIntArray1540[j1];
                int k3 = anIntArray1537[j1];
                Class18 class18_1 = super.aClass18Array1430[k1];
                int l2 = i + (k * class18_1.anInt262 + l * class18_1.anInt263 + i1 * class18_1.anInt264) / (j * class18_1.anInt265);
                anIntArray1534[j1] = method407(j3, l2, k3);
                class18_1 = super.aClass18Array1430[i2];
                l2 = i + (k * class18_1.anInt262 + l * class18_1.anInt263 + i1 * class18_1.anInt264) / (j * class18_1.anInt265);
                anIntArray1535[j1] = method407(j3, l2, k3);
                class18_1 = super.aClass18Array1430[j2];
                l2 = i + (k * class18_1.anInt262 + l * class18_1.anInt263 + i1 * class18_1.anInt264) / (j * class18_1.anInt265);
                anIntArray1536[j1] = method407(j3, l2, k3);
            }
        }

        super.aClass18Array1430 = null;
        aClass18Array1559 = null;
        anIntArray1554 = null;
        anIntArray1555 = null;
        if(anIntArray1537 != null)
        {
            for(int l1 = 0; l1 < anInt1530; l1++)
                if((anIntArray1537[l1] & 2) == 2)
                    return;

        }
        anIntArray1540 = null;
    }

    public static int method407(int i, int j, int k)
    {
        if((k & 2) == 2)
        {
            if(j < 0)
                j = 0;
            else
            if(j > 127)
                j = 127;
            j = 127 - j;
            return j;
        }
        j = j * (i & 0x7f) >> 7;
        if(j < 2)
            j = 2;
        else
        if(j > 126)
            j = 126;
        return (i & 0xff80) + j;
    }

    public void method408(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        int l1 = Class39_Sub3_Sub4_Sub1.anInt1674;
        int i2 = Class39_Sub3_Sub4_Sub1.anInt1675;
        int j2 = anIntArray1588[i];
        int k2 = anIntArray1589[i];
        int l2 = anIntArray1588[j];
        int i3 = anIntArray1589[j];
        int j3 = anIntArray1588[k];
        int k3 = anIntArray1589[k];
        int l3 = anIntArray1588[l];
        int i4 = anIntArray1589[l];
        int j4 = j1 * l3 + k1 * i4 >> 16;
        for(int k4 = 0; k4 < anInt1526; k4++)
        {
            int l4 = anIntArray1527[k4];
            int i5 = anIntArray1528[k4];
            int j5 = anIntArray1529[k4];
            if(k != 0)
            {
                int k5 = i5 * j3 + l4 * k3 >> 16;
                i5 = i5 * k3 - l4 * j3 >> 16;
                l4 = k5;
            }
            if(i != 0)
            {
                int l5 = i5 * k2 - j5 * j2 >> 16;
                j5 = i5 * j2 + j5 * k2 >> 16;
                i5 = l5;
            }
            if(j != 0)
            {
                int i6 = j5 * l2 + l4 * i3 >> 16;
                j5 = j5 * i3 - l4 * l2 >> 16;
                l4 = i6;
            }
            l4 += i1;
            i5 += j1;
            j5 += k1;
            int j6 = i5 * i4 - j5 * l3 >> 16;
            j5 = i5 * l3 + j5 * i4 >> 16;
            i5 = j6;
            anIntArray1566[k4] = j5 - j4;
            anIntArray1564[k4] = l1 + (l4 << 9) / j5;
            anIntArray1565[k4] = i2 + (i5 << 9) / j5;
            if(anInt1542 > 0)
            {
                anIntArray1567[k4] = l4;
                anIntArray1568[k4] = i5;
                anIntArray1569[k4] = j5;
            }
        }

        try
        {
            method409(false, false, 0);
            return;
        }
        catch(Exception _ex)
        {
            return;
        }
    }

    public void method378(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2)
    {
        int j2 = l1 * i1 - j1 * l >> 16;
        int k2 = k1 * j + j2 * k >> 16;
        int l2 = anInt1549 * k >> 16;
        int i3 = k2 + l2;
        if(i3 <= 50 || k2 >= 3500)
            return;
        int j3 = l1 * l + j1 * i1 >> 16;
        int k3 = j3 - anInt1549 << 9;
        if(k3 / i3 >= Class39_Sub3_Sub4.anInt1467)
            return;
        int l3 = j3 + anInt1549 << 9;
        if(l3 / i3 <= -Class39_Sub3_Sub4.anInt1467)
            return;
        int i4 = k1 * k - j2 * j >> 16;
        int j4 = anInt1549 * j >> 16;
        int k4 = i4 + j4 << 9;
        if(k4 / i3 <= -Class39_Sub3_Sub4.anInt1468)
            return;
        int l4 = j4 + (super.anInt1431 * k >> 16);
        int i5 = i4 - l4 << 9;
        if(i5 / i3 >= Class39_Sub3_Sub4.anInt1468)
            return;
        int j5 = l2 + (super.anInt1431 * j >> 16);
        boolean flag = false;
        if(k2 - j5 <= 50)
            flag = true;
        boolean flag1 = false;
        if(i2 > 0 && aBoolean1583)
        {
            int k5 = k2 - l2;
            if(k5 <= 50)
                k5 = 50;
            if(j3 > 0)
            {
                k3 /= i3;
                l3 /= k5;
            } else
            {
                l3 /= i3;
                k3 /= k5;
            }
            if(i4 > 0)
            {
                i5 /= i3;
                k4 /= k5;
            } else
            {
                k4 /= i3;
                i5 /= k5;
            }
            int i6 = anInt1584 - Class39_Sub3_Sub4_Sub1.anInt1674;
            int k6 = anInt1585 - Class39_Sub3_Sub4_Sub1.anInt1675;
            if(i6 > k3 && i6 < l3 && k6 > i5 && k6 < k4)
                if(aBoolean1558)
                    anIntArray1587[anInt1586++] = i2;
                else
                    flag1 = true;
        }
        int l5 = Class39_Sub3_Sub4_Sub1.anInt1674;
        int j6 = Class39_Sub3_Sub4_Sub1.anInt1675;
        int l6 = 0;
        int i7 = 0;
        if(i != 0)
        {
            l6 = anIntArray1588[i];
            i7 = anIntArray1589[i];
        }
        for(int j7 = 0; j7 < anInt1526; j7++)
        {
            int k7 = anIntArray1527[j7];
            int l7 = anIntArray1528[j7];
            int i8 = anIntArray1529[j7];
            if(i != 0)
            {
                int j8 = i8 * l6 + k7 * i7 >> 16;
                i8 = i8 * i7 - k7 * l6 >> 16;
                k7 = j8;
            }
            k7 += j1;
            l7 += k1;
            i8 += l1;
            int k8 = i8 * l + k7 * i1 >> 16;
            i8 = i8 * i1 - k7 * l >> 16;
            k7 = k8;
            k8 = l7 * k - i8 * j >> 16;
            i8 = l7 * j + i8 * k >> 16;
            l7 = k8;
            anIntArray1566[j7] = i8 - k2;
            if(i8 >= 50)
            {
                anIntArray1564[j7] = l5 + (k7 << 9) / i8;
                anIntArray1565[j7] = j6 + (l7 << 9) / i8;
            } else
            {
                anIntArray1564[j7] = -5000;
                flag = true;
            }
            if(flag || anInt1542 > 0)
            {
                anIntArray1567[j7] = k7;
                anIntArray1568[j7] = l7;
                anIntArray1569[j7] = i8;
            }
        }

        try
        {
            method409(flag, flag1, i2);
            return;
        }
        catch(Exception _ex)
        {
            return;
        }
    }

    public void method409(boolean flag, boolean flag1, int i)
    {
        for(int j = 0; j < anInt1551; j++)
            anIntArray1570[j] = 0;

        for(int k = 0; k < anInt1530; k++)
            if(anIntArray1537 == null || anIntArray1537[k] != -1)
            {
                int l = anIntArray1531[k];
                int k1 = anIntArray1532[k];
                int j2 = anIntArray1533[k];
                int i3 = anIntArray1564[l];
                int l3 = anIntArray1564[k1];
                int k4 = anIntArray1564[j2];
                if(flag && (i3 == -5000 || l3 == -5000 || k4 == -5000))
                {
                    aBooleanArray1563[k] = true;
                    int j5 = (anIntArray1566[l] + anIntArray1566[k1] + anIntArray1566[j2]) / 3 + anInt1552;
                    anIntArrayArray1571[j5][anIntArray1570[j5]++] = k;
                } else
                {
                    if(flag1 && method412(anInt1584, anInt1585, anIntArray1565[l], anIntArray1565[k1], anIntArray1565[j2], i3, l3, k4))
                    {
                        anIntArray1587[anInt1586++] = i;
                        flag1 = false;
                    }
                    if((i3 - l3) * (anIntArray1565[j2] - anIntArray1565[k1]) - (anIntArray1565[l] - anIntArray1565[k1]) * (k4 - l3) > 0)
                    {
                        aBooleanArray1563[k] = false;
                        if(i3 < 0 || l3 < 0 || k4 < 0 || i3 > Class39_Sub3_Sub4.anInt1466 || l3 > Class39_Sub3_Sub4.anInt1466 || k4 > Class39_Sub3_Sub4.anInt1466)
                            aBooleanArray1562[k] = true;
                        else
                            aBooleanArray1562[k] = false;
                        int k5 = (anIntArray1566[l] + anIntArray1566[k1] + anIntArray1566[j2]) / 3 + anInt1552;
                        anIntArrayArray1571[k5][anIntArray1570[k5]++] = k;
                    }
                }
            }

        if(anIntArray1538 == null)
        {
            for(int i1 = anInt1551 - 1; i1 >= 0; i1--)
            {
                int l1 = anIntArray1570[i1];
                if(l1 > 0)
                {
                    int ai[] = anIntArrayArray1571[i1];
                    for(int j3 = 0; j3 < l1; j3++)
                        method410(ai[j3]);

                }
            }

            return;
        }
        for(int j1 = 0; j1 < 12; j1++)
        {
            anIntArray1572[j1] = 0;
            anIntArray1576[j1] = 0;
        }

        for(int i2 = anInt1551 - 1; i2 >= 0; i2--)
        {
            int k2 = anIntArray1570[i2];
            if(k2 > 0)
            {
                int ai1[] = anIntArrayArray1571[i2];
                for(int i4 = 0; i4 < k2; i4++)
                {
                    int l4 = ai1[i4];
                    int l5 = anIntArray1538[l4];
                    int j6 = anIntArray1572[l5]++;
                    anIntArrayArray1573[l5][j6] = l4;
                    if(l5 < 10)
                        anIntArray1576[l5] += i2;
                    else
                    if(l5 == 10)
                        anIntArray1574[j6] = i2;
                    else
                        anIntArray1575[j6] = i2;
                }

            }
        }

        int l2 = 0;
        if(anIntArray1572[1] > 0 || anIntArray1572[2] > 0)
            l2 = (anIntArray1576[1] + anIntArray1576[2]) / (anIntArray1572[1] + anIntArray1572[2]);
        int k3 = 0;
        if(anIntArray1572[3] > 0 || anIntArray1572[4] > 0)
            k3 = (anIntArray1576[3] + anIntArray1576[4]) / (anIntArray1572[3] + anIntArray1572[4]);
        int j4 = 0;
        if(anIntArray1572[6] > 0 || anIntArray1572[8] > 0)
            j4 = (anIntArray1576[6] + anIntArray1576[8]) / (anIntArray1572[6] + anIntArray1572[8]);
        int i6 = 0;
        int k6 = anIntArray1572[10];
        int ai2[] = anIntArrayArray1573[10];
        int ai3[] = anIntArray1574;
        if(i6 == k6)
        {
            i6 = 0;
            k6 = anIntArray1572[11];
            ai2 = anIntArrayArray1573[11];
            ai3 = anIntArray1575;
        }
        int i5;
        if(i6 < k6)
            i5 = ai3[i6];
        else
            i5 = -1000;
        for(int l6 = 0; l6 < 10; l6++)
        {
            while(l6 == 0 && i5 > l2) 
            {
                method410(ai2[i6++]);
                if(i6 == k6 && ai2 != anIntArrayArray1573[11])
                {
                    i6 = 0;
                    k6 = anIntArray1572[11];
                    ai2 = anIntArrayArray1573[11];
                    ai3 = anIntArray1575;
                }
                if(i6 < k6)
                    i5 = ai3[i6];
                else
                    i5 = -1000;
            }
            while(l6 == 3 && i5 > k3) 
            {
                method410(ai2[i6++]);
                if(i6 == k6 && ai2 != anIntArrayArray1573[11])
                {
                    i6 = 0;
                    k6 = anIntArray1572[11];
                    ai2 = anIntArrayArray1573[11];
                    ai3 = anIntArray1575;
                }
                if(i6 < k6)
                    i5 = ai3[i6];
                else
                    i5 = -1000;
            }
            while(l6 == 5 && i5 > j4) 
            {
                method410(ai2[i6++]);
                if(i6 == k6 && ai2 != anIntArrayArray1573[11])
                {
                    i6 = 0;
                    k6 = anIntArray1572[11];
                    ai2 = anIntArrayArray1573[11];
                    ai3 = anIntArray1575;
                }
                if(i6 < k6)
                    i5 = ai3[i6];
                else
                    i5 = -1000;
            }
            int i7 = anIntArray1572[l6];
            int ai4[] = anIntArrayArray1573[l6];
            for(int j7 = 0; j7 < i7; j7++)
                method410(ai4[j7]);

        }

        while(i5 != -1000) 
        {
            method410(ai2[i6++]);
            if(i6 == k6 && ai2 != anIntArrayArray1573[11])
            {
                i6 = 0;
                ai2 = anIntArrayArray1573[11];
                k6 = anIntArray1572[11];
                ai3 = anIntArray1575;
            }
            if(i6 < k6)
                i5 = ai3[i6];
            else
                i5 = -1000;
        }
    }

    public void method410(int i)
    {
        if(aBooleanArray1563[i])
        {
            method411(i);
            return;
        }
        int j = anIntArray1531[i];
        int k = anIntArray1532[i];
        int l = anIntArray1533[i];
        Class39_Sub3_Sub4_Sub1.aBoolean1670 = aBooleanArray1562[i];
        if(anIntArray1539 == null)
            Class39_Sub3_Sub4_Sub1.anInt1673 = 0;
        else
            Class39_Sub3_Sub4_Sub1.anInt1673 = anIntArray1539[i];
        int i1;
        if(anIntArray1537 == null)
            i1 = 0;
        else
            i1 = anIntArray1537[i] & 3;
        if(i1 == 0)
        {
            Class39_Sub3_Sub4_Sub1.method496(anIntArray1565[j], anIntArray1565[k], anIntArray1565[l], anIntArray1564[j], anIntArray1564[k], anIntArray1564[l], anIntArray1534[i], anIntArray1535[i], anIntArray1536[i]);
            return;
        }
        if(i1 == 1)
        {
            Class39_Sub3_Sub4_Sub1.method498(anIntArray1565[j], anIntArray1565[k], anIntArray1565[l], anIntArray1564[j], anIntArray1564[k], anIntArray1564[l], anIntArray1590[anIntArray1534[i]]);
            return;
        }
        if(i1 == 2)
        {
            int j1 = anIntArray1537[i] >> 2;
            int l1 = anIntArray1543[j1];
            int j2 = anIntArray1544[j1];
            int l2 = anIntArray1545[j1];
            Class39_Sub3_Sub4_Sub1.method500(anIntArray1565[j], anIntArray1565[k], anIntArray1565[l], anIntArray1564[j], anIntArray1564[k], anIntArray1564[l], anIntArray1534[i], anIntArray1535[i], anIntArray1536[i], anIntArray1567[l1], anIntArray1567[j2], anIntArray1567[l2], anIntArray1568[l1], anIntArray1568[j2], anIntArray1568[l2], anIntArray1569[l1], anIntArray1569[j2], anIntArray1569[l2], anIntArray1540[i]);
            return;
        }
        if(i1 == 3)
        {
            int k1 = anIntArray1537[i] >> 2;
            int i2 = anIntArray1543[k1];
            int k2 = anIntArray1544[k1];
            int i3 = anIntArray1545[k1];
            Class39_Sub3_Sub4_Sub1.method500(anIntArray1565[j], anIntArray1565[k], anIntArray1565[l], anIntArray1564[j], anIntArray1564[k], anIntArray1564[l], anIntArray1534[i], anIntArray1534[i], anIntArray1534[i], anIntArray1567[i2], anIntArray1567[k2], anIntArray1567[i3], anIntArray1568[i2], anIntArray1568[k2], anIntArray1568[i3], anIntArray1569[i2], anIntArray1569[k2], anIntArray1569[i3], anIntArray1540[i]);
        }
    }

    public void method411(int i)
    {
        int j = Class39_Sub3_Sub4_Sub1.anInt1674;
        int k = Class39_Sub3_Sub4_Sub1.anInt1675;
        int l = 0;
        int i1 = anIntArray1531[i];
        int j1 = anIntArray1532[i];
        int k1 = anIntArray1533[i];
        int l1 = anIntArray1569[i1];
        int i2 = anIntArray1569[j1];
        int j2 = anIntArray1569[k1];
        if(l1 >= 50)
        {
            anIntArray1577[l] = anIntArray1564[i1];
            anIntArray1578[l] = anIntArray1565[i1];
            anIntArray1579[l++] = anIntArray1534[i];
        } else
        {
            int k2 = anIntArray1567[i1];
            int k3 = anIntArray1568[i1];
            int k4 = anIntArray1534[i];
            if(j2 >= 50)
            {
                int k5 = (50 - l1) * anIntArray1591[j2 - l1];
                anIntArray1577[l] = j + (k2 + ((anIntArray1567[k1] - k2) * k5 >> 16) << 9) / 50;
                anIntArray1578[l] = k + (k3 + ((anIntArray1568[k1] - k3) * k5 >> 16) << 9) / 50;
                anIntArray1579[l++] = k4 + ((anIntArray1536[i] - k4) * k5 >> 16);
            }
            if(i2 >= 50)
            {
                int l5 = (50 - l1) * anIntArray1591[i2 - l1];
                anIntArray1577[l] = j + (k2 + ((anIntArray1567[j1] - k2) * l5 >> 16) << 9) / 50;
                anIntArray1578[l] = k + (k3 + ((anIntArray1568[j1] - k3) * l5 >> 16) << 9) / 50;
                anIntArray1579[l++] = k4 + ((anIntArray1535[i] - k4) * l5 >> 16);
            }
        }
        if(i2 >= 50)
        {
            anIntArray1577[l] = anIntArray1564[j1];
            anIntArray1578[l] = anIntArray1565[j1];
            anIntArray1579[l++] = anIntArray1535[i];
        } else
        {
            int l2 = anIntArray1567[j1];
            int l3 = anIntArray1568[j1];
            int l4 = anIntArray1535[i];
            if(l1 >= 50)
            {
                int i6 = (50 - i2) * anIntArray1591[l1 - i2];
                anIntArray1577[l] = j + (l2 + ((anIntArray1567[i1] - l2) * i6 >> 16) << 9) / 50;
                anIntArray1578[l] = k + (l3 + ((anIntArray1568[i1] - l3) * i6 >> 16) << 9) / 50;
                anIntArray1579[l++] = l4 + ((anIntArray1534[i] - l4) * i6 >> 16);
            }
            if(j2 >= 50)
            {
                int j6 = (50 - i2) * anIntArray1591[j2 - i2];
                anIntArray1577[l] = j + (l2 + ((anIntArray1567[k1] - l2) * j6 >> 16) << 9) / 50;
                anIntArray1578[l] = k + (l3 + ((anIntArray1568[k1] - l3) * j6 >> 16) << 9) / 50;
                anIntArray1579[l++] = l4 + ((anIntArray1536[i] - l4) * j6 >> 16);
            }
        }
        if(j2 >= 50)
        {
            anIntArray1577[l] = anIntArray1564[k1];
            anIntArray1578[l] = anIntArray1565[k1];
            anIntArray1579[l++] = anIntArray1536[i];
        } else
        {
            int i3 = anIntArray1567[k1];
            int i4 = anIntArray1568[k1];
            int i5 = anIntArray1536[i];
            if(i2 >= 50)
            {
                int k6 = (50 - j2) * anIntArray1591[i2 - j2];
                anIntArray1577[l] = j + (i3 + ((anIntArray1567[j1] - i3) * k6 >> 16) << 9) / 50;
                anIntArray1578[l] = k + (i4 + ((anIntArray1568[j1] - i4) * k6 >> 16) << 9) / 50;
                anIntArray1579[l++] = i5 + ((anIntArray1535[i] - i5) * k6 >> 16);
            }
            if(l1 >= 50)
            {
                int l6 = (50 - j2) * anIntArray1591[l1 - j2];
                anIntArray1577[l] = j + (i3 + ((anIntArray1567[i1] - i3) * l6 >> 16) << 9) / 50;
                anIntArray1578[l] = k + (i4 + ((anIntArray1568[i1] - i4) * l6 >> 16) << 9) / 50;
                anIntArray1579[l++] = i5 + ((anIntArray1534[i] - i5) * l6 >> 16);
            }
        }
        int j3 = anIntArray1577[0];
        int j4 = anIntArray1577[1];
        int j5 = anIntArray1577[2];
        int i7 = anIntArray1578[0];
        int j7 = anIntArray1578[1];
        int k7 = anIntArray1578[2];
        if((j3 - j4) * (k7 - j7) - (i7 - j7) * (j5 - j4) > 0)
        {
            Class39_Sub3_Sub4_Sub1.aBoolean1670 = false;
            if(l == 3)
            {
                if(j3 < 0 || j4 < 0 || j5 < 0 || j3 > Class39_Sub3_Sub4.anInt1466 || j4 > Class39_Sub3_Sub4.anInt1466 || j5 > Class39_Sub3_Sub4.anInt1466)
                    Class39_Sub3_Sub4_Sub1.aBoolean1670 = true;
                int l7;
                if(anIntArray1537 == null)
                    l7 = 0;
                else
                    l7 = anIntArray1537[i] & 3;
                if(l7 == 0)
                    Class39_Sub3_Sub4_Sub1.method496(i7, j7, k7, j3, j4, j5, anIntArray1579[0], anIntArray1579[1], anIntArray1579[2]);
                else
                if(l7 == 1)
                    Class39_Sub3_Sub4_Sub1.method498(i7, j7, k7, j3, j4, j5, anIntArray1590[anIntArray1534[i]]);
                else
                if(l7 == 2)
                {
                    int j8 = anIntArray1537[i] >> 2;
                    int k9 = anIntArray1543[j8];
                    int k10 = anIntArray1544[j8];
                    int k11 = anIntArray1545[j8];
                    Class39_Sub3_Sub4_Sub1.method500(i7, j7, k7, j3, j4, j5, anIntArray1579[0], anIntArray1579[1], anIntArray1579[2], anIntArray1567[k9], anIntArray1567[k10], anIntArray1567[k11], anIntArray1568[k9], anIntArray1568[k10], anIntArray1568[k11], anIntArray1569[k9], anIntArray1569[k10], anIntArray1569[k11], anIntArray1540[i]);
                } else
                if(l7 == 3)
                {
                    int k8 = anIntArray1537[i] >> 2;
                    int l9 = anIntArray1543[k8];
                    int l10 = anIntArray1544[k8];
                    int l11 = anIntArray1545[k8];
                    Class39_Sub3_Sub4_Sub1.method500(i7, j7, k7, j3, j4, j5, anIntArray1534[i], anIntArray1534[i], anIntArray1534[i], anIntArray1567[l9], anIntArray1567[l10], anIntArray1567[l11], anIntArray1568[l9], anIntArray1568[l10], anIntArray1568[l11], anIntArray1569[l9], anIntArray1569[l10], anIntArray1569[l11], anIntArray1540[i]);
                }
            }
            if(l == 4)
            {
                if(j3 < 0 || j4 < 0 || j5 < 0 || j3 > Class39_Sub3_Sub4.anInt1466 || j4 > Class39_Sub3_Sub4.anInt1466 || j5 > Class39_Sub3_Sub4.anInt1466 || anIntArray1577[3] < 0 || anIntArray1577[3] > Class39_Sub3_Sub4.anInt1466)
                    Class39_Sub3_Sub4_Sub1.aBoolean1670 = true;
                int i8;
                if(anIntArray1537 == null)
                    i8 = 0;
                else
                    i8 = anIntArray1537[i] & 3;
                if(i8 == 0)
                {
                    Class39_Sub3_Sub4_Sub1.method496(i7, j7, k7, j3, j4, j5, anIntArray1579[0], anIntArray1579[1], anIntArray1579[2]);
                    Class39_Sub3_Sub4_Sub1.method496(i7, k7, anIntArray1578[3], j3, j5, anIntArray1577[3], anIntArray1579[0], anIntArray1579[2], anIntArray1579[3]);
                    return;
                }
                if(i8 == 1)
                {
                    int l8 = anIntArray1590[anIntArray1534[i]];
                    Class39_Sub3_Sub4_Sub1.method498(i7, j7, k7, j3, j4, j5, l8);
                    Class39_Sub3_Sub4_Sub1.method498(i7, k7, anIntArray1578[3], j3, j5, anIntArray1577[3], l8);
                    return;
                }
                if(i8 == 2)
                {
                    int i9 = anIntArray1537[i] >> 2;
                    int i10 = anIntArray1543[i9];
                    int i11 = anIntArray1544[i9];
                    int i12 = anIntArray1545[i9];
                    Class39_Sub3_Sub4_Sub1.method500(i7, j7, k7, j3, j4, j5, anIntArray1579[0], anIntArray1579[1], anIntArray1579[2], anIntArray1567[i10], anIntArray1567[i11], anIntArray1567[i12], anIntArray1568[i10], anIntArray1568[i11], anIntArray1568[i12], anIntArray1569[i10], anIntArray1569[i11], anIntArray1569[i12], anIntArray1540[i]);
                    Class39_Sub3_Sub4_Sub1.method500(i7, k7, anIntArray1578[3], j3, j5, anIntArray1577[3], anIntArray1579[0], anIntArray1579[2], anIntArray1579[3], anIntArray1567[i10], anIntArray1567[i11], anIntArray1567[i12], anIntArray1568[i10], anIntArray1568[i11], anIntArray1568[i12], anIntArray1569[i10], anIntArray1569[i11], anIntArray1569[i12], anIntArray1540[i]);
                    return;
                }
                if(i8 == 3)
                {
                    int j9 = anIntArray1537[i] >> 2;
                    int j10 = anIntArray1543[j9];
                    int j11 = anIntArray1544[j9];
                    int j12 = anIntArray1545[j9];
                    Class39_Sub3_Sub4_Sub1.method500(i7, j7, k7, j3, j4, j5, anIntArray1534[i], anIntArray1534[i], anIntArray1534[i], anIntArray1567[j10], anIntArray1567[j11], anIntArray1567[j12], anIntArray1568[j10], anIntArray1568[j11], anIntArray1568[j12], anIntArray1569[j10], anIntArray1569[j11], anIntArray1569[j12], anIntArray1540[i]);
                    Class39_Sub3_Sub4_Sub1.method500(i7, k7, anIntArray1578[3], j3, j5, anIntArray1577[3], anIntArray1534[i], anIntArray1534[i], anIntArray1534[i], anIntArray1567[j10], anIntArray1567[j11], anIntArray1567[j12], anIntArray1568[j10], anIntArray1568[j11], anIntArray1568[j12], anIntArray1569[j10], anIntArray1569[j11], anIntArray1569[j12], anIntArray1540[i]);
                }
            }
        }
    }

    public boolean method412(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
        if(j < k && j < l && j < i1)
            return false;
        if(j > k && j > l && j > i1)
            return false;
        if(i < j1 && i < k1 && i < l1)
            return false;
        return i <= j1 || i <= k1 || i <= l1;
    }

    public static boolean aBoolean1512 = true;
    public boolean aBoolean1513;
    public int anInt1514;
    public static boolean aBoolean1515;
    public boolean aBoolean1516;
    public byte aByte1517;
    public int anInt1518;
    public static int anInt1519 = 8;
    public static int anInt1520;
    public static Class39_Sub3_Sub2_Sub4 aClass39_Sub3_Sub2_Sub4_1521 = new Class39_Sub3_Sub2_Sub4(-16028);
    public static int anIntArray1522[] = new int[2000];
    public static int anIntArray1523[] = new int[2000];
    public static int anIntArray1524[] = new int[2000];
    public static int anIntArray1525[] = new int[2000];
    public int anInt1526;
    public int anIntArray1527[];
    public int anIntArray1528[];
    public int anIntArray1529[];
    public int anInt1530;
    public int anIntArray1531[];
    public int anIntArray1532[];
    public int anIntArray1533[];
    public int anIntArray1534[];
    public int anIntArray1535[];
    public int anIntArray1536[];
    public int anIntArray1537[];
    public int anIntArray1538[];
    public int anIntArray1539[];
    public int anIntArray1540[];
    public int anInt1541;
    public int anInt1542;
    public int anIntArray1543[];
    public int anIntArray1544[];
    public int anIntArray1545[];
    public int anInt1546;
    public int anInt1547;
    public int anInt1548;
    public int anInt1549;
    public int anInt1550;
    public int anInt1551;
    public int anInt1552;
    public int anInt1553;
    public int anIntArray1554[];
    public int anIntArray1555[];
    public int anIntArrayArray1556[][];
    public int anIntArrayArray1557[][];
    public boolean aBoolean1558;
    public Class18 aClass18Array1559[];
    public static Class25 aClass25Array1560[];
    public static Class21 aClass21_1561;
    public static boolean aBooleanArray1562[] = new boolean[4096];
    public static boolean aBooleanArray1563[] = new boolean[4096];
    public static int anIntArray1564[] = new int[4096];
    public static int anIntArray1565[] = new int[4096];
    public static int anIntArray1566[] = new int[4096];
    public static int anIntArray1567[] = new int[4096];
    public static int anIntArray1568[] = new int[4096];
    public static int anIntArray1569[] = new int[4096];
    public static int anIntArray1570[] = new int[1500];
    public static int anIntArrayArray1571[][] = new int[1500][512];
    public static int anIntArray1572[] = new int[12];
    public static int anIntArrayArray1573[][] = new int[12][2000];
    public static int anIntArray1574[] = new int[2000];
    public static int anIntArray1575[] = new int[2000];
    public static int anIntArray1576[] = new int[12];
    public static int anIntArray1577[] = new int[10];
    public static int anIntArray1578[] = new int[10];
    public static int anIntArray1579[] = new int[10];
    public static int anInt1580;
    public static int anInt1581;
    public static int anInt1582;
    public static boolean aBoolean1583;
    public static int anInt1584;
    public static int anInt1585;
    public static int anInt1586;
    public static int anIntArray1587[] = new int[1000];
    public static int anIntArray1588[];
    public static int anIntArray1589[];
    public static int anIntArray1590[];
    public static int anIntArray1591[];

    static 
    {
        anIntArray1588 = Class39_Sub3_Sub4_Sub1.anIntArray1678;
        anIntArray1589 = Class39_Sub3_Sub4_Sub1.anIntArray1679;
        anIntArray1590 = Class39_Sub3_Sub4_Sub1.anIntArray1690;
        anIntArray1591 = Class39_Sub3_Sub4_Sub1.anIntArray1677;
    }
}
