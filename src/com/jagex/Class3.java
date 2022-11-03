package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class3
{

    public Class3(int i, int j, int k)
    {
        anInt48 = 523;
        anInt49 = 3;
        aBoolean50 = false;
        aBoolean51 = true;
        aBoolean52 = false;
        aByte53 = 7;
        aBoolean54 = true;
        anInt55 = 0;
        anInt56 = 0;
        anInt57 = j;
        if(i != 0)
        {
            for(int l = 1; l > 0; l++);
        }
        anInt58 = k;
        anIntArrayArray59 = new int[anInt57][anInt58];
        method157();
    }

    public void method157()
    {
        for(int i = 0; i < anInt57; i++)
        {
            for(int j = 0; j < anInt58; j++)
                if(i == 0 || j == 0 || i == anInt57 - 1 || j == anInt58 - 1)
                    anIntArrayArray59[i][j] = 0xffffff;
                else
                    anIntArrayArray59[i][j] = 0x1000000;

        }

    }

    public void method158(int i, int j, boolean flag, int k, int l, int i1)
    {
        if(i != anInt49)
            return;
        l -= anInt55;
        j -= anInt56;
        if(k == 0)
        {
            if(i1 == 0)
            {
                method161(l, j, 128);
                method161(l - 1, j, 8);
            }
            if(i1 == 1)
            {
                method161(l, j, 2);
                method161(l, j + 1, 32);
            }
            if(i1 == 2)
            {
                method161(l, j, 8);
                method161(l + 1, j, 128);
            }
            if(i1 == 3)
            {
                method161(l, j, 32);
                method161(l, j - 1, 2);
            }
        }
        if(k == 1 || k == 3)
        {
            if(i1 == 0)
            {
                method161(l, j, 1);
                method161(l - 1, j + 1, 16);
            }
            if(i1 == 1)
            {
                method161(l, j, 4);
                method161(l + 1, j + 1, 64);
            }
            if(i1 == 2)
            {
                method161(l, j, 16);
                method161(l + 1, j - 1, 1);
            }
            if(i1 == 3)
            {
                method161(l, j, 64);
                method161(l - 1, j - 1, 4);
            }
        }
        if(k == 2)
        {
            if(i1 == 0)
            {
                method161(l, j, 130);
                method161(l - 1, j, 8);
                method161(l, j + 1, 32);
            }
            if(i1 == 1)
            {
                method161(l, j, 10);
                method161(l, j + 1, 32);
                method161(l + 1, j, 128);
            }
            if(i1 == 2)
            {
                method161(l, j, 40);
                method161(l + 1, j, 128);
                method161(l, j - 1, 2);
            }
            if(i1 == 3)
            {
                method161(l, j, 160);
                method161(l, j - 1, 2);
                method161(l - 1, j, 8);
            }
        }
        if(flag)
        {
            if(k == 0)
            {
                if(i1 == 0)
                {
                    method161(l, j, 0x10000);
                    method161(l - 1, j, 4096);
                }
                if(i1 == 1)
                {
                    method161(l, j, 1024);
                    method161(l, j + 1, 16384);
                }
                if(i1 == 2)
                {
                    method161(l, j, 4096);
                    method161(l + 1, j, 0x10000);
                }
                if(i1 == 3)
                {
                    method161(l, j, 16384);
                    method161(l, j - 1, 1024);
                }
            }
            if(k == 1 || k == 3)
            {
                if(i1 == 0)
                {
                    method161(l, j, 512);
                    method161(l - 1, j + 1, 8192);
                }
                if(i1 == 1)
                {
                    method161(l, j, 2048);
                    method161(l + 1, j + 1, 32768);
                }
                if(i1 == 2)
                {
                    method161(l, j, 8192);
                    method161(l + 1, j - 1, 512);
                }
                if(i1 == 3)
                {
                    method161(l, j, 32768);
                    method161(l - 1, j - 1, 2048);
                }
            }
            if(k == 2)
            {
                if(i1 == 0)
                {
                    method161(l, j, 0x10400);
                    method161(l - 1, j, 4096);
                    method161(l, j + 1, 16384);
                }
                if(i1 == 1)
                {
                    method161(l, j, 5120);
                    method161(l, j + 1, 16384);
                    method161(l + 1, j, 0x10000);
                }
                if(i1 == 2)
                {
                    method161(l, j, 20480);
                    method161(l + 1, j, 0x10000);
                    method161(l, j - 1, 1024);
                }
                if(i1 == 3)
                {
                    method161(l, j, 0x14000);
                    method161(l, j - 1, 1024);
                    method161(l - 1, j, 4096);
                }
            }
        }
    }

    public void method159(int i, int j, int k, byte byte0, boolean flag, int l, int i1)
    {
        int j1 = 256;
        if(flag)
            j1 += 0x20000;
        k -= anInt55;
        i -= anInt56;
        if(j == 1 || j == 3)
        {
            int k1 = i1;
            i1 = l;
            l = k1;
        }
        for(int l1 = k; l1 < k + i1; l1++)
            if(l1 >= 0 && l1 < anInt57)
            {
                for(int i2 = i; i2 < i + l; i2++)
                    if(i2 >= 0 && i2 < anInt58)
                        method161(l1, i2, j1);

            }

        if(byte0 != 2)
        {
            for(int j2 = 1; j2 > 0; j2++);
        }
    }

    public void method160(int i, int j, boolean flag)
    {
        i -= anInt55;
        j -= anInt56;
        anIntArrayArray59[i][j] |= 0x200000;
        if(!flag)
        {
            for(int k = 1; k > 0; k++);
        }
    }

    public void method161(int i, int j, int k)
    {
        anIntArrayArray59[i][j] |= k;
    }

    public void method162(int i, int j, boolean flag, int k, boolean flag1, int l)
    {
        k -= anInt55;
        if(!flag1)
        {
            for(int i1 = 1; i1 > 0; i1++);
        }
        i -= anInt56;
        if(j == 0)
        {
            if(l == 0)
            {
                method164(k, i, aBoolean51, 128);
                method164(k - 1, i, aBoolean51, 8);
            }
            if(l == 1)
            {
                method164(k, i, aBoolean51, 2);
                method164(k, i + 1, aBoolean51, 32);
            }
            if(l == 2)
            {
                method164(k, i, aBoolean51, 8);
                method164(k + 1, i, aBoolean51, 128);
            }
            if(l == 3)
            {
                method164(k, i, aBoolean51, 32);
                method164(k, i - 1, aBoolean51, 2);
            }
        }
        if(j == 1 || j == 3)
        {
            if(l == 0)
            {
                method164(k, i, aBoolean51, 1);
                method164(k - 1, i + 1, aBoolean51, 16);
            }
            if(l == 1)
            {
                method164(k, i, aBoolean51, 4);
                method164(k + 1, i + 1, aBoolean51, 64);
            }
            if(l == 2)
            {
                method164(k, i, aBoolean51, 16);
                method164(k + 1, i - 1, aBoolean51, 1);
            }
            if(l == 3)
            {
                method164(k, i, aBoolean51, 64);
                method164(k - 1, i - 1, aBoolean51, 4);
            }
        }
        if(j == 2)
        {
            if(l == 0)
            {
                method164(k, i, aBoolean51, 130);
                method164(k - 1, i, aBoolean51, 8);
                method164(k, i + 1, aBoolean51, 32);
            }
            if(l == 1)
            {
                method164(k, i, aBoolean51, 10);
                method164(k, i + 1, aBoolean51, 32);
                method164(k + 1, i, aBoolean51, 128);
            }
            if(l == 2)
            {
                method164(k, i, aBoolean51, 40);
                method164(k + 1, i, aBoolean51, 128);
                method164(k, i - 1, aBoolean51, 2);
            }
            if(l == 3)
            {
                method164(k, i, aBoolean51, 160);
                method164(k, i - 1, aBoolean51, 2);
                method164(k - 1, i, aBoolean51, 8);
            }
        }
        if(flag)
        {
            if(j == 0)
            {
                if(l == 0)
                {
                    method164(k, i, aBoolean51, 0x10000);
                    method164(k - 1, i, aBoolean51, 4096);
                }
                if(l == 1)
                {
                    method164(k, i, aBoolean51, 1024);
                    method164(k, i + 1, aBoolean51, 16384);
                }
                if(l == 2)
                {
                    method164(k, i, aBoolean51, 4096);
                    method164(k + 1, i, aBoolean51, 0x10000);
                }
                if(l == 3)
                {
                    method164(k, i, aBoolean51, 16384);
                    method164(k, i - 1, aBoolean51, 1024);
                }
            }
            if(j == 1 || j == 3)
            {
                if(l == 0)
                {
                    method164(k, i, aBoolean51, 512);
                    method164(k - 1, i + 1, aBoolean51, 8192);
                }
                if(l == 1)
                {
                    method164(k, i, aBoolean51, 2048);
                    method164(k + 1, i + 1, aBoolean51, 32768);
                }
                if(l == 2)
                {
                    method164(k, i, aBoolean51, 8192);
                    method164(k + 1, i - 1, aBoolean51, 512);
                }
                if(l == 3)
                {
                    method164(k, i, aBoolean51, 32768);
                    method164(k - 1, i - 1, aBoolean51, 2048);
                }
            }
            if(j == 2)
            {
                if(l == 0)
                {
                    method164(k, i, aBoolean51, 0x10400);
                    method164(k - 1, i, aBoolean51, 4096);
                    method164(k, i + 1, aBoolean51, 16384);
                }
                if(l == 1)
                {
                    method164(k, i, aBoolean51, 5120);
                    method164(k, i + 1, aBoolean51, 16384);
                    method164(k + 1, i, aBoolean51, 0x10000);
                }
                if(l == 2)
                {
                    method164(k, i, aBoolean51, 20480);
                    method164(k + 1, i, aBoolean51, 0x10000);
                    method164(k, i - 1, aBoolean51, 1024);
                }
                if(l == 3)
                {
                    method164(k, i, aBoolean51, 0x14000);
                    method164(k, i - 1, aBoolean51, 1024);
                    method164(k - 1, i, aBoolean51, 4096);
                }
            }
        }
    }

    public void method163(int i, int j, int k, int l, byte byte0, boolean flag, int i1)
    {
        int j1 = 256;
        if(flag)
            j1 += 0x20000;
        j -= anInt55;
        if(byte0 != 3)
            anInt48 = -416;
        l -= anInt56;
        if(k == 1 || k == 3)
        {
            int k1 = i;
            i = i1;
            i1 = k1;
        }
        for(int l1 = j; l1 < j + i; l1++)
            if(l1 >= 0 && l1 < anInt57)
            {
                for(int i2 = l; i2 < l + i1; i2++)
                    if(i2 >= 0 && i2 < anInt58)
                        method164(l1, i2, aBoolean51, j1);

            }

    }

    public void method164(int i, int j, boolean flag, int k)
    {
        anIntArrayArray59[i][j] &= 0xffffff - k;
        if(flag);
    }

    public void method165(int i, int j, int k)
    {
        if(k != -44679)
            aBoolean50 = !aBoolean50;
        j -= anInt55;
        i -= anInt56;
        anIntArrayArray59[j][i] &= 0xdfffff;
    }

    public boolean method166(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        if(i1 == k1 && k == i)
            return true;
        i1 -= anInt55;
        k -= anInt56;
        j1 = 61 / j1;
        k1 -= anInt55;
        i -= anInt56;
        if(l == 0)
            if(j == 0)
            {
                if(i1 == k1 - 1 && k == i)
                    return true;
                if(i1 == k1 && k == i + 1 && (anIntArrayArray59[i1][k] & 0x1280120) == 0)
                    return true;
                if(i1 == k1 && k == i - 1 && (anIntArrayArray59[i1][k] & 0x1280102) == 0)
                    return true;
            } else
            if(j == 1)
            {
                if(i1 == k1 && k == i + 1)
                    return true;
                if(i1 == k1 - 1 && k == i && (anIntArrayArray59[i1][k] & 0x1280108) == 0)
                    return true;
                if(i1 == k1 + 1 && k == i && (anIntArrayArray59[i1][k] & 0x1280180) == 0)
                    return true;
            } else
            if(j == 2)
            {
                if(i1 == k1 + 1 && k == i)
                    return true;
                if(i1 == k1 && k == i + 1 && (anIntArrayArray59[i1][k] & 0x1280120) == 0)
                    return true;
                if(i1 == k1 && k == i - 1 && (anIntArrayArray59[i1][k] & 0x1280102) == 0)
                    return true;
            } else
            if(j == 3)
            {
                if(i1 == k1 && k == i - 1)
                    return true;
                if(i1 == k1 - 1 && k == i && (anIntArrayArray59[i1][k] & 0x1280108) == 0)
                    return true;
                if(i1 == k1 + 1 && k == i && (anIntArrayArray59[i1][k] & 0x1280180) == 0)
                    return true;
            }
        if(l == 2)
            if(j == 0)
            {
                if(i1 == k1 - 1 && k == i)
                    return true;
                if(i1 == k1 && k == i + 1)
                    return true;
                if(i1 == k1 + 1 && k == i && (anIntArrayArray59[i1][k] & 0x1280180) == 0)
                    return true;
                if(i1 == k1 && k == i - 1 && (anIntArrayArray59[i1][k] & 0x1280102) == 0)
                    return true;
            } else
            if(j == 1)
            {
                if(i1 == k1 - 1 && k == i && (anIntArrayArray59[i1][k] & 0x1280108) == 0)
                    return true;
                if(i1 == k1 && k == i + 1)
                    return true;
                if(i1 == k1 + 1 && k == i)
                    return true;
                if(i1 == k1 && k == i - 1 && (anIntArrayArray59[i1][k] & 0x1280102) == 0)
                    return true;
            } else
            if(j == 2)
            {
                if(i1 == k1 - 1 && k == i && (anIntArrayArray59[i1][k] & 0x1280108) == 0)
                    return true;
                if(i1 == k1 && k == i + 1 && (anIntArrayArray59[i1][k] & 0x1280120) == 0)
                    return true;
                if(i1 == k1 + 1 && k == i)
                    return true;
                if(i1 == k1 && k == i - 1)
                    return true;
            } else
            if(j == 3)
            {
                if(i1 == k1 - 1 && k == i)
                    return true;
                if(i1 == k1 && k == i + 1 && (anIntArrayArray59[i1][k] & 0x1280120) == 0)
                    return true;
                if(i1 == k1 + 1 && k == i && (anIntArrayArray59[i1][k] & 0x1280180) == 0)
                    return true;
                if(i1 == k1 && k == i - 1)
                    return true;
            }
        if(l == 9)
        {
            if(i1 == k1 && k == i + 1 && (anIntArrayArray59[i1][k] & 0x20) == 0)
                return true;
            if(i1 == k1 && k == i - 1 && (anIntArrayArray59[i1][k] & 2) == 0)
                return true;
            if(i1 == k1 - 1 && k == i && (anIntArrayArray59[i1][k] & 8) == 0)
                return true;
            if(i1 == k1 + 1 && k == i && (anIntArrayArray59[i1][k] & 0x80) == 0)
                return true;
        }
        return false;
    }

    public boolean method167(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        if(j1 == i1 && i == j)
            return true;
        j1 -= anInt55;
        if(l != 36084)
            throw new NullPointerException();
        i -= anInt56;
        i1 -= anInt55;
        j -= anInt56;
        if(k == 6 || k == 7)
        {
            if(k == 7)
                k1 = k1 + 2 & 3;
            if(k1 == 0)
            {
                if(j1 == i1 + 1 && i == j && (anIntArrayArray59[j1][i] & 0x80) == 0)
                    return true;
                if(j1 == i1 && i == j - 1 && (anIntArrayArray59[j1][i] & 2) == 0)
                    return true;
            } else
            if(k1 == 1)
            {
                if(j1 == i1 - 1 && i == j && (anIntArrayArray59[j1][i] & 8) == 0)
                    return true;
                if(j1 == i1 && i == j - 1 && (anIntArrayArray59[j1][i] & 2) == 0)
                    return true;
            } else
            if(k1 == 2)
            {
                if(j1 == i1 - 1 && i == j && (anIntArrayArray59[j1][i] & 8) == 0)
                    return true;
                if(j1 == i1 && i == j + 1 && (anIntArrayArray59[j1][i] & 0x20) == 0)
                    return true;
            } else
            if(k1 == 3)
            {
                if(j1 == i1 + 1 && i == j && (anIntArrayArray59[j1][i] & 0x80) == 0)
                    return true;
                if(j1 == i1 && i == j + 1 && (anIntArrayArray59[j1][i] & 0x20) == 0)
                    return true;
            }
        }
        if(k == 8)
        {
            if(j1 == i1 && i == j + 1 && (anIntArrayArray59[j1][i] & 0x20) == 0)
                return true;
            if(j1 == i1 && i == j - 1 && (anIntArrayArray59[j1][i] & 2) == 0)
                return true;
            if(j1 == i1 - 1 && i == j && (anIntArrayArray59[j1][i] & 8) == 0)
                return true;
            if(j1 == i1 + 1 && i == j && (anIntArrayArray59[j1][i] & 0x80) == 0)
                return true;
        }
        return false;
    }

    public boolean method168(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
        if(j1 <= 0)
            throw new NullPointerException();
        int i2 = (l1 + l) - 1;
        int j2 = (i1 + j) - 1;
        if(k1 >= l1 && k1 <= i2 && i >= i1 && i <= j2)
            return true;
        if(k1 == l1 - 1 && i >= i1 && i <= j2 && (anIntArrayArray59[k1 - anInt55][i - anInt56] & 8) == 0 && (k & 8) == 0)
            return true;
        if(k1 == i2 + 1 && i >= i1 && i <= j2 && (anIntArrayArray59[k1 - anInt55][i - anInt56] & 0x80) == 0 && (k & 2) == 0)
            return true;
        if(i == i1 - 1 && k1 >= l1 && k1 <= i2 && (anIntArrayArray59[k1 - anInt55][i - anInt56] & 2) == 0 && (k & 4) == 0)
            return true;
        return i == j2 + 1 && k1 >= l1 && k1 <= i2 && (anIntArrayArray59[k1 - anInt55][i - anInt56] & 0x20) == 0 && (k & 1) == 0;
    }

    public int anInt48;
    public int anInt49;
    public boolean aBoolean50;
    public boolean aBoolean51;
    public boolean aBoolean52;
    public byte aByte53;
    public boolean aBoolean54;
    public int anInt55;
    public int anInt56;
    public int anInt57;
    public int anInt58;
    public int anIntArrayArray59[][];
}
