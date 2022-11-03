package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class31
{

    public Class31(int ai[][][], int i, int j, byte byte0, int k)
    {
        aBoolean469 = false;
        aBoolean470 = true;
        anInt471 = 9;
        anInt472 = 672;
        aBoolean474 = false;
        aBoolean476 = true;
        aClass9Array485 = new Class9[5000];
        anIntArray527 = new int[10000];
        anIntArray528 = new int[10000];
        anInt478 = j;
        anInt479 = i;
        anInt480 = k;
        aClass39_Sub2ArrayArrayArray482 = new Class39_Sub2[j][i][k];
        anIntArrayArrayArray486 = new int[j][i + 1][k + 1];
        anIntArrayArrayArray481 = ai;
        if(byte0 != 72)
            aBoolean476 = !aBoolean476;
        method291(true);
    }

    public static void method290(int i)
    {
        aClass9Array503 = null;
        anIntArray514 = null;
        aClass16ArrayArray515 = null;
        aClass5_518 = null;
        aBooleanArrayArrayArrayArray532 = null;
        if(i != -29497)
            anInt473 = -409;
        aBooleanArrayArray533 = null;
    }

    public void method291(boolean flag)
    {
        for(int i = 0; i < anInt478; i++)
        {
            for(int j = 0; j < anInt479; j++)
            {
                for(int l = 0; l < anInt480; l++)
                    aClass39_Sub2ArrayArrayArray482[i][j][l] = null;

            }

        }

        for(int k = 0; k < anInt513; k++)
        {
            for(int i1 = 0; i1 < anIntArray514[k]; i1++)
                aClass16ArrayArray515[k][i1] = null;

            anIntArray514[k] = 0;
        }

        if(!flag)
            return;
        for(int j1 = 0; j1 < anInt484; j1++)
            aClass9Array485[j1] = null;

        anInt484 = 0;
        for(int k1 = 0; k1 < aClass9Array503.length; k1++)
            aClass9Array503[k1] = null;

    }

    public void method292(int i, byte byte0)
    {
        if(byte0 != -43)
            anInt472 = -174;
        anInt483 = i;
        for(int j = 0; j < anInt479; j++)
        {
            for(int k = 0; k < anInt480; k++)
                if(aClass39_Sub2ArrayArrayArray482[i][j][k] == null)
                    aClass39_Sub2ArrayArrayArray482[i][j][k] = new Class39_Sub2(i, j, k);

        }

    }

    public void method293(int i, byte byte0, int j)
    {
        if(byte0 == 9)
            byte0 = 0;
        else
            aBoolean474 = !aBoolean474;
        Class39_Sub2 class39_sub2 = aClass39_Sub2ArrayArrayArray482[0][j][i];
        for(int k = 0; k < 3; k++)
        {
            Class39_Sub2 class39_sub2_1 = aClass39_Sub2ArrayArrayArray482[k][j][i] = aClass39_Sub2ArrayArrayArray482[k + 1][j][i];
            if(class39_sub2_1 != null)
            {
                class39_sub2_1.anInt1397--;
                for(int l = 0; l < class39_sub2_1.anInt1407; l++)
                {
                    Class9 class9 = class39_sub2_1.aClass9Array1408[l];
                    if((class9.anInt176 >> 29 & 3) == 2 && class9.anInt170 == j && class9.anInt172 == i)
                        class9.anInt164--;
                }

            }
        }

        if(aClass39_Sub2ArrayArrayArray482[0][j][i] == null)
            aClass39_Sub2ArrayArrayArray482[0][j][i] = new Class39_Sub2(0, j, i);
        aClass39_Sub2ArrayArrayArray482[0][j][i].aClass39_Sub2_1419 = class39_sub2;
        aClass39_Sub2ArrayArrayArray482[3][j][i] = null;
    }

    public static void method294(int i, int j, int k, int l, int i1, int j1, int k1, int l1, 
            int i2)
    {
        Class16 class16 = new Class16();
        class16.anInt237 = i / 128;
        class16.anInt238 = k1 / 128;
        class16.anInt239 = l1 / 128;
        if(i2 != 3)
        {
            return;
        } else
        {
            class16.anInt240 = j / 128;
            class16.anInt241 = j1;
            class16.anInt242 = i;
            class16.anInt243 = k1;
            class16.anInt244 = l1;
            class16.anInt245 = j;
            class16.anInt246 = i1;
            class16.anInt247 = k;
            aClass16ArrayArray515[l][anIntArray514[l]++] = class16;
            return;
        }
    }

    public void method295(int i, int j, int k, int l)
    {
        Class39_Sub2 class39_sub2 = aClass39_Sub2ArrayArrayArray482[i][j][k];
        if(class39_sub2 == null)
        {
            return;
        } else
        {
            aClass39_Sub2ArrayArrayArray482[i][j][k].anInt1411 = l;
            return;
        }
    }

    public void method296(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, int j2, int k2, int l2, int i3, int j3, 
            int k3, int l3, int i4, int j4, int k4, int l4)
    {
        if(l == 0)
        {
            Class43 class43 = new Class43(k2, l2, i3, j3, -1, k4, false);
            for(int i5 = i; i5 >= 0; i5--)
                if(aClass39_Sub2ArrayArrayArray482[i5][j][k] == null)
                    aClass39_Sub2ArrayArrayArray482[i5][j][k] = new Class39_Sub2(i5, j, k);

            aClass39_Sub2ArrayArrayArray482[i][j][k].aClass43_1401 = class43;
            return;
        }
        if(l == 1)
        {
            Class43 class43_1 = new Class43(k3, l3, i4, j4, j1, l4, k1 == l1 && k1 == i2 && k1 == j2);
            for(int j5 = i; j5 >= 0; j5--)
                if(aClass39_Sub2ArrayArrayArray482[j5][j][k] == null)
                    aClass39_Sub2ArrayArrayArray482[j5][j][k] = new Class39_Sub2(j5, j, k);

            aClass39_Sub2ArrayArrayArray482[i][j][k].aClass43_1401 = class43_1;
            return;
        }
        Class7 class7 = new Class7(l3, k, i2, j3, j4, j1, i3, k4, i1, i4, l1, k2, j, l2, j2, l, k1, (byte)6, k3, l4);
        for(int k5 = i; k5 >= 0; k5--)
            if(aClass39_Sub2ArrayArrayArray482[k5][j][k] == null)
                aClass39_Sub2ArrayArrayArray482[k5][j][k] = new Class39_Sub2(k5, j, k);

        aClass39_Sub2ArrayArrayArray482[i][j][k].aClass7_1402 = class7;
    }

    public void method297(int i, byte byte0, int j, int k, Class39_Sub3_Sub2 class39_sub3_sub2, int l, int i1, 
            int j1)
    {
        if(class39_sub3_sub2 == null)
            return;
        Class48 class48 = new Class48();
        class48.aClass39_Sub3_Sub2_825 = class39_sub3_sub2;
        class48.anInt823 = k * 128 + 64;
        if(i1 != 3)
        {
            for(int k1 = 1; k1 > 0; k1++);
        }
        class48.anInt824 = i * 128 + 64;
        class48.anInt822 = l;
        class48.anInt826 = j1;
        class48.aByte827 = byte0;
        if(aClass39_Sub2ArrayArrayArray482[j][k][i] == null)
            aClass39_Sub2ArrayArrayArray482[j][k][i] = new Class39_Sub2(j, k, i);
        aClass39_Sub2ArrayArrayArray482[j][k][i].aClass48_1405 = class48;
    }

    public void method298(int i, int j, Class39_Sub3_Sub2 class39_sub3_sub2, Class39_Sub3_Sub2 class39_sub3_sub2_1, Class39_Sub3_Sub2 class39_sub3_sub2_2, int k, int l, 
            int i1, int j1)
    {
        if(i != 49058)
            return;
        Class2 class2 = new Class2();
        class2.aClass39_Sub3_Sub2_43 = class39_sub3_sub2;
        class2.anInt41 = k * 128 + 64;
        class2.anInt42 = j1 * 128 + 64;
        class2.anInt40 = i1;
        class2.anInt46 = j;
        class2.aClass39_Sub3_Sub2_44 = class39_sub3_sub2_1;
        class2.aClass39_Sub3_Sub2_45 = class39_sub3_sub2_2;
        int k1 = 0;
        Class39_Sub2 class39_sub2 = aClass39_Sub2ArrayArrayArray482[l][k][j1];
        if(class39_sub2 != null)
        {
            for(int l1 = 0; l1 < class39_sub2.anInt1407; l1++)
                if(class39_sub2.aClass9Array1408[l1].aClass39_Sub3_Sub2_168 instanceof Class39_Sub3_Sub2_Sub4)
                {
                    int i2 = ((Class39_Sub3_Sub2_Sub4)class39_sub2.aClass9Array1408[l1].aClass39_Sub3_Sub2_168).anInt1553;
                    if(i2 > k1)
                        k1 = i2;
                }

        }
        class2.anInt47 = k1;
        if(aClass39_Sub2ArrayArrayArray482[l][k][j1] == null)
            aClass39_Sub2ArrayArrayArray482[l][k][j1] = new Class39_Sub2(l, k, j1);
        aClass39_Sub2ArrayArrayArray482[l][k][j1].aClass2_1406 = class2;
    }

    public void method299(int i, int j, Class39_Sub3_Sub2 class39_sub3_sub2, Class39_Sub3_Sub2 class39_sub3_sub2_1, byte byte0, int k, int l, 
            int i1, byte byte1, int j1, int k1)
    {
        if(byte1 != -82)
            return;
        if(class39_sub3_sub2 == null && class39_sub3_sub2_1 == null)
            return;
        Class28 class28 = new Class28();
        class28.anInt418 = k1;
        class28.aByte419 = byte0;
        class28.anInt412 = i * 128 + 64;
        class28.anInt413 = j1 * 128 + 64;
        class28.anInt411 = i1;
        class28.aClass39_Sub3_Sub2_416 = class39_sub3_sub2;
        class28.aClass39_Sub3_Sub2_417 = class39_sub3_sub2_1;
        class28.anInt414 = l;
        class28.anInt415 = k;
        for(int l1 = j; l1 >= 0; l1--)
            if(aClass39_Sub2ArrayArrayArray482[l1][i][j1] == null)
                aClass39_Sub2ArrayArrayArray482[l1][i][j1] = new Class39_Sub2(l1, i, j1);

        aClass39_Sub2ArrayArrayArray482[j][i][j1].aClass28_1403 = class28;
    }

    public void method300(Class39_Sub3_Sub2 class39_sub3_sub2, int i, byte byte0, int j, int k, int l, int i1, 
            int j1, int k1, int l1, int i2, int j2)
    {
        if(class39_sub3_sub2 == null)
            return;
        Class26 class26 = new Class26();
        class26.anInt357 = j2;
        class26.aByte358 = byte0;
        class26.anInt352 = i2 * 128 + 64 + j1;
        class26.anInt353 = l * 128 + 64 + l1;
        class26.anInt351 = k1;
        class26.aClass39_Sub3_Sub2_356 = class39_sub3_sub2;
        class26.anInt354 = k;
        for(class26.anInt355 = j; i >= 0;)
            return;

        for(int k2 = i1; k2 >= 0; k2--)
            if(aClass39_Sub2ArrayArrayArray482[k2][i2][l] == null)
                aClass39_Sub2ArrayArrayArray482[k2][i2][l] = new Class39_Sub2(k2, i2, l);

        aClass39_Sub2ArrayArrayArray482[i1][i2][l].aClass26_1404 = class26;
    }

    public boolean method301(int i, int j, byte byte0, int k, int l, int i1, int j1, 
            int k1, byte byte1, Class39_Sub3_Sub2 class39_sub3_sub2, int l1)
    {
        if(byte1 == 2)
        {
            byte1 = 0;
        } else
        {
            for(int i2 = 1; i2 > 0; i2++);
        }
        if(class39_sub3_sub2 == null)
        {
            return true;
        } else
        {
            int j2 = i * 128 + 64 * j;
            int k2 = k1 * 128 + 64 * l;
            return method304(k, i, k1, j, l, j2, k2, j1, class39_sub3_sub2, i1, false, l1, byte0);
        }
    }

    public boolean method302(int i, int j, int k, int l, int i1, boolean flag, int j1, 
            boolean flag1, Class39_Sub3_Sub2 class39_sub3_sub2, int k1)
    {
        if(class39_sub3_sub2 == null)
            return true;
        int l1 = j1 - k1;
        int i2 = i - k1;
        int j2 = j1 + k1;
        int k2 = i + k1;
        if(flag)
        {
            if(l > 640 && l < 1408)
                k2 += 128;
            if(l > 1152 && l < 1920)
                j2 += 128;
            if(l > 1664 || l < 384)
                i2 -= 128;
            if(l > 128 && l < 896)
                l1 -= 128;
        }
        l1 /= 128;
        if(flag1)
            aBoolean469 = !aBoolean469;
        i2 /= 128;
        j2 /= 128;
        k2 /= 128;
        return method304(i1, l1, i2, (j2 - l1) + 1, (k2 - i2) + 1, j1, i, j, class39_sub3_sub2, l, true, k, (byte)0);
    }

    public boolean method303(int i, Class39_Sub3_Sub2 class39_sub3_sub2, int j, int k, int l, int i1, int j1, 
            int k1, int l1, int i2, int j2, int k2, int l2)
    {
        if(l2 != -16624)
            throw new NullPointerException();
        if(class39_sub3_sub2 == null)
            return true;
        else
            return method304(k, j, i2, (l1 - j) + 1, (i - i2) + 1, k2, l, j2, class39_sub3_sub2, i1, true, k1, (byte)0);
    }

    public boolean method304(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, Class39_Sub3_Sub2 class39_sub3_sub2, int i2, boolean flag, int j2, byte byte0)
    {
        for(int k2 = j; k2 < j + l; k2++)
        {
            for(int l2 = k; l2 < k + i1; l2++)
            {
                if(k2 < 0 || l2 < 0 || k2 >= anInt479 || l2 >= anInt480)
                    return false;
                Class39_Sub2 class39_sub2 = aClass39_Sub2ArrayArrayArray482[i][k2][l2];
                if(class39_sub2 != null && class39_sub2.anInt1407 >= 5)
                    return false;
            }

        }

        Class9 class9 = new Class9();
        class9.anInt176 = j2;
        class9.aByte177 = byte0;
        class9.anInt164 = i;
        class9.anInt166 = j1;
        class9.anInt167 = k1;
        class9.anInt165 = l1;
        class9.aClass39_Sub3_Sub2_168 = class39_sub3_sub2;
        class9.anInt169 = i2;
        class9.anInt170 = j;
        class9.anInt172 = k;
        class9.anInt171 = (j + l) - 1;
        class9.anInt173 = (k + i1) - 1;
        for(int i3 = j; i3 < j + l; i3++)
        {
            for(int j3 = k; j3 < k + i1; j3++)
            {
                int k3 = 0;
                if(i3 > j)
                    k3++;
                if(i3 < (j + l) - 1)
                    k3 += 4;
                if(j3 > k)
                    k3 += 8;
                if(j3 < (k + i1) - 1)
                    k3 += 2;
                for(int l3 = i; l3 >= 0; l3--)
                    if(aClass39_Sub2ArrayArrayArray482[l3][i3][j3] == null)
                        aClass39_Sub2ArrayArrayArray482[l3][i3][j3] = new Class39_Sub2(l3, i3, j3);

                Class39_Sub2 class39_sub2_1 = aClass39_Sub2ArrayArrayArray482[i][i3][j3];
                class39_sub2_1.aClass9Array1408[class39_sub2_1.anInt1407] = class9;
                class39_sub2_1.anIntArray1409[class39_sub2_1.anInt1407] = k3;
                class39_sub2_1.anInt1410 |= k3;
                class39_sub2_1.anInt1407++;
            }

        }

        if(flag)
            aClass9Array485[anInt484++] = class9;
        return true;
    }

    public void method305(int i)
    {
        for(int j = 0; j < anInt484; j++)
        {
            Class9 class9 = aClass9Array485[j];
            method306(7, class9);
            aClass9Array485[j] = null;
        }

        if(i < 9 || i > 9)
        {
            return;
        } else
        {
            anInt484 = 0;
            return;
        }
    }

    public void method306(int i, Class9 class9)
    {
        for(int j = class9.anInt170; j <= class9.anInt171; j++)
        {
            for(int k = class9.anInt172; k <= class9.anInt173; k++)
            {
                Class39_Sub2 class39_sub2 = aClass39_Sub2ArrayArrayArray482[class9.anInt164][j][k];
                if(class39_sub2 != null)
                {
                    for(int i1 = 0; i1 < class39_sub2.anInt1407; i1++)
                    {
                        if(class39_sub2.aClass9Array1408[i1] != class9)
                            continue;
                        class39_sub2.anInt1407--;
                        for(int j1 = i1; j1 < class39_sub2.anInt1407; j1++)
                        {
                            class39_sub2.aClass9Array1408[j1] = class39_sub2.aClass9Array1408[j1 + 1];
                            class39_sub2.anIntArray1409[j1] = class39_sub2.anIntArray1409[j1 + 1];
                        }

                        class39_sub2.aClass9Array1408[class39_sub2.anInt1407] = null;
                        break;
                    }

                    class39_sub2.anInt1410 = 0;
                    for(int k1 = 0; k1 < class39_sub2.anInt1407; k1++)
                        class39_sub2.anInt1410 |= class39_sub2.anIntArray1409[k1];

                }
            }

        }

        if(i != 7)
        {
            for(int l = 1; l > 0; l++);
        }
    }

    public void method307(int i, int j, boolean flag, int k, int l)
    {
        Class39_Sub2 class39_sub2 = aClass39_Sub2ArrayArrayArray482[i][j][l];
        if(!flag)
        {
            for(int i1 = 1; i1 > 0; i1++);
        }
        if(class39_sub2 == null)
            return;
        Class26 class26 = class39_sub2.aClass26_1404;
        if(class26 == null)
        {
            return;
        } else
        {
            int j1 = j * 128 + 64;
            int k1 = l * 128 + 64;
            class26.anInt352 = j1 + ((class26.anInt352 - j1) * k) / 16;
            class26.anInt353 = k1 + ((class26.anInt353 - k1) * k) / 16;
            return;
        }
    }

    public void method308(int i, int j, int k, byte byte0)
    {
        if(byte0 != 17)
            aBoolean476 = !aBoolean476;
        Class39_Sub2 class39_sub2 = aClass39_Sub2ArrayArrayArray482[j][k][i];
        if(class39_sub2 == null)
        {
            return;
        } else
        {
            class39_sub2.aClass28_1403 = null;
            return;
        }
    }

    public void method309(int i, int j, int k, int l)
    {
        if(l != 1)
            return;
        Class39_Sub2 class39_sub2 = aClass39_Sub2ArrayArrayArray482[j][i][k];
        if(class39_sub2 == null)
        {
            return;
        } else
        {
            class39_sub2.aClass26_1404 = null;
            return;
        }
    }

    public void method310(boolean flag, int i, int j, int k)
    {
        Class39_Sub2 class39_sub2 = aClass39_Sub2ArrayArrayArray482[j][i][k];
        if(!flag)
            anInt473 = 255;
        if(class39_sub2 == null)
            return;
        for(int l = 0; l < class39_sub2.anInt1407; l++)
        {
            Class9 class9 = class39_sub2.aClass9Array1408[l];
            if((class9.anInt176 >> 29 & 3) == 2 && class9.anInt170 == i && class9.anInt172 == k)
            {
                method306(7, class9);
                return;
            }
        }

    }

    public void method311(int i, int j, int k, int l)
    {
        Class39_Sub2 class39_sub2 = aClass39_Sub2ArrayArrayArray482[l][i][j];
        if(k >= 0)
            return;
        if(class39_sub2 == null)
        {
            return;
        } else
        {
            class39_sub2.aClass48_1405 = null;
            return;
        }
    }

    public void method312(int i, int j, int k)
    {
        Class39_Sub2 class39_sub2 = aClass39_Sub2ArrayArrayArray482[i][j][k];
        if(class39_sub2 == null)
        {
            return;
        } else
        {
            class39_sub2.aClass2_1406 = null;
            return;
        }
    }

    public Class28 method313(int i, int j, int k, int l)
    {
        Class39_Sub2 class39_sub2 = aClass39_Sub2ArrayArrayArray482[i][k][j];
        if(l != -17367)
            anInt475 = -90;
        if(class39_sub2 == null)
            return null;
        else
            return class39_sub2.aClass28_1403;
    }

    public Class26 method314(int i, byte byte0, int j, int k)
    {
        if(byte0 == 6)
            byte0 = 0;
        else
            throw new NullPointerException();
        Class39_Sub2 class39_sub2 = aClass39_Sub2ArrayArrayArray482[k][i][j];
        if(class39_sub2 == null)
            return null;
        else
            return class39_sub2.aClass26_1404;
    }

    public Class9 method315(boolean flag, int i, int j, int k)
    {
        Class39_Sub2 class39_sub2 = aClass39_Sub2ArrayArrayArray482[k][i][j];
        if(class39_sub2 == null)
            return null;
        for(int l = 0; l < class39_sub2.anInt1407; l++)
        {
            Class9 class9 = class39_sub2.aClass9Array1408[l];
            if((class9.anInt176 >> 29 & 3) == 2 && class9.anInt170 == i && class9.anInt172 == j)
                return class9;
        }

        if(flag)
            throw new NullPointerException();
        else
            return null;
    }

    public Class48 method316(int i, int j, byte byte0, int k)
    {
        if(byte0 != 3)
            throw new NullPointerException();
        Class39_Sub2 class39_sub2 = aClass39_Sub2ArrayArrayArray482[i][k][j];
        if(class39_sub2 == null || class39_sub2.aClass48_1405 == null)
            return null;
        else
            return class39_sub2.aClass48_1405;
    }

    public int method317(int i, int j, int k)
    {
        Class39_Sub2 class39_sub2 = aClass39_Sub2ArrayArrayArray482[i][j][k];
        if(class39_sub2 == null || class39_sub2.aClass28_1403 == null)
            return 0;
        else
            return class39_sub2.aClass28_1403.anInt418;
    }

    public int method318(byte byte0, int i, int j, int k)
    {
        Class39_Sub2 class39_sub2 = aClass39_Sub2ArrayArrayArray482[i][j][k];
        if(byte0 != -87)
            aBoolean469 = !aBoolean469;
        if(class39_sub2 == null || class39_sub2.aClass26_1404 == null)
            return 0;
        else
            return class39_sub2.aClass26_1404.anInt357;
    }

    public int method319(int i, int j, int k)
    {
        Class39_Sub2 class39_sub2 = aClass39_Sub2ArrayArrayArray482[i][j][k];
        if(class39_sub2 == null)
            return 0;
        for(int l = 0; l < class39_sub2.anInt1407; l++)
        {
            Class9 class9 = class39_sub2.aClass9Array1408[l];
            if((class9.anInt176 >> 29 & 3) == 2 && class9.anInt170 == j && class9.anInt172 == k)
                return class9.anInt176;
        }

        return 0;
    }

    public int method320(int i, int j, int k)
    {
        Class39_Sub2 class39_sub2 = aClass39_Sub2ArrayArrayArray482[i][j][k];
        if(class39_sub2 == null || class39_sub2.aClass48_1405 == null)
            return 0;
        else
            return class39_sub2.aClass48_1405.anInt826;
    }

    public int method321(int i, int j, int k, int l)
    {
        Class39_Sub2 class39_sub2 = aClass39_Sub2ArrayArrayArray482[i][j][k];
        if(class39_sub2 == null)
            return -1;
        if(class39_sub2.aClass28_1403 != null && class39_sub2.aClass28_1403.anInt418 == l)
            return class39_sub2.aClass28_1403.aByte419 & 0xff;
        if(class39_sub2.aClass26_1404 != null && class39_sub2.aClass26_1404.anInt357 == l)
            return class39_sub2.aClass26_1404.aByte358 & 0xff;
        if(class39_sub2.aClass48_1405 != null && class39_sub2.aClass48_1405.anInt826 == l)
            return class39_sub2.aClass48_1405.aByte827 & 0xff;
        for(int i1 = 0; i1 < class39_sub2.anInt1407; i1++)
            if(class39_sub2.aClass9Array1408[i1].anInt176 == l)
                return class39_sub2.aClass9Array1408[i1].aByte177 & 0xff;

        return -1;
    }

    public void method322(int i, int j, int k, int l)
    {
        for(int i1 = 0; i1 < anInt478; i1++)
        {
            for(int j1 = 0; j1 < anInt479; j1++)
            {
                for(int k1 = 0; k1 < anInt480; k1++)
                {
                    Class39_Sub2 class39_sub2 = aClass39_Sub2ArrayArrayArray482[i1][j1][k1];
                    if(class39_sub2 != null)
                    {
                        Class28 class28 = class39_sub2.aClass28_1403;
                        if(class28 != null && class28.aClass39_Sub3_Sub2_416 != null && class28.aClass39_Sub3_Sub2_416.aClass18Array1430 != null)
                        {
                            method324(1, (Class39_Sub3_Sub2_Sub4)class28.aClass39_Sub3_Sub2_416, -789, 1, k1, i1, j1);
                            if(class28.aClass39_Sub3_Sub2_417 != null && class28.aClass39_Sub3_Sub2_417.aClass18Array1430 != null)
                            {
                                method324(1, (Class39_Sub3_Sub2_Sub4)class28.aClass39_Sub3_Sub2_417, -789, 1, k1, i1, j1);
                                method325((Class39_Sub3_Sub2_Sub4)class28.aClass39_Sub3_Sub2_416, (Class39_Sub3_Sub2_Sub4)class28.aClass39_Sub3_Sub2_417, 0, 0, 0, false);
                                ((Class39_Sub3_Sub2_Sub4)class28.aClass39_Sub3_Sub2_417).method405(k, i, 529, l);
                            }
                            ((Class39_Sub3_Sub2_Sub4)class28.aClass39_Sub3_Sub2_416).method405(k, i, 529, l);
                        }
                        for(int l1 = 0; l1 < class39_sub2.anInt1407; l1++)
                        {
                            Class9 class9 = class39_sub2.aClass9Array1408[l1];
                            if(class9 != null && class9.aClass39_Sub3_Sub2_168 != null && class9.aClass39_Sub3_Sub2_168.aClass18Array1430 != null)
                            {
                                method324((class9.anInt171 - class9.anInt170) + 1, (Class39_Sub3_Sub2_Sub4)class9.aClass39_Sub3_Sub2_168, -789, (class9.anInt173 - class9.anInt172) + 1, k1, i1, j1);
                                ((Class39_Sub3_Sub2_Sub4)class9.aClass39_Sub3_Sub2_168).method405(k, i, 529, l);
                            }
                        }

                        Class48 class48 = class39_sub2.aClass48_1405;
                        if(class48 != null && class48.aClass39_Sub3_Sub2_825.aClass18Array1430 != null)
                        {
                            method323(-616, i1, j1, (Class39_Sub3_Sub2_Sub4)class48.aClass39_Sub3_Sub2_825, k1);
                            ((Class39_Sub3_Sub2_Sub4)class48.aClass39_Sub3_Sub2_825).method405(k, i, 529, l);
                        }
                    }
                }

            }

        }

        if(j != anInt471)
            anInt475 = 306;
    }

    public void method323(int i, int j, int k, Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4, int l)
    {
        if(i >= 0)
            aBoolean470 = !aBoolean470;
        if(k < anInt479)
        {
            Class39_Sub2 class39_sub2 = aClass39_Sub2ArrayArrayArray482[j][k + 1][l];
            if(class39_sub2 != null && class39_sub2.aClass48_1405 != null && class39_sub2.aClass48_1405.aClass39_Sub3_Sub2_825.aClass18Array1430 != null)
                method325(class39_sub3_sub2_sub4, (Class39_Sub3_Sub2_Sub4)class39_sub2.aClass48_1405.aClass39_Sub3_Sub2_825, 128, 0, 0, true);
        }
        if(l < anInt479)
        {
            Class39_Sub2 class39_sub2_1 = aClass39_Sub2ArrayArrayArray482[j][k][l + 1];
            if(class39_sub2_1 != null && class39_sub2_1.aClass48_1405 != null && class39_sub2_1.aClass48_1405.aClass39_Sub3_Sub2_825.aClass18Array1430 != null)
                method325(class39_sub3_sub2_sub4, (Class39_Sub3_Sub2_Sub4)class39_sub2_1.aClass48_1405.aClass39_Sub3_Sub2_825, 0, 0, 128, true);
        }
        if(k < anInt479 && l < anInt480)
        {
            Class39_Sub2 class39_sub2_2 = aClass39_Sub2ArrayArrayArray482[j][k + 1][l + 1];
            if(class39_sub2_2 != null && class39_sub2_2.aClass48_1405 != null && class39_sub2_2.aClass48_1405.aClass39_Sub3_Sub2_825.aClass18Array1430 != null)
                method325(class39_sub3_sub2_sub4, (Class39_Sub3_Sub2_Sub4)class39_sub2_2.aClass48_1405.aClass39_Sub3_Sub2_825, 128, 0, 128, true);
        }
        if(k < anInt479 && l > 0)
        {
            Class39_Sub2 class39_sub2_3 = aClass39_Sub2ArrayArrayArray482[j][k + 1][l - 1];
            if(class39_sub2_3 != null && class39_sub2_3.aClass48_1405 != null && class39_sub2_3.aClass48_1405.aClass39_Sub3_Sub2_825.aClass18Array1430 != null)
                method325(class39_sub3_sub2_sub4, (Class39_Sub3_Sub2_Sub4)class39_sub2_3.aClass48_1405.aClass39_Sub3_Sub2_825, 128, 0, -128, true);
        }
    }

    public void method324(int i, Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4, int j, int k, int l, int i1, int j1)
    {
        boolean flag = true;
        int k1 = j1;
        int l1 = j1 + i;
        int i2 = l - 1;
        int j2 = l + k;
        for(int k2 = i1; k2 <= i1 + 1; k2++)
            if(k2 != anInt478)
            {
                for(int l2 = k1; l2 <= l1; l2++)
                    if(l2 >= 0 && l2 < anInt479)
                    {
                        for(int j3 = i2; j3 <= j2; j3++)
                            if(j3 >= 0 && j3 < anInt480 && (!flag || l2 >= l1 || j3 >= j2 || j3 < l && l2 != j1))
                            {
                                Class39_Sub2 class39_sub2 = aClass39_Sub2ArrayArrayArray482[k2][l2][j3];
                                if(class39_sub2 != null)
                                {
                                    int k3 = (anIntArrayArrayArray481[k2][l2][j3] + anIntArrayArrayArray481[k2][l2 + 1][j3] + anIntArrayArrayArray481[k2][l2][j3 + 1] + anIntArrayArrayArray481[k2][l2 + 1][j3 + 1]) / 4 - (anIntArrayArrayArray481[i1][j1][l] + anIntArrayArrayArray481[i1][j1 + 1][l] + anIntArrayArrayArray481[i1][j1][l + 1] + anIntArrayArrayArray481[i1][j1 + 1][l + 1]) / 4;
                                    Class28 class28 = class39_sub2.aClass28_1403;
                                    if(class28 != null && class28.aClass39_Sub3_Sub2_416 != null && class28.aClass39_Sub3_Sub2_416.aClass18Array1430 != null)
                                        method325(class39_sub3_sub2_sub4, (Class39_Sub3_Sub2_Sub4)class28.aClass39_Sub3_Sub2_416, (l2 - j1) * 128 + (1 - i) * 64, k3, (j3 - l) * 128 + (1 - k) * 64, flag);
                                    if(class28 != null && class28.aClass39_Sub3_Sub2_417 != null && class28.aClass39_Sub3_Sub2_417.aClass18Array1430 != null)
                                        method325(class39_sub3_sub2_sub4, (Class39_Sub3_Sub2_Sub4)class28.aClass39_Sub3_Sub2_417, (l2 - j1) * 128 + (1 - i) * 64, k3, (j3 - l) * 128 + (1 - k) * 64, flag);
                                    for(int l3 = 0; l3 < class39_sub2.anInt1407; l3++)
                                    {
                                        Class9 class9 = class39_sub2.aClass9Array1408[l3];
                                        if(class9 != null && class9.aClass39_Sub3_Sub2_168 != null && class9.aClass39_Sub3_Sub2_168.aClass18Array1430 != null)
                                        {
                                            int i4 = (class9.anInt171 - class9.anInt170) + 1;
                                            int j4 = (class9.anInt173 - class9.anInt172) + 1;
                                            method325(class39_sub3_sub2_sub4, (Class39_Sub3_Sub2_Sub4)class9.aClass39_Sub3_Sub2_168, (class9.anInt170 - j1) * 128 + (i4 - i) * 64, k3, (class9.anInt172 - l) * 128 + (j4 - k) * 64, flag);
                                        }
                                    }

                                }
                            }

                    }

                k1--;
                flag = false;
            }

        if(j >= 0)
        {
            for(int i3 = 1; i3 > 0; i3++);
        }
    }

    public void method325(Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4, Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4_1, int i, int j, int k, boolean flag)
    {
        anInt529++;
        int l = 0;
        int ai[] = class39_sub3_sub2_sub4_1.anIntArray1527;
        int i1 = class39_sub3_sub2_sub4_1.anInt1526;
        int j1 = class39_sub3_sub2_sub4_1.anInt1547 >> 16;
        int k1 = (class39_sub3_sub2_sub4_1.anInt1547 << 16) >> 16;
        int l1 = class39_sub3_sub2_sub4_1.anInt1548 >> 16;
        int i2 = (class39_sub3_sub2_sub4_1.anInt1548 << 16) >> 16;
        for(int j2 = 0; j2 < class39_sub3_sub2_sub4.anInt1526; j2++)
        {
            Class18 class18 = ((Class39_Sub3_Sub2) (class39_sub3_sub2_sub4)).aClass18Array1430[j2];
            Class18 class18_1 = class39_sub3_sub2_sub4.aClass18Array1559[j2];
            if(class18_1.anInt265 != 0)
            {
                int i3 = class39_sub3_sub2_sub4.anIntArray1528[j2] - j;
                if(i3 <= class39_sub3_sub2_sub4_1.anInt1550)
                {
                    int j3 = class39_sub3_sub2_sub4.anIntArray1527[j2] - i;
                    if(j3 >= j1 && j3 <= k1)
                    {
                        int k3 = class39_sub3_sub2_sub4.anIntArray1529[j2] - k;
                        if(k3 >= i2 && k3 <= l1)
                        {
                            for(int l3 = 0; l3 < i1; l3++)
                            {
                                Class18 class18_2 = ((Class39_Sub3_Sub2) (class39_sub3_sub2_sub4_1)).aClass18Array1430[l3];
                                Class18 class18_3 = class39_sub3_sub2_sub4_1.aClass18Array1559[l3];
                                if(j3 == ai[l3] && k3 == class39_sub3_sub2_sub4_1.anIntArray1529[l3] && i3 == class39_sub3_sub2_sub4_1.anIntArray1528[l3] && class18_3.anInt265 != 0)
                                {
                                    class18.anInt262 += class18_3.anInt262;
                                    class18.anInt263 += class18_3.anInt263;
                                    class18.anInt264 += class18_3.anInt264;
                                    class18.anInt265 += class18_3.anInt265;
                                    class18_2.anInt262 += class18_1.anInt262;
                                    class18_2.anInt263 += class18_1.anInt263;
                                    class18_2.anInt264 += class18_1.anInt264;
                                    class18_2.anInt265 += class18_1.anInt265;
                                    l++;
                                    anIntArray527[j2] = anInt529;
                                    anIntArray528[l3] = anInt529;
                                }
                            }

                        }
                    }
                }
            }
        }

        if(l < 3 || !flag)
            return;
        for(int k2 = 0; k2 < class39_sub3_sub2_sub4.anInt1530; k2++)
            if(anIntArray527[class39_sub3_sub2_sub4.anIntArray1531[k2]] == anInt529 && anIntArray527[class39_sub3_sub2_sub4.anIntArray1532[k2]] == anInt529 && anIntArray527[class39_sub3_sub2_sub4.anIntArray1533[k2]] == anInt529)
                class39_sub3_sub2_sub4.anIntArray1537[k2] = -1;

        for(int l2 = 0; l2 < class39_sub3_sub2_sub4_1.anInt1530; l2++)
            if(anIntArray528[class39_sub3_sub2_sub4_1.anIntArray1531[l2]] == anInt529 && anIntArray528[class39_sub3_sub2_sub4_1.anIntArray1532[l2]] == anInt529 && anIntArray528[class39_sub3_sub2_sub4_1.anIntArray1533[l2]] == anInt529)
                class39_sub3_sub2_sub4_1.anIntArray1537[l2] = -1;

    }

    public void method326(int ai[], int i, int j, int k, int l, int i1)
    {
        Class39_Sub2 class39_sub2 = aClass39_Sub2ArrayArrayArray482[k][l][i1];
        if(class39_sub2 == null)
            return;
        Class43 class43 = class39_sub2.aClass43_1401;
        if(class43 != null)
        {
            int j1 = class43.anInt731;
            if(j1 == 0)
                return;
            for(int k1 = 0; k1 < 4; k1++)
            {
                ai[i] = j1;
                ai[i + 1] = j1;
                ai[i + 2] = j1;
                ai[i + 3] = j1;
                i += j;
            }

            return;
        }
        Class7 class7 = class39_sub2.aClass7_1402;
        if(class7 == null)
            return;
        int l1 = class7.anInt143;
        int i2 = class7.anInt144;
        int j2 = class7.anInt145;
        int k2 = class7.anInt146;
        int ai1[] = anIntArrayArray530[l1];
        int ai2[] = anIntArrayArray531[i2];
        int l2 = 0;
        if(j2 != 0)
        {
            for(int i3 = 0; i3 < 4; i3++)
            {
                ai[i] = ai1[ai2[l2++]] != 0 ? k2 : j2;
                ai[i + 1] = ai1[ai2[l2++]] != 0 ? k2 : j2;
                ai[i + 2] = ai1[ai2[l2++]] != 0 ? k2 : j2;
                ai[i + 3] = ai1[ai2[l2++]] != 0 ? k2 : j2;
                i += j;
            }

            return;
        }
        for(int j3 = 0; j3 < 4; j3++)
        {
            if(ai1[ai2[l2++]] != 0)
                ai[i] = k2;
            if(ai1[ai2[l2++]] != 0)
                ai[i + 1] = k2;
            if(ai1[ai2[l2++]] != 0)
                ai[i + 2] = k2;
            if(ai1[ai2[l2++]] != 0)
                ai[i + 3] = k2;
            i += j;
        }

    }

    public static void method327(int i, int j, int ai[], int k, byte byte0, int l)
    {
        anInt536 = 0;
        anInt537 = 0;
        anInt538 = i;
        anInt539 = j;
        anInt534 = i / 2;
        anInt535 = j / 2;
        boolean aflag[][][][] = new boolean[9][32][53][53];
        if(byte0 != 4)
            anInt475 = 388;
        for(int i1 = 128; i1 <= 384; i1 += 32)
        {
            for(int j1 = 0; j1 < 2048; j1 += 64)
            {
                anInt499 = Class39_Sub3_Sub2_Sub4.anIntArray1588[i1];
                anInt500 = Class39_Sub3_Sub2_Sub4.anIntArray1589[i1];
                anInt501 = Class39_Sub3_Sub2_Sub4.anIntArray1588[j1];
                anInt502 = Class39_Sub3_Sub2_Sub4.anIntArray1589[j1];
                int l1 = (i1 - 128) / 32;
                int j2 = j1 / 64;
                for(int l2 = -26; l2 <= 26; l2++)
                {
                    for(int j3 = -26; j3 <= 26; j3++)
                    {
                        int k3 = l2 * 128;
                        int i4 = j3 * 128;
                        boolean flag1 = false;
                        for(int k4 = -k; k4 <= l; k4 += 128)
                        {
                            if(!method328(i4, ai[l1] + k4, k3, 0))
                                continue;
                            flag1 = true;
                            break;
                        }

                        aflag[l1][j2][l2 + 25 + 1][j3 + 25 + 1] = flag1;
                    }

                }

            }

        }

        for(int k1 = 0; k1 < 8; k1++)
        {
            for(int i2 = 0; i2 < 32; i2++)
            {
                for(int k2 = -25; k2 < 25; k2++)
                {
                    for(int i3 = -25; i3 < 25; i3++)
                    {
                        boolean flag = false;
label0:
                        for(int l3 = -1; l3 <= 1; l3++)
                        {
                            for(int j4 = -1; j4 <= 1; j4++)
                            {
                                if(aflag[k1][i2][k2 + l3 + 25 + 1][i3 + j4 + 25 + 1])
                                    flag = true;
                                else
                                if(aflag[k1][(i2 + 1) % 31][k2 + l3 + 25 + 1][i3 + j4 + 25 + 1])
                                    flag = true;
                                else
                                if(aflag[k1 + 1][i2][k2 + l3 + 25 + 1][i3 + j4 + 25 + 1])
                                {
                                    flag = true;
                                } else
                                {
                                    if(!aflag[k1 + 1][(i2 + 1) % 31][k2 + l3 + 25 + 1][i3 + j4 + 25 + 1])
                                        continue;
                                    flag = true;
                                }
                                break label0;
                            }

                        }

                        aBooleanArrayArrayArrayArray532[k1][i2][k2 + 25][i3 + 25] = flag;
                    }

                }

            }

        }

    }

    public static boolean method328(int i, int j, int k, int l)
    {
        int i1 = i * anInt501 + k * anInt502 >> 16;
        int j1 = i * anInt502 - k * anInt501 >> 16;
        int k1 = j * anInt499 + j1 * anInt500 >> 16;
        int l1 = j * anInt500 - j1 * anInt499 >> 16;
        if(l != 0)
            anInt475 = -142;
        if(k1 < 50 || k1 > 3500)
            return false;
        int i2 = anInt534 + (i1 << 9) / k1;
        int j2 = anInt535 + (l1 << 9) / k1;
        return i2 >= anInt536 && i2 <= anInt538 && j2 >= anInt537 && j2 <= anInt539;
    }

    public void method329(int i, int j, int k)
    {
        aBoolean508 = true;
        anInt509 = k;
        anInt510 = i;
        if(j >= 0)
        {
            return;
        } else
        {
            anInt511 = -1;
            anInt512 = -1;
            return;
        }
    }

    public void method330(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        if(k < 0)
            k = 0;
        else
        if(k >= anInt479 * 128)
            k = anInt479 * 128 - 1;
        if(i < 0)
            i = 0;
        else
        if(i >= anInt480 * 128)
            i = anInt480 * 128 - 1;
        anInt489++;
        anInt499 = Class39_Sub3_Sub2_Sub4.anIntArray1588[j1];
        anInt500 = Class39_Sub3_Sub2_Sub4.anIntArray1589[j1];
        anInt501 = Class39_Sub3_Sub2_Sub4.anIntArray1588[l];
        anInt502 = Class39_Sub3_Sub2_Sub4.anIntArray1589[l];
        aBooleanArrayArray533 = aBooleanArrayArrayArrayArray532[(j1 - 128) / 32][l / 64];
        anInt496 = k;
        anInt497 = j;
        anInt498 = i;
        if(i1 != 48199)
            aBoolean470 = !aBoolean470;
        anInt494 = k / 128;
        anInt495 = i / 128;
        anInt488 = k1;
        anInt490 = anInt494 - 25;
        if(anInt490 < 0)
            anInt490 = 0;
        anInt492 = anInt495 - 25;
        if(anInt492 < 0)
            anInt492 = 0;
        anInt491 = anInt494 + 25;
        if(anInt491 > anInt479)
            anInt491 = anInt479;
        anInt493 = anInt495 + 25;
        if(anInt493 > anInt480)
            anInt493 = anInt480;
        method336(true);
        anInt487 = 0;
        for(int l1 = anInt483; l1 < anInt478; l1++)
        {
            Class39_Sub2 aclass39_sub2[][] = aClass39_Sub2ArrayArrayArray482[l1];
            for(int j2 = anInt490; j2 < anInt491; j2++)
            {
                for(int l2 = anInt492; l2 < anInt493; l2++)
                {
                    Class39_Sub2 class39_sub2 = aclass39_sub2[j2][l2];
                    if(class39_sub2 != null)
                        if(class39_sub2.anInt1411 > k1 || !aBooleanArrayArray533[(j2 - anInt494) + 25][(l2 - anInt495) + 25] && anIntArrayArrayArray481[l1][j2][l2] - j < 2000)
                        {
                            class39_sub2.aBoolean1412 = false;
                            class39_sub2.aBoolean1413 = false;
                            class39_sub2.anInt1415 = 0;
                        } else
                        {
                            class39_sub2.aBoolean1412 = true;
                            class39_sub2.aBoolean1413 = true;
                            if(class39_sub2.anInt1407 > 0)
                                class39_sub2.aBoolean1414 = true;
                            else
                                class39_sub2.aBoolean1414 = false;
                            anInt487++;
                        }
                }

            }

        }

        for(int i2 = anInt483; i2 < anInt478; i2++)
        {
            Class39_Sub2 aclass39_sub2_1[][] = aClass39_Sub2ArrayArrayArray482[i2];
            for(int i3 = -25; i3 <= 0; i3++)
            {
                int j3 = anInt494 + i3;
                int l3 = anInt494 - i3;
                if(j3 >= anInt490 || l3 < anInt491)
                {
                    for(int j4 = -25; j4 <= 0; j4++)
                    {
                        int l4 = anInt495 + j4;
                        int j5 = anInt495 - j4;
                        if(j3 >= anInt490)
                        {
                            if(l4 >= anInt492)
                            {
                                Class39_Sub2 class39_sub2_1 = aclass39_sub2_1[j3][l4];
                                if(class39_sub2_1 != null && class39_sub2_1.aBoolean1412)
                                    method331(class39_sub2_1, true);
                            }
                            if(j5 < anInt493)
                            {
                                Class39_Sub2 class39_sub2_2 = aclass39_sub2_1[j3][j5];
                                if(class39_sub2_2 != null && class39_sub2_2.aBoolean1412)
                                    method331(class39_sub2_2, true);
                            }
                        }
                        if(l3 < anInt491)
                        {
                            if(l4 >= anInt492)
                            {
                                Class39_Sub2 class39_sub2_3 = aclass39_sub2_1[l3][l4];
                                if(class39_sub2_3 != null && class39_sub2_3.aBoolean1412)
                                    method331(class39_sub2_3, true);
                            }
                            if(j5 < anInt493)
                            {
                                Class39_Sub2 class39_sub2_4 = aclass39_sub2_1[l3][j5];
                                if(class39_sub2_4 != null && class39_sub2_4.aBoolean1412)
                                    method331(class39_sub2_4, true);
                            }
                        }
                        if(anInt487 == 0)
                        {
                            aBoolean508 = false;
                            return;
                        }
                    }

                }
            }

        }

        for(int k2 = anInt483; k2 < anInt478; k2++)
        {
            Class39_Sub2 aclass39_sub2_2[][] = aClass39_Sub2ArrayArrayArray482[k2];
            for(int k3 = -25; k3 <= 0; k3++)
            {
                int i4 = anInt494 + k3;
                int k4 = anInt494 - k3;
                if(i4 >= anInt490 || k4 < anInt491)
                {
                    for(int i5 = -25; i5 <= 0; i5++)
                    {
                        int k5 = anInt495 + i5;
                        int l5 = anInt495 - i5;
                        if(i4 >= anInt490)
                        {
                            if(k5 >= anInt492)
                            {
                                Class39_Sub2 class39_sub2_5 = aclass39_sub2_2[i4][k5];
                                if(class39_sub2_5 != null && class39_sub2_5.aBoolean1412)
                                    method331(class39_sub2_5, false);
                            }
                            if(l5 < anInt493)
                            {
                                Class39_Sub2 class39_sub2_6 = aclass39_sub2_2[i4][l5];
                                if(class39_sub2_6 != null && class39_sub2_6.aBoolean1412)
                                    method331(class39_sub2_6, false);
                            }
                        }
                        if(k4 < anInt491)
                        {
                            if(k5 >= anInt492)
                            {
                                Class39_Sub2 class39_sub2_7 = aclass39_sub2_2[k4][k5];
                                if(class39_sub2_7 != null && class39_sub2_7.aBoolean1412)
                                    method331(class39_sub2_7, false);
                            }
                            if(l5 < anInt493)
                            {
                                Class39_Sub2 class39_sub2_8 = aclass39_sub2_2[k4][l5];
                                if(class39_sub2_8 != null && class39_sub2_8.aBoolean1412)
                                    method331(class39_sub2_8, false);
                            }
                        }
                        if(anInt487 == 0)
                        {
                            aBoolean508 = false;
                            return;
                        }
                    }

                }
            }

        }

        aBoolean508 = false;
    }

    public void method331(Class39_Sub2 class39_sub2, boolean flag)
    {
        aClass5_518.method182(class39_sub2);
        do
        {
            Class39_Sub2 class39_sub2_1;
            do
            {
                class39_sub2_1 = (Class39_Sub2)aClass5_518.method184();
                if(class39_sub2_1 == null)
                    return;
            } while(!class39_sub2_1.aBoolean1413);
            int i = class39_sub2_1.anInt1398;
            int j = class39_sub2_1.anInt1399;
            int k = class39_sub2_1.anInt1397;
            int l = class39_sub2_1.anInt1400;
            Class39_Sub2 aclass39_sub2[][] = aClass39_Sub2ArrayArrayArray482[k];
            if(class39_sub2_1.aBoolean1412)
            {
                if(flag)
                {
                    if(k > 0)
                    {
                        Class39_Sub2 class39_sub2_2 = aClass39_Sub2ArrayArrayArray482[k - 1][i][j];
                        if(class39_sub2_2 != null && class39_sub2_2.aBoolean1413)
                            continue;
                    }
                    if(i <= anInt494 && i > anInt490)
                    {
                        Class39_Sub2 class39_sub2_3 = aclass39_sub2[i - 1][j];
                        if(class39_sub2_3 != null && class39_sub2_3.aBoolean1413 && (class39_sub2_3.aBoolean1412 || (class39_sub2_1.anInt1410 & 1) == 0))
                            continue;
                    }
                    if(i >= anInt494 && i < anInt491 - 1)
                    {
                        Class39_Sub2 class39_sub2_4 = aclass39_sub2[i + 1][j];
                        if(class39_sub2_4 != null && class39_sub2_4.aBoolean1413 && (class39_sub2_4.aBoolean1412 || (class39_sub2_1.anInt1410 & 4) == 0))
                            continue;
                    }
                    if(j <= anInt495 && j > anInt492)
                    {
                        Class39_Sub2 class39_sub2_5 = aclass39_sub2[i][j - 1];
                        if(class39_sub2_5 != null && class39_sub2_5.aBoolean1413 && (class39_sub2_5.aBoolean1412 || (class39_sub2_1.anInt1410 & 8) == 0))
                            continue;
                    }
                    if(j >= anInt495 && j < anInt493 - 1)
                    {
                        Class39_Sub2 class39_sub2_6 = aclass39_sub2[i][j + 1];
                        if(class39_sub2_6 != null && class39_sub2_6.aBoolean1413 && (class39_sub2_6.aBoolean1412 || (class39_sub2_1.anInt1410 & 2) == 0))
                            continue;
                    }
                } else
                {
                    flag = true;
                }
                class39_sub2_1.aBoolean1412 = false;
                if(class39_sub2_1.aClass39_Sub2_1419 != null)
                {
                    Class39_Sub2 class39_sub2_7 = class39_sub2_1.aClass39_Sub2_1419;
                    if(class39_sub2_7.aClass43_1401 != null)
                    {
                        if(!method337(0, i, j))
                            method332(class39_sub2_7.aClass43_1401, 0, anInt499, anInt500, anInt501, anInt502, i, j);
                    } else
                    if(class39_sub2_7.aClass7_1402 != null && !method337(0, i, j))
                        method333(anInt499, 819, anInt500, j, i, anInt502, anInt501, class39_sub2_7.aClass7_1402);
                    Class28 class28 = class39_sub2_7.aClass28_1403;
                    if(class28 != null)
                        class28.aClass39_Sub3_Sub2_416.method378(0, anInt499, anInt500, anInt501, anInt502, class28.anInt412 - anInt496, class28.anInt411 - anInt497, class28.anInt413 - anInt498, class28.anInt418);
                    for(int i2 = 0; i2 < class39_sub2_7.anInt1407; i2++)
                    {
                        Class9 class9 = class39_sub2_7.aClass9Array1408[i2];
                        if(class9 != null)
                            class9.aClass39_Sub3_Sub2_168.method378(class9.anInt169, anInt499, anInt500, anInt501, anInt502, class9.anInt166 - anInt496, class9.anInt165 - anInt497, class9.anInt167 - anInt498, class9.anInt176);
                    }

                }
                boolean flag1 = false;
                if(class39_sub2_1.aClass43_1401 != null)
                {
                    if(!method337(l, i, j))
                    {
                        flag1 = true;
                        method332(class39_sub2_1.aClass43_1401, l, anInt499, anInt500, anInt501, anInt502, i, j);
                    }
                } else
                if(class39_sub2_1.aClass7_1402 != null && !method337(l, i, j))
                {
                    flag1 = true;
                    method333(anInt499, 819, anInt500, j, i, anInt502, anInt501, class39_sub2_1.aClass7_1402);
                }
                int j1 = 0;
                int j2 = 0;
                Class28 class28_3 = class39_sub2_1.aClass28_1403;
                Class26 class26_1 = class39_sub2_1.aClass26_1404;
                if(class28_3 != null || class26_1 != null)
                {
                    if(anInt494 == i)
                        j1++;
                    else
                    if(anInt494 < i)
                        j1 += 2;
                    if(anInt495 == j)
                        j1 += 3;
                    else
                    if(anInt495 > j)
                        j1 += 6;
                    j2 = anIntArray519[j1];
                    class39_sub2_1.anInt1418 = anIntArray521[j1];
                }
                if(class28_3 != null)
                {
                    if((class28_3.anInt414 & anIntArray520[j1]) != 0)
                    {
                        if(class28_3.anInt414 == 16)
                        {
                            class39_sub2_1.anInt1415 = 3;
                            class39_sub2_1.anInt1416 = anIntArray522[j1];
                            class39_sub2_1.anInt1417 = 3 - class39_sub2_1.anInt1416;
                        } else
                        if(class28_3.anInt414 == 32)
                        {
                            class39_sub2_1.anInt1415 = 6;
                            class39_sub2_1.anInt1416 = anIntArray523[j1];
                            class39_sub2_1.anInt1417 = 6 - class39_sub2_1.anInt1416;
                        } else
                        if(class28_3.anInt414 == 64)
                        {
                            class39_sub2_1.anInt1415 = 12;
                            class39_sub2_1.anInt1416 = anIntArray524[j1];
                            class39_sub2_1.anInt1417 = 12 - class39_sub2_1.anInt1416;
                        } else
                        {
                            class39_sub2_1.anInt1415 = 9;
                            class39_sub2_1.anInt1416 = anIntArray525[j1];
                            class39_sub2_1.anInt1417 = 9 - class39_sub2_1.anInt1416;
                        }
                    } else
                    {
                        class39_sub2_1.anInt1415 = 0;
                    }
                    if((class28_3.anInt414 & j2) != 0 && !method338(l, i, j, class28_3.anInt414))
                        class28_3.aClass39_Sub3_Sub2_416.method378(0, anInt499, anInt500, anInt501, anInt502, class28_3.anInt412 - anInt496, class28_3.anInt411 - anInt497, class28_3.anInt413 - anInt498, class28_3.anInt418);
                    if((class28_3.anInt415 & j2) != 0 && !method338(l, i, j, class28_3.anInt415))
                        class28_3.aClass39_Sub3_Sub2_417.method378(0, anInt499, anInt500, anInt501, anInt502, class28_3.anInt412 - anInt496, class28_3.anInt411 - anInt497, class28_3.anInt413 - anInt498, class28_3.anInt418);
                }
                if(class26_1 != null && !method339(l, i, j, class26_1.aClass39_Sub3_Sub2_356.anInt1431))
                    if((class26_1.anInt354 & j2) != 0)
                        class26_1.aClass39_Sub3_Sub2_356.method378(class26_1.anInt355, anInt499, anInt500, anInt501, anInt502, class26_1.anInt352 - anInt496, class26_1.anInt351 - anInt497, class26_1.anInt353 - anInt498, class26_1.anInt357);
                    else
                    if((class26_1.anInt354 & 0x300) != 0)
                    {
                        int j4 = class26_1.anInt352 - anInt496;
                        int l5 = class26_1.anInt351 - anInt497;
                        int k6 = class26_1.anInt353 - anInt498;
                        int i8 = class26_1.anInt355;
                        int k9;
                        if(i8 == 1 || i8 == 2)
                            k9 = -j4;
                        else
                            k9 = j4;
                        int k10;
                        if(i8 == 2 || i8 == 3)
                            k10 = -k6;
                        else
                            k10 = k6;
                        if((class26_1.anInt354 & 0x100) != 0 && k10 < k9)
                        {
                            int i11 = j4 + anIntArray504[i8];
                            int k11 = k6 + anIntArray505[i8];
                            class26_1.aClass39_Sub3_Sub2_356.method378(i8 * 512 + 256, anInt499, anInt500, anInt501, anInt502, i11, l5, k11, class26_1.anInt357);
                        }
                        if((class26_1.anInt354 & 0x200) != 0 && k10 > k9)
                        {
                            int j11 = j4 + anIntArray506[i8];
                            int l11 = k6 + anIntArray507[i8];
                            class26_1.aClass39_Sub3_Sub2_356.method378(i8 * 512 + 1280 & 0x7ff, anInt499, anInt500, anInt501, anInt502, j11, l5, l11, class26_1.anInt357);
                        }
                    }
                if(flag1)
                {
                    Class48 class48 = class39_sub2_1.aClass48_1405;
                    if(class48 != null)
                        class48.aClass39_Sub3_Sub2_825.method378(0, anInt499, anInt500, anInt501, anInt502, class48.anInt823 - anInt496, class48.anInt822 - anInt497, class48.anInt824 - anInt498, class48.anInt826);
                    Class2 class2_1 = class39_sub2_1.aClass2_1406;
                    if(class2_1 != null && class2_1.anInt47 == 0)
                    {
                        if(class2_1.aClass39_Sub3_Sub2_44 != null)
                            class2_1.aClass39_Sub3_Sub2_44.method378(0, anInt499, anInt500, anInt501, anInt502, class2_1.anInt41 - anInt496, class2_1.anInt40 - anInt497, class2_1.anInt42 - anInt498, class2_1.anInt46);
                        if(class2_1.aClass39_Sub3_Sub2_45 != null)
                            class2_1.aClass39_Sub3_Sub2_45.method378(0, anInt499, anInt500, anInt501, anInt502, class2_1.anInt41 - anInt496, class2_1.anInt40 - anInt497, class2_1.anInt42 - anInt498, class2_1.anInt46);
                        if(class2_1.aClass39_Sub3_Sub2_43 != null)
                            class2_1.aClass39_Sub3_Sub2_43.method378(0, anInt499, anInt500, anInt501, anInt502, class2_1.anInt41 - anInt496, class2_1.anInt40 - anInt497, class2_1.anInt42 - anInt498, class2_1.anInt46);
                    }
                }
                int k4 = class39_sub2_1.anInt1410;
                if(k4 != 0)
                {
                    if(i < anInt494 && (k4 & 4) != 0)
                    {
                        Class39_Sub2 class39_sub2_17 = aclass39_sub2[i + 1][j];
                        if(class39_sub2_17 != null && class39_sub2_17.aBoolean1413)
                            aClass5_518.method182(class39_sub2_17);
                    }
                    if(j < anInt495 && (k4 & 2) != 0)
                    {
                        Class39_Sub2 class39_sub2_18 = aclass39_sub2[i][j + 1];
                        if(class39_sub2_18 != null && class39_sub2_18.aBoolean1413)
                            aClass5_518.method182(class39_sub2_18);
                    }
                    if(i > anInt494 && (k4 & 1) != 0)
                    {
                        Class39_Sub2 class39_sub2_19 = aclass39_sub2[i - 1][j];
                        if(class39_sub2_19 != null && class39_sub2_19.aBoolean1413)
                            aClass5_518.method182(class39_sub2_19);
                    }
                    if(j > anInt495 && (k4 & 8) != 0)
                    {
                        Class39_Sub2 class39_sub2_20 = aclass39_sub2[i][j - 1];
                        if(class39_sub2_20 != null && class39_sub2_20.aBoolean1413)
                            aClass5_518.method182(class39_sub2_20);
                    }
                }
            }
            if(class39_sub2_1.anInt1415 != 0)
            {
                boolean flag2 = true;
                for(int k1 = 0; k1 < class39_sub2_1.anInt1407; k1++)
                {
                    if(class39_sub2_1.aClass9Array1408[k1].anInt175 == anInt489 || (class39_sub2_1.anIntArray1409[k1] & class39_sub2_1.anInt1415) != class39_sub2_1.anInt1416)
                        continue;
                    flag2 = false;
                    break;
                }

                if(flag2)
                {
                    Class28 class28_1 = class39_sub2_1.aClass28_1403;
                    if(!method338(l, i, j, class28_1.anInt414))
                        class28_1.aClass39_Sub3_Sub2_416.method378(0, anInt499, anInt500, anInt501, anInt502, class28_1.anInt412 - anInt496, class28_1.anInt411 - anInt497, class28_1.anInt413 - anInt498, class28_1.anInt418);
                    class39_sub2_1.anInt1415 = 0;
                }
            }
            if(class39_sub2_1.aBoolean1414)
                try
                {
                    int i1 = class39_sub2_1.anInt1407;
                    class39_sub2_1.aBoolean1414 = false;
                    int l1 = 0;
label0:
                    for(int k2 = 0; k2 < i1; k2++)
                    {
                        Class9 class9_1 = class39_sub2_1.aClass9Array1408[k2];
                        if(class9_1.anInt175 == anInt489)
                            continue;
                        for(int k3 = class9_1.anInt170; k3 <= class9_1.anInt171; k3++)
                        {
                            for(int l4 = class9_1.anInt172; l4 <= class9_1.anInt173; l4++)
                            {
                                Class39_Sub2 class39_sub2_21 = aclass39_sub2[k3][l4];
                                if(class39_sub2_21.aBoolean1412)
                                {
                                    class39_sub2_1.aBoolean1414 = true;
                                } else
                                {
                                    if(class39_sub2_21.anInt1415 == 0)
                                        continue;
                                    int l6 = 0;
                                    if(k3 > class9_1.anInt170)
                                        l6++;
                                    if(k3 < class9_1.anInt171)
                                        l6 += 4;
                                    if(l4 > class9_1.anInt172)
                                        l6 += 8;
                                    if(l4 < class9_1.anInt173)
                                        l6 += 2;
                                    if((l6 & class39_sub2_21.anInt1415) != class39_sub2_1.anInt1417)
                                        continue;
                                    class39_sub2_1.aBoolean1414 = true;
                                }
                                continue label0;
                            }

                        }

                        aClass9Array503[l1++] = class9_1;
                        int i5 = anInt494 - class9_1.anInt170;
                        int i6 = class9_1.anInt171 - anInt494;
                        if(i6 > i5)
                            i5 = i6;
                        int i7 = anInt495 - class9_1.anInt172;
                        int j8 = class9_1.anInt173 - anInt495;
                        if(j8 > i7)
                            class9_1.anInt174 = i5 + j8;
                        else
                            class9_1.anInt174 = i5 + i7;
                    }

                    while(l1 > 0) 
                    {
                        int i3 = -50;
                        int l3 = -1;
                        for(int j5 = 0; j5 < l1; j5++)
                        {
                            Class9 class9_2 = aClass9Array503[j5];
                            if(class9_2.anInt175 != anInt489)
                                if(class9_2.anInt174 > i3)
                                {
                                    i3 = class9_2.anInt174;
                                    l3 = j5;
                                } else
                                if(class9_2.anInt174 == i3)
                                {
                                    int j7 = class9_2.anInt166 - anInt496;
                                    int k8 = class9_2.anInt167 - anInt498;
                                    int l9 = aClass9Array503[l3].anInt166 - anInt496;
                                    int l10 = aClass9Array503[l3].anInt167 - anInt498;
                                    if(j7 * j7 + k8 * k8 > l9 * l9 + l10 * l10)
                                        l3 = j5;
                                }
                        }

                        if(l3 == -1)
                            break;
                        Class9 class9_3 = aClass9Array503[l3];
                        class9_3.anInt175 = anInt489;
                        if(!method340(l, class9_3.anInt170, class9_3.anInt171, class9_3.anInt172, class9_3.anInt173, class9_3.aClass39_Sub3_Sub2_168.anInt1431))
                            class9_3.aClass39_Sub3_Sub2_168.method378(class9_3.anInt169, anInt499, anInt500, anInt501, anInt502, class9_3.anInt166 - anInt496, class9_3.anInt165 - anInt497, class9_3.anInt167 - anInt498, class9_3.anInt176);
                        for(int k7 = class9_3.anInt170; k7 <= class9_3.anInt171; k7++)
                        {
                            for(int l8 = class9_3.anInt172; l8 <= class9_3.anInt173; l8++)
                            {
                                Class39_Sub2 class39_sub2_22 = aclass39_sub2[k7][l8];
                                if(class39_sub2_22.anInt1415 != 0)
                                    aClass5_518.method182(class39_sub2_22);
                                else
                                if((k7 != i || l8 != j) && class39_sub2_22.aBoolean1413)
                                    aClass5_518.method182(class39_sub2_22);
                            }

                        }

                    }
                    if(class39_sub2_1.aBoolean1414)
                        continue;
                }
                catch(Exception _ex)
                {
                    class39_sub2_1.aBoolean1414 = false;
                }
            if(!class39_sub2_1.aBoolean1413 || class39_sub2_1.anInt1415 != 0)
                continue;
            if(i <= anInt494 && i > anInt490)
            {
                Class39_Sub2 class39_sub2_8 = aclass39_sub2[i - 1][j];
                if(class39_sub2_8 != null && class39_sub2_8.aBoolean1413)
                    continue;
            }
            if(i >= anInt494 && i < anInt491 - 1)
            {
                Class39_Sub2 class39_sub2_9 = aclass39_sub2[i + 1][j];
                if(class39_sub2_9 != null && class39_sub2_9.aBoolean1413)
                    continue;
            }
            if(j <= anInt495 && j > anInt492)
            {
                Class39_Sub2 class39_sub2_10 = aclass39_sub2[i][j - 1];
                if(class39_sub2_10 != null && class39_sub2_10.aBoolean1413)
                    continue;
            }
            if(j >= anInt495 && j < anInt493 - 1)
            {
                Class39_Sub2 class39_sub2_11 = aclass39_sub2[i][j + 1];
                if(class39_sub2_11 != null && class39_sub2_11.aBoolean1413)
                    continue;
            }
            class39_sub2_1.aBoolean1413 = false;
            anInt487--;
            Class2 class2 = class39_sub2_1.aClass2_1406;
            if(class2 != null && class2.anInt47 != 0)
            {
                if(class2.aClass39_Sub3_Sub2_44 != null)
                    class2.aClass39_Sub3_Sub2_44.method378(0, anInt499, anInt500, anInt501, anInt502, class2.anInt41 - anInt496, class2.anInt40 - anInt497 - class2.anInt47, class2.anInt42 - anInt498, class2.anInt46);
                if(class2.aClass39_Sub3_Sub2_45 != null)
                    class2.aClass39_Sub3_Sub2_45.method378(0, anInt499, anInt500, anInt501, anInt502, class2.anInt41 - anInt496, class2.anInt40 - anInt497 - class2.anInt47, class2.anInt42 - anInt498, class2.anInt46);
                if(class2.aClass39_Sub3_Sub2_43 != null)
                    class2.aClass39_Sub3_Sub2_43.method378(0, anInt499, anInt500, anInt501, anInt502, class2.anInt41 - anInt496, class2.anInt40 - anInt497 - class2.anInt47, class2.anInt42 - anInt498, class2.anInt46);
            }
            if(class39_sub2_1.anInt1418 != 0)
            {
                Class26 class26 = class39_sub2_1.aClass26_1404;
                if(class26 != null && !method339(l, i, j, class26.aClass39_Sub3_Sub2_356.anInt1431))
                    if((class26.anInt354 & class39_sub2_1.anInt1418) != 0)
                        class26.aClass39_Sub3_Sub2_356.method378(class26.anInt355, anInt499, anInt500, anInt501, anInt502, class26.anInt352 - anInt496, class26.anInt351 - anInt497, class26.anInt353 - anInt498, class26.anInt357);
                    else
                    if((class26.anInt354 & 0x300) != 0)
                    {
                        int l2 = class26.anInt352 - anInt496;
                        int j3 = class26.anInt351 - anInt497;
                        int i4 = class26.anInt353 - anInt498;
                        int k5 = class26.anInt355;
                        int j6;
                        if(k5 == 1 || k5 == 2)
                            j6 = -l2;
                        else
                            j6 = l2;
                        int l7;
                        if(k5 == 2 || k5 == 3)
                            l7 = -i4;
                        else
                            l7 = i4;
                        if((class26.anInt354 & 0x100) != 0 && l7 >= j6)
                        {
                            int i9 = l2 + anIntArray504[k5];
                            int i10 = i4 + anIntArray505[k5];
                            class26.aClass39_Sub3_Sub2_356.method378(k5 * 512 + 256, anInt499, anInt500, anInt501, anInt502, i9, j3, i10, class26.anInt357);
                        }
                        if((class26.anInt354 & 0x200) != 0 && l7 <= j6)
                        {
                            int j9 = l2 + anIntArray506[k5];
                            int j10 = i4 + anIntArray507[k5];
                            class26.aClass39_Sub3_Sub2_356.method378(k5 * 512 + 1280 & 0x7ff, anInt499, anInt500, anInt501, anInt502, j9, j3, j10, class26.anInt357);
                        }
                    }
                Class28 class28_2 = class39_sub2_1.aClass28_1403;
                if(class28_2 != null)
                {
                    if((class28_2.anInt415 & class39_sub2_1.anInt1418) != 0 && !method338(l, i, j, class28_2.anInt415))
                        class28_2.aClass39_Sub3_Sub2_417.method378(0, anInt499, anInt500, anInt501, anInt502, class28_2.anInt412 - anInt496, class28_2.anInt411 - anInt497, class28_2.anInt413 - anInt498, class28_2.anInt418);
                    if((class28_2.anInt414 & class39_sub2_1.anInt1418) != 0 && !method338(l, i, j, class28_2.anInt414))
                        class28_2.aClass39_Sub3_Sub2_416.method378(0, anInt499, anInt500, anInt501, anInt502, class28_2.anInt412 - anInt496, class28_2.anInt411 - anInt497, class28_2.anInt413 - anInt498, class28_2.anInt418);
                }
            }
            if(k < anInt478 - 1)
            {
                Class39_Sub2 class39_sub2_12 = aClass39_Sub2ArrayArrayArray482[k + 1][i][j];
                if(class39_sub2_12 != null && class39_sub2_12.aBoolean1413)
                    aClass5_518.method182(class39_sub2_12);
            }
            if(i < anInt494)
            {
                Class39_Sub2 class39_sub2_13 = aclass39_sub2[i + 1][j];
                if(class39_sub2_13 != null && class39_sub2_13.aBoolean1413)
                    aClass5_518.method182(class39_sub2_13);
            }
            if(j < anInt495)
            {
                Class39_Sub2 class39_sub2_14 = aclass39_sub2[i][j + 1];
                if(class39_sub2_14 != null && class39_sub2_14.aBoolean1413)
                    aClass5_518.method182(class39_sub2_14);
            }
            if(i > anInt494)
            {
                Class39_Sub2 class39_sub2_15 = aclass39_sub2[i - 1][j];
                if(class39_sub2_15 != null && class39_sub2_15.aBoolean1413)
                    aClass5_518.method182(class39_sub2_15);
            }
            if(j > anInt495)
            {
                Class39_Sub2 class39_sub2_16 = aclass39_sub2[i][j - 1];
                if(class39_sub2_16 != null && class39_sub2_16.aBoolean1413)
                    aClass5_518.method182(class39_sub2_16);
            }
        } while(true);
    }

    public void method332(Class43 class43, int i, int j, int k, int l, int i1, int j1, 
            int k1)
    {
        int l1;
        int i2 = l1 = (j1 << 7) - anInt496;
        int j2;
        int k2 = j2 = (k1 << 7) - anInt498;
        int l2;
        int i3 = l2 = i2 + 128;
        int j3;
        int k3 = j3 = k2 + 128;
        int l3 = anIntArrayArrayArray481[i][j1][k1] - anInt497;
        int i4 = anIntArrayArrayArray481[i][j1 + 1][k1] - anInt497;
        int j4 = anIntArrayArrayArray481[i][j1 + 1][k1 + 1] - anInt497;
        int k4 = anIntArrayArrayArray481[i][j1][k1 + 1] - anInt497;
        int l4 = k2 * l + i2 * i1 >> 16;
        k2 = k2 * i1 - i2 * l >> 16;
        i2 = l4;
        l4 = l3 * k - k2 * j >> 16;
        k2 = l3 * j + k2 * k >> 16;
        l3 = l4;
        if(k2 < 50)
            return;
        l4 = j2 * l + i3 * i1 >> 16;
        j2 = j2 * i1 - i3 * l >> 16;
        i3 = l4;
        l4 = i4 * k - j2 * j >> 16;
        j2 = i4 * j + j2 * k >> 16;
        i4 = l4;
        if(j2 < 50)
            return;
        l4 = k3 * l + l2 * i1 >> 16;
        k3 = k3 * i1 - l2 * l >> 16;
        l2 = l4;
        l4 = j4 * k - k3 * j >> 16;
        k3 = j4 * j + k3 * k >> 16;
        j4 = l4;
        if(k3 < 50)
            return;
        l4 = j3 * l + l1 * i1 >> 16;
        j3 = j3 * i1 - l1 * l >> 16;
        l1 = l4;
        l4 = k4 * k - j3 * j >> 16;
        j3 = k4 * j + j3 * k >> 16;
        k4 = l4;
        if(j3 < 50)
            return;
        int i5 = Class39_Sub3_Sub4_Sub1.anInt1674 + (i2 << 9) / k2;
        int j5 = Class39_Sub3_Sub4_Sub1.anInt1675 + (l3 << 9) / k2;
        int k5 = Class39_Sub3_Sub4_Sub1.anInt1674 + (i3 << 9) / j2;
        int l5 = Class39_Sub3_Sub4_Sub1.anInt1675 + (i4 << 9) / j2;
        int i6 = Class39_Sub3_Sub4_Sub1.anInt1674 + (l2 << 9) / k3;
        int j6 = Class39_Sub3_Sub4_Sub1.anInt1675 + (j4 << 9) / k3;
        int k6 = Class39_Sub3_Sub4_Sub1.anInt1674 + (l1 << 9) / j3;
        int l6 = Class39_Sub3_Sub4_Sub1.anInt1675 + (k4 << 9) / j3;
        Class39_Sub3_Sub4_Sub1.anInt1673 = 0;
        if((i6 - k6) * (l5 - l6) - (j6 - l6) * (k5 - k6) > 0)
        {
            Class39_Sub3_Sub4_Sub1.aBoolean1670 = false;
            if(i6 < 0 || k6 < 0 || k5 < 0 || i6 > Class39_Sub3_Sub4.anInt1466 || k6 > Class39_Sub3_Sub4.anInt1466 || k5 > Class39_Sub3_Sub4.anInt1466)
                Class39_Sub3_Sub4_Sub1.aBoolean1670 = true;
            if(aBoolean508 && method335(anInt509, anInt510, j6, l6, l5, i6, k6, k5))
            {
                anInt511 = j1;
                anInt512 = k1;
            }
            if(class43.anInt729 == -1)
            {
                if(class43.anInt727 != 0xbc614e)
                    Class39_Sub3_Sub4_Sub1.method496(j6, l6, l5, i6, k6, k5, class43.anInt727, class43.anInt728, class43.anInt726);
            } else
            if(!aBoolean477)
            {
                if(class43.aBoolean730)
                    Class39_Sub3_Sub4_Sub1.method500(j6, l6, l5, i6, k6, k5, class43.anInt727, class43.anInt728, class43.anInt726, i2, i3, l1, l3, i4, k4, k2, j2, j3, class43.anInt729);
                else
                    Class39_Sub3_Sub4_Sub1.method500(j6, l6, l5, i6, k6, k5, class43.anInt727, class43.anInt728, class43.anInt726, l2, l1, i3, j4, k4, i4, k3, j3, j2, class43.anInt729);
            } else
            {
                int i7 = anIntArray526[class43.anInt729];
                Class39_Sub3_Sub4_Sub1.method496(j6, l6, l5, i6, k6, k5, method334(-197, class43.anInt727, i7), method334(-197, class43.anInt728, i7), method334(-197, class43.anInt726, i7));
            }
        }
        if((i5 - k5) * (l6 - l5) - (j5 - l5) * (k6 - k5) > 0)
        {
            Class39_Sub3_Sub4_Sub1.aBoolean1670 = false;
            if(i5 < 0 || k5 < 0 || k6 < 0 || i5 > Class39_Sub3_Sub4.anInt1466 || k5 > Class39_Sub3_Sub4.anInt1466 || k6 > Class39_Sub3_Sub4.anInt1466)
                Class39_Sub3_Sub4_Sub1.aBoolean1670 = true;
            if(aBoolean508 && method335(anInt509, anInt510, j5, l5, l6, i5, k5, k6))
            {
                anInt511 = j1;
                anInt512 = k1;
            }
            if(class43.anInt729 == -1)
            {
                if(class43.anInt725 != 0xbc614e)
                {
                    Class39_Sub3_Sub4_Sub1.method496(j5, l5, l6, i5, k5, k6, class43.anInt725, class43.anInt726, class43.anInt728);
                    return;
                }
            } else
            {
                if(!aBoolean477)
                {
                    Class39_Sub3_Sub4_Sub1.method500(j5, l5, l6, i5, k5, k6, class43.anInt725, class43.anInt726, class43.anInt728, i2, i3, l1, l3, i4, k4, k2, j2, j3, class43.anInt729);
                    return;
                }
                int j7 = anIntArray526[class43.anInt729];
                Class39_Sub3_Sub4_Sub1.method496(j5, l5, l6, i5, k5, k6, method334(-197, class43.anInt725, j7), method334(-197, class43.anInt726, j7), method334(-197, class43.anInt728, j7));
            }
        }
    }

    public void method333(int i, int j, int k, int l, int i1, int j1, int k1, 
            Class7 class7)
    {
        int l1 = class7.anIntArray132.length;
        if(j <= 0)
            anInt472 = 463;
        for(int i2 = 0; i2 < l1; i2++)
        {
            int j2 = class7.anIntArray132[i2] - anInt496;
            int l2 = class7.anIntArray133[i2] - anInt497;
            int j3 = class7.anIntArray134[i2] - anInt498;
            int l3 = j3 * k1 + j2 * j1 >> 16;
            j3 = j3 * j1 - j2 * k1 >> 16;
            j2 = l3;
            l3 = l2 * k - j3 * i >> 16;
            j3 = l2 * i + j3 * k >> 16;
            l2 = l3;
            if(j3 < 50)
                return;
            if(class7.anIntArray141 != null)
            {
                Class7.anIntArray149[i2] = j2;
                Class7.anIntArray150[i2] = l2;
                Class7.anIntArray151[i2] = j3;
            }
            Class7.anIntArray147[i2] = Class39_Sub3_Sub4_Sub1.anInt1674 + (j2 << 9) / j3;
            Class7.anIntArray148[i2] = Class39_Sub3_Sub4_Sub1.anInt1675 + (l2 << 9) / j3;
        }

        Class39_Sub3_Sub4_Sub1.anInt1673 = 0;
        l1 = class7.anIntArray138.length;
        for(int k2 = 0; k2 < l1; k2++)
        {
            int i3 = class7.anIntArray138[k2];
            int k3 = class7.anIntArray139[k2];
            int i4 = class7.anIntArray140[k2];
            int j4 = Class7.anIntArray147[i3];
            int k4 = Class7.anIntArray147[k3];
            int l4 = Class7.anIntArray147[i4];
            int i5 = Class7.anIntArray148[i3];
            int j5 = Class7.anIntArray148[k3];
            int k5 = Class7.anIntArray148[i4];
            if((j4 - k4) * (k5 - j5) - (i5 - j5) * (l4 - k4) > 0)
            {
                Class39_Sub3_Sub4_Sub1.aBoolean1670 = false;
                if(j4 < 0 || k4 < 0 || l4 < 0 || j4 > Class39_Sub3_Sub4.anInt1466 || k4 > Class39_Sub3_Sub4.anInt1466 || l4 > Class39_Sub3_Sub4.anInt1466)
                    Class39_Sub3_Sub4_Sub1.aBoolean1670 = true;
                if(aBoolean508 && method335(anInt509, anInt510, i5, j5, k5, j4, k4, l4))
                {
                    anInt511 = i1;
                    anInt512 = l;
                }
                if(class7.anIntArray141 == null || class7.anIntArray141[k2] == -1)
                {
                    if(class7.anIntArray135[k2] != 0xbc614e)
                        Class39_Sub3_Sub4_Sub1.method496(i5, j5, k5, j4, k4, l4, class7.anIntArray135[k2], class7.anIntArray136[k2], class7.anIntArray137[k2]);
                } else
                if(!aBoolean477)
                {
                    if(class7.aBoolean142)
                        Class39_Sub3_Sub4_Sub1.method500(i5, j5, k5, j4, k4, l4, class7.anIntArray135[k2], class7.anIntArray136[k2], class7.anIntArray137[k2], Class7.anIntArray149[0], Class7.anIntArray149[1], Class7.anIntArray149[3], Class7.anIntArray150[0], Class7.anIntArray150[1], Class7.anIntArray150[3], Class7.anIntArray151[0], Class7.anIntArray151[1], Class7.anIntArray151[3], class7.anIntArray141[k2]);
                    else
                        Class39_Sub3_Sub4_Sub1.method500(i5, j5, k5, j4, k4, l4, class7.anIntArray135[k2], class7.anIntArray136[k2], class7.anIntArray137[k2], Class7.anIntArray149[i3], Class7.anIntArray149[k3], Class7.anIntArray149[i4], Class7.anIntArray150[i3], Class7.anIntArray150[k3], Class7.anIntArray150[i4], Class7.anIntArray151[i3], Class7.anIntArray151[k3], Class7.anIntArray151[i4], class7.anIntArray141[k2]);
                } else
                {
                    int l5 = anIntArray526[class7.anIntArray141[k2]];
                    Class39_Sub3_Sub4_Sub1.method496(i5, j5, k5, j4, k4, l4, method334(-197, class7.anIntArray135[k2], l5), method334(-197, class7.anIntArray136[k2], l5), method334(-197, class7.anIntArray137[k2], l5));
                }
            }
        }

    }

    public int method334(int i, int j, int k)
    {
        if(i >= 0)
        {
            for(int l = 1; l > 0; l++);
        }
        j = 127 - j;
        j = (j * (k & 0x7f)) / 160;
        if(j < 2)
            j = 2;
        else
        if(j > 126)
            j = 126;
        return (k & 0xff80) + j;
    }

    public boolean method335(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
        if(j < k && j < l && j < i1)
            return false;
        if(j > k && j > l && j > i1)
            return false;
        if(i < j1 && i < k1 && i < l1)
            return false;
        if(i > j1 && i > k1 && i > l1)
            return false;
        int i2 = (j - k) * (k1 - j1) - (i - j1) * (l - k);
        int j2 = (j - i1) * (j1 - l1) - (i - l1) * (k - i1);
        int k2 = (j - l) * (l1 - k1) - (i - k1) * (i1 - l);
        return i2 * k2 > 0 && k2 * j2 > 0;
    }

    public void method336(boolean flag)
    {
        int i = anIntArray514[anInt488];
        Class16 aclass16[] = aClass16ArrayArray515[anInt488];
        if(!flag)
        {
            for(int j = 1; j > 0; j++);
        }
        anInt516 = 0;
        for(int k = 0; k < i; k++)
        {
            Class16 class16 = aclass16[k];
            if(class16.anInt241 == 1)
            {
                int l = (class16.anInt237 - anInt494) + 25;
                if(l < 0 || l > 50)
                    continue;
                int k1 = (class16.anInt239 - anInt495) + 25;
                if(k1 < 0)
                    k1 = 0;
                int j2 = (class16.anInt240 - anInt495) + 25;
                if(j2 > 50)
                    j2 = 50;
                boolean flag1 = false;
                while(k1 <= j2) 
                    if(aBooleanArrayArray533[l][k1++])
                    {
                        flag1 = true;
                        break;
                    }
                if(!flag1)
                    continue;
                int j3 = anInt496 - class16.anInt242;
                if(j3 > 32)
                {
                    class16.anInt248 = 1;
                } else
                {
                    if(j3 >= -32)
                        continue;
                    class16.anInt248 = 2;
                    j3 = -j3;
                }
                class16.anInt251 = (class16.anInt244 - anInt498 << 8) / j3;
                class16.anInt252 = (class16.anInt245 - anInt498 << 8) / j3;
                class16.anInt253 = (class16.anInt246 - anInt497 << 8) / j3;
                class16.anInt254 = (class16.anInt247 - anInt497 << 8) / j3;
                aClass16Array517[anInt516++] = class16;
                continue;
            }
            if(class16.anInt241 == 2)
            {
                int i1 = (class16.anInt239 - anInt495) + 25;
                if(i1 < 0 || i1 > 50)
                    continue;
                int l1 = (class16.anInt237 - anInt494) + 25;
                if(l1 < 0)
                    l1 = 0;
                int k2 = (class16.anInt238 - anInt494) + 25;
                if(k2 > 50)
                    k2 = 50;
                boolean flag2 = false;
                while(l1 <= k2) 
                    if(aBooleanArrayArray533[l1++][i1])
                    {
                        flag2 = true;
                        break;
                    }
                if(!flag2)
                    continue;
                int k3 = anInt498 - class16.anInt244;
                if(k3 > 32)
                {
                    class16.anInt248 = 3;
                } else
                {
                    if(k3 >= -32)
                        continue;
                    class16.anInt248 = 4;
                    k3 = -k3;
                }
                class16.anInt249 = (class16.anInt242 - anInt496 << 8) / k3;
                class16.anInt250 = (class16.anInt243 - anInt496 << 8) / k3;
                class16.anInt253 = (class16.anInt246 - anInt497 << 8) / k3;
                class16.anInt254 = (class16.anInt247 - anInt497 << 8) / k3;
                aClass16Array517[anInt516++] = class16;
            } else
            if(class16.anInt241 == 4)
            {
                int j1 = class16.anInt246 - anInt497;
                if(j1 > 128)
                {
                    int i2 = (class16.anInt239 - anInt495) + 25;
                    if(i2 < 0)
                        i2 = 0;
                    int l2 = (class16.anInt240 - anInt495) + 25;
                    if(l2 > 50)
                        l2 = 50;
                    if(i2 <= l2)
                    {
                        int i3 = (class16.anInt237 - anInt494) + 25;
                        if(i3 < 0)
                            i3 = 0;
                        int l3 = (class16.anInt238 - anInt494) + 25;
                        if(l3 > 50)
                            l3 = 50;
                        boolean flag3 = false;
label0:
                        for(int i4 = i3; i4 <= l3; i4++)
                        {
                            for(int j4 = i2; j4 <= l2; j4++)
                            {
                                if(!aBooleanArrayArray533[i4][j4])
                                    continue;
                                flag3 = true;
                                break label0;
                            }

                        }

                        if(flag3)
                        {
                            class16.anInt248 = 5;
                            class16.anInt249 = (class16.anInt242 - anInt496 << 8) / j1;
                            class16.anInt250 = (class16.anInt243 - anInt496 << 8) / j1;
                            class16.anInt251 = (class16.anInt244 - anInt498 << 8) / j1;
                            class16.anInt252 = (class16.anInt245 - anInt498 << 8) / j1;
                            aClass16Array517[anInt516++] = class16;
                        }
                    }
                }
            }
        }

    }

    public boolean method337(int i, int j, int k)
    {
        int l = anIntArrayArrayArray486[i][j][k];
        if(l == -anInt489)
            return false;
        if(l == anInt489)
            return true;
        int i1 = j << 7;
        int j1 = k << 7;
        if(method341(i1 + 1, anIntArrayArrayArray481[i][j][k], j1 + 1) && method341((i1 + 128) - 1, anIntArrayArrayArray481[i][j + 1][k], j1 + 1) && method341((i1 + 128) - 1, anIntArrayArrayArray481[i][j + 1][k + 1], (j1 + 128) - 1) && method341(i1 + 1, anIntArrayArrayArray481[i][j][k + 1], (j1 + 128) - 1))
        {
            anIntArrayArrayArray486[i][j][k] = anInt489;
            return true;
        } else
        {
            anIntArrayArrayArray486[i][j][k] = -anInt489;
            return false;
        }
    }

    public boolean method338(int i, int j, int k, int l)
    {
        if(!method337(i, j, k))
            return false;
        int i1 = j << 7;
        int j1 = k << 7;
        int k1 = anIntArrayArrayArray481[i][j][k] - 1;
        int l1 = k1 - 120;
        int i2 = k1 - 230;
        int j2 = k1 - 238;
        if(l < 16)
        {
            if(l == 1)
            {
                if(i1 > anInt496)
                {
                    if(!method341(i1, k1, j1))
                        return false;
                    if(!method341(i1, k1, j1 + 128))
                        return false;
                }
                if(i > 0)
                {
                    if(!method341(i1, l1, j1))
                        return false;
                    if(!method341(i1, l1, j1 + 128))
                        return false;
                }
                if(!method341(i1, i2, j1))
                    return false;
                return method341(i1, i2, j1 + 128);
            }
            if(l == 2)
            {
                if(j1 < anInt498)
                {
                    if(!method341(i1, k1, j1 + 128))
                        return false;
                    if(!method341(i1 + 128, k1, j1 + 128))
                        return false;
                }
                if(i > 0)
                {
                    if(!method341(i1, l1, j1 + 128))
                        return false;
                    if(!method341(i1 + 128, l1, j1 + 128))
                        return false;
                }
                if(!method341(i1, i2, j1 + 128))
                    return false;
                return method341(i1 + 128, i2, j1 + 128);
            }
            if(l == 4)
            {
                if(i1 < anInt496)
                {
                    if(!method341(i1 + 128, k1, j1))
                        return false;
                    if(!method341(i1 + 128, k1, j1 + 128))
                        return false;
                }
                if(i > 0)
                {
                    if(!method341(i1 + 128, l1, j1))
                        return false;
                    if(!method341(i1 + 128, l1, j1 + 128))
                        return false;
                }
                if(!method341(i1 + 128, i2, j1))
                    return false;
                return method341(i1 + 128, i2, j1 + 128);
            }
            if(l == 8)
            {
                if(j1 > anInt498)
                {
                    if(!method341(i1, k1, j1))
                        return false;
                    if(!method341(i1 + 128, k1, j1))
                        return false;
                }
                if(i > 0)
                {
                    if(!method341(i1, l1, j1))
                        return false;
                    if(!method341(i1 + 128, l1, j1))
                        return false;
                }
                if(!method341(i1, i2, j1))
                    return false;
                return method341(i1 + 128, i2, j1);
            }
        }
        if(!method341(i1 + 64, j2, j1 + 64))
            return false;
        if(l == 16)
            return method341(i1, i2, j1 + 128);
        if(l == 32)
            return method341(i1 + 128, i2, j1 + 128);
        if(l == 64)
            return method341(i1 + 128, i2, j1);
        if(l == 128)
        {
            return method341(i1, i2, j1);
        } else
        {
            System.out.println("Warning unsupported wall type");
            return true;
        }
    }

    public boolean method339(int i, int j, int k, int l)
    {
        if(!method337(i, j, k))
            return false;
        int i1 = j << 7;
        int j1 = k << 7;
        return method341(i1 + 1, anIntArrayArrayArray481[i][j][k] - l, j1 + 1) && method341((i1 + 128) - 1, anIntArrayArrayArray481[i][j + 1][k] - l, j1 + 1) && method341((i1 + 128) - 1, anIntArrayArrayArray481[i][j + 1][k + 1] - l, (j1 + 128) - 1) && method341(i1 + 1, anIntArrayArrayArray481[i][j][k + 1] - l, (j1 + 128) - 1);
    }

    public boolean method340(int i, int j, int k, int l, int i1, int j1)
    {
        if(j == k && l == i1)
        {
            if(!method337(i, j, l))
                return false;
            int k1 = j << 7;
            int i2 = l << 7;
            return method341(k1 + 1, anIntArrayArrayArray481[i][j][l] - j1, i2 + 1) && method341((k1 + 128) - 1, anIntArrayArrayArray481[i][j + 1][l] - j1, i2 + 1) && method341((k1 + 128) - 1, anIntArrayArrayArray481[i][j + 1][l + 1] - j1, (i2 + 128) - 1) && method341(k1 + 1, anIntArrayArrayArray481[i][j][l + 1] - j1, (i2 + 128) - 1);
        }
        for(int l1 = j; l1 <= k; l1++)
        {
            for(int j2 = l; j2 <= i1; j2++)
                if(anIntArrayArrayArray486[i][l1][j2] == -anInt489)
                    return false;

        }

        int k2 = (j << 7) + 1;
        int l2 = (l << 7) + 2;
        int i3 = anIntArrayArrayArray481[i][j][l] - j1;
        if(!method341(k2, i3, l2))
            return false;
        int j3 = (k << 7) - 1;
        if(!method341(j3, i3, l2))
            return false;
        int k3 = (i1 << 7) - 1;
        if(!method341(k2, i3, k3))
            return false;
        return method341(j3, i3, k3);
    }

    public boolean method341(int i, int j, int k)
    {
        for(int l = 0; l < anInt516; l++)
        {
            Class16 class16 = aClass16Array517[l];
            if(class16.anInt248 == 1)
            {
                int i1 = class16.anInt242 - i;
                if(i1 > 0)
                {
                    int j2 = class16.anInt244 + (class16.anInt251 * i1 >> 8);
                    int k3 = class16.anInt245 + (class16.anInt252 * i1 >> 8);
                    int l4 = class16.anInt246 + (class16.anInt253 * i1 >> 8);
                    int i6 = class16.anInt247 + (class16.anInt254 * i1 >> 8);
                    if(k >= j2 && k <= k3 && j >= l4 && j <= i6)
                        return true;
                }
            } else
            if(class16.anInt248 == 2)
            {
                int j1 = i - class16.anInt242;
                if(j1 > 0)
                {
                    int k2 = class16.anInt244 + (class16.anInt251 * j1 >> 8);
                    int l3 = class16.anInt245 + (class16.anInt252 * j1 >> 8);
                    int i5 = class16.anInt246 + (class16.anInt253 * j1 >> 8);
                    int j6 = class16.anInt247 + (class16.anInt254 * j1 >> 8);
                    if(k >= k2 && k <= l3 && j >= i5 && j <= j6)
                        return true;
                }
            } else
            if(class16.anInt248 == 3)
            {
                int k1 = class16.anInt244 - k;
                if(k1 > 0)
                {
                    int l2 = class16.anInt242 + (class16.anInt249 * k1 >> 8);
                    int i4 = class16.anInt243 + (class16.anInt250 * k1 >> 8);
                    int j5 = class16.anInt246 + (class16.anInt253 * k1 >> 8);
                    int k6 = class16.anInt247 + (class16.anInt254 * k1 >> 8);
                    if(i >= l2 && i <= i4 && j >= j5 && j <= k6)
                        return true;
                }
            } else
            if(class16.anInt248 == 4)
            {
                int l1 = k - class16.anInt244;
                if(l1 > 0)
                {
                    int i3 = class16.anInt242 + (class16.anInt249 * l1 >> 8);
                    int j4 = class16.anInt243 + (class16.anInt250 * l1 >> 8);
                    int k5 = class16.anInt246 + (class16.anInt253 * l1 >> 8);
                    int l6 = class16.anInt247 + (class16.anInt254 * l1 >> 8);
                    if(i >= i3 && i <= j4 && j >= k5 && j <= l6)
                        return true;
                }
            } else
            if(class16.anInt248 == 5)
            {
                int i2 = j - class16.anInt246;
                if(i2 > 0)
                {
                    int j3 = class16.anInt242 + (class16.anInt249 * i2 >> 8);
                    int k4 = class16.anInt243 + (class16.anInt250 * i2 >> 8);
                    int l5 = class16.anInt244 + (class16.anInt251 * i2 >> 8);
                    int i7 = class16.anInt245 + (class16.anInt252 * i2 >> 8);
                    if(i >= j3 && i <= k4 && k >= l5 && k <= i7)
                        return true;
                }
            }
        }

        return false;
    }

    public boolean aBoolean469;
    public boolean aBoolean470;
    public int anInt471;
    public int anInt472;
    public static int anInt473 = -16;
    public boolean aBoolean474;
    public static int anInt475 = 408;
    public boolean aBoolean476;
    public static boolean aBoolean477 = true;
    public int anInt478;
    public int anInt479;
    public int anInt480;
    public int anIntArrayArrayArray481[][][];
    public Class39_Sub2 aClass39_Sub2ArrayArrayArray482[][][];
    public int anInt483;
    public int anInt484;
    public Class9 aClass9Array485[];
    public int anIntArrayArrayArray486[][][];
    public static int anInt487;
    public static int anInt488;
    public static int anInt489;
    public static int anInt490;
    public static int anInt491;
    public static int anInt492;
    public static int anInt493;
    public static int anInt494;
    public static int anInt495;
    public static int anInt496;
    public static int anInt497;
    public static int anInt498;
    public static int anInt499;
    public static int anInt500;
    public static int anInt501;
    public static int anInt502;
    public static Class9 aClass9Array503[] = new Class9[100];
    public static final int anIntArray504[] = {
        53, -53, -53, 53
    };
    public static final int anIntArray505[] = {
        -53, -53, 53, 53
    };
    public static final int anIntArray506[] = {
        -45, 45, 45, -45
    };
    public static final int anIntArray507[] = {
        45, 45, -45, -45
    };
    public static boolean aBoolean508;
    public static int anInt509;
    public static int anInt510;
    public static int anInt511 = -1;
    public static int anInt512 = -1;
    public static int anInt513;
    public static int anIntArray514[];
    public static Class16 aClass16ArrayArray515[][];
    public static int anInt516;
    public static Class16 aClass16Array517[] = new Class16[500];
    public static Class5 aClass5_518 = new Class5(-7255);
    public static final int anIntArray519[] = {
        19, 55, 38, 155, 255, 110, 137, 205, 76
    };
    public static final int anIntArray520[] = {
        160, 192, 80, 96, 0, 144, 80, 48, 160
    };
    public static final int anIntArray521[] = {
        76, 8, 137, 4, 0, 1, 38, 2, 19
    };
    public static final int anIntArray522[] = {
        0, 0, 2, 0, 0, 2, 1, 1, 0
    };
    public static final int anIntArray523[] = {
        2, 0, 0, 2, 0, 0, 0, 4, 4
    };
    public static final int anIntArray524[] = {
        0, 4, 4, 8, 0, 0, 8, 0, 0
    };
    public static final int anIntArray525[] = {
        1, 1, 0, 0, 0, 8, 0, 0, 8
    };
    public static final int anIntArray526[] = {
        41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 
        41, 41, 41, 41, 41, 43086, 41, 41, 41, 41, 
        41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 
        41, 5056, 41, 41, 41, 7079, 41, 41, 41, 41, 
        41, 41, 41, 41, 41, 41, 3131, 41, 41, 41
    };
    public int anIntArray527[];
    public int anIntArray528[];
    public int anInt529;
    public int anIntArrayArray530[][] = {
        new int[16], {
            1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
            1, 1, 1, 1, 1, 1
        }, {
            1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 
            1, 0, 1, 1, 1, 1
        }, {
            1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 
            0, 0, 1, 0, 0, 0
        }, {
            0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 
            0, 1, 0, 0, 0, 1
        }, {
            0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 
            1, 1, 1, 1, 1, 1
        }, {
            1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 
            1, 1, 1, 1, 1, 1
        }, {
            1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 
            0, 0, 1, 1, 0, 0
        }, {
            0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 
            0, 0, 1, 1, 0, 0
        }, {
            1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 
            1, 1, 0, 0, 1, 1
        }, 
        {
            1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 
            0, 0, 1, 0, 0, 0
        }, {
            0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 
            1, 1, 0, 1, 1, 1
        }, {
            0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 
            1, 0, 1, 1, 1, 1
        }
    };
    public int anIntArrayArray531[][] = {
        {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 
            10, 11, 12, 13, 14, 15
        }, {
            12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 
            6, 2, 15, 11, 7, 3
        }, {
            15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 
            5, 4, 3, 2, 1, 0
        }, {
            3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 
            9, 13, 0, 4, 8, 12
        }
    };
    public static boolean aBooleanArrayArrayArrayArray532[][][][] = new boolean[8][32][51][51];
    public static boolean aBooleanArrayArray533[][];
    public static int anInt534;
    public static int anInt535;
    public static int anInt536;
    public static int anInt537;
    public static int anInt538;
    public static int anInt539;

    static 
    {
        anInt513 = 4;
        anIntArray514 = new int[anInt513];
        aClass16ArrayArray515 = new Class16[anInt513][500];
    }
}
