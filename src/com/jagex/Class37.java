package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import com.jagex.sign.Signlink;

public class Class37
{

    public static long stringToLong(String s)
    {
        long l = 0L;
        for(int i = 0; i < s.length() && i < 12; i++)
        {
            char c = s.charAt(i);
            l *= 37L;
            if(c >= 'A' && c <= 'Z')
                l += (1 + c) - 65;
            else
            if(c >= 'a' && c <= 'z')
                l += (1 + c) - 97;
            else
            if(c >= '0' && c <= '9')
                l += (27 + c) - 48;
        }

        for(; l % 37L == 0L && l != 0L; l /= 37L);
        return l;
    }

    public static String method369(int i, long l)
    {
        try
        {
            if(l <= 0L || l >= 0x5b5b57f8a98a5dd1L)
                return "invalid_name";
            if(l % 37L == 0L)
                return "invalid_name";
            int j = 0;
            char ac[] = new char[12];
            if(i >= 0)
            {
                for(int k = 1; k > 0; k++);
            }
            while(l != 0L) 
            {
                long l1 = l;
                l /= 37L;
                ac[11 - j++] = aCharArray681[(int)(l1 - l * 37L)];
            }
            return new String(ac, 12 - j, j);
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("73030, " + i + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public static long method370(String s, int i)
    {
        s = s.toUpperCase();
        long l = 0L;
        for(int j = 0; j < s.length(); j++)
        {
            l = (l * 61L + (long)s.charAt(j)) - 32L;
            l = l + (l >> 56) & 0xffffffffffffffL;
        }

        if(i != 0)
            throw new NullPointerException();
        else
            return l;
    }

    public static String method371(int i, byte byte0)
    {
        if(byte0 == 4)
            byte0 = 0;
        else
            anInt680 = 459;
        return (i >> 24 & 0xff) + "." + (i >> 16 & 0xff) + "." + (i >> 8 & 0xff) + "." + (i & 0xff);
    }

    public static String method372(String s, boolean flag)
    {
        if(flag)
            throw new NullPointerException();
        if(s.length() > 0)
        {
            char ac[] = s.toCharArray();
            for(int i = 0; i < ac.length; i++)
                if(ac[i] == '_')
                {
                    ac[i] = ' ';
                    if(i + 1 < ac.length && ac[i + 1] >= 'a' && ac[i + 1] <= 'z')
                        ac[i + 1] = (char)((ac[i + 1] + 65) - 97);
                }

            if(ac[0] >= 'a' && ac[0] <= 'z')
                ac[0] = (char)((ac[0] + 65) - 97);
            return new String(ac);
        } else
        {
            return s;
        }
    }

    public static String method373(String s, int i)
    {
        while(i >= 0) 
        {
            for(int j = 1; j > 0; j++);
        }
        StringBuffer stringbuffer = new StringBuffer();
        for(int k = 0; k < s.length(); k++)
            stringbuffer.append("*");

        return stringbuffer.toString();
    }

    public static byte aByte678 = 8;
    public static int anInt679 = 3;
    public static int anInt680 = 612;
    public static final char aCharArray681[] = {
        '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 
        'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 
        't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', 
        '3', '4', '5', '6', '7', '8', '9'
    };

}
