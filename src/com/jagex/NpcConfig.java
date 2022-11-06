package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class NpcConfig
{

    public NpcConfig method593(int i)
    {
        if(i != 0)
        {
            for(int j = 1; j > 0; j++);
        }
        int k = -1;
        if(anInt798 != -1)
        {
            Class6 class6 = Class6.aClass6Array122[anInt798];
            int l = class6.anInt124;
            int i1 = class6.anInt125;
            int j1 = class6.anInt126;
            int k1 = Game.anIntArray880[j1 - i1];
            k = aGame815.anIntArray943[l] >> i1 & k1;
        } else
        if(anInt784 != -1)
            k = aGame815.anIntArray943[anInt784];
        if(k < 0 || k >= anIntArray785.length || anIntArray785[k] == -1)
            return null;
        else
            return getDefinition(anIntArray785[k]);
    }

    public void method594(int i, Buffer class39_sub3_sub3)
    {
        if(i != 5)
        {
            for(int j = 1; j > 0; j++);
        }
        do
        {
            int k = class39_sub3_sub3.readUByte();
            if(k == 0)
                return;
            if(k == 1)
            {
                int l = class39_sub3_sub3.readUByte();
                anIntArray806 = new int[l];
                for(int l1 = 0; l1 < l; l1++)
                    anIntArray806[l1] = class39_sub3_sub3.readShort();

            } else
            if(k == 2)
                aString821 = class39_sub3_sub3.readString();
            else
            if(k == 3)
                aByteArray789 = class39_sub3_sub3.getRs2StringBytes();
            else
            if(k == 12)
                aByte820 = class39_sub3_sub3.getByte();
            else
            if(k == 13)
                anInt817 = class39_sub3_sub3.readShort();
            else
            if(k == 14)
                anInt813 = class39_sub3_sub3.readShort();
            else
            if(k == 17)
            {
                anInt813 = class39_sub3_sub3.readShort();
                anInt787 = class39_sub3_sub3.readShort();
                anInt811 = class39_sub3_sub3.readShort();
                anInt807 = class39_sub3_sub3.readShort();
            } else
            if(k >= 30 && k < 40)
            {
                if(aStringArray790 == null)
                    aStringArray790 = new String[5];
                aStringArray790[k - 30] = class39_sub3_sub3.readString();
                if(aStringArray790[k - 30].equalsIgnoreCase("hidden"))
                    aStringArray790[k - 30] = null;
            } else
            if(k == 40)
            {
                int i1 = class39_sub3_sub3.readUByte();
                anIntArray804 = new int[i1];
                anIntArray802 = new int[i1];
                for(int i2 = 0; i2 < i1; i2++)
                {
                    anIntArray804[i2] = class39_sub3_sub3.readShort();
                    anIntArray802[i2] = class39_sub3_sub3.readShort();
                }

            } else
            if(k == 60)
            {
                int j1 = class39_sub3_sub3.readUByte();
                anIntArray809 = new int[j1];
                for(int j2 = 0; j2 < j1; j2++)
                    anIntArray809[j2] = class39_sub3_sub3.readShort();

            } else
            if(k == 90)
                anInt794 = class39_sub3_sub3.readShort();
            else
            if(k == 91)
                anInt812 = class39_sub3_sub3.readShort();
            else
            if(k == 92)
                anInt788 = class39_sub3_sub3.readShort();
            else
            if(k == 93)
                aBoolean818 = false;
            else
            if(k == 95)
                anInt805 = class39_sub3_sub3.readShort();
            else
            if(k == 97)
                anInt796 = class39_sub3_sub3.readShort();
            else
            if(k == 98)
                anInt793 = class39_sub3_sub3.readShort();
            else
            if(k == 99)
                aBoolean791 = true;
            else
            if(k == 100)
                anInt779 = class39_sub3_sub3.getByte();
            else
            if(k == 101)
                anInt792 = class39_sub3_sub3.getByte() * 5;
            else
            if(k == 102)
                anInt799 = class39_sub3_sub3.readShort();
            else
            if(k == 103)
                anInt803 = class39_sub3_sub3.readShort();
            else
            if(k == 106)
            {
                anInt798 = class39_sub3_sub3.readShort();
                if(anInt798 == 65535)
                    anInt798 = -1;
                anInt784 = class39_sub3_sub3.readShort();
                if(anInt784 == 65535)
                    anInt784 = -1;
                int k1 = class39_sub3_sub3.readUByte();
                anIntArray785 = new int[k1 + 1];
                for(int k2 = 0; k2 <= k1; k2++)
                {
                    anIntArray785[k2] = class39_sub3_sub3.readShort();
                    if(anIntArray785[k2] == 65535)
                        anIntArray785[k2] = -1;
                }

            } else
            if(k == 107)
                aBoolean786 = false;
        } while(true);
    }

    public static void method595(int i)
    {
        aClass35_816 = null;
        anIntArray801 = null;
        if(i != -29497)
            anInt819 = -52;
        aNpcConfigArray795 = null;
        aClass39_Sub3_Sub3_814 = null;
    }

    public static void method596(Class10 class10)
    {
        aClass39_Sub3_Sub3_814 = new Buffer(class10.method193("npc.dat", null));
        Buffer class39_sub3_sub3 = new Buffer(class10.method193("npc.idx", null));
        anInt800 = class39_sub3_sub3.readShort();
        anIntArray801 = new int[anInt800];
        int i = 2;
        for(int j = 0; j < anInt800; j++)
        {
            anIntArray801[j] = i;
            i += class39_sub3_sub3.readShort();
        }

        aNpcConfigArray795 = new NpcConfig[20];
        for(int k = 0; k < 20; k++)
            aNpcConfigArray795[k] = new NpcConfig();

    }

    public Class39_Sub3_Sub2_Sub4 method597(int i, int j, int k, int ai[])
    {
        if(anIntArray785 != null)
        {
            NpcConfig npcConfig = method593(0);
            if(npcConfig == null)
                return null;
            else
                return npcConfig.method597(i, j, anInt782, ai);
        }
        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4 = (Class39_Sub3_Sub2_Sub4)aClass35_816.method361(aLong780);
        if(class39_sub3_sub2_sub4 == null)
        {
            boolean flag = false;
            for(int l = 0; l < anIntArray806.length; l++)
                if(!Class39_Sub3_Sub2_Sub4.method388(anIntArray806[l]))
                    flag = true;

            if(flag)
                return null;
            Class39_Sub3_Sub2_Sub4 aclass39_sub3_sub2_sub4[] = new Class39_Sub3_Sub2_Sub4[anIntArray806.length];
            for(int i1 = 0; i1 < anIntArray806.length; i1++)
                aclass39_sub3_sub2_sub4[i1] = Class39_Sub3_Sub2_Sub4.method387(anIntArray806[i1]);

            if(aclass39_sub3_sub2_sub4.length == 1)
                class39_sub3_sub2_sub4 = aclass39_sub3_sub2_sub4[0];
            else
                class39_sub3_sub2_sub4 = new Class39_Sub3_Sub2_Sub4(183, aclass39_sub3_sub2_sub4, aclass39_sub3_sub2_sub4.length);
            if(anIntArray804 != null)
            {
                for(int j1 = 0; j1 < anIntArray804.length; j1++)
                    class39_sub3_sub2_sub4.method401(anIntArray804[j1], anIntArray802[j1]);

            }
            class39_sub3_sub2_sub4.method394(false);
            class39_sub3_sub2_sub4.method404(64 + anInt779, 850 + anInt792, -30, -50, -30, true);
            aClass35_816.method362(aLong780, class39_sub3_sub2_sub4, -501);
        }
        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4_1 = Class39_Sub3_Sub2_Sub4.aClass39_Sub3_Sub2_Sub4_1521;
        if(k != anInt808)
            anInt810 = 78;
        class39_sub3_sub2_sub4_1.method389(Class33.method350((byte)9, j) & Class33.method350((byte)9, i), class39_sub3_sub2_sub4, 0);
        if(j != -1 && i != -1)
            class39_sub3_sub2_sub4_1.method396(i, anInt781, j, ai);
        else
        if(j != -1)
            class39_sub3_sub2_sub4_1.method395(j, 0);
        if(anInt796 != 128 || anInt793 != 128)
            class39_sub3_sub2_sub4_1.method403(anInt796, true, anInt796, anInt793);
        class39_sub3_sub2_sub4_1.method391(aBoolean778);
        class39_sub3_sub2_sub4_1.anIntArrayArray1557 = null;
        class39_sub3_sub2_sub4_1.anIntArrayArray1556 = null;
        if(aByte820 == 1)
            class39_sub3_sub2_sub4_1.aBoolean1558 = true;
        return class39_sub3_sub2_sub4_1;
    }

    public static NpcConfig getDefinition(int i)
    {
        for(int j = 0; j < 20; j++)
            if(aNpcConfigArray795[j].aLong780 == (long)i)
                return aNpcConfigArray795[j];

        anInt783 = (anInt783 + 1) % 20;
        NpcConfig npcConfig = aNpcConfigArray795[anInt783] = new NpcConfig();
        aClass39_Sub3_Sub3_814.currentOffset = anIntArray801[i];
        npcConfig.aLong780 = i;
        npcConfig.method594(5, aClass39_Sub3_Sub3_814);
        return npcConfig;
    }

    public boolean method599(byte byte0)
    {
        if(byte0 == 4)
            byte0 = 0;
        else
            aBoolean778 = !aBoolean778;
        if(anIntArray785 == null)
            return true;
        int i = -1;
        if(anInt798 != -1)
        {
            Class6 class6 = Class6.aClass6Array122[anInt798];
            int j = class6.anInt124;
            int k = class6.anInt125;
            int l = class6.anInt126;
            int i1 = Game.anIntArray880[l - k];
            i = aGame815.anIntArray943[j] >> k & i1;
        } else
        if(anInt784 != -1)
            i = aGame815.anIntArray943[anInt784];
        return i >= 0 && i < anIntArray785.length && anIntArray785[i] != -1;
    }

    public Class39_Sub3_Sub2_Sub4 method600(int i)
    {
        if(i != 0)
            throw new NullPointerException();
        if(anIntArray785 != null)
        {
            NpcConfig npcConfig = method593(0);
            if(npcConfig == null)
                return null;
            else
                return npcConfig.method600(anInt797);
        }
        if(anIntArray809 == null)
            return null;
        boolean flag = false;
        for(int j = 0; j < anIntArray809.length; j++)
            if(!Class39_Sub3_Sub2_Sub4.method388(anIntArray809[j]))
                flag = true;

        if(flag)
            return null;
        Class39_Sub3_Sub2_Sub4 aclass39_sub3_sub2_sub4[] = new Class39_Sub3_Sub2_Sub4[anIntArray809.length];
        for(int k = 0; k < anIntArray809.length; k++)
            aclass39_sub3_sub2_sub4[k] = Class39_Sub3_Sub2_Sub4.method387(anIntArray809[k]);

        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4;
        if(aclass39_sub3_sub2_sub4.length == 1)
            class39_sub3_sub2_sub4 = aclass39_sub3_sub2_sub4[0];
        else
            class39_sub3_sub2_sub4 = new Class39_Sub3_Sub2_Sub4(183, aclass39_sub3_sub2_sub4, aclass39_sub3_sub2_sub4.length);
        if(anIntArray804 != null)
        {
            for(int l = 0; l < anIntArray804.length; l++)
                class39_sub3_sub2_sub4.method401(anIntArray804[l], anIntArray802[l]);

        }
        return class39_sub3_sub2_sub4;
    }

    public NpcConfig()
    {
        aBoolean778 = false;
        aLong780 = -1L;
        anInt781 = 42698;
        anInt782 = 8;
        anInt784 = -1;
        aBoolean786 = true;
        anInt787 = -1;
        anInt788 = -1;
        aBoolean791 = false;
        anInt793 = 128;
        anInt794 = -1;
        anInt796 = 128;
        anInt798 = -1;
        anInt799 = -1;
        anInt803 = 32;
        anInt805 = -1;
        anInt807 = -1;
        anInt808 = 8;
        anInt810 = 9;
        anInt811 = -1;
        anInt812 = -1;
        anInt813 = -1;
        anInt817 = -1;
        aBoolean818 = true;
        aByte820 = 1;
        aString821 = "null";
    }

    public boolean aBoolean778;
    public int anInt779;
    public long aLong780;
    public int anInt781;
    public int anInt782;
    public static int anInt783;
    public int anInt784;
    public int anIntArray785[];
    public boolean aBoolean786;
    public int anInt787;
    public int anInt788;
    public byte aByteArray789[];
    public String aStringArray790[];
    public boolean aBoolean791;
    public int anInt792;
    public int anInt793;
    public int anInt794;
    public static NpcConfig aNpcConfigArray795[];
    public int anInt796;
    public int anInt797;
    public int anInt798;
    public int anInt799;
    public static int anInt800;
    public static int anIntArray801[];
    public int anIntArray802[];
    public int anInt803;
    public int anIntArray804[];
    public int anInt805;
    public int anIntArray806[];
    public int anInt807;
    public int anInt808;
    public int anIntArray809[];
    public int anInt810;
    public int anInt811;
    public int anInt812;
    public int anInt813;
    public static Buffer aClass39_Sub3_Sub3_814;
    public static Game aGame815;
    public static Class35 aClass35_816 = new Class35(30, 5);
    public int anInt817;
    public boolean aBoolean818;
    public static int anInt819 = 48306;
    public byte aByte820;
    public String aString821;

}
