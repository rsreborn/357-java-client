package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class RSInterface
{

    public static void method351(Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4, int i, int j, boolean flag)
    {
        if(flag)
        {
            for(int k = 1; k > 0; k++);
        }
        aClass35_604.method363();
        if(class39_sub3_sub2_sub4 != null && j != 4)
            aClass35_604.method362((j << 16) + i, class39_sub3_sub2_sub4, -501);
    }

    public static Class39_Sub3_Sub4_Sub4 method352(String s, boolean flag, int i)
    {
        long l = (Class37.method370(s, 0) << 8) + (long)i;
        Class39_Sub3_Sub4_Sub4 class39_sub3_sub4_sub4 = (Class39_Sub3_Sub4_Sub4)aClass35_644.method361(l);
        if(!flag)
            throw new NullPointerException();
        if(class39_sub3_sub4_sub4 != null)
            return class39_sub3_sub4_sub4;
        if(aClass10_643 == null)
            return null;
        try
        {
            class39_sub3_sub4_sub4 = new Class39_Sub3_Sub4_Sub4(aClass10_643, s, i);
            aClass35_644.method362(l, class39_sub3_sub4_sub4, -501);
        }
        catch(Exception _ex)
        {
            return null;
        }
        return class39_sub3_sub4_sub4;
    }

    public Class39_Sub3_Sub2_Sub4 method353(int i, int j)
    {
        Class4 class4 = null;
        if(i == 4)
        {
            class4 = Class4.method174(j);
            anInt598 += class4.anInt60;
            anInt593 += class4.anInt87;
        }
        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4 = (Class39_Sub3_Sub2_Sub4)aClass35_604.method361((i << 16) + j);
        if(class39_sub3_sub2_sub4 != null)
            return class39_sub3_sub2_sub4;
        if(i == 1)
            class39_sub3_sub2_sub4 = Class39_Sub3_Sub2_Sub4.method387(j);
        if(i == 2)
            class39_sub3_sub2_sub4 = NpcConfig.getDefinition(j).method600(anInt633);
        if(i == 3)
            class39_sub3_sub2_sub4 = Game.myPlayer.method420(0);
        if(i == 4)
            class39_sub3_sub2_sub4 = class4.method169(-5417, 50);
        if(i == 5)
            class39_sub3_sub2_sub4 = null;
        if(class39_sub3_sub2_sub4 != null)
            aClass35_604.method362((i << 16) + j, class39_sub3_sub2_sub4, -501);
        return class39_sub3_sub2_sub4;
    }

    public static RSInterface method354(int i, int j, Buffer class39_sub3_sub3, boolean flag)
    {
        RSInterface class34 = new RSInterface();
        class34.anInt620 = i;
        class34.parentId = j;
        class34.anInt638 = class39_sub3_sub3.readUByte();
        class34.anInt621 = class39_sub3_sub3.readUByte();
        class34.anInt632 = class39_sub3_sub3.readUShortBE();
        class34.anInt595 = class39_sub3_sub3.readUShortBE();
        class34.anInt610 = class39_sub3_sub3.readUShortBE();
        if(flag)
        {
            for(int k = 1; k > 0; k++);
        }
        class34.aByte646 = (byte)class39_sub3_sub3.readUByte();
        class34.anInt614 = class39_sub3_sub3.readUByte();
        if(class34.anInt614 != 0)
            class34.anInt614 = (class34.anInt614 - 1 << 8) + class39_sub3_sub3.readUByte();
        else
            class34.anInt614 = -1;
        if(class34.anInt632 == 600)
            anInt616 = j;
        if(class34.anInt632 == 650)
            anInt648 = j;
        if(class34.anInt632 == 655)
            anInt608 = j;
        int l = class39_sub3_sub3.readUByte();
        if(l > 0)
        {
            class34.anIntArray651 = new int[l];
            class34.anIntArray645 = new int[l];
            for(int i1 = 0; i1 < l; i1++)
            {
                class34.anIntArray651[i1] = class39_sub3_sub3.readUByte();
                class34.anIntArray645[i1] = class39_sub3_sub3.readUShortBE();
            }

        }
        int j1 = class39_sub3_sub3.readUByte();
        if(j1 > 0)
        {
            class34.anIntArrayArray654 = new int[j1][];
            for(int k1 = 0; k1 < j1; k1++)
            {
                int l2 = class39_sub3_sub3.readUShortBE();
                class34.anIntArrayArray654[k1] = new int[l2];
                for(int k4 = 0; k4 < l2; k4++)
                    class34.anIntArrayArray654[k1][k4] = class39_sub3_sub3.readUShortBE();

            }

        }
        if(class34.anInt638 == 0)
        {
            class34.anInt607 = class39_sub3_sub3.readUShortBE();
            class34.aBoolean613 = class39_sub3_sub3.readUByte() == 1;
            int l1 = class39_sub3_sub3.readUShortBE();
            class34.anIntArray650 = new int[l1];
            class34.anIntArray582 = new int[l1];
            class34.anIntArray647 = new int[l1];
            for(int i3 = 0; i3 < l1; i3++)
            {
                class34.anIntArray650[i3] = class39_sub3_sub3.readUShortBE();
                class34.anIntArray582[i3] = class39_sub3_sub3.readShortBE();
                class34.anIntArray647[i3] = class39_sub3_sub3.readShortBE();
            }

        }
        if(class34.anInt638 == 1)
        {
            class34.anInt584 = class39_sub3_sub3.readUShortBE();
            class34.aBoolean596 = class39_sub3_sub3.readUByte() == 1;
        }
        if(class34.anInt638 == 2)
        {
            class34.anIntArray612 = new int[class34.anInt595 * class34.anInt610];
            class34.anIntArray603 = new int[class34.anInt595 * class34.anInt610];
            class34.aBoolean580 = class39_sub3_sub3.readUByte() == 1;
            class34.aBoolean639 = class39_sub3_sub3.readUByte() == 1;
            class34.aBoolean581 = class39_sub3_sub3.readUByte() == 1;
            class34.aBoolean623 = class39_sub3_sub3.readUByte() == 1;
            class34.anInt615 = class39_sub3_sub3.readUByte();
            class34.anInt627 = class39_sub3_sub3.readUByte();
            class34.anIntArray583 = new int[20];
            class34.anIntArray577 = new int[20];
            class34.aClass39_Sub3_Sub4_Sub4Array592 = new Class39_Sub3_Sub4_Sub4[20];
            for(int i2 = 0; i2 < 20; i2++)
            {
                int j3 = class39_sub3_sub3.readUByte();
                if(j3 == 1)
                {
                    class34.anIntArray583[i2] = class39_sub3_sub3.readShortBE();
                    class34.anIntArray577[i2] = class39_sub3_sub3.readShortBE();
                    String s1 = class39_sub3_sub3.readString();
                    if(s1.length() > 0)
                    {
                        int l4 = s1.lastIndexOf(",");
                        class34.aClass39_Sub3_Sub4_Sub4Array592[i2] = method352(s1.substring(0, l4), true, Integer.parseInt(s1.substring(l4 + 1)));
                    }
                }
            }

            class34.aStringArray630 = new String[5];
            for(int k3 = 0; k3 < 5; k3++)
            {
                class34.aStringArray630[k3] = class39_sub3_sub3.readString();
                if(class34.aStringArray630[k3].length() == 0)
                    class34.aStringArray630[k3] = null;
            }

        }
        if(class34.anInt638 == 3)
            class34.aBoolean642 = class39_sub3_sub3.readUByte() == 1;
        if(class34.anInt638 == 4 || class34.anInt638 == 1)
        {
            class34.aBoolean653 = class39_sub3_sub3.readUByte() == 1;
            int j2 = class39_sub3_sub3.readUByte();
            if(aClass39_Sub3_Sub4_Sub2Array599 != null)
                class34.aClass39_Sub3_Sub4_Sub2_640 = aClass39_Sub3_Sub4_Sub2Array599[j2];
            class34.aBoolean628 = class39_sub3_sub3.readUByte() == 1;
        }
        if(class34.anInt638 == 4)
        {
            class34.message = class39_sub3_sub3.readString();
            class34.aString601 = class39_sub3_sub3.readString();
        }
        if(class34.anInt638 == 1 || class34.anInt638 == 3 || class34.anInt638 == 4)
            class34.anInt594 = class39_sub3_sub3.readIntBE();
        if(class34.anInt638 == 3 || class34.anInt638 == 4)
        {
            class34.anInt579 = class39_sub3_sub3.readIntBE();
            class34.anInt605 = class39_sub3_sub3.readIntBE();
            class34.anInt622 = class39_sub3_sub3.readIntBE();
        }
        if(class34.anInt638 == 5)
        {
            String s = class39_sub3_sub3.readString();
            if(s.length() > 0)
            {
                int l3 = s.lastIndexOf(",");
                class34.aClass39_Sub3_Sub4_Sub4_626 = method352(s.substring(0, l3), true, Integer.parseInt(s.substring(l3 + 1)));
            }
            s = class39_sub3_sub3.readString();
            if(s.length() > 0)
            {
                int i4 = s.lastIndexOf(",");
                class34.aClass39_Sub3_Sub4_Sub4_585 = method352(s.substring(0, i4), true, Integer.parseInt(s.substring(i4 + 1)));
            }
        }
        if(class34.anInt638 == 6)
        {
            i = class39_sub3_sub3.readUByte();
            if(i != 0)
            {
                class34.anInt636 = 1;
                class34.anInt637 = (i - 1 << 8) + class39_sub3_sub3.readUByte();
            }
            i = class39_sub3_sub3.readUByte();
            if(i != 0)
            {
                class34.anInt624 = 1;
                class34.anInt625 = (i - 1 << 8) + class39_sub3_sub3.readUByte();
            }
            i = class39_sub3_sub3.readUByte();
            if(i != 0)
                class34.anInt589 = (i - 1 << 8) + class39_sub3_sub3.readUByte();
            else
                class34.anInt589 = -1;
            i = class39_sub3_sub3.readUByte();
            if(i != 0)
                class34.anInt590 = (i - 1 << 8) + class39_sub3_sub3.readUByte();
            else
                class34.anInt590 = -1;
            class34.anInt617 = class39_sub3_sub3.readUShortBE();
            class34.anInt618 = class39_sub3_sub3.readUShortBE();
            class34.anInt619 = class39_sub3_sub3.readUShortBE();
        }
        if(class34.anInt638 == 7)
        {
            class34.anIntArray612 = new int[class34.anInt595 * class34.anInt610];
            class34.anIntArray603 = new int[class34.anInt595 * class34.anInt610];
            class34.aBoolean653 = class39_sub3_sub3.readUByte() == 1;
            int k2 = class39_sub3_sub3.readUByte();
            if(aClass39_Sub3_Sub4_Sub2Array599 != null)
                class34.aClass39_Sub3_Sub4_Sub2_640 = aClass39_Sub3_Sub4_Sub2Array599[k2];
            class34.aBoolean628 = class39_sub3_sub3.readUByte() == 1;
            class34.anInt594 = class39_sub3_sub3.readIntBE();
            class34.anInt615 = class39_sub3_sub3.readShortBE();
            class34.anInt627 = class39_sub3_sub3.readShortBE();
            class34.aBoolean639 = class39_sub3_sub3.readUByte() == 1;
            class34.aStringArray630 = new String[5];
            for(int j4 = 0; j4 < 5; j4++)
            {
                class34.aStringArray630[j4] = class39_sub3_sub3.readString();
                if(class34.aStringArray630[j4].length() == 0)
                    class34.aStringArray630[j4] = null;
            }

        }
        if(class34.anInt638 == 8)
            class34.message = class39_sub3_sub3.readString();
        if(class34.anInt621 == 2 || class34.anInt638 == 2)
        {
            class34.aString611 = class39_sub3_sub3.readString();
            class34.aString591 = class39_sub3_sub3.readString();
            class34.anInt629 = class39_sub3_sub3.readUShortBE();
        }
        if(class34.anInt621 == 1 || class34.anInt621 == 4 || class34.anInt621 == 5 || class34.anInt621 == 6)
        {
            class34.aString634 = class39_sub3_sub3.readString();
            if(class34.aString634.length() == 0)
            {
                if(class34.anInt621 == 1)
                    class34.aString634 = "Ok";
                if(class34.anInt621 == 4)
                    class34.aString634 = "Select";
                if(class34.anInt621 == 5)
                    class34.aString634 = "Select";
                if(class34.anInt621 == 6)
                    class34.aString634 = "Continue";
            }
        }
        return class34;
    }

    public void method355(int i, int j, boolean flag)
    {
        int k = anIntArray612[j];
        anIntArray612[j] = anIntArray612[i];
        anIntArray612[i] = k;
        k = anIntArray603[j];
        if(flag)
            aBoolean588 = !aBoolean588;
        anIntArray603[j] = anIntArray603[i];
        anIntArray603[i] = k;
    }

    public static RSInterface getInterface(int i)
    {
        if(aClass34Array652[i] == null)
        {
            Buffer class39_sub3_sub3 = new Buffer(aByteArrayArray600[i]);
            int j = class39_sub3_sub3.readUShortBE();
            aClass34Array652[i] = method354(i, j, class39_sub3_sub3, aBoolean597);
        }
        return aClass34Array652[i];
    }

    public static void method357(byte byte0, int i)
    {
        if(i == -1)
            return;
        for(int j = 0; j < aClass34Array652.length; j++)
            if(aClass34Array652[j] != null && aClass34Array652[j].parentId == i && aClass34Array652[j].anInt638 != 2)
                aClass34Array652[j] = null;

        if(byte0 == 6);
    }

    public static void method358(int i)
    {
        aClass34Array652 = null;
        aClass10_643 = null;
        aClass35_644 = null;
        aClass39_Sub3_Sub4_Sub2Array599 = null;
        aByteArrayArray600 = null;
        if(i == -29497);
    }

    public static void method359(byte byte0, Class10 class10, Class39_Sub3_Sub4_Sub2 aclass39_sub3_sub4_sub2[], Class10 class10_1)
    {
        aClass35_644 = new Class35(50000, 5);
        aClass10_643 = class10;
        aClass39_Sub3_Sub4_Sub2Array599 = aclass39_sub3_sub4_sub2;
        int i = -1;
        Buffer class39_sub3_sub3 = new Buffer(class10_1.method193("data", null));
        int j = class39_sub3_sub3.readUShortBE();
        if(byte0 == 0)
            byte0 = 0;
        else
            return;
        aClass34Array652 = new RSInterface[j];
        aByteArrayArray600 = new byte[j][];
        while(class39_sub3_sub3.position < class39_sub3_sub3.payload.length)
        {
            int k = class39_sub3_sub3.readUShortBE();
            if(k == 65535)
            {
                i = class39_sub3_sub3.readUShortBE();
                k = class39_sub3_sub3.readUShortBE();
            }
            int l = class39_sub3_sub3.position;
            RSInterface class34 = method354(k, i, class39_sub3_sub3, aBoolean597);
            byte abyte0[] = aByteArrayArray600[class34.anInt620] = new byte[(class39_sub3_sub3.position - l) + 2];
            for(int i1 = l; i1 < class39_sub3_sub3.position; i1++)
                abyte0[(i1 - l) + 2] = class39_sub3_sub3.payload[i1];

            abyte0[0] = (byte)(i >> 8);
            abyte0[1] = (byte)i;
        }
        aClass10_643 = null;
    }

    public Class39_Sub3_Sub2_Sub4 method360(int i, int j, int k, boolean flag)
    {
        anInt598 = 64;
        if(k != anInt641)
            aBoolean578 = !aBoolean578;
        anInt593 = 768;
        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4;
        if(flag)
            class39_sub3_sub2_sub4 = method353(anInt624, anInt625);
        else
            class39_sub3_sub2_sub4 = method353(anInt636, anInt637);
        if(class39_sub3_sub2_sub4 == null)
            return null;
        if(j == -1 && i == -1 && class39_sub3_sub2_sub4.anIntArray1540 == null)
            return class39_sub3_sub2_sub4;
        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4_1 = new Class39_Sub3_Sub2_Sub4(Class33.method350((byte)9, j) & Class33.method350((byte)9, i), true, true, class39_sub3_sub2_sub4, false);
        if(j != -1 || i != -1)
            class39_sub3_sub2_sub4_1.method394(false);
        if(j != -1)
            class39_sub3_sub2_sub4_1.method395(j, 0);
        if(i != -1)
            class39_sub3_sub2_sub4_1.method395(i, 0);
        class39_sub3_sub2_sub4_1.method404(anInt598, anInt593, -50, -10, -50, true);
        return class39_sub3_sub2_sub4_1;
    }

    public RSInterface()
    {
        aBoolean578 = true;
        aBoolean588 = false;
        anInt641 = 8;
    }

    public int anIntArray577[];
    public boolean aBoolean578;
    public int anInt579;
    public boolean aBoolean580;
    public boolean aBoolean581;
    public int anIntArray582[];
    public int anIntArray583[];
    public int anInt584;
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4_585;
    public int anInt586;
    public int anInt587;
    public boolean aBoolean588;
    public int anInt589;
    public int anInt590;
    public String aString591;
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4Array592[];
    public static int anInt593;
    public int anInt594;
    public int anInt595;
    public boolean aBoolean596;
    public static boolean aBoolean597;
    public static int anInt598;
    public static Class39_Sub3_Sub4_Sub2 aClass39_Sub3_Sub4_Sub2Array599[];
    public static byte aByteArrayArray600[][];
    public String aString601;
    public String message;
    public int anIntArray603[];
    public static Class35 aClass35_604 = new Class35(30, 5);
    public int anInt605;
    public int parentId;
    public int anInt607;
    public static int anInt608 = -1;
    public int anInt609;
    public int anInt610;
    public String aString611;
    public int anIntArray612[];
    public boolean aBoolean613;
    public int anInt614;
    public int anInt615;
    public static int anInt616 = -1;
    public int anInt617;
    public int anInt618;
    public int anInt619;
    public int anInt620;
    public int anInt621;
    public int anInt622;
    public boolean aBoolean623;
    public int anInt624;
    public int anInt625;
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4_626;
    public int anInt627;
    public boolean aBoolean628;
    public int anInt629;
    public String aStringArray630[];
    public int anInt631;
    public int anInt632;
    public int anInt633;
    public String aString634;
    public int anInt635;
    public int anInt636;
    public int anInt637;
    public int anInt638;
    public boolean aBoolean639;
    public Class39_Sub3_Sub4_Sub2 aClass39_Sub3_Sub4_Sub2_640;
    public int anInt641;
    public boolean aBoolean642;
    public static Class10 aClass10_643;
    public static Class35 aClass35_644;
    public int anIntArray645[];
    public byte aByte646;
    public int anIntArray647[];
    public static int anInt648 = -1;
    public int anInt649;
    public int anIntArray650[];
    public int anIntArray651[];
    public static RSInterface aClass34Array652[];
    public boolean aBoolean653;
    public int anIntArrayArray654[][];

}
