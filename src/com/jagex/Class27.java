package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class27 {

    public static void method271(Class10 class10)
    {
        aClass39_Sub3_Sub3_370 = new Buffer(class10.method193("loc.dat", null));
        Buffer class39_sub3_sub3 = new Buffer(class10.method193("loc.idx", null));
        anInt385 = class39_sub3_sub3.readShort();
        anIntArray401 = new int[anInt385];
        int i = 2;
        for(int j = 0; j < anInt385; j++)
        {
            anIntArray401[j] = i;
            i += class39_sub3_sub3.readShort();
        }

        aClass27Array409 = new Class27[20];
        for(int k = 0; k < 20; k++)
            aClass27Array409[k] = new Class27();

    }

    public static Class27 method272(int i)
    {
        for(int j = 0; j < 20; j++)
            if(aClass27Array409[j].anInt365 == i)
                return aClass27Array409[j];

        anInt372 = (anInt372 + 1) % 20;
        Class27 class27 = aClass27Array409[anInt372];
        aClass39_Sub3_Sub3_370.currentOffset = anIntArray401[i];
        class27.anInt365 = i;
        class27.method274();
        class27.method276(5, aClass39_Sub3_Sub3_370);
        return class27;
    }

    public void method273(byte byte0, OnDemandClient onDemandClient)
    {
        if(anIntArray400 == null)
            return;
        for(int i = 0; i < anIntArray400.length; i++)
            onDemandClient.method228(false, anIntArray400[i] & 0xffff, 0);

        if(byte0 == 8)
            byte0 = 0;
    }

    public void method274()
    {
        anIntArray400 = null;
        anIntArray407 = null;
        aString392 = "null";
        aByteArray406 = null;
        anIntArray379 = null;
        anIntArray373 = null;
        anInt405 = 1;
        anInt395 = 1;
        aBoolean390 = true;
        aBoolean362 = true;
        aBoolean377 = false;
        aBoolean374 = false;
        aBoolean378 = false;
        aBoolean361 = false;
        anInt368 = -1;
        anInt376 = 16;
        aByte408 = 0;
        aByte359 = 0;
        aStringArray380 = null;
        anInt398 = -1;
        anInt394 = -1;
        aBoolean382 = false;
        aBoolean410 = true;
        anInt383 = 128;
        anInt397 = 128;
        anInt393 = 128;
        anInt399 = 0;
        anInt388 = 0;
        anInt402 = 0;
        anInt387 = 0;
        aBoolean360 = false;
        aBoolean396 = false;
        anInt366 = -1;
        anInt363 = -1;
        anInt403 = -1;
        anIntArray367 = null;
    }

    public Class39_Sub3_Sub2_Sub4 method275(int i, int j, int k, byte byte0)
    {
        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4 = null;
        long l;
        if(anIntArray407 == null)
        {
            if(j != 10)
                return null;
            l = (long)((anInt365 << 6) + k) + ((long)(i + 1) << 32);
            Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4_1 = (Class39_Sub3_Sub2_Sub4)aClass35_391.method361(l);
            if(class39_sub3_sub2_sub4_1 != null)
                return class39_sub3_sub2_sub4_1;
            if(anIntArray400 == null)
                return null;
            boolean flag1 = aBoolean382 ^ (k > 3);
            int k1 = anIntArray400.length;
            for(int l1 = 0; l1 < k1; l1++)
            {
                int k2 = anIntArray400[l1];
                if(flag1)
                    k2 += 0x10000;
                class39_sub3_sub2_sub4 = (Class39_Sub3_Sub2_Sub4)aClass35_404.method361(k2);
                if(class39_sub3_sub2_sub4 == null)
                {
                    class39_sub3_sub2_sub4 = Class39_Sub3_Sub2_Sub4.method387(k2 & 0xffff);
                    if(class39_sub3_sub2_sub4 == null)
                        return null;
                    if(flag1)
                        class39_sub3_sub2_sub4.method402(anInt364);
                    aClass35_404.method362(k2, class39_sub3_sub2_sub4, -501);
                }
                if(k1 > 1)
                    aClass39_Sub3_Sub2_Sub4Array369[l1] = class39_sub3_sub2_sub4;
            }

            if(k1 > 1)
                class39_sub3_sub2_sub4 = new Class39_Sub3_Sub2_Sub4(183, aClass39_Sub3_Sub2_Sub4Array369, k1);
        } else
        {
            int i1 = -1;
            for(int j1 = 0; j1 < anIntArray407.length; j1++)
            {
                if(anIntArray407[j1] != j)
                    continue;
                i1 = j1;
                break;
            }

            if(i1 == -1)
                return null;
            l = (long)((anInt365 << 6) + (i1 << 3) + k) + ((long)(i + 1) << 32);
            Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4_2 = (Class39_Sub3_Sub2_Sub4)aClass35_391.method361(l);
            if(class39_sub3_sub2_sub4_2 != null)
                return class39_sub3_sub2_sub4_2;
            int i2 = anIntArray400[i1];
            boolean flag3 = aBoolean382 ^ (k > 3);
            if(flag3)
                i2 += 0x10000;
            class39_sub3_sub2_sub4 = (Class39_Sub3_Sub2_Sub4)aClass35_404.method361(i2);
            if(class39_sub3_sub2_sub4 == null)
            {
                class39_sub3_sub2_sub4 = Class39_Sub3_Sub2_Sub4.method387(i2 & 0xffff);
                if(class39_sub3_sub2_sub4 == null)
                    return null;
                if(flag3)
                    class39_sub3_sub2_sub4.method402(anInt364);
                aClass35_404.method362(i2, class39_sub3_sub2_sub4, -501);
            }
        }
        boolean flag;
        if(anInt383 != 128 || anInt397 != 128 || anInt393 != 128)
            flag = true;
        else
            flag = false;
        if(byte0 != 33)
            throw new NullPointerException();
        boolean flag2;
        if(anInt388 != 0 || anInt402 != 0 || anInt387 != 0)
            flag2 = true;
        else
            flag2 = false;
        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4_3 = new Class39_Sub3_Sub2_Sub4(Class33.method350((byte)9, i), true, anIntArray379 == null, class39_sub3_sub2_sub4, k == 0 && i == -1 && !flag && !flag2);
        if(i != -1)
        {
            class39_sub3_sub2_sub4_3.method394(false);
            class39_sub3_sub2_sub4_3.method395(i, 0);
            class39_sub3_sub2_sub4_3.anIntArrayArray1557 = null;
            class39_sub3_sub2_sub4_3.anIntArrayArray1556 = null;
        }
        while(k-- > 0) 
            class39_sub3_sub2_sub4_3.method398(-54);
        if(anIntArray379 != null)
        {
            for(int j2 = 0; j2 < anIntArray379.length; j2++)
                class39_sub3_sub2_sub4_3.method401(anIntArray379[j2], anIntArray373[j2]);

        }
        if(flag)
            class39_sub3_sub2_sub4_3.method403(anInt393, true, anInt383, anInt397);
        if(flag2)
            class39_sub3_sub2_sub4_3.method400(anInt388, anInt402, (byte)1, anInt387);
        class39_sub3_sub2_sub4_3.method404(64 + aByte408, 768 + aByte359 * 5, -50, -10, -50, !aBoolean378);
        if(anInt366 == 1)
            class39_sub3_sub2_sub4_3.anInt1553 = ((Class39_Sub3_Sub2) (class39_sub3_sub2_sub4_3)).anInt1431;
        aClass35_391.method362(l, class39_sub3_sub2_sub4_3, -501);
        return class39_sub3_sub2_sub4_3;
    }

    public void method276(int i, Buffer class39_sub3_sub3)
    {
        int j = -1;
        if(i < 5 || i > 5)
            anInt381 = 30;
label0:
        do
        {
            int k;
            do
            {
                k = class39_sub3_sub3.readUByte();
                if(k == 0)
                    break label0;
                if(k == 1)
                {
                    int l = class39_sub3_sub3.readUByte();
                    if(l > 0)
                        if(anIntArray400 == null || aBoolean375)
                        {
                            anIntArray407 = new int[l];
                            anIntArray400 = new int[l];
                            for(int l1 = 0; l1 < l; l1++)
                            {
                                anIntArray400[l1] = class39_sub3_sub3.readShort();
                                anIntArray407[l1] = class39_sub3_sub3.readUByte();
                            }

                        } else
                        {
                            class39_sub3_sub3.currentOffset += l * 3;
                        }
                } else
                if(k == 2)
                    aString392 = class39_sub3_sub3.readString();
                else
                if(k == 3)
                    aByteArray406 = class39_sub3_sub3.getRs2StringBytes();
                else
                if(k == 5)
                {
                    int i1 = class39_sub3_sub3.readUByte();
                    if(i1 > 0)
                        if(anIntArray400 == null || aBoolean375)
                        {
                            anIntArray407 = null;
                            anIntArray400 = new int[i1];
                            for(int i2 = 0; i2 < i1; i2++)
                                anIntArray400[i2] = class39_sub3_sub3.readShort();

                        } else
                        {
                            class39_sub3_sub3.currentOffset += i1 * 2;
                        }
                } else
                if(k == 14)
                    anInt405 = class39_sub3_sub3.readUByte();
                else
                if(k == 15)
                    anInt395 = class39_sub3_sub3.readUByte();
                else
                if(k == 17)
                    aBoolean390 = false;
                else
                if(k == 18)
                    aBoolean362 = false;
                else
                if(k == 19)
                {
                    j = class39_sub3_sub3.readUByte();
                    if(j == 1)
                        aBoolean377 = true;
                } else
                if(k == 21)
                    aBoolean374 = true;
                else
                if(k == 22)
                    aBoolean378 = true;
                else
                if(k == 23)
                    aBoolean361 = true;
                else
                if(k == 24)
                {
                    anInt368 = class39_sub3_sub3.readShort();
                    if(anInt368 == 65535)
                        anInt368 = -1;
                } else
                if(k == 28)
                    anInt376 = class39_sub3_sub3.readUByte();
                else
                if(k == 29)
                    aByte408 = class39_sub3_sub3.getByte();
                else
                if(k == 39)
                    aByte359 = class39_sub3_sub3.getByte();
                else
                if(k >= 30 && k < 39)
                {
                    if(aStringArray380 == null)
                        aStringArray380 = new String[5];
                    aStringArray380[k - 30] = class39_sub3_sub3.readString();
                    if(aStringArray380[k - 30].equalsIgnoreCase("hidden"))
                        aStringArray380[k - 30] = null;
                } else
                if(k == 40)
                {
                    int j1 = class39_sub3_sub3.readUByte();
                    anIntArray379 = new int[j1];
                    anIntArray373 = new int[j1];
                    for(int j2 = 0; j2 < j1; j2++)
                    {
                        anIntArray379[j2] = class39_sub3_sub3.readShort();
                        anIntArray373[j2] = class39_sub3_sub3.readShort();
                    }

                } else
                if(k == 60)
                    anInt398 = class39_sub3_sub3.readShort();
                else
                if(k == 62)
                    aBoolean382 = true;
                else
                if(k == 64)
                    aBoolean410 = false;
                else
                if(k == 65)
                    anInt383 = class39_sub3_sub3.readShort();
                else
                if(k == 66)
                    anInt397 = class39_sub3_sub3.readShort();
                else
                if(k == 67)
                    anInt393 = class39_sub3_sub3.readShort();
                else
                if(k == 68)
                    anInt394 = class39_sub3_sub3.readShort();
                else
                if(k == 69)
                    anInt399 = class39_sub3_sub3.readUByte();
                else
                if(k == 70)
                    anInt388 = class39_sub3_sub3.getSmart();
                else
                if(k == 71)
                    anInt402 = class39_sub3_sub3.getSmart();
                else
                if(k == 72)
                    anInt387 = class39_sub3_sub3.getSmart();
                else
                if(k == 73)
                    aBoolean360 = true;
                else
                if(k == 74)
                {
                    aBoolean396 = true;
                } else
                {
                    if(k != 75)
                        continue;
                    anInt366 = class39_sub3_sub3.readUByte();
                }
                continue label0;
            } while(k != 77);
            anInt363 = class39_sub3_sub3.readShort();
            if(anInt363 == 65535)
                anInt363 = -1;
            anInt403 = class39_sub3_sub3.readShort();
            if(anInt403 == 65535)
                anInt403 = -1;
            int k1 = class39_sub3_sub3.readUByte();
            anIntArray367 = new int[k1 + 1];
            for(int k2 = 0; k2 <= k1; k2++)
            {
                anIntArray367[k2] = class39_sub3_sub3.readShort();
                if(anIntArray367[k2] == 65535)
                    anIntArray367[k2] = -1;
            }

        } while(true);
        if(j == -1)
        {
            aBoolean377 = false;
            if(anIntArray400 != null && (anIntArray407 == null || anIntArray407[0] == 10))
                aBoolean377 = true;
            if(aStringArray380 != null)
                aBoolean377 = true;
        }
        if(aBoolean396)
        {
            aBoolean390 = false;
            aBoolean362 = false;
        }
        if(anInt366 == -1)
            anInt366 = aBoolean390 ? 1 : 0;
    }

    public Class39_Sub3_Sub2_Sub4 method277(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4 = method275(k1, i, j, (byte)33);
        if(class39_sub3_sub2_sub4 == null)
            return null;
        if(aBoolean374 || aBoolean378)
            class39_sub3_sub2_sub4 = new Class39_Sub3_Sub2_Sub4(-426, aBoolean374, aBoolean378, class39_sub3_sub2_sub4);
        if(aBoolean374)
        {
            int l1 = (k + l + i1 + j1) / 4;
            for(int i2 = 0; i2 < class39_sub3_sub2_sub4.anInt1526; i2++)
            {
                int j2 = class39_sub3_sub2_sub4.anIntArray1527[i2];
                int k2 = class39_sub3_sub2_sub4.anIntArray1529[i2];
                int l2 = k + ((l - k) * (j2 + 64)) / 128;
                int i3 = j1 + ((i1 - j1) * (j2 + 64)) / 128;
                int j3 = l2 + ((i3 - l2) * (k2 + 64)) / 128;
                class39_sub3_sub2_sub4.anIntArray1528[i2] += j3 - l1;
            }

            class39_sub3_sub2_sub4.method392((byte)-57);
        }
        return class39_sub3_sub2_sub4;
    }

    public boolean method278(byte byte0, int i)
    {
        if(byte0 != -113)
            anInt384 = 27;
        if(anIntArray407 == null)
        {
            if(anIntArray400 == null)
                return true;
            if(i != 10)
                return true;
            boolean flag = true;
            for(int k = 0; k < anIntArray400.length; k++)
                flag &= Class39_Sub3_Sub2_Sub4.method388(anIntArray400[k] & 0xffff);

            return flag;
        }
        for(int j = 0; j < anIntArray407.length; j++)
            if(anIntArray407[j] == i)
                return Class39_Sub3_Sub2_Sub4.method388(anIntArray400[j] & 0xffff);

        return true;
    }

    public Class27 method279(boolean flag)
    {
        int i = -1;
        if(!flag)
            throw new NullPointerException();
        if(anInt363 != -1)
        {
            Class6 class6 = Class6.aClass6Array122[anInt363];
            int j = class6.anInt124;
            int k = class6.anInt125;
            int l = class6.anInt126;
            int i1 = Game.anIntArray880[l - k];
            i = aGame371.anIntArray943[j] >> k & i1;
        } else
        if(anInt403 != -1)
            i = aGame371.anIntArray943[anInt403];
        if(i < 0 || i >= anIntArray367.length || anIntArray367[i] == -1)
            return null;
        else
            return method272(anIntArray367[i]);
    }

    public static void method280(int i)
    {
        aClass35_404 = null;
        aClass35_391 = null;
        anIntArray401 = null;
        aClass27Array409 = null;
        aClass39_Sub3_Sub3_370 = null;
        if(i != -29497)
            aBoolean389 = !aBoolean389;
    }

    public boolean method281(boolean flag)
    {
        if(!flag)
            throw new NullPointerException();
        if(anIntArray400 == null)
            return true;
        boolean flag1 = true;
        for(int i = 0; i < anIntArray400.length; i++)
            flag1 &= Class39_Sub3_Sub2_Sub4.method388(anIntArray400[i] & 0xffff);

        return flag1;
    }

    public Class27()
    {
        anInt364 = 523;
        anInt365 = -1;
        anInt381 = 58;
        anInt384 = 793;
        aBoolean386 = true;
        aString392 = "null";
    }

    public byte aByte359;
    public boolean aBoolean360;
    public boolean aBoolean361;
    public boolean aBoolean362;
    public int anInt363;
    public int anInt364;
    public int anInt365;
    public int anInt366;
    public int anIntArray367[];
    public int anInt368;
    public static Class39_Sub3_Sub2_Sub4 aClass39_Sub3_Sub2_Sub4Array369[] = new Class39_Sub3_Sub2_Sub4[4];
    public static Buffer aClass39_Sub3_Sub3_370;
    public static Game aGame371;
    public static int anInt372;
    public int anIntArray373[];
    public boolean aBoolean374;
    public static boolean aBoolean375;
    public int anInt376;
    public boolean aBoolean377;
    public boolean aBoolean378;
    public int anIntArray379[];
    public String aStringArray380[];
    public int anInt381;
    public boolean aBoolean382;
    public int anInt383;
    public int anInt384;
    public static int anInt385;
    public boolean aBoolean386;
    public int anInt387;
    public int anInt388;
    public static boolean aBoolean389 = true;
    public boolean aBoolean390;
    public static Class35 aClass35_391 = new Class35(40, 5);
    public String aString392;
    public int anInt393;
    public int anInt394;
    public int anInt395;
    public boolean aBoolean396;
    public int anInt397;
    public int anInt398;
    public int anInt399;
    public int anIntArray400[];
    public static int anIntArray401[];
    public int anInt402;
    public int anInt403;
    public static Class35 aClass35_404 = new Class35(500, 5);
    public int anInt405;
    public byte aByteArray406[];
    public int anIntArray407[];
    public byte aByte408;
    public static Class27 aClass27Array409[];
    public boolean aBoolean410;

}
