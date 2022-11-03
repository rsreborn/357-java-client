package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class IDK
{

    public static void initialize(byte byte0, Class10 class10)
    {
        Buffer class39_sub3_sub3 = new Buffer(class10.method193("idk.dat", null));
        anInt229 = class39_sub3_sub3.getShort();
        if(byte0 != 6)
        {
            for(int i = 1; i > 0; i++);
        }
        if(aClass15Array230 == null)
            aClass15Array230 = new IDK[anInt229];
        for(int j = 0; j < anInt229; j++)
        {
            if(aClass15Array230[j] == null)
                aClass15Array230[j] = new IDK();
            aClass15Array230[j].method211(5, class39_sub3_sub3);
        }

    }

    public void method211(int i, Buffer class39_sub3_sub3)
    {
        if(i != 5)
            anInt225 = 54;
        do
        {
            int j = class39_sub3_sub3.getUnsignedByte();
            if(j == 0)
                return;
            if(j == 1)
                anInt231 = class39_sub3_sub3.getUnsignedByte();
            else
            if(j == 2)
            {
                int k = class39_sub3_sub3.getUnsignedByte();
                anIntArray232 = new int[k];
                for(int l = 0; l < k; l++)
                    anIntArray232[l] = class39_sub3_sub3.getShort();

            } else
            if(j == 3)
                aBoolean236 = true;
            else
            if(j >= 40 && j < 50)
                anIntArray233[j - 40] = class39_sub3_sub3.getShort();
            else
            if(j >= 50 && j < 60)
                anIntArray234[j - 50] = class39_sub3_sub3.getShort();
            else
            if(j >= 60 && j < 70)
                anIntArray235[j - 60] = class39_sub3_sub3.getShort();
            else
                System.out.println("Error unrecognised config code: " + j);
        } while(true);
    }

    public boolean method212(int i)
    {
        if(anIntArray232 == null)
            return true;
        boolean flag = true;
        if(i <= 0)
            anInt226 = -265;
        for(int j = 0; j < anIntArray232.length; j++)
            if(!Class39_Sub3_Sub2_Sub4.method388(anIntArray232[j]))
                flag = false;

        return flag;
    }

    public Class39_Sub3_Sub2_Sub4 method213(int i)
    {
        if(anIntArray232 == null)
            return null;
        Class39_Sub3_Sub2_Sub4 aclass39_sub3_sub2_sub4[] = new Class39_Sub3_Sub2_Sub4[anIntArray232.length];
        for(int j = 0; j < anIntArray232.length; j++)
            aclass39_sub3_sub2_sub4[j] = Class39_Sub3_Sub2_Sub4.method387(anIntArray232[j]);

        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4;
        if(aclass39_sub3_sub2_sub4.length == 1)
            class39_sub3_sub2_sub4 = aclass39_sub3_sub2_sub4[0];
        else
            class39_sub3_sub2_sub4 = new Class39_Sub3_Sub2_Sub4(183, aclass39_sub3_sub2_sub4, aclass39_sub3_sub2_sub4.length);
        for(int k = 0; k < 6; k++)
        {
            if(anIntArray233[k] == 0)
                break;
            class39_sub3_sub2_sub4.method401(anIntArray233[k], anIntArray234[k]);
        }

        if(i >= 0)
            aBoolean228 = !aBoolean228;
        return class39_sub3_sub2_sub4;
    }

    public boolean method214(int i)
    {
        boolean flag = true;
        if(i < 2 || i > 2)
            anInt225 = 126;
        for(int j = 0; j < 5; j++)
            if(anIntArray235[j] != -1 && !Class39_Sub3_Sub2_Sub4.method388(anIntArray235[j]))
                flag = false;

        return flag;
    }

    public Class39_Sub3_Sub2_Sub4 method215(byte byte0)
    {
        Class39_Sub3_Sub2_Sub4 aclass39_sub3_sub2_sub4[] = new Class39_Sub3_Sub2_Sub4[5];
        int i = 0;
        for(int j = 0; j < 5; j++)
            if(anIntArray235[j] != -1)
                aclass39_sub3_sub2_sub4[i++] = Class39_Sub3_Sub2_Sub4.method387(anIntArray235[j]);

        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4 = new Class39_Sub3_Sub2_Sub4(183, aclass39_sub3_sub2_sub4, i);
        for(int k = 0; k < 6; k++)
        {
            if(anIntArray233[k] == 0)
                break;
            class39_sub3_sub2_sub4.method401(anIntArray233[k], anIntArray234[k]);
        }

        if(byte0 != aByte227)
        {
            for(int l = 1; l > 0; l++);
        }
        return class39_sub3_sub2_sub4;
    }

    public IDK()
    {
        anInt226 = 827;
        aByte227 = 38;
        aBoolean228 = false;
        anInt231 = -1;
        anIntArray233 = new int[6];
        anIntArray234 = new int[6];
        aBoolean236 = false;
    }

    public int anInt225;
    public int anInt226;
    public byte aByte227;
    public boolean aBoolean228;
    public static int anInt229;
    public static IDK aClass15Array230[];
    public int anInt231;
    public int anIntArray232[];
    public int anIntArray233[];
    public int anIntArray234[];
    public int anIntArray235[] = {
        -1, -1, -1, -1, -1
    };
    public boolean aBoolean236;
}
