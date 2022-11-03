package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class GameApplet extends Applet implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener {

    public void method1(byte byte0, int i, int j) {
        anInt13 = j;
        anInt14 = i;
        aFrame_Sub1_18 = new GameFrame(-859, this, anInt14, anInt13);
        if(byte0 == 3)
            byte0 = 0;
        else
            anInt5 = -229;
        graphics = method11(-489).getGraphics();
        aClass14_16 = new Class14(method11(-489), anInt14, 45981, anInt13);
        method12(this, 1);
    }

    public void method2(int i, int j, int k) {
        anInt13 = j;
        if(k < 4 || k > 4)
            anInt5 = 398;
        anInt14 = i;
        graphics = method11(-489).getGraphics();
        aClass14_16 = new Class14(method11(-489), anInt14, 45981, anInt13);
        method12(this, 1);
    }

    public void run()
    {
        method11(-489).addMouseListener(this);
        method11(-489).addMouseMotionListener(this);
        method11(-489).addKeyListener(this);
        method11(-489).addFocusListener(this);
        if(aFrame_Sub1_18 != null)
            aFrame_Sub1_18.addWindowListener(this);
        drawLoadingString("Loading...", 27936, 0);
        method6();
        int i = 0;
        int j = 256;
        int k = 1;
        int i1 = 0;
        int j1 = 0;
        for(int k1 = 0; k1 < 10; k1++)
            aLongArray10[k1] = System.currentTimeMillis();

        long l = System.currentTimeMillis();
        while(anInt7 >= 0) 
        {
            if(anInt7 > 0)
            {
                anInt7--;
                if(anInt7 == 0)
                {
                    method3(0);
                    return;
                }
            }
            int i2 = j;
            int j2 = k;
            j = 300;
            k = 1;
            long l1 = System.currentTimeMillis();
            if(aLongArray10[i] == 0L)
            {
                j = i2;
                k = j2;
            } else
            if(l1 > aLongArray10[i])
                j = (int)((long)(2560 * anInt8) / (l1 - aLongArray10[i]));
            if(j < 25)
                j = 25;
            if(j > 256)
            {
                j = 256;
                k = (int)((long)anInt8 - (l1 - aLongArray10[i]) / 10L);
            }
            if(k > anInt8)
                k = anInt8;
            aLongArray10[i] = l1;
            i = (i + 1) % 10;
            if(k > 1)
            {
                for(int k2 = 0; k2 < 10; k2++)
                    if(aLongArray10[k2] != 0L)
                        aLongArray10[k2] += k;

            }
            if(k < anInt9)
                k = anInt9;
            try
            {
                Thread.sleep(k);
            }
            catch(InterruptedException _ex)
            {
                j1++;
            }
            for(; i1 < 256; i1 += j)
            {
                anInt29 = anInt25;
                anInt30 = anInt26;
                anInt31 = anInt27;
                aLong32 = aLong28;
                anInt25 = 0;
                method7(-872);
                anInt35 = anInt36;
            }

            i1 &= 0xff;
            if(anInt8 > 0)
                anInt11 = (1000 * j) / (anInt8 * 256);
            method9(672);
            if(aBoolean12)
            {
                System.out.println("ntime:" + l1);
                for(int l2 = 0; l2 < 10; l2++)
                {
                    int i3 = ((i - l2 - 1) + 20) % 10;
                    System.out.println("otim" + i3 + ":" + aLongArray10[i3]);
                }

                System.out.println("fps:" + anInt11 + " ratio:" + j + " count:" + i1);
                System.out.println("del:" + k + " deltime:" + anInt8 + " mindel:" + anInt9);
                System.out.println("intex:" + j1 + " opos:" + i);
                aBoolean12 = false;
                j1 = 0;
            }
        }
        if(anInt7 == -1)
            method3(0);
    }

    public void method3(int i)
    {
        anInt7 = -2;
        method8(374);
        if(i != 0)
            return;
        if(aFrame_Sub1_18 != null)
        {
            try
            {
                Thread.sleep(1000L);
            }
            catch(Exception _ex) { }
            try
            {
                System.exit(0);
                return;
            }
            catch(Throwable _ex) { }
        }
    }

    public void method4(int i, int j)
    {
        anInt8 = 1000 / i;
        if(j != 0)
            aBoolean1 = !aBoolean1;
    }

    public void start()
    {
        if(anInt7 >= 0)
            anInt7 = 0;
    }

    public void stop()
    {
        if(anInt7 >= 0)
            anInt7 = 4000 / anInt8;
    }

    public void destroy()
    {
        anInt7 = -1;
        try
        {
            Thread.sleep(10000L);
        }
        catch(Exception _ex) { }
        if(anInt7 == -1)
            method3(0);
    }

    public void update(Graphics g)
    {
        if(graphics == null)
            graphics = g;
        aBoolean19 = true;
        method10(false);
    }

    public void paint(Graphics g)
    {
        if(graphics == null)
            graphics = g;
        aBoolean19 = true;
        method10(false);
    }

    public void mousePressed(MouseEvent mouseevent)
    {
        int i = mouseevent.getX();
        int j = mouseevent.getY();
        if(aFrame_Sub1_18 != null)
        {
            i -= 4;
            j -= 22;
        }
        anInt21 = 0;
        anInt26 = i;
        anInt27 = j;
        aLong28 = System.currentTimeMillis();
        if(mouseevent.isMetaDown())
        {
            anInt25 = 2;
            anInt22 = 2;
            return;
        } else
        {
            anInt25 = 1;
            anInt22 = 1;
            return;
        }
    }

    public void mouseReleased(MouseEvent mouseevent)
    {
        anInt21 = 0;
        anInt22 = 0;
    }

    public void mouseClicked(MouseEvent mouseevent)
    {
    }

    public void mouseEntered(MouseEvent mouseevent)
    {
    }

    public void mouseExited(MouseEvent mouseevent)
    {
        anInt21 = 0;
        anInt23 = -1;
        anInt24 = -1;
    }

    public void mouseDragged(MouseEvent mouseevent)
    {
        int i = mouseevent.getX();
        int j = mouseevent.getY();
        if(aFrame_Sub1_18 != null)
        {
            i -= 4;
            j -= 22;
        }
        anInt21 = 0;
        anInt23 = i;
        anInt24 = j;
    }

    public void mouseMoved(MouseEvent mouseevent)
    {
        int i = mouseevent.getX();
        int j = mouseevent.getY();
        if(aFrame_Sub1_18 != null)
        {
            i -= 4;
            j -= 22;
        }
        anInt21 = 0;
        anInt23 = i;
        anInt24 = j;
    }

    public void keyPressed(KeyEvent keyevent)
    {
        anInt21 = 0;
        int i = keyevent.getKeyCode();
        int j = keyevent.getKeyChar();
        if(j < 30)
            j = 0;
        if(i == 37)
            j = 1;
        if(i == 39)
            j = 2;
        if(i == 38)
            j = 3;
        if(i == 40)
            j = 4;
        if(i == 17)
            j = 5;
        if(i == 8)
            j = 8;
        if(i == 127)
            j = 8;
        if(i == 9)
            j = 9;
        if(i == 10)
            j = 10;
        if(i >= 112 && i <= 123)
            j = (1008 + i) - 112;
        if(i == 36)
            j = 1000;
        if(i == 35)
            j = 1001;
        if(i == 33)
            j = 1002;
        if(i == 34)
            j = 1003;
        if(j > 0 && j < 128)
            anIntArray33[j] = 1;
        if(j > 4)
        {
            anIntArray34[anInt36] = j;
            anInt36 = anInt36 + 1 & 0x7f;
        }
    }

    public void keyReleased(KeyEvent keyevent)
    {
        anInt21 = 0;
        int i = keyevent.getKeyCode();
        char c = keyevent.getKeyChar();
        if(c < '\036')
            c = '\0';
        if(i == 37)
            c = '\001';
        if(i == 39)
            c = '\002';
        if(i == 38)
            c = '\003';
        if(i == 40)
            c = '\004';
        if(i == 17)
            c = '\005';
        if(i == 8)
            c = '\b';
        if(i == 127)
            c = '\b';
        if(i == 9)
            c = '\t';
        if(i == 10)
            c = '\n';
        if(c > 0 && c < '\200')
            anIntArray33[c] = 0;
    }

    public void keyTyped(KeyEvent keyevent)
    {
    }

    public int method5(byte byte0)
    {
        if(byte0 != 9)
            return anInt5;
        int i = -1;
        if(anInt36 != anInt35)
        {
            i = anIntArray34[anInt35];
            anInt35 = anInt35 + 1 & 0x7f;
        }
        return i;
    }

    public void focusGained(FocusEvent focusevent)
    {
        aBoolean20 = true;
        aBoolean19 = true;
        method10(false);
    }

    public void focusLost(FocusEvent focusevent)
    {
        aBoolean20 = false;
        for(int i = 0; i < 128; i++)
            anIntArray33[i] = 0;

    }

    public void windowActivated(WindowEvent windowevent)
    {
    }

    public void windowClosed(WindowEvent windowevent)
    {
    }

    public void windowClosing(WindowEvent windowevent)
    {
        destroy();
    }

    public void windowDeactivated(WindowEvent windowevent)
    {
    }

    public void windowDeiconified(WindowEvent windowevent)
    {
    }

    public void windowIconified(WindowEvent windowevent)
    {
    }

    public void windowOpened(WindowEvent windowevent)
    {
    }

    public void method6()
    {
    }

    public void method7(int i)
    {
        if(i >= 0)
        {
            for(int j = 1; j > 0; j++);
        }
    }

    public void method8(int i)
    {
        i = 25 / i;
    }

    public void method9(int i)
    {
        i = 74 / i;
    }

    public void method10(boolean flag)
    {
        if(!flag);
    }

    public Component method11(int i)
    {
        if(i >= 0)
            anInt6 = -127;
        if(aFrame_Sub1_18 != null)
            return aFrame_Sub1_18;
        else
            return this;
    }

    public void method12(Runnable runnable, int i)
    {
        Thread thread = new Thread(runnable);
        thread.start();
        thread.setPriority(i);
    }

    public void drawLoadingString(String s, int i, int j)
    {
        while(graphics == null) 
        {
            graphics = method11(-489).getGraphics();
            try
            {
                method11(-489).repaint();
            }
            catch(Exception _ex) { }
            try
            {
                Thread.sleep(1000L);
            }
            catch(Exception _ex) { }
        }
        Font font = new Font("Helvetica", 1, 13);
        FontMetrics fontmetrics = method11(-489).getFontMetrics(font);
        Font font1 = new Font("Helvetica", 0, 13);
        method11(-489).getFontMetrics(font1);
        if(aBoolean19)
        {
            graphics.setColor(Color.black);
            graphics.fillRect(0, 0, anInt13, anInt14);
            aBoolean19 = false;
        }
        Color color = new Color(140, 17, 17);
        int k = anInt14 / 2 - 18;
        graphics.setColor(color);
        graphics.drawRect(anInt13 / 2 - 152, k, 304, 34);
        graphics.fillRect(anInt13 / 2 - 150, k + 2, j * 3, 30);
        if(i != 27936)
        {
            for(int l = 1; l > 0; l++);
        }
        graphics.setColor(Color.black);
        graphics.fillRect((anInt13 / 2 - 150) + j * 3, k + 2, 300 - j * 3, 30);
        graphics.setFont(font);
        graphics.setColor(Color.white);
        graphics.drawString(s, (anInt13 - fontmetrics.stringWidth(s)) / 2, k + 22);
    }

    public GameApplet()
    {
        aBoolean1 = true;
        anInt2 = 374;
        anInt3 = 672;
        aBoolean4 = false;
        anInt5 = 827;
        anInt6 = 3;
        anInt8 = 20;
        anInt9 = 1;
        aLongArray10 = new long[10];
        aBoolean12 = false;
        aClass39_Sub3_Sub4_Sub4Array17 = new Class39_Sub3_Sub4_Sub4[6];
        aBoolean19 = true;
        aBoolean20 = true;
        anIntArray33 = new int[128];
        anIntArray34 = new int[128];
    }

    public boolean aBoolean1;
    public int anInt2;
    public int anInt3;
    public boolean aBoolean4;
    public int anInt5;
    public int anInt6;
    public int anInt7;
    public int anInt8;
    public int anInt9;
    public long aLongArray10[];
    public int anInt11;
    public boolean aBoolean12;
    public int anInt13;
    public int anInt14;
    public Graphics graphics;
    public Class14 aClass14_16;
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4Array17[];
    public GameFrame aFrame_Sub1_18;
    public boolean aBoolean19;
    public boolean aBoolean20;
    public int anInt21;
    public int anInt22;
    public int anInt23;
    public int anInt24;
    public int anInt25;
    public int anInt26;
    public int anInt27;
    public long aLong28;
    public int anInt29;
    public int anInt30;
    public int anInt31;
    public long aLong32;
    public int anIntArray33[];
    public int anIntArray34[];
    public int anInt35;
    public int anInt36;
    public static int anInt37;
}
