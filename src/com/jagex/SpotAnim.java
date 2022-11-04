package com.jagex;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class SpotAnim
{

    public static void initialize(byte byte0, Class10 class10)
    {
        Buffer class39_sub3_sub3 = new Buffer(class10.method193("spotanim.dat", null));
        anInt187 = class39_sub3_sub3.readShort();
        if(aClass11Array188 == null)
            aClass11Array188 = new SpotAnim[anInt187];
        for(int i = 0; i < anInt187; i++)
        {
            if(aClass11Array188[i] == null)
                aClass11Array188[i] = new SpotAnim();
            aClass11Array188[i].anInt189 = i;
            aClass11Array188[i].method195(5, class39_sub3_sub3);
        }

        if(byte0 == 6)
            byte0 = 0;
    }

    public void method195(int i, Buffer class39_sub3_sub3)
    {
        if(i != 5)
            anInt186 = -193;
        do
        {
            int j = class39_sub3_sub3.readUByte();
            if(j == 0)
                return;
            if(j == 1)
                anInt190 = class39_sub3_sub3.readShort();
            else
            if(j == 2)
            {
                anInt191 = class39_sub3_sub3.readShort();
                if(SEQ.aClass20Array271 != null)
                    aClass20_192 = SEQ.aClass20Array271[anInt191];
            } else
            if(j == 4)
                anInt195 = class39_sub3_sub3.readShort();
            else
            if(j == 5)
                anInt196 = class39_sub3_sub3.readShort();
            else
            if(j == 6)
                anInt197 = class39_sub3_sub3.readShort();
            else
            if(j == 7)
                anInt198 = class39_sub3_sub3.readUByte();
            else
            if(j == 8)
                anInt199 = class39_sub3_sub3.readUByte();
            else
            if(j >= 40 && j < 50)
                anIntArray193[j - 40] = class39_sub3_sub3.readShort();
            else
            if(j >= 50 && j < 60)
                anIntArray194[j - 50] = class39_sub3_sub3.readShort();
            else
                System.out.println("Error unrecognised spotanim config code: " + j);
        } while(true);
    }

    public Class39_Sub3_Sub2_Sub4 method196()
    {
        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4 = (Class39_Sub3_Sub2_Sub4)aClass35_200.method361(anInt189);
        if(class39_sub3_sub2_sub4 != null)
            return class39_sub3_sub2_sub4;
        class39_sub3_sub2_sub4 = Class39_Sub3_Sub2_Sub4.method387(anInt190);
        if(class39_sub3_sub2_sub4 == null)
            return null;
        for(int i = 0; i < 6; i++)
            if(anIntArray193[0] != 0)
                class39_sub3_sub2_sub4.method401(anIntArray193[i], anIntArray194[i]);

        aClass35_200.method362(anInt189, class39_sub3_sub2_sub4, -501);
        return class39_sub3_sub2_sub4;
    }

    public SpotAnim()
    {
        anInt186 = 1;
        anInt191 = -1;
        anIntArray193 = new int[6];
        anIntArray194 = new int[6];
        anInt195 = 128;
        anInt196 = 128;
    }

    public int anInt186;
    public static int anInt187;
    public static SpotAnim aClass11Array188[];
    public int anInt189;
    public int anInt190;
    public int anInt191;
    public SEQ aClass20_192;
    public int anIntArray193[];
    public int anIntArray194[];
    public int anInt195;
    public int anInt196;
    public int anInt197;
    public int anInt198;
    public int anInt199;
    public static Class35 aClass35_200 = new Class35(30, 5);

}
