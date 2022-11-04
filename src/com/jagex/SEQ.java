package com.jagex;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class SEQ
{

    public static void initialize(byte byte0, Class10 class10)
    {
        Buffer class39_sub3_sub3 = new Buffer(class10.method193("seq.dat", null));
        anInt270 = class39_sub3_sub3.readShort();
        if(byte0 != 6)
            anInt269 = 72;
        if(aClass20Array271 == null)
            aClass20Array271 = new SEQ[anInt270];
        for(int i = 0; i < anInt270; i++)
        {
            if(aClass20Array271[i] == null)
                aClass20Array271[i] = new SEQ();
            aClass20Array271[i].method221(5, class39_sub3_sub3);
        }

    }

    public int method220(byte byte0, int i)
    {
        int j = anIntArray275[i];
        if(byte0 != 0)
            return 3;
        if(j == 0)
        {
            Class33 class33 = Class33.method349(anIntArray273[i]);
            if(class33 != null)
                j = anIntArray275[i] = class33.anInt569;
        }
        if(j == 0)
            j = 1;
        return j;
    }

    public void method221(int i, Buffer class39_sub3_sub3)
    {
        if(i != 5)
            aBoolean268 = !aBoolean268;
        do
        {
            int j = class39_sub3_sub3.readUByte();
            if(j == 0)
                break;
            if(j == 1)
            {
                anInt272 = class39_sub3_sub3.readUByte();
                anIntArray273 = new int[anInt272];
                anIntArray274 = new int[anInt272];
                anIntArray275 = new int[anInt272];
                for(int k = 0; k < anInt272; k++)
                {
                    anIntArray273[k] = class39_sub3_sub3.readShort();
                    anIntArray274[k] = class39_sub3_sub3.readShort();
                    if(anIntArray274[k] == 65535)
                        anIntArray274[k] = -1;
                    anIntArray275[k] = class39_sub3_sub3.readShort();
                }

            } else
            if(j == 2)
                anInt276 = class39_sub3_sub3.readShort();
            else
            if(j == 3)
            {
                int l = class39_sub3_sub3.readUByte();
                anIntArray277 = new int[l + 1];
                for(int i1 = 0; i1 < l; i1++)
                    anIntArray277[i1] = class39_sub3_sub3.readUByte();

                anIntArray277[l] = 0x98967f;
            } else
            if(j == 4)
                aBoolean278 = true;
            else
            if(j == 5)
                anInt279 = class39_sub3_sub3.readUByte();
            else
            if(j == 6)
                anInt280 = class39_sub3_sub3.readShort();
            else
            if(j == 7)
                anInt281 = class39_sub3_sub3.readShort();
            else
            if(j == 8)
                anInt282 = class39_sub3_sub3.readUByte();
            else
            if(j == 9)
                anInt283 = class39_sub3_sub3.readUByte();
            else
            if(j == 10)
                anInt284 = class39_sub3_sub3.readUByte();
            else
            if(j == 11)
                anInt285 = class39_sub3_sub3.readUByte();
            else
            if(j == 12)
                anInt286 = class39_sub3_sub3.readIntBE();
            else
                System.out.println("Error unrecognised seq config code: " + j);
        } while(true);
        if(anInt272 == 0)
        {
            anInt272 = 1;
            anIntArray273 = new int[1];
            anIntArray273[0] = -1;
            anIntArray274 = new int[1];
            anIntArray274[0] = -1;
            anIntArray275 = new int[1];
            anIntArray275[0] = -1;
        }
        if(anInt283 == -1)
            if(anIntArray277 != null)
                anInt283 = 2;
            else
                anInt283 = 0;
        if(anInt284 == -1)
        {
            if(anIntArray277 != null)
            {
                anInt284 = 2;
                return;
            }
            anInt284 = 0;
        }
    }

    public SEQ()
    {
        aBoolean268 = true;
        anInt276 = -1;
        aBoolean278 = false;
        anInt279 = 5;
        anInt280 = -1;
        anInt281 = -1;
        anInt282 = 99;
        anInt283 = -1;
        anInt284 = -1;
        anInt285 = 2;
    }

    public boolean aBoolean268;
    public static int anInt269 = 48306;
    public static int anInt270;
    public static SEQ aClass20Array271[];
    public int anInt272;
    public int anIntArray273[];
    public int anIntArray274[];
    public int anIntArray275[];
    public int anInt276;
    public int anIntArray277[];
    public boolean aBoolean278;
    public int anInt279;
    public int anInt280;
    public int anInt281;
    public int anInt282;
    public int anInt283;
    public int anInt284;
    public int anInt285;
    public int anInt286;
    public static int anInt287;

}
