package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import com.jagex.sign.Signlink;

public class Class38
{

    public Class38(int i, int j)
    {
        aByte683 = 8;
        anInt684 = j;
        aClass39Array685 = new Class39[j];
        if(i != 4)
        {
            for(int k = 1; k > 0; k++);
        }
        for(int l = 0; l < j; l++)
        {
            Class39 class39 = aClass39Array685[l] = new Class39();
            class39.aClass39_688 = class39;
            class39.aClass39_689 = class39;
        }

    }

    public Class39 method374(long l)
    {
        Class39 class39 = aClass39Array685[(int)(l & (long)(anInt684 - 1))];
        for(Class39 class39_1 = class39.aClass39_688; class39_1 != class39; class39_1 = class39_1.aClass39_688)
            if(class39_1.aLong687 == l)
                return class39_1;

        return null;
    }

    public void method375(long l, Class39 class39, boolean flag)
    {
        try
        {
            if(!flag)
                anInt682 = -115;
            if(class39.aClass39_689 != null)
                class39.method376();
            Class39 class39_1 = aClass39Array685[(int)(l & (long)(anInt684 - 1))];
            class39.aClass39_689 = class39_1.aClass39_689;
            class39.aClass39_688 = class39_1;
            class39.aClass39_689.aClass39_688 = class39;
            class39.aClass39_688.aClass39_689 = class39;
            class39.aLong687 = l;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("48738, " + l + ", " + class39 + ", " + flag + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public int anInt682;
    public byte aByte683;
    public int anInt684;
    public Class39 aClass39Array685[];
}
