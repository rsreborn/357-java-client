package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.awt.*;

public class GameFrame extends Frame
{

    public GameFrame(int i, GameApplet applet_sub1, int j, int k)
    {
        anApplet_Sub1_38 = applet_sub1;
        setTitle("Jagex");
        setResizable(false);
        show();
        if(i >= 0)
        {
            for(int l = 1; l > 0; l++);
        }
        toFront();
        resize(k + 8, j + 28);
    }

    public Graphics getGraphics()
    {
        Graphics g = super.getGraphics();
        g.translate(4, 24);
        return g;
    }

    public void update(Graphics g)
    {
        anApplet_Sub1_38.update(g);
    }

    public void paint(Graphics g)
    {
        anApplet_Sub1_38.paint(g);
    }

    public GameApplet anApplet_Sub1_38;
}
