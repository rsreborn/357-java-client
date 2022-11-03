package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.awt.*;
import java.awt.image.*;

public class Class14 implements ImageProducer, ImageObserver {

    public Class14(Component component, int i, int j, int k)
    {
        anInt217 = 45981;
        aBoolean218 = false;
        anInt220 = k;
        anInt221 = i;
        anIntArray219 = new int[k * i];
        aColorModel222 = new DirectColorModel(32, 0xff0000, 65280, 255);
        anImage224 = component.createImage(this);
        method209();
        component.prepareImage(anImage224, this);
        method209();
        if(j != anInt217)
            aBoolean218 = !aBoolean218;
        component.prepareImage(anImage224, this);
        method209();
        component.prepareImage(anImage224, this);
        method207(-5281);
    }

    public void method207(int i)
    {
        Class39_Sub3_Sub4.method473(false, anIntArray219, anInt220, anInt221);
        if(i == -5281);
    }

    public void method208(Graphics g, int i, int j, int k)
    {
        method209();
        g.drawImage(anImage224, k, j, this);
        i = 45 / i;
    }

    public synchronized void addConsumer(ImageConsumer imageconsumer)
    {
        anImageConsumer223 = imageconsumer;
        imageconsumer.setDimensions(anInt220, anInt221);
        imageconsumer.setProperties(null);
        imageconsumer.setColorModel(aColorModel222);
        imageconsumer.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer imageconsumer)
    {
        return anImageConsumer223 == imageconsumer;
    }

    public synchronized void removeConsumer(ImageConsumer imageconsumer)
    {
        if(anImageConsumer223 == imageconsumer)
            anImageConsumer223 = null;
    }

    public void startProduction(ImageConsumer imageconsumer)
    {
        addConsumer(imageconsumer);
    }

    public void requestTopDownLeftRightResend(ImageConsumer imageconsumer) {
        System.out.println("TDLR");
    }

    public synchronized void method209()
    {
        if(anImageConsumer223 == null)
        {
            return;
        } else
        {
            anImageConsumer223.setPixels(0, 0, anInt220, anInt221, aColorModel222, anIntArray219, 0, anInt220);
            anImageConsumer223.imageComplete(2);
            return;
        }
    }

    public boolean imageUpdate(Image image, int i, int j, int k, int l, int i1)
    {
        return true;
    }

    public int anInt217;
    public boolean aBoolean218;
    public int anIntArray219[];
    public int anInt220;
    public int anInt221;
    public ColorModel aColorModel222;
    public ImageConsumer anImageConsumer223;
    public Image anImage224;
}
