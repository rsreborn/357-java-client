package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.io.*;
import java.net.Socket;

public class RSSocket
    implements Runnable
{

    public RSSocket(GameApplet applet_sub1, int i, Socket socket)
        throws IOException
    {
        anInt694 = -499;
        anInt695 = -26728;
        anInt696 = 22761;
        aBoolean700 = false;
        aBoolean705 = false;
        aBoolean706 = false;
        anApplet_Sub1_701 = applet_sub1;
        aSocket699 = socket;
        aSocket699.setSoTimeout(30000);
        aSocket699.setTcpNoDelay(true);
        while(i >= 0) 
            anInt696 = 58;
        anInputStream697 = aSocket699.getInputStream();
        anOutputStream698 = aSocket699.getOutputStream();
    }

    public void method538()
    {
        aBoolean700 = true;
        try
        {
            if(anInputStream697 != null)
                anInputStream697.close();
            if(anOutputStream698 != null)
                anOutputStream698.close();
            if(aSocket699 != null)
                aSocket699.close();
        }
        catch(IOException _ex)
        {
            System.out.println("Error closing stream");
        }
        aBoolean705 = false;
        synchronized(this)
        {
            notify();
        }
        aByteArray702 = null;
    }

    public int readByte()
        throws IOException
    {
        if(aBoolean700)
            return 0;
        else
            return anInputStream697.read();
    }

    public int method540()
        throws IOException
    {
        if(aBoolean700)
            return 0;
        else
            return anInputStream697.available();
    }

    public void fillBuffer(byte abyte0[], int i, int j)
        throws IOException
    {
        if(aBoolean700)
            return;
        int k;
        for(; j > 0; j -= k)
        {
            k = anInputStream697.read(abyte0, i, j);
            if(k <= 0)
                throw new IOException("EOF");
            i += k;
        }

    }

    public void queueBytes(byte byte0, int i, int j, byte abyte0[])
        throws IOException
    {
        if(byte0 != 68)
            return;
        if(aBoolean700)
            return;
        if(aBoolean706)
        {
            aBoolean706 = false;
            throw new IOException("Error in writer thread");
        }
        if(aByteArray702 == null)
            aByteArray702 = new byte[5000];
        synchronized(this)
        {
            for(int k = 0; k < j; k++)
            {
                aByteArray702[anInt704] = abyte0[k + i];
                anInt704 = (anInt704 + 1) % 5000;
                if(anInt704 == (anInt703 + 4900) % 5000)
                    throw new IOException("buffer overflow");
            }

            if(!aBoolean705)
            {
                aBoolean705 = true;
                anApplet_Sub1_701.method12(this, 3);
            }
            notify();
        }
    }

    public void run()
    {
        while(aBoolean705) 
        {
            int i;
            int j;
            synchronized(this)
            {
                if(anInt704 == anInt703)
                    try
                    {
                        wait();
                    }
                    catch(InterruptedException _ex) { }
                if(!aBoolean705)
                    return;
                j = anInt703;
                if(anInt704 >= anInt703)
                    i = anInt704 - anInt703;
                else
                    i = 5000 - anInt703;
            }
            if(i > 0)
            {
                try
                {
                    anOutputStream698.write(aByteArray702, j, i);
                }
                catch(IOException _ex)
                {
                    aBoolean706 = true;
                }
                anInt703 = (anInt703 + i) % 5000;
                try
                {
                    if(anInt704 == anInt703)
                        anOutputStream698.flush();
                }
                catch(IOException _ex)
                {
                    aBoolean706 = true;
                }
            }
        }
    }

    public void method543(int i)
    {
        System.out.println("dummy:" + aBoolean700);
        if(i != anInt695)
            return;
        System.out.println("tcycl:" + anInt703);
        System.out.println("tnum:" + anInt704);
        System.out.println("writer:" + aBoolean705);
        System.out.println("ioerror:" + aBoolean706);
        try
        {
            System.out.println("available:" + method540());
            return;
        }
        catch(IOException _ex)
        {
            return;
        }
    }

    public int anInt694;
    public int anInt695;
    public int anInt696;
    public InputStream anInputStream697;
    public OutputStream anOutputStream698;
    public Socket aSocket699;
    public boolean aBoolean700;
    public GameApplet anApplet_Sub1_701;
    public byte aByteArray702[];
    public int anInt703;
    public int anInt704;
    public boolean aBoolean705;
    public boolean aBoolean706;
}
