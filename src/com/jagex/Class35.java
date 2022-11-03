package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import com.jagex.sign.Signlink;

public class Class35
{

    public Class35(int i, int j)
    {
        anInt655 = 4;
        anInt656 = 48306;
        aBoolean657 = true;
        aClass39_Sub3_660 = new Class39_Sub3();
        aClass23_664 = new Class23(0);
        anInt661 = i;
        if(j != 5)
            anInt656 = 35;
        anInt662 = i;
        aClass38_663 = new Class38(anInt655, 1024);
    }

    public Class39_Sub3 method361(long l)
    {
        Class39_Sub3 class39_sub3 = (Class39_Sub3)aClass38_663.method374(l);
        if(class39_sub3 != null)
        {
            aClass23_664.method266(class39_sub3);
            anInt659++;
        } else
        {
            anInt658++;
        }
        return class39_sub3;
    }

    public void method362(long l, Class39_Sub3 class39_sub3, int i)
    {
        try
        {
            while(i >= 0) 
                return;
            if(anInt662 == 0)
            {
                Class39_Sub3 class39_sub3_1 = aClass23_664.method267();
                class39_sub3_1.method376();
                class39_sub3_1.method377();
                if(class39_sub3_1 == aClass39_Sub3_660)
                {
                    Class39_Sub3 class39_sub3_2 = aClass23_664.method267();
                    class39_sub3_2.method376();
                    class39_sub3_2.method377();
                }
            } else
            {
                anInt662--;
            }
            aClass38_663.method375(l, class39_sub3, true);
            aClass23_664.method266(class39_sub3);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("17253, " + l + ", " + class39_sub3 + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method363()
    {
        do
        {
            Class39_Sub3 class39_sub3 = aClass23_664.method267();
            if(class39_sub3 != null)
            {
                class39_sub3.method376();
                class39_sub3.method377();
            } else
            {
                anInt662 = anInt661;
                return;
            }
        } while(true);
    }

    public int anInt655;
    public int anInt656;
    public boolean aBoolean657;
    public int anInt658;
    public int anInt659;
    public Class39_Sub3 aClass39_Sub3_660;
    public int anInt661;
    public int anInt662;
    public Class38 aClass38_663;
    public Class23 aClass23_664;
}
