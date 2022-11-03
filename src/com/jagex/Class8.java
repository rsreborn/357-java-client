package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class8
    implements Runnable
{

    public void run()
    {
        while(aBoolean162) 
        {
            synchronized(anObject158)
            {
                if(anInt157 < 500)
                {
                    anIntArray159[anInt157] = ((GameApplet) (aGame160)).anInt23;
                    anIntArray163[anInt157] = ((GameApplet) (aGame160)).anInt24;
                    anInt157++;
                }
            }
            try
            {
                Thread.sleep(50L);
            }
            catch(Exception _ex) { }
        }
    }

    public Class8(Game game1, boolean flag)
    {
        anObject158 = new Object();
        anIntArray159 = new int[500];
        aBoolean161 = true;
        aBoolean162 = true;
        anIntArray163 = new int[500];
        if(!flag)
        {
            throw new NullPointerException();
        } else
        {
            aGame160 = game1;
            return;
        }
    }

    public int anInt157;
    public Object anObject158;
    public int anIntArray159[];
    public Game aGame160;
    public boolean aBoolean161;
    public boolean aBoolean162;
    public int anIntArray163[];
}
