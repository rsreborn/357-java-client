package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class5
{

    public Class5(int i)
    {
        aBoolean113 = false;
        anInt114 = 45492;
        aBoolean115 = false;
        aByte116 = 8;
        anInt117 = 17532;
        aClass39_118 = new Class39();
        if(i != -7255)
        {
            throw new NullPointerException();
        } else
        {
            aClass39_118.aClass39_688 = aClass39_118;
            aClass39_118.aClass39_689 = aClass39_118;
            return;
        }
    }

    public void method182(Class39 class39)
    {
        if(class39.aClass39_689 != null)
            class39.method376();
        class39.aClass39_689 = aClass39_118.aClass39_689;
        class39.aClass39_688 = aClass39_118;
        class39.aClass39_689.aClass39_688 = class39;
        class39.aClass39_688.aClass39_689 = class39;
    }

    public void method183(Class39 class39, byte byte0)
    {
        if(class39.aClass39_689 != null)
            class39.method376();
        class39.aClass39_689 = aClass39_118;
        class39.aClass39_688 = aClass39_118.aClass39_688;
        if(byte0 == 1)
            byte0 = 0;
        else
            anInt114 = -90;
        class39.aClass39_689.aClass39_688 = class39;
        class39.aClass39_688.aClass39_689 = class39;
    }

    public Class39 method184()
    {
        Class39 class39 = aClass39_118.aClass39_688;
        if(class39 == aClass39_118)
        {
            return null;
        } else
        {
            class39.method376();
            return class39;
        }
    }

    public Class39 method185()
    {
        Class39 class39 = aClass39_118.aClass39_688;
        if(class39 == aClass39_118)
        {
            aClass39_119 = null;
            return null;
        } else
        {
            aClass39_119 = class39.aClass39_688;
            return class39;
        }
    }

    public Class39 method186(int i)
    {
        if(i != 36418)
        {
            for(int j = 1; j > 0; j++);
        }
        Class39 class39 = aClass39_118.aClass39_689;
        if(class39 == aClass39_118)
        {
            aClass39_119 = null;
            return null;
        } else
        {
            aClass39_119 = class39.aClass39_689;
            return class39;
        }
    }

    public Class39 method187(byte byte0)
    {
        Class39 class39 = aClass39_119;
        if(class39 == aClass39_118)
        {
            aClass39_119 = null;
            return null;
        }
        aClass39_119 = class39.aClass39_688;
        if(byte0 == aByte116)
            byte0 = 0;
        else
            throw new NullPointerException();
        return class39;
    }

    public Class39 method188(int i)
    {
        if(i != 0)
            anInt117 = 293;
        Class39 class39 = aClass39_119;
        if(class39 == aClass39_118)
        {
            aClass39_119 = null;
            return null;
        } else
        {
            aClass39_119 = class39.aClass39_689;
            return class39;
        }
    }

    public void method189()
    {
        if(aClass39_118.aClass39_688 == aClass39_118)
            return;
        do
        {
            Class39 class39 = aClass39_118.aClass39_688;
            if(class39 == aClass39_118)
                return;
            class39.method376();
        } while(true);
    }

    public int getUnsignedByteS(Buffer buffer) {
	    return buffer.payload[buffer.position++] & 0xff;
	}

	public boolean aBoolean113;
    public int anInt114;
    public boolean aBoolean115;
    public byte aByte116;
    public int anInt117;
    public Class39 aClass39_118;
    public Class39 aClass39_119;
}
