package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class46
{

    public float method588(int i, boolean flag, int j, float f)
    {
        if(!flag)
        {
            throw new NullPointerException();
        } else
        {
            float f1 = (float)anIntArrayArrayArray772[i][0][j] + f * (float)(anIntArrayArrayArray772[i][1][j] - anIntArrayArrayArray772[i][0][j]);
            f1 *= 0.001525879F;
            return 1.0F - (float)Math.pow(10D, -f1 / 20F);
        }
    }

    public float method589(float f, boolean flag)
    {
        if(!flag)
        {
            for(int i = 1; i > 0; i++);
        }
        float f1 = 32.7032F * (float)Math.pow(2D, f);
        return (f1 * 3.141593F) / 11025F;
    }

    public float method590(int i, int j, int k, float f)
    {
        if(j != 0)
            aBoolean769 = !aBoolean769;
        float f1 = (float)anIntArrayArrayArray771[k][0][i] + f * (float)(anIntArrayArrayArray771[k][1][i] - anIntArrayArrayArray771[k][0][i]);
        f1 *= 0.0001220703F;
        return method589(f1, true);
    }

    public int method591(int i, float f, int j)
    {
        if(i == 0)
        {
            float f1 = (float)anIntArray773[0] + (float)(anIntArray773[1] - anIntArray773[0]) * f;
            f1 *= 0.003051758F;
            aFloat776 = (float)Math.pow(0.10000000000000001D, f1 / 20F);
            anInt777 = (int)(aFloat776 * 65536F);
        }
        if(anIntArray770[i] == 0)
            return 0;
        float f2 = method588(i, true, 0, f);
        aFloatArrayArray774[i][0] = -2F * f2 * (float)Math.cos(method590(0, 0, i, f));
        aFloatArrayArray774[i][1] = f2 * f2;
        for(int k = 1; k < anIntArray770[i]; k++)
        {
            float f3 = method588(i, true, k, f);
            float f4 = -2F * f3 * (float)Math.cos(method590(k, 0, i, f));
            float f5 = f3 * f3;
            aFloatArrayArray774[i][k * 2 + 1] = aFloatArrayArray774[i][k * 2 - 1] * f5;
            aFloatArrayArray774[i][k * 2] = aFloatArrayArray774[i][k * 2 - 1] * f4 + aFloatArrayArray774[i][k * 2 - 2] * f5;
            for(int j1 = k * 2 - 1; j1 >= 2; j1--)
                aFloatArrayArray774[i][j1] += aFloatArrayArray774[i][j1 - 1] * f4 + aFloatArrayArray774[i][j1 - 2] * f5;

            aFloatArrayArray774[i][1] += aFloatArrayArray774[i][0] * f4 + f5;
            aFloatArrayArray774[i][0] += f4;
        }

        if(j != anInt768)
            return 4;
        if(i == 0)
        {
            for(int l = 0; l < anIntArray770[0] * 2; l++)
                aFloatArrayArray774[0][l] *= aFloat776;

        }
        for(int i1 = 0; i1 < anIntArray770[i] * 2; i1++)
            anIntArrayArray775[i][i1] = (int)(aFloatArrayArray774[i][i1] * 65536F);

        return anIntArray770[i] * 2;
    }

    public void method592(Buffer class39_sub3_sub3, Class36 class36, int i)
    {
        int j = class39_sub3_sub3.readUByte();
        anIntArray770[0] = j >> 4;
        anIntArray770[1] = j & 0xf;
        if(i != 0)
            aBoolean766 = !aBoolean766;
        if(j != 0)
        {
            anIntArray773[0] = class39_sub3_sub3.readUShortBE();
            anIntArray773[1] = class39_sub3_sub3.readUShortBE();
            int k = class39_sub3_sub3.readUByte();
            for(int l = 0; l < 2; l++)
            {
                for(int i1 = 0; i1 < anIntArray770[l]; i1++)
                {
                    anIntArrayArrayArray771[l][0][i1] = class39_sub3_sub3.readUShortBE();
                    anIntArrayArrayArray772[l][0][i1] = class39_sub3_sub3.readUShortBE();
                }

            }

            for(int j1 = 0; j1 < 2; j1++)
            {
                for(int k1 = 0; k1 < anIntArray770[j1]; k1++)
                    if((k & 1 << j1 * 4 << k1) != 0)
                    {
                        anIntArrayArrayArray771[j1][1][k1] = class39_sub3_sub3.readUShortBE();
                        anIntArrayArrayArray772[j1][1][k1] = class39_sub3_sub3.readUShortBE();
                    } else
                    {
                        anIntArrayArrayArray771[j1][1][k1] = anIntArrayArrayArray771[j1][0][k1];
                        anIntArrayArrayArray772[j1][1][k1] = anIntArrayArrayArray772[j1][0][k1];
                    }

            }

            if(k != 0 || anIntArray773[1] != anIntArray773[0])
                class36.method365(0, class39_sub3_sub3);
            return;
        } else
        {
            anIntArray773[0] = anIntArray773[1] = 0;
            return;
        }
    }

    public Class46()
    {
        aBoolean766 = false;
        aBoolean767 = true;
        anInt768 = 48306;
        aBoolean769 = true;
        anIntArray770 = new int[2];
        anIntArrayArrayArray771 = new int[2][2][4];
        anIntArrayArrayArray772 = new int[2][2][4];
        anIntArray773 = new int[2];
    }

    public boolean aBoolean766;
    public boolean aBoolean767;
    public int anInt768;
    public boolean aBoolean769;
    public int anIntArray770[];
    public int anIntArrayArrayArray771[][][];
    public int anIntArrayArrayArray772[][][];
    public int anIntArray773[];
    public static float aFloatArrayArray774[][] = new float[2][8];
    public static int anIntArrayArray775[][] = new int[2][8];
    public static float aFloat776;
    public static int anInt777;

}
