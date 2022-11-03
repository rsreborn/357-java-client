package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class23
{

    public Class23(int i)
    {
        aBoolean319 = true;
        aByte320 = 8;
        aClass39_Sub3_321 = new Class39_Sub3();
        if(i != 0)
            aBoolean319 = !aBoolean319;
        aClass39_Sub3_321.aClass39_Sub3_1421 = aClass39_Sub3_321;
        aClass39_Sub3_321.aClass39_Sub3_1422 = aClass39_Sub3_321;
    }

    public void method266(Class39_Sub3 class39_sub3)
    {
        if(class39_sub3.aClass39_Sub3_1422 != null)
            class39_sub3.method377();
        class39_sub3.aClass39_Sub3_1422 = aClass39_Sub3_321.aClass39_Sub3_1422;
        class39_sub3.aClass39_Sub3_1421 = aClass39_Sub3_321;
        class39_sub3.aClass39_Sub3_1422.aClass39_Sub3_1421 = class39_sub3;
        class39_sub3.aClass39_Sub3_1421.aClass39_Sub3_1422 = class39_sub3;
    }

    public Class39_Sub3 method267()
    {
        Class39_Sub3 class39_sub3 = aClass39_Sub3_321.aClass39_Sub3_1421;
        if(class39_sub3 == aClass39_Sub3_321)
        {
            return null;
        } else
        {
            class39_sub3.method377();
            return class39_sub3;
        }
    }

    public Class39_Sub3 method268()
    {
        Class39_Sub3 class39_sub3 = aClass39_Sub3_321.aClass39_Sub3_1421;
        if(class39_sub3 == aClass39_Sub3_321)
        {
            aClass39_Sub3_322 = null;
            return null;
        } else
        {
            aClass39_Sub3_322 = class39_sub3.aClass39_Sub3_1421;
            return class39_sub3;
        }
    }

    public Class39_Sub3 method269(byte byte0)
    {
        if(byte0 != aByte320)
            throw new NullPointerException();
        Class39_Sub3 class39_sub3 = aClass39_Sub3_322;
        if(class39_sub3 == aClass39_Sub3_321)
        {
            aClass39_Sub3_322 = null;
            return null;
        } else
        {
            aClass39_Sub3_322 = class39_sub3.aClass39_Sub3_1421;
            return class39_sub3;
        }
    }

    public int method270()
    {
        int i = 0;
        for(Class39_Sub3 class39_sub3 = aClass39_Sub3_321.aClass39_Sub3_1421; class39_sub3 != aClass39_Sub3_321; class39_sub3 = class39_sub3.aClass39_Sub3_1421)
            i++;

        return i;
    }

    public boolean aBoolean319;
    public byte aByte320;
    public Class39_Sub3 aClass39_Sub3_321;
    public Class39_Sub3 aClass39_Sub3_322;
}
