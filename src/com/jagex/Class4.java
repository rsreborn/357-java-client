package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class4
{

    public Class39_Sub3_Sub2_Sub4 method169(int i, int j)
    {
        if(i != -5417)
            anInt69 = 195;
        if(anIntArray108 != null && j > 1)
        {
            int k = -1;
            for(int l = 0; l < 10; l++)
                if(j >= anIntArray73[l] && anIntArray73[l] != 0)
                    k = anIntArray108[l];

            if(k != -1)
                return method174(k).method169(-5417, 1);
        }
        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4 = Class39_Sub3_Sub2_Sub4.method387(anInt78);
        if(class39_sub3_sub2_sub4 == null)
            return null;
        if(anIntArray104 != null)
        {
            for(int i1 = 0; i1 < anIntArray104.length; i1++)
                class39_sub3_sub2_sub4.method401(anIntArray104[i1], anIntArray106[i1]);

        }
        return class39_sub3_sub2_sub4;
    }

    public boolean method170(int i, int j)
    {
        int k = anInt110;
        int l = anInt75;
        int i1 = anInt98;
        if(i == 1)
        {
            k = anInt90;
            l = anInt71;
            i1 = anInt96;
        }
        if(k == -1)
            return true;
        boolean flag = true;
        if(j >= 0)
            throw new NullPointerException();
        if(!Class39_Sub3_Sub2_Sub4.method388(k))
            flag = false;
        if(l != -1 && !Class39_Sub3_Sub2_Sub4.method388(l))
            flag = false;
        if(i1 != -1 && !Class39_Sub3_Sub2_Sub4.method388(i1))
            flag = false;
        return flag;
    }

    public void method171()
    {
        anInt78 = 0;
        aString105 = null;
        aByteArray85 = null;
        anIntArray104 = null;
        anIntArray106 = null;
        anInt81 = 2000;
        anInt97 = 0;
        anInt112 = 0;
        anInt74 = 0;
        anInt100 = 0;
        anInt94 = 0;
        anInt67 = -1;
        aBoolean91 = false;
        anInt107 = 1;
        aBoolean63 = false;
        aStringArray83 = null;
        aStringArray84 = null;
        anInt110 = -1;
        anInt75 = -1;
        aByte88 = 0;
        anInt90 = -1;
        anInt71 = -1;
        aByte76 = 0;
        anInt98 = -1;
        anInt96 = -1;
        anInt109 = -1;
        anInt86 = -1;
        anInt101 = -1;
        anInt102 = -1;
        anIntArray108 = null;
        anIntArray73 = null;
        anInt66 = -1;
        anInt77 = -1;
        anInt99 = 128;
        anInt72 = 128;
        anInt82 = 128;
        anInt60 = 0;
        anInt87 = 0;
        anInt93 = 0;
    }

    public Class39_Sub3_Sub2_Sub4 method172(byte byte0, int i)
    {
        int j = anInt110;
        int k = anInt75;
        int l = anInt98;
        if(byte0 != -8)
            anInt111 = 325;
        if(i == 1)
        {
            j = anInt90;
            k = anInt71;
            l = anInt96;
        }
        if(j == -1)
            return null;
        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4 = Class39_Sub3_Sub2_Sub4.method387(j);
        if(k != -1)
            if(l != -1)
            {
                Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4_1 = Class39_Sub3_Sub2_Sub4.method387(k);
                Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4_3 = Class39_Sub3_Sub2_Sub4.method387(l);
                Class39_Sub3_Sub2_Sub4 aclass39_sub3_sub2_sub4_1[] = {
                    class39_sub3_sub2_sub4, class39_sub3_sub2_sub4_1, class39_sub3_sub2_sub4_3
                };
                class39_sub3_sub2_sub4 = new Class39_Sub3_Sub2_Sub4(183, aclass39_sub3_sub2_sub4_1, 3);
            } else
            {
                Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4_2 = Class39_Sub3_Sub2_Sub4.method387(k);
                Class39_Sub3_Sub2_Sub4 aclass39_sub3_sub2_sub4[] = {
                    class39_sub3_sub2_sub4, class39_sub3_sub2_sub4_2
                };
                class39_sub3_sub2_sub4 = new Class39_Sub3_Sub2_Sub4(183, aclass39_sub3_sub2_sub4, 2);
            }
        if(i == 0 && aByte88 != 0)
            class39_sub3_sub2_sub4.method400(0, aByte88, (byte)1, 0);
        if(i == 1 && aByte76 != 0)
            class39_sub3_sub2_sub4.method400(0, aByte76, (byte)1, 0);
        if(anIntArray104 != null)
        {
            for(int i1 = 0; i1 < anIntArray104.length; i1++)
                class39_sub3_sub2_sub4.method401(anIntArray104[i1], anIntArray106[i1]);

        }
        return class39_sub3_sub2_sub4;
    }

    public boolean method173(int i, boolean flag)
    {
        int j = anInt109;
        int k = anInt86;
        if(i == 1)
        {
            j = anInt101;
            k = anInt102;
        }
        if(j == -1)
            return true;
        boolean flag1 = true;
        if(flag)
            anInt111 = -490;
        if(!Class39_Sub3_Sub2_Sub4.method388(j))
            flag1 = false;
        if(k != -1 && !Class39_Sub3_Sub2_Sub4.method388(k))
            flag1 = false;
        return flag1;
    }

    public static Class4 method174(int i)
    {
        for(int j = 0; j < 10; j++)
            if(aClass4Array68[j].anInt89 == i)
                return aClass4Array68[j];

        anInt103 = (anInt103 + 1) % 10;
        Class4 class4 = aClass4Array68[anInt103];
        aClass39_Sub3_Sub3_62.currentOffset = anIntArray64[i];
        class4.anInt89 = i;
        class4.method171();
        class4.method180(5, aClass39_Sub3_Sub3_62);
        if(class4.anInt77 != -1)
            class4.method175(0);
        if(!aBoolean65 && class4.aBoolean63)
        {
            class4.aString105 = "Members Object";
            class4.aByteArray85 = "Login to a members' server to use this object.".getBytes();
            class4.aStringArray83 = null;
            class4.aStringArray84 = null;
            class4.anInt93 = 0;
        }
        return class4;
    }

    public void method175(int i)
    {
        Class4 class4 = method174(anInt77);
        anInt78 = class4.anInt78;
        anInt81 = class4.anInt81;
        anInt97 = class4.anInt97;
        anInt112 = class4.anInt112;
        anInt74 = class4.anInt74;
        if(i < 0 || i > 0)
            anInt79 = 461;
        anInt100 = class4.anInt100;
        anInt94 = class4.anInt94;
        anIntArray104 = class4.anIntArray104;
        anIntArray106 = class4.anIntArray106;
        Class4 class4_1 = method174(anInt66);
        aString105 = class4_1.aString105;
        aBoolean63 = class4_1.aBoolean63;
        anInt107 = class4_1.anInt107;
        String s = "a";
        char c = class4_1.aString105.charAt(0);
        if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            s = "an";
        aByteArray85 = ("Swap this note at any bank for " + s + " " + class4_1.aString105 + ".").getBytes();
        aBoolean91 = true;
    }

    public Class39_Sub3_Sub2_Sub4 method176(int i, int j)
    {
        if(i < 5 || i > 5)
            anInt80 = -192;
        int k = anInt109;
        int l = anInt86;
        if(j == 1)
        {
            k = anInt101;
            l = anInt102;
        }
        if(k == -1)
            return null;
        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4 = Class39_Sub3_Sub2_Sub4.method387(k);
        if(l != -1)
        {
            Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4_1 = Class39_Sub3_Sub2_Sub4.method387(l);
            Class39_Sub3_Sub2_Sub4 aclass39_sub3_sub2_sub4[] = {
                class39_sub3_sub2_sub4, class39_sub3_sub2_sub4_1
            };
            class39_sub3_sub2_sub4 = new Class39_Sub3_Sub2_Sub4(183, aclass39_sub3_sub2_sub4, 2);
        }
        if(anIntArray104 != null)
        {
            for(int i1 = 0; i1 < anIntArray104.length; i1++)
                class39_sub3_sub2_sub4.method401(anIntArray104[i1], anIntArray106[i1]);

        }
        return class39_sub3_sub2_sub4;
    }

    public static void method177(Class10 class10)
    {
        aClass39_Sub3_Sub3_62 = new Buffer(class10.method193("obj.dat", null));
        Buffer class39_sub3_sub3 = new Buffer(class10.method193("obj.idx", null));
        anInt92 = class39_sub3_sub3.getShort();
        anIntArray64 = new int[anInt92];
        int i = 2;
        for(int j = 0; j < anInt92; j++)
        {
            anIntArray64[j] = i;
            i += class39_sub3_sub3.getShort();
        }

        aClass4Array68 = new Class4[10];
        for(int k = 0; k < 10; k++)
            aClass4Array68[k] = new Class4();

    }

    public static Class39_Sub3_Sub4_Sub4 method178(int i, boolean flag, int j, int k)
    {
        if(j == 0)
        {
            Class39_Sub3_Sub4_Sub4 class39_sub3_sub4_sub4 = (Class39_Sub3_Sub4_Sub4)aClass35_70.method361(k);
            if(class39_sub3_sub4_sub4 != null && class39_sub3_sub4_sub4.anInt1737 != i && class39_sub3_sub4_sub4.anInt1737 != -1)
            {
                class39_sub3_sub4_sub4.method376();
                class39_sub3_sub4_sub4 = null;
            }
            if(class39_sub3_sub4_sub4 != null)
                return class39_sub3_sub4_sub4;
        }
        Class4 class4 = method174(k);
        if(class4.anIntArray108 == null)
            i = -1;
        if(i > 1)
        {
            int l = -1;
            for(int i1 = 0; i1 < 10; i1++)
                if(i >= class4.anIntArray73[i1] && class4.anIntArray73[i1] != 0)
                    l = class4.anIntArray108[i1];

            if(l != -1)
                class4 = method174(l);
        }
        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4 = class4.method179(1);
        if(class39_sub3_sub2_sub4 == null)
            return null;
        Class39_Sub3_Sub4_Sub4 class39_sub3_sub4_sub4_2 = null;
        if(class4.anInt77 != -1)
        {
            class39_sub3_sub4_sub4_2 = method178(10, false, -1, class4.anInt66);
            if(class39_sub3_sub4_sub4_2 == null)
                return null;
        }
        Class39_Sub3_Sub4_Sub4 class39_sub3_sub4_sub4_1 = new Class39_Sub3_Sub4_Sub4(32, 32);
        int j1 = Class39_Sub3_Sub4_Sub1.anInt1674;
        int k1 = Class39_Sub3_Sub4_Sub1.anInt1675;
        int ai[] = Class39_Sub3_Sub4_Sub1.anIntArray1680;
        int ai1[] = Class39_Sub3_Sub4.anIntArray1459;
        int l1 = Class39_Sub3_Sub4.anInt1460;
        int i2 = Class39_Sub3_Sub4.anInt1461;
        int j2 = Class39_Sub3_Sub4.anInt1464;
        int k2 = Class39_Sub3_Sub4.anInt1465;
        int l2 = Class39_Sub3_Sub4.anInt1462;
        int i3 = Class39_Sub3_Sub4.anInt1463;
        Class39_Sub3_Sub4_Sub1.aBoolean1672 = false;
        Class39_Sub3_Sub4.method473(false, class39_sub3_sub4_sub4_1.anIntArray1731, 32, 32);
        Class39_Sub3_Sub4.method478((byte)4, 0, 0, 0, 32, 32);
        Class39_Sub3_Sub4_Sub1.method486(anInt95);
        int j3 = class4.anInt81;
        if(j == -1)
            j3 = (int)((double)j3 * 1.5D);
        if(j > 0)
            j3 = (int)((double)j3 * 1.04D);
        int k3 = Class39_Sub3_Sub4_Sub1.anIntArray1678[class4.anInt97] * j3 >> 16;
        int l3 = Class39_Sub3_Sub4_Sub1.anIntArray1679[class4.anInt97] * j3 >> 16;
        class39_sub3_sub2_sub4.method408(0, class4.anInt112, class4.anInt74, class4.anInt97, class4.anInt100, k3 + ((Class39_Sub3_Sub2) (class39_sub3_sub2_sub4)).anInt1431 / 2 + class4.anInt94, l3 + class4.anInt94);
        for(int l4 = 31; l4 >= 0; l4--)
        {
            for(int i4 = 31; i4 >= 0; i4--)
                if(class39_sub3_sub4_sub4_1.anIntArray1731[l4 + i4 * 32] == 0)
                    if(l4 > 0 && class39_sub3_sub4_sub4_1.anIntArray1731[(l4 - 1) + i4 * 32] > 1)
                        class39_sub3_sub4_sub4_1.anIntArray1731[l4 + i4 * 32] = 1;
                    else
                    if(i4 > 0 && class39_sub3_sub4_sub4_1.anIntArray1731[l4 + (i4 - 1) * 32] > 1)
                        class39_sub3_sub4_sub4_1.anIntArray1731[l4 + i4 * 32] = 1;
                    else
                    if(l4 < 31 && class39_sub3_sub4_sub4_1.anIntArray1731[l4 + 1 + i4 * 32] > 1)
                        class39_sub3_sub4_sub4_1.anIntArray1731[l4 + i4 * 32] = 1;
                    else
                    if(i4 < 31 && class39_sub3_sub4_sub4_1.anIntArray1731[l4 + (i4 + 1) * 32] > 1)
                        class39_sub3_sub4_sub4_1.anIntArray1731[l4 + i4 * 32] = 1;

        }

        if(j > 0)
        {
            for(int i5 = 31; i5 >= 0; i5--)
            {
                for(int j4 = 31; j4 >= 0; j4--)
                    if(class39_sub3_sub4_sub4_1.anIntArray1731[i5 + j4 * 32] == 0)
                        if(i5 > 0 && class39_sub3_sub4_sub4_1.anIntArray1731[(i5 - 1) + j4 * 32] == 1)
                            class39_sub3_sub4_sub4_1.anIntArray1731[i5 + j4 * 32] = j;
                        else
                        if(j4 > 0 && class39_sub3_sub4_sub4_1.anIntArray1731[i5 + (j4 - 1) * 32] == 1)
                            class39_sub3_sub4_sub4_1.anIntArray1731[i5 + j4 * 32] = j;
                        else
                        if(i5 < 31 && class39_sub3_sub4_sub4_1.anIntArray1731[i5 + 1 + j4 * 32] == 1)
                            class39_sub3_sub4_sub4_1.anIntArray1731[i5 + j4 * 32] = j;
                        else
                        if(j4 < 31 && class39_sub3_sub4_sub4_1.anIntArray1731[i5 + (j4 + 1) * 32] == 1)
                            class39_sub3_sub4_sub4_1.anIntArray1731[i5 + j4 * 32] = j;

            }

        } else
        if(j == 0)
        {
            for(int j5 = 31; j5 >= 0; j5--)
            {
                for(int k4 = 31; k4 >= 0; k4--)
                    if(class39_sub3_sub4_sub4_1.anIntArray1731[j5 + k4 * 32] == 0 && j5 > 0 && k4 > 0 && class39_sub3_sub4_sub4_1.anIntArray1731[(j5 - 1) + (k4 - 1) * 32] > 0)
                        class39_sub3_sub4_sub4_1.anIntArray1731[j5 + k4 * 32] = 0x302020;

            }

        }
        if(class4.anInt77 != -1)
        {
            int k5 = class39_sub3_sub4_sub4_2.anInt1736;
            int l5 = class39_sub3_sub4_sub4_2.anInt1737;
            class39_sub3_sub4_sub4_2.anInt1736 = 32;
            class39_sub3_sub4_sub4_2.anInt1737 = 32;
            class39_sub3_sub4_sub4_2.method530(0, 22912, 0);
            class39_sub3_sub4_sub4_2.anInt1736 = k5;
            class39_sub3_sub4_sub4_2.anInt1737 = l5;
        }
        if(j == 0)
            aClass35_70.method362(k, class39_sub3_sub4_sub4_1, -501);
        Class39_Sub3_Sub4.method473(false, ai1, l1, i2);
        if(flag)
            throw new NullPointerException();
        Class39_Sub3_Sub4.method475(j2, (byte)-98, i3, k2, l2);
        Class39_Sub3_Sub4_Sub1.anInt1674 = j1;
        Class39_Sub3_Sub4_Sub1.anInt1675 = k1;
        Class39_Sub3_Sub4_Sub1.anIntArray1680 = ai;
        Class39_Sub3_Sub4_Sub1.aBoolean1672 = true;
        if(class4.aBoolean91)
            class39_sub3_sub4_sub4_1.anInt1736 = 33;
        else
            class39_sub3_sub4_sub4_1.anInt1736 = 32;
        class39_sub3_sub4_sub4_1.anInt1737 = i;
        return class39_sub3_sub4_sub4_1;
    }

    public Class39_Sub3_Sub2_Sub4 method179(int i)
    {
        if(anIntArray108 != null && i > 1)
        {
            int j = -1;
            for(int k = 0; k < 10; k++)
                if(i >= anIntArray73[k] && anIntArray73[k] != 0)
                    j = anIntArray108[k];

            if(j != -1)
                return method174(j).method179(1);
        }
        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4 = (Class39_Sub3_Sub2_Sub4)aClass35_61.method361(anInt89);
        if(class39_sub3_sub2_sub4 != null)
            return class39_sub3_sub2_sub4;
        class39_sub3_sub2_sub4 = Class39_Sub3_Sub2_Sub4.method387(anInt78);
        if(class39_sub3_sub2_sub4 == null)
            return null;
        if(anInt99 != 128 || anInt72 != 128 || anInt82 != 128)
            class39_sub3_sub2_sub4.method403(anInt82, true, anInt99, anInt72);
        if(anIntArray104 != null)
        {
            for(int l = 0; l < anIntArray104.length; l++)
                class39_sub3_sub2_sub4.method401(anIntArray104[l], anIntArray106[l]);

        }
        class39_sub3_sub2_sub4.method404(64 + anInt60, 768 + anInt87, -50, -10, -50, true);
        class39_sub3_sub2_sub4.aBoolean1558 = true;
        aClass35_61.method362(anInt89, class39_sub3_sub2_sub4, -501);
        return class39_sub3_sub2_sub4;
    }

    public void method180(int i, Buffer class39_sub3_sub3)
    {
        if(i != 5)
            throw new NullPointerException();
        do
        {
            int j = class39_sub3_sub3.getUnsignedByte();
            if(j == 0)
                return;
            if(j == 1)
                anInt78 = class39_sub3_sub3.getShort();
            else
            if(j == 2)
                aString105 = class39_sub3_sub3.getRs2String();
            else
            if(j == 3)
                aByteArray85 = class39_sub3_sub3.getRs2StringBytes();
            else
            if(j == 4)
                anInt81 = class39_sub3_sub3.getShort();
            else
            if(j == 5)
                anInt97 = class39_sub3_sub3.getShort();
            else
            if(j == 6)
                anInt112 = class39_sub3_sub3.getShort();
            else
            if(j == 7)
            {
                anInt100 = class39_sub3_sub3.getShort();
                if(anInt100 > 32767)
                    anInt100 -= 0x10000;
            } else
            if(j == 8)
            {
                anInt94 = class39_sub3_sub3.getShort();
                if(anInt94 > 32767)
                    anInt94 -= 0x10000;
            } else
            if(j == 10)
                anInt67 = class39_sub3_sub3.getShort();
            else
            if(j == 11)
                aBoolean91 = true;
            else
            if(j == 12)
                anInt107 = class39_sub3_sub3.readIntBE();
            else
            if(j == 16)
                aBoolean63 = true;
            else
            if(j == 23)
            {
                anInt110 = class39_sub3_sub3.getShort();
                aByte88 = class39_sub3_sub3.getByte();
            } else
            if(j == 24)
                anInt75 = class39_sub3_sub3.getShort();
            else
            if(j == 25)
            {
                anInt90 = class39_sub3_sub3.getShort();
                aByte76 = class39_sub3_sub3.getByte();
            } else
            if(j == 26)
                anInt71 = class39_sub3_sub3.getShort();
            else
            if(j >= 30 && j < 35)
            {
                if(aStringArray83 == null)
                    aStringArray83 = new String[5];
                aStringArray83[j - 30] = class39_sub3_sub3.getRs2String();
                if(aStringArray83[j - 30].equalsIgnoreCase("hidden"))
                    aStringArray83[j - 30] = null;
            } else
            if(j >= 35 && j < 40)
            {
                if(aStringArray84 == null)
                    aStringArray84 = new String[5];
                aStringArray84[j - 35] = class39_sub3_sub3.getRs2String();
            } else
            if(j == 40)
            {
                int k = class39_sub3_sub3.getUnsignedByte();
                anIntArray104 = new int[k];
                anIntArray106 = new int[k];
                for(int l = 0; l < k; l++)
                {
                    anIntArray104[l] = class39_sub3_sub3.getShort();
                    anIntArray106[l] = class39_sub3_sub3.getShort();
                }

            } else
            if(j == 78)
                anInt98 = class39_sub3_sub3.getShort();
            else
            if(j == 79)
                anInt96 = class39_sub3_sub3.getShort();
            else
            if(j == 90)
                anInt109 = class39_sub3_sub3.getShort();
            else
            if(j == 91)
                anInt101 = class39_sub3_sub3.getShort();
            else
            if(j == 92)
                anInt86 = class39_sub3_sub3.getShort();
            else
            if(j == 93)
                anInt102 = class39_sub3_sub3.getShort();
            else
            if(j == 95)
                anInt74 = class39_sub3_sub3.getShort();
            else
            if(j == 97)
                anInt66 = class39_sub3_sub3.getShort();
            else
            if(j == 98)
                anInt77 = class39_sub3_sub3.getShort();
            else
            if(j >= 100 && j < 110)
            {
                if(anIntArray108 == null)
                {
                    anIntArray108 = new int[10];
                    anIntArray73 = new int[10];
                }
                anIntArray108[j - 100] = class39_sub3_sub3.getShort();
                anIntArray73[j - 100] = class39_sub3_sub3.getShort();
            } else
            if(j == 110)
                anInt99 = class39_sub3_sub3.getShort();
            else
            if(j == 111)
                anInt72 = class39_sub3_sub3.getShort();
            else
            if(j == 112)
                anInt82 = class39_sub3_sub3.getShort();
            else
            if(j == 113)
                anInt60 = class39_sub3_sub3.getByte();
            else
            if(j == 114)
                anInt87 = class39_sub3_sub3.getByte() * 5;
            else
            if(j == 115)
                anInt93 = class39_sub3_sub3.getUnsignedByte();
        } while(true);
    }

    public static void method181(int i)
    {
        if(i != -29497)
        {
            return;
        } else
        {
            aClass35_61 = null;
            aClass35_70 = null;
            anIntArray64 = null;
            aClass4Array68 = null;
            aClass39_Sub3_Sub3_62 = null;
            return;
        }
    }

    public Class4()
    {
        anInt69 = 639;
        anInt79 = 3;
        anInt80 = -124;
        anInt89 = -1;
        anInt111 = 9;
    }

    public int anInt60;
    public static Class35 aClass35_61 = new Class35(50, 5);
    public static Buffer aClass39_Sub3_Sub3_62;
    public boolean aBoolean63;
    public static int anIntArray64[];
    public static boolean aBoolean65 = true;
    public int anInt66;
    public int anInt67;
    public static Class4 aClass4Array68[];
    public int anInt69;
    public static Class35 aClass35_70 = new Class35(100, 5);
    public int anInt71;
    public int anInt72;
    public int anIntArray73[];
    public int anInt74;
    public int anInt75;
    public byte aByte76;
    public int anInt77;
    public int anInt78;
    public int anInt79;
    public int anInt80;
    public int anInt81;
    public int anInt82;
    public String aStringArray83[];
    public String aStringArray84[];
    public byte aByteArray85[];
    public int anInt86;
    public int anInt87;
    public byte aByte88;
    public int anInt89;
    public int anInt90;
    public boolean aBoolean91;
    public static int anInt92;
    public int anInt93;
    public int anInt94;
    public static int anInt95 = 3;
    public int anInt96;
    public int anInt97;
    public int anInt98;
    public int anInt99;
    public int anInt100;
    public int anInt101;
    public int anInt102;
    public static int anInt103;
    public int anIntArray104[];
    public String aString105;
    public int anIntArray106[];
    public int anInt107;
    public int anIntArray108[];
    public int anInt109;
    public int anInt110;
    public int anInt111;
    public int anInt112;

}
