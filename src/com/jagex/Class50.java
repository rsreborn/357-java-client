package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class50
{

    public static String method601(Buffer class39_sub3_sub3, int i, int j)
    {
        int k = 0;
        int l = -1;
        for(int i1 = 0; i1 < i; i1++)
        {
            int j1 = class39_sub3_sub3.getUnsignedByte();
            int k1 = j1 >> 4 & 0xf;
            if(l == -1)
            {
                if(k1 < 13)
                    aCharArray835[k++] = aCharArray837[k1];
                else
                    l = k1;
            } else
            {
                aCharArray835[k++] = aCharArray837[((l << 4) + k1) - 195];
                l = -1;
            }
            k1 = j1 & 0xf;
            if(l == -1)
            {
                if(k1 < 13)
                    aCharArray835[k++] = aCharArray837[k1];
                else
                    l = k1;
            } else
            {
                aCharArray835[k++] = aCharArray837[((l << 4) + k1) - 195];
                l = -1;
            }
        }

        boolean flag = true;
        for(int l1 = 0; l1 < k; l1++)
        {
            char c = aCharArray835[l1];
            if(flag && c >= 'a' && c <= 'z')
            {
                aCharArray835[l1] += '\uFFE0';
                flag = false;
            }
            if(c == '.' || c == '!' || c == '?')
                flag = true;
        }

        if(j != 0)
            aBoolean833 = !aBoolean833;
        return new String(aCharArray835, 0, k);
    }

    public static void method602(Buffer class39_sub3_sub3, int i, String s)
    {
        if(s.length() > 80)
            s = s.substring(0, 80);
        s = s.toLowerCase();
        if(i != anInt834)
        {
            for(int j = 1; j > 0; j++);
        }
        int k = -1;
        for(int l = 0; l < s.length(); l++)
        {
            char c = s.charAt(l);
            int i1 = 0;
            for(int j1 = 0; j1 < aCharArray837.length; j1++)
            {
                if(c != aCharArray837[j1])
                    continue;
                i1 = j1;
                break;
            }

            if(i1 > 12)
                i1 += 195;
            if(k == -1)
            {
                if(i1 < 13)
                    k = i1;
                else
                    class39_sub3_sub3.putByte(i1);
            } else
            if(i1 < 13)
            {
                class39_sub3_sub3.putByte((k << 4) + i1);
                k = -1;
            } else
            {
                class39_sub3_sub3.putByte((k << 4) + (i1 >> 4));
                k = i1 & 0xf;
            }
        }

        if(k != -1)
            class39_sub3_sub3.putByte(k << 4);
    }

    public static String method603(String s, boolean flag)
    {
        aClass39_Sub3_Sub3_836.currentOffset = 0;
        method602(aClass39_Sub3_Sub3_836, 8378, s);
        if(!flag)
            aBoolean832 = !aBoolean832;
        int i = aClass39_Sub3_Sub3_836.currentOffset;
        aClass39_Sub3_Sub3_836.currentOffset = 0;
        String s1 = method601(aClass39_Sub3_Sub3_836, i, 0);
        return s1;
    }

    public static boolean aBoolean832 = true;
    public static boolean aBoolean833;
    public static int anInt834 = 8378;
    public static char aCharArray835[] = new char[100];
    public static Buffer aClass39_Sub3_Sub3_836 = new Buffer(new byte[100]);
    public static char aCharArray837[] = {
        ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n', 's', 'r', 
        'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 
        'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', 
        '3', '4', '5', '6', '7', '8', '9', ' ', '!', '?', 
        '.', ',', ':', ';', '(', ')', '-', '&', '*', '\\', 
        '\'', '@', '#', '+', '=', '\243', '$', '%', '"', '[', 
        ']'
    };

}
