package com.jagex;// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import java.io.*;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import com.jagex.sign.Signlink;
import com.jagex.util.Constants;

public class OnDemandClient extends Class21
    implements Runnable
{

    public void method223()
    {
        aBoolean1352 = false;
    }

    public void method224(boolean flag)
    {
        anInt1367 = 0;
        anInt1368 = 0;
        Class39_Sub3_Sub1 class39_sub3_sub1 = (Class39_Sub3_Sub1)aClass5_1361.method185();
        if(flag)
            return;
        for(; class39_sub3_sub1 != null; class39_sub3_sub1 = (Class39_Sub3_Sub1)aClass5_1361.method187((byte)8))
            if(class39_sub3_sub1.aBoolean1427)
                anInt1367++;
            else
                anInt1368++;

        while(anInt1367 < 10) 
        {
            Class39_Sub3_Sub1 class39_sub3_sub1_1 = (Class39_Sub3_Sub1)aClass5_1350.method184();
            if(class39_sub3_sub1_1 == null)
                break;
            if(aByteArrayArray1347[class39_sub3_sub1_1.anInt1424][class39_sub3_sub1_1.anInt1425] != 0)
                anInt1365++;
            aByteArrayArray1347[class39_sub3_sub1_1.anInt1424][class39_sub3_sub1_1.anInt1425] = 0;
            aClass5_1361.method182(class39_sub3_sub1_1);
            anInt1367++;
            method240(class39_sub3_sub1_1, 7904);
            aBoolean1375 = true;
        }
    }

    public void method222(int i)
    {
        method227(0, i);
    }

    public void method225(int i)
    {
        while(i >= 0) 
            return;
        Class39_Sub3_Sub1 class39_sub3_sub1;
        synchronized(aClass5_1369)
        {
            class39_sub3_sub1 = (Class39_Sub3_Sub1)aClass5_1369.method184();
        }
        while(class39_sub3_sub1 != null) 
        {
            aBoolean1375 = true;
            byte abyte0[] = null;
            if(aGame1346.aClass13Array1062[0] != null)
                abyte0 = aGame1346.aClass13Array1062[class39_sub3_sub1.anInt1424 + 1].method203(5, class39_sub3_sub1.anInt1425);
            if(!method241(-532, anIntArrayArray1374[class39_sub3_sub1.anInt1424][class39_sub3_sub1.anInt1425], abyte0, anIntArrayArray1345[class39_sub3_sub1.anInt1424][class39_sub3_sub1.anInt1425]))
                abyte0 = null;
            synchronized(aClass5_1369)
            {
                if(abyte0 == null)
                {
                    aClass5_1350.method182(class39_sub3_sub1);
                } else
                {
                    class39_sub3_sub1.aByteArray1428 = abyte0;
                    synchronized(aClass5_1362)
                    {
                        aClass5_1362.method182(class39_sub3_sub1);
                    }
                }
                class39_sub3_sub1 = (Class39_Sub3_Sub1)aClass5_1369.method184();
            }
        }
    }

    public void method226(boolean flag, int i)
    {
        int j = anIntArray1355.length;
        for(int k = 0; k < j; k++)
            if(flag || anIntArray1377[k] != 0)
            {
                method235(3, (byte)2, anIntArray1343[k], 462);
                method235(3, (byte)2, anIntArray1338[k], 462);
            }

        if(i >= 9)
            if(i <= 9);
    }

    public void method227(int i, int j)
    {
        if(i < 0 || i > anIntArrayArray1374.length || j < 0 || j > anIntArrayArray1374[i].length)
            return;
        if(anIntArrayArray1374[i][j] == 0)
            return;
        synchronized(aClass23_1373)
        {
            for(Class39_Sub3_Sub1 class39_sub3_sub1 = (Class39_Sub3_Sub1)aClass23_1373.method268(); class39_sub3_sub1 != null; class39_sub3_sub1 = (Class39_Sub3_Sub1)aClass23_1373.method269((byte)8))
                if(class39_sub3_sub1.anInt1424 == i && class39_sub3_sub1.anInt1425 == j)
                    return;

            Class39_Sub3_Sub1 class39_sub3_sub1_1 = new Class39_Sub3_Sub1();
            class39_sub3_sub1_1.anInt1424 = i;
            class39_sub3_sub1_1.anInt1425 = j;
            class39_sub3_sub1_1.aBoolean1427 = true;
            synchronized(aClass5_1369)
            {
                aClass5_1369.method182(class39_sub3_sub1_1);
            }
            aClass23_1373.method266(class39_sub3_sub1_1);
        }
    }

    public void method228(boolean flag, int i, int j)
    {
        if(aGame1346.aClass13Array1062[0] == null)
            return;
        if(anIntArrayArray1374[j][i] == 0)
            return;
        if(aByteArrayArray1347[j][i] == 0)
            return;
        if(anInt1342 == 0)
            return;
        Class39_Sub3_Sub1 class39_sub3_sub1 = new Class39_Sub3_Sub1();
        class39_sub3_sub1.anInt1424 = j;
        class39_sub3_sub1.anInt1425 = i;
        class39_sub3_sub1.aBoolean1427 = false;
        synchronized(aClass5_1356)
        {
            aClass5_1356.method182(class39_sub3_sub1);
        }
        if(flag)
            aBoolean1360 = !aBoolean1360;
    }

    public int method229()
    {
        synchronized(aClass23_1373)
        {
            int i = aClass23_1373.method270();
            return i;
        }
    }

    public boolean method230(int i, boolean flag)
    {
        if(flag)
            anInt1339 = -404;
        return anIntArray1344[i] == 1;
    }

    public int method231(byte byte0)
    {
        if(byte0 != 3)
            anInt1339 = 380;
        return anIntArray1363.length;
    }

    public void method232(Class10 class10, Game game1)
    {
        String as[] = {
            "model_version", "anim_version", "midi_version", "map_version"
        };
        for(int i = 0; i < 4; i++)
        {
            byte abyte0[] = class10.method193(as[i], null);
            int j = abyte0.length / 2;
            Buffer class39_sub3_sub3 = new Buffer(abyte0);
            anIntArrayArray1374[i] = new int[j];
            aByteArrayArray1347[i] = new byte[j];
            for(int l = 0; l < j; l++)
                anIntArrayArray1374[i][l] = class39_sub3_sub3.readShort();

        }

        String as1[] = {
            "model_crc", "anim_crc", "midi_crc", "map_crc"
        };
        for(int k = 0; k < 4; k++)
        {
            byte abyte1[] = class10.method193(as1[k], null);
            int i1 = abyte1.length / 4;
            Buffer class39_sub3_sub3_1 = new Buffer(abyte1);
            anIntArrayArray1345[k] = new int[i1];
            for(int l1 = 0; l1 < i1; l1++)
                anIntArrayArray1345[k][l1] = class39_sub3_sub3_1.readIntBE();

        }

        byte abyte2[] = class10.method193("model_index", null);
        int j1 = anIntArrayArray1374[0].length;
        aByteArray1371 = new byte[j1];
        for(int k1 = 0; k1 < j1; k1++)
            if(k1 < abyte2.length)
                aByteArray1371[k1] = abyte2[k1];
            else
                aByteArray1371[k1] = 0;

        abyte2 = class10.method193("map_index", null);
        Buffer class39_sub3_sub3_2 = new Buffer(abyte2);
        j1 = abyte2.length / 7;
        anIntArray1355 = new int[j1];
        anIntArray1338 = new int[j1];
        anIntArray1343 = new int[j1];
        anIntArray1377 = new int[j1];
        for(int i2 = 0; i2 < j1; i2++)
        {
            anIntArray1355[i2] = class39_sub3_sub3_2.readShort();
            anIntArray1338[i2] = class39_sub3_sub3_2.readShort();
            anIntArray1343[i2] = class39_sub3_sub3_2.readShort();
            anIntArray1377[i2] = class39_sub3_sub3_2.readUByte();
        }

        abyte2 = class10.method193("anim_index", null);
        class39_sub3_sub3_2 = new Buffer(abyte2);
        j1 = abyte2.length / 2;
        anIntArray1363 = new int[j1];
        for(int j2 = 0; j2 < j1; j2++)
            anIntArray1363[j2] = class39_sub3_sub3_2.readShort();

        abyte2 = class10.method193("midi_index", null);
        class39_sub3_sub3_2 = new Buffer(abyte2);
        j1 = abyte2.length;
        anIntArray1344 = new int[j1];
        for(int k2 = 0; k2 < j1; k2++)
            anIntArray1344[k2] = class39_sub3_sub3_2.readUByte();

        aGame1346 = game1;
        aBoolean1352 = true;
        aGame1346.method12(this, 2);
    }

    public void method233(byte byte0)
    {
        synchronized(aClass5_1356)
        {
            aClass5_1356.method189();
        }
        if(byte0 == -72);
    }

    public void method234(boolean flag)
    {
        if(flag)
            return;
        while(anInt1367 == 0 && anInt1368 < 10) 
        {
            if(anInt1342 == 0)
                break;
            Class39_Sub3_Sub1 class39_sub3_sub1;
            synchronized(aClass5_1356)
            {
                class39_sub3_sub1 = (Class39_Sub3_Sub1)aClass5_1356.method184();
            }
            while(class39_sub3_sub1 != null) 
            {
                if(aByteArrayArray1347[class39_sub3_sub1.anInt1424][class39_sub3_sub1.anInt1425] != 0)
                {
                    aByteArrayArray1347[class39_sub3_sub1.anInt1424][class39_sub3_sub1.anInt1425] = 0;
                    aClass5_1361.method182(class39_sub3_sub1);
                    method240(class39_sub3_sub1, 7904);
                    aBoolean1375 = true;
                    if(anInt1365 < anInt1359)
                        anInt1365++;
                    aString1349 = "Loading extra files - " + (anInt1365 * 100) / anInt1359 + "%";
                    anInt1368++;
                    if(anInt1368 == 10)
                        return;
                }
                synchronized(aClass5_1356)
                {
                    class39_sub3_sub1 = (Class39_Sub3_Sub1)aClass5_1356.method184();
                }
            }
            for(int i = 0; i < 4; i++)
            {
                byte abyte0[] = aByteArrayArray1347[i];
                int j = abyte0.length;
                for(int k = 0; k < j; k++)
                    if(abyte0[k] == anInt1342)
                    {
                        abyte0[k] = 0;
                        Class39_Sub3_Sub1 class39_sub3_sub1_1 = new Class39_Sub3_Sub1();
                        class39_sub3_sub1_1.anInt1424 = i;
                        class39_sub3_sub1_1.anInt1425 = k;
                        class39_sub3_sub1_1.aBoolean1427 = false;
                        aClass5_1361.method182(class39_sub3_sub1_1);
                        method240(class39_sub3_sub1_1, 7904);
                        aBoolean1375 = true;
                        if(anInt1365 < anInt1359)
                            anInt1365++;
                        aString1349 = "Loading extra files - " + (anInt1365 * 100) / anInt1359 + "%";
                        anInt1368++;
                        if(anInt1368 == 10)
                            return;
                    }

            }

            anInt1342--;
        }
    }

    public void method235(int i, byte byte0, int j, int k)
    {
        if(aGame1346.aClass13Array1062[0] == null)
            return;
        if(anIntArrayArray1374[i][j] == 0)
            return;
        byte abyte0[] = aGame1346.aClass13Array1062[i + 1].method203(5, j);
        if(method241(-532, anIntArrayArray1374[i][j], abyte0, anIntArrayArray1345[i][j]))
            return;
        aByteArrayArray1347[i][j] = byte0;
        if(k <= 0)
        {
            for(int l = 1; l > 0; l++);
        }
        if(byte0 > anInt1342)
            anInt1342 = byte0;
        anInt1359++;
    }

    public void method236(int i)
    {
        if(i >= 0)
            return;
        try
        {
            int j = onDemandInputStream.available();
            if(anInt1358 == 0 && j >= 6)
            {
                aBoolean1375 = true;
                for(int k = 0; k < 6; k += onDemandInputStream.read(aByteArray1353, k, 6 - k));
                int l = aByteArray1353[0] & 0xff;
                int j1 = ((aByteArray1353[1] & 0xff) << 8) + (aByteArray1353[2] & 0xff);
                int l1 = ((aByteArray1353[3] & 0xff) << 8) + (aByteArray1353[4] & 0xff);
                int i2 = aByteArray1353[5] & 0xff;
                aClass39_Sub3_Sub1_1366 = null;
                for(Class39_Sub3_Sub1 class39_sub3_sub1 = (Class39_Sub3_Sub1)aClass5_1361.method185(); class39_sub3_sub1 != null; class39_sub3_sub1 = (Class39_Sub3_Sub1)aClass5_1361.method187((byte)8))
                {
                    if(class39_sub3_sub1.anInt1424 == l && class39_sub3_sub1.anInt1425 == j1)
                        aClass39_Sub3_Sub1_1366 = class39_sub3_sub1;
                    if(aClass39_Sub3_Sub1_1366 != null)
                        class39_sub3_sub1.anInt1426 = 0;
                }

                if(aClass39_Sub3_Sub1_1366 != null)
                {
                    anInt1364 = 0;
                    if(l1 == 0)
                    {
                        Signlink.reporterror("Rej: " + l + "," + j1);
                        aClass39_Sub3_Sub1_1366.aByteArray1428 = null;
                        if(aClass39_Sub3_Sub1_1366.aBoolean1427)
                            synchronized(aClass5_1362)
                            {
                                aClass5_1362.method182(aClass39_Sub3_Sub1_1366);
                            }
                        else
                            aClass39_Sub3_Sub1_1366.method376();
                        aClass39_Sub3_Sub1_1366 = null;
                    } else
                    {
                        if(aClass39_Sub3_Sub1_1366.aByteArray1428 == null && i2 == 0)
                            aClass39_Sub3_Sub1_1366.aByteArray1428 = new byte[l1];
                        if(aClass39_Sub3_Sub1_1366.aByteArray1428 == null && i2 != 0)
                            throw new IOException("missing start of file");
                    }
                }
                anInt1357 = i2 * 500;
                anInt1358 = 500;
                if(anInt1358 > l1 - i2 * 500)
                    anInt1358 = l1 - i2 * 500;
            }
            if(anInt1358 > 0 && j >= anInt1358)
            {
                aBoolean1375 = true;
                byte abyte0[] = aByteArray1353;
                int i1 = 0;
                if(aClass39_Sub3_Sub1_1366 != null)
                {
                    abyte0 = aClass39_Sub3_Sub1_1366.aByteArray1428;
                    i1 = anInt1357;
                }
                for(int k1 = 0; k1 < anInt1358; k1 += onDemandInputStream.read(abyte0, k1 + i1, anInt1358 - k1));
                if(anInt1358 + anInt1357 >= abyte0.length && aClass39_Sub3_Sub1_1366 != null)
                {
                    if(aGame1346.aClass13Array1062[0] != null)
                        aGame1346.aClass13Array1062[aClass39_Sub3_Sub1_1366.anInt1424 + 1].method204(false, abyte0.length, aClass39_Sub3_Sub1_1366.anInt1425, abyte0);
                    if(!aClass39_Sub3_Sub1_1366.aBoolean1427 && aClass39_Sub3_Sub1_1366.anInt1424 == 3)
                    {
                        aClass39_Sub3_Sub1_1366.aBoolean1427 = true;
                        aClass39_Sub3_Sub1_1366.anInt1424 = 93;
                    }
                    if(aClass39_Sub3_Sub1_1366.aBoolean1427)
                        synchronized(aClass5_1362)
                        {
                            aClass5_1362.method182(aClass39_Sub3_Sub1_1366);
                        }
                    else
                        aClass39_Sub3_Sub1_1366.method376();
                }
                anInt1358 = 0;
                return;
            }
        }
        catch(IOException ioexception)
        {
            try
            {
                onDemandSocket.close();
            }
            catch(Exception _ex) { }
            onDemandSocket = null;
            onDemandInputStream = null;
            onDemandOutputStream = null;
            anInt1358 = 0;
        }
    }

    public Class39_Sub3_Sub1 method237()
    {
        Class39_Sub3_Sub1 class39_sub3_sub1;
        synchronized(aClass5_1362)
        {
            class39_sub3_sub1 = (Class39_Sub3_Sub1)aClass5_1362.method184();
        }
        if(class39_sub3_sub1 == null)
            return null;
        synchronized(aClass23_1373)
        {
            class39_sub3_sub1.method377();
        }
        if(class39_sub3_sub1.aByteArray1428 == null)
            return class39_sub3_sub1;
        int i = 0;
        try
        {
            GZIPInputStream gzipinputstream = new GZIPInputStream(new ByteArrayInputStream(class39_sub3_sub1.aByteArray1428));
            do
            {
                if(i == aByteArray1378.length)
                    throw new RuntimeException("buffer overflow!");
                int k = gzipinputstream.read(aByteArray1378, i, aByteArray1378.length - i);
                if(k == -1)
                    break;
                i += k;
            } while(true);
        }
        catch(IOException _ex)
        {
            throw new RuntimeException("error unzipping");
        }
        class39_sub3_sub1.aByteArray1428 = new byte[i];
        for(int j = 0; j < i; j++)
            class39_sub3_sub1.aByteArray1428[j] = aByteArray1378[j];

        return class39_sub3_sub1;
    }

    public int method238(int i, boolean flag)
    {
        if(flag)
            anInt1339 = -496;
        return anIntArrayArray1374[i].length;
    }

    public void run()
    {
        try
        {
            while(aBoolean1352) 
            {
                anInt1370++;
                int i = 20;
                if(anInt1342 == 0 && aGame1346.aClass13Array1062[0] != null)
                    i = 50;
                try
                {
                    Thread.sleep(i);
                }
                catch(Exception _ex) { }
                aBoolean1375 = true;
                for(int j = 0; j < 100; j++)
                {
                    if(!aBoolean1375)
                        break;
                    aBoolean1375 = false;
                    method225(-613);
                    method224(false);
                    if(anInt1367 == 0 && j >= 5)
                        break;
                    method234(false);
                    if(onDemandInputStream != null)
                        method236(-607);
                }

                boolean flag = false;
                for(Class39_Sub3_Sub1 class39_sub3_sub1 = (Class39_Sub3_Sub1)aClass5_1361.method185(); class39_sub3_sub1 != null; class39_sub3_sub1 = (Class39_Sub3_Sub1)aClass5_1361.method187((byte)8))
                    if(class39_sub3_sub1.aBoolean1427)
                    {
                        flag = true;
                        class39_sub3_sub1.anInt1426++;
                        if(class39_sub3_sub1.anInt1426 > 50)
                        {
                            class39_sub3_sub1.anInt1426 = 0;
                            method240(class39_sub3_sub1, 7904);
                        }
                    }

                if(!flag)
                {
                    for(Class39_Sub3_Sub1 class39_sub3_sub1_1 = (Class39_Sub3_Sub1)aClass5_1361.method185(); class39_sub3_sub1_1 != null; class39_sub3_sub1_1 = (Class39_Sub3_Sub1)aClass5_1361.method187((byte)8))
                    {
                        flag = true;
                        class39_sub3_sub1_1.anInt1426++;
                        if(class39_sub3_sub1_1.anInt1426 > 50)
                        {
                            class39_sub3_sub1_1.anInt1426 = 0;
                            method240(class39_sub3_sub1_1, 7904);
                        }
                    }

                }
                if(flag)
                {
                    anInt1364++;
                    if(anInt1364 > 750)
                    {
                        try
                        {
                            onDemandSocket.close();
                        }
                        catch(Exception _ex) { }
                        onDemandSocket = null;
                        onDemandInputStream = null;
                        onDemandOutputStream = null;
                        anInt1358 = 0;
                    }
                } else
                {
                    anInt1364 = 0;
                    aString1349 = "";
                }
                if(aGame1346.aBoolean952 && onDemandSocket != null && onDemandOutputStream != null && (anInt1342 > 0 || aGame1346.aClass13Array1062[0] == null))
                {
                    anInt1380++;
                    if(anInt1380 > 500)
                    {
                        anInt1380 = 0;
                        aByteArray1353[0] = 0;
                        aByteArray1353[1] = 0;
                        aByteArray1353[2] = 0;
                        aByteArray1353[3] = 10;
                        try
                        {
                            onDemandOutputStream.write(aByteArray1353, 0, 4);
                        }
                        catch(IOException _ex)
                        {
                            anInt1364 = 5000;
                        }
                    }
                }
            }
            return;
        }
        catch(Exception exception)
        {
            Signlink.reporterror("od_ex " + exception.getMessage());
        }
    }

    public boolean method239(int i, byte byte0)
    {
        if(byte0 == 6)
        {
            byte0 = 0;
        } else
        {
            for(int j = 1; j > 0; j++);
        }
        for(int k = 0; k < anIntArray1355.length; k++)
            if(anIntArray1343[k] == i)
                return true;

        return false;
    }

    public void method240(Class39_Sub3_Sub1 class39_sub3_sub1, int i)
    {
        if(i != 7904)
            anInt1339 = 68;
        try
        {
            if(onDemandSocket == null)
            {
                long l = System.currentTimeMillis();
                if(l - aLong1340 < 4000L)
                    return;
                aLong1340 = l;
                onDemandSocket = aGame1346.getSocket(43594 + Game.portOffset);
                onDemandInputStream = onDemandSocket.getInputStream();
                onDemandOutputStream = onDemandSocket.getOutputStream();
                onDemandOutputStream.write(15);

                byte[] buildNumberBuffer = new byte[2];
                buildNumberBuffer[0] = (byte) (Constants.BUILD_NUMBER >> 8);
                buildNumberBuffer[1] = (byte) Constants.BUILD_NUMBER;
                onDemandOutputStream.write(buildNumberBuffer, 0, 2);

                for(int j = 0; j < 8; j++)
                    onDemandInputStream.read();

                anInt1364 = 0;
            }
            aByteArray1353[0] = (byte)class39_sub3_sub1.anInt1424;
            aByteArray1353[1] = (byte)(class39_sub3_sub1.anInt1425 >> 8);
            aByteArray1353[2] = (byte)class39_sub3_sub1.anInt1425;
            if(class39_sub3_sub1.aBoolean1427)
                aByteArray1353[3] = 2;
            else
            if(!aGame1346.aBoolean952)
                aByteArray1353[3] = 1;
            else
                aByteArray1353[3] = 0;
            onDemandOutputStream.write(aByteArray1353, 0, 4);
            anInt1380 = 0;
            anInt1341 = -10000;
            return;
        }
        catch(IOException ioexception) { }
        try
        {
            onDemandSocket.close();
        }
        catch(Exception _ex) { }
        onDemandSocket = null;
        onDemandInputStream = null;
        onDemandOutputStream = null;
        anInt1358 = 0;
        anInt1341++;
    }

    public boolean method241(int i, int j, byte abyte0[], int k)
    {
        if(abyte0 == null || abyte0.length < 2)
            return false;
        int l = abyte0.length - 2;
        int i1 = ((abyte0[l] & 0xff) << 8) + (abyte0[l + 1] & 0xff);
        while(i >= 0) 
            anInt1351 = -127;
        aCRC32_1379.reset();
        aCRC32_1379.update(abyte0, 0, l);
        int j1 = (int)aCRC32_1379.getValue();
        if(i1 != j)
            return false;
        return j1 == k;
    }

    public int method242(int i, int j, int k, int l)
    {
        int i1 = (k << 8) + i;
        for(int j1 = 0; j1 < anIntArray1355.length; j1++)
            if(anIntArray1355[j1] == i1)
                if(l == 0)
                    return anIntArray1338[j1];
                else
                    return anIntArray1343[j1];

        if(j <= 0)
            return anInt1351;
        else
            return -1;
    }

    public int method243(boolean flag, int i)
    {
        if(!flag)
            return anInt1351;
        else
            return aByteArray1371[i] & 0xff;
    }

    public OnDemandClient()
    {
        anInt1339 = 523;
        anIntArrayArray1345 = new int[4][];
        aByteArrayArray1347 = new byte[4][];
        aString1349 = "";
        aClass5_1350 = new Class5(-7255);
        anInt1351 = 3;
        aBoolean1352 = true;
        aByteArray1353 = new byte[500];
        aClass5_1356 = new Class5(-7255);
        aBoolean1360 = true;
        aClass5_1361 = new Class5(-7255);
        aClass5_1362 = new Class5(-7255);
        aClass5_1369 = new Class5(-7255);
        aClass23_1373 = new Class23(0);
        anIntArrayArray1374 = new int[4][];
        aBoolean1375 = false;
        anInt1376 = 208;
        aByteArray1378 = new byte[65000];
        aCRC32_1379 = new CRC32();
    }

    public int anIntArray1338[];
    public int anInt1339;
    public long aLong1340;
    public int anInt1341;
    public int anInt1342;
    public int anIntArray1343[];
    public int anIntArray1344[];
    public int anIntArrayArray1345[][];
    public Game aGame1346;
    public byte aByteArrayArray1347[][];
    public Socket onDemandSocket;
    public String aString1349;
    public Class5 aClass5_1350;
    public int anInt1351;
    public boolean aBoolean1352;
    public byte aByteArray1353[];
    public OutputStream onDemandOutputStream;
    public int anIntArray1355[];
    public Class5 aClass5_1356;
    public int anInt1357;
    public int anInt1358;
    public int anInt1359;
    public boolean aBoolean1360;
    public Class5 aClass5_1361;
    public Class5 aClass5_1362;
    public int anIntArray1363[];
    public int anInt1364;
    public int anInt1365;
    public Class39_Sub3_Sub1 aClass39_Sub3_Sub1_1366;
    public int anInt1367;
    public int anInt1368;
    public Class5 aClass5_1369;
    public int anInt1370;
    public byte aByteArray1371[];
    public InputStream onDemandInputStream;
    public Class23 aClass23_1373;
    public int anIntArrayArray1374[][];
    public boolean aBoolean1375;
    public int anInt1376;
    public int anIntArray1377[];
    public byte aByteArray1378[];
    public CRC32 aCRC32_1379;
    public int anInt1380;
}
