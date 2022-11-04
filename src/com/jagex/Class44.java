package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class44
{

    public static void method546(Class10 class10)
    {
        Buffer class39_sub3_sub3 = new Buffer(class10.method193("fragmentsenc.txt", null));
        Buffer class39_sub3_sub3_1 = new Buffer(class10.method193("badenc.txt", null));
        Buffer class39_sub3_sub3_2 = new Buffer(class10.method193("domainenc.txt", null));
        Buffer class39_sub3_sub3_3 = new Buffer(class10.method193("tldlist.txt", null));
        method547(class39_sub3_sub3, class39_sub3_sub3_1, class39_sub3_sub3_2, class39_sub3_sub3_3);
    }

    public static void method547(Buffer class39_sub3_sub3, Buffer class39_sub3_sub3_1, Buffer class39_sub3_sub3_2, Buffer class39_sub3_sub3_3)
    {
        method549(aBoolean735, class39_sub3_sub3_1);
        method550(class39_sub3_sub3_2, false);
        method551(true, class39_sub3_sub3);
        method548(class39_sub3_sub3_3, 2);
    }

    public static void method548(Buffer class39_sub3_sub3, int i)
    {
        if(i != 2)
            return;
        int j = class39_sub3_sub3.readIntBE();
        aCharArrayArray749 = new char[j][];
        anIntArray750 = new int[j];
        for(int k = 0; k < j; k++)
        {
            anIntArray750[k] = class39_sub3_sub3.readUByte();
            char ac[] = new char[class39_sub3_sub3.readUByte()];
            for(int l = 0; l < ac.length; l++)
                ac[l] = (char)class39_sub3_sub3.readUByte();

            aCharArrayArray749[k] = ac;
        }

    }

    public static void method549(boolean flag, Buffer class39_sub3_sub3)
    {
        int i = class39_sub3_sub3.readIntBE();
        aCharArrayArray746 = new char[i][];
        aByteArrayArrayArray747 = new byte[i][][];
        method552(true, class39_sub3_sub3, aByteArrayArrayArray747, aCharArrayArray746);
        if(flag)
            anInt734 = -293;
    }

    public static void method550(Buffer class39_sub3_sub3, boolean flag)
    {
        int i = class39_sub3_sub3.readIntBE();
        aCharArrayArray748 = new char[i][];
        method553(9, class39_sub3_sub3, aCharArrayArray748);
        if(!flag);
    }

    public static void method551(boolean flag, Buffer class39_sub3_sub3)
    {
        anIntArray745 = new int[class39_sub3_sub3.readIntBE()];
        if(!flag)
        {
            for(int i = 1; i > 0; i++);
        }
        for(int j = 0; j < anIntArray745.length; j++)
            anIntArray745[j] = class39_sub3_sub3.readShort();

    }

    public static void method552(boolean flag, Buffer class39_sub3_sub3, byte abyte0[][][], char ac[][]) {
        if(!flag)
            anInt744 = -194;
        for(int i = 0; i < ac.length; i++)
        {
            char ac1[] = new char[class39_sub3_sub3.readUByte()];
            for(int j = 0; j < ac1.length; j++)
                ac1[j] = (char)class39_sub3_sub3.readUByte();

            ac[i] = ac1;
            byte abyte1[][] = new byte[class39_sub3_sub3.readUByte()][2];
            for(int k = 0; k < abyte1.length; k++)
            {
                abyte1[k][0] = (byte)class39_sub3_sub3.readUByte();
                abyte1[k][1] = (byte)class39_sub3_sub3.readUByte();
            }

            if(abyte1.length > 0)
                abyte0[i] = abyte1;
        }

    }

    public static void method553(int i, Buffer class39_sub3_sub3, char ac[][])
    {
        if(i < anInt737 || i > anInt737)
            return;
        for(int j = 0; j < ac.length; j++)
        {
            char ac1[] = new char[class39_sub3_sub3.readUByte()];
            for(int k = 0; k < ac1.length; k++)
                ac1[k] = (char)class39_sub3_sub3.readUByte();

            ac[j] = ac1;
        }

    }

    public static void method554(int i, char ac[]) {
        int j = 0;
        if(i != 8) {
            for(int k = 1; k > 0; k++);
        }
        for(int l = 0; l < ac.length; l++) {
            if(method555(false, ac[l]))
                ac[j] = ac[l];
            else
                ac[j] = ' ';
            if(j == 0 || ac[j] != ' ' || ac[j - 1] != ' ')
                j++;
        }

        for(int i1 = j; i1 < ac.length; i1++)
            ac[i1] = ' ';

    }

    public static boolean method555(boolean flag, char c)
    {
        if(flag)
            throw new NullPointerException();
        return c >= ' ' && c <= '\177' || c == ' ' || c == '\n' || c == '\t' || c == '\243' || c == '\u20AC';
    }

    public static String method556(String s, boolean flag)
    {
        long l = System.currentTimeMillis();
        char ac[] = s.toCharArray();
        method554(8, ac);
        String s1 = (new String(ac)).trim();
        ac = s1.toLowerCase().toCharArray();
        String s2 = s1.toLowerCase();
        method564(ac, false);
        method559(ac, (byte)40);
        method560((byte)56, ac);
        if(!flag)
            throw new NullPointerException();
        method573(ac, 3);
        for(int i = 0; i < aStringArray751.length; i++)
        {
            for(int j = -1; (j = s2.indexOf(aStringArray751[i], j + 1)) != -1;)
            {
                char ac1[] = aStringArray751[i].toCharArray();
                for(int k = 0; k < ac1.length; k++)
                    ac[k + j] = ac1[k];

            }

        }

        method557(false, ac, s1.toCharArray());
        method558(aByte738, ac);
        long l1 = System.currentTimeMillis();
        return (new String(ac)).trim();
    }

    public static void method557(boolean flag, char ac[], char ac1[])
    {
        for(int i = 0; i < ac1.length; i++)
            if(ac[i] != '*' && method581(true, ac1[i]))
                ac[i] = ac1[i];

        if(!flag);
    }

    public static void method558(byte byte0, char ac[])
    {
        if(byte0 == 4)
            byte0 = 0;
        else
            aBoolean736 = !aBoolean736;
        boolean flag = true;
        for(int i = 0; i < ac.length; i++)
        {
            char c = ac[i];
            if(method578(0, c))
            {
                if(flag)
                {
                    if(method580(0, c))
                        flag = false;
                } else
                if(method581(true, c))
                    ac[i] = (char)((c + 97) - 65);
            } else
            {
                flag = true;
            }
        }

    }

    public static void method559(char ac[], byte byte0)
    {
        if(byte0 != 40)
            anInt737 = 475;
        for(int i = 0; i < 2; i++)
        {
            for(int j = aCharArrayArray746.length - 1; j >= 0; j--)
                method568(anInt742, aCharArrayArray746[j], aByteArrayArrayArray747[j], ac);

        }

    }

    public static void method560(byte byte0, char ac[])
    {
        if(byte0 != 56)
            return;
        char ac1[] = (char[])ac.clone();
        char ac2[] = {
            '(', 'a', ')'
        };
        method568(anInt742, ac2, null, ac1);
        char ac3[] = (char[])ac.clone();
        char ac4[] = {
            'd', 'o', 't'
        };
        method568(anInt742, ac4, null, ac3);
        for(int i = aCharArrayArray748.length - 1; i >= 0; i--)
            method561(aCharArrayArray748[i], (byte)-58, ac, ac1, ac3);

    }

    public static void method561(char ac[], byte byte0, char ac1[], char ac2[], char ac3[])
    {
        if(byte0 != -58)
            anInt737 = 239;
        if(ac.length > ac1.length)
            return;
        boolean flag = true;
        int i;
        for(int j = 0; j <= ac1.length - ac.length; j += i)
        {
            int k = j;
            int l = 0;
            i = 1;
            while(k < ac1.length) 
            {
                int i1 = 0;
                char c = ac1[k];
                char c1 = '\0';
                if(k + 1 < ac1.length)
                    c1 = ac1[k + 1];
                if(l < ac.length && (i1 = method570(ac[l], c, (byte)9, c1)) > 0)
                {
                    k += i1;
                    l++;
                    continue;
                }
                if(l == 0)
                    break;
                if((i1 = method570(ac[l - 1], c, (byte)9, c1)) > 0)
                {
                    k += i1;
                    if(l == 1)
                        i++;
                    continue;
                }
                if(l >= ac.length || !method576(0, c))
                    break;
                k++;
            }
            if(l >= ac.length)
            {
                boolean flag1 = false;
                int j1 = method562(ac1, j, ac2, -17994);
                int k1 = method563(k - 1, ac3, ac1, (byte)3);
                if(j1 > 2 || k1 > 2)
                    flag1 = true;
                if(flag1)
                {
                    for(int l1 = j; l1 < k; l1++)
                        ac1[l1] = '*';

                }
            }
        }

    }

    public static int method562(char ac[], int i, char ac1[], int j)
    {
        if(j != -17994)
            anInt734 = 165;
        if(i == 0)
            return 2;
        for(int k = i - 1; k >= 0; k--)
        {
            if(!method576(0, ac[k]))
                break;
            if(ac[k] == '@')
                return 3;
        }

        int l = 0;
        for(int i1 = i - 1; i1 >= 0; i1--)
        {
            if(!method576(0, ac1[i1]))
                break;
            if(ac1[i1] == '*')
                l++;
        }

        if(l >= 3)
            return 4;
        return !method576(0, ac[i - 1]) ? 0 : 1;
    }

    public static int method563(int i, char ac[], char ac1[], byte byte0)
    {
        if(i + 1 == ac1.length)
            return 2;
        for(int j = i + 1; j < ac1.length; j++)
        {
            if(!method576(0, ac1[j]))
                break;
            if(ac1[j] == '.' || ac1[j] == ',')
                return 3;
        }

        if(byte0 == aByte739)
        {
            byte0 = 0;
        } else
        {
            for(int k = 1; k > 0; k++);
        }
        int l = 0;
        for(int i1 = i + 1; i1 < ac1.length; i1++)
        {
            if(!method576(0, ac[i1]))
                break;
            if(ac[i1] == '*')
                l++;
        }

        if(l >= 3)
            return 4;
        return !method576(0, ac1[i + 1]) ? 0 : 1;
    }

    public static void method564(char ac[], boolean flag)
    {
        char ac1[] = (char[])ac.clone();
        char ac2[] = {
            'd', 'o', 't'
        };
        if(flag)
        {
            for(int i = 1; i > 0; i++);
        }
        method568(anInt742, ac2, null, ac1);
        char ac3[] = (char[])ac.clone();
        char ac4[] = {
            's', 'l', 'a', 's', 'h'
        };
        method568(anInt742, ac4, null, ac3);
        for(int j = 0; j < aCharArrayArray749.length; j++)
            method565(aByte740, ac3, ac1, ac, anIntArray750[j], aCharArrayArray749[j]);

    }

    public static void method565(byte byte0, char ac[], char ac1[], char ac2[], int i, char ac3[])
    {
        if(ac3.length > ac2.length)
            return;
        boolean flag = true;
        if(byte0 != 4)
            anInt744 = 46;
        int j;
        for(int k = 0; k <= ac2.length - ac3.length; k += j)
        {
            int l = k;
            int i1 = 0;
            j = 1;
            while(l < ac2.length) 
            {
                int j1 = 0;
                char c = ac2[l];
                char c1 = '\0';
                if(l + 1 < ac2.length)
                    c1 = ac2[l + 1];
                if(i1 < ac3.length && (j1 = method570(ac3[i1], c, (byte)9, c1)) > 0)
                {
                    l += j1;
                    i1++;
                    continue;
                }
                if(i1 == 0)
                    break;
                if((j1 = method570(ac3[i1 - 1], c, (byte)9, c1)) > 0)
                {
                    l += j1;
                    if(i1 == 1)
                        j++;
                    continue;
                }
                if(i1 >= ac3.length || !method576(0, c))
                    break;
                l++;
            }
            if(i1 >= ac3.length)
            {
                boolean flag1 = false;
                int k1 = method566(ac2, ac1, anInt741, k);
                int l1 = method567(ac, (byte)49, ac2, l - 1);
                if(i == 1 && k1 > 0 && l1 > 0)
                    flag1 = true;
                if(i == 2 && (k1 > 2 && l1 > 0 || k1 > 0 && l1 > 2))
                    flag1 = true;
                if(i == 3 && k1 > 0 && l1 > 2)
                    flag1 = true;
                boolean _tmp = i == 3 && k1 > 2 && l1 > 0;
                if(flag1)
                {
                    int i2 = k;
                    int j2 = l - 1;
                    if(k1 > 2)
                    {
                        if(k1 == 4)
                        {
                            boolean flag2 = false;
                            for(int l2 = i2 - 1; l2 >= 0; l2--)
                                if(flag2)
                                {
                                    if(ac1[l2] != '*')
                                        break;
                                    i2 = l2;
                                } else
                                if(ac1[l2] == '*')
                                {
                                    i2 = l2;
                                    flag2 = true;
                                }

                        }
                        boolean flag3 = false;
                        for(int i3 = i2 - 1; i3 >= 0; i3--)
                            if(flag3)
                            {
                                if(method576(0, ac2[i3]))
                                    break;
                                i2 = i3;
                            } else
                            if(!method576(0, ac2[i3]))
                            {
                                flag3 = true;
                                i2 = i3;
                            }

                    }
                    if(l1 > 2)
                    {
                        if(l1 == 4)
                        {
                            boolean flag4 = false;
                            for(int j3 = j2 + 1; j3 < ac2.length; j3++)
                                if(flag4)
                                {
                                    if(ac[j3] != '*')
                                        break;
                                    j2 = j3;
                                } else
                                if(ac[j3] == '*')
                                {
                                    j2 = j3;
                                    flag4 = true;
                                }

                        }
                        boolean flag5 = false;
                        for(int k3 = j2 + 1; k3 < ac2.length; k3++)
                            if(flag5)
                            {
                                if(method576(0, ac2[k3]))
                                    break;
                                j2 = k3;
                            } else
                            if(!method576(0, ac2[k3]))
                            {
                                flag5 = true;
                                j2 = k3;
                            }

                    }
                    for(int k2 = i2; k2 <= j2; k2++)
                        ac2[k2] = '*';

                }
            }
        }

    }

    public static int method566(char ac[], char ac1[], int i, int j)
    {
        if(j == 0)
            return 2;
        for(int k = j - 1; k >= 0; k--)
        {
            if(!method576(0, ac[k]))
                break;
            if(ac[k] == ',' || ac[k] == '.')
                return 3;
        }

        int l = 0;
        for(int i1 = j - 1; i1 >= 0; i1--)
        {
            if(!method576(0, ac1[i1]))
                break;
            if(ac1[i1] == '*')
                l++;
        }

        if(i >= 0)
            return anInt734;
        if(l >= 3)
            return 4;
        return !method576(0, ac[j - 1]) ? 0 : 1;
    }

    public static int method567(char ac[], byte byte0, char ac1[], int i)
    {
        if(i + 1 == ac1.length)
            return 2;
        for(int j = i + 1; j < ac1.length; j++)
        {
            if(!method576(0, ac1[j]))
                break;
            if(ac1[j] == '\\' || ac1[j] == '/')
                return 3;
        }

        int k = 0;
        if(byte0 != 49)
            anInt737 = 481;
        for(int l = i + 1; l < ac1.length; l++)
        {
            if(!method576(0, ac[l]))
                break;
            if(ac[l] == '*')
                k++;
        }

        if(k >= 5)
            return 4;
        return !method576(0, ac1[i + 1]) ? 0 : 1;
    }

    public static void method568(int i, char ac[], byte abyte0[][], char ac1[])
    {
        if(ac.length > ac1.length)
            return;
        boolean flag = true;
        while(i >= 0) 
        {
            for(int k = 1; k > 0; k++);
        }
        int j;
        for(int l = 0; l <= ac1.length - ac.length; l += j)
        {
            int i1 = l;
            int j1 = 0;
            int k1 = 0;
            j = 1;
            boolean flag1 = false;
            boolean flag2 = false;
            boolean flag3 = false;
            while(i1 < ac1.length && (!flag2 || !flag3)) 
            {
                int l1 = 0;
                char c = ac1[i1];
                char c2 = '\0';
                if(i1 + 1 < ac1.length)
                    c2 = ac1[i1 + 1];
                if(j1 < ac.length && (l1 = method571(c, ac[j1], c2, -170)) > 0)
                {
                    if(l1 == 1 && method579(c, true))
                        flag2 = true;
                    if(l1 == 2 && (method579(c, true) || method579(c2, true)))
                        flag2 = true;
                    i1 += l1;
                    j1++;
                    continue;
                }
                if(j1 == 0)
                    break;
                if((l1 = method571(c, ac[j1 - 1], c2, -170)) > 0)
                {
                    i1 += l1;
                    if(j1 == 1)
                        j++;
                    continue;
                }
                if(j1 >= ac.length || !method577(c, 0))
                    break;
                if(method576(0, c) && c != '\'')
                    flag1 = true;
                if(method579(c, true))
                    flag3 = true;
                i1++;
                if((++k1 * 100) / (i1 - l) > 90)
                    break;
            }
            if(j1 >= ac.length && (!flag2 || !flag3))
            {
                boolean flag4 = true;
                if(!flag1)
                {
                    char c1 = ' ';
                    if(l - 1 >= 0)
                        c1 = ac1[l - 1];
                    char c3 = ' ';
                    if(i1 < ac1.length)
                        c3 = ac1[i1];
                    byte byte0 = method572(7, c1);
                    byte byte1 = method572(7, c3);
                    if(abyte0 != null && method569(byte0, byte1, abyte0, true))
                        flag4 = false;
                } else
                {
                    boolean flag5 = false;
                    boolean flag6 = false;
                    if(l - 1 < 0 || method576(0, ac1[l - 1]) && ac1[l - 1] != '\'')
                        flag5 = true;
                    if(i1 >= ac1.length || method576(0, ac1[i1]) && ac1[i1] != '\'')
                        flag6 = true;
                    if(!flag5 || !flag6)
                    {
                        boolean flag7 = false;
                        int l2 = l - 2;
                        if(flag5)
                            l2 = l;
                        for(; !flag7 && l2 < i1; l2++)
                            if(l2 >= 0 && (!method576(0, ac1[l2]) || ac1[l2] == '\''))
                            {
                                char ac2[] = new char[3];
                                int k3;
                                for(k3 = 0; k3 < 3; k3++)
                                {
                                    if(l2 + k3 >= ac1.length || method576(0, ac1[l2 + k3]) && ac1[l2 + k3] != '\'')
                                        break;
                                    ac2[k3] = ac1[l2 + k3];
                                }

                                boolean flag8 = true;
                                if(k3 == 0)
                                    flag8 = false;
                                if(k3 < 3 && l2 - 1 >= 0 && (!method576(0, ac1[l2 - 1]) || ac1[l2 - 1] == '\''))
                                    flag8 = false;
                                if(flag8 && !method582(ac2, (byte)-31))
                                    flag7 = true;
                            }

                        if(!flag7)
                            flag4 = false;
                    }
                }
                if(flag4)
                {
                    int i2 = 0;
                    int j2 = 0;
                    int k2 = -1;
                    for(int i3 = l; i3 < i1; i3++)
                        if(method579(ac1[i3], true))
                            i2++;
                        else
                        if(method578(0, ac1[i3]))
                        {
                            j2++;
                            k2 = i3;
                        }

                    if(k2 > -1)
                        i2 -= i1 - 1 - k2;
                    if(i2 <= j2)
                    {
                        for(int j3 = l; j3 < i1; j3++)
                            ac1[j3] = '*';

                    } else
                    {
                        j = 1;
                    }
                }
            }
        }

    }

    public static boolean method569(byte byte0, byte byte1, byte abyte0[][], boolean flag)
    {
        int i = 0;
        if(!flag)
            aBoolean732 = !aBoolean732;
        if(abyte0[i][0] == byte0 && abyte0[i][1] == byte1)
            return true;
        int j = abyte0.length - 1;
        if(abyte0[j][0] == byte0 && abyte0[j][1] == byte1)
            return true;
        do
        {
            int k = (i + j) / 2;
            if(abyte0[k][0] == byte0 && abyte0[k][1] == byte1)
                return true;
            if(byte0 < abyte0[k][0] || byte0 == abyte0[k][0] && byte1 < abyte0[k][1])
                j = k;
            else
                i = k;
        } while(i != j && i + 1 != j);
        return false;
    }

    public static int method570(char c, char c1, byte byte0, char c2)
    {
        if(byte0 == 9)
            byte0 = 0;
        else
            return 3;
        if(c == c1)
            return 1;
        if(c == 'o' && c1 == '0')
            return 1;
        if(c == 'o' && c1 == '(' && c2 == ')')
            return 2;
        if(c == 'c' && (c1 == '(' || c1 == '<' || c1 == '['))
            return 1;
        if(c == 'e' && c1 == '\u20AC')
            return 1;
        if(c == 's' && c1 == '$')
            return 1;
        return c != 'l' || c1 != 'i' ? 0 : 1;
    }

    public static int method571(char c, char c1, char c2, int i)
    {
        if(i >= 0)
            return 3;
        if(c1 == c)
            return 1;
        if(c1 >= 'a' && c1 <= 'm')
        {
            if(c1 == 'a')
            {
                if(c == '4' || c == '@' || c == '^')
                    return 1;
                return c != '/' || c2 != '\\' ? 0 : 2;
            }
            if(c1 == 'b')
            {
                if(c == '6' || c == '8')
                    return 1;
                return (c != '1' || c2 != '3') && (c != 'i' || c2 != '3') ? 0 : 2;
            }
            if(c1 == 'c')
                return c != '(' && c != '<' && c != '{' && c != '[' ? 0 : 1;
            if(c1 == 'd')
                return (c != '[' || c2 != ')') && (c != 'i' || c2 != ')') ? 0 : 2;
            if(c1 == 'e')
                return c != '3' && c != '\u20AC' ? 0 : 1;
            if(c1 == 'f')
            {
                if(c == 'p' && c2 == 'h')
                    return 2;
                return c != '\243' ? 0 : 1;
            }
            if(c1 == 'g')
                return c != '9' && c != '6' && c != 'q' ? 0 : 1;
            if(c1 == 'h')
                return c != '#' ? 0 : 1;
            if(c1 == 'i')
                return c != 'y' && c != 'l' && c != 'j' && c != '1' && c != '!' && c != ':' && c != ';' && c != '|' ? 0 : 1;
            if(c1 == 'j')
                return 0;
            if(c1 == 'k')
                return 0;
            if(c1 == 'l')
                return c != '1' && c != '|' && c != 'i' ? 0 : 1;
            if(c1 == 'm')
                return 0;
        }
        if(c1 >= 'n' && c1 <= 'z')
        {
            if(c1 == 'n')
                return 0;
            if(c1 == 'o')
            {
                if(c == '0' || c == '*')
                    return 1;
                return (c != '(' || c2 != ')') && (c != '[' || c2 != ']') && (c != '{' || c2 != '}') && (c != '<' || c2 != '>') ? 0 : 2;
            }
            if(c1 == 'p')
                return 0;
            if(c1 == 'q')
                return 0;
            if(c1 == 'r')
                return 0;
            if(c1 == 's')
                return c != '5' && c != 'z' && c != '$' && c != '2' ? 0 : 1;
            if(c1 == 't')
                return c != '7' && c != '+' ? 0 : 1;
            if(c1 == 'u')
            {
                if(c == 'v')
                    return 1;
                return (c != '\\' || c2 != '/') && (c != '\\' || c2 != '|') && (c != '|' || c2 != '/') ? 0 : 2;
            }
            if(c1 == 'v')
                return (c != '\\' || c2 != '/') && (c != '\\' || c2 != '|') && (c != '|' || c2 != '/') ? 0 : 2;
            if(c1 == 'w')
                return c != 'v' || c2 != 'v' ? 0 : 2;
            if(c1 == 'x')
                return (c != ')' || c2 != '(') && (c != '}' || c2 != '{') && (c != ']' || c2 != '[') && (c != '>' || c2 != '<') ? 0 : 2;
            if(c1 == 'y')
                return 0;
            if(c1 == 'z')
                return 0;
        }
        if(c1 >= '0' && c1 <= '9')
        {
            if(c1 == '0')
            {
                if(c == 'o' || c == 'O')
                    return 1;
                return (c != '(' || c2 != ')') && (c != '{' || c2 != '}') && (c != '[' || c2 != ']') ? 0 : 2;
            }
            if(c1 == '1')
                return c != 'l' ? 0 : 1;
            else
                return 0;
        }
        if(c1 == ',')
            return c != '.' ? 0 : 1;
        if(c1 == '.')
            return c != ',' ? 0 : 1;
        if(c1 == '!')
            return c != 'i' ? 0 : 1;
        else
            return 0;
    }

    public static byte method572(int i, char c)
    {
        if(i < 7 || i > 7)
            throw new NullPointerException();
        if(c >= 'a' && c <= 'z')
            return (byte)((c - 97) + 1);
        if(c == '\'')
            return 28;
        if(c >= '0' && c <= '9')
            return (byte)((c - 48) + 29);
        else
            return 27;
    }

    public static void method573(char ac[], int i)
    {
        int j = 0;
        int k = 0;
        int l = 0;
        int i1 = 0;
        if(i < 3 || i > 3)
            return;
        while((j = method574(ac, k, false)) != -1) 
        {
            boolean flag = false;
            for(int j1 = k; j1 >= 0 && j1 < j && !flag; j1++)
                if(!method576(0, ac[j1]) && !method577(ac[j1], 0))
                    flag = true;

            if(flag)
                l = 0;
            if(l == 0)
                i1 = j;
            k = method575((byte)7, j, ac);
            int k1 = 0;
            for(int l1 = j; l1 < k; l1++)
                k1 = (k1 * 10 + ac[l1]) - 48;

            if(k1 > 255 || k - j > 8)
                l = 0;
            else
                l++;
            if(l == 4)
            {
                for(int i2 = i1; i2 < k; i2++)
                    ac[i2] = '*';

                l = 0;
            }
        }
    }

    public static int method574(char ac[], int i, boolean flag)
    {
        for(int j = i; j < ac.length && j >= 0; j++)
            if(ac[j] >= '0' && ac[j] <= '9')
                return j;

        if(flag)
            anInt734 = 215;
        return -1;
    }

    public static int method575(byte byte0, int i, char ac[])
    {
        if(byte0 == 7)
            byte0 = 0;
        else
            return anInt742;
        for(int j = i; j < ac.length && j >= 0; j++)
            if(ac[j] < '0' || ac[j] > '9')
                return j;

        return ac.length;
    }

    public static boolean method576(int i, char c)
    {
        if(i != 0)
            throw new NullPointerException();
        return !method578(0, c) && !method579(c, true);
    }

    public static boolean method577(char c, int i)
    {
        if(i != 0)
        {
            for(int j = 1; j > 0; j++);
        }
        if(c < 'a' || c > 'z')
            return true;
        return c == 'v' || c == 'x' || c == 'j' || c == 'q' || c == 'z';
    }

    public static boolean method578(int i, char c)
    {
        if(i != 0)
        {
            for(int j = 1; j > 0; j++);
        }
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
    }

    public static boolean method579(char c, boolean flag)
    {
        if(!flag)
            aBoolean733 = !aBoolean733;
        return c >= '0' && c <= '9';
    }

    public static boolean method580(int i, char c)
    {
        if(i != 0)
            throw new NullPointerException();
        return c >= 'a' && c <= 'z';
    }

    public static boolean method581(boolean flag, char c)
    {
        if(!flag)
            throw new NullPointerException();
        return c >= 'A' && c <= 'Z';
    }

    public static boolean method582(char ac[], byte byte0)
    {
        boolean flag = true;
        for(int i = 0; i < ac.length; i++)
            if(!method579(ac[i], true) && ac[i] != 0)
                flag = false;

        if(flag)
            return true;
        int j = method583(ac, 6329);
        if(byte0 != -31)
            throw new NullPointerException();
        int k = 0;
        int l = anIntArray745.length - 1;
        if(j == anIntArray745[k] || j == anIntArray745[l])
            return true;
        do
        {
            int i1 = (k + l) / 2;
            if(j == anIntArray745[i1])
                return true;
            if(j < anIntArray745[i1])
                l = i1;
            else
                k = i1;
        } while(k != l && k + 1 != l);
        return false;
    }

    public static int method583(char ac[], int i)
    {
        if(ac.length > 6)
            return 0;
        int j = 0;
        if(i != 6329)
        {
            for(int k = 1; k > 0; k++);
        }
        for(int l = 0; l < ac.length; l++)
        {
            char c = ac[ac.length - l - 1];
            if(c >= 'a' && c <= 'z')
                j = j * 38 + ((c - 97) + 1);
            else
            if(c == '\'')
                j = j * 38 + 27;
            else
            if(c >= '0' && c <= '9')
                j = j * 38 + ((c - 48) + 28);
            else
            if(c != 0)
                return 0;
        }

        return j;
    }

    public static boolean aBoolean732;
    public static boolean aBoolean733 = true;
    public static int anInt734 = 130;
    public static boolean aBoolean735;
    public static boolean aBoolean736;
    public static int anInt737 = 9;
    public static byte aByte738 = 4;
    public static byte aByte739 = 3;
    public static byte aByte740 = 4;
    public static int anInt741 = -593;
    public static int anInt742 = -60;
    public static boolean aBoolean743 = true;
    public static int anInt744 = 8;
    public static int anIntArray745[];
    public static char aCharArrayArray746[][];
    public static byte aByteArrayArrayArray747[][][];
    public static char aCharArrayArray748[][];
    public static char aCharArrayArray749[][];
    public static int anIntArray750[];
    public static final String aStringArray751[] = {
        "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs"
    };
    public static boolean aBoolean752;

}
