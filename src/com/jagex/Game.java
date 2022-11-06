package com.jagex;

import java.applet.AppletContext;
import java.awt.*;
import java.io.*;
import java.math.BigInteger;
import java.net.*;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.CRC32;
import com.jagex.sign.Signlink;
import com.jagex.util.Constants;

@SuppressWarnings("serial")
public class Game extends GameApplet {

    public Socket getSocket(int i) throws IOException {
        if(Signlink.mainapp != null)
            return Signlink.opensocket(i);
        else
            return new Socket(InetAddress.getByName(getCodeBase().getHost()), i);
    }

    public URL getCodeBase() {
        if(Signlink.mainapp != null)
            return Signlink.mainapp.getCodeBase();
        try {
            if(super.aFrame_Sub1_18 != null)
                return new URL("http://127.0.0.1:" + (80 + portOffset));
        }
        catch(Exception _ex) { }
        return super.getCodeBase();
    }

    public void method15(byte byte0, int i) {
        if(byte0 != 6)
        {
            return;
        } else
        {
            RSInterface.method357((byte)6, i);
            return;
        }
    }

    public void registerNewPlayers(int i, Buffer buffer, int j) {
        while(buffer.bitPosition + 10 < j * 8) {
            int k = buffer.readBits(11);
            if(k == 2047)
                break;
            if(players[k] == null) {
                players[k] = new Player();
                if(aClass39_Sub3_Sub3Array878[k] != null)
                    players[k].syncAppearance(false, aClass39_Sub3_Sub3Array878[k]);
            }
            playerIndices[playerCount++] = k;
            Player player = players[k];
            player.anInt1648 = loopCycle;
            int l = buffer.readBits(5);
            if(l > 15)
                l -= 32;
            int i1 = buffer.readBits(1);
            if(i1 == 1)
                anIntArray877[anInt876++] = k;
            int j1 = buffer.readBits(1);
            int k1 = buffer.readBits(5);
            if(k1 > 15)
                k1 -= 32;
            player.method413(((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0] + l, -9787, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0] + k1, j1 == 1);
        }
        buffer.finishBitAccess();
        if(i <= 0)
            outgoingVector.putByte(200);
    }

    public void parseTrackedNpcMovement(Buffer buffer) {
        buffer.initBitAccess();
        int j = buffer.readBits(8); //Change 1 to 8.
        if(j < anInt900) {
            for(int k = j; k < anInt900; k++) {
            	anIntArray918[anInt917++] = anIntArray901[k];
            }
        }
        if(j > anInt900) {
            Signlink.reporterror(enteredUsername + " Too many npcs");
            throw new RuntimeException("eek");
        }
        anInt900 = 0;
        for(int l = 0; l < j; l++) {
            int i1 = anIntArray901[l];
            Class39_Sub3_Sub2_Sub5_Sub2 class39_sub3_sub2_sub5_sub2 = aClass39_Sub3_Sub2_Sub5_Sub2Array899[i1];
            int j1 = buffer.readBits(1);
            if(j1 == 0) {
                anIntArray901[anInt900++] = i1;
                class39_sub3_sub2_sub5_sub2.anInt1648 = loopCycle;
            } else {
                int k1 = buffer.readBits(2);
                if(k1 == 0) {
                    anIntArray901[anInt900++] = i1;
                    class39_sub3_sub2_sub5_sub2.anInt1648 = loopCycle;
                    anIntArray877[anInt876++] = i1;
                } else if(k1 == 1) {
                    anIntArray901[anInt900++] = i1;
                    class39_sub3_sub2_sub5_sub2.anInt1648 = loopCycle;
                    int l1 = buffer.readBits(3);
                    class39_sub3_sub2_sub5_sub2.moveInDirection(l1, false);
                    int j2 = buffer.readBits(1);
                    if(j2 == 1) {
                    	anIntArray877[anInt876++] = i1;
                    }                        
                } else if(k1 == 2) {
                    anIntArray901[anInt900++] = i1;
                    class39_sub3_sub2_sub5_sub2.anInt1648 = loopCycle;
                    int i2 = buffer.readBits(3);
                    class39_sub3_sub2_sub5_sub2.moveInDirection(i2, true);
                    int k2 = buffer.readBits(3);
                    class39_sub3_sub2_sub5_sub2.moveInDirection(k2, true);
                    int l2 = buffer.readBits(1);
                    if(l2 == 1) {
                    	anIntArray877[anInt876++] = i1;
                    }                        
                } else if(k1 == 3) {
                	anIntArray918[anInt917++] = i1;
                }
                    
            }
        }

    }

    public void method18(int i)
    {
        int j = aClass39_Sub3_Sub4_Sub2_1099.method505(1, "Choose Option");
        for(int k = 0; k < anInt903; k++)
        {
            int l = aClass39_Sub3_Sub4_Sub2_1099.method505(1, aStringArray965[k]);
            if(l > j)
                j = l;
        }

        j += 8;
        while(i >= 0) 
            currentOpcode = -1;
        int i1 = 15 * anInt903 + 21;
        if(super.anInt30 > 4 && super.anInt31 > 4 && super.anInt30 < 516 && super.anInt31 < 338)
        {
            int j1 = super.anInt30 - 4 - j / 2;
            if(j1 + j > 512)
                j1 = 512 - j;
            if(j1 < 0)
                j1 = 0;
            int i2 = super.anInt31 - 4;
            if(i2 + i1 > 334)
                i2 = 334 - i1;
            if(i2 < 0)
                i2 = 0;
            aBoolean1293 = true;
            anInt1253 = 0;
            anInt1254 = j1;
            anInt1255 = i2;
            anInt1256 = j;
            anInt1257 = 15 * anInt903 + 22;
        }
        if(super.anInt30 > 553 && super.anInt31 > 205 && super.anInt30 < 743 && super.anInt31 < 466)
        {
            int k1 = super.anInt30 - 553 - j / 2;
            if(k1 < 0)
                k1 = 0;
            else
            if(k1 + j > 190)
                k1 = 190 - j;
            int j2 = super.anInt31 - 205;
            if(j2 < 0)
                j2 = 0;
            else
            if(j2 + i1 > 261)
                j2 = 261 - i1;
            aBoolean1293 = true;
            anInt1253 = 1;
            anInt1254 = k1;
            anInt1255 = j2;
            anInt1256 = j;
            anInt1257 = 15 * anInt903 + 22;
        }
        if(super.anInt30 > 17 && super.anInt31 > 357 && super.anInt30 < 496 && super.anInt31 < 453)
        {
            int l1 = super.anInt30 - 17 - j / 2;
            if(l1 < 0)
                l1 = 0;
            else
            if(l1 + j > 479)
                l1 = 479 - j;
            int k2 = super.anInt31 - 357;
            if(k2 < 0)
                k2 = 0;
            else
            if(k2 + i1 > 96)
                k2 = 96 - i1;
            aBoolean1293 = true;
            anInt1253 = 2;
            anInt1254 = l1;
            anInt1255 = k2;
            anInt1256 = j;
            anInt1257 = 15 * anInt903 + 22;
        }
    }

    public void method19(byte byte0)
    {
        if(byte0 != 6)
            currentOpcode = incommingVector.readUByte();
        if(super.anInt29 == 1)
        {
            if(super.anInt30 >= 539 && super.anInt30 <= 573 && super.anInt31 >= 169 && super.anInt31 < 205 && tabInterfaceIds[0] != -1)
            {
                needDrawTabArea = true;
                tabId = 0;
                aBoolean1188 = true;
            }
            if(super.anInt30 >= 569 && super.anInt30 <= 599 && super.anInt31 >= 168 && super.anInt31 < 205 && tabInterfaceIds[1] != -1)
            {
                needDrawTabArea = true;
                tabId = 1;
                aBoolean1188 = true;
            }
            if(super.anInt30 >= 597 && super.anInt30 <= 627 && super.anInt31 >= 168 && super.anInt31 < 205 && tabInterfaceIds[2] != -1)
            {
                needDrawTabArea = true;
                tabId = 2;
                aBoolean1188 = true;
            }
            if(super.anInt30 >= 625 && super.anInt30 <= 669 && super.anInt31 >= 168 && super.anInt31 < 203 && tabInterfaceIds[3] != -1)
            {
                needDrawTabArea = true;
                tabId = 3;
                aBoolean1188 = true;
            }
            if(super.anInt30 >= 666 && super.anInt30 <= 696 && super.anInt31 >= 168 && super.anInt31 < 205 && tabInterfaceIds[4] != -1)
            {
                needDrawTabArea = true;
                tabId = 4;
                aBoolean1188 = true;
            }
            if(super.anInt30 >= 694 && super.anInt30 <= 724 && super.anInt31 >= 168 && super.anInt31 < 205 && tabInterfaceIds[5] != -1)
            {
                needDrawTabArea = true;
                tabId = 5;
                aBoolean1188 = true;
            }
            if(super.anInt30 >= 722 && super.anInt30 <= 756 && super.anInt31 >= 169 && super.anInt31 < 205 && tabInterfaceIds[6] != -1)
            {
                needDrawTabArea = true;
                tabId = 6;
                aBoolean1188 = true;
            }
            if(super.anInt30 >= 540 && super.anInt30 <= 574 && super.anInt31 >= 466 && super.anInt31 < 502 && tabInterfaceIds[7] != -1)
            {
                needDrawTabArea = true;
                tabId = 7;
                aBoolean1188 = true;
            }
            if(super.anInt30 >= 572 && super.anInt30 <= 602 && super.anInt31 >= 466 && super.anInt31 < 503 && tabInterfaceIds[8] != -1)
            {
                needDrawTabArea = true;
                tabId = 8;
                aBoolean1188 = true;
            }
            if(super.anInt30 >= 599 && super.anInt30 <= 629 && super.anInt31 >= 466 && super.anInt31 < 503 && tabInterfaceIds[9] != -1)
            {
                needDrawTabArea = true;
                tabId = 9;
                aBoolean1188 = true;
            }
            if(super.anInt30 >= 627 && super.anInt30 <= 671 && super.anInt31 >= 467 && super.anInt31 < 502 && tabInterfaceIds[10] != -1)
            {
                needDrawTabArea = true;
                tabId = 10;
                aBoolean1188 = true;
            }
            if(super.anInt30 >= 669 && super.anInt30 <= 699 && super.anInt31 >= 466 && super.anInt31 < 503 && tabInterfaceIds[11] != -1)
            {
                needDrawTabArea = true;
                tabId = 11;
                aBoolean1188 = true;
            }
            if(super.anInt30 >= 696 && super.anInt30 <= 726 && super.anInt31 >= 466 && super.anInt31 < 503 && tabInterfaceIds[12] != -1)
            {
                needDrawTabArea = true;
                tabId = 12;
                aBoolean1188 = true;
            }
            if(super.anInt30 >= 724 && super.anInt30 <= 758 && super.anInt31 >= 466 && super.anInt31 < 502 && tabInterfaceIds[13] != -1)
            {
                needDrawTabArea = true;
                tabId = 13;
                aBoolean1188 = true;
            }
        }
    }

    public void method20(int i)
    {
        aClass39_Sub3_Sub4_Sub3_1145 = new Class39_Sub3_Sub4_Sub3(aClass10_1077, "titlebox", 0);
        aClass39_Sub3_Sub4_Sub3_1146 = new Class39_Sub3_Sub4_Sub3(aClass10_1077, "titlebutton", 0);
        i = 65 / i;
        aClass39_Sub3_Sub4_Sub3Array1260 = new Class39_Sub3_Sub4_Sub3[12];
        for(int j = 0; j < 12; j++)
            aClass39_Sub3_Sub4_Sub3Array1260[j] = new Class39_Sub3_Sub4_Sub3(aClass10_1077, "runes", j);

        aClass39_Sub3_Sub4_Sub4_1264 = new Class39_Sub3_Sub4_Sub4(128, 265);
        aClass39_Sub3_Sub4_Sub4_1265 = new Class39_Sub3_Sub4_Sub4(128, 265);
        for(int k = 0; k < 33920; k++)
            aClass39_Sub3_Sub4_Sub4_1264.anIntArray1731[k] = aClass14_1070.anIntArray219[k];

        for(int l = 0; l < 33920; l++)
            aClass39_Sub3_Sub4_Sub4_1265.anIntArray1731[l] = aClass14_1071.anIntArray219[l];

        anIntArray1007 = new int[256];
        for(int i1 = 0; i1 < 64; i1++)
            anIntArray1007[i1] = i1 * 0x40000;

        for(int j1 = 0; j1 < 64; j1++)
            anIntArray1007[j1 + 64] = 0xff0000 + 1024 * j1;

        for(int k1 = 0; k1 < 64; k1++)
            anIntArray1007[k1 + 128] = 0xffff00 + 4 * k1;

        for(int l1 = 0; l1 < 64; l1++)
            anIntArray1007[l1 + 192] = 0xffffff;

        anIntArray1008 = new int[256];
        for(int i2 = 0; i2 < 64; i2++)
            anIntArray1008[i2] = i2 * 1024;

        for(int j2 = 0; j2 < 64; j2++)
            anIntArray1008[j2 + 64] = 65280 + 4 * j2;

        for(int k2 = 0; k2 < 64; k2++)
            anIntArray1008[k2 + 128] = 65535 + 0x40000 * k2;

        for(int l2 = 0; l2 < 64; l2++)
            anIntArray1008[l2 + 192] = 0xffffff;

        anIntArray1009 = new int[256];
        for(int i3 = 0; i3 < 64; i3++)
            anIntArray1009[i3] = i3 * 4;

        for(int j3 = 0; j3 < 64; j3++)
            anIntArray1009[j3 + 64] = 255 + 0x40000 * j3;

        for(int k3 = 0; k3 < 64; k3++)
            anIntArray1009[k3 + 128] = 0xff00ff + 1024 * k3;

        for(int l3 = 0; l3 < 64; l3++)
            anIntArray1009[l3 + 192] = 0xffffff;

        anIntArray1006 = new int[256];
        anIntArray910 = new int[32768];
        anIntArray911 = new int[32768];
        method36(6718, null);
        anIntArray1027 = new int[32768];
        anIntArray1028 = new int[32768];
        drawLoadingString("Connecting to fileserver", 27936, 10);
        if(!aBoolean1015)
        {
            aBoolean1303 = true;
            aBoolean1015 = true;
            method12(this, 2);
        }
    }

    public int method21(int i, int j, int k, int l)
    {
        if(l != 43591)
        {
            for(int i1 = 1; i1 > 0; i1++);
        }
        int j1 = i >> 7;
        int k1 = j >> 7;
        if(j1 < 0 || k1 < 0 || j1 > 103 || k1 > 103)
            return 0;
        int l1 = k;
        if(l1 < 3 && (aByteArrayArrayArray1076[1][j1][k1] & 2) == 2)
            l1++;
        int i2 = i & 0x7f;
        int j2 = j & 0x7f;
        int k2 = anIntArrayArrayArray1179[l1][j1][k1] * (128 - i2) + anIntArrayArrayArray1179[l1][j1 + 1][k1] * i2 >> 7;
        int l2 = anIntArrayArrayArray1179[l1][j1][k1 + 1] * (128 - i2) + anIntArrayArrayArray1179[l1][j1 + 1][k1 + 1] * i2 >> 7;
        return k2 * (128 - j2) + l2 * j2 >> 7;
    }

    public void method22(int i)
    {
        if(i <= 0)
            anInt1274 = 398;
        anInt897 = 0;
        int j = (((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1621 >> 7) + anInt989;
        int k = (((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1622 >> 7) + anInt990;
        if(j >= 3053 && j <= 3156 && k >= 3056 && k <= 3136)
            anInt897 = 1;
        if(j >= 3072 && j <= 3118 && k >= 9492 && k <= 9535)
            anInt897 = 1;
        if(anInt897 == 1 && j >= 3139 && j <= 3199 && k >= 3008 && k <= 3062)
            anInt897 = 0;
    }

    public void registerNewNpcs(boolean flag, Buffer class39_sub3_sub3, int i)
    {
        while(class39_sub3_sub3.bitPosition + 21 < i * 8)
        {
            int j = class39_sub3_sub3.readBits(14);
            if(j == 16383)
                break;
            if(aClass39_Sub3_Sub2_Sub5_Sub2Array899[j] == null)
                aClass39_Sub3_Sub2_Sub5_Sub2Array899[j] = new Class39_Sub3_Sub2_Sub5_Sub2();
            Class39_Sub3_Sub2_Sub5_Sub2 class39_sub3_sub2_sub5_sub2 = aClass39_Sub3_Sub2_Sub5_Sub2Array899[j];
            anIntArray901[anInt900++] = j;
            class39_sub3_sub2_sub5_sub2.anInt1648 = loopCycle;
            int k = class39_sub3_sub3.readBits(5);
            if(k > 15)
                k -= 32;
            int l = class39_sub3_sub3.readBits(1);
            if(l == 1)
                anIntArray877[anInt876++] = j;
            int i1 = class39_sub3_sub3.readBits(5);
            if(i1 > 15)
                i1 -= 32;
            int j1 = class39_sub3_sub3.readBits(1);
            class39_sub3_sub2_sub5_sub2.aClass47_1772 = Class47.method598(class39_sub3_sub3.readBits(13));
            class39_sub3_sub2_sub5_sub2.anInt1608 = class39_sub3_sub2_sub5_sub2.aClass47_1772.aByte820;
            class39_sub3_sub2_sub5_sub2.anInt1609 = class39_sub3_sub2_sub5_sub2.aClass47_1772.anInt803;
            class39_sub3_sub2_sub5_sub2.anInt1644 = class39_sub3_sub2_sub5_sub2.aClass47_1772.anInt813;
            class39_sub3_sub2_sub5_sub2.anInt1645 = class39_sub3_sub2_sub5_sub2.aClass47_1772.anInt787;
            class39_sub3_sub2_sub5_sub2.anInt1646 = class39_sub3_sub2_sub5_sub2.aClass47_1772.anInt811;
            class39_sub3_sub2_sub5_sub2.anInt1647 = class39_sub3_sub2_sub5_sub2.aClass47_1772.anInt807;
            class39_sub3_sub2_sub5_sub2.anInt1640 = class39_sub3_sub2_sub5_sub2.aClass47_1772.anInt817;
            class39_sub3_sub2_sub5_sub2.method413(((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0] + k, -9787, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0] + i1, j1 == 1);
        }
        class39_sub3_sub3.finishBitAccess();
        if(flag)
            currentOpcode = -1;
    }

    public AppletContext getAppletContext()
    {
        if(Signlink.mainapp != null)
            return Signlink.mainapp.getAppletContext();
        else
            return super.getAppletContext();
    }

    public void method24(byte byte0, String s)
    {
        if(s == null || s.length() == 0)
        {
            anInt997 = 0;
            return;
        }
        String s1 = s;
        if(byte0 == 9)
            byte0 = 0;
        else
            return;
        String as[] = new String[100];
        int i = 0;
        do
        {
            int j = s1.indexOf(" ");
            if(j == -1)
                break;
            String s2 = s1.substring(0, j).trim();
            if(s2.length() > 0)
                as[i++] = s2.toLowerCase();
            s1 = s1.substring(j + 1);
        } while(true);
        s1 = s1.trim();
        if(s1.length() > 0)
            as[i++] = s1.toLowerCase();
        anInt997 = 0;
label0:
        for(int k = 0; k < Class4.anInt92; k++)
        {
            Class4 class4 = Class4.method174(k);
            if(class4.anInt77 != -1 || class4.aString105 == null)
                continue;
            String s3 = class4.aString105.toLowerCase();
            for(int l = 0; l < i; l++)
                if(s3.indexOf(as[l]) == -1)
                    continue label0;

            aStringArray998[anInt997] = s3;
            anIntArray999[anInt997] = k;
            anInt997++;
            if(anInt997 >= aStringArray998.length)
                return;
        }

    }

    public String method25(int i)
    {
        if(i <= 0)
            throw new NullPointerException();
        if(Signlink.mainapp != null)
            return Signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        if(super.aFrame_Sub1_18 != null)
            return "runescape.com";
        else
            return super.getDocumentBase().getHost().toLowerCase();
    }

    public void method26(int i, int j, int k, int l, int i1, RSInterface class34, int j1, 
            int k1, int l1)
    {
        while(i >= 0) 
            method6();
        if(aBoolean1198)
            anInt1215 = 32;
        else
            anInt1215 = 0;
        aBoolean1198 = false;
        if(k >= i1 && k < i1 + 16 && j1 >= k1 && j1 < k1 + 16)
        {
            class34.anInt609 -= anInt933 * 4;
            if(l1 == 1)
                needDrawTabArea = true;
            if(l1 == 2 || l1 == 3)
                aBoolean993 = true;
            return;
        }
        if(k >= i1 && k < i1 + 16 && j1 >= (k1 + j) - 16 && j1 < k1 + j)
        {
            class34.anInt609 += anInt933 * 4;
            if(l1 == 1)
                needDrawTabArea = true;
            if(l1 == 2 || l1 == 3)
                aBoolean993 = true;
            return;
        }
        if(k >= i1 - anInt1215 && k < i1 + 16 + anInt1215 && j1 >= k1 + 16 && j1 < (k1 + j) - 16 && anInt933 > 0)
        {
            int i2 = ((j - 32) * j) / l;
            if(i2 < 8)
                i2 = 8;
            int j2 = j1 - k1 - 16 - i2 / 2;
            int k2 = j - 32 - i2;
            class34.anInt609 = ((l - j) * j2) / k2;
            if(l1 == 1)
                needDrawTabArea = true;
            if(l1 == 2 || l1 == 3)
                aBoolean993 = true;
            aBoolean1198 = true;
        }
    }

    public void method27(int i, int j, boolean flag)
    {
        if(j < 7 || j > 7)
            aBoolean890 = !aBoolean890;
        Signlink.midivol = i;
        if(flag)
            Signlink.midi = "voladjust";
    }

    public void method28(byte byte0)
    {
        if(byte0 == 3)
            byte0 = 0;
        else
            currentOpcode = -1;
        do
        {
            Class39_Sub3_Sub1 class39_sub3_sub1;
            do
            {
                class39_sub3_sub1 = aOnDemandClient_1273.method237();
                if(class39_sub3_sub1 == null)
                    return;
                if(class39_sub3_sub1.anInt1424 == 0)
                {
                    Class39_Sub3_Sub2_Sub4.method385(4, class39_sub3_sub1.aByteArray1428, class39_sub3_sub1.anInt1425);
                    if((aOnDemandClient_1273.method243(true, class39_sub3_sub1.anInt1425) & 0x62) != 0)
                    {
                        needDrawTabArea = true;
                        if(anInt1208 != -1 || anInt1106 != -1)
                            aBoolean993 = true;
                    }
                }
                if(class39_sub3_sub1.anInt1424 == 1 && class39_sub3_sub1.aByteArray1428 != null)
                    Class33.method347((byte)-111, class39_sub3_sub1.aByteArray1428);
                if(class39_sub3_sub1.anInt1424 == 2 && class39_sub3_sub1.anInt1425 == anInt939 && class39_sub3_sub1.aByteArray1428 != null)
                    method94(class39_sub3_sub1.aByteArray1428, aBoolean940, 4);
                if(class39_sub3_sub1.anInt1424 == 3 && anInt1203 == 1)
                {
                    for(int i = 0; i < aByteArrayArray1239.length; i++)
                    {
                        if(anIntArray937[i] == class39_sub3_sub1.anInt1425)
                        {
                            aByteArrayArray1239[i] = class39_sub3_sub1.aByteArray1428;
                            if(class39_sub3_sub1.aByteArray1428 == null)
                                anIntArray937[i] = -1;
                            break;
                        }
                        if(anIntArray938[i] != class39_sub3_sub1.anInt1425)
                            continue;
                        aByteArrayArray1167[i] = class39_sub3_sub1.aByteArray1428;
                        if(class39_sub3_sub1.aByteArray1428 == null)
                            anIntArray938[i] = -1;
                        break;
                    }

                }
            } while(class39_sub3_sub1.anInt1424 != 93 || !aOnDemandClient_1273.method239(class39_sub3_sub1.anInt1425, (byte)6));
            Class22.method251(true, new Buffer(class39_sub3_sub1.aByteArray1428), aOnDemandClient_1273);
        } while(true);
    }

    public void reportAbuse(boolean flag)
    {
        if(!flag)
            anInt1266 = 476;
        if(super.anInt29 == 1)
        {
            if(super.anInt30 >= 6 && super.anInt30 <= 106 && super.anInt31 >= 467 && super.anInt31 <= 499)
            {
                anInt995 = (anInt995 + 1) % 4;
                aBoolean887 = true;
                aBoolean993 = true;
                outgoingVector.writeOpcode(50);
                outgoingVector.putByte(anInt995);
                outgoingVector.putByte(anInt1103);
                outgoingVector.putByte(anInt1195);
            }
            if(super.anInt30 >= 135 && super.anInt30 <= 235 && super.anInt31 >= 467 && super.anInt31 <= 499)
            {
                anInt1103 = (anInt1103 + 1) % 3;
                aBoolean887 = true;
                aBoolean993 = true;
                outgoingVector.writeOpcode(50);
                outgoingVector.putByte(anInt995);
                outgoingVector.putByte(anInt1103);
                outgoingVector.putByte(anInt1195);
            }
            if(super.anInt30 >= 273 && super.anInt30 <= 373 && super.anInt31 >= 467 && super.anInt31 <= 499)
            {
                anInt1195 = (anInt1195 + 1) % 3;
                aBoolean887 = true;
                aBoolean993 = true;
                outgoingVector.writeOpcode(50);
                outgoingVector.putByte(anInt995);
                outgoingVector.putByte(anInt1103);
                outgoingVector.putByte(anInt1195);
            }
            if(super.anInt30 >= 412 && super.anInt30 <= 512 && super.anInt31 >= 467 && super.anInt31 <= 499)
            {
                if(anInt1113 == -1)
                {
                    method34(0);
                    aString1012 = "";
                    aBoolean1319 = false;
                    anInt850 = anInt1113 = RSInterface.anInt616;
                    return;
                }
                sendMessage((byte)-83, "Please close the interface you have open before using 'report abuse'", 0, "");
            }
        }
    }

    public void method30(int i)
    {
        int j = anInt1029 * 128 + 64;
        int k = anInt1030 * 128 + 64;
        int l = method21(j, k, myHeightLevel, 43591) - anInt1031;
        if(anInt1209 < j)
        {
            anInt1209 += anInt1032 + ((j - anInt1209) * anInt1033) / 1000;
            if(anInt1209 > j)
                anInt1209 = j;
        }
        if(anInt1209 > j)
        {
            anInt1209 -= anInt1032 + ((anInt1209 - j) * anInt1033) / 1000;
            if(anInt1209 < j)
                anInt1209 = j;
        }
        if(anInt1210 < l)
        {
            anInt1210 += anInt1032 + ((l - anInt1210) * anInt1033) / 1000;
            if(anInt1210 > l)
                anInt1210 = l;
        }
        if(anInt1210 > l)
        {
            anInt1210 -= anInt1032 + ((anInt1210 - l) * anInt1033) / 1000;
            if(anInt1210 < l)
                anInt1210 = l;
        }
        if(anInt1211 < k)
        {
            anInt1211 += anInt1032 + ((k - anInt1211) * anInt1033) / 1000;
            if(anInt1211 > k)
                anInt1211 = k;
        }
        if(anInt1211 > k)
        {
            anInt1211 -= anInt1032 + ((anInt1211 - k) * anInt1033) / 1000;
            if(anInt1211 < k)
                anInt1211 = k;
        }
        anInt931++;
        if(anInt931 > 173)
        {
            anInt931 = 0;
            outgoingVector.writeOpcode(132);
            outgoingVector.putTribyte(0x1123f0);
        }
        j = anInt1296 * 128 + 64;
        if(i >= 0)
            currentOpcode = incommingVector.readUByte();
        k = anInt1297 * 128 + 64;
        l = method21(j, k, myHeightLevel, 43591) - anInt1298;
        int i1 = j - anInt1209;
        int j1 = l - anInt1210;
        int k1 = k - anInt1211;
        int l1 = (int)Math.sqrt(i1 * i1 + k1 * k1);
        int i2 = (int)(Math.atan2(j1, l1) * 325.94900000000001D) & 0x7ff;
        int j2 = (int)(Math.atan2(i1, k1) * -325.94900000000001D) & 0x7ff;
        if(i2 < 128)
            i2 = 128;
        if(i2 > 383)
            i2 = 383;
        if(anInt1212 < i2)
        {
            anInt1212 += anInt1299 + ((i2 - anInt1212) * anInt1300) / 1000;
            if(anInt1212 > i2)
                anInt1212 = i2;
        }
        if(anInt1212 > i2)
        {
            anInt1212 -= anInt1299 + ((anInt1212 - i2) * anInt1300) / 1000;
            if(anInt1212 < i2)
                anInt1212 = i2;
        }
        int k2 = j2 - anInt1213;
        if(k2 > 1024)
            k2 -= 2048;
        if(k2 < -1024)
            k2 += 2048;
        if(k2 > 0)
        {
            anInt1213 += anInt1299 + (k2 * anInt1300) / 1000;
            anInt1213 &= 0x7ff;
        }
        if(k2 < 0)
        {
            anInt1213 -= anInt1299 + (-k2 * anInt1300) / 1000;
            anInt1213 &= 0x7ff;
        }
        int l2 = j2 - anInt1213;
        if(l2 > 1024)
            l2 -= 2048;
        if(l2 < -1024)
            l2 += 2048;
        if(l2 < 0 && k2 > 0 || l2 > 0 && k2 < 0)
            anInt1213 = j2;
    }

    public void method31(int i)
    {
        if(i != 0)
            return;
        try
        {
            int j = ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1621 + anInt1048;
            int k = ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1622 + anInt1093;
            if(anInt1225 - j < -500 || anInt1225 - j > 500 || anInt1226 - k < -500 || anInt1226 - k > 500)
            {
                anInt1225 = j;
                anInt1226 = k;
            }
            if(anInt1225 != j)
                anInt1225 += (j - anInt1225) / 16;
            if(anInt1226 != k)
                anInt1226 += (k - anInt1226) / 16;
            if(super.anIntArray33[1] == 1)
                anInt929 += (-24 - anInt929) / 2;
            else
            if(super.anIntArray33[2] == 1)
                anInt929 += (24 - anInt929) / 2;
            else
                anInt929 /= 2;
            if(super.anIntArray33[3] == 1)
                anInt930 += (12 - anInt930) / 2;
            else
            if(super.anIntArray33[4] == 1)
                anInt930 += (-12 - anInt930) / 2;
            else
                anInt930 /= 2;
            anInt928 = anInt928 + anInt929 / 2 & 0x7ff;
            anInt927 += anInt930 / 2;
            if(anInt927 < 128)
                anInt927 = 128;
            if(anInt927 > 383)
                anInt927 = 383;
            int l = anInt1225 >> 7;
            int i1 = anInt1226 >> 7;
            int j1 = method21(anInt1225, anInt1226, myHeightLevel, 43591);
            int k1 = 0;
            if(l > 3 && i1 > 3 && l < 100 && i1 < 100)
            {
                for(int l1 = l - 4; l1 <= l + 4; l1++)
                {
                    for(int j2 = i1 - 4; j2 <= i1 + 4; j2++)
                    {
                        int k2 = myHeightLevel;
                        if(k2 < 3 && (aByteArrayArrayArray1076[1][l1][j2] & 2) == 2)
                            k2++;
                        int l2 = j1 - anIntArrayArrayArray1179[k2][l1][j2];
                        if(l2 > k1)
                            k1 = l2;
                    }

                }

            }
            int i2 = k1 * 192;
            if(i2 > 0x17f00)
                i2 = 0x17f00;
            if(i2 < 32768)
                i2 = 32768;
            if(i2 > anInt1005)
            {
                anInt1005 += (i2 - anInt1005) / 24;
                return;
            }
            if(i2 < anInt1005)
            {
                anInt1005 += (i2 - anInt1005) / 80;
                return;
            }
        }
        catch(Exception _ex)
        {
            Signlink.reporterror("glfc_ex " + ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1621 + "," + ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1622 + "," + anInt1225 + "," + anInt1226 + "," + anInt1088 + "," + anInt1089 + "," + anInt989 + "," + anInt990);
            throw new RuntimeException("eek");
        }
    }

    public void method32(int i)
    {
        aClass14_845.method207(-5281);
        Class39_Sub3_Sub4_Sub1.anIntArray1680 = anIntArray1315;
        aClass39_Sub3_Sub4_Sub3_955.method523(0, 22912, 0);
        if(i != 0)
            return;
        if(aBoolean1001)
        {
            aClass39_Sub3_Sub4_Sub2_1099.method503(239, 41480, 0, aString1152, 40);
            aClass39_Sub3_Sub4_Sub2_1099.method503(239, 41480, 128, aString1023 + "*", 60);
        } else
        if(anInt1169 == 1)
        {
            aClass39_Sub3_Sub4_Sub2_1099.method503(239, 41480, 0, "Enter amount:", 40);
            aClass39_Sub3_Sub4_Sub2_1099.method503(239, 41480, 128, aString958 + "*", 60);
        } else
        if(anInt1169 == 2)
        {
            aClass39_Sub3_Sub4_Sub2_1099.method503(239, 41480, 0, "Enter name:", 40);
            aClass39_Sub3_Sub4_Sub2_1099.method503(239, 41480, 128, aString958 + "*", 60);
        } else
        if(anInt1169 == 3)
        {
            if(aString958 != aString996)
            {
                method24((byte)9, aString958);
                aString996 = aString958;
            }
            Class39_Sub3_Sub4_Sub2 class39_sub3_sub4_sub2 = aClass39_Sub3_Sub4_Sub2_1098;
            Class39_Sub3_Sub4.method475(0, (byte)-98, 77, 463, 0);
            for(int j = 0; j < anInt997; j++)
            {
                int l = (18 + j * 14) - anInt1000;
                if(l > 0 && l < 110)
                    class39_sub3_sub4_sub2.method503(239, 41480, 0, aStringArray998[j], l);
            }

            Class39_Sub3_Sub4.method474((byte)0);
            if(anInt997 > 5)
                method63(anInt997 * 14 + 7, (byte)89, 77, 463, 0, anInt1000);
            if(aString958.length() == 0)
                aClass39_Sub3_Sub4_Sub2_1099.method503(239, 41480, 255, "Enter object name", 40);
            else
            if(anInt997 == 0)
                aClass39_Sub3_Sub4_Sub2_1099.method503(239, 41480, 0, "No matching objects found, please shorten search", 40);
            class39_sub3_sub4_sub2.method503(239, 41480, 0, aString958 + "*", 90);
            Class39_Sub3_Sub4.method481(0, 479, 893, 77, 0);
        } else
        if(aString1131 != null)
        {
            aClass39_Sub3_Sub4_Sub2_1099.method503(239, 41480, 0, aString1131, 40);
            aClass39_Sub3_Sub4_Sub2_1099.method503(239, 41480, 128, "Click to continue", 60);
        } else
        if(anInt1208 != -1)
            method101(-7410, 0, 0, RSInterface.getInterface(anInt1208), 0);
        else
        if(anInt1106 != -1)
        {
            method101(-7410, 0, 0, RSInterface.getInterface(anInt1106), 0);
        } else
        {
            Class39_Sub3_Sub4_Sub2 class39_sub3_sub4_sub2_1 = aClass39_Sub3_Sub4_Sub2_1098;
            int k = 0;
            Class39_Sub3_Sub4.method475(0, (byte)-98, 77, 463, 0);
            for(int i1 = 0; i1 < 100; i1++)
                if(aStringArray1194[i1] != null)
                {
                    int j1 = anIntArray1192[i1];
                    int k1 = (70 - k * 14) + anInt948;
                    String s1 = aStringArray1193[i1];
                    byte byte0 = 0;
                    if(s1 != null && s1.startsWith("@cr1@"))
                    {
                        s1 = s1.substring(5);
                        byte0 = 1;
                    }
                    if(s1 != null && s1.startsWith("@cr2@"))
                    {
                        s1 = s1.substring(5);
                        byte0 = 2;
                    }
                    if(j1 == 0)
                    {
                        if(k1 > 0 && k1 < 110)
                            class39_sub3_sub4_sub2_1.method507(0, (byte)118, aStringArray1194[i1], k1, 4);
                        k++;
                    }
                    if((j1 == 1 || j1 == 2) && (j1 == 1 || anInt995 == 0 || anInt995 == 1 && method66(true, s1)))
                    {
                        if(k1 > 0 && k1 < 110)
                        {
                            int l1 = 4;
                            if(byte0 == 1)
                            {
                                aClass39_Sub3_Sub4_Sub3Array1126[0].method523(l1, 22912, k1 - 12);
                                l1 += 14;
                            }
                            if(byte0 == 2)
                            {
                                aClass39_Sub3_Sub4_Sub3Array1126[1].method523(l1, 22912, k1 - 12);
                                l1 += 14;
                            }
                            class39_sub3_sub4_sub2_1.method507(0, (byte)118, s1 + ":", k1, l1);
                            l1 += class39_sub3_sub4_sub2_1.method505(1, s1) + 8;
                            class39_sub3_sub4_sub2_1.method507(255, (byte)118, aStringArray1194[i1], k1, l1);
                        }
                        k++;
                    }
                    if((j1 == 3 || j1 == 7) && anInt1056 == 0 && (j1 == 7 || anInt1103 == 0 || anInt1103 == 1 && method66(true, s1)))
                    {
                        if(k1 > 0 && k1 < 110)
                        {
                            int i2 = 4;
                            class39_sub3_sub4_sub2_1.method507(0, (byte)118, "From", k1, i2);
                            i2 += class39_sub3_sub4_sub2_1.method505(1, "From ");
                            if(byte0 == 1)
                            {
                                aClass39_Sub3_Sub4_Sub3Array1126[0].method523(i2, 22912, k1 - 12);
                                i2 += 14;
                            }
                            if(byte0 == 2)
                            {
                                aClass39_Sub3_Sub4_Sub3Array1126[1].method523(i2, 22912, k1 - 12);
                                i2 += 14;
                            }
                            class39_sub3_sub4_sub2_1.method507(0, (byte)118, s1 + ":", k1, i2);
                            i2 += class39_sub3_sub4_sub2_1.method505(1, s1) + 8;
                            class39_sub3_sub4_sub2_1.method507(0x800000, (byte)118, aStringArray1194[i1], k1, i2);
                        }
                        k++;
                    }
                    if(j1 == 4 && (anInt1195 == 0 || anInt1195 == 1 && method66(true, s1)))
                    {
                        if(k1 > 0 && k1 < 110)
                            class39_sub3_sub4_sub2_1.method507(0x800080, (byte)118, s1 + " " + aStringArray1194[i1], k1, 4);
                        k++;
                    }
                    if(j1 == 5 && anInt1056 == 0 && anInt1103 < 2)
                    {
                        if(k1 > 0 && k1 < 110)
                            class39_sub3_sub4_sub2_1.method507(0x800000, (byte)118, aStringArray1194[i1], k1, 4);
                        k++;
                    }
                    if(j1 == 6 && anInt1056 == 0 && anInt1103 < 2)
                    {
                        if(k1 > 0 && k1 < 110)
                        {
                            class39_sub3_sub4_sub2_1.method507(0, (byte)118, "To " + s1 + ":", k1, 4);
                            class39_sub3_sub4_sub2_1.method507(0x800000, (byte)118, aStringArray1194[i1], k1, 12 + class39_sub3_sub4_sub2_1.method505(1, "To " + s1));
                        }
                        k++;
                    }
                    if(j1 == 8 && (anInt1195 == 0 || anInt1195 == 1 && method66(true, s1)))
                    {
                        if(k1 > 0 && k1 < 110)
                            class39_sub3_sub4_sub2_1.method507(0x7e3200, (byte)118, s1 + " " + aStringArray1194[i1], k1, 4);
                        k++;
                    }
                }

            Class39_Sub3_Sub4.method474((byte)0);
            anInt1118 = k * 14 + 7;
            if(anInt1118 < 78)
                anInt1118 = 78;
            method63(anInt1118, (byte)89, 77, 463, 0, anInt1118 - anInt948 - 77);
            String s;
            if(myPlayer != null && myPlayer.aString1754 != null)
                s = myPlayer.aString1754;
            else
                s = Class37.method372(enteredUsername, false);
            class39_sub3_sub4_sub2_1.method507(0, (byte)118, s + ":", 90, 4);
            class39_sub3_sub4_sub2_1.method507(255, (byte)118, aString1125 + "*", 90, 6 + class39_sub3_sub4_sub2_1.method505(1, s + ": "));
            Class39_Sub3_Sub4.method481(0, 479, 893, 77, 0);
        }
        if(aBoolean1293 && anInt1253 == 2)
            method126(true);
        aClass14_845.method208(super.graphics, 966, 357, 17);
        aClass14_844.method207(-5281);
        Class39_Sub3_Sub4_Sub1.anIntArray1680 = anIntArray1317;
    }

    public void connectionLost(int i)
    {
        if(anInt1176 > 0)
        {
            method70((byte)9);
            return;
        }
        method71("Please wait - attempting to reestablish", "Connection lost", 22761);
        anInt923 = 0;
        if(i != 31790)
            anInt1217 = 318;
        anInt1218 = 0;
        RSSocket class41 = socket;
        aBoolean952 = false;
        anInt1261 = 0;
        login(enteredUsername, aString1178, true);
        if(!aBoolean952)
            method70((byte)9);
        try
        {
            class41.method538();
            return;
        }
        catch(Exception _ex)
        {
            return;
        }
    }

    public void method34(int i)
    {
        if(i != 0)
            currentOpcode = incommingVector.readUByte();
        outgoingVector.writeOpcode(245);
        if(anInt951 != -1)
        {
            method15((byte)6, anInt951);
            anInt951 = -1;
            needDrawTabArea = true;
            aBoolean896 = false;
            aBoolean1188 = true;
        }
        if(anInt1208 != -1)
        {
            method15((byte)6, anInt1208);
            anInt1208 = -1;
            aBoolean993 = true;
            aBoolean896 = false;
        }
        if(anInt1161 != -1)
        {
            method15((byte)6, anInt1161);
            anInt1161 = -1;
            aBoolean1148 = true;
        }
        if(anInt846 != -1)
        {
            method15((byte)6, anInt846);
            anInt846 = -1;
        }
        if(anInt1113 != -1)
        {
            method15((byte)6, anInt1113);
            anInt1113 = -1;
        }
    }

    public boolean parseOpcode(int i) {
        opcodeSize += i;
        if(socket == null)
            return false;
        try
        {
            int j = socket.method540();
            if(j == 0)
                return false;
            if(currentOpcode == -1)
            {
                socket.fillBuffer(incommingVector.payload, 0, 1);
                currentOpcode = incommingVector.payload[0] & 0xff;
                if(decrypter != null)
                    currentOpcode = currentOpcode - decrypter.getNextKey() & 0xff;
                opcodeSize = Class19.anIntArray267[currentOpcode];
                j--;
            }
            if(opcodeSize == -1)
                if(j > 0)
                {
                    socket.fillBuffer(incommingVector.payload, 0, 1);
                    opcodeSize = incommingVector.payload[0] & 0xff;
                    j--;
                } else
                {
                    return false;
                }
            if(opcodeSize == -2)
                if(j > 1)
                {
                    socket.fillBuffer(incommingVector.payload, 0, 2);
                    incommingVector.currentOffset = 0;
                    opcodeSize = incommingVector.readShort();
                    j -= 2;
                } else
                {
                    return false;
                }
            if(j < opcodeSize)
                return false;
            incommingVector.currentOffset = 0;
            socket.fillBuffer(incommingVector.payload, 0, opcodeSize);
            anInt1174 = 0;
            anInt971 = anInt970;
            anInt970 = anInt969;
            anInt969 = currentOpcode;
            if(currentOpcode == 228)
            {
                aBoolean1001 = false;
                anInt1169 = 2;
                aString958 = "";
                aBoolean993 = true;
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 25)
            {
                aBoolean1001 = false;
                anInt1169 = 1;
                aString958 = "";
                aBoolean993 = true;
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 141)
            {
                needDrawTabArea = true;
                int k = incommingVector.readShort();
                RSInterface class34 = RSInterface.getInterface(k);
                int j16 = incommingVector.readShort();
                for(int l21 = 0; l21 < j16; l21++)
                {
                    int k24 = incommingVector.readUByte();
                    if(k24 == 255)
                        k24 = incommingVector.method470((byte)0);
                    class34.anIntArray612[l21] = incommingVector.readShort();
                    class34.anIntArray603[l21] = k24;
                }

                for(int l24 = j16; l24 < class34.anIntArray612.length; l24++)
                {
                    class34.anIntArray612[l24] = 0;
                    class34.anIntArray603[l24] = 0;
                }

                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 169)
            {
                anInt1313 = incommingVector.getUnsignedByteA();
                anInt1314 = incommingVector.readUByte();
                for(int l = anInt1313; l < anInt1313 + 8; l++)
                {
                    for(int j10 = anInt1314; j10 < anInt1314 + 8; j10++)
                        if(aClass5ArrayArrayArray950[myHeightLevel][l][j10] != null)
                        {
                            aClass5ArrayArrayArray950[myHeightLevel][l][j10] = null;
                            method99(l, j10);
                        }

                }

                for(Class39_Sub1 class39_sub1 = (Class39_Sub1)aClass5_994.method185(); class39_sub1 != null; class39_sub1 = (Class39_Sub1)aClass5_994.method187((byte)8))
                    if(class39_sub1.anInt1386 >= anInt1313 && class39_sub1.anInt1386 < anInt1313 + 8 && class39_sub1.anInt1387 >= anInt1314 && class39_sub1.anInt1387 < anInt1314 + 8 && class39_sub1.anInt1384 == myHeightLevel)
                        class39_sub1.anInt1388 = 0;

                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 156)
            {
                aBoolean853 = true;
                anInt1029 = incommingVector.readUByte();
                anInt1030 = incommingVector.readUByte();
                anInt1031 = incommingVector.readShort();
                anInt1032 = incommingVector.readUByte();
                anInt1033 = incommingVector.readUByte();
                if(anInt1033 >= 100)
                {
                    anInt1209 = anInt1029 * 128 + 64;
                    anInt1211 = anInt1030 * 128 + 64;
                    anInt1210 = method21(anInt1209, anInt1211, myHeightLevel, 43591) - anInt1031;
                }
                currentOpcode = -1;
                return true;
            }
            /*
             * Map region stuff.
             */
            if(currentOpcode == 121 || currentOpcode == 30) {
                int i1 = anInt1088;
                int k10 = anInt1089;
                if(currentOpcode == 121)
                {
                    k10 = incommingVector.readShortLE();
                    i1 = incommingVector.readShort();
                    aBoolean1102 = false;
                }
                if(currentOpcode == 30)
                {
                    incommingVector.initBitAccess();
                    for(int k16 = 0; k16 < 4; k16++)
                    {
                        for(int i22 = 0; i22 < 13; i22++)
                        {
                            for(int i25 = 0; i25 < 13; i25++)
                            {
                                int j27 = incommingVector.readBits(1);
                                if(j27 == 1)
                                    anIntArrayArrayArray1061[k16][i22][i25] = incommingVector.readBits(26);
                                else
                                    anIntArrayArrayArray1061[k16][i22][i25] = -1;
                            }

                        }

                    }

                    incommingVector.finishBitAccess();
                    k10 = incommingVector.readShort();
                    i1 = incommingVector.readShortLE();
                    aBoolean1102 = true;
                }
                if(anInt1088 == i1 && anInt1089 == k10 && anInt1203 == 2)
                {
                    currentOpcode = -1;
                    return true;
                }
                anInt1088 = i1;
                anInt1089 = k10;
                anInt989 = (anInt1088 - 6) * 8;
                anInt990 = (anInt1089 - 6) * 8;
                aBoolean1156 = false;
                if((anInt1088 / 8 == 48 || anInt1088 / 8 == 49) && anInt1089 / 8 == 48)
                    aBoolean1156 = true;
                if(anInt1088 / 8 == 48 && anInt1089 / 8 == 148)
                    aBoolean1156 = true;
                anInt1203 = 1;
                aLong1051 = System.currentTimeMillis();
                method71(null, "Loading - please wait.", 22761);
                if(currentOpcode == 121)
                {
                    int l16 = 0;
                    for(int j22 = (anInt1088 - 6) / 8; j22 <= (anInt1088 + 6) / 8; j22++)
                    {
                        for(int j25 = (anInt1089 - 6) / 8; j25 <= (anInt1089 + 6) / 8; j25++)
                            l16++;

                    }

                    aByteArrayArray1239 = new byte[l16][];
                    aByteArrayArray1167 = new byte[l16][];
                    anIntArray936 = new int[l16];
                    anIntArray937 = new int[l16];
                    anIntArray938 = new int[l16];
                    l16 = 0;
                    for(int k25 = (anInt1088 - 6) / 8; k25 <= (anInt1088 + 6) / 8; k25++)
                    {
                        for(int k27 = (anInt1089 - 6) / 8; k27 <= (anInt1089 + 6) / 8; k27++)
                        {
                            anIntArray936[l16] = (k25 << 8) + k27;
                            if(aBoolean1156 && (k27 == 49 || k27 == 149 || k27 == 147 || k25 == 50 || k25 == 49 && k27 == 47))
                            {
                                anIntArray937[l16] = -1;
                                anIntArray938[l16] = -1;
                                l16++;
                            } else
                            {
                                int l29 = anIntArray937[l16] = aOnDemandClient_1273.method242(k27, 208, k25, 0);
                                if(l29 != -1)
                                    aOnDemandClient_1273.method227(3, l29);
                                int k31 = anIntArray938[l16] = aOnDemandClient_1273.method242(k27, 208, k25, 1);
                                if(k31 != -1)
                                    aOnDemandClient_1273.method227(3, k31);
                                l16++;
                            }
                        }

                    }

                }
                if(currentOpcode == 30)
                {
                    int i17 = 0;
                    int ai[] = new int[676];
                    for(int l25 = 0; l25 < 4; l25++)
                    {
                        for(int l27 = 0; l27 < 13; l27++)
                        {
                            for(int i30 = 0; i30 < 13; i30++)
                            {
                                int l31 = anIntArrayArrayArray1061[l25][l27][i30];
                                if(l31 != -1)
                                {
                                    int l32 = l31 >> 14 & 0x3ff;
                                    int j33 = l31 >> 3 & 0x7ff;
                                    int i34 = (l32 / 8 << 8) + j33 / 8;
                                    for(int k34 = 0; k34 < i17; k34++)
                                    {
                                        if(ai[k34] != i34)
                                            continue;
                                        i34 = -1;
                                        break;
                                    }

                                    if(i34 != -1)
                                        ai[i17++] = i34;
                                }
                            }

                        }

                    }

                    aByteArrayArray1239 = new byte[i17][];
                    aByteArrayArray1167 = new byte[i17][];
                    anIntArray936 = new int[i17];
                    anIntArray937 = new int[i17];
                    anIntArray938 = new int[i17];
                    for(int i28 = 0; i28 < i17; i28++)
                    {
                        int j30 = anIntArray936[i28] = ai[i28];
                        int i32 = j30 >> 8 & 0xff;
                        int i33 = j30 & 0xff;
                        int k33 = anIntArray937[i28] = aOnDemandClient_1273.method242(i33, 208, i32, 0);
                        if(k33 != -1)
                            aOnDemandClient_1273.method227(3, k33);
                        int j34 = anIntArray938[i28] = aOnDemandClient_1273.method242(i33, 208, i32, 1);
                        if(j34 != -1)
                            aOnDemandClient_1273.method227(3, j34);
                    }

                }
                int j17 = anInt989 - anInt991;
                int k22 = anInt990 - anInt992;
                anInt991 = anInt989;
                anInt992 = anInt990;
                for(int i26 = 0; i26 < 16384; i26++)
                {
                    Class39_Sub3_Sub2_Sub5_Sub2 class39_sub3_sub2_sub5_sub2 = aClass39_Sub3_Sub2_Sub5_Sub2Array899[i26];
                    if(class39_sub3_sub2_sub5_sub2 != null)
                    {
                        for(int k30 = 0; k30 < 10; k30++)
                        {
                            ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anIntArray1629[k30] -= j17;
                            ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anIntArray1630[k30] -= k22;
                        }

                        class39_sub3_sub2_sub5_sub2.anInt1621 -= j17 * 128;
                        class39_sub3_sub2_sub5_sub2.anInt1622 -= k22 * 128;
                    }
                }

                for(int j28 = 0; j28 < anInt871; j28++)
                {
                    Player player = players[j28];
                    if(player != null)
                    {
                        for(int j32 = 0; j32 < 10; j32++)
                        {
                            ((Class39_Sub3_Sub2_Sub5) (player)).anIntArray1629[j32] -= j17;
                            ((Class39_Sub3_Sub2_Sub5) (player)).anIntArray1630[j32] -= k22;
                        }

                        player.anInt1621 -= j17 * 128;
                        player.anInt1622 -= k22 * 128;
                    }
                }

                aBoolean1163 = true;
                byte byte1 = 0;
                byte byte2 = 104;
                byte byte3 = 1;
                if(j17 < 0)
                {
                    byte1 = 103;
                    byte2 = -1;
                    byte3 = -1;
                }
                byte byte4 = 0;
                byte byte5 = 104;
                byte byte6 = 1;
                if(k22 < 0)
                {
                    byte4 = 103;
                    byte5 = -1;
                    byte6 = -1;
                }
                for(int l34 = byte1; l34 != byte2; l34 += byte3)
                {
                    for(int i35 = byte4; i35 != byte5; i35 += byte6)
                    {
                        int j35 = l34 + j17;
                        int k35 = i35 + k22;
                        for(int l35 = 0; l35 < 4; l35++)
                            if(j35 >= 0 && k35 >= 0 && j35 < 104 && k35 < 104)
                                aClass5ArrayArrayArray950[l35][l34][i35] = aClass5ArrayArrayArray950[l35][j35][k35];
                            else
                                aClass5ArrayArrayArray950[l35][l34][i35] = null;

                    }

                }

                for(Class39_Sub1 class39_sub1_1 = (Class39_Sub1)aClass5_994.method185(); class39_sub1_1 != null; class39_sub1_1 = (Class39_Sub1)aClass5_994.method187((byte)8))
                {
                    class39_sub1_1.anInt1386 -= j17;
                    class39_sub1_1.anInt1387 -= k22;
                    if(class39_sub1_1.anInt1386 < 0 || class39_sub1_1.anInt1387 < 0 || class39_sub1_1.anInt1386 >= 104 || class39_sub1_1.anInt1387 >= 104)
                        class39_sub1_1.method376();
                }

                if(anInt1218 != 0)
                {
                    anInt1218 -= j17;
                    anInt1219 -= k22;
                }
                aBoolean853 = false;
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 163)
            {
                int j1 = incommingVector.readShort();
                int l10 = incommingVector.aClass5_1450.getUnsignedByteS(incommingVector);
                if(j1 == 65535)
                    j1 = -1;
                if(tabInterfaceIds[l10] != j1)
                {
                    method15((byte)6, tabInterfaceIds[l10]);
                    tabInterfaceIds[l10] = j1;
                }
                needDrawTabArea = true;
                aBoolean1188 = true;
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 166) {
                updatePlayers(opcodeSize, incommingVector);
                aBoolean1163 = false;
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 193)
            {
                int k1 = incommingVector.getLESmartA();
                int i11 = incommingVector.getShortA();
                RSInterface class34_3 = RSInterface.getInterface(i11);
		System.out.println("k1: " + k1 + ", i11: " + i11);
                if(class34_3.anInt589 != k1 || k1 == -1)
                {
                    class34_3.anInt589 = k1;
                    class34_3.anInt649 = 0;
                    class34_3.anInt587 = 0;
                }
                currentOpcode = -1;
                return true;
            }
            /*
             * Opcode 36 = Hint icons.
             */
            if(currentOpcode == 36)
            {
                anInt1149 = incommingVector.readUByte();
                if(anInt1149 == 1)
                    anInt883 = incommingVector.readShort();
                if(anInt1149 >= 2 && anInt1149 <= 6)
                {
                    if(anInt1149 == 2)
                    {
                        anInt1136 = 64;
                        anInt1137 = 64;
                    }
                    if(anInt1149 == 3)
                    {
                        anInt1136 = 0;
                        anInt1137 = 64;
                    }
                    if(anInt1149 == 4)
                    {
                        anInt1136 = 128;
                        anInt1137 = 64;
                    }
                    if(anInt1149 == 5)
                    {
                        anInt1136 = 64;
                        anInt1137 = 0;
                    }
                    if(anInt1149 == 6)
                    {
                        anInt1136 = 64;
                        anInt1137 = 128;
                    }
                    anInt1149 = 2;
                    anInt1133 = incommingVector.readShort();
                    anInt1134 = incommingVector.readShort();
                    anInt1135 = incommingVector.readUByte();
                }
                if(anInt1149 == 10)
                    anInt1017 = incommingVector.readShort();
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 107)
            {
                int l1 = incommingVector.readShortLE();
                RSInterface class34_1 = RSInterface.getInterface(l1);
                for(int k17 = 0; k17 < class34_1.anIntArray612.length; k17++)
                {
                    class34_1.anIntArray612[k17] = -1;
                    class34_1.anIntArray612[k17] = 0;
                }

                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 232)
            {
                anInt1336 = incommingVector.readUByte();
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 235) //Display two interfaces or something.
            {
                int i2 = incommingVector.getShortA();
                int j11 = incommingVector.readShort();
                if(anInt1208 != -1)
                {
                    method15((byte)6, anInt1208);
                    anInt1208 = -1;
                    aBoolean993 = true;
                }
                if(anInt1161 != -1)
                {
                    method15((byte)6, anInt1161);
                    anInt1161 = -1;
                    aBoolean1148 = true;
                }
                if(anInt846 != -1)
                {
                    method15((byte)6, anInt846);
                    anInt846 = -1;
                }
                if(anInt1113 != j11)
                {
                    method15((byte)6, anInt1113);
                    anInt1113 = j11;
                }
                if(anInt951 != i2)
                {
                    method15((byte)6, anInt951);
                    anInt951 = i2;
                }
                if(anInt1169 != 0)
                {
                    anInt1169 = 0;
                    aBoolean993 = true;
                }
                needDrawTabArea = true;
                aBoolean1188 = true;
                aBoolean896 = false;
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 251)
            {
                byte byte0 = incommingVector.getByte();
                int k11 = incommingVector.getLEShortA();
                anIntArray870[k11] = byte0;
                if(anIntArray943[k11] != byte0)
                {
                    anIntArray943[k11] = byte0;
                    method97(k11, aByte1243);
                    needDrawTabArea = true;
                    if(anInt1106 != -1)
                        aBoolean993 = true;
                }
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 34)
            {
                int j2 = incommingVector.readShortLE();
                RSInterface.getInterface(j2).anInt636 = 3;
                if(myPlayer.aClass47_1756 == null)
                    RSInterface.getInterface(j2).anInt637 = (myPlayer.anIntArray1746[0] << 25) + (myPlayer.anIntArray1746[4] << 20) + (myPlayer.anIntArray1760[0] << 15) + (myPlayer.anIntArray1760[8] << 10) + (myPlayer.anIntArray1760[11] << 5) + myPlayer.anIntArray1760[1];
                else
                    RSInterface.getInterface(j2).anInt637 = (int)(0x12345678L + myPlayer.aClass47_1756.aLong780);
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 154)
            {
                if(tabId == 12)
                    needDrawTabArea = true;
                anInt1150 = incommingVector.getSmart();
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 26)
            {
                String s = incommingVector.getRs2String();
                int l11 = incommingVector.aClass5_1450.getUnsignedByteS(incommingVector);
                int l17 = incommingVector.getUnsignedByteC();
                if(l17 >= 1 && l17 <= 5)
                {
                    if(s.equalsIgnoreCase("null"))
                        s = null;
                    aStringArray980[l17 - 1] = s;
                    aBooleanArray981[l17 - 1] = l11 == 0;
                }
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 52)
            {
                anInt1168 = opcodeSize / 8;
                for(int k2 = 0; k2 < anInt1168; k2++)
                    aLongArray879[k2] = incommingVector.getLong();

                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 151)
            {
                int l2 = incommingVector.readShort();
                int i12 = incommingVector.readShort();
                int i18 = l2 >> 10 & 0x1f;
                int l22 = l2 >> 5 & 0x1f;
                int j26 = l2 & 0x1f;
                RSInterface.getInterface(i12).anInt594 = (i18 << 19) + (l22 << 11) + (j26 << 3);
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 18)
            {
                int i3 = incommingVector.getShortA();
                int j12 = incommingVector.getLEShortA();
                RSInterface.getInterface(i3).anInt636 = 2;
                RSInterface.getInterface(i3).anInt637 = j12;
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 146)
            {
                anInt1232 = incommingVector.readUByte();
                anInt1282 = incommingVector.getLEShortA();
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 152)
            {
                tabId = incommingVector.readUByte();
                needDrawTabArea = true;
                aBoolean1188 = true;
                currentOpcode = -1;
                return true;
            }
            /*
             * Opcode 31 = SendMessage.
             */
            if(currentOpcode == 31) {
                String s1 = incommingVector.getRs2String();
                if(s1.endsWith(":tradereq:"))
                {
                    String s3 = s1.substring(0, s1.indexOf(":"));
                    long l18 = Class37.stringToLong(s3);
                    boolean flag1 = false;
                    for(int k28 = 0; k28 < anInt1168; k28++)
                    {
                        if(aLongArray879[k28] != l18)
                            continue;
                        flag1 = true;
                        break;
                    }

                    if(!flag1 && anInt897 == 0)
                        sendMessage((byte)-83, "wishes to trade with you.", 4, s3);
                } else
                if(s1.endsWith(":duelreq:"))
                {
                    String s4 = s1.substring(0, s1.indexOf(":"));
                    long l19 = Class37.stringToLong(s4);
                    boolean flag2 = false;
                    for(int l28 = 0; l28 < anInt1168; l28++)
                    {
                        if(aLongArray879[l28] != l19)
                            continue;
                        flag2 = true;
                        break;
                    }

                    if(!flag2 && anInt897 == 0)
                        sendMessage((byte)-83, "wishes to duel with you.", 8, s4);
                } else
                if(s1.endsWith(":chalreq:"))
                {
                    String s5 = s1.substring(0, s1.indexOf(":"));
                    long l20 = Class37.stringToLong(s5);
                    boolean flag3 = false;
                    for(int i29 = 0; i29 < anInt1168; i29++)
                    {
                        if(aLongArray879[i29] != l20)
                            continue;
                        flag3 = true;
                        break;
                    }

                    if(!flag3 && anInt897 == 0)
                    {
                        String s8 = s1.substring(s1.indexOf(":") + 1, s1.length() - 9);
                        sendMessage((byte)-83, s8, 8, s5);
                    }
                } else
                {
                    sendMessage((byte)-83, s1, 0, "");
                }
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 161)
            {
                method70((byte)9);
                currentOpcode = -1;
                return false;
            }
            if(currentOpcode == 110)
            {
                int j3 = incommingVector.getLEShortA();
                int k12 = incommingVector.readShort();
                RSInterface class34_4 = RSInterface.getInterface(k12);
                if(class34_4 != null && class34_4.anInt638 == 0)
                {
                    if(j3 < 0)
                        j3 = 0;
                    if(j3 > class34_4.anInt607 - class34_4.anInt610)
                        j3 = class34_4.anInt607 - class34_4.anInt610;
                    class34_4.anInt609 = j3;
                }
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 85)
            {
                int k3 = incommingVector.readShort();
                int l12 = incommingVector.getShortA();
                int j18 = incommingVector.getShortA();
                int i23 = incommingVector.readShort();
                RSInterface.getInterface(k3).anInt618 = l12;
                RSInterface.getInterface(k3).anInt619 = j18;
                RSInterface.getInterface(k3).anInt617 = i23;
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 4)
            {
                int l3 = incommingVector.readShort();
                if(l3 == 65535)
                    l3 = -1;
                if(l3 != anInt1010 && aBoolean926 && !highMemory && anInt1159 == 0)
                {
                    anInt939 = l3;
                    aBoolean940 = true;
                    aOnDemandClient_1273.method227(2, anInt939);
                }
                anInt1010 = l3;
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 233)
            {
                int i4 = incommingVector.method466();
                int i13 = incommingVector.readShort();
                if(aBoolean926 && !highMemory)
                {
                    anInt939 = i13;
                    aBoolean940 = false;
                    aOnDemandClient_1273.method227(2, anInt939);
                    anInt1159 = i4;
                }
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 102)
            {
                anInt1313 = incommingVector.getUnsignedByteC();
                anInt1314 = incommingVector.aClass5_1450.getUnsignedByteS(incommingVector);
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 97)
            {
                long l4 = incommingVector.getLong();
                int k18 = incommingVector.readIntBE();
                int j23 = incommingVector.readUByte();
                boolean flag4 = false;
                for(int j29 = 0; j29 < 100; j29++)
                {
                    if(anIntArray1285[j29] != k18)
                        continue;
                    flag4 = true;
                    break;
                }

                if(j23 <= 1)
                {
                    for(int l30 = 0; l30 < anInt1168; l30++)
                    {
                        if(aLongArray879[l30] != l4)
                            continue;
                        flag4 = true;
                        break;
                    }

                }
                if(!flag4 && anInt897 == 0)
                    try
                    {
                        anIntArray1285[anInt1283] = k18;
                        anInt1283 = (anInt1283 + 1) % 100;
                        String s9 = Class50.method601(incommingVector, opcodeSize - 13, 0);
                        if(j23 != 3)
                            s9 = Class44.method556(s9, true);
                        if(j23 == 2 || j23 == 3)
                            sendMessage((byte)-83, s9, 7, "@cr2@" + Class37.method372(Class37.method369(-39, l4), false));
                        else
                        if(j23 == 1)
                            sendMessage((byte)-83, s9, 7, "@cr1@" + Class37.method372(Class37.method369(-39, l4), false));
                        else
                            sendMessage((byte)-83, s9, 3, Class37.method372(Class37.method369(-39, l4), false));
                    }
                    catch(Exception exception1)
                    {
                        Signlink.reporterror("cde1");
                    }
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 119)
            {
                int j4 = incommingVector.readUByte();
                int j13 = incommingVector.readUByte();
                int i19 = incommingVector.readUByte();
                int k23 = incommingVector.readUByte();
                aBooleanArray1018[j4] = true;
                anIntArray1308[j4] = j13;
                anIntArray947[j4] = i19;
                anIntArray941[j4] = k23;
                anIntArray1087[j4] = 0;
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 69 || currentOpcode == 194 || currentOpcode == 1 || currentOpcode == 173 || currentOpcode == 137 || currentOpcode == 100 || currentOpcode == 220 || currentOpcode == 51 || currentOpcode == 128 || currentOpcode == 57 || currentOpcode == 241)
            {
                method103(incommingVector, false, currentOpcode);
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 124) //Show interface.
            {
                int k4 = incommingVector.getLEShortA();
                method143(k4, 1);
                if(anInt951 != -1)
                {
                    method15((byte)6, anInt951);
                    anInt951 = -1;
                    needDrawTabArea = true;
                    aBoolean1188 = true;
                }
                if(anInt1161 != -1)
                {
                    method15((byte)6, anInt1161);
                    anInt1161 = -1;
                    aBoolean1148 = true;
                }
                if(anInt846 != -1)
                {
                    method15((byte)6, anInt846);
                    anInt846 = -1;
                }
                if(anInt1113 != -1)
                {
                    method15((byte)6, anInt1113);
                    anInt1113 = -1;
                }
                if(anInt1208 != k4)
                {
                    method15((byte)6, anInt1208);
                    anInt1208 = k4;
                }
                aBoolean896 = false;
                aBoolean993 = true;
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 200)
            {
                needDrawTabArea = true;
                int i5 = incommingVector.getUnsignedByteC();
                int k13 = incommingVector.aClass5_1450.getUnsignedByteS(incommingVector);
                int j19 = incommingVector.getLEInt();
                anIntArray1096[i5] = j19;
                anIntArray1110[i5] = k13;
                anIntArray1024[i5] = 1;
                for(int l23 = 0; l23 < 98; l23++)
                    if(j19 >= anIntArray1205[l23])
                        anIntArray1024[i5] = l23 + 2;

                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 217)
            {
                int j5 = incommingVector.getLESmartA();
                if(j5 >= 0)
                    method143(j5, 1);
                if(j5 != anInt1129)
                {
                    method15((byte)6, anInt1129);
                    anInt1129 = j5;
                }
                currentOpcode = -1;
                return true;
            }
            /*
             * Opcode 174: Reset buttons.
             */
            if(currentOpcode == 174) {
                for(int k5 = 0; k5 < anIntArray943.length; k5++)
                    if(anIntArray943[k5] != anIntArray870[k5])
                    {
                        anIntArray943[k5] = anIntArray870[k5];
                        method97(k5, aByte1243);
                        needDrawTabArea = true;
                    }

                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 236)
            {
                anInt1019 = incommingVector.getUnsignedByteA();
                if(anInt1019 == tabId)
                {
                    if(anInt1019 == 3)
                        tabId = 1;
                    else
                        tabId = 3;
                    needDrawTabArea = true;
                }
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 208) {
                updateNpcs(opcodeSize, incommingVector);
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 136)
            {
                anInt1313 = incommingVector.readUByte();
                anInt1314 = incommingVector.aClass5_1450.getUnsignedByteS(incommingVector);
                while(incommingVector.currentOffset < opcodeSize) 
                {
                    int l5 = incommingVector.readUByte();
                    method103(incommingVector, false, l5);
                }
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 120)
            {
                int i6 = incommingVector.readShort();
                boolean flag = incommingVector.aClass5_1450.getUnsignedByteS(incommingVector) == 1;
                RSInterface.getInterface(i6).aBoolean613 = flag;
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 167)
            {
                int j6 = incommingVector.readShort();
                int l13 = incommingVector.readUByte();
                int k19 = incommingVector.readShort();
                if(k19 == 65535) {
                    if(anInt979 < 50) {
                        anIntArray1199[anInt979] = (short)j6;
                        anIntArray1080[anInt979] = l13;
                        anIntArray847[anInt979] = 0;
                        anInt979++;
                    }
                } else
                if(aBoolean1321 && !highMemory && anInt979 < 50) {
                    anIntArray1199[anInt979] = j6;
                    anIntArray1080[anInt979] = l13;
                    anIntArray847[anInt979] = k19 + Class12.anIntArray203[j6];
                    anInt979++;
                }
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 58)
            {
                aBoolean853 = true;
                anInt1296 = incommingVector.readUByte();
                anInt1297 = incommingVector.readUByte();
                anInt1298 = incommingVector.readShort();
                anInt1299 = incommingVector.readUByte();
                anInt1300 = incommingVector.readUByte();
                if(anInt1300 >= 100)
                {
                    int k6 = anInt1296 * 128 + 64;
                    int i14 = anInt1297 * 128 + 64;
                    int i20 = method21(k6, i14, myHeightLevel, 43591) - anInt1298;
                    int i24 = k6 - anInt1209;
                    int k26 = i20 - anInt1210;
                    int k29 = i14 - anInt1211;
                    int i31 = (int)Math.sqrt(i24 * i24 + k29 * k29);
                    anInt1212 = (int)(Math.atan2(k26, i31) * 325.94900000000001D) & 0x7ff;
                    anInt1213 = (int)(Math.atan2(i24, k29) * -325.94900000000001D) & 0x7ff;
                    if(anInt1212 < 128)
                        anInt1212 = 128;
                    if(anInt1212 > 383)
                        anInt1212 = 383;
                }
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 132) //Show interface
            {
                int l6 = incommingVector.readShort();
                method143(l6, 1);
                if(anInt1208 != -1)
                {
                    method15((byte)6, anInt1208);
                    anInt1208 = -1;
                    aBoolean993 = true;
                }
                if(anInt1161 != -1)
                {
                    method15((byte)6, anInt1161);
                    anInt1161 = -1;
                    aBoolean1148 = true;
                }
                if(anInt846 != -1)
                {
                    method15((byte)6, anInt846);
                    anInt846 = -1;
                }
                if(anInt1113 != -1)
                {
                    method15((byte)6, anInt1113);
                    anInt1113 = -1;
                }
                if(anInt951 != l6)
                {
                    method15((byte)6, anInt951);
                    anInt951 = l6;
                }
                if(anInt1169 != 0)
                {
                    anInt1169 = 0;
                    aBoolean993 = true;
                }
                needDrawTabArea = true;
                aBoolean1188 = true;
                aBoolean896 = false;
                currentOpcode = -1;
                return true;
            }
            /*
             * Opcode 10: Send system update.
             */
            if(currentOpcode == 10)
            {
                anInt1237 = incommingVector.getLEShortA() * 30;
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 175)
            {
                int i7 = incommingVector.readShort();
                int j14 = incommingVector.getShortA();
                RSInterface.getInterface(i7).anInt636 = 1;
                RSInterface.getInterface(i7).anInt637 = j14;
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 245)
            {
                if(tabId == 12)
                    needDrawTabArea = true;
                anInt1304 = incommingVector.readUByte();
                currentOpcode = -1;
                return true;
            }
            /*
             * Opcode 239: SendString.
             */
            if(currentOpcode == 239) {
                int position = incommingVector.readShort();
                String message = incommingVector.getRs2String();
                RSInterface.getInterface(position).message = message;
                if(RSInterface.getInterface(position).parentId == tabInterfaceIds[tabId]) {
                	needDrawTabArea = true;
                }                                    
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 39)
            {
                anInt1053 = incommingVector.getShortA();
                anInt1078 = incommingVector.getShortA();
                anInt1258 = incommingVector.readShortLE();
                anInt1170 = incommingVector.readShort();
                anInt1329 = incommingVector.getShortA();
                incommingVector.getLEShortA();
                anInt1011 = incommingVector.getLEInt();
                anInt978 = incommingVector.readShort();
                anInt1302 = incommingVector.getLEShortA();
                anInt1034 = incommingVector.readShortLE();
                incommingVector.getUnsignedByteC();
                Signlink.dnslookup(Class37.method371(anInt1011, aByte1291));
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 9) //Send interface
            {
                int k7 = incommingVector.readShort();
                int k14 = incommingVector.getLEShortA();
                method143(k7, 1);
                if(k14 != -1)
                    method143(k14, 1);
                if(anInt1113 != -1)
                {
                    method15((byte)6, anInt1113);
                    anInt1113 = -1;
                }
                if(anInt951 != -1)
                {
                    method15((byte)6, anInt951);
                    anInt951 = -1;
                }
                if(anInt1208 != -1)
                {
                    method15((byte)6, anInt1208);
                    anInt1208 = -1;
                }
                if(anInt1161 != k7)
                {
                    method15((byte)6, anInt1161);
                    anInt1161 = k7;
                }
                if(anInt846 != k7)
                {
                    method15((byte)6, anInt846);
                    anInt846 = k14;
                }
                anInt1169 = 0;
                aBoolean896 = false;
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 98)
            {
                anInt995 = incommingVector.readUByte();
                anInt1103 = incommingVector.readUByte();
                anInt1195 = incommingVector.readUByte();
                aBoolean887 = true;
                aBoolean993 = true;
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 255) //Send interface
            {
                int l7 = incommingVector.readShortLE();
                method143(l7, 1);
                if(anInt951 != -1)
                {
                    method15((byte)6, anInt951);
                    anInt951 = -1;
                    needDrawTabArea = true;
                    aBoolean1188 = true;
                }
                if(anInt1208 != -1)
                {
                    method15((byte)6, anInt1208);
                    anInt1208 = -1;
                    aBoolean993 = true;
                }
                if(anInt1161 != -1)
                {
                    method15((byte)6, anInt1161);
                    anInt1161 = -1;
                    aBoolean1148 = true;
                }
                if(anInt846 != -1)
                {
                    method15((byte)6, anInt846);
                    anInt846 = -1;
                }
                if(anInt1113 != l7)
                {
                    method15((byte)6, anInt1113);
                    anInt1113 = l7;
                }
                if(anInt1169 != 0)
                {
                    anInt1169 = 0;
                    aBoolean993 = true;
                }
                aBoolean896 = false;
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 29)
            {
                anInt1218 = 0;
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 179)
            {
                for(int i8 = 0; i8 < players.length; i8++)
                    if(players[i8] != null)
                        players[i8].anInt1615 = -1;

                for(int l14 = 0; l14 < aClass39_Sub3_Sub2_Sub5_Sub2Array899.length; l14++)
                    if(aClass39_Sub3_Sub2_Sub5_Sub2Array899[l14] != null)
                        aClass39_Sub3_Sub2_Sub5_Sub2Array899[l14].anInt1615 = -1;

                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 109)
            {
                int j8 = incommingVector.readShortLE();
                int i15 = incommingVector.getLEInt();
                anIntArray870[j8] = i15;
                if(anIntArray943[j8] != i15)
                {
                    anIntArray943[j8] = i15;
                    method97(j8, aByte1243);
                    needDrawTabArea = true;
                    if(anInt1106 != -1)
                        aBoolean993 = true;
                }
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 24)
            {
                long l8 = incommingVector.getLong();
                int j20 = incommingVector.readUByte();
                String friend = Class37.method372(Class37.method369(-39, l8), false);
                for(int l26 = 0; l26 < anInt1190; l26++)
                {
                    if(l8 != aLongArray1050[l26])
                        continue;
                    if(anIntArray895[l26] != j20)
                    {
                        anIntArray895[l26] = j20;
                        needDrawTabArea = true;
                        if(j20 > 0)
                            sendMessage((byte)-83, friend + " has logged in.", 5, "");
                        if(j20 == 0)
                            sendMessage((byte)-83, friend + " has logged out.", 5, "");
                    }
                    friend = null;
                    break;
                }

                if(friend != null && anInt1190 < 200)
                {
                    aLongArray1050[anInt1190] = l8;
                    aStringArray1216[anInt1190] = friend;
                    anIntArray895[anInt1190] = j20;
                    anInt1190++;
                    needDrawTabArea = true;
                }
                for(boolean flag5 = false; !flag5;)
                {
                    flag5 = true;
                    for(int j31 = 0; j31 < anInt1190 - 1; j31++)
                        if(anIntArray895[j31] != nodeId && anIntArray895[j31 + 1] == nodeId || anIntArray895[j31] == 0 && anIntArray895[j31 + 1] != 0)
                        {
                            int k32 = anIntArray895[j31];
                            anIntArray895[j31] = anIntArray895[j31 + 1];
                            anIntArray895[j31 + 1] = k32;
                            String s10 = aStringArray1216[j31];
                            aStringArray1216[j31] = aStringArray1216[j31 + 1];
                            aStringArray1216[j31 + 1] = s10;
                            long l33 = aLongArray1050[j31];
                            aLongArray1050[j31] = aLongArray1050[j31 + 1];
                            aLongArray1050[j31 + 1] = l33;
                            needDrawTabArea = true;
                            flag5 = false;
                        }

                }

                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 6)
            {
                int k8 = incommingVector.getSmart();
                if(k8 != anInt1106)
                {
                    method15((byte)6, anInt1106);
                    anInt1106 = k8;
                }
                aBoolean993 = true;
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 96) {
                needDrawTabArea = true;
                int i9 = incommingVector.readShort();
                RSInterface class34_2 = RSInterface.getInterface(i9);
                while(incommingVector.currentOffset < opcodeSize) {
                    int k20 = incommingVector.getByteOrShortC();
                    int j24 = incommingVector.readShort();
                    int i27 = incommingVector.readUByte();
                    if(i27 == 255) {
                    	i27 = incommingVector.readIntBE();
                    }                        
                    if(k20 >= 0 && k20 < class34_2.anIntArray612.length) {
                        class34_2.anIntArray612[k20] = j24;
                        class34_2.anIntArray603[k20] = i27;
                    }
                }
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 247)
            {
                int j9 = incommingVector.readShortLE();
                int j15 = incommingVector.readShort();
                int i21 = incommingVector.readShortLE();
                if(j9 == 65535) {
                    RSInterface.getInterface(j15).anInt636 = 0;
                    currentOpcode = -1;
                    return true;
                } else
                {
                    Class4 class4 = Class4.method174(j9);
                    RSInterface.getInterface(j15).anInt636 = 4;
                    RSInterface.getInterface(j15).anInt637 = j9;
                    RSInterface.getInterface(j15).anInt618 = class4.anInt97;
                    RSInterface.getInterface(j15).anInt619 = class4.anInt112;
                    RSInterface.getInterface(j15).anInt617 = (class4.anInt81 * 100) / i21;
                    currentOpcode = -1;
                    return true;
                }
            }
            if(currentOpcode == 76) //Close all interfaces.
            {
                if(anInt951 != -1)
                {
                    method15((byte)6, anInt951);
                    anInt951 = -1;
                    needDrawTabArea = true;
                    aBoolean1188 = true;
                }
                if(anInt1208 != -1)
                {
                    method15((byte)6, anInt1208);
                    anInt1208 = -1;
                    aBoolean993 = true;
                }
                if(anInt1161 != -1)
                {
                    method15((byte)6, anInt1161);
                    anInt1161 = -1;
                    aBoolean1148 = true;
                }
                if(anInt846 != -1)
                {
                    method15((byte)6, anInt846);
                    anInt846 = -1;
                }
                if(anInt1113 != -1)
                {
                    method15((byte)6, anInt1113);
                    anInt1113 = -1;
                }
                if(anInt1169 != 0)
                {
                    anInt1169 = 0;
                    aBoolean993 = true;
                }
                aBoolean896 = false;
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 243)
            {
                int k9 = incommingVector.readShort();
                int k15 = incommingVector.getShortA();
                int j21 = incommingVector.readShortLE();
                RSInterface.getInterface(k15).anInt635 = (k9 << 16) + j21;
                currentOpcode = -1;
                return true;
            }
            /*
             * Opcode 41: Reset Camera Position.
             */
            if(currentOpcode == 41) {
                aBoolean853 = false;
                for(int l9 = 0; l9 < 5; l9++)
                    aBooleanArray1018[l9] = false;

                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 64)
            {
                anInt1191 = incommingVector.readUByte();
                needDrawTabArea = true;
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 113)
            {
                anInt923 = incommingVector.readUByte();
                currentOpcode = -1;
                return true;
            }
            if(currentOpcode == 246)
            {
                int i10 = incommingVector.getLESmart();
                int l15 = incommingVector.getLEShortA();
                int k21 = incommingVector.getLESmartA();
                RSInterface class34_5 = RSInterface.getInterface(l15);
                class34_5.anInt631 = k21;
                class34_5.anInt586 = i10;
                currentOpcode = -1;
                return true;
            }
            Signlink.reporterror("T1 - " + currentOpcode + "," + opcodeSize + " - " + anInt970 + "," + anInt971);
            method70((byte)9);
        }
        catch(IOException _ex)
        {
            connectionLost(31790);
        }
        catch(Exception exception)
        {
            String s2 = "T2 - " + currentOpcode + "," + anInt970 + "," + anInt971 + " - " + opcodeSize + "," + (anInt989 + ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0]) + "," + (anInt990 + ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0]) + " - ";
            for(int i16 = 0; i16 < opcodeSize && i16 < 50; i16++)
                s2 = s2 + incommingVector.payload[i16] + ",";

            Signlink.reporterror(s2);
            method70((byte)9);
        }
        return true;
    }

    public void method36(int i, Class39_Sub3_Sub4_Sub3 class39_sub3_sub4_sub3)
    {
        if(i != 6718)
            aBoolean1295 = !aBoolean1295;
        int j = 256;
        for(int k = 0; k < anIntArray910.length; k++)
            anIntArray910[k] = 0;

        for(int l = 0; l < 5000; l++)
        {
            int i1 = (int)(Math.random() * 128D * (double)j);
            anIntArray910[i1] = (int)(Math.random() * 256D);
        }

        for(int j1 = 0; j1 < 20; j1++)
        {
            for(int k1 = 1; k1 < j - 1; k1++)
            {
                for(int i2 = 1; i2 < 127; i2++)
                {
                    int k2 = i2 + (k1 << 7);
                    anIntArray911[k2] = (anIntArray910[k2 - 1] + anIntArray910[k2 + 1] + anIntArray910[k2 - 128] + anIntArray910[k2 + 128]) / 4;
                }

            }

            int ai[] = anIntArray910;
            anIntArray910 = anIntArray911;
            anIntArray911 = ai;
        }

        if(class39_sub3_sub4_sub3 != null)
        {
            int l1 = 0;
            for(int j2 = 0; j2 < class39_sub3_sub4_sub3.anInt1718; j2++)
            {
                for(int l2 = 0; l2 < class39_sub3_sub4_sub3.anInt1717; l2++)
                    if(class39_sub3_sub4_sub3.aByteArray1715[l1++] != 0)
                    {
                        int i3 = l2 + 16 + class39_sub3_sub4_sub3.anInt1719;
                        int j3 = j2 + 16 + class39_sub3_sub4_sub3.anInt1720;
                        int k3 = i3 + (j3 << 7);
                        anIntArray910[k3] = 0;
                    }

            }

        }
    }

    public int method37(int i, byte byte0, RSInterface class34)
    {
        if(byte0 != aByte1322)
            return anInt1016;
        if(class34.anIntArrayArray654 == null || i >= class34.anIntArrayArray654.length)
            return -2;
        try
        {
            int ai[] = class34.anIntArrayArray654[i];
            int j = 0;
            int k = 0;
            int l = 0;
            do
            {
                int i1 = ai[k++];
                int j1 = 0;
                byte byte1 = 0;
                if(i1 == 0)
                    return j;
                if(i1 == 1)
                    j1 = anIntArray1110[ai[k++]];
                if(i1 == 2)
                    j1 = anIntArray1024[ai[k++]];
                if(i1 == 3)
                    j1 = anIntArray1096[ai[k++]];
                if(i1 == 4)
                {
                    RSInterface class34_1 = RSInterface.getInterface(ai[k++]);
                    int j2 = ai[k++];
                    if(j2 >= 0 && j2 < Class4.anInt92 && (!Class4.method174(j2).aBoolean63 || members))
                    {
                        for(int i3 = 0; i3 < class34_1.anIntArray612.length; i3++)
                            if(class34_1.anIntArray612[i3] == j2 + 1)
                                j1 += class34_1.anIntArray603[i3];

                    }
                }
                if(i1 == 5)
                    j1 = anIntArray943[ai[k++]];
                if(i1 == 6)
                    j1 = anIntArray1205[anIntArray1024[ai[k++]] - 1];
                if(i1 == 7)
                    j1 = (anIntArray943[ai[k++]] * 100) / 46875;
                if(i1 == 8)
                    j1 = myPlayer.anInt1768;
                if(i1 == 9)
                {
                    for(int k1 = 0; k1 < Class40.anInt691; k1++)
                        if(Class40.aBooleanArray693[k1])
                            j1 += anIntArray1024[k1];

                }
                if(i1 == 10)
                {
                    RSInterface class34_2 = RSInterface.getInterface(ai[k++]);
                    int k2 = ai[k++] + 1;
                    if(k2 >= 0 && k2 < Class4.anInt92 && (!Class4.method174(k2).aBoolean63 || members))
                    {
                        for(int j3 = 0; j3 < class34_2.anIntArray612.length; j3++)
                        {
                            if(class34_2.anIntArray612[j3] != k2)
                                continue;
                            j1 = 0x3b9ac9ff;
                            break;
                        }

                    }
                }
                if(i1 == 11)
                    j1 = anInt1304;
                if(i1 == 12)
                    j1 = anInt1150;
                if(i1 == 13)
                {
                    int l1 = anIntArray943[ai[k++]];
                    int l2 = ai[k++];
                    j1 = (l1 & 1 << l2) == 0 ? 0 : 1;
                }
                if(i1 == 14)
                {
                    int i2 = ai[k++];
                    Class6 class6 = Class6.aClass6Array122[i2];
                    int k3 = class6.anInt124;
                    int l3 = class6.anInt125;
                    int i4 = class6.anInt126;
                    int j4 = anIntArray880[i4 - l3];
                    j1 = anIntArray943[k3] >> l3 & j4;
                }
                if(i1 == 15)
                    byte1 = 1;
                if(i1 == 16)
                    byte1 = 2;
                if(i1 == 17)
                    byte1 = 3;
                if(i1 == 18)
                    j1 = (((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1621 >> 7) + anInt989;
                if(i1 == 19)
                    j1 = (((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1622 >> 7) + anInt990;
                if(i1 == 20)
                    j1 = ai[k++];
                if(byte1 == 0)
                {
                    if(l == 0)
                        j += j1;
                    if(l == 1)
                        j -= j1;
                    if(l == 2 && j1 != 0)
                        j /= j1;
                    if(l == 3)
                        j *= j1;
                    l = 0;
                } else
                {
                    l = byte1;
                }
            } while(true);
        }
        catch(Exception _ex)
        {
            return -1;
        }
    }

    public void method38(int i)
    {
        byte abyte0[] = aClass10_1077.method193("title.dat", null);
        Class39_Sub3_Sub4_Sub4 class39_sub3_sub4_sub4 = new Class39_Sub3_Sub4_Sub4(abyte0, this);
        aClass14_1070.method207(-5281);
        class39_sub3_sub4_sub4.method528(0, 0, 1);
        aClass14_1071.method207(-5281);
        class39_sub3_sub4_sub4.method528(-637, 0, 1);
        aClass14_1067.method207(-5281);
        class39_sub3_sub4_sub4.method528(-128, 0, 1);
        aClass14_1068.method207(-5281);
        class39_sub3_sub4_sub4.method528(-202, -371, 1);
        aClass14_1069.method207(-5281);
        class39_sub3_sub4_sub4.method528(-202, -171, 1);
        aClass14_1072.method207(-5281);
        if(i != -21339)
            currentOpcode = incommingVector.readUByte();
        class39_sub3_sub4_sub4.method528(0, -265, 1);
        aClass14_1073.method207(-5281);
        class39_sub3_sub4_sub4.method528(-562, -265, 1);
        aClass14_1074.method207(-5281);
        class39_sub3_sub4_sub4.method528(-128, -171, 1);
        aClass14_1075.method207(-5281);
        class39_sub3_sub4_sub4.method528(-562, -171, 1);
        int ai[] = new int[class39_sub3_sub4_sub4.anInt1732];
        for(int j = 0; j < class39_sub3_sub4_sub4.anInt1733; j++)
        {
            for(int k = 0; k < class39_sub3_sub4_sub4.anInt1732; k++)
                ai[k] = class39_sub3_sub4_sub4.anIntArray1731[(class39_sub3_sub4_sub4.anInt1732 - k - 1) + class39_sub3_sub4_sub4.anInt1732 * j];

            for(int l = 0; l < class39_sub3_sub4_sub4.anInt1732; l++)
                class39_sub3_sub4_sub4.anIntArray1731[l + class39_sub3_sub4_sub4.anInt1732 * j] = ai[l];

        }

        aClass14_1070.method207(-5281);
        class39_sub3_sub4_sub4.method528(382, 0, 1);
        aClass14_1071.method207(-5281);
        class39_sub3_sub4_sub4.method528(-255, 0, 1);
        aClass14_1067.method207(-5281);
        class39_sub3_sub4_sub4.method528(254, 0, 1);
        aClass14_1068.method207(-5281);
        class39_sub3_sub4_sub4.method528(180, -371, 1);
        aClass14_1069.method207(-5281);
        class39_sub3_sub4_sub4.method528(180, -171, 1);
        aClass14_1072.method207(-5281);
        class39_sub3_sub4_sub4.method528(382, -265, 1);
        aClass14_1073.method207(-5281);
        class39_sub3_sub4_sub4.method528(-180, -265, 1);
        aClass14_1074.method207(-5281);
        class39_sub3_sub4_sub4.method528(254, -171, 1);
        aClass14_1075.method207(-5281);
        class39_sub3_sub4_sub4.method528(-180, -171, 1);
        class39_sub3_sub4_sub4 = new Class39_Sub3_Sub4_Sub4(aClass10_1077, "logo", 0);
        aClass14_1067.method207(-5281);
        class39_sub3_sub4_sub4.method530(382 - class39_sub3_sub4_sub4.anInt1732 / 2 - 128, 22912, 18);
        class39_sub3_sub4_sub4 = null;
        abyte0 = null;
        ai = null;
        System.gc();
    }

    public static String method39(int i, int j)
    {
        String s = String.valueOf(j);
        for(int k = s.length() - 3; k > 0; k -= 3)
            s = s.substring(0, k) + "," + s.substring(k);

        i = 55 / i;
        if(s.length() > 8)
            s = "@gre@" + s.substring(0, s.length() - 8) + " million @whi@(" + s + ")";
        else
        if(s.length() > 4)
            s = "@cya@" + s.substring(0, s.length() - 4) + "K @whi@(" + s + ")";
        return " " + s;
    }

    public void parseTrackedNpcUpdateMasks(Buffer class39_sub3_sub3, int i, byte byte0)
    {
        if(byte0 != 5)
            return;
        for(int j = 0; j < anInt876; j++)
        {
            int k = anIntArray877[j];
            Class39_Sub3_Sub2_Sub5_Sub2 class39_sub3_sub2_sub5_sub2 = aClass39_Sub3_Sub2_Sub5_Sub2Array899[k];
            int l = class39_sub3_sub3.readUByte();
            if((l & 0x40) != 0)
            {
                class39_sub3_sub2_sub5_sub2.anInt1649 = class39_sub3_sub3.getLEShortA();
                class39_sub3_sub2_sub5_sub2.anInt1650 = class39_sub3_sub3.readShortLE();
            }
            if((l & 0x10) != 0)
            {
                int i1 = class39_sub3_sub3.readUByte();
                int i2 = class39_sub3_sub3.aClass5_1450.getUnsignedByteS(class39_sub3_sub3);
                class39_sub3_sub2_sub5_sub2.method416((byte)16, loopCycle, i1, i2);
                class39_sub3_sub2_sub5_sub2.anInt1593 = loopCycle + 300;
                class39_sub3_sub2_sub5_sub2.anInt1594 = class39_sub3_sub3.readUByte();
                class39_sub3_sub2_sub5_sub2.anInt1595 = class39_sub3_sub3.aClass5_1450.getUnsignedByteS(class39_sub3_sub3);
            }
            if((l & 4) != 0)
            {
                class39_sub3_sub2_sub5_sub2.aClass47_1772 = Class47.method598(class39_sub3_sub3.readShortLE());
                class39_sub3_sub2_sub5_sub2.anInt1608 = class39_sub3_sub2_sub5_sub2.aClass47_1772.aByte820;
                class39_sub3_sub2_sub5_sub2.anInt1609 = class39_sub3_sub2_sub5_sub2.aClass47_1772.anInt803;
                class39_sub3_sub2_sub5_sub2.anInt1644 = class39_sub3_sub2_sub5_sub2.aClass47_1772.anInt813;
                class39_sub3_sub2_sub5_sub2.anInt1645 = class39_sub3_sub2_sub5_sub2.aClass47_1772.anInt787;
                class39_sub3_sub2_sub5_sub2.anInt1646 = class39_sub3_sub2_sub5_sub2.aClass47_1772.anInt811;
                class39_sub3_sub2_sub5_sub2.anInt1647 = class39_sub3_sub2_sub5_sub2.aClass47_1772.anInt807;
                class39_sub3_sub2_sub5_sub2.anInt1640 = class39_sub3_sub2_sub5_sub2.aClass47_1772.anInt817;
            }
            if((l & 0x80) != 0)
            {
                class39_sub3_sub2_sub5_sub2.anInt1620 = class39_sub3_sub3.readShort();
                if(((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1620 == 65535)
                    class39_sub3_sub2_sub5_sub2.anInt1620 = -1;
            }
            if((l & 8) != 0)
            {
                int j1 = class39_sub3_sub3.readShortLE();
                if(j1 == 65535)
                    j1 = -1;
                int j2 = class39_sub3_sub3.getUnsignedByteC();
                if(j1 == ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1615 && j1 != -1)
                {
                    int l2 = SEQ.aClass20Array271[j1].anInt285;
                    if(l2 == 1)
                    {
                        class39_sub3_sub2_sub5_sub2.anInt1616 = 0;
                        class39_sub3_sub2_sub5_sub2.anInt1617 = 0;
                        class39_sub3_sub2_sub5_sub2.anInt1618 = j2;
                        class39_sub3_sub2_sub5_sub2.anInt1619 = 0;
                    }
                    if(l2 == 2)
                        class39_sub3_sub2_sub5_sub2.anInt1619 = 0;
                } else
                if(j1 == -1 || ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1615 == -1 || SEQ.aClass20Array271[j1].anInt279 >= SEQ.aClass20Array271[((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1615].anInt279)
                {
                    class39_sub3_sub2_sub5_sub2.anInt1615 = j1;
                    class39_sub3_sub2_sub5_sub2.anInt1616 = 0;
                    class39_sub3_sub2_sub5_sub2.anInt1617 = 0;
                    class39_sub3_sub2_sub5_sub2.anInt1618 = j2;
                    class39_sub3_sub2_sub5_sub2.anInt1619 = 0;
                    class39_sub3_sub2_sub5_sub2.anInt1614 = ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1604;
                }
            }
            if((l & 1) != 0)
            {
                class39_sub3_sub2_sub5_sub2.aString1605 = class39_sub3_sub3.getRs2String();
                class39_sub3_sub2_sub5_sub2.anInt1628 = 100;
            }
            if((l & 2) != 0)
            {
                int k1 = class39_sub3_sub3.aClass5_1450.getUnsignedByteS(class39_sub3_sub3);
                int k2 = class39_sub3_sub3.readUByte();
                class39_sub3_sub2_sub5_sub2.method416((byte)16, loopCycle, k1, k2);
                class39_sub3_sub2_sub5_sub2.anInt1593 = loopCycle + 300;
                class39_sub3_sub2_sub5_sub2.anInt1594 = class39_sub3_sub3.getUnsignedByteC();
                class39_sub3_sub2_sub5_sub2.anInt1595 = class39_sub3_sub3.aClass5_1450.getUnsignedByteS(class39_sub3_sub3);
            }
            if((l & 0x20) != 0)
            {
                class39_sub3_sub2_sub5_sub2.anInt1597 = class39_sub3_sub3.readShortLE();
                int l1 = class39_sub3_sub3.method469();
                class39_sub3_sub2_sub5_sub2.anInt1601 = l1 >> 16;
                class39_sub3_sub2_sub5_sub2.anInt1600 = loopCycle + (l1 & 0xffff);
                class39_sub3_sub2_sub5_sub2.anInt1598 = 0;
                class39_sub3_sub2_sub5_sub2.anInt1599 = 0;
                if(((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1600 > loopCycle)
                    class39_sub3_sub2_sub5_sub2.anInt1598 = -1;
                if(((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1597 == 65535)
                    class39_sub3_sub2_sub5_sub2.anInt1597 = -1;
            }
        }

    }

    public void method41(boolean flag)
    {
        if(anInt1332 != 0)
            return;
        aStringArray965[0] = "Cancel";
        anIntArray1122[0] = 1033;
        if(flag)
            method6();
        anInt903 = 1;
        if(anInt1161 != -1)
        {
            anInt1184 = 0;
            anInt987 = 0;
            method139(super.anInt24, 0, 0, 0, 0, 0, super.anInt23, RSInterface.getInterface(anInt1161));
            if(anInt1184 != anInt904)
                anInt904 = anInt1184;
            if(anInt987 != anInt1143)
                anInt1143 = anInt987;
            return;
        }
        method42((byte)5);
        anInt1184 = 0;
        anInt987 = 0;
        if(super.anInt23 > 4 && super.anInt24 > 4 && super.anInt23 < 516 && super.anInt24 < 338)
            if(anInt1113 != -1)
                method139(super.anInt24, 0, 4, 0, 4, 0, super.anInt23, RSInterface.getInterface(anInt1113));
            else
                method137(anInt886);
        if(anInt1184 != anInt904)
            anInt904 = anInt1184;
        if(anInt987 != anInt1143)
            anInt1143 = anInt987;
        anInt1184 = 0;
        anInt987 = 0;
        if(super.anInt23 > 553 && super.anInt24 > 205 && super.anInt23 < 743 && super.anInt24 < 466)
            if(anInt951 != -1)
                method139(super.anInt24, 0, 553, 0, 205, 1, super.anInt23, RSInterface.getInterface(anInt951));
            else
            if(tabInterfaceIds[tabId] != -1)
                method139(super.anInt24, 0, 553, 0, 205, 1, super.anInt23, RSInterface.getInterface(tabInterfaceIds[tabId]));
        if(anInt1184 != anInt1144)
        {
            needDrawTabArea = true;
            anInt1144 = anInt1184;
        }
        if(anInt987 != anInt1259)
        {
            needDrawTabArea = true;
            anInt1259 = anInt987;
        }
        anInt1184 = 0;
        anInt987 = 0;
        if(super.anInt23 > 17 && super.anInt24 > 357 && super.anInt23 < 496 && super.anInt24 < 453)
            if(anInt1208 != -1)
                method139(super.anInt24, 0, 17, 0, 357, 2, super.anInt23, RSInterface.getInterface(anInt1208));
            else
            if(anInt1106 != -1)
                method139(super.anInt24, 0, 17, 0, 357, 3, super.anInt23, RSInterface.getInterface(anInt1106));
            else
            if(super.anInt24 < 434 && super.anInt23 < 426 && anInt1169 == 0)
                method79(super.anInt24 - 357, (byte)2, super.anInt23 - 17);
        if((anInt1208 != -1 || anInt1106 != -1) && anInt1184 != anInt1154)
        {
            aBoolean993 = true;
            anInt1154 = anInt1184;
        }
        if((anInt1208 != -1 || anInt1106 != -1) && anInt987 != anInt1263)
        {
            aBoolean993 = true;
            anInt1263 = anInt987;
        }
        for(boolean flag1 = false; !flag1;)
        {
            flag1 = true;
            for(int i = 0; i < anInt903 - 1; i++)
                if(anIntArray1122[i] < 1000 && anIntArray1122[i + 1] > 1000)
                {
                    String s = aStringArray965[i];
                    aStringArray965[i] = aStringArray965[i + 1];
                    aStringArray965[i + 1] = s;
                    int j = anIntArray1122[i];
                    anIntArray1122[i] = anIntArray1122[i + 1];
                    anIntArray1122[i + 1] = j;
                    j = anIntArray1120[i];
                    anIntArray1120[i] = anIntArray1120[i + 1];
                    anIntArray1120[i + 1] = j;
                    j = anIntArray1121[i];
                    anIntArray1121[i] = anIntArray1121[i + 1];
                    anIntArray1121[i + 1] = j;
                    j = anIntArray1123[i];
                    anIntArray1123[i] = anIntArray1123[i + 1];
                    anIntArray1123[i + 1] = j;
                    flag1 = false;
                }

        }

    }

    public void method42(byte byte0)
    {
        if(byte0 == aByte851)
            byte0 = 0;
        else
            anInt967 = decrypter.getNextKey();
        if(anInt1056 == 0)
            return;
        int i = 0;
        if(anInt1237 != 0)
            i = 1;
        for(int j = 0; j < 100; j++)
            if(aStringArray1194[j] != null)
            {
                int k = anIntArray1192[j];
                String s = aStringArray1193[j];
                boolean flag = false;
                if(s != null && s.startsWith("@cr1@"))
                {
                    s = s.substring(5);
                    boolean flag1 = true;
                }
                if(s != null && s.startsWith("@cr2@"))
                {
                    s = s.substring(5);
                    byte byte1 = 2;
                }
                if((k == 3 || k == 7) && (k == 7 || anInt1103 == 0 || anInt1103 == 1 && method66(true, s)))
                {
                    int l = 329 - i * 13;
                    if(super.anInt23 > 4 && super.anInt24 - 4 > l - 10 && super.anInt24 - 4 <= l + 3)
                    {
                        int i1 = aClass39_Sub3_Sub4_Sub2_1098.method505(1, "From:  " + s + aStringArray1194[j]) + 25;
                        if(i1 > 450)
                            i1 = 450;
                        if(super.anInt23 < 4 + i1)
                        {
                            if(anInt1155 >= 1)
                            {
                                aStringArray965[anInt903] = "Report abuse @whi@" + s;
                                anIntArray1122[anInt903] = 2541;
                                anInt903++;
                            }
                            aStringArray965[anInt903] = "Add ignore @whi@" + s;
                            anIntArray1122[anInt903] = 2997;
                            anInt903++;
                            aStringArray965[anInt903] = "Add friend @whi@" + s;
                            anIntArray1122[anInt903] = 2138;
                            anInt903++;
                        }
                    }
                    if(++i >= 5)
                        return;
                }
                if((k == 5 || k == 6) && anInt1103 < 2 && ++i >= 5)
                    return;
            }

    }

    public void method43(byte byte0)
    {
        if(byte0 != 2)
            anInt1083 = decrypter.getNextKey();
        for(int i = 0; i < anInt900; i++)
        {
            int j = anIntArray901[i];
            Class39_Sub3_Sub2_Sub5_Sub2 class39_sub3_sub2_sub5_sub2 = aClass39_Sub3_Sub2_Sub5_Sub2Array899[j];
            if(class39_sub3_sub2_sub5_sub2 != null)
                method44(class39_sub3_sub2_sub5_sub2.aClass47_1772.aByte820, class39_sub3_sub2_sub5_sub2, 9);
        }

    }

    public void method44(int i, Class39_Sub3_Sub2_Sub5 class39_sub3_sub2_sub5, int j)
    {
        if(j < 9 || j > 9)
            anInt1092 = decrypter.getNextKey();
        if(class39_sub3_sub2_sub5.anInt1621 < 128 || class39_sub3_sub2_sub5.anInt1622 < 128 || class39_sub3_sub2_sub5.anInt1621 >= 13184 || class39_sub3_sub2_sub5.anInt1622 >= 13184)
        {
            class39_sub3_sub2_sub5.anInt1615 = -1;
            class39_sub3_sub2_sub5.anInt1597 = -1;
            class39_sub3_sub2_sub5.anInt1635 = 0;
            class39_sub3_sub2_sub5.anInt1636 = 0;
            class39_sub3_sub2_sub5.anInt1621 = class39_sub3_sub2_sub5.anIntArray1629[0] * 128 + class39_sub3_sub2_sub5.anInt1608 * 64;
            class39_sub3_sub2_sub5.anInt1622 = class39_sub3_sub2_sub5.anIntArray1630[0] * 128 + class39_sub3_sub2_sub5.anInt1608 * 64;
            class39_sub3_sub2_sub5.method417(926);
        }
        if(class39_sub3_sub2_sub5 == myPlayer && (class39_sub3_sub2_sub5.anInt1621 < 1536 || class39_sub3_sub2_sub5.anInt1622 < 1536 || class39_sub3_sub2_sub5.anInt1621 >= 11776 || class39_sub3_sub2_sub5.anInt1622 >= 11776))
        {
            class39_sub3_sub2_sub5.anInt1615 = -1;
            class39_sub3_sub2_sub5.anInt1597 = -1;
            class39_sub3_sub2_sub5.anInt1635 = 0;
            class39_sub3_sub2_sub5.anInt1636 = 0;
            class39_sub3_sub2_sub5.anInt1621 = class39_sub3_sub2_sub5.anIntArray1629[0] * 128 + class39_sub3_sub2_sub5.anInt1608 * 64;
            class39_sub3_sub2_sub5.anInt1622 = class39_sub3_sub2_sub5.anIntArray1630[0] * 128 + class39_sub3_sub2_sub5.anInt1608 * 64;
            class39_sub3_sub2_sub5.method417(926);
        }
        if(class39_sub3_sub2_sub5.anInt1635 > loopCycle)
            method45(true, class39_sub3_sub2_sub5);
        else
        if(class39_sub3_sub2_sub5.anInt1636 >= loopCycle)
            method46((byte)-36, class39_sub3_sub2_sub5);
        else
            method47(false, class39_sub3_sub2_sub5);
        method48((byte)28, class39_sub3_sub2_sub5);
        method49(0, class39_sub3_sub2_sub5);
    }

    public void method45(boolean flag, Class39_Sub3_Sub2_Sub5 class39_sub3_sub2_sub5)
    {
        int i = class39_sub3_sub2_sub5.anInt1635 - loopCycle;
        aBoolean952 &= flag;
        int j = class39_sub3_sub2_sub5.anInt1631 * 128 + class39_sub3_sub2_sub5.anInt1608 * 64;
        int k = class39_sub3_sub2_sub5.anInt1633 * 128 + class39_sub3_sub2_sub5.anInt1608 * 64;
        class39_sub3_sub2_sub5.anInt1621 += (j - class39_sub3_sub2_sub5.anInt1621) / i;
        class39_sub3_sub2_sub5.anInt1622 += (k - class39_sub3_sub2_sub5.anInt1622) / i;
        class39_sub3_sub2_sub5.anInt1602 = 0;
        if(class39_sub3_sub2_sub5.anInt1637 == 0)
            class39_sub3_sub2_sub5.anInt1627 = 1024;
        if(class39_sub3_sub2_sub5.anInt1637 == 1)
            class39_sub3_sub2_sub5.anInt1627 = 1536;
        if(class39_sub3_sub2_sub5.anInt1637 == 2)
            class39_sub3_sub2_sub5.anInt1627 = 0;
        if(class39_sub3_sub2_sub5.anInt1637 == 3)
            class39_sub3_sub2_sub5.anInt1627 = 512;
    }

    public void method46(byte byte0, Class39_Sub3_Sub2_Sub5 class39_sub3_sub2_sub5)
    {
        if(class39_sub3_sub2_sub5.anInt1636 == loopCycle || class39_sub3_sub2_sub5.anInt1615 == -1 || class39_sub3_sub2_sub5.anInt1618 != 0 || class39_sub3_sub2_sub5.anInt1617 + 1 > SEQ.aClass20Array271[class39_sub3_sub2_sub5.anInt1615].method220((byte)0, class39_sub3_sub2_sub5.anInt1616))
        {
            int i = class39_sub3_sub2_sub5.anInt1636 - class39_sub3_sub2_sub5.anInt1635;
            int j = loopCycle - class39_sub3_sub2_sub5.anInt1635;
            int k = class39_sub3_sub2_sub5.anInt1631 * 128 + class39_sub3_sub2_sub5.anInt1608 * 64;
            int l = class39_sub3_sub2_sub5.anInt1633 * 128 + class39_sub3_sub2_sub5.anInt1608 * 64;
            int i1 = class39_sub3_sub2_sub5.anInt1632 * 128 + class39_sub3_sub2_sub5.anInt1608 * 64;
            int j1 = class39_sub3_sub2_sub5.anInt1634 * 128 + class39_sub3_sub2_sub5.anInt1608 * 64;
            class39_sub3_sub2_sub5.anInt1621 = (k * (i - j) + i1 * j) / i;
            class39_sub3_sub2_sub5.anInt1622 = (l * (i - j) + j1 * j) / i;
        }
        class39_sub3_sub2_sub5.anInt1602 = 0;
        if(byte0 != -36)
            aClass5ArrayArrayArray950 = null;
        if(class39_sub3_sub2_sub5.anInt1637 == 0)
            class39_sub3_sub2_sub5.anInt1627 = 1024;
        if(class39_sub3_sub2_sub5.anInt1637 == 1)
            class39_sub3_sub2_sub5.anInt1627 = 1536;
        if(class39_sub3_sub2_sub5.anInt1637 == 2)
            class39_sub3_sub2_sub5.anInt1627 = 0;
        if(class39_sub3_sub2_sub5.anInt1637 == 3)
            class39_sub3_sub2_sub5.anInt1627 = 512;
        class39_sub3_sub2_sub5.anInt1623 = class39_sub3_sub2_sub5.anInt1627;
    }

    public void method47(boolean flag, Class39_Sub3_Sub2_Sub5 class39_sub3_sub2_sub5)
    {
        class39_sub3_sub2_sub5.anInt1624 = class39_sub3_sub2_sub5.anInt1640;
        if(class39_sub3_sub2_sub5.anInt1604 == 0)
        {
            class39_sub3_sub2_sub5.anInt1602 = 0;
            return;
        }
        if(class39_sub3_sub2_sub5.anInt1615 != -1 && class39_sub3_sub2_sub5.anInt1618 == 0)
        {
            SEQ class20 = SEQ.aClass20Array271[class39_sub3_sub2_sub5.anInt1615];
            if(class39_sub3_sub2_sub5.anInt1614 > 0 && class20.anInt283 == 0)
            {
                class39_sub3_sub2_sub5.anInt1602++;
                return;
            }
            if(class39_sub3_sub2_sub5.anInt1614 <= 0 && class20.anInt284 == 0)
            {
                class39_sub3_sub2_sub5.anInt1602++;
                return;
            }
        }
        int i = class39_sub3_sub2_sub5.anInt1621;
        int j = class39_sub3_sub2_sub5.anInt1622;
        int k = class39_sub3_sub2_sub5.anIntArray1629[class39_sub3_sub2_sub5.anInt1604 - 1] * 128 + class39_sub3_sub2_sub5.anInt1608 * 64;
        int l = class39_sub3_sub2_sub5.anIntArray1630[class39_sub3_sub2_sub5.anInt1604 - 1] * 128 + class39_sub3_sub2_sub5.anInt1608 * 64;
        if(k - i > 256 || k - i < -256 || l - j > 256 || l - j < -256)
        {
            class39_sub3_sub2_sub5.anInt1621 = k;
            class39_sub3_sub2_sub5.anInt1622 = l;
            return;
        }
        if(i < k)
        {
            if(j < l)
                class39_sub3_sub2_sub5.anInt1627 = 1280;
            else
            if(j > l)
                class39_sub3_sub2_sub5.anInt1627 = 1792;
            else
                class39_sub3_sub2_sub5.anInt1627 = 1536;
        } else
        if(i > k)
        {
            if(j < l)
                class39_sub3_sub2_sub5.anInt1627 = 768;
            else
            if(j > l)
                class39_sub3_sub2_sub5.anInt1627 = 256;
            else
                class39_sub3_sub2_sub5.anInt1627 = 512;
        } else
        if(j < l)
            class39_sub3_sub2_sub5.anInt1627 = 1024;
        else
            class39_sub3_sub2_sub5.anInt1627 = 0;
        int i1 = class39_sub3_sub2_sub5.anInt1627 - class39_sub3_sub2_sub5.anInt1623 & 0x7ff;
        if(i1 > 1024)
            i1 -= 2048;
        int j1 = class39_sub3_sub2_sub5.anInt1645;
        if(i1 >= -256 && i1 <= 256)
            j1 = class39_sub3_sub2_sub5.anInt1644;
        else
        if(i1 >= 256 && i1 < 768)
            j1 = class39_sub3_sub2_sub5.anInt1647;
        else
        if(i1 >= -768 && i1 <= -256)
            j1 = class39_sub3_sub2_sub5.anInt1646;
        if(j1 == -1)
            j1 = class39_sub3_sub2_sub5.anInt1644;
        class39_sub3_sub2_sub5.anInt1624 = j1;
        if(flag)
            anInt889 = -176;
        int k1 = 4;
        if(class39_sub3_sub2_sub5.anInt1623 != class39_sub3_sub2_sub5.anInt1627 && class39_sub3_sub2_sub5.anInt1620 == -1 && class39_sub3_sub2_sub5.anInt1609 != 0)
            k1 = 2;
        if(class39_sub3_sub2_sub5.anInt1604 > 2)
            k1 = 6;
        if(class39_sub3_sub2_sub5.anInt1604 > 3)
            k1 = 8;
        if(class39_sub3_sub2_sub5.anInt1602 > 0 && class39_sub3_sub2_sub5.anInt1604 > 1)
        {
            k1 = 8;
            class39_sub3_sub2_sub5.anInt1602--;
        }
        if(class39_sub3_sub2_sub5.aBooleanArray1613[class39_sub3_sub2_sub5.anInt1604 - 1])
            k1 <<= 1;
        if(k1 >= 8 && class39_sub3_sub2_sub5.anInt1624 == class39_sub3_sub2_sub5.anInt1644 && class39_sub3_sub2_sub5.anInt1603 != -1)
            class39_sub3_sub2_sub5.anInt1624 = class39_sub3_sub2_sub5.anInt1603;
        if(i < k)
        {
            class39_sub3_sub2_sub5.anInt1621 += k1;
            if(class39_sub3_sub2_sub5.anInt1621 > k)
                class39_sub3_sub2_sub5.anInt1621 = k;
        } else
        if(i > k)
        {
            class39_sub3_sub2_sub5.anInt1621 -= k1;
            if(class39_sub3_sub2_sub5.anInt1621 < k)
                class39_sub3_sub2_sub5.anInt1621 = k;
        }
        if(j < l)
        {
            class39_sub3_sub2_sub5.anInt1622 += k1;
            if(class39_sub3_sub2_sub5.anInt1622 > l)
                class39_sub3_sub2_sub5.anInt1622 = l;
        } else
        if(j > l)
        {
            class39_sub3_sub2_sub5.anInt1622 -= k1;
            if(class39_sub3_sub2_sub5.anInt1622 < l)
                class39_sub3_sub2_sub5.anInt1622 = l;
        }
        if(class39_sub3_sub2_sub5.anInt1621 == k && class39_sub3_sub2_sub5.anInt1622 == l)
        {
            class39_sub3_sub2_sub5.anInt1604--;
            if(class39_sub3_sub2_sub5.anInt1614 > 0)
                class39_sub3_sub2_sub5.anInt1614--;
        }
    }

    public void method48(byte byte0, Class39_Sub3_Sub2_Sub5 class39_sub3_sub2_sub5)
    {
        if(byte0 != aByte1197)
            return;
        if(class39_sub3_sub2_sub5.anInt1609 == 0)
            return;
        if(class39_sub3_sub2_sub5.anInt1620 != -1 && class39_sub3_sub2_sub5.anInt1620 < 32768)
        {
            Class39_Sub3_Sub2_Sub5_Sub2 class39_sub3_sub2_sub5_sub2 = aClass39_Sub3_Sub2_Sub5_Sub2Array899[class39_sub3_sub2_sub5.anInt1620];
            if(class39_sub3_sub2_sub5_sub2 != null)
            {
                int l = class39_sub3_sub2_sub5.anInt1621 - ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1621;
                int j1 = class39_sub3_sub2_sub5.anInt1622 - ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1622;
                if(l != 0 || j1 != 0)
                    class39_sub3_sub2_sub5.anInt1627 = (int)(Math.atan2(l, j1) * 325.94900000000001D) & 0x7ff;
            }
        }
        if(class39_sub3_sub2_sub5.anInt1620 >= 32768)
        {
            int i = class39_sub3_sub2_sub5.anInt1620 - 32768;
            if(i == anInt1282)
                i = myPlayerIndex;
            Player player = players[i];
            if(player != null)
            {
                int k1 = class39_sub3_sub2_sub5.anInt1621 - ((Class39_Sub3_Sub2_Sub5) (player)).anInt1621;
                int l1 = class39_sub3_sub2_sub5.anInt1622 - ((Class39_Sub3_Sub2_Sub5) (player)).anInt1622;
                if(k1 != 0 || l1 != 0)
                    class39_sub3_sub2_sub5.anInt1627 = (int)(Math.atan2(k1, l1) * 325.94900000000001D) & 0x7ff;
            }
        }
        if((class39_sub3_sub2_sub5.anInt1649 != 0 || class39_sub3_sub2_sub5.anInt1650 != 0) && (class39_sub3_sub2_sub5.anInt1604 == 0 || class39_sub3_sub2_sub5.anInt1602 > 0))
        {
            int j = class39_sub3_sub2_sub5.anInt1621 - (class39_sub3_sub2_sub5.anInt1649 - anInt989 - anInt989) * 64;
            int i1 = class39_sub3_sub2_sub5.anInt1622 - (class39_sub3_sub2_sub5.anInt1650 - anInt990 - anInt990) * 64;
            if(j != 0 || i1 != 0)
                class39_sub3_sub2_sub5.anInt1627 = (int)(Math.atan2(j, i1) * 325.94900000000001D) & 0x7ff;
            class39_sub3_sub2_sub5.anInt1649 = 0;
            class39_sub3_sub2_sub5.anInt1650 = 0;
        }
        int k = class39_sub3_sub2_sub5.anInt1627 - class39_sub3_sub2_sub5.anInt1623 & 0x7ff;
        if(k != 0)
        {
            if(k < class39_sub3_sub2_sub5.anInt1609 || k > 2048 - class39_sub3_sub2_sub5.anInt1609)
                class39_sub3_sub2_sub5.anInt1623 = class39_sub3_sub2_sub5.anInt1627;
            else
            if(k > 1024)
                class39_sub3_sub2_sub5.anInt1623 -= class39_sub3_sub2_sub5.anInt1609;
            else
                class39_sub3_sub2_sub5.anInt1623 += class39_sub3_sub2_sub5.anInt1609;
            class39_sub3_sub2_sub5.anInt1623 &= 0x7ff;
            if(class39_sub3_sub2_sub5.anInt1624 == class39_sub3_sub2_sub5.anInt1640 && class39_sub3_sub2_sub5.anInt1623 != class39_sub3_sub2_sub5.anInt1627)
            {
                if(class39_sub3_sub2_sub5.anInt1641 != -1)
                {
                    class39_sub3_sub2_sub5.anInt1624 = class39_sub3_sub2_sub5.anInt1641;
                    return;
                }
                class39_sub3_sub2_sub5.anInt1624 = class39_sub3_sub2_sub5.anInt1644;
            }
        }
    }

    public void method49(int i, Class39_Sub3_Sub2_Sub5 class39_sub3_sub2_sub5)
    {
        opcodeSize += i;
        class39_sub3_sub2_sub5.aBoolean1592 = false;
        if(class39_sub3_sub2_sub5.anInt1624 != -1)
        {
            SEQ class20 = SEQ.aClass20Array271[class39_sub3_sub2_sub5.anInt1624];
            class39_sub3_sub2_sub5.anInt1626++;
            if(class39_sub3_sub2_sub5.anInt1625 < class20.anInt272 && class39_sub3_sub2_sub5.anInt1626 > class20.method220((byte)0, class39_sub3_sub2_sub5.anInt1625))
            {
                class39_sub3_sub2_sub5.anInt1626 = 0;
                class39_sub3_sub2_sub5.anInt1625++;
            }
            if(class39_sub3_sub2_sub5.anInt1625 >= class20.anInt272)
            {
                class39_sub3_sub2_sub5.anInt1626 = 0;
                class39_sub3_sub2_sub5.anInt1625 = 0;
            }
        }
        if(class39_sub3_sub2_sub5.anInt1597 != -1 && loopCycle >= class39_sub3_sub2_sub5.anInt1600)
        {
            if(class39_sub3_sub2_sub5.anInt1598 < 0)
                class39_sub3_sub2_sub5.anInt1598 = 0;
            SEQ class20_1 = SpotAnim.aClass11Array188[class39_sub3_sub2_sub5.anInt1597].aClass20_192;
            for(class39_sub3_sub2_sub5.anInt1599++; class39_sub3_sub2_sub5.anInt1598 < class20_1.anInt272 && class39_sub3_sub2_sub5.anInt1599 > class20_1.method220((byte)0, class39_sub3_sub2_sub5.anInt1598); class39_sub3_sub2_sub5.anInt1598++)
                class39_sub3_sub2_sub5.anInt1599 -= class20_1.method220((byte)0, class39_sub3_sub2_sub5.anInt1598);

            if(class39_sub3_sub2_sub5.anInt1598 >= class20_1.anInt272 && (class39_sub3_sub2_sub5.anInt1598 < 0 || class39_sub3_sub2_sub5.anInt1598 >= class20_1.anInt272))
                class39_sub3_sub2_sub5.anInt1597 = -1;
        }
        if(class39_sub3_sub2_sub5.anInt1615 != -1 && class39_sub3_sub2_sub5.anInt1618 <= 1)
        {
            SEQ class20_2 = SEQ.aClass20Array271[class39_sub3_sub2_sub5.anInt1615];
            if(class20_2.anInt283 == 1 && class39_sub3_sub2_sub5.anInt1614 > 0 && class39_sub3_sub2_sub5.anInt1635 <= loopCycle && class39_sub3_sub2_sub5.anInt1636 < loopCycle)
            {
                class39_sub3_sub2_sub5.anInt1618 = 1;
                return;
            }
        }
        if(class39_sub3_sub2_sub5.anInt1615 != -1 && class39_sub3_sub2_sub5.anInt1618 == 0)
        {
            SEQ class20_3 = SEQ.aClass20Array271[class39_sub3_sub2_sub5.anInt1615];
            for(class39_sub3_sub2_sub5.anInt1617++; class39_sub3_sub2_sub5.anInt1616 < class20_3.anInt272 && class39_sub3_sub2_sub5.anInt1617 > class20_3.method220((byte)0, class39_sub3_sub2_sub5.anInt1616); class39_sub3_sub2_sub5.anInt1616++)
                class39_sub3_sub2_sub5.anInt1617 -= class20_3.method220((byte)0, class39_sub3_sub2_sub5.anInt1616);

            if(class39_sub3_sub2_sub5.anInt1616 >= class20_3.anInt272)
            {
                class39_sub3_sub2_sub5.anInt1616 -= class20_3.anInt276;
                class39_sub3_sub2_sub5.anInt1619++;
                if(class39_sub3_sub2_sub5.anInt1619 >= class20_3.anInt282)
                    class39_sub3_sub2_sub5.anInt1615 = -1;
                if(class39_sub3_sub2_sub5.anInt1616 < 0 || class39_sub3_sub2_sub5.anInt1616 >= class20_3.anInt272)
                    class39_sub3_sub2_sub5.anInt1615 = -1;
            }
            class39_sub3_sub2_sub5.aBoolean1592 = class20_3.aBoolean278;
        }
        if(class39_sub3_sub2_sub5.anInt1618 > 0)
            class39_sub3_sub2_sub5.anInt1618--;
    }

    public void method50(byte byte0)
    {
        if(anInt1161 != -1 && (anInt1203 == 2 || super.aClass14_16 != null))
        {
            if(anInt1203 == 2)
            {
                method51(anInt1111, anInt1161, anInt1268);
                if(anInt846 != -1)
                    method51(anInt1111, anInt846, anInt1268);
                anInt1111 = 0;
                method87(226);
                super.aClass14_16.method207(-5281);
                Class39_Sub3_Sub4_Sub1.anIntArray1680 = anIntArray1318;
                Class39_Sub3_Sub4.method476(false);
                aBoolean1148 = true;
                RSInterface class34 = RSInterface.getInterface(anInt1161);
                if(class34.anInt595 == 512 && class34.anInt610 == 334 && class34.anInt638 == 0)
                {
                    class34.anInt595 = 765;
                    class34.anInt610 = 503;
                }
                method101(-7410, 0, 0, class34, 0);
                if(anInt846 != -1)
                {
                    RSInterface class34_1 = RSInterface.getInterface(anInt846);
                    if(class34_1.anInt595 == 512 && class34_1.anInt610 == 334 && class34_1.anInt638 == 0)
                    {
                        class34_1.anInt595 = 765;
                        class34_1.anInt610 = 503;
                    }
                    method101(-7410, 0, 0, class34_1, 0);
                }
                if(!aBoolean1293)
                {
                    method41(false);
                    method77(aByte1231);
                } else
                {
                    method126(true);
                }
            }
            super.aClass14_16.method208(super.graphics, 966, 0, 0);
            return;
        }
        if(aBoolean1148)
        {
            method89(358);
            aBoolean1148 = false;
            aClass14_1244.method208(super.graphics, 966, 4, 0);
            aClass14_1245.method208(super.graphics, 966, 357, 0);
            aClass14_1246.method208(super.graphics, 966, 4, 722);
            aClass14_1247.method208(super.graphics, 966, 205, 743);
            aClass14_1248.method208(super.graphics, 966, 0, 0);
            aClass14_1249.method208(super.graphics, 966, 4, 516);
            aClass14_1250.method208(super.graphics, 966, 205, 516);
            aClass14_1251.method208(super.graphics, 966, 357, 496);
            aClass14_1252.method208(super.graphics, 966, 338, 0);
            needDrawTabArea = true;
            aBoolean993 = true;
            aBoolean1188 = true;
            aBoolean887 = true;
            if(anInt1203 != 2)
            {
                aClass14_844.method208(super.graphics, 966, 4, 4);
                aClass14_843.method208(super.graphics, 966, 4, 550);
            }
        }
        if(anInt1203 == 2)
            method96(-15737);
        if(aBoolean1293 && anInt1253 == 1)
            needDrawTabArea = true;
        if(anInt951 != -1)
        {
            boolean flag = method51(anInt1111, anInt951, anInt1268);
            if(flag)
                needDrawTabArea = true;
        }
        if(anInt963 == 2)
            needDrawTabArea = true;
        if(anInt1332 == 2)
            needDrawTabArea = true;
        if(needDrawTabArea)
        {
            method149(42590);
            needDrawTabArea = false;
        }
        if(anInt1208 == -1 && anInt1169 == 0)
        {
            aClass34_1181.anInt609 = anInt1118 - anInt948 - 77;
            if(super.anInt23 > 448 && super.anInt23 < 560 && super.anInt24 > 332)
                method26(-333, 77, super.anInt23 - 17, anInt1118, 463, aClass34_1181, super.anInt24 - 357, 0, -1);
            int i = anInt1118 - 77 - aClass34_1181.anInt609;
            if(i < 0)
                i = 0;
            if(i > anInt1118 - 77)
                i = anInt1118 - 77;
            if(anInt948 != i)
            {
                anInt948 = i;
                aBoolean993 = true;
            }
        }
        if(anInt1208 == -1 && anInt1169 == 3)
        {
            int j = anInt997 * 14 + 7;
            aClass34_1181.anInt609 = anInt1000;
            if(super.anInt23 > 448 && super.anInt23 < 560 && super.anInt24 > 332)
                method26(-333, 77, super.anInt23 - 17, j, 463, aClass34_1181, super.anInt24 - 357, 0, -1);
            int k = aClass34_1181.anInt609;
            if(k < 0)
                k = 0;
            if(k > j - 77)
                k = j - 77;
            if(anInt1000 != k)
            {
                anInt1000 = k;
                aBoolean993 = true;
            }
        }
        if(anInt1208 != -1)
        {
            boolean flag1 = method51(anInt1111, anInt1208, anInt1268);
            if(flag1)
                aBoolean993 = true;
        }
        if(anInt963 == 3)
            aBoolean993 = true;
        if(anInt1332 == 3)
            aBoolean993 = true;
        if(aString1131 != null)
            aBoolean993 = true;
        if(aBoolean1293 && anInt1253 == 2)
            aBoolean993 = true;
        if(aBoolean993)
        {
            method32(0);
            aBoolean993 = false;
        }
        if(anInt1203 == 2)
        {
            method95((byte)9);
            aClass14_843.method208(super.graphics, 966, 4, 550);
        }
        if(anInt1019 != -1)
            aBoolean1188 = true;
        if(aBoolean1188)
        {
            if(anInt1019 != -1 && anInt1019 == tabId)
            {
                anInt1019 = -1;
                outgoingVector.writeOpcode(218);
                outgoingVector.putByte(tabId);
            }
            aBoolean1188 = false;
            aClass14_1242.method207(-5281);
            aClass39_Sub3_Sub4_Sub3_986.method523(0, 22912, 0);
            if(anInt951 == -1)
            {
                if(tabInterfaceIds[tabId] != -1)
                {
                    if(tabId == 0)
                        aClass39_Sub3_Sub4_Sub3_1138.method523(22, 22912, 10);
                    if(tabId == 1)
                        aClass39_Sub3_Sub4_Sub3_1139.method523(54, 22912, 8);
                    if(tabId == 2)
                        aClass39_Sub3_Sub4_Sub3_1139.method523(82, 22912, 8);
                    if(tabId == 3)
                        aClass39_Sub3_Sub4_Sub3_1140.method523(110, 22912, 8);
                    if(tabId == 4)
                        aClass39_Sub3_Sub4_Sub3_1142.method523(153, 22912, 8);
                    if(tabId == 5)
                        aClass39_Sub3_Sub4_Sub3_1142.method523(181, 22912, 8);
                    if(tabId == 6)
                        aClass39_Sub3_Sub4_Sub3_1141.method523(209, 22912, 9);
                }
                if(tabInterfaceIds[0] != -1 && (anInt1019 != 0 || loopCycle % 20 < 10))
                    aClass39_Sub3_Sub4_Sub3Array869[0].method523(29, 22912, 13);
                if(tabInterfaceIds[1] != -1 && (anInt1019 != 1 || loopCycle % 20 < 10))
                    aClass39_Sub3_Sub4_Sub3Array869[1].method523(53, 22912, 11);
                if(tabInterfaceIds[2] != -1 && (anInt1019 != 2 || loopCycle % 20 < 10))
                    aClass39_Sub3_Sub4_Sub3Array869[2].method523(82, 22912, 11);
                if(tabInterfaceIds[3] != -1 && (anInt1019 != 3 || loopCycle % 20 < 10))
                    aClass39_Sub3_Sub4_Sub3Array869[3].method523(115, 22912, 12);
                if(tabInterfaceIds[4] != -1 && (anInt1019 != 4 || loopCycle % 20 < 10))
                    aClass39_Sub3_Sub4_Sub3Array869[4].method523(153, 22912, 13);
                if(tabInterfaceIds[5] != -1 && (anInt1019 != 5 || loopCycle % 20 < 10))
                    aClass39_Sub3_Sub4_Sub3Array869[5].method523(180, 22912, 11);
                if(tabInterfaceIds[6] != -1 && (anInt1019 != 6 || loopCycle % 20 < 10))
                    aClass39_Sub3_Sub4_Sub3Array869[6].method523(208, 22912, 13);
            }
            aClass14_1242.method208(super.graphics, 966, 160, 516);
            aClass14_1241.method207(-5281);
            aClass39_Sub3_Sub4_Sub3_985.method523(0, 22912, 0);
            if(anInt951 == -1)
            {
                if(tabInterfaceIds[tabId] != -1)
                {
                    if(tabId == 7)
                        aClass39_Sub3_Sub4_Sub3_1277.method523(42, 22912, 0);
                    if(tabId == 8)
                        aClass39_Sub3_Sub4_Sub3_1278.method523(74, 22912, 0);
                    if(tabId == 9)
                        aClass39_Sub3_Sub4_Sub3_1278.method523(102, 22912, 0);
                    if(tabId == 10)
                        aClass39_Sub3_Sub4_Sub3_1279.method523(130, 22912, 1);
                    if(tabId == 11)
                        aClass39_Sub3_Sub4_Sub3_1281.method523(173, 22912, 0);
                    if(tabId == 12)
                        aClass39_Sub3_Sub4_Sub3_1281.method523(201, 22912, 0);
                    if(tabId == 13)
                        aClass39_Sub3_Sub4_Sub3_1280.method523(229, 22912, 0);
                }
                if(tabInterfaceIds[8] != -1 && (anInt1019 != 8 || loopCycle % 20 < 10))
                    aClass39_Sub3_Sub4_Sub3Array869[7].method523(74, 22912, 2);
                if(tabInterfaceIds[9] != -1 && (anInt1019 != 9 || loopCycle % 20 < 10))
                    aClass39_Sub3_Sub4_Sub3Array869[8].method523(102, 22912, 3);
                if(tabInterfaceIds[10] != -1 && (anInt1019 != 10 || loopCycle % 20 < 10))
                    aClass39_Sub3_Sub4_Sub3Array869[9].method523(137, 22912, 4);
                if(tabInterfaceIds[11] != -1 && (anInt1019 != 11 || loopCycle % 20 < 10))
                    aClass39_Sub3_Sub4_Sub3Array869[10].method523(174, 22912, 2);
                if(tabInterfaceIds[12] != -1 && (anInt1019 != 12 || loopCycle % 20 < 10))
                    aClass39_Sub3_Sub4_Sub3Array869[11].method523(201, 22912, 2);
                if(tabInterfaceIds[13] != -1 && (anInt1019 != 13 || loopCycle % 20 < 10))
                    aClass39_Sub3_Sub4_Sub3Array869[12].method523(226, 22912, 2);
            }
            aClass14_1241.method208(super.graphics, 966, 466, 496);
            aClass14_844.method207(-5281);
            Class39_Sub3_Sub4_Sub1.anIntArray1680 = anIntArray1317;
        }
        if(aBoolean887)
        {
            aBoolean887 = false;
            aClass14_1240.method207(-5281);
            aClass39_Sub3_Sub4_Sub3_984.method523(0, 22912, 0);
            aClass39_Sub3_Sub4_Sub2_1098.method504(28, 0xffffff, 0, true, 55, "Public chat");
            if(anInt995 == 0)
                aClass39_Sub3_Sub4_Sub2_1098.method504(41, 65280, 0, true, 55, "On");
            if(anInt995 == 1)
                aClass39_Sub3_Sub4_Sub2_1098.method504(41, 0xffff00, 0, true, 55, "Friends");
            if(anInt995 == 2)
                aClass39_Sub3_Sub4_Sub2_1098.method504(41, 0xff0000, 0, true, 55, "Off");
            if(anInt995 == 3)
                aClass39_Sub3_Sub4_Sub2_1098.method504(41, 65535, 0, true, 55, "Hide");
            aClass39_Sub3_Sub4_Sub2_1098.method504(28, 0xffffff, 0, true, 184, "Private chat");
            if(anInt1103 == 0)
                aClass39_Sub3_Sub4_Sub2_1098.method504(41, 65280, 0, true, 184, "On");
            if(anInt1103 == 1)
                aClass39_Sub3_Sub4_Sub2_1098.method504(41, 0xffff00, 0, true, 184, "Friends");
            if(anInt1103 == 2)
                aClass39_Sub3_Sub4_Sub2_1098.method504(41, 0xff0000, 0, true, 184, "Off");
            aClass39_Sub3_Sub4_Sub2_1098.method504(28, 0xffffff, 0, true, 324, "Trade/compete");
            if(anInt1195 == 0)
                aClass39_Sub3_Sub4_Sub2_1098.method504(41, 65280, 0, true, 324, "On");
            if(anInt1195 == 1)
                aClass39_Sub3_Sub4_Sub2_1098.method504(41, 0xffff00, 0, true, 324, "Friends");
            if(anInt1195 == 2)
                aClass39_Sub3_Sub4_Sub2_1098.method504(41, 0xff0000, 0, true, 324, "Off");
            aClass39_Sub3_Sub4_Sub2_1098.method504(33, 0xffffff, 0, true, 458, "Report abuse");
            aClass14_1240.method208(super.graphics, 966, 453, 0);
            aClass14_844.method207(-5281);
            Class39_Sub3_Sub4_Sub1.anIntArray1680 = anIntArray1317;
        }
        anInt1111 = 0;
        if(byte0 == 4)
        {
            byte0 = 0;
            return;
        } else
        {
            currentOpcode = incommingVector.readUByte();
            return;
        }
    }

    public boolean method51(int i, int j, int k)
    {
        boolean flag = false;
        RSInterface class34 = RSInterface.getInterface(j);
        for(int l = 0; l < class34.anIntArray650.length; l++)
        {
            if(class34.anIntArray650[l] == -1)
                break;
            RSInterface class34_1 = RSInterface.getInterface(class34.anIntArray650[l]);
            if(class34_1.anInt638 == 0)
                flag |= method51(i, class34_1.anInt620, anInt1268);
            if(class34_1.anInt638 == 6 && (class34_1.anInt589 != -1 || class34_1.anInt590 != -1))
            {
                boolean flag1 = method135(285, class34_1);
                int j1;
                if(flag1)
                    j1 = class34_1.anInt590;
                else
                    j1 = class34_1.anInt589;
                if(j1 != -1)
                {
                    SEQ class20 = SEQ.aClass20Array271[j1];
                    for(class34_1.anInt587 += i; class34_1.anInt587 > class20.method220((byte)0, class34_1.anInt649);)
                    {
                        class34_1.anInt587 -= class20.method220((byte)0, class34_1.anInt649) + 1;
                        class34_1.anInt649++;
                        if(class34_1.anInt649 >= class20.anInt272)
                        {
                            class34_1.anInt649 -= class20.anInt276;
                            if(class34_1.anInt649 < 0 || class34_1.anInt649 >= class20.anInt272)
                                class34_1.anInt649 = 0;
                        }
                        flag = true;
                    }

                }
            }
            if(class34_1.anInt638 == 6 && class34_1.anInt635 != 0)
            {
                int i1 = class34_1.anInt635 >> 16;
                int k1 = (class34_1.anInt635 << 16) >> 16;
                i1 *= i;
                k1 *= i;
                class34_1.anInt618 = class34_1.anInt618 + i1 & 0x7ff;
                class34_1.anInt619 = class34_1.anInt619 + k1 & 0x7ff;
                flag = true;
            }
        }

        if(k != -1109)
            currentOpcode = -1;
        return flag;
    }

    public void method52(int i)
    {
        Class39_Sub1 class39_sub1 = (Class39_Sub1)aClass5_994.method185();
        if(i != 29760)
        {
            for(int j = 1; j > 0; j++);
        }
        for(; class39_sub1 != null; class39_sub1 = (Class39_Sub1)aClass5_994.method187((byte)8))
            if(class39_sub1.anInt1388 == -1)
            {
                class39_sub1.anInt1389 = 0;
                method116(class39_sub1, 0);
            } else
            {
                class39_sub1.method376();
            }

    }

    public void method53(byte byte0)
    {
        try
        {
            anInt1306 = -1;
            aClass5_1305.method189();
            aClass5_1311.method189();
            anInt1207++;
            if(anInt1207 > 118)
            {
                anInt1207 = 0;
                outgoingVector.writeOpcode(110);
                outgoingVector.putByte(183);
            }
            Class39_Sub3_Sub4_Sub1.method488(0);
            method83(-751);
            aClass31_868.method291(true);
            System.gc();
            for(int i = 0; i < 4; i++)
                aClass3Array964[i].method157();

            for(int l = 0; l < 4; l++)
            {
                for(int k1 = 0; k1 < 104; k1++)
                { 
                    for(int j2 = 0; j2 < 104; j2++)
                        aByteArrayArrayArray1076[l][k1][j2] = 0;

                }

            }

            Class22 class22 = new Class22((byte)102, 104, 104, aByteArrayArrayArray1076, anIntArrayArrayArray1179);
            int k2 = aByteArrayArray1239.length;
            outgoingVector.writeOpcode(30);
            if(!aBoolean1102)
            {
                for(int i3 = 0; i3 < k2; i3++)
                {
                    int i4 = (anIntArray936[i3] >> 8) * 64 - anInt989;
                    int k5 = (anIntArray936[i3] & 0xff) * 64 - anInt990;
                    byte abyte0[] = aByteArrayArray1239[i3];
                    if(abyte0 != null)
                        class22.method262(i4, 6, (anInt1089 - 6) * 8, k5, aClass3Array964, abyte0, (anInt1088 - 6) * 8);
                }

                for(int j4 = 0; j4 < k2; j4++)
                {
                    int l5 = (anIntArray936[j4] >> 8) * 64 - anInt989;
                    int k7 = (anIntArray936[j4] & 0xff) * 64 - anInt990;
                    byte abyte2[] = aByteArrayArray1239[j4];
                    if(abyte2 == null && anInt1089 < 800)
                        class22.method257(64, k7, 64, (byte)1, l5);
                }

                anInt894++;
                if(anInt894 > 155)
                {
                    anInt894 = 0;
                    outgoingVector.writeOpcode(160);
                    outgoingVector.putTribyte(0x132620);
                }
                outgoingVector.writeOpcode(30);
                for(int i6 = 0; i6 < k2; i6++)
                {
                    byte abyte1[] = aByteArrayArray1167[i6];
                    if(abyte1 != null)
                    {
                        int k8 = (anIntArray936[i6] >> 8) * 64 - anInt989;
                        int j9 = (anIntArray936[i6] & 0xff) * 64 - anInt990;
                        class22.method252(abyte1, j9, true, k8, aClass31_868, aClass3Array964);
                    }
                }

            }
            if(aBoolean1102)
            {
                for(int j3 = 0; j3 < 4; j3++)
                {
                    for(int k4 = 0; k4 < 13; k4++)
                    {
                        for(int j6 = 0; j6 < 13; j6++)
                        {
                            boolean flag = false;
                            int l8 = anIntArrayArrayArray1061[j3][k4][j6];
                            if(l8 != -1)
                            {
                                int k9 = l8 >> 24 & 3;
                                int i10 = l8 >> 1 & 3;
                                int k10 = l8 >> 14 & 0x3ff;
                                int i11 = l8 >> 3 & 0x7ff;
                                int k11 = (k10 / 8 << 8) + i11 / 8;
                                for(int i12 = 0; i12 < anIntArray936.length; i12++)
                                {
                                    if(anIntArray936[i12] != k11 || aByteArrayArray1239[i12] == null)
                                        continue;
                                    class22.method245(k4 * 8, i10, (k10 & 7) * 8, (i11 & 7) * 8, j6 * 8, aByte924, j3, aByteArrayArray1239[i12], aClass3Array964, k9);
                                    flag = true;
                                    break;
                                }

                            }
                            if(!flag)
                                class22.method256(k4 * 8, j6 * 8, j3, (byte)7);
                        }

                    }

                }

                for(int l4 = 0; l4 < 13; l4++)
                {
                    for(int k6 = 0; k6 < 13; k6++)
                    {
                        int l7 = anIntArrayArrayArray1061[0][l4][k6];
                        if(l7 == -1)
                            class22.method257(8, k6 * 8, 8, (byte)1, l4 * 8);
                    }

                }

                outgoingVector.writeOpcode(30);
                for(int l6 = 0; l6 < 4; l6++)
                {
                    for(int i8 = 0; i8 < 13; i8++)
                    {
                        for(int i9 = 0; i9 < 13; i9++)
                        {
                            int l9 = anIntArrayArrayArray1061[l6][i8][i9];
                            if(l9 != -1)
                            {
                                int j10 = l9 >> 24 & 3;
                                int l10 = l9 >> 1 & 3;
                                int j11 = l9 >> 14 & 0x3ff;
                                int l11 = l9 >> 3 & 0x7ff;
                                int j12 = (j11 / 8 << 8) + l11 / 8;
                                for(int k12 = 0; k12 < anIntArray936.length; k12++)
                                {
                                    if(anIntArray936[k12] != j12 || aByteArrayArray1167[k12] == null)
                                        continue;
                                    class22.method246(aClass3Array964, aByteArrayArray1167[k12], (j11 & 7) * 8, (l11 & 7) * 8, j10, i8 * 8, 0, l6, i9 * 8, l10, aClass31_868);
                                    break;
                                }

                            }
                        }

                    }

                }

            }
            outgoingVector.writeOpcode(30);
            class22.method260(aClass3Array964, aClass31_868, -2206);
            if(aClass14_844 != null)
            {
                aClass14_844.method207(-5281);
                Class39_Sub3_Sub4_Sub1.anIntArray1680 = anIntArray1317;
            }
            outgoingVector.writeOpcode(30);
            int k3 = Class22.anInt300;
            if(k3 > myHeightLevel)
                k3 = myHeightLevel;
            if(k3 < myHeightLevel - 1)
                k3 = myHeightLevel - 1;
            if(highMemory)
                aClass31_868.method292(Class22.anInt300, (byte)-43);
            else
                aClass31_868.method292(0, (byte)-43);
            for(int i5 = 0; i5 < 104; i5++)
            {
                for(int i7 = 0; i7 < 104; i7++)
                    method99(i5, i7);

            }

            method52(29760);
        }
        catch(Exception exception) { }
        Class27.aClass35_404.method363();
        if(super.aFrame_Sub1_18 != null)
        {
            outgoingVector.writeOpcode(239);
            outgoingVector.putInt(0x3f008edd);
        }
        if(highMemory && Signlink.cache_dat != null)
        {
            int j = aOnDemandClient_1273.method238(0, false);
            for(int i1 = 0; i1 < j; i1++)
            {
                int l1 = aOnDemandClient_1273.method243(true, i1);
                if((l1 & 0x79) == 0)
                    Class39_Sub3_Sub2_Sub4.method386(i1, -40577);
            }

        }
        System.gc();
        Class39_Sub3_Sub4_Sub1.method489(0, 20);
        aOnDemandClient_1273.method233((byte)-72);
        if(byte0 == 7)
            byte0 = 0;
        else
            anInt944 = decrypter.getNextKey();
        int k = (anInt1088 - 6) / 8 - 1;
        int j1 = (anInt1088 + 6) / 8 + 1;
        int i2 = (anInt1089 - 6) / 8 - 1;
        int l2 = (anInt1089 + 6) / 8 + 1;
        if(aBoolean1156)
        {
            k = 49;
            j1 = 50;
            i2 = 49;
            l2 = 50;
        }
        for(int l3 = k; l3 <= j1; l3++)
        {
            for(int j5 = i2; j5 <= l2; j5++)
                if(l3 == k || l3 == j1 || j5 == i2 || j5 == l2)
                {
                    int j7 = aOnDemandClient_1273.method242(j5, 208, l3, 0);
                    if(j7 != -1)
                        aOnDemandClient_1273.method228(false, j7, 3);
                    int j8 = aOnDemandClient_1273.method242(j5, 208, l3, 1);
                    if(j8 != -1)
                        aOnDemandClient_1273.method228(false, j8, 3);
                }

        }

    }

    public int method54(boolean flag, int i, int j, int k)
    {
        if(!flag)
            method6();
        int l = 256 - i;
        return ((k & 0xff00ff) * l + (j & 0xff00ff) * i & 0xff00ff00) + ((k & 0xff00) * l + (j & 0xff00) * i & 0xff0000) >> 8;
    }

    public void method55(byte byte0)
    {
        if(anInt1149 != 2)
            return;
        method109((anInt1134 - anInt990 << 7) + anInt1137, anInt1135 * 2, false, (anInt1133 - anInt989 << 7) + anInt1136);
        if(byte0 != 4)
            return;
        if(anInt934 > -1 && loopCycle % 20 < 10)
            aClass39_Sub3_Sub4_Sub4Array946[0].method530(anInt934 - 12, 22912, anInt935 - 28);
    }

    public void method56(int i)
    {
        if(i >= 0)
            return;
        for(int j = 0; j < anInt979; j++)
            if(anIntArray847[j] <= 0)
            {
                boolean flag = false;
                try
                {
                    if(anIntArray1199[j] == anInt1043 && anIntArray1080[j] == anInt1160)
                    {
                        if(!method86(0))
                            flag = true;
                    } else
                    {
                        Buffer class39_sub3_sub3 = Class12.method198(anIntArray1199[j], anIntArray1080[j], 0);
                        if(System.currentTimeMillis() + (long)(class39_sub3_sub3.currentOffset / 22) > aLong976 + (long)(anInt1310 / 22))
                        {
                            anInt1310 = class39_sub3_sub3.currentOffset;
                            aLong976 = System.currentTimeMillis();
                            if(method80(class39_sub3_sub3.currentOffset, true, class39_sub3_sub3.payload))
                            {
                                anInt1043 = anIntArray1199[j];
                                anInt1160 = anIntArray1080[j];
                            } else
                            {
                                flag = true;
                            }
                        }
                    }
                }
                catch(Exception exception)
                {
                    if(Signlink.reporterror)
                    {
                        outgoingVector.writeOpcode(142);
                        outgoingVector.putShort(anIntArray1199[j] & 0x7fff);
                    } else
                    {
                        outgoingVector.writeOpcode(142);
                        outgoingVector.putShort(-1);
                    }
                }
                if(!flag || anIntArray847[j] == -5)
                {
                    anInt979--;
                    for(int k = j; k < anInt979; k++)
                    {
                        anIntArray1199[k] = anIntArray1199[k + 1];
                        anIntArray1080[k] = anIntArray1080[k + 1];
                        anIntArray847[k] = anIntArray847[k + 1];
                    }

                    j--;
                } else
                {
                    anIntArray847[j] = -5;
                }
            } else
            {
                anIntArray847[j]--;
            }

        if(anInt1159 > 0)
        {
            anInt1159 -= 20;
            if(anInt1159 < 0)
                anInt1159 = 0;
            if(anInt1159 == 0 && aBoolean926 && !highMemory)
            {
                anInt939 = anInt1010;
                aBoolean940 = true;
                aOnDemandClient_1273.method227(2, anInt939);
            }
        }
    }

    public DataInputStream method57(String s)
        throws IOException
    {
        if(!aBoolean1105)
            if(Signlink.mainapp != null)
                return Signlink.openurl(s);
            else
                return new DataInputStream((new URL(getCodeBase(), s)).openStream());
        if(aSocket1115 != null)
        {
            try
            {
                aSocket1115.close();
            }
            catch(Exception _ex) { }
            aSocket1115 = null;
        }
        aSocket1115 = getSocket(43595);
        aSocket1115.setSoTimeout(10000);
        java.io.InputStream inputstream = aSocket1115.getInputStream();
        OutputStream outputstream = aSocket1115.getOutputStream();
        outputstream.write(("JAGGRAB /" + s + "\n\n").getBytes());
        return new DataInputStream(inputstream);
    }

    public void method58(int i)
    {
        opcodeSize += i;
        for(int j = -1; j < playerCount; j++)
        {
            int k;
            if(j == -1)
                k = myPlayerIndex;
            else
                k = playerIndices[j];
            Player player = players[k];
            if(player != null)
                method44(1, player, 9);
        }

    }

    public void parsePlayerSyncMasks(Player player, Buffer buffer, int i, int j, int k)
    {
        if(j != 0)
            currentOpcode = buffer.readUByte();
        if((k & 0x40) != 0)
        {
            int l = buffer.getShortA();
            int j2 = buffer.getUnsignedByteC();
            int j3 = buffer.getUnsignedByteA();
            int l3 = buffer.currentOffset;
            if(player.aString1754 != null && player.aBoolean1755)
            {
                long l4 = Class37.stringToLong(player.aString1754);
                boolean flag = false;
                if(j2 <= 1)
                {
                    for(int i4 = 0; i4 < anInt1168; i4++)
                    {
                        if(aLongArray879[i4] != l4)
                            continue;
                        flag = true;
                        break;
                    }

                }
                if(!flag && anInt897 == 0)
                    try
                    {
                        aClass39_Sub3_Sub3_898.currentOffset = 0;
                        buffer.getReverseBytes(aClass39_Sub3_Sub3_898.payload, j3, 0);
                        aClass39_Sub3_Sub3_898.currentOffset = 0;
                        String s = Class50.method601(aClass39_Sub3_Sub3_898, j3, 0);
                        s = Class44.method556(s, true);
                        player.aString1605 = s;
                        player.anInt1607 = l >> 8;
                        player.anInt1643 = l & 0xff;
                        player.anInt1628 = 150;
                        if(j2 == 2 || j2 == 3)
                            sendMessage((byte)-83, s, 1, "@cr2@" + player.aString1754);
                        else
                        if(j2 == 1)
                            sendMessage((byte)-83, s, 1, "@cr1@" + player.aString1754);
                        else
                            sendMessage((byte)-83, s, 2, player.aString1754);
                    }
                    catch(Exception exception)
                    {
                        Signlink.reporterror("cde2");
                    }
            }
            buffer.currentOffset = l3 + j3;
        }
        if((k & 0x80) != 0)
        {
            int i1 = buffer.readUByte();
            byte abyte0[] = new byte[i1];
            Buffer buff = new Buffer(abyte0);
            buffer.readBytes(abyte0, i1, 0);
            aClass39_Sub3_Sub3Array878[i] = buff;
            player.syncAppearance(false, buff);
        }
        if((k & 0x400) != 0)
        {
            player.anInt1597 = buffer.getLEShortA();
            int j1 = buffer.method470((byte)0);
            player.anInt1601 = j1 >> 16;
            player.anInt1600 = loopCycle + (j1 & 0xffff);
            player.anInt1598 = 0;
            player.anInt1599 = 0;
            if(((Class39_Sub3_Sub2_Sub5) (player)).anInt1600 > loopCycle)
                player.anInt1598 = -1;
            if(((Class39_Sub3_Sub2_Sub5) (player)).anInt1597 == 65535)
                player.anInt1597 = -1;
        }
        if((k & 1) != 0)
        {
            int k1 = buffer.readShortLE();
            if(k1 == 65535)
                k1 = -1;
            int k2 = buffer.getUnsignedByteA();
            if(k1 == ((Class39_Sub3_Sub2_Sub5) (player)).anInt1615 && k1 != -1)
            {
                int k3 = SEQ.aClass20Array271[k1].anInt285;
                if(k3 == 1)
                {
                    player.anInt1616 = 0;
                    player.anInt1617 = 0;
                    player.anInt1618 = k2;
                    player.anInt1619 = 0;
                }
                if(k3 == 2)
                    player.anInt1619 = 0;
            } else
            if(k1 == -1 || ((Class39_Sub3_Sub2_Sub5) (player)).anInt1615 == -1 || SEQ.aClass20Array271[k1].anInt279 >= SEQ.aClass20Array271[((Class39_Sub3_Sub2_Sub5) (player)).anInt1615].anInt279)
            {
                player.anInt1615 = k1;
                player.anInt1616 = 0;
                player.anInt1617 = 0;
                player.anInt1618 = k2;
                player.anInt1619 = 0;
                player.anInt1614 = ((Class39_Sub3_Sub2_Sub5) (player)).anInt1604;
            }
        }
        if((k & 0x100) != 0)
        {
            int l1 = buffer.readUByte();
            int l2 = buffer.readUByte();
            player.method416((byte)16, loopCycle, l1, l2);
            player.anInt1593 = loopCycle + 300;
            player.anInt1594 = buffer.aClass5_1450.getUnsignedByteS(buffer);
            player.anInt1595 = buffer.getUnsignedByteA();
        }
        if((k & 0x200) != 0)
        {
            player.anInt1631 = buffer.aClass5_1450.getUnsignedByteS(buffer);
            player.anInt1633 = buffer.getUnsignedByteC();
            player.anInt1632 = buffer.readUByte();
            player.anInt1634 = buffer.getUnsignedByteC();
            player.anInt1635 = buffer.getLEShortA() + loopCycle;
            player.anInt1636 = buffer.getShortA() + loopCycle;
            player.anInt1637 = buffer.aClass5_1450.getUnsignedByteS(buffer);
            player.method417(926);
        }
        if((k & 4) != 0)
        {
            player.anInt1620 = buffer.getShortA();
            if(((Class39_Sub3_Sub2_Sub5) (player)).anInt1620 == 65535)
                player.anInt1620 = -1;
        }
        if((k & 2) != 0)
        {
            player.anInt1649 = buffer.getLEShortA();
            player.anInt1650 = buffer.readShortLE();
        }
        if((k & 0x10) != 0)
        {
            int i2 = buffer.getUnsignedByteA();
            int i3 = buffer.getUnsignedByteC();
            player.method416((byte)16, loopCycle, i2, i3);
            player.anInt1593 = loopCycle + 300;
            player.anInt1594 = buffer.getUnsignedByteC();
            player.anInt1595 = buffer.getUnsignedByteC();
        }
        if((k & 8) != 0)
        {
            player.aString1605 = buffer.getRs2String();
            if(((Class39_Sub3_Sub2_Sub5) (player)).aString1605.charAt(0) == '~')
            {
                player.aString1605 = ((Class39_Sub3_Sub2_Sub5) (player)).aString1605.substring(1);
                sendMessage((byte)-83, ((Class39_Sub3_Sub2_Sub5) (player)).aString1605, 2, player.aString1754);
            } else
            if(player == myPlayer)
                sendMessage((byte)-83, ((Class39_Sub3_Sub2_Sub5) (player)).aString1605, 2, player.aString1754);
            player.anInt1607 = 0;
            player.anInt1643 = 0;
            player.anInt1628 = 150;
        }
    }

    public void method60(RSInterface class34, int i)
    {
        if(i != 0)
            method6();
        int j = class34.anInt632;
        if(j >= 1 && j <= 100 || j >= 701 && j <= 800)
        {
            if(j == 1 && anInt1191 == 0)
            {
                class34.message = "Loading friend list";
                class34.anInt621 = 0;
                return;
            }
            if(j == 1 && anInt1191 == 1)
            {
                class34.message = "Connecting to friendserver";
                class34.anInt621 = 0;
                return;
            }
            if(j == 2 && anInt1191 != 2)
            {
                class34.message = "Please wait...";
                class34.anInt621 = 0;
                return;
            }
            int k = anInt1190;
            if(anInt1191 != 2)
                k = 0;
            if(j > 700)
                j -= 601;
            else
                j--;
            if(j >= k)
            {
                class34.message = "";
                class34.anInt621 = 0;
                return;
            } else
            {
                class34.message = aStringArray1216[j];
                class34.anInt621 = 1;
                return;
            }
        }
        if(j >= 101 && j <= 200 || j >= 801 && j <= 900)
        {
            int l = anInt1190;
            if(anInt1191 != 2)
                l = 0;
            if(j > 800)
                j -= 701;
            else
                j -= 101;
            if(j >= l)
            {
                class34.message = "";
                class34.anInt621 = 0;
                return;
            }
            if(anIntArray895[j] == 0)
                class34.message = "@red@Offline";
            else
            if(anIntArray895[j] < 200)
            {
                if(anIntArray895[j] == nodeId)
                    class34.message = "@gre@World" + (anIntArray895[j] - 9);
                else
                    class34.message = "@yel@World" + (anIntArray895[j] - 9);
            } else
            if(anIntArray895[j] == nodeId)
                class34.message = "@gre@Classic" + (anIntArray895[j] - 219);
            else
                class34.message = "@yel@Classic" + (anIntArray895[j] - 219);
            class34.anInt621 = 1;
            return;
        }
        if(j == 203)
        {
            int i1 = anInt1190;
            if(anInt1191 != 2)
                i1 = 0;
            class34.anInt607 = i1 * 15 + 20;
            if(class34.anInt607 <= class34.anInt610)
                class34.anInt607 = class34.anInt610 + 1;
            return;
        }
        if(j >= 401 && j <= 500)
        {
            if((j -= 401) == 0 && anInt1191 == 0)
            {
                class34.message = "Loading ignore list";
                class34.anInt621 = 0;
                return;
            }
            if(j == 1 && anInt1191 == 0)
            {
                class34.message = "Please wait...";
                class34.anInt621 = 0;
                return;
            }
            int j1 = anInt1168;
            if(anInt1191 == 0)
                j1 = 0;
            if(j >= j1)
            {
                class34.message = "";
                class34.anInt621 = 0;
                return;
            } else
            {
                class34.message = Class37.method372(Class37.method369(-39, aLongArray879[j]), false);
                class34.anInt621 = 1;
                return;
            }
        }
        if(j == 503)
        {
            class34.anInt607 = anInt1168 * 15 + 20;
            if(class34.anInt607 <= class34.anInt610)
                class34.anInt607 = class34.anInt610 + 1;
            return;
        }
        if(j == 327)
        {
            class34.anInt618 = 150;
            class34.anInt619 = (int)(Math.sin((double)loopCycle / 40D) * 256D) & 0x7ff;
            if(aBoolean1202)
            {
                for(int k1 = 0; k1 < 7; k1++)
                {
                    int j2 = anIntArray1117[k1];
                    if(j2 >= 0 && !IDK.aClass15Array230[j2].method212(827))
                        return;
                }

                aBoolean1202 = false;
                Class39_Sub3_Sub2_Sub4 aclass39_sub3_sub2_sub4[] = new Class39_Sub3_Sub2_Sub4[7];
                int k2 = 0;
                for(int l2 = 0; l2 < 7; l2++)
                {
                    int i3 = anIntArray1117[l2];
                    if(i3 >= 0)
                        aclass39_sub3_sub2_sub4[k2++] = IDK.aClass15Array230[i3].method213(-15);
                }

                Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4 = new Class39_Sub3_Sub2_Sub4(183, aclass39_sub3_sub2_sub4, k2);
                for(int j3 = 0; j3 < 5; j3++)
                    if(anIntArray852[j3] != 0)
                    {
                        class39_sub3_sub2_sub4.method401(anIntArrayArray1020[j3][0], anIntArrayArray1020[j3][anIntArray852[j3]]);
                        if(j3 == 1)
                            class39_sub3_sub2_sub4.method401(anIntArray1320[0], anIntArray1320[anIntArray852[j3]]);
                    }

                class39_sub3_sub2_sub4.method394(false);
                class39_sub3_sub2_sub4.method395(SEQ.aClass20Array271[((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1640].anIntArray273[0], 0);
                class39_sub3_sub2_sub4.method404(64, 850, -30, -50, -30, true);
                class34.anInt636 = 5;
                class34.anInt637 = 0;
                RSInterface.method351(class39_sub3_sub2_sub4, 0, 5, false);
            }
            return;
        }
        if(j == 324)
        {
            if(aClass39_Sub3_Sub4_Sub4_1271 == null)
            {
                aClass39_Sub3_Sub4_Sub4_1271 = class34.aClass39_Sub3_Sub4_Sub4_626;
                aClass39_Sub3_Sub4_Sub4_1272 = class34.aClass39_Sub3_Sub4_Sub4_585;
            }
            if(aBoolean1286)
            {
                class34.aClass39_Sub3_Sub4_Sub4_626 = aClass39_Sub3_Sub4_Sub4_1272;
                return;
            } else
            {
                class34.aClass39_Sub3_Sub4_Sub4_626 = aClass39_Sub3_Sub4_Sub4_1271;
                return;
            }
        }
        if(j == 325)
        {
            if(aClass39_Sub3_Sub4_Sub4_1271 == null)
            {
                aClass39_Sub3_Sub4_Sub4_1271 = class34.aClass39_Sub3_Sub4_Sub4_626;
                aClass39_Sub3_Sub4_Sub4_1272 = class34.aClass39_Sub3_Sub4_Sub4_585;
            }
            if(aBoolean1286)
            {
                class34.aClass39_Sub3_Sub4_Sub4_626 = aClass39_Sub3_Sub4_Sub4_1271;
                return;
            } else
            {
                class34.aClass39_Sub3_Sub4_Sub4_626 = aClass39_Sub3_Sub4_Sub4_1272;
                return;
            }
        }
        if(j == 600)
        {
            class34.message = aString1012;
            if(loopCycle % 20 < 10)
            {
                class34.message += "|";
                return;
            } else
            {
                class34.message += " ";
                return;
            }
        }
        if(j == 620)
            if(anInt1155 >= 1)
            {
                if(aBoolean1319)
                {
                    class34.anInt594 = 0xff0000;
                    class34.message = "Moderator option: Mute player for 48 hours: <ON>";
                } else
                {
                    class34.anInt594 = 0xffffff;
                    class34.message = "Moderator option: Mute player for 48 hours: <OFF>";
                }
            } else
            {
                class34.message = "";
            }
        if(j == 660)
        {
            int l1 = anInt1053 - anInt1170;
            String s1;
            if(l1 <= 0)
                s1 = "earlier today";
            else
            if(l1 == 1)
                s1 = "yesterday";
            else
                s1 = l1 + " days ago";
            class34.message = "You last logged in @red@" + s1 + "@bla@ from: @red@" + Signlink.dns;
        }
        if(j == 661)
            if(anInt1078 == 0)
                class34.message = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
            else
            if(anInt1078 <= anInt1053)
            {
                class34.message = "\\n\\nRecovery Questions Last Set:\\n@gre@" + method61(5, anInt1078);
            } else
            {
                int i2 = (anInt1053 + 14) - anInt1078;
                String s2;
                if(i2 <= 0)
                    s2 = "Earlier today";
                else
                if(i2 == 1)
                    s2 = "Yesterday";
                else
                    s2 = i2 + " days ago";
                class34.message = s2 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + method61(5, anInt1078) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
            }
        if(j == 662)
        {
            String s;
            if(anInt1258 == 0)
                s = "@yel@0 unread messages";
            else
            if(anInt1258 == 1)
                s = "@gre@1 unread message";
            else
                s = "@gre@" + anInt1258 + " unread messages";
            class34.message = "You have " + s + "\\nin your message centre.";
        }
        if(j == 663)
            if(anInt1302 <= 0 || anInt1302 > anInt1053 + 10)
                class34.message = "Last password change:\\n@gre@Never changed";
            else
                class34.message = "Last password change:\\n@gre@" + method61(5, anInt1302);
        if(j == 665)
            if(anInt1329 > 2 && !members)
                class34.message = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
            else
            if(anInt1329 > 2)
                class34.message = "\\n\\nYou have @gre@" + anInt1329 + "@yel@ days of\\nmember credit remaining.";
            else
            if(anInt1329 > 0)
                class34.message = "You have @gre@" + anInt1329 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
            else
                class34.message = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
        if(j == 667)
            if(anInt1329 > 2 && !members)
                class34.message = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
            else
            if(anInt1329 > 0)
                class34.message = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
            else
                class34.message = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
        if(j == 668)
        {
            if(anInt1078 > anInt1053)
            {
                class34.message = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                return;
            }
            class34.message = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
        }
    }

    public String method61(int i, int j)
    {
        if(j > anInt1053 + 10)
            return "Unknown";
        long l = ((long)j + 11745L) * 0x5265c00L;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(l));
        int k = calendar.get(5);
        int i1 = calendar.get(2);
        int j1 = calendar.get(1);
        if(i < 5 || i > 5)
            currentOpcode = -1;
        String as[] = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", 
            "Nov", "Dec"
        };
        return k + "-" + as[i1] + "-" + j1;
    }

    public void method62(boolean flag)
    {
        if(flag)
            anInt1268 = decrypter.getNextKey();
        for(Class39_Sub3_Sub2_Sub1 class39_sub3_sub2_sub1 = (Class39_Sub3_Sub2_Sub1)aClass5_1305.method185(); class39_sub3_sub2_sub1 != null; class39_sub3_sub2_sub1 = (Class39_Sub3_Sub2_Sub1)aClass5_1305.method187((byte)8))
            if(class39_sub3_sub2_sub1.anInt1476 != myHeightLevel || class39_sub3_sub2_sub1.aBoolean1474)
                class39_sub3_sub2_sub1.method376();
            else
            if(loopCycle >= class39_sub3_sub2_sub1.anInt1473)
            {
                class39_sub3_sub2_sub1.method380(anInt1111, (byte)0);
                if(class39_sub3_sub2_sub1.aBoolean1474)
                    class39_sub3_sub2_sub1.method376();
                else
                    aClass31_868.method302(class39_sub3_sub2_sub1.anInt1478, class39_sub3_sub2_sub1.anInt1479, -1, 0, class39_sub3_sub2_sub1.anInt1476, false, class39_sub3_sub2_sub1.anInt1477, false, class39_sub3_sub2_sub1, 60);
            }

    }

    public void method63(int i, byte byte0, int j, int k, int l, int i1)
    {
        aClass39_Sub3_Sub4_Sub3_972.method523(k, 22912, l);
        aClass39_Sub3_Sub4_Sub3_973.method523(k, 22912, (l + j) - 16);
        Class39_Sub3_Sub4.method478((byte)4, l + 16, k, anInt1127, j - 32, 16);
        int j1 = ((j - 32) * j) / i;
        if(byte0 != 89)
        {
            for(int k1 = 1; k1 > 0; k1++);
        }
        if(j1 < 8)
            j1 = 8;
        int l1 = ((j - 32 - j1) * i1) / (i - j);
        Class39_Sub3_Sub4.method478((byte)4, l + 16 + l1, k, anInt1238, j1, 16);
        Class39_Sub3_Sub4.method483(anInt982, anInt974, j1, l + 16 + l1, k);
        Class39_Sub3_Sub4.method483(anInt982, anInt974, j1, l + 16 + l1, k + 1);
        Class39_Sub3_Sub4.method481(k, 16, 893, l + 16 + l1, anInt974);
        Class39_Sub3_Sub4.method481(k, 16, 893, l + 17 + l1, anInt974);
        Class39_Sub3_Sub4.method483(anInt982, anInt1054, j1, l + 16 + l1, k + 15);
        Class39_Sub3_Sub4.method483(anInt982, anInt1054, j1 - 1, l + 17 + l1, k + 14);
        Class39_Sub3_Sub4.method481(k, 16, 893, l + 15 + l1 + j1, anInt1054);
        Class39_Sub3_Sub4.method481(k + 1, 15, 893, l + 14 + l1 + j1, anInt1054);
    }

    public void method64(int i)
    {
        char c = '\u0100';
        if(anInt1107 > 0)
        {
            for(int j = 0; j < 256; j++)
                if(anInt1107 > 768)
                    anIntArray1006[j] = method54(true, 1024 - anInt1107, anIntArray1008[j], anIntArray1007[j]);
                else
                if(anInt1107 > 256)
                    anIntArray1006[j] = anIntArray1008[j];
                else
                    anIntArray1006[j] = method54(true, 256 - anInt1107, anIntArray1007[j], anIntArray1008[j]);

        } else
        if(anInt1108 > 0)
        {
            for(int k = 0; k < 256; k++)
                if(anInt1108 > 768)
                    anIntArray1006[k] = method54(true, 1024 - anInt1108, anIntArray1009[k], anIntArray1007[k]);
                else
                if(anInt1108 > 256)
                    anIntArray1006[k] = anIntArray1009[k];
                else
                    anIntArray1006[k] = method54(true, 256 - anInt1108, anIntArray1007[k], anIntArray1009[k]);

        } else
        {
            for(int l = 0; l < 256; l++)
                anIntArray1006[l] = anIntArray1007[l];

        }
        for(int i1 = 0; i1 < 33920; i1++)
            aClass14_1070.anIntArray219[i1] = aClass39_Sub3_Sub4_Sub4_1264.anIntArray1731[i1];

        int j1 = 0;
        int k1 = 1152;
        for(int l1 = 1; l1 < c - 1; l1++)
        {
            int i2 = (anIntArray1206[l1] * (c - l1)) / c;
            int k2 = 22 + i2;
            if(k2 < 0)
                k2 = 0;
            j1 += k2;
            for(int i3 = k2; i3 < 128; i3++)
            {
                int k3 = anIntArray1027[j1++];
                if(k3 != 0)
                {
                    int i4 = k3;
                    int k4 = 256 - k3;
                    k3 = anIntArray1006[k3];
                    int i5 = aClass14_1070.anIntArray219[k1];
                    aClass14_1070.anIntArray219[k1++] = ((k3 & 0xff00ff) * i4 + (i5 & 0xff00ff) * k4 & 0xff00ff00) + ((k3 & 0xff00) * i4 + (i5 & 0xff00) * k4 & 0xff0000) >> 8;
                } else
                {
                    k1++;
                }
            }

            k1 += k2;
        }

        aClass14_1070.method208(super.graphics, 966, 0, 0);
        for(int j2 = 0; j2 < 33920; j2++)
            aClass14_1071.anIntArray219[j2] = aClass39_Sub3_Sub4_Sub4_1265.anIntArray1731[j2];

        j1 = 0;
        k1 = 1176;
        for(int l2 = 1; l2 < c - 1; l2++)
        {
            int j3 = (anIntArray1206[l2] * (c - l2)) / c;
            int l3 = 103 - j3;
            k1 += j3;
            for(int j4 = 0; j4 < l3; j4++)
            {
                int l4 = anIntArray1027[j1++];
                if(l4 != 0)
                {
                    int j5 = l4;
                    int k5 = 256 - l4;
                    l4 = anIntArray1006[l4];
                    int l5 = aClass14_1071.anIntArray219[k1];
                    aClass14_1071.anIntArray219[k1++] = ((l4 & 0xff00ff) * j5 + (l5 & 0xff00ff) * k5 & 0xff00ff00) + ((l4 & 0xff00) * j5 + (l5 & 0xff00) * k5 & 0xff0000) >> 8;
                } else
                {
                    k1++;
                }
            }

            j1 += 128 - l3;
            k1 += 128 - l3 - j3;
        }

        aClass14_1071.method208(super.graphics, 966, 0, 637);
        if(i < 3 || i > 3)
            aClass5ArrayArrayArray950 = null;
    }

    public static String method65(int i, int j)
    {
        if(j != 27004)
            throw new NullPointerException();
        if(i < 0x186a0)
            return String.valueOf(i);
        if(i < 0x989680)
            return i / 1000 + "K";
        else
            return i / 0xf4240 + "M";
    }

    public boolean method66(boolean flag, String s)
    {
        if(s == null)
            return false;
        for(int i = 0; i < anInt1190; i++)
            if(s.equalsIgnoreCase(aStringArray1216[i]))
                return true;

        if(!flag)
            anInt1081 = decrypter.getNextKey();
        return s.equalsIgnoreCase(myPlayer.aString1754);
    }

    public void method67(byte byte0, boolean flag)
    {
        method84(-453);
        if(byte0 != 6)
            currentOpcode = -1;
        aClass14_1069.method207(-5281);
        aClass39_Sub3_Sub4_Sub3_1145.method523(0, 22912, 0);
        char c = '\u0168';
        char c1 = '\310';
        if(anInt1116 == 0)
        {
            int i = c1 / 2 + 80;
            aClass39_Sub3_Sub4_Sub2_1097.method504(i, 0x75a9a9, 0, true, c / 2, aOnDemandClient_1273.aString1349);
            i = c1 / 2 - 20;
            aClass39_Sub3_Sub4_Sub2_1099.method504(i, 0xffff00, 0, true, c / 2, "Welcome to RuneScape");
            i += 30;
            int l = c / 2 - 80;
            int k1 = c1 / 2 + 20;
            aClass39_Sub3_Sub4_Sub3_1146.method523(l - 73, 22912, k1 - 20);
            aClass39_Sub3_Sub4_Sub2_1099.method504(k1 + 5, 0xffffff, 0, true, l, "New User");
            l = c / 2 + 80;
            aClass39_Sub3_Sub4_Sub3_1146.method523(l - 73, 22912, k1 - 20);
            aClass39_Sub3_Sub4_Sub2_1099.method504(k1 + 5, 0xffffff, 0, true, l, "Existing User");
        }
        if(anInt1116 == 2)
        {
            int j = c1 / 2 - 40;
            if(loginScreenTextLine1.length() > 0)
            {
                aClass39_Sub3_Sub4_Sub2_1099.method504(j - 15, 0xffff00, 0, true, c / 2, loginScreenTextLine1);
                aClass39_Sub3_Sub4_Sub2_1099.method504(j, 0xffff00, 0, true, c / 2, loginScreenTextLine2);
                j += 30;
            } else
            {
                aClass39_Sub3_Sub4_Sub2_1099.method504(j - 7, 0xffff00, 0, true, c / 2, loginScreenTextLine2);
                j += 30;
            }
            aClass39_Sub3_Sub4_Sub2_1099.method511("Username: " + enteredUsername + ((anInt1292 == 0) & (loopCycle % 40 < 20) ? "@yel@|" : ""), c / 2 - 90, j, true, 0, 0xffffff);
            j += 15;
            aClass39_Sub3_Sub4_Sub2_1099.method511("Password: " + Class37.method373(aString1178, -799) + ((anInt1292 == 1) & (loopCycle % 40 < 20) ? "@yel@|" : ""), c / 2 - 88, j, true, 0, 0xffffff);
            j += 15;
            if(!flag)
            {
                int i1 = c / 2 - 80;
                int l1 = c1 / 2 + 50;
                aClass39_Sub3_Sub4_Sub3_1146.method523(i1 - 73, 22912, l1 - 20);
                aClass39_Sub3_Sub4_Sub2_1099.method504(l1 + 5, 0xffffff, 0, true, i1, "Login");
                i1 = c / 2 + 80;
                aClass39_Sub3_Sub4_Sub3_1146.method523(i1 - 73, 22912, l1 - 20);
                aClass39_Sub3_Sub4_Sub2_1099.method504(l1 + 5, 0xffffff, 0, true, i1, "Cancel");
            }
        }
        if(anInt1116 == 3)
        {
            aClass39_Sub3_Sub4_Sub2_1099.method504(c1 / 2 - 60, 0xffff00, 0, true, c / 2, "Create a free account");
            int k = c1 / 2 - 35;
            aClass39_Sub3_Sub4_Sub2_1099.method504(k, 0xffffff, 0, true, c / 2, "To create a new account you need to");
            k += 15;
            aClass39_Sub3_Sub4_Sub2_1099.method504(k, 0xffffff, 0, true, c / 2, "go back to the main RuneScape webpage");
            k += 15;
            aClass39_Sub3_Sub4_Sub2_1099.method504(k, 0xffffff, 0, true, c / 2, "and choose the 'create account'");
            k += 15;
            aClass39_Sub3_Sub4_Sub2_1099.method504(k, 0xffffff, 0, true, c / 2, "button near the top of that page.");
            k += 15;
            int j1 = c / 2;
            int i2 = c1 / 2 + 50;
            aClass39_Sub3_Sub4_Sub3_1146.method523(j1 - 73, 22912, i2 - 20);
            aClass39_Sub3_Sub4_Sub2_1099.method504(i2 + 5, 0xffffff, 0, true, j1, "Cancel");
        }
        aClass14_1069.method208(super.graphics, 966, 171, 202);
        if(aBoolean1148)
        {
            aBoolean1148 = false;
            aClass14_1067.method208(super.graphics, 966, 0, 128);
            aClass14_1068.method208(super.graphics, 966, 371, 202);
            aClass14_1072.method208(super.graphics, 966, 265, 0);
            aClass14_1073.method208(super.graphics, 966, 265, 562);
            aClass14_1074.method208(super.graphics, 966, 171, 128);
            aClass14_1075.method208(super.graphics, 966, 171, 562);
        }
    }

    public void method68(int i)
    {
        aBoolean1162 = true;
        try
        {
            long l = System.currentTimeMillis();
            int j = 0;
            int k = 20;
            while(aBoolean1015) 
            {
                anInt1166++;
                method117((byte)2);
                method117((byte)2);
                method64(3);
                if(++j > 10)
                {
                    long l1 = System.currentTimeMillis();
                    int i1 = (int)(l1 - l) / 10 - k;
                    k = 40 - i1;
                    if(k < 5)
                        k = 5;
                    j = 0;
                    l = l1;
                }
                try
                {
                    Thread.sleep(k);
                }
                catch(Exception _ex) { }
            }
        }
        catch(Exception _ex) { }
        aBoolean1162 = false;
        opcodeSize += i;
    }

    public void updateNpcs(int j, Buffer buffer)
    {
        anInt917 = 0;
        anInt876 = 0;
        parseTrackedNpcMovement(buffer);
        registerNewNpcs(false, buffer, j);
        parseTrackedNpcUpdateMasks(buffer, j, (byte)5);
        for(int k = 0; k < anInt917; k++)
        {
            int l = anIntArray918[k];
            if(aClass39_Sub3_Sub2_Sub5_Sub2Array899[l].anInt1648 != loopCycle)
            {
                aClass39_Sub3_Sub2_Sub5_Sub2Array899[l].aClass47_1772 = null;
                aClass39_Sub3_Sub2_Sub5_Sub2Array899[l] = null;
            }
        }

        if(buffer.currentOffset != j)
        {
            Signlink.reporterror(enteredUsername + " size mismatch in getnpcpos - pos:" + buffer.currentOffset + " psize:" + j);
            throw new RuntimeException("eek");
        }
        for(int i1 = 0; i1 < anInt900; i1++)
            if(aClass39_Sub3_Sub2_Sub5_Sub2Array899[anIntArray901[i1]] == null)
            {
                Signlink.reporterror(enteredUsername + " null entry in npc list - pos:" + i1 + " size:" + anInt900);
                throw new RuntimeException("eek");
            }

    }

    public void method70(byte byte0)
    {
        try
        {
            if(socket != null)
                socket.method538();
        }
        catch(Exception _ex) { }
        socket = null;
        if(byte0 == 9)
            byte0 = 0;
        else
            aBoolean932 = !aBoolean932;
        aBoolean952 = false;
        anInt1116 = 0;
        enteredUsername = "";
        aString1178 = "";
        method83(-751);
        aClass31_868.method291(true);
        for(int i = 0; i < 4; i++)
            aClass3Array964[i].method157();

        System.gc();
        method136(2);
        anInt1010 = -1;
        anInt939 = -1;
        anInt1159 = 0;
    }

    public void method71(String s, String s1, int i)
    {
        if(i != anInt1233)
            currentOpcode = -1;
        if(aClass14_844 != null)
        {
            aClass14_844.method207(-5281);
            Class39_Sub3_Sub4_Sub1.anIntArray1680 = anIntArray1317;
            int j = 151;
            if(s != null)
                j -= 7;
            aClass39_Sub3_Sub4_Sub2_1098.method503(257, 41480, 0, s1, j);
            aClass39_Sub3_Sub4_Sub2_1098.method503(256, 41480, 0xffffff, s1, j - 1);
            j += 15;
            if(s != null)
            {
                aClass39_Sub3_Sub4_Sub2_1098.method503(257, 41480, 0, s, j);
                aClass39_Sub3_Sub4_Sub2_1098.method503(256, 41480, 0xffffff, s, j - 1);
            }
            aClass14_844.method208(super.graphics, 966, 4, 4);
            return;
        }
        if(super.aClass14_16 != null)
        {
            super.aClass14_16.method207(-5281);
            Class39_Sub3_Sub4_Sub1.anIntArray1680 = anIntArray1318;
            int k = 251;
            char c = '\u012C';
            byte byte0 = 50;
            Class39_Sub3_Sub4.method478((byte)4, k - 5 - byte0 / 2, 383 - c / 2, 0, byte0, c);
            Class39_Sub3_Sub4.method479(byte0, k - 5 - byte0 / 2, 606, 383 - c / 2, 0xffffff, c);
            if(s != null)
                k -= 7;
            aClass39_Sub3_Sub4_Sub2_1098.method503(383, 41480, 0, s1, k);
            aClass39_Sub3_Sub4_Sub2_1098.method503(382, 41480, 0xffffff, s1, k - 1);
            k += 15;
            if(s != null)
            {
                aClass39_Sub3_Sub4_Sub2_1098.method503(383, 41480, 0, s, k);
                aClass39_Sub3_Sub4_Sub2_1098.method503(382, 41480, 0xffffff, s, k - 1);
            }
            super.aClass14_16.method208(super.graphics, 966, 0, 0);
        }
    }

    public void parsePlayerMovement(Buffer buffer) {
        buffer.initBitAccess();
        int k = buffer.readBits(1);
        if(k == 0)
            return;
        int type = buffer.readBits(2);
        if(type == 0)
        {
            anIntArray877[anInt876++] = myPlayerIndex;
            return;
        }
        if(type == 1) { //Walk..
            int i1 = buffer.readBits(3);
            myPlayer.moveInDirection(i1, false);
            int updateReq = buffer.readBits(1);
            if(updateReq == 1)
                anIntArray877[anInt876++] = myPlayerIndex;
            return;
        }
        if(type == 2) { //Run
            int j1 = buffer.readBits(3);
            myPlayer.moveInDirection(j1, true);
            int i2 = buffer.readBits(3);
            myPlayer.moveInDirection(i2, true);
            int updateReq = buffer.readBits(1);
            if(updateReq == 1)
                anIntArray877[anInt876++] = myPlayerIndex;
            return;
        }
        if(type == 3) { //Teleport.
            myHeightLevel = buffer.readBits(2);
            int y = buffer.readBits(7);
            int updateReq = buffer.readBits(1);
            if(updateReq == 1)
                anIntArray877[anInt876++] = myPlayerIndex;
            int x = buffer.readBits(7);
            int i3 = buffer.readBits(1);
            myPlayer.method413(y, -9787, x, i3 == 1);
        }
    }

    public void method73(int i)
    {
        if(anInt1056 == 0)
            return;
        Class39_Sub3_Sub4_Sub2 class39_sub3_sub4_sub2 = aClass39_Sub3_Sub4_Sub2_1098;
        int j = 0;
        if(anInt1237 != 0)
            j = 1;
        for(int k = 0; k < 100; k++)
            if(aStringArray1194[k] != null)
            {
                int l = anIntArray1192[k];
                String s = aStringArray1193[k];
                byte byte0 = 0;
                if(s != null && s.startsWith("@cr1@"))
                {
                    s = s.substring(5);
                    byte0 = 1;
                }
                if(s != null && s.startsWith("@cr2@"))
                {
                    s = s.substring(5);
                    byte0 = 2;
                }
                if((l == 3 || l == 7) && (l == 7 || anInt1103 == 0 || anInt1103 == 1 && method66(true, s)))
                {
                    int i1 = 329 - j * 13;
                    int l1 = 4;
                    class39_sub3_sub4_sub2.method507(0, (byte)118, "From", i1, l1);
                    class39_sub3_sub4_sub2.method507(65535, (byte)118, "From", i1 - 1, l1);
                    l1 += class39_sub3_sub4_sub2.method505(1, "From ");
                    if(byte0 == 1)
                    {
                        aClass39_Sub3_Sub4_Sub3Array1126[0].method523(l1, 22912, i1 - 12);
                        l1 += 14;
                    }
                    if(byte0 == 2)
                    {
                        aClass39_Sub3_Sub4_Sub3Array1126[1].method523(l1, 22912, i1 - 12);
                        l1 += 14;
                    }
                    class39_sub3_sub4_sub2.method507(0, (byte)118, s + ": " + aStringArray1194[k], i1, l1);
                    class39_sub3_sub4_sub2.method507(65535, (byte)118, s + ": " + aStringArray1194[k], i1 - 1, l1);
                    if(++j >= 5)
                        return;
                }
                if(l == 5 && anInt1103 < 2)
                {
                    int j1 = 329 - j * 13;
                    class39_sub3_sub4_sub2.method507(0, (byte)118, aStringArray1194[k], j1, 4);
                    class39_sub3_sub4_sub2.method507(65535, (byte)118, aStringArray1194[k], j1 - 1, 4);
                    if(++j >= 5)
                        return;
                }
                if(l == 6 && anInt1103 < 2)
                {
                    int k1 = 329 - j * 13;
                    class39_sub3_sub4_sub2.method507(0, (byte)118, "To " + s + ": " + aStringArray1194[k], k1, 4);
                    class39_sub3_sub4_sub2.method507(65535, (byte)118, "To " + s + ": " + aStringArray1194[k], k1 - 1, 4);
                    if(++j >= 5)
                        return;
                }
            }

        i = 68 / i;
    }

    public void method74(boolean flag, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1, int i2)
    {
        Class39_Sub1 class39_sub1 = null;
        for(Class39_Sub1 class39_sub1_1 = (Class39_Sub1)aClass5_994.method185(); class39_sub1_1 != null; class39_sub1_1 = (Class39_Sub1)aClass5_994.method187((byte)8))
        {
            if(class39_sub1_1.anInt1384 != l1 || class39_sub1_1.anInt1386 != k || class39_sub1_1.anInt1387 != l || class39_sub1_1.anInt1385 != k1)
                continue;
            class39_sub1 = class39_sub1_1;
            break;
        }

        if(class39_sub1 == null)
        {
            class39_sub1 = new Class39_Sub1();
            class39_sub1.anInt1384 = l1;
            class39_sub1.anInt1385 = k1;
            class39_sub1.anInt1386 = k;
            class39_sub1.anInt1387 = l;
            method116(class39_sub1, 0);
            aClass5_994.method182(class39_sub1);
        }
        class39_sub1.anInt1390 = j;
        class39_sub1.anInt1392 = j1;
        class39_sub1.anInt1391 = i1;
        class39_sub1.anInt1389 = i;
        if(flag)
        {
            for(int j2 = 1; j2 > 0; j2++);
        }
        class39_sub1.anInt1388 = i2;
    }

    public void method75(boolean flag, int i)
    {
        if(flag)
            anInt1187 = 86;
        if(!highMemory)
        {
            for(int j = 0; j < anIntArray1262.length; j++)
            {
                int k = anIntArray1262[j];
                if(Class39_Sub3_Sub4_Sub1.anIntArray1688[k] >= i)
                {
                    Class39_Sub3_Sub4_Sub3 class39_sub3_sub4_sub3 = Class39_Sub3_Sub4_Sub1.aClass39_Sub3_Sub4_Sub3Array1682[k];
                    int l = class39_sub3_sub4_sub3.anInt1717 * class39_sub3_sub4_sub3.anInt1718 - 1;
                    int i1 = class39_sub3_sub4_sub3.anInt1717 * anInt1111 * 2;
                    byte abyte0[] = class39_sub3_sub4_sub3.aByteArray1715;
                    byte abyte1[] = aByteArray840;
                    for(int j1 = 0; j1 <= l; j1++)
                        abyte1[j1] = abyte0[j1 - i1 & l];

                    class39_sub3_sub4_sub3.aByteArray1715 = abyte1;
                    aByteArray840 = abyte0;
                    Class39_Sub3_Sub4_Sub1.method492(k, false);
                }
            }

        }
    }

    public void method76(int i)
    {
        i = 56 / i;
        aBoolean1202 = true;
        for(int j = 0; j < 7; j++)
        {
            anIntArray1117[j] = -1;
            for(int k = 0; k < IDK.anInt229; k++)
            {
                if(IDK.aClass15Array230[k].aBoolean236 || IDK.aClass15Array230[k].anInt231 != j + (aBoolean1286 ? 0 : 7))
                    continue;
                anIntArray1117[j] = k;
                break;
            }

        }

    }

    public void method10(boolean flag)
    {
        if(flag)
            method6();
        aBoolean1148 = true;
    }

    public void method77(byte byte0)
    {
        if(anInt903 < 2 && anInt905 == 0 && anInt1323 == 0)
            return;
        String s;
        if(anInt905 == 1 && anInt903 < 2)
            s = "Use " + aString909 + " with...";
        else
        if(anInt1323 == 1 && anInt903 < 2)
            s = aString1326 + "...";
        else
            s = aStringArray965[anInt903 - 1];
        if(anInt903 > 2)
            s = s + "@whi@ / " + (anInt903 - 2) + " more options";
        aClass39_Sub3_Sub4_Sub2_1099.method512(15, s, 856, 4, true, 0xffffff, loopCycle / 1000);
        if(byte0 == 7)
        {
            byte0 = 0;
            return;
        } else
        {
            anInt1233 = decrypter.getNextKey();
            return;
        }
    }

    public void method78(int i)
    {
        if(i < 6 || i > 6)
            outgoingVector.putByte(65);
        for(int j = -1; j < playerCount; j++)
        {
            int k;
            if(j == -1)
                k = myPlayerIndex;
            else
                k = playerIndices[j];
            Player player = players[k];
            if(player != null && ((Class39_Sub3_Sub2_Sub5) (player)).anInt1628 > 0)
            {
                player.anInt1628--;
                if(((Class39_Sub3_Sub2_Sub5) (player)).anInt1628 == 0)
                    player.aString1605 = null;
            }
        }

        for(int l = 0; l < anInt900; l++)
        {
            int i1 = anIntArray901[l];
            Class39_Sub3_Sub2_Sub5_Sub2 class39_sub3_sub2_sub5_sub2 = aClass39_Sub3_Sub2_Sub5_Sub2Array899[i1];
            if(class39_sub3_sub2_sub5_sub2 != null && ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1628 > 0)
            {
                class39_sub3_sub2_sub5_sub2.anInt1628--;
                if(((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1628 == 0)
                    class39_sub3_sub2_sub5_sub2.aString1605 = null;
            }
        }

    }

    public void method79(int i, byte byte0, int j)
    {
        if(byte0 == 2)
            byte0 = 0;
        else
            method6();
        int k = 0;
        for(int l = 0; l < 100; l++)
        {
            if(aStringArray1194[l] == null)
                continue;
            int i1 = anIntArray1192[l];
            int j1 = (70 - k * 14) + anInt948 + 4;
            if(j1 < -20)
                break;
            String s = aStringArray1193[l];
            boolean flag = false;
            if(s != null && s.startsWith("@cr1@"))
            {
                s = s.substring(5);
                boolean flag1 = true;
            }
            if(s != null && s.startsWith("@cr2@"))
            {
                s = s.substring(5);
                byte byte1 = 2;
            }
            if(i1 == 0)
                k++;
            if((i1 == 1 || i1 == 2) && (i1 == 1 || anInt995 == 0 || anInt995 == 1 && method66(true, s)))
            {
                if(i > j1 - 14 && i <= j1 && !s.equals(myPlayer.aString1754))
                {
                    if(anInt1155 >= 1)
                    {
                        aStringArray965[anInt903] = "Report abuse @whi@" + s;
                        anIntArray1122[anInt903] = 541;
                        anInt903++;
                    }
                    aStringArray965[anInt903] = "Add ignore @whi@" + s;
                    anIntArray1122[anInt903] = 997;
                    anInt903++;
                    aStringArray965[anInt903] = "Add friend @whi@" + s;
                    anIntArray1122[anInt903] = 138;
                    anInt903++;
                }
                k++;
            }
            if((i1 == 3 || i1 == 7) && anInt1056 == 0 && (i1 == 7 || anInt1103 == 0 || anInt1103 == 1 && method66(true, s)))
            {
                if(i > j1 - 14 && i <= j1)
                {
                    if(anInt1155 >= 1)
                    {
                        aStringArray965[anInt903] = "Report abuse @whi@" + s;
                        anIntArray1122[anInt903] = 541;
                        anInt903++;
                    }
                    aStringArray965[anInt903] = "Add ignore @whi@" + s;
                    anIntArray1122[anInt903] = 997;
                    anInt903++;
                    aStringArray965[anInt903] = "Add friend @whi@" + s;
                    anIntArray1122[anInt903] = 138;
                    anInt903++;
                }
                k++;
            }
            if(i1 == 4 && (anInt1195 == 0 || anInt1195 == 1 && method66(true, s)))
            {
                if(i > j1 - 14 && i <= j1)
                {
                    aStringArray965[anInt903] = "Accept trade @whi@" + s;
                    anIntArray1122[anInt903] = 119;
                    anInt903++;
                }
                k++;
            }
            if((i1 == 5 || i1 == 6) && anInt1056 == 0 && anInt1103 < 2)
                k++;
            if(i1 == 8 && (anInt1195 == 0 || anInt1195 == 1 && method66(true, s)))
            {
                if(i > j1 - 14 && i <= j1)
                {
                    aStringArray965[anInt903] = "Accept challenge @whi@" + s;
                    anIntArray1122[anInt903] = 875;
                    anInt903++;
                }
                k++;
            }
        }

    }

    public boolean method80(int i, boolean flag, byte abyte0[])
    {
        if(!flag)
            anInt1268 = 97;
        if(abyte0 == null)
            return true;
        else
            return Signlink.wavesave(abyte0, i);
    }

    public void method81(byte byte0)
    {
        Graphics g = method11(-489).getGraphics();
        g.setColor(Color.black);
        g.fillRect(0, 0, 765, 503);
        method4(1, 0);
        if(byte0 != 1)
            anInt889 = decrypter.getNextKey();
        if(aBoolean1132)
        {
            aBoolean1015 = false;
            g.setFont(new Font("Helvetica", 1, 16));
            g.setColor(Color.yellow);
            int i = 35;
            g.drawString("Sorry, an error has occured whilst loading RuneScape", 30, i);
            i += 50;
            g.setColor(Color.white);
            g.drawString("To fix this try the following (in order):", 30, i);
            i += 50;
            g.setColor(Color.white);
            g.setFont(new Font("Helvetica", 1, 12));
            g.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, i);
            i += 30;
            g.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, i);
            i += 30;
            g.drawString("3: Try using a different game-world", 30, i);
            i += 30;
            g.drawString("4: Try rebooting your computer", 30, i);
            i += 30;
            g.drawString("5: Try selecting a different version of Java from the play-game menu", 30, i);
        }
        if(aBoolean1084)
        {
            aBoolean1015 = false;
            g.setFont(new Font("Helvetica", 1, 20));
            g.setColor(Color.white);
            g.drawString("Error - unable to load game!", 50, 50);
            g.drawString("To play RuneScape make sure you play from", 50, 100);
            g.drawString("http://www.runescape.com", 50, 150);
        }
        if(aBoolean848)
        {
            aBoolean1015 = false;
            g.setColor(Color.yellow);
            int j = 35;
            g.drawString("Error a copy of RuneScape already appears to be loaded", 30, j);
            j += 50;
            g.setColor(Color.white);
            g.drawString("To fix this try the following (in order):", 30, j);
            j += 50;
            g.setColor(Color.white);
            g.setFont(new Font("Helvetica", 1, 12));
            g.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, j);
            j += 30;
            g.drawString("2: Try rebooting your computer, and reloading", 30, j);
            j += 30;
        }
    }

    public void parseTrackedPlayerUpdateMasks(int i, int j, Buffer class39_sub3_sub3)
    {
        if(i != -26716)
            aBoolean1124 = !aBoolean1124;
        for(int k = 0; k < anInt876; k++)
        {
            int l = anIntArray877[k];
            Player player = players[l];
            int i1 = class39_sub3_sub3.readUByte();
            if((i1 & 0x20) != 0)
                i1 += class39_sub3_sub3.readUByte() << 8;
            parsePlayerSyncMasks(player, class39_sub3_sub3, l, 0, i1);
        }

    }

    public void method83(int i)
    {
        Class27.aClass35_404.method363();
        Class27.aClass35_391.method363();
        while(i >= 0) 
            method6();
        Class47.aClass35_816.method363();
        Class4.aClass35_61.method363();
        Class4.aClass35_70.method363();
        Player.aClass35_1761.method363();
        SpotAnim.aClass35_200.method363();
    }

    public void method84(int i)
    {
        if(aClass14_1067 != null)
            return;
        super.aClass14_16 = null;
        aClass14_845 = null;
        aClass14_843 = null;
        aClass14_842 = null;
        aClass14_844 = null;
        aClass14_1240 = null;
        aClass14_1241 = null;
        aClass14_1242 = null;
        aClass14_1070 = new Class14(method11(-489), 265, 45981, 128);
        Class39_Sub3_Sub4.method476(false);
        aClass14_1071 = new Class14(method11(-489), 265, 45981, 128);
        Class39_Sub3_Sub4.method476(false);
        aClass14_1067 = new Class14(method11(-489), 171, 45981, 509);
        Class39_Sub3_Sub4.method476(false);
        if(i >= 0)
            aBoolean1295 = !aBoolean1295;
        aClass14_1068 = new Class14(method11(-489), 132, 45981, 360);
        Class39_Sub3_Sub4.method476(false);
        aClass14_1069 = new Class14(method11(-489), 200, 45981, 360);
        Class39_Sub3_Sub4.method476(false);
        aClass14_1072 = new Class14(method11(-489), 238, 45981, 202);
        Class39_Sub3_Sub4.method476(false);
        aClass14_1073 = new Class14(method11(-489), 238, 45981, 203);
        Class39_Sub3_Sub4.method476(false);
        aClass14_1074 = new Class14(method11(-489), 94, 45981, 74);
        Class39_Sub3_Sub4.method476(false);
        aClass14_1075 = new Class14(method11(-489), 94, 45981, 75);
        Class39_Sub3_Sub4.method476(false);
        if(aClass10_1077 != null)
        {
            method38(-21339);
            method20(180);
        }
        aBoolean1148 = true;
    }

    public void method85(boolean flag, int i)
    {
        if(i <= 0)
            return;
        for(int j = 0; j < anInt900; j++)
        {
            Class39_Sub3_Sub2_Sub5_Sub2 class39_sub3_sub2_sub5_sub2 = aClass39_Sub3_Sub2_Sub5_Sub2Array899[anIntArray901[j]];
            int k = 0x20000000 + (anIntArray901[j] << 14);
            if(class39_sub3_sub2_sub5_sub2 == null || !class39_sub3_sub2_sub5_sub2.method415(true) || class39_sub3_sub2_sub5_sub2.aClass47_1772.aBoolean791 != flag || !class39_sub3_sub2_sub5_sub2.aClass47_1772.method599((byte)4))
                continue;
            int l = ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1621 >> 7;
            int i1 = ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1622 >> 7;
            if(l < 0 || l >= 104 || i1 < 0 || i1 >= 104)
                continue;
            if(((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1608 == 1 && (((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1621 & 0x7f) == 64 && (((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1622 & 0x7f) == 64)
            {
                if(anIntArrayArray942[l][i1] == anInt1200)
                    continue;
                anIntArrayArray942[l][i1] = anInt1200;
            }
            if(!class39_sub3_sub2_sub5_sub2.aClass47_1772.aBoolean786)
                k += 0x80000000;
            aClass31_868.method302(((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1622, method21(((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1621, ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1622, myHeightLevel, 43591), k, ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1623, myHeightLevel, ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).aBoolean1592, ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1621, false, class39_sub3_sub2_sub5_sub2, (((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1608 - 1) * 64 + 60);
        }

    }

    public boolean method86(int i)
    {
        if(i != 0)
            currentOpcode = -1;
        return Signlink.wavereplay();
    }

    public void method87(int i)
    {
        if(super.aClass14_16 != null)
            return;
        method130(false);
        aClass14_1067 = null;
        aClass14_1068 = null;
        aClass14_1069 = null;
        aClass14_1070 = null;
        aClass14_1071 = null;
        aClass14_1072 = null;
        aClass14_1073 = null;
        aClass14_1074 = null;
        aClass14_1075 = null;
        aClass14_845 = null;
        if(i <= 0)
        {
            return;
        } else
        {
            aClass14_843 = null;
            aClass14_842 = null;
            aClass14_844 = null;
            aClass14_1240 = null;
            aClass14_1241 = null;
            aClass14_1242 = null;
            super.aClass14_16 = new Class14(method11(-489), 503, 45981, 765);
            aBoolean1148 = true;
            return;
        }
    }

    public void method6()
    {
        drawLoadingString("Starting up", 27936, 20);
        if(Signlink.sunjava)
            super.anInt9 = 5;
        if(aBoolean945)
        {
            aBoolean848 = true;
            return;
        }
        aBoolean945 = true;
        boolean flag = false;
        String s = method25(243);
        if(s.endsWith("jagex.com"))
            flag = true;
        if(s.endsWith("runescape.com"))
            flag = true;
        if(s.endsWith("192.168.1.2"))
            flag = true;
        if(s.endsWith("192.168.1.231"))
            flag = true;
        if(s.endsWith("192.168.1.229"))
            flag = true;
        if(s.endsWith("192.168.1.228"))
            flag = true;
        if(s.endsWith("192.168.1.227"))
            flag = true;
        if(s.endsWith("192.168.1.226"))
            flag = true;
        if(s.endsWith("192.168.1.224"))
            flag = true;
        if(s.endsWith("192.168.1.223"))
            flag = true;
        if(s.endsWith("127.0.0.1"))
            flag = true;
        if(!flag)
        {
            aBoolean1084 = true;
            return;
        }
        if(Signlink.cache_dat != null)
        {
            for(int i = 0; i < 5; i++)
                aClass13Array1062[i] = new Class13(0x7a120, i + 1, (byte)7, Signlink.cache_dat, Signlink.cache_idx[i]);

        }
        try
        {
            method147(-31374);
            aClass10_1077 = method151(1, "title screen", 25, "title", (byte)-83, archiveChecksums[1]);
            aClass39_Sub3_Sub4_Sub2_1097 = new Class39_Sub3_Sub4_Sub2("p11_full", (byte)-40, false, aClass10_1077);
            aClass39_Sub3_Sub4_Sub2_1098 = new Class39_Sub3_Sub4_Sub2("p12_full", (byte)-40, false, aClass10_1077);
            aClass39_Sub3_Sub4_Sub2_1099 = new Class39_Sub3_Sub4_Sub2("b12_full", (byte)-40, false, aClass10_1077);
            aClass39_Sub3_Sub4_Sub2_1100 = new Class39_Sub3_Sub4_Sub2("q8_full", (byte)-40, true, aClass10_1077);
            method38(-21339);
            method20(180);
            Class10 class10 = method151(2, "config", 30, "config", (byte)-83, archiveChecksums[2]);
            Class10 class10_1 = method151(3, "interface", 35, "interface", (byte)-83, archiveChecksums[3]);
            Class10 class10_2 = method151(4, "2d graphics", 40, "media", (byte)-83, archiveChecksums[4]);
            Class10 class10_3 = method151(6, "textures", 45, "textures", (byte)-83, archiveChecksums[6]);
            Class10 class10_4 = method151(7, "chat system", 50, "wordenc", (byte)-83, archiveChecksums[7]);
            Class10 class10_5 = method151(8, "sound effects", 55, "sounds", (byte)-83, archiveChecksums[8]);
            aByteArrayArrayArray1076 = new byte[4][104][104];
            anIntArrayArrayArray1179 = new int[4][105][105];
            aClass31_868 = new Class31(anIntArrayArrayArray1179, 104, 4, (byte)72, 104);
            for(int j = 0; j < 4; j++)
                aClass3Array964[j] = new Class3(0, 104, 104);

            aClass39_Sub3_Sub4_Sub4_1220 = new Class39_Sub3_Sub4_Sub4(512, 512);
            Class10 class10_6 = method151(5, "update list", 60, "versionlist", (byte)-83, archiveChecksums[5]);
            drawLoadingString("Connecting to update server", 27936, 60);
            aOnDemandClient_1273 = new OnDemandClient();
            aOnDemandClient_1273.method232(class10_6, this);
            Class33.method346(aOnDemandClient_1273.method231((byte)3));
            Class39_Sub3_Sub2_Sub4.method384(aOnDemandClient_1273.method238(0, false), aOnDemandClient_1273);
            if(!highMemory)
            {
                anInt939 = 0;
                aBoolean940 = true;
                aOnDemandClient_1273.method227(2, anInt939);
                while(aOnDemandClient_1273.method229() > 0)
                {
                    method28((byte)3);
                    try
                    {
                        Thread.sleep(100L);
                    }
                    catch(Exception _ex) { }
                    if(aOnDemandClient_1273.anInt1341 > 3)
                    {
                        method128("ondemand");
                        return;
                    }
                }
            }
            drawLoadingString("Requesting animations", 27936, 65);
            int k = aOnDemandClient_1273.method238(1, false);
            for(int i1 = 0; i1 < k; i1++)
                aOnDemandClient_1273.method227(1, i1);

            while(aOnDemandClient_1273.method229() > 0)
            {
                int j1 = k - aOnDemandClient_1273.method229();
                if(j1 > 0)
                    drawLoadingString("Loading animations - " + (j1 * 100) / k + "%", 27936, 65);
                method28((byte)3);
                try
                {
                    Thread.sleep(100L);
                }
                catch(Exception _ex) { }
                if(aOnDemandClient_1273.anInt1341 > 3)
                {
                    method128("ondemand");
                    return;
                }
            }
            drawLoadingString("Requesting models", 27936, 70);
            k = aOnDemandClient_1273.method238(0, false);
            for(int k1 = 0; k1 < k; k1++)
            {
                int l1 = aOnDemandClient_1273.method243(true, k1);
                if((l1 & 1) != 0)
                    aOnDemandClient_1273.method227(0, k1);
            }

            k = aOnDemandClient_1273.method229();
            while(aOnDemandClient_1273.method229() > 0)
            {
                int i2 = k - aOnDemandClient_1273.method229();
                if(i2 > 0)
                    drawLoadingString("Loading models - " + (i2 * 100) / k + "%", 27936, 70);
                method28((byte)3);
                try
                {
                    Thread.sleep(100L);
                }
                catch(Exception _ex) { }
            }
            if(aClass13Array1062[0] != null)
            {
                drawLoadingString("Requesting maps", 27936, 75);
                aOnDemandClient_1273.method227(3, aOnDemandClient_1273.method242(48, 208, 47, 0));
                aOnDemandClient_1273.method227(3, aOnDemandClient_1273.method242(48, 208, 47, 1));
                aOnDemandClient_1273.method227(3, aOnDemandClient_1273.method242(48, 208, 48, 0));
                aOnDemandClient_1273.method227(3, aOnDemandClient_1273.method242(48, 208, 48, 1));
                aOnDemandClient_1273.method227(3, aOnDemandClient_1273.method242(48, 208, 49, 0));
                aOnDemandClient_1273.method227(3, aOnDemandClient_1273.method242(48, 208, 49, 1));
                aOnDemandClient_1273.method227(3, aOnDemandClient_1273.method242(47, 208, 47, 0));
                aOnDemandClient_1273.method227(3, aOnDemandClient_1273.method242(47, 208, 47, 1));
                aOnDemandClient_1273.method227(3, aOnDemandClient_1273.method242(47, 208, 48, 0));
                aOnDemandClient_1273.method227(3, aOnDemandClient_1273.method242(47, 208, 48, 1));
                aOnDemandClient_1273.method227(3, aOnDemandClient_1273.method242(148, 208, 48, 0));
                aOnDemandClient_1273.method227(3, aOnDemandClient_1273.method242(148, 208, 48, 1));
                k = aOnDemandClient_1273.method229();
                while(aOnDemandClient_1273.method229() > 0)
                {
                    int j2 = k - aOnDemandClient_1273.method229();
                    if(j2 > 0)
                        drawLoadingString("Loading maps - " + (j2 * 100) / k + "%", 27936, 75);
                    method28((byte)3);
                    try
                    {
                        Thread.sleep(100L);
                    }
                    catch(Exception _ex) { }
                }
            }
            k = aOnDemandClient_1273.method238(0, false);
            for(int k2 = 0; k2 < k; k2++)
            {
                int l2 = aOnDemandClient_1273.method243(true, k2);
                byte byte0 = 0;
                if((l2 & 8) != 0)
                    byte0 = 10;
                else
                if((l2 & 0x20) != 0)
                    byte0 = 9;
                else
                if((l2 & 0x10) != 0)
                    byte0 = 8;
                else
                if((l2 & 0x40) != 0)
                    byte0 = 7;
                else
                if((l2 & 0x80) != 0)
                    byte0 = 6;
                else
                if((l2 & 2) != 0)
                    byte0 = 5;
                else
                if((l2 & 4) != 0)
                    byte0 = 4;
                if((l2 & 1) != 0)
                    byte0 = 3;
                if(byte0 != 0)
                    aOnDemandClient_1273.method235(0, byte0, k2, 462);
            }

            aOnDemandClient_1273.method226(members, anInt1275);
            if(!highMemory)
            {
                int l = aOnDemandClient_1273.method238(2, false);
                for(int i3 = 1; i3 < l; i3++)
                    if(aOnDemandClient_1273.method230(i3, false))
                        aOnDemandClient_1273.method235(2, (byte)1, i3, 462);

            }
            drawLoadingString("Unpacking media", 27936, 80);
            aClass39_Sub3_Sub4_Sub3_953 = new Class39_Sub3_Sub4_Sub3(class10_2, "invback", 0);
            aClass39_Sub3_Sub4_Sub3_955 = new Class39_Sub3_Sub4_Sub3(class10_2, "chatback", 0);
            aClass39_Sub3_Sub4_Sub3_954 = new Class39_Sub3_Sub4_Sub3(class10_2, "mapback", 0);
            aClass39_Sub3_Sub4_Sub3_984 = new Class39_Sub3_Sub4_Sub3(class10_2, "backbase1", 0);
            aClass39_Sub3_Sub4_Sub3_985 = new Class39_Sub3_Sub4_Sub3(class10_2, "backbase2", 0);
            aClass39_Sub3_Sub4_Sub3_986 = new Class39_Sub3_Sub4_Sub3(class10_2, "backhmid1", 0);
            for(int j3 = 0; j3 < 13; j3++)
                aClass39_Sub3_Sub4_Sub3Array869[j3] = new Class39_Sub3_Sub4_Sub3(class10_2, "sideicons", j3);

            aClass39_Sub3_Sub4_Sub4_1157 = new Class39_Sub3_Sub4_Sub4(class10_2, "compass", 0);
            aClass39_Sub3_Sub4_Sub4_1025 = new Class39_Sub3_Sub4_Sub4(class10_2, "mapedge", 0);
            aClass39_Sub3_Sub4_Sub4_1025.method527(0);
            for(int k3 = 0; k3 < 72; k3++)
                aClass39_Sub3_Sub4_Sub3Array1301[k3] = new Class39_Sub3_Sub4_Sub3(class10_2, "mapscene", k3);

            for(int l3 = 0; l3 < 63; l3++)
                aClass39_Sub3_Sub4_Sub4Array1119[l3] = new Class39_Sub3_Sub4_Sub4(class10_2, "mapfunction", l3);

            for(int i4 = 0; i4 < 5; i4++)
                aClass39_Sub3_Sub4_Sub4Array1204[i4] = new Class39_Sub3_Sub4_Sub4(class10_2, "hitmarks", i4);

            for(int j4 = 0; j4 < 6; j4++)
                aClass39_Sub3_Sub4_Sub4Array1086[j4] = new Class39_Sub3_Sub4_Sub4(class10_2, "headicons_pk", j4);

            for(int k4 = 0; k4 < 9; k4++)
                aClass39_Sub3_Sub4_Sub4Array1130[k4] = new Class39_Sub3_Sub4_Sub4(class10_2, "headicons_prayer", k4);

            for(int l4 = 0; l4 < 6; l4++)
                aClass39_Sub3_Sub4_Sub4Array946[l4] = new Class39_Sub3_Sub4_Sub4(class10_2, "headicons_hint", l4);

            aClass39_Sub3_Sub4_Sub4_925 = new Class39_Sub3_Sub4_Sub4(class10_2, "overlay_multiway", 0);
            aClass39_Sub3_Sub4_Sub4_913 = new Class39_Sub3_Sub4_Sub4(class10_2, "mapmarker", 0);
            aClass39_Sub3_Sub4_Sub4_914 = new Class39_Sub3_Sub4_Sub4(class10_2, "mapmarker", 1);
            for(int i5 = 0; i5 < 8; i5++)
                aClass39_Sub3_Sub4_Sub4Array912[i5] = new Class39_Sub3_Sub4_Sub4(class10_2, "cross", i5);

            aClass39_Sub3_Sub4_Sub4_1036 = new Class39_Sub3_Sub4_Sub4(class10_2, "mapdots", 0);
            aClass39_Sub3_Sub4_Sub4_1037 = new Class39_Sub3_Sub4_Sub4(class10_2, "mapdots", 1);
            aClass39_Sub3_Sub4_Sub4_1038 = new Class39_Sub3_Sub4_Sub4(class10_2, "mapdots", 2);
            aClass39_Sub3_Sub4_Sub4_1039 = new Class39_Sub3_Sub4_Sub4(class10_2, "mapdots", 3);
            aClass39_Sub3_Sub4_Sub4_1040 = new Class39_Sub3_Sub4_Sub4(class10_2, "mapdots", 4);
            aClass39_Sub3_Sub4_Sub3_972 = new Class39_Sub3_Sub4_Sub3(class10_2, "scrollbar", 0);
            aClass39_Sub3_Sub4_Sub3_973 = new Class39_Sub3_Sub4_Sub3(class10_2, "scrollbar", 1);
            aClass39_Sub3_Sub4_Sub3_1138 = new Class39_Sub3_Sub4_Sub3(class10_2, "redstone1", 0);
            aClass39_Sub3_Sub4_Sub3_1139 = new Class39_Sub3_Sub4_Sub3(class10_2, "redstone2", 0);
            aClass39_Sub3_Sub4_Sub3_1140 = new Class39_Sub3_Sub4_Sub3(class10_2, "redstone3", 0);
            aClass39_Sub3_Sub4_Sub3_1141 = new Class39_Sub3_Sub4_Sub3(class10_2, "redstone1", 0);
            aClass39_Sub3_Sub4_Sub3_1141.method520(anInt1081);
            aClass39_Sub3_Sub4_Sub3_1142 = new Class39_Sub3_Sub4_Sub3(class10_2, "redstone2", 0);
            aClass39_Sub3_Sub4_Sub3_1142.method520(anInt1081);
            aClass39_Sub3_Sub4_Sub3_1277 = new Class39_Sub3_Sub4_Sub3(class10_2, "redstone1", 0);
            aClass39_Sub3_Sub4_Sub3_1277.method521(0);
            aClass39_Sub3_Sub4_Sub3_1278 = new Class39_Sub3_Sub4_Sub3(class10_2, "redstone2", 0);
            aClass39_Sub3_Sub4_Sub3_1278.method521(0);
            aClass39_Sub3_Sub4_Sub3_1279 = new Class39_Sub3_Sub4_Sub3(class10_2, "redstone3", 0);
            aClass39_Sub3_Sub4_Sub3_1279.method521(0);
            aClass39_Sub3_Sub4_Sub3_1280 = new Class39_Sub3_Sub4_Sub3(class10_2, "redstone1", 0);
            aClass39_Sub3_Sub4_Sub3_1280.method520(anInt1081);
            aClass39_Sub3_Sub4_Sub3_1280.method521(0);
            aClass39_Sub3_Sub4_Sub3_1281 = new Class39_Sub3_Sub4_Sub3(class10_2, "redstone2", 0);
            aClass39_Sub3_Sub4_Sub3_1281.method520(anInt1081);
            aClass39_Sub3_Sub4_Sub3_1281.method521(0);
            for(int j5 = 0; j5 < 2; j5++)
                aClass39_Sub3_Sub4_Sub3Array1126[j5] = new Class39_Sub3_Sub4_Sub3(class10_2, "mod_icons", j5);

            Class39_Sub3_Sub4_Sub4 class39_sub3_sub4_sub4 = new Class39_Sub3_Sub4_Sub4(class10_2, "backleft1", 0);
            aClass14_1244 = new Class14(method11(-489), class39_sub3_sub4_sub4.anInt1733, 45981, class39_sub3_sub4_sub4.anInt1732);
            class39_sub3_sub4_sub4.method528(0, 0, 1);
            class39_sub3_sub4_sub4 = new Class39_Sub3_Sub4_Sub4(class10_2, "backleft2", 0);
            aClass14_1245 = new Class14(method11(-489), class39_sub3_sub4_sub4.anInt1733, 45981, class39_sub3_sub4_sub4.anInt1732);
            class39_sub3_sub4_sub4.method528(0, 0, 1);
            class39_sub3_sub4_sub4 = new Class39_Sub3_Sub4_Sub4(class10_2, "backright1", 0);
            aClass14_1246 = new Class14(method11(-489), class39_sub3_sub4_sub4.anInt1733, 45981, class39_sub3_sub4_sub4.anInt1732);
            class39_sub3_sub4_sub4.method528(0, 0, 1);
            class39_sub3_sub4_sub4 = new Class39_Sub3_Sub4_Sub4(class10_2, "backright2", 0);
            aClass14_1247 = new Class14(method11(-489), class39_sub3_sub4_sub4.anInt1733, 45981, class39_sub3_sub4_sub4.anInt1732);
            class39_sub3_sub4_sub4.method528(0, 0, 1);
            class39_sub3_sub4_sub4 = new Class39_Sub3_Sub4_Sub4(class10_2, "backtop1", 0);
            aClass14_1248 = new Class14(method11(-489), class39_sub3_sub4_sub4.anInt1733, 45981, class39_sub3_sub4_sub4.anInt1732);
            class39_sub3_sub4_sub4.method528(0, 0, 1);
            class39_sub3_sub4_sub4 = new Class39_Sub3_Sub4_Sub4(class10_2, "backvmid1", 0);
            aClass14_1249 = new Class14(method11(-489), class39_sub3_sub4_sub4.anInt1733, 45981, class39_sub3_sub4_sub4.anInt1732);
            class39_sub3_sub4_sub4.method528(0, 0, 1);
            class39_sub3_sub4_sub4 = new Class39_Sub3_Sub4_Sub4(class10_2, "backvmid2", 0);
            aClass14_1250 = new Class14(method11(-489), class39_sub3_sub4_sub4.anInt1733, 45981, class39_sub3_sub4_sub4.anInt1732);
            class39_sub3_sub4_sub4.method528(0, 0, 1);
            class39_sub3_sub4_sub4 = new Class39_Sub3_Sub4_Sub4(class10_2, "backvmid3", 0);
            aClass14_1251 = new Class14(method11(-489), class39_sub3_sub4_sub4.anInt1733, 45981, class39_sub3_sub4_sub4.anInt1732);
            class39_sub3_sub4_sub4.method528(0, 0, 1);
            class39_sub3_sub4_sub4 = new Class39_Sub3_Sub4_Sub4(class10_2, "backhmid2", 0);
            aClass14_1252 = new Class14(method11(-489), class39_sub3_sub4_sub4.anInt1733, 45981, class39_sub3_sub4_sub4.anInt1732);
            class39_sub3_sub4_sub4.method528(0, 0, 1);
            int k5 = (int)(Math.random() * 21D) - 10;
            int l5 = (int)(Math.random() * 21D) - 10;
            int i6 = (int)(Math.random() * 21D) - 10;
            int j6 = (int)(Math.random() * 41D) - 20;
            for(int k6 = 0; k6 < 100; k6++)
            {
                if(aClass39_Sub3_Sub4_Sub4Array1119[k6] != null)
                    aClass39_Sub3_Sub4_Sub4Array1119[k6].method526(l5 + j6, i6 + j6, anInt1217, k5 + j6);
                if(aClass39_Sub3_Sub4_Sub3Array1301[k6] != null)
                    aClass39_Sub3_Sub4_Sub3Array1301[k6].method522(l5 + j6, i6 + j6, anInt1217, k5 + j6);
            }

            drawLoadingString("Unpacking textures", 27936, 83);
            Class39_Sub3_Sub4_Sub1.method490(class10_3, true);
            Class39_Sub3_Sub4_Sub1.method494(true, 0.80000000000000004D);
            Class39_Sub3_Sub4_Sub1.method489(0, 20);
            drawLoadingString("Unpacking config", 27936, 86);
            SEQ.initialize((byte)6, class10);
            Class27.method271(class10);
            Class45.method584((byte)6, class10);
            Class4.method177(class10);
            Class47.method596(class10);
            IDK.initialize((byte)6, class10);
            SpotAnim.initialize((byte)6, class10);
            Class42.method544((byte)6, class10);
            Class6.method190((byte)6, class10);
            Class4.aBoolean65 = members;
            if(!highMemory) {
                drawLoadingString("Unpacking sounds", 27936, 90);
                byte abyte0[] = class10_5.method193("sounds.dat", null);
                Buffer class39_sub3_sub3 = new Buffer(abyte0);
                Class12.method197((byte)6, class39_sub3_sub3);
            }
            drawLoadingString("Unpacking interfaces", 27936, 95);
            Class39_Sub3_Sub4_Sub2 aclass39_sub3_sub4_sub2[] = {
                aClass39_Sub3_Sub4_Sub2_1097, aClass39_Sub3_Sub4_Sub2_1098, aClass39_Sub3_Sub4_Sub2_1099, aClass39_Sub3_Sub4_Sub2_1100
            };
            RSInterface.method359((byte)0, class10_2, aclass39_sub3_sub4_sub2, class10_1);
            drawLoadingString("Preparing game engine", 27936, 100);
            for(int l6 = 0; l6 < 33; l6++) {
                int i7 = 999;
                int k7 = 0;
                for(int i8 = 0; i8 < 34; i8++) {
                    if(aClass39_Sub3_Sub4_Sub3_954.aByteArray1715[i8 + l6 * aClass39_Sub3_Sub4_Sub3_954.anInt1717] == 0) {
                        if(i7 == 999)
                            i7 = i8;
                        continue;
                    }
                    if(i7 == 999)
                        continue;
                    k7 = i8;
                    break;
                }
                anIntArray893[l6] = i7;
                anIntArray1021[l6] = k7 - i7;
            }

            for(int j7 = 5; j7 < 156; j7++)
            {
                int l7 = 999;
                int j8 = 0;
                for(int l8 = 25; l8 < 172; l8++)
                {
                    if(aClass39_Sub3_Sub4_Sub3_954.aByteArray1715[l8 + j7 * aClass39_Sub3_Sub4_Sub3_954.anInt1717] == 0 && (l8 > 34 || j7 > 34))
                    {
                        if(l7 == 999)
                            l7 = l8;
                        continue;
                    }
                    if(l7 == 999)
                        continue;
                    j8 = l8;
                    break;
                }

                anIntArray854[j7 - 5] = l7 - 25;
                anIntArray1052[j7 - 5] = j8 - l7;
            }

            Class39_Sub3_Sub4_Sub1.method487(503, 765, 4);
            anIntArray1318 = Class39_Sub3_Sub4_Sub1.anIntArray1680;
            Class39_Sub3_Sub4_Sub1.method487(96, 479, 4);
            anIntArray1315 = Class39_Sub3_Sub4_Sub1.anIntArray1680;
            Class39_Sub3_Sub4_Sub1.method487(261, 190, 4);
            anIntArray1316 = Class39_Sub3_Sub4_Sub1.anIntArray1680;
            Class39_Sub3_Sub4_Sub1.method487(334, 512, 4);
            anIntArray1317 = Class39_Sub3_Sub4_Sub1.anIntArray1680;
            int ai[] = new int[9];
            for(int k8 = 0; k8 < 9; k8++)
            {
                int i9 = 128 + k8 * 32 + 15;
                int j9 = 600 + i9 * 3;
                int k9 = Class39_Sub3_Sub4_Sub1.anIntArray1678[i9];
                ai[k8] = j9 * k9 >> 16;
            }

            Class31.method327(512, 334, ai, 500, (byte)4, 800);
            Class44.method546(class10_4);
            aClass8_1151 = new Class8(this, true);
            method12(aClass8_1151, 10);
            Class39_Sub3_Sub2_Sub6.aGame1657 = this;
            Class27.aGame371 = this;
            Class47.aGame815 = this;
            return;
        }
        catch(Exception exception)
        {
            Signlink.reporterror("loaderror " + aString1201 + " " + anInt1026);
        }
        aBoolean1132 = true;
    }

    public void method88(boolean flag)
    {
        if(flag)
            return;
        if(anInt1116 == 0)
        {
            int i = super.anInt13 / 2 - 80;
            int l = super.anInt14 / 2 + 20;
            l += 20;
            if(super.anInt29 == 1 && super.anInt30 >= i - 75 && super.anInt30 <= i + 75 && super.anInt31 >= l - 20 && super.anInt31 <= l + 20)
            {
                anInt1116 = 3;
                anInt1292 = 0;
            }
            i = super.anInt13 / 2 + 80;
            if(super.anInt29 == 1 && super.anInt30 >= i - 75 && super.anInt30 <= i + 75 && super.anInt31 >= l - 20 && super.anInt31 <= l + 20)
            {
                loginScreenTextLine1 = "";
                loginScreenTextLine2 = "Enter your username & password.";
                anInt1116 = 2;
                anInt1292 = 0;
                return;
            }
        } else
        {
            if(anInt1116 == 2)
            {
                int j = super.anInt14 / 2 - 40;
                j += 30;
                j += 25;
                if(super.anInt29 == 1 && super.anInt31 >= j - 15 && super.anInt31 < j)
                    anInt1292 = 0;
                j += 15;
                if(super.anInt29 == 1 && super.anInt31 >= j - 15 && super.anInt31 < j)
                    anInt1292 = 1;
                j += 15;
                int i1 = super.anInt13 / 2 - 80;
                int k1 = super.anInt14 / 2 + 50;
                k1 += 20;
                if(super.anInt29 == 1 && super.anInt30 >= i1 - 75 && super.anInt30 <= i1 + 75 && super.anInt31 >= k1 - 20 && super.anInt31 <= k1 + 20)
                {
                    anInt1261 = 0;
                    login(enteredUsername, aString1178, false);
                    if(aBoolean952)
                        return;
                }
                i1 = super.anInt13 / 2 + 80;
                if(super.anInt29 == 1 && super.anInt30 >= i1 - 75 && super.anInt30 <= i1 + 75 && super.anInt31 >= k1 - 20 && super.anInt31 <= k1 + 20)
                {
                    anInt1116 = 0;
                    enteredUsername = "";
                    aString1178 = "";
                }
                do
                {
                    int l1 = method5(aByte1182);
                    if(l1 == -1)
                        break;
                    boolean flag1 = false;
                    for(int i2 = 0; i2 < aString1224.length(); i2++)
                    {
                        if(l1 != aString1224.charAt(i2))
                            continue;
                        flag1 = true;
                        break;
                    }

                    if(anInt1292 == 0)
                    {
                        if(l1 == 8 && enteredUsername.length() > 0)
                            enteredUsername = enteredUsername.substring(0, enteredUsername.length() - 1);
                        if(l1 == 9 || l1 == 10 || l1 == 13)
                            anInt1292 = 1;
                        if(flag1)
                            enteredUsername += (char)l1;
                        if(enteredUsername.length() > 12)
                            enteredUsername = enteredUsername.substring(0, 12);
                    } else
                    if(anInt1292 == 1)
                    {
                        if(l1 == 8 && aString1178.length() > 0)
                            aString1178 = aString1178.substring(0, aString1178.length() - 1);
                        if(l1 == 9 || l1 == 10 || l1 == 13)
                            anInt1292 = 0;
                        if(flag1)
                            aString1178 += (char)l1;
                        if(aString1178.length() > 20)
                            aString1178 = aString1178.substring(0, 20);
                    }
                } while(true);
                return;
            }
            if(anInt1116 == 3)
            {
                int k = super.anInt13 / 2;
                int j1 = super.anInt14 / 2 + 50;
                j1 += 20;
                if(super.anInt29 == 1 && super.anInt30 >= k - 75 && super.anInt30 <= k + 75 && super.anInt31 >= j1 - 20 && super.anInt31 <= j1 + 20)
                    anInt1116 = 0;
            }
        }
    }

    public void method89(int i)
    {
        if(aClass14_845 != null)
            return;
        method130(false);
        super.aClass14_16 = null;
        aClass14_1067 = null;
        aClass14_1068 = null;
        aClass14_1069 = null;
        aClass14_1070 = null;
        if(i <= 0)
            currentOpcode = -1;
        aClass14_1071 = null;
        aClass14_1072 = null;
        aClass14_1073 = null;
        aClass14_1074 = null;
        aClass14_1075 = null;
        aClass14_845 = new Class14(method11(-489), 96, 45981, 479);
        aClass14_843 = new Class14(method11(-489), 156, 45981, 172);
        Class39_Sub3_Sub4.method476(false);
        aClass39_Sub3_Sub4_Sub3_954.method523(0, 22912, 0);
        aClass14_842 = new Class14(method11(-489), 261, 45981, 190);
        aClass14_844 = new Class14(method11(-489), 334, 45981, 512);
        Class39_Sub3_Sub4.method476(false);
        aClass14_1240 = new Class14(method11(-489), 50, 45981, 496);
        aClass14_1241 = new Class14(method11(-489), 37, 45981, 269);
        aClass14_1242 = new Class14(method11(-489), 45, 45981, 249);
        aBoolean1148 = true;
        aClass14_844.method207(-5281);
        Class39_Sub3_Sub4_Sub1.anIntArray1680 = anIntArray1317;
    }

    public void method90(byte byte0)
    {
        if(byte0 != 0)
            aBoolean966 = !aBoolean966;
        if(anInt1203 == 2)
        {
            for(Class39_Sub1 class39_sub1 = (Class39_Sub1)aClass5_994.method185(); class39_sub1 != null; class39_sub1 = (Class39_Sub1)aClass5_994.method187((byte)8))
            {
                if(class39_sub1.anInt1388 > 0)
                    class39_sub1.anInt1388--;
                if(class39_sub1.anInt1388 == 0)
                {
                    if(class39_sub1.anInt1381 < 0 || Class22.method248(class39_sub1.anInt1381, 0, class39_sub1.anInt1383))
                    {
                        method98(class39_sub1.anInt1385, class39_sub1.anInt1387, class39_sub1.anInt1382, class39_sub1.anInt1383, true, class39_sub1.anInt1386, class39_sub1.anInt1381, class39_sub1.anInt1384);
                        class39_sub1.method376();
                    }
                } else
                {
                    if(class39_sub1.anInt1389 > 0)
                        class39_sub1.anInt1389--;
                    if(class39_sub1.anInt1389 == 0 && class39_sub1.anInt1386 >= 1 && class39_sub1.anInt1387 >= 1 && class39_sub1.anInt1386 <= 102 && class39_sub1.anInt1387 <= 102 && (class39_sub1.anInt1390 < 0 || Class22.method248(class39_sub1.anInt1390, 0, class39_sub1.anInt1392)))
                    {
                        method98(class39_sub1.anInt1385, class39_sub1.anInt1387, class39_sub1.anInt1391, class39_sub1.anInt1392, true, class39_sub1.anInt1386, class39_sub1.anInt1390, class39_sub1.anInt1384);
                        class39_sub1.anInt1389 = -1;
                        if(class39_sub1.anInt1390 == class39_sub1.anInt1381 && class39_sub1.anInt1381 == -1)
                            class39_sub1.method376();
                        else
                        if(class39_sub1.anInt1390 == class39_sub1.anInt1381 && class39_sub1.anInt1391 == class39_sub1.anInt1382 && class39_sub1.anInt1392 == class39_sub1.anInt1383)
                            class39_sub1.method376();
                    }
                }
            }

        }
    }

    public void method91(long l, int i)
    {
        try
        {
            if(l == 0L)
                return;
            for(int j = 0; j < anInt1168; j++)
            {
                if(aLongArray879[j] != l)
                    continue;
                anInt1168--;
                needDrawTabArea = true;
                for(int k = j; k < anInt1168; k++)
                    aLongArray879[k] = aLongArray879[k + 1];

                outgoingVector.writeOpcode(202);
                outgoingVector.putLong(l);
                break;
            }

            while(i >= 0) 
                return;
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("97420, " + l + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method92(int i)
    {
        if(i >= 0)
            return;
        if(highMemory && anInt1203 == 2 && Class22.anInt306 != myHeightLevel)
        {
            method71(null, "Loading - please wait.", 22761);
            anInt1203 = 1;
            aLong1051 = System.currentTimeMillis();
        }
        if(anInt1203 == 1)
        {
            int j = method93((byte)8);
            if(j != 0 && System.currentTimeMillis() - aLong1051 > 0x57e40L)
            {
                Signlink.reporterror(enteredUsername + " glcfb " + serverKey + "," + j + "," + highMemory + "," + aClass13Array1062[0] + "," + aOnDemandClient_1273.method229() + "," + myHeightLevel + "," + anInt1088 + "," + anInt1089);
                aLong1051 = System.currentTimeMillis();
            }
        }
        if(anInt1203 == 2 && myHeightLevel != anInt1306)
        {
            anInt1306 = myHeightLevel;
            method127(myHeightLevel, (byte)0);
        }
    }

    public int method93(byte byte0)
    {
        for(int i = 0; i < aByteArrayArray1239.length; i++)
        {
            if(aByteArrayArray1239[i] == null && anIntArray937[i] != -1)
                return -1;
            if(aByteArrayArray1167[i] == null && anIntArray938[i] != -1)
                return -2;
        }

        boolean flag = true;
        for(int j = 0; j < aByteArrayArray1239.length; j++)
        {
            byte abyte0[] = aByteArrayArray1167[j];
            if(abyte0 != null)
            {
                int k = (anIntArray936[j] >> 8) * 64 - anInt989;
                int l = (anIntArray936[j] & 0xff) * 64 - anInt990;
                if(aBoolean1102)
                {
                    k = 10;
                    l = 10;
                }
                flag &= Class22.method264(49844, abyte0, l, k);
            }
        }

        if(!flag)
            return -3;
        if(aBoolean1163)
            return -4;
        anInt1203 = 2;
        Class22.anInt306 = myHeightLevel;
        method53(aByte957);
        outgoingVector.writeOpcode(92);
        if(byte0 == 8)
            byte0 = 0;
        else
            method6();
        return 0;
    }

    public void init() {
        nodeId = Integer.parseInt(getParameter("nodeid"));
        portOffset = Integer.parseInt(getParameter("portoff"));
        String s = getParameter("lowmem");
        if(s != null && s.equals("1")) {
        	initializeLowMemory();
        } else {
        	initializeHighMemory();
        }            
        String s1 = getParameter("free");
        if(s1 != null && s1.equals("1")) {
        	members = false;
        } else {
        	members = true;
        }            
        method2(503, 765, 4);
        loadRSAKeys();
    }

    public void method94(byte abyte0[], boolean flag, int i)
    {
        if(i != 4)
            aClass5ArrayArrayArray950 = null;
        if(!aBoolean926)
        {
            return;
        } else
        {
            Signlink.midifade = flag ? 1 : 0;
            Signlink.midisave(abyte0, abyte0.length);
            return;
        }
    }

    public void method95(byte byte0)
    {
        aClass14_843.method207(-5281);
        if(anInt923 == 2)
        {
            byte abyte0[] = aClass39_Sub3_Sub4_Sub3_954.aByteArray1715;
            int ai[] = Class39_Sub3_Sub4.anIntArray1459;
            int k2 = abyte0.length;
            for(int i5 = 0; i5 < k2; i5++)
                if(abyte0[i5] == 0)
                    ai[i5] = 0;

            aClass39_Sub3_Sub4_Sub4_1157.method534(0, anIntArray1021, 25, 0, 25, 256, 33, 35958, 33, anInt928, anIntArray893);
            aClass14_844.method207(-5281);
            Class39_Sub3_Sub4_Sub1.anIntArray1680 = anIntArray1317;
            return;
        }
        int i = anInt928 + anInt1234 & 0x7ff;
        int j = 48 + ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1621 / 32;
        if(byte0 == 9)
            byte0 = 0;
        else
            anInt1153 = decrypter.getNextKey();
        int l2 = 464 - ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1622 / 32;
        aClass39_Sub3_Sub4_Sub4_1220.method534(5, anIntArray1052, j, 25, l2, 256 + anInt881, 146, 35958, 151, i, anIntArray854);
        aClass39_Sub3_Sub4_Sub4_1157.method534(0, anIntArray1021, 25, 0, 25, 256, 33, 35958, 33, anInt928, anIntArray893);
        for(int j5 = 0; j5 < anInt1064; j5++)
        {
            int k = (anIntArray1065[j5] * 4 + 2) - ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1621 / 32;
            int i3 = (anIntArray1066[j5] * 4 + 2) - ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1622 / 32;
            method140(46599, i3, k, aClass39_Sub3_Sub4_Sub4Array1312[j5]);
        }

        for(int k5 = 0; k5 < 104; k5++)
        {
            for(int l5 = 0; l5 < 104; l5++)
            {
                Class5 class5 = aClass5ArrayArrayArray950[myHeightLevel][k5][l5];
                if(class5 != null)
                {
                    int l = (k5 * 4 + 2) - ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1621 / 32;
                    int j3 = (l5 * 4 + 2) - ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1622 / 32;
                    method140(46599, j3, l, aClass39_Sub3_Sub4_Sub4_1036);
                }
            }

        }

        for(int i6 = 0; i6 < anInt900; i6++)
        {
            Class39_Sub3_Sub2_Sub5_Sub2 class39_sub3_sub2_sub5_sub2 = aClass39_Sub3_Sub2_Sub5_Sub2Array899[anIntArray901[i6]];
            if(class39_sub3_sub2_sub5_sub2 != null && class39_sub3_sub2_sub5_sub2.method415(true))
            {
                Class47 class47 = class39_sub3_sub2_sub5_sub2.aClass47_1772;
                if(class47.anIntArray785 != null)
                    class47 = class47.method593(0);
                if(class47 != null && class47.aBoolean818 && class47.aBoolean786)
                {
                    int i1 = ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1621 / 32 - ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1621 / 32;
                    int k3 = ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1622 / 32 - ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1622 / 32;
                    method140(46599, k3, i1, aClass39_Sub3_Sub4_Sub4_1037);
                }
            }
        }

        for(int j6 = 0; j6 < playerCount; j6++)
        {
            Player player = players[playerIndices[j6]];
            if(player != null && player.method415(true))
            {
                int j1 = ((Class39_Sub3_Sub2_Sub5) (player)).anInt1621 / 32 - ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1621 / 32;
                int l3 = ((Class39_Sub3_Sub2_Sub5) (player)).anInt1622 / 32 - ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1622 / 32;
                boolean flag = false;
                long l6 = Class37.stringToLong(player.aString1754);
                for(int k6 = 0; k6 < anInt1190; k6++)
                {
                    if(l6 != aLongArray1050[k6] || anIntArray895[k6] == 0)
                        continue;
                    flag = true;
                    break;
                }

                boolean flag1 = false;
                if(myPlayer.anInt1753 != 0 && player.anInt1753 != 0 && myPlayer.anInt1753 == player.anInt1753)
                    flag1 = true;
                if(flag)
                    method140(46599, l3, j1, aClass39_Sub3_Sub4_Sub4_1039);
                else
                if(flag1)
                    method140(46599, l3, j1, aClass39_Sub3_Sub4_Sub4_1040);
                else
                    method140(46599, l3, j1, aClass39_Sub3_Sub4_Sub4_1038);
            }
        }

        if(anInt1149 != 0 && loopCycle % 20 < 10)
        {
            if(anInt1149 == 1 && anInt883 >= 0 && anInt883 < aClass39_Sub3_Sub2_Sub5_Sub2Array899.length)
            {
                Class39_Sub3_Sub2_Sub5_Sub2 class39_sub3_sub2_sub5_sub2_1 = aClass39_Sub3_Sub2_Sub5_Sub2Array899[anInt883];
                if(class39_sub3_sub2_sub5_sub2_1 != null)
                {
                    int k1 = ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2_1)).anInt1621 / 32 - ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1621 / 32;
                    int i4 = ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2_1)).anInt1622 / 32 - ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1622 / 32;
                    method110(aClass39_Sub3_Sub4_Sub4_914, aBoolean892, k1, i4);
                }
            }
            if(anInt1149 == 2)
            {
                int l1 = ((anInt1133 - anInt989) * 4 + 2) - ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1621 / 32;
                int j4 = ((anInt1134 - anInt990) * 4 + 2) - ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1622 / 32;
                method110(aClass39_Sub3_Sub4_Sub4_914, aBoolean892, l1, j4);
            }
            if(anInt1149 == 10 && anInt1017 >= 0 && anInt1017 < players.length)
            {
                Player player = players[anInt1017];
                if(player != null)
                {
                    int i2 = ((Class39_Sub3_Sub2_Sub5) (player)).anInt1621 / 32 - ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1621 / 32;
                    int k4 = ((Class39_Sub3_Sub2_Sub5) (player)).anInt1622 / 32 - ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1622 / 32;
                    method110(aClass39_Sub3_Sub4_Sub4_914, aBoolean892, i2, k4);
                }
            }
        }
        if(anInt1218 != 0)
        {
            int j2 = (anInt1218 * 4 + 2) - ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1621 / 32;
            int l4 = (anInt1219 * 4 + 2) - ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1622 / 32;
            method140(46599, l4, j2, aClass39_Sub3_Sub4_Sub4_913);
        }
        Class39_Sub3_Sub4.method478((byte)4, 78, 97, 0xffffff, 3, 3);
        aClass14_844.method207(-5281);
        Class39_Sub3_Sub4_Sub1.anIntArray1680 = anIntArray1317;
    }

    public void method96(int i)
    {
        anInt1200++;
        method146(true, 0);
        method85(true, 229);
        method146(false, 0);
        method85(false, 229);
        method104(0);
        method62(false);
        if(!aBoolean853)
        {
            int j = anInt927;
            if(anInt1005 / 256 > j)
                j = anInt1005 / 256;
            if(aBooleanArray1018[4] && anIntArray947[4] + 128 > j)
                j = anIntArray947[4] + 128;
            int l = anInt928 + anInt1269 & 0x7ff;
            method142(method21(((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1621, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1622, myHeightLevel, 43591) - 50, -727, l, anInt1225, j, anInt1226, 600 + j * 3);
        }
        int k;
        if(!aBoolean853)
            k = method114(false);
        else
            k = method115(true);
        int i1 = anInt1209;
        int j1 = anInt1210;
        int k1 = anInt1211;
        int l1 = anInt1212;
        int i2 = anInt1213;
        for(int j2 = 0; j2 < 5; j2++)
            if(aBooleanArray1018[j2])
            {
                int k2 = (int)((Math.random() * (double)(anIntArray1308[j2] * 2 + 1) - (double)anIntArray1308[j2]) + Math.sin((double)anIntArray1087[j2] * ((double)anIntArray941[j2] / 100D)) * (double)anIntArray947[j2]);
                if(j2 == 0)
                    anInt1209 += k2;
                if(j2 == 1)
                    anInt1210 += k2;
                if(j2 == 2)
                    anInt1211 += k2;
                if(j2 == 3)
                    anInt1213 = anInt1213 + k2 & 0x7ff;
                if(j2 == 4)
                {
                    anInt1212 += k2;
                    if(anInt1212 < 128)
                        anInt1212 = 128;
                    if(anInt1212 > 383)
                        anInt1212 = 383;
                }
            }

        int l2 = Class39_Sub3_Sub4_Sub1.anInt1689;
        Class39_Sub3_Sub2_Sub4.aBoolean1583 = true;
        Class39_Sub3_Sub2_Sub4.anInt1586 = 0;
        Class39_Sub3_Sub2_Sub4.anInt1584 = super.anInt23 - 4;
        Class39_Sub3_Sub2_Sub4.anInt1585 = super.anInt24 - 4;
        Class39_Sub3_Sub4.method476(false);
        if(i != -15737)
        {
            return;
        } else
        {
            aClass31_868.method330(anInt1211, anInt1210, anInt1209, anInt1213, 48199, anInt1212, k);
            aClass31_868.method305(9);
            method132(-376);
            method55(aByte983);
            method75(false, l2);
            method120(false);
            aClass14_844.method208(super.graphics, 966, 4, 4);
            anInt1209 = i1;
            anInt1210 = j1;
            anInt1211 = k1;
            anInt1212 = l1;
            anInt1213 = i2;
            return;
        }
    }

    public void method12(Runnable runnable, int i)
    {
        if(i > 10)
            i = 10;
        if(Signlink.mainapp != null)
        {
            Signlink.startthread(runnable, i);
            return;
        } else
        {
            super.method12(runnable, i);
            return;
        }
    }

    public void method97(int i, byte byte0)
    {
        int j = Class42.aClass42Array710[i].anInt718;
        if(byte0 != 87)
            anInt1274 = decrypter.getNextKey();
        if(j == 0)
            return;
        int k = anIntArray943[i];
        if(j == 1)
        {
            if(k == 1)
                Class39_Sub3_Sub4_Sub1.method494(true, 0.90000000000000002D);
            if(k == 2)
                Class39_Sub3_Sub4_Sub1.method494(true, 0.80000000000000004D);
            if(k == 3)
                Class39_Sub3_Sub4_Sub1.method494(true, 0.69999999999999996D);
            if(k == 4)
                Class39_Sub3_Sub4_Sub1.method494(true, 0.59999999999999998D);
            Class4.aClass35_70.method363();
            aBoolean1148 = true;
        }
        if(j == 3)
        {
            boolean flag = aBoolean926;
            if(k == 0)
            {
                method27(0, 7, aBoolean926);
                aBoolean926 = true;
            }
            if(k == 1)
            {
                method27(-400, 7, aBoolean926);
                aBoolean926 = true;
            }
            if(k == 2)
            {
                method27(-800, 7, aBoolean926);
                aBoolean926 = true;
            }
            if(k == 3)
            {
                method27(-1200, 7, aBoolean926);
                aBoolean926 = true;
            }
            if(k == 4)
                aBoolean926 = false;
            if(aBoolean926 != flag && !highMemory)
            {
                if(aBoolean926)
                {
                    anInt939 = anInt1010;
                    aBoolean940 = true;
                    aOnDemandClient_1273.method227(2, anInt939);
                } else
                {
                    method136(2);
                }
                anInt1159 = 0;
            }
        }
        if(j == 4)
        {
            if(k == 0)
            {
                aBoolean1321 = true;
                method148(-676, 0);
            }
            if(k == 1)
            {
                aBoolean1321 = true;
                method148(-676, -400);
            }
            if(k == 2)
            {
                aBoolean1321 = true;
                method148(-676, -800);
            }
            if(k == 3)
            {
                aBoolean1321 = true;
                method148(-676, -1200);
            }
            if(k == 4)
                aBoolean1321 = false;
        }
        if(j == 5)
            anInt1079 = k;
        if(j == 6)
            anInt1196 = k;
        if(j == 8)
        {
            anInt1056 = k;
            aBoolean993 = true;
        }
        if(j == 9)
            anInt1055 = k;
    }

    public void method98(int i, int j, int k, int l, boolean flag, int i1, int j1, 
            int k1)
    {
        if(!flag)
            return;
        if(i1 >= 1 && j >= 1 && i1 <= 102 && j <= 102)
        {
            if(highMemory && k1 != myHeightLevel)
                return;
            int l1 = 0;
            byte byte0 = -1;
            boolean flag1 = false;
            boolean flag2 = false;
            if(i == 0)
                l1 = aClass31_868.method317(k1, i1, j);
            if(i == 1)
                l1 = aClass31_868.method318((byte)-87, k1, i1, j);
            if(i == 2)
                l1 = aClass31_868.method319(k1, i1, j);
            if(i == 3)
                l1 = aClass31_868.method320(k1, i1, j);
            if(l1 != 0)
            {
                int l2 = aClass31_868.method321(k1, i1, j, l1);
                int i2 = l1 >> 14 & 0x7fff;
                int j2 = l2 & 0x1f;
                int k2 = l2 >> 6;
                if(i == 0)
                {
                    aClass31_868.method308(j, k1, i1, (byte)17);
                    Class27 class27 = Class27.method272(i2);
                    if(class27.aBoolean390)
                        aClass3Array964[k1].method162(j, j2, class27.aBoolean362, i1, true, k2);
                }
                if(i == 1)
                    aClass31_868.method309(i1, k1, j, 1);
                if(i == 2)
                {
                    aClass31_868.method310(true, i1, k1, j);
                    Class27 class27_1 = Class27.method272(i2);
                    if(i1 + class27_1.anInt405 > 103 || j + class27_1.anInt405 > 103 || i1 + class27_1.anInt395 > 103 || j + class27_1.anInt395 > 103)
                        return;
                    if(class27_1.aBoolean390)
                        aClass3Array964[k1].method163(class27_1.anInt405, i1, k2, j, (byte)3, class27_1.aBoolean362, class27_1.anInt395);
                }
                if(i == 3)
                {
                    aClass31_868.method311(i1, j, -643, k1);
                    Class27 class27_2 = Class27.method272(i2);
                    if(class27_2.aBoolean390 && class27_2.aBoolean377)
                        aClass3Array964[k1].method165(j, i1, -44679);
                }
            }
            if(j1 >= 0)
            {
                int i3 = k1;
                if(i3 < 3 && (aByteArrayArrayArray1076[1][i1][j] & 2) == 2)
                    i3++;
                Class22.method254(aClass31_868, i3, k1, l, aClass3Array964[k1], k, anInt967, anIntArrayArrayArray1179, j1, j, i1);
            }
        }
    }

    public void method99(int i, int j)
    {
        Class5 class5 = aClass5ArrayArrayArray950[myHeightLevel][i][j];
        if(class5 == null)
        {
            aClass31_868.method312(myHeightLevel, i, j);
            return;
        }
        int k = 0xfa0a1f01;
        Object obj = null;
        for(Class39_Sub3_Sub2_Sub3 class39_sub3_sub2_sub3 = (Class39_Sub3_Sub2_Sub3)class5.method185(); class39_sub3_sub2_sub3 != null; class39_sub3_sub2_sub3 = (Class39_Sub3_Sub2_Sub3)class5.method187((byte)8))
        {
            Class4 class4 = Class4.method174(class39_sub3_sub2_sub3.anInt1511);
            int l = class4.anInt107;
            if(class4.aBoolean91)
                l *= class39_sub3_sub2_sub3.anInt1510 + 1;
            if(l > k)
            {
                k = l;
                obj = class39_sub3_sub2_sub3;
            }
        }

        class5.method183(((Class39) (obj)), (byte)1);
        Object obj1 = null;
        Object obj2 = null;
        for(Class39_Sub3_Sub2_Sub3 class39_sub3_sub2_sub3_1 = (Class39_Sub3_Sub2_Sub3)class5.method185(); class39_sub3_sub2_sub3_1 != null; class39_sub3_sub2_sub3_1 = (Class39_Sub3_Sub2_Sub3)class5.method187((byte)8))
        {
            if(class39_sub3_sub2_sub3_1.anInt1511 != ((Class39_Sub3_Sub2_Sub3) (obj)).anInt1511 && obj1 == null)
                obj1 = class39_sub3_sub2_sub3_1;
            if(class39_sub3_sub2_sub3_1.anInt1511 != ((Class39_Sub3_Sub2_Sub3) (obj)).anInt1511 && class39_sub3_sub2_sub3_1.anInt1511 != ((Class39_Sub3_Sub2_Sub3) (obj1)).anInt1511 && obj2 == null)
                obj2 = class39_sub3_sub2_sub3_1;
        }

        int i1 = i + (j << 7) + 0x60000000;
        aClass31_868.method298(49058, i1, ((Class39_Sub3_Sub2) (obj)), ((Class39_Sub3_Sub2) (obj1)), ((Class39_Sub3_Sub2) (obj2)), i, myHeightLevel, method21(i * 128 + 64, j * 128 + 64, myHeightLevel, 43591), j);
    }

    public void method100(int i)
    {
        System.out.println("============");
        System.out.println("flame-cycle:" + anInt1166);
        if(aOnDemandClient_1273 != null)
            System.out.println("Od-cycle:" + aOnDemandClient_1273.anInt1370);
        System.out.println("loop-cycle:" + loopCycle);
        System.out.println("draw-cycle:" + anInt956);
        System.out.println("ptype:" + currentOpcode);
        System.out.println("psize:" + opcodeSize);
        if(i != anInt1004)
        {
            for(int j = 1; j > 0; j++);
        }
        if(socket != null)
            socket.method543(-26728);
        super.aBoolean12 = true;
    }

    public Component method11(int i) {
        while(i >= 0) 
            anInt1016 = decrypter.getNextKey();
        if(Signlink.mainapp != null)
            return Signlink.mainapp;
        if(super.aFrame_Sub1_18 != null)
            return super.aFrame_Sub1_18;
        else
            return this;
    }

    public void method101(int i, int j, int k, RSInterface class34, int l)
    {
        if(class34.anInt638 != 0 || class34.anIntArray650 == null)
            return;
        if(class34.aBoolean613 && anInt904 != class34.anInt620 && anInt1144 != class34.anInt620 && anInt1154 != class34.anInt620)
            return;
        int i1 = Class39_Sub3_Sub4.anInt1464;
        int j1 = Class39_Sub3_Sub4.anInt1462;
        int k1 = Class39_Sub3_Sub4.anInt1465;
        int l1 = Class39_Sub3_Sub4.anInt1463;
        Class39_Sub3_Sub4.method475(j, (byte)-98, l + class34.anInt610, j + class34.anInt595, l);
        int i2 = class34.anIntArray650.length;
        for(int j2 = 0; j2 < i2; j2++)
        {
            int k2 = class34.anIntArray582[j2] + j;
            int l2 = (class34.anIntArray647[j2] + l) - k;
            RSInterface class34_1 = RSInterface.getInterface(class34.anIntArray650[j2]);
            k2 += class34_1.anInt631;
            l2 += class34_1.anInt586;
            if(class34_1.anInt632 > 0)
                method60(class34_1, 0);
            if(class34_1.anInt638 == 0)
            {
                if(class34_1.anInt609 > class34_1.anInt607 - class34_1.anInt610)
                    class34_1.anInt609 = class34_1.anInt607 - class34_1.anInt610;
                if(class34_1.anInt609 < 0)
                    class34_1.anInt609 = 0;
                method101(-7410, k2, class34_1.anInt609, class34_1, l2);
                if(class34_1.anInt607 > class34_1.anInt610)
                    method63(class34_1.anInt607, (byte)89, class34_1.anInt610, k2 + class34_1.anInt595, l2, class34_1.anInt609);
            } else
            if(class34_1.anInt638 != 1)
                if(class34_1.anInt638 == 2)
                {
                    int i3 = 0;
                    for(int i4 = 0; i4 < class34_1.anInt610; i4++)
                    {
                        for(int j5 = 0; j5 < class34_1.anInt595; j5++)
                        {
                            int i6 = k2 + j5 * (32 + class34_1.anInt615);
                            int l6 = l2 + i4 * (32 + class34_1.anInt627);
                            if(i3 < 20)
                            {
                                i6 += class34_1.anIntArray583[i3];
                                l6 += class34_1.anIntArray577[i3];
                            }
                            if(class34_1.anIntArray612[i3] > 0)
                            {
                                int i7 = 0;
                                int j8 = 0;
                                int l10 = class34_1.anIntArray612[i3] - 1;
                                if(i6 > Class39_Sub3_Sub4.anInt1464 - 32 && i6 < Class39_Sub3_Sub4.anInt1465 && l6 > Class39_Sub3_Sub4.anInt1462 - 32 && l6 < Class39_Sub3_Sub4.anInt1463 || anInt1332 != 0 && anInt1331 == i3)
                                {
                                    int k11 = 0;
                                    if(anInt905 == 1 && anInt906 == i3 && anInt907 == class34_1.anInt620)
                                        k11 = 0xffffff;
                                    Class39_Sub3_Sub4_Sub4 class39_sub3_sub4_sub4_2 = Class4.method178(class34_1.anIntArray603[i3], false, k11, l10);
                                    if(class39_sub3_sub4_sub4_2 != null)
                                    {
                                        if(anInt1332 != 0 && anInt1331 == i3 && anInt1330 == class34_1.anInt620)
                                        {
                                            i7 = super.anInt23 - anInt1333;
                                            j8 = super.anInt24 - anInt1334;
                                            if(i7 < 5 && i7 > -5)
                                                i7 = 0;
                                            if(j8 < 5 && j8 > -5)
                                                j8 = 0;
                                            if(anInt968 < 5)
                                            {
                                                i7 = 0;
                                                j8 = 0;
                                            }
                                            class39_sub3_sub4_sub4_2.method532(l6 + j8, false, 128, i6 + i7);
                                            if(l6 + j8 < Class39_Sub3_Sub4.anInt1462 && class34.anInt609 > 0)
                                            {
                                                int i12 = (anInt1111 * (Class39_Sub3_Sub4.anInt1462 - l6 - j8)) / 3;
                                                if(i12 > anInt1111 * 10)
                                                    i12 = anInt1111 * 10;
                                                if(i12 > class34.anInt609)
                                                    i12 = class34.anInt609;
                                                class34.anInt609 -= i12;
                                                anInt1334 += i12;
                                            }
                                            if(l6 + j8 + 32 > Class39_Sub3_Sub4.anInt1463 && class34.anInt609 < class34.anInt607 - class34.anInt610)
                                            {
                                                int j12 = (anInt1111 * ((l6 + j8 + 32) - Class39_Sub3_Sub4.anInt1463)) / 3;
                                                if(j12 > anInt1111 * 10)
                                                    j12 = anInt1111 * 10;
                                                if(j12 > class34.anInt607 - class34.anInt610 - class34.anInt609)
                                                    j12 = class34.anInt607 - class34.anInt610 - class34.anInt609;
                                                class34.anInt609 += j12;
                                                anInt1334 -= j12;
                                            }
                                        } else
                                        if(anInt963 != 0 && anInt962 == i3 && anInt961 == class34_1.anInt620)
                                            class39_sub3_sub4_sub4_2.method532(l6, false, 128, i6);
                                        else
                                            class39_sub3_sub4_sub4_2.method530(i6, 22912, l6);
                                        if(class39_sub3_sub4_sub4_2.anInt1736 == 33 || class34_1.anIntArray603[i3] != 1)
                                        {
                                            int k12 = class34_1.anIntArray603[i3];
                                            aClass39_Sub3_Sub4_Sub2_1097.method507(0, (byte)118, method65(k12, 27004), l6 + 10 + j8, i6 + 1 + i7);
                                            aClass39_Sub3_Sub4_Sub2_1097.method507(0xffff00, (byte)118, method65(k12, 27004), l6 + 9 + j8, i6 + i7);
                                        }
                                    }
                                }
                            } else
                            if(class34_1.aClass39_Sub3_Sub4_Sub4Array592 != null && i3 < 20)
                            {
                                Class39_Sub3_Sub4_Sub4 class39_sub3_sub4_sub4_1 = class34_1.aClass39_Sub3_Sub4_Sub4Array592[i3];
                                if(class39_sub3_sub4_sub4_1 != null)
                                    class39_sub3_sub4_sub4_1.method530(i6, 22912, l6);
                            }
                            i3++;
                        }

                    }

                } else
                if(class34_1.anInt638 == 3)
                {
                    boolean flag = false;
                    if(anInt1154 == class34_1.anInt620 || anInt1144 == class34_1.anInt620 || anInt904 == class34_1.anInt620)
                        flag = true;
                    int j3;
                    if(method135(285, class34_1))
                    {
                        j3 = class34_1.anInt579;
                        if(flag && class34_1.anInt622 != 0)
                            j3 = class34_1.anInt622;
                    } else
                    {
                        j3 = class34_1.anInt594;
                        if(flag && class34_1.anInt605 != 0)
                            j3 = class34_1.anInt605;
                    }
                    if(class34_1.aByte646 == 0)
                    {
                        if(class34_1.aBoolean642)
                            Class39_Sub3_Sub4.method478((byte)4, l2, k2, j3, class34_1.anInt610, class34_1.anInt595);
                        else
                            Class39_Sub3_Sub4.method479(class34_1.anInt610, l2, 606, k2, j3, class34_1.anInt595);
                    } else
                    if(class34_1.aBoolean642)
                        Class39_Sub3_Sub4.method477(class34_1.anInt610, 256 - (class34_1.aByte646 & 0xff), l2, class34_1.anInt595, k2, (byte)6, j3);
                    else
                        Class39_Sub3_Sub4.method480(class34_1.anInt595, class34_1.anInt610, 217, k2, 256 - (class34_1.aByte646 & 0xff), l2, j3);
                } else
                if(class34_1.anInt638 == 4)
                {
                    Class39_Sub3_Sub4_Sub2 class39_sub3_sub4_sub2 = class34_1.aClass39_Sub3_Sub4_Sub2_640;
                    String s = class34_1.message;
                    boolean flag1 = false;
                    if(anInt1154 == class34_1.anInt620 || anInt1144 == class34_1.anInt620 || anInt904 == class34_1.anInt620)
                        flag1 = true;
                    int j4;
                    if(method135(285, class34_1))
                    {
                        j4 = class34_1.anInt579;
                        if(flag1 && class34_1.anInt622 != 0)
                            j4 = class34_1.anInt622;
                        if(class34_1.aString601.length() > 0)
                            s = class34_1.aString601;
                    } else
                    {
                        j4 = class34_1.anInt594;
                        if(flag1 && class34_1.anInt605 != 0)
                            j4 = class34_1.anInt605;
                    }
                    if(class34_1.anInt621 == 6 && aBoolean896)
                    {
                        s = "Please wait...";
                        j4 = class34_1.anInt594;
                    }
                    if(Class39_Sub3_Sub4.anInt1460 == 479)
                    {
                        if(j4 == 0xffff00)
                            j4 = 255;
                        if(j4 == 49152)
                            j4 = 0xffffff;
                    }
                    for(int j7 = l2 + class39_sub3_sub4_sub2.anInt1703; s.length() > 0; j7 += class39_sub3_sub4_sub2.anInt1703)
                    {
                        if(s.indexOf("%") != -1)
                        {
                            do
                            {
                                int k8 = s.indexOf("%1");
                                if(k8 == -1)
                                    break;
                                s = s.substring(0, k8) + method144(method37(0, (byte)60, class34_1), 7) + s.substring(k8 + 2);
                            } while(true);
                            do
                            {
                                int l8 = s.indexOf("%2");
                                if(l8 == -1)
                                    break;
                                s = s.substring(0, l8) + method144(method37(1, (byte)60, class34_1), 7) + s.substring(l8 + 2);
                            } while(true);
                            do
                            {
                                int i9 = s.indexOf("%3");
                                if(i9 == -1)
                                    break;
                                s = s.substring(0, i9) + method144(method37(2, (byte)60, class34_1), 7) + s.substring(i9 + 2);
                            } while(true);
                            do
                            {
                                int j9 = s.indexOf("%4");
                                if(j9 == -1)
                                    break;
                                s = s.substring(0, j9) + method144(method37(3, (byte)60, class34_1), 7) + s.substring(j9 + 2);
                            } while(true);
                            do
                            {
                                int k9 = s.indexOf("%5");
                                if(k9 == -1)
                                    break;
                                s = s.substring(0, k9) + method144(method37(4, (byte)60, class34_1), 7) + s.substring(k9 + 2);
                            } while(true);
                        }
                        int l9 = s.indexOf("\\n");
                        String s3;
                        if(l9 != -1)
                        {
                            s3 = s.substring(0, l9);
                            s = s.substring(l9 + 2);
                        } else
                        {
                            s3 = s;
                            s = "";
                        }
                        if(class34_1.aBoolean653)
                            class39_sub3_sub4_sub2.method504(j7, j4, 0, class34_1.aBoolean628, k2 + class34_1.anInt595 / 2, s3);
                        else
                            class39_sub3_sub4_sub2.method511(s3, k2, j7, class34_1.aBoolean628, 0, j4);
                    }

                } else
                if(class34_1.anInt638 == 5)
                {
                    Class39_Sub3_Sub4_Sub4 class39_sub3_sub4_sub4;
                    if(method135(285, class34_1))
                        class39_sub3_sub4_sub4 = class34_1.aClass39_Sub3_Sub4_Sub4_585;
                    else
                        class39_sub3_sub4_sub4 = class34_1.aClass39_Sub3_Sub4_Sub4_626;
                    if(class39_sub3_sub4_sub4 != null)
                        class39_sub3_sub4_sub4.method530(k2, 22912, l2);
                } else
                if(class34_1.anInt638 == 6)
                {
                    int k3 = Class39_Sub3_Sub4_Sub1.anInt1674;
                    int k4 = Class39_Sub3_Sub4_Sub1.anInt1675;
                    Class39_Sub3_Sub4_Sub1.anInt1674 = k2 + class34_1.anInt595 / 2;
                    Class39_Sub3_Sub4_Sub1.anInt1675 = l2 + class34_1.anInt610 / 2;
                    int k5 = Class39_Sub3_Sub4_Sub1.anIntArray1678[class34_1.anInt618] * class34_1.anInt617 >> 16;
                    int j6 = Class39_Sub3_Sub4_Sub1.anIntArray1679[class34_1.anInt618] * class34_1.anInt617 >> 16;
                    boolean flag2 = method135(285, class34_1);
                    int k7;
                    if(flag2)
                        k7 = class34_1.anInt590;
                    else
                        k7 = class34_1.anInt589;
                    Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4;
                    if(k7 == -1)
                    {
                        class39_sub3_sub2_sub4 = class34_1.method360(-1, -1, anInt1189, flag2);
                    } else
                    {
                        SEQ class20 = SEQ.aClass20Array271[k7];
                        class39_sub3_sub2_sub4 = class34_1.method360(class20.anIntArray274[class34_1.anInt649], class20.anIntArray273[class34_1.anInt649], anInt1189, flag2);
                    }
                    if(class39_sub3_sub2_sub4 != null)
                        class39_sub3_sub2_sub4.method408(0, class34_1.anInt619, 0, class34_1.anInt618, 0, k5, j6);
                    Class39_Sub3_Sub4_Sub1.anInt1674 = k3;
                    Class39_Sub3_Sub4_Sub1.anInt1675 = k4;
                } else
                {
                    if(class34_1.anInt638 == 7)
                    {
                        Class39_Sub3_Sub4_Sub2 class39_sub3_sub4_sub2_1 = class34_1.aClass39_Sub3_Sub4_Sub2_640;
                        int l4 = 0;
                        for(int l5 = 0; l5 < class34_1.anInt610; l5++)
                        {
                            for(int k6 = 0; k6 < class34_1.anInt595; k6++)
                            {
                                if(class34_1.anIntArray612[l4] > 0)
                                {
                                    Class4 class4 = Class4.method174(class34_1.anIntArray612[l4] - 1);
                                    String s6 = String.valueOf(class4.aString105);
                                    if(class4.aBoolean91 || class34_1.anIntArray603[l4] != 1)
                                        s6 = s6 + " x" + method39(866, class34_1.anIntArray603[l4]);
                                    int i10 = k2 + k6 * (115 + class34_1.anInt615);
                                    int i11 = l2 + l5 * (12 + class34_1.anInt627);
                                    if(class34_1.aBoolean653)
                                        class39_sub3_sub4_sub2_1.method504(i11, class34_1.anInt594, 0, class34_1.aBoolean628, i10 + class34_1.anInt595 / 2, s6);
                                    else
                                        class39_sub3_sub4_sub2_1.method511(s6, i10, i11, class34_1.aBoolean628, 0, class34_1.anInt594);
                                }
                                l4++;
                            }

                        }

                    }
                    if(class34_1.anInt638 == 8 && (anInt1263 == class34_1.anInt620 || anInt1259 == class34_1.anInt620 || anInt1143 == class34_1.anInt620) && anInt1057 == 100)
                    {
                        int l3 = 0;
                        int i5 = 0;
                        Class39_Sub3_Sub4_Sub2 class39_sub3_sub4_sub2_2 = aClass39_Sub3_Sub4_Sub2_1098;
                        for(String s1 = class34_1.message; s1.length() > 0;)
                        {
                            int l7 = s1.indexOf("\\n");
                            String s4;
                            if(l7 != -1)
                            {
                                s4 = s1.substring(0, l7);
                                s1 = s1.substring(l7 + 2);
                            } else
                            {
                                s4 = s1;
                                s1 = "";
                            }
                            int j10 = class39_sub3_sub4_sub2_2.method505(1, s4);
                            if(j10 > l3)
                                l3 = j10;
                            i5 += class39_sub3_sub4_sub2_2.anInt1703 + 1;
                        }

                        l3 += 6;
                        i5 += 7;
                        int i8 = (k2 + class34_1.anInt595) - 5 - l3;
                        int k10 = l2 + class34_1.anInt610 + 5;
                        if(i8 < k2 + 5)
                            i8 = k2 + 5;
                        if(i8 + l3 > j + class34.anInt595)
                            i8 = (j + class34.anInt595) - l3;
                        if(k10 + i5 > l + class34.anInt610)
                            k10 = (l + class34.anInt610) - i5;
                        Class39_Sub3_Sub4.method478((byte)4, k10, i8, 0xffffa0, i5, l3);
                        Class39_Sub3_Sub4.method479(i5, k10, 606, i8, 0, l3);
                        String s2 = class34_1.message;
                        for(int j11 = k10 + class39_sub3_sub4_sub2_2.anInt1703 + 2; s2.length() > 0; j11 += class39_sub3_sub4_sub2_2.anInt1703 + 1)
                        {
                            int l11 = s2.indexOf("\\n");
                            String s5;
                            if(l11 != -1)
                            {
                                s5 = s2.substring(0, l11);
                                s2 = s2.substring(l11 + 2);
                            } else
                            {
                                s5 = s2;
                                s2 = "";
                            }
                            class39_sub3_sub4_sub2_2.method511(s5, i8 + 3, j11, false, 0, 0);
                        }

                    }
                }
        }

        if(i != -7410)
            currentOpcode = -1;
        Class39_Sub3_Sub4.method475(i1, (byte)-98, l1, k1, j1);
    }

    public void method102(int i)
    {
        while(i >= 0) 
            method6();
        if(anInt923 != 0)
            return;
        if(super.anInt29 == 1)
        {
            int j = super.anInt30 - 25 - 550;
            int k = super.anInt31 - 5 - 4;
            if(j >= 0 && k >= 0 && j < 146 && k < 151)
            {
                j -= 73;
                k -= 75;
                int l = anInt928 + anInt1234 & 0x7ff;
                int i1 = Class39_Sub3_Sub4_Sub1.anIntArray1678[l];
                int j1 = Class39_Sub3_Sub4_Sub1.anIntArray1679[l];
                i1 = i1 * (anInt881 + 256) >> 8;
                j1 = j1 * (anInt881 + 256) >> 8;
                int k1 = k * i1 + j * j1 >> 11;
                int l1 = k * j1 - j * i1 >> 11;
                int i2 = ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1621 + k1 >> 7;
                int j2 = ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1622 - l1 >> 7;
                boolean flag = calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 0, 0, true, 1, i2, j2);
                if(flag)
                {
                    outgoingVector.putByte(j);
                    outgoingVector.putByte(k);
                    outgoingVector.putShort(anInt928);
                    outgoingVector.putByte(57);
                    outgoingVector.putByte(anInt1234);
                    outgoingVector.putByte(anInt881);
                    outgoingVector.putByte(89);
                    outgoingVector.putShort(((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1621);
                    outgoingVector.putShort(((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1622);
                    outgoingVector.putByte(anInt1082);
                    outgoingVector.putByte(63);
                }
            }
        }
    }

    public void method103(Buffer class39_sub3_sub3, boolean flag, int i)
    {
        if(flag)
            method6();
        if(i == 100)
        {
            int j = class39_sub3_sub3.readUByte();
            int i3 = anInt1313 + (j >> 4 & 7);
            int l5 = anInt1314 + (j & 7);
            int j8 = i3 + class39_sub3_sub3.getByte();
            int i11 = l5 + class39_sub3_sub3.getByte();
            int k13 = class39_sub3_sub3.getSmart();
            int l15 = class39_sub3_sub3.readShort();
            int j17 = class39_sub3_sub3.readUByte() * 4;
            int i18 = class39_sub3_sub3.readUByte() * 4;
            int l18 = class39_sub3_sub3.readShort();
            int k19 = class39_sub3_sub3.readShort();
            int i20 = class39_sub3_sub3.readUByte();
            int k20 = class39_sub3_sub3.readUByte();
            if(i3 >= 0 && l5 >= 0 && i3 < 104 && l5 < 104 && j8 >= 0 && i11 >= 0 && j8 < 104 && i11 < 104 && l15 != 65535)
            {
                i3 = i3 * 128 + 64;
                l5 = l5 * 128 + 64;
                j8 = j8 * 128 + 64;
                i11 = i11 * 128 + 64;
                Class39_Sub3_Sub2_Sub2 class39_sub3_sub2_sub2 = new Class39_Sub3_Sub2_Sub2(i3, i18, l5, i20, -40800, k20, k13, method21(i3, l5, myHeightLevel, 43591) - j17, l15, k19 + loopCycle, l18 + loopCycle, myHeightLevel);
                class39_sub3_sub2_sub2.method381((byte)7, j8, method21(j8, i11, myHeightLevel, 43591) - i18, i11, l18 + loopCycle);
                aClass5_1311.method182(class39_sub3_sub2_sub2);
            }
            return;
        }
        if(i == 173)
        {
            int k = class39_sub3_sub3.getLEShortA();
            int j3 = class39_sub3_sub3.getShortA();
            int i6 = class39_sub3_sub3.getUnsignedByteC();
            int k8 = anInt1313 + (i6 >> 4 & 7);
            int j11 = anInt1314 + (i6 & 7);
            int l13 = class39_sub3_sub3.getShortA();
            if(k8 >= 0 && j11 >= 0 && k8 < 104 && j11 < 104 && l13 != anInt1282)
            {
                Class39_Sub3_Sub2_Sub3 class39_sub3_sub2_sub3_2 = new Class39_Sub3_Sub2_Sub3();
                class39_sub3_sub2_sub3_2.anInt1511 = j3;
                class39_sub3_sub2_sub3_2.anInt1510 = k;
                if(aClass5ArrayArrayArray950[myHeightLevel][k8][j11] == null)
                    aClass5ArrayArrayArray950[myHeightLevel][k8][j11] = new Class5(-7255);
                aClass5ArrayArrayArray950[myHeightLevel][k8][j11].method182(class39_sub3_sub2_sub3_2);
                method99(k8, j11);
            }
            return;
        }
        if(i == 241)
        {
            int l = class39_sub3_sub3.getLEShortA();
            int k3 = class39_sub3_sub3.readUByte();
            int j6 = anInt1313 + (k3 >> 4 & 7);
            int l8 = anInt1314 + (k3 & 7);
            int k11 = class39_sub3_sub3.readUByte();
            int i14 = k11 >> 2;
            int i16 = k11 & 3;
            int k17 = anIntArray1114[i14];
            if(j6 >= 0 && l8 >= 0 && j6 < 104 && l8 < 104)
                method74(false, 0, l, j6, l8, i16, i14, k17, myHeightLevel, -1);
            return;
        }
        if(i == 1)
        {
            int i1 = class39_sub3_sub3.getShortA();
            int l3 = class39_sub3_sub3.readShortLE();
            byte byte0 = class39_sub3_sub3.getByteC();
            int i9 = class39_sub3_sub3.aClass5_1450.getUnsignedByteS(class39_sub3_sub3);
            int l11 = i9 >> 2;
            int j14 = i9 & 3;
            int j16 = anIntArray1114[l11];
            byte byte1 = class39_sub3_sub3.getByteS();
            int j18 = class39_sub3_sub3.getShortA();
            int i19 = class39_sub3_sub3.getShortA();
            byte byte2 = class39_sub3_sub3.getByteC();
            byte byte3 = class39_sub3_sub3.getByteC();
            int l20 = class39_sub3_sub3.getUnsignedByteC();
            int i21 = anInt1313 + (l20 >> 4 & 7);
            int k21 = anInt1314 + (l20 & 7);
            Player player;
            if(i19 == anInt1282)
                player = myPlayer;
            else
                player = players[i19];
            if(player != null)
            {
                Class27 class27 = Class27.method272(j18);
                int l21 = anIntArrayArrayArray1179[myHeightLevel][i21][k21];
                int i22 = anIntArrayArrayArray1179[myHeightLevel][i21 + 1][k21];
                int j22 = anIntArrayArrayArray1179[myHeightLevel][i21 + 1][k21 + 1];
                int k22 = anIntArrayArrayArray1179[myHeightLevel][i21][k21 + 1];
                Class39_Sub3_Sub2_Sub4 class39_sub3_sub2_sub4 = class27.method277(l11, j14, l21, i22, j22, k22, -1);
                if(class39_sub3_sub2_sub4 != null)
                {
                    method74(false, i1 + 1, -1, i21, k21, 0, 0, j16, myHeightLevel, l3 + 1);
                    player.anInt1738 = i1 + loopCycle;
                    player.anInt1739 = l3 + loopCycle;
                    player.aClass39_Sub3_Sub2_Sub4_1743 = class39_sub3_sub2_sub4;
                    int l22 = class27.anInt405;
                    int i23 = class27.anInt395;
                    if(j14 == 1 || j14 == 3)
                    {
                        l22 = class27.anInt395;
                        i23 = class27.anInt405;
                    }
                    player.anInt1740 = i21 * 128 + l22 * 64;
                    player.anInt1742 = k21 * 128 + i23 * 64;
                    player.anInt1741 = method21(player.anInt1740, player.anInt1742, myHeightLevel, 43591);
                    if(byte0 > byte1)
                    {
                        byte byte4 = byte0;
                        byte0 = byte1;
                        byte1 = byte4;
                    }
                    if(byte2 > byte3)
                    {
                        byte byte5 = byte2;
                        byte2 = byte3;
                        byte3 = byte5;
                    }
                    player.anInt1749 = i21 + byte0;
                    player.anInt1751 = i21 + byte1;
                    player.anInt1750 = k21 + byte2;
                    player.anInt1752 = k21 + byte3;
                }
            }
        }
        if(i == 69)
        {
            int j1 = class39_sub3_sub3.readUByte();
            int i4 = anInt1313 + (j1 >> 4 & 7);
            int k6 = anInt1314 + (j1 & 7);
            int j9 = class39_sub3_sub3.readShort();
            int i12 = class39_sub3_sub3.readUByte();
            int k14 = i12 >> 4 & 0xf;
            int k16 = i12 & 7;
            if(((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0] >= i4 - k14 && ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0] <= i4 + k14 && ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0] >= k6 - k14 && ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0] <= k6 + k14 && aBoolean1321 && !highMemory && anInt979 < 50)
            {
                anIntArray1199[anInt979] = j9;
                anIntArray1080[anInt979] = k16;
                anIntArray847[anInt979] = Class12.anIntArray203[j9];
                anInt979++;
            }
        }
        if(i == 57)
        {
            int k1 = class39_sub3_sub3.readUByte();
            int j4 = k1 >> 2;
            int l6 = k1 & 3;
            int k9 = anIntArray1114[j4];
            int j12 = class39_sub3_sub3.aClass5_1450.getUnsignedByteS(class39_sub3_sub3);
            int l14 = anInt1313 + (j12 >> 4 & 7);
            int l16 = anInt1314 + (j12 & 7);
            if(l14 >= 0 && l16 >= 0 && l14 < 104 && l16 < 104)
                method74(false, 0, -1, l14, l16, l6, j4, k9, myHeightLevel, -1);
            return;
        }
        if(i == 220)
        {
            int l1 = class39_sub3_sub3.aClass5_1450.getUnsignedByteS(class39_sub3_sub3);
            int k4 = anInt1313 + (l1 >> 4 & 7);
            int i7 = anInt1314 + (l1 & 7);
            int l9 = class39_sub3_sub3.readShortLE();
            if(k4 >= 0 && i7 >= 0 && k4 < 104 && i7 < 104)
            {
                Class5 class5 = aClass5ArrayArrayArray950[myHeightLevel][k4][i7];
                if(class5 != null)
                {
                    for(Class39_Sub3_Sub2_Sub3 class39_sub3_sub2_sub3 = (Class39_Sub3_Sub2_Sub3)class5.method185(); class39_sub3_sub2_sub3 != null; class39_sub3_sub2_sub3 = (Class39_Sub3_Sub2_Sub3)class5.method187((byte)8))
                    {
                        if(class39_sub3_sub2_sub3.anInt1511 != (l9 & 0x7fff))
                            continue;
                        class39_sub3_sub2_sub3.method376();
                        break;
                    }

                    if(class5.method185() == null)
                        aClass5ArrayArrayArray950[myHeightLevel][k4][i7] = null;
                    method99(k4, i7);
                }
            }
            return;
        }
        if(i == 194)
        {
            int i2 = class39_sub3_sub3.readUByte();
            int l4 = anInt1313 + (i2 >> 4 & 7);
            int j7 = anInt1314 + (i2 & 7);
            int i10 = class39_sub3_sub3.readShort();
            int k12 = class39_sub3_sub3.readShort();
            int i15 = class39_sub3_sub3.readShort();
            if(l4 >= 0 && j7 >= 0 && l4 < 104 && j7 < 104)
            {
                Class5 class5_1 = aClass5ArrayArrayArray950[myHeightLevel][l4][j7];
                if(class5_1 != null)
                {
                    for(Class39_Sub3_Sub2_Sub3 class39_sub3_sub2_sub3_3 = (Class39_Sub3_Sub2_Sub3)class5_1.method185(); class39_sub3_sub2_sub3_3 != null; class39_sub3_sub2_sub3_3 = (Class39_Sub3_Sub2_Sub3)class5_1.method187((byte)8))
                    {
                        if(class39_sub3_sub2_sub3_3.anInt1511 != (i10 & 0x7fff) || class39_sub3_sub2_sub3_3.anInt1510 != k12)
                            continue;
                        class39_sub3_sub2_sub3_3.anInt1510 = i15;
                        break;
                    }

                    method99(l4, j7);
                }
            }
            return;
        }
        if(i == 137)
        {
            int j2 = class39_sub3_sub3.readUByte();
            int i5 = anInt1313 + (j2 >> 4 & 7);
            int k7 = anInt1314 + (j2 & 7);
            int j10 = class39_sub3_sub3.readShort();
            int l12 = class39_sub3_sub3.readUByte();
            int j15 = class39_sub3_sub3.readShort();
            if(i5 >= 0 && k7 >= 0 && i5 < 104 && k7 < 104)
            {
                i5 = i5 * 128 + 64;
                k7 = k7 * 128 + 64;
                Class39_Sub3_Sub2_Sub1 class39_sub3_sub2_sub1 = new Class39_Sub3_Sub2_Sub1(loopCycle, j10, method21(i5, k7, myHeightLevel, 43591) - l12, k7, j15, myHeightLevel, i5, (byte)-126);
                aClass5_1305.method182(class39_sub3_sub2_sub1);
            }
            return;
        }
        if(i == 128)
        {
            int k2 = class39_sub3_sub3.readShort();
            int j5 = class39_sub3_sub3.readUByte();
            int l7 = anInt1313 + (j5 >> 4 & 7);
            int k10 = anInt1314 + (j5 & 7);
            int i13 = class39_sub3_sub3.readUByte();
            int k15 = i13 >> 2;
            int i17 = i13 & 3;
            int l17 = anIntArray1114[k15];
            if(l7 >= 0 && k10 >= 0 && l7 < 103 && k10 < 103)
            {
                int k18 = anIntArrayArrayArray1179[myHeightLevel][l7][k10];
                int j19 = anIntArrayArrayArray1179[myHeightLevel][l7 + 1][k10];
                int l19 = anIntArrayArrayArray1179[myHeightLevel][l7 + 1][k10 + 1];
                int j20 = anIntArrayArrayArray1179[myHeightLevel][l7][k10 + 1];
                if(l17 == 0)
                {
                    Class28 class28 = aClass31_868.method313(myHeightLevel, k10, l7, -17367);
                    if(class28 != null)
                    {
                        int j21 = class28.anInt418 >> 14 & 0x7fff;
                        if(k15 == 2)
                        {
                            class28.aClass39_Sub3_Sub2_416 = new Class39_Sub3_Sub2_Sub6(j19, 4 + i17, l19, j20, 2, k18, k2, true, false, j21);
                            class28.aClass39_Sub3_Sub2_417 = new Class39_Sub3_Sub2_Sub6(j19, i17 + 1 & 3, l19, j20, 2, k18, k2, true, false, j21);
                        } else
                        {
                            class28.aClass39_Sub3_Sub2_416 = new Class39_Sub3_Sub2_Sub6(j19, i17, l19, j20, k15, k18, k2, true, false, j21);
                        }
                    }
                }
                if(l17 == 1)
                {
                    Class26 class26 = aClass31_868.method314(l7, (byte)6, k10, myHeightLevel);
                    if(class26 != null)
                        class26.aClass39_Sub3_Sub2_356 = new Class39_Sub3_Sub2_Sub6(j19, 0, l19, j20, 4, k18, k2, true, false, class26.anInt357 >> 14 & 0x7fff);
                }
                if(l17 == 2)
                {
                    Class9 class9 = aClass31_868.method315(false, l7, k10, myHeightLevel);
                    if(k15 == 11)
                        k15 = 10;
                    if(class9 != null)
                        class9.aClass39_Sub3_Sub2_168 = new Class39_Sub3_Sub2_Sub6(j19, i17, l19, j20, k15, k18, k2, true, false, class9.anInt176 >> 14 & 0x7fff);
                }
                if(l17 == 3)
                {
                    Class48 class48 = aClass31_868.method316(myHeightLevel, k10, (byte)3, l7);
                    if(class48 != null)
                        class48.aClass39_Sub3_Sub2_825 = new Class39_Sub3_Sub2_Sub6(j19, i17, l19, j20, 22, k18, k2, true, false, class48.anInt826 >> 14 & 0x7fff);
                }
            }
            return;
        }
        if(i == 51)
        {
            int l2 = class39_sub3_sub3.getLEShortA();
            int k5 = class39_sub3_sub3.getUnsignedByteC();
            int i8 = anInt1313 + (k5 >> 4 & 7);
            int l10 = anInt1314 + (k5 & 7);
            int j13 = class39_sub3_sub3.readShort();
            if(i8 >= 0 && l10 >= 0 && i8 < 104 && l10 < 104)
            {
                Class39_Sub3_Sub2_Sub3 class39_sub3_sub2_sub3_1 = new Class39_Sub3_Sub2_Sub3();
                class39_sub3_sub2_sub3_1.anInt1511 = l2;
                class39_sub3_sub2_sub3_1.anInt1510 = j13;
                if(aClass5ArrayArrayArray950[myHeightLevel][i8][l10] == null)
                    aClass5ArrayArrayArray950[myHeightLevel][i8][l10] = new Class5(-7255);
                aClass5ArrayArrayArray950[myHeightLevel][i8][l10].method182(class39_sub3_sub2_sub3_1);
                method99(i8, l10);
            }
        }
    }

    public void method104(int i)
    {
        Class39_Sub3_Sub2_Sub2 class39_sub3_sub2_sub2 = (Class39_Sub3_Sub2_Sub2)aClass5_1311.method185();
        opcodeSize += i;
        for(; class39_sub3_sub2_sub2 != null; class39_sub3_sub2_sub2 = (Class39_Sub3_Sub2_Sub2)aClass5_1311.method187((byte)8))
            if(class39_sub3_sub2_sub2.anInt1505 != myHeightLevel || loopCycle > class39_sub3_sub2_sub2.anInt1490)
                class39_sub3_sub2_sub2.method376();
            else
            if(loopCycle >= class39_sub3_sub2_sub2.anInt1489)
            {
                if(class39_sub3_sub2_sub2.anInt1504 > 0)
                {
                    Class39_Sub3_Sub2_Sub5_Sub2 class39_sub3_sub2_sub5_sub2 = aClass39_Sub3_Sub2_Sub5_Sub2Array899[class39_sub3_sub2_sub2.anInt1504 - 1];
                    if(class39_sub3_sub2_sub5_sub2 != null && ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1621 >= 0 && ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1621 < 13312 && ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1622 >= 0 && ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1622 < 13312)
                        class39_sub3_sub2_sub2.method381((byte)7, ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1621, method21(((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1621, ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1622, class39_sub3_sub2_sub2.anInt1505, 43591) - class39_sub3_sub2_sub2.anInt1500, ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1622, loopCycle);
                }
                if(class39_sub3_sub2_sub2.anInt1504 < 0)
                {
                    int j = -class39_sub3_sub2_sub2.anInt1504 - 1;
                    Player player;
                    if(j == anInt1282)
                        player = myPlayer;
                    else
                        player = players[j];
                    if(player != null && ((Class39_Sub3_Sub2_Sub5) (player)).anInt1621 >= 0 && ((Class39_Sub3_Sub2_Sub5) (player)).anInt1621 < 13312 && ((Class39_Sub3_Sub2_Sub5) (player)).anInt1622 >= 0 && ((Class39_Sub3_Sub2_Sub5) (player)).anInt1622 < 13312)
                        class39_sub3_sub2_sub2.method381((byte)7, ((Class39_Sub3_Sub2_Sub5) (player)).anInt1621, method21(((Class39_Sub3_Sub2_Sub5) (player)).anInt1621, ((Class39_Sub3_Sub2_Sub5) (player)).anInt1622, class39_sub3_sub2_sub2.anInt1505, 43591) - class39_sub3_sub2_sub2.anInt1500, ((Class39_Sub3_Sub2_Sub5) (player)).anInt1622, loopCycle);
                }
                class39_sub3_sub2_sub2.method382(false, anInt1111);
                aClass31_868.method302((int)class39_sub3_sub2_sub2.aDouble1495, (int)class39_sub3_sub2_sub2.aDouble1496, -1, class39_sub3_sub2_sub2.anInt1507, myHeightLevel, false, (int)class39_sub3_sub2_sub2.aDouble1494, false, class39_sub3_sub2_sub2, 60);
            }

    }

    public void updatePlayers(int blockSize, Buffer buffer) {
        anInt917 = 0;
        anInt876 = 0;
        parsePlayerMovement(buffer);
        parseTrackedPlayerMovement(buffer, blockSize);
        registerNewPlayers(anInt1058, buffer, blockSize);
        parseTrackedPlayerUpdateMasks(-26716, blockSize, buffer);
        for(int count = 0; count < anInt917; count++) {
            int l = anIntArray918[count];
            if(players[l].anInt1648 != loopCycle)
                players[l] = null;
        }

        if(buffer.currentOffset != blockSize) {
            Signlink.reporterror("Error packet size mismatch in getplayer pos:" + buffer.currentOffset + " psize:" + blockSize);
            throw new RuntimeException("eek");
        }
        for(int pos = 0; pos < playerCount; pos++)
            if(players[playerIndices[pos]] == null) {
                Signlink.reporterror(enteredUsername + " null entry in pl list - pos:" + pos + " size:" + playerCount);
                throw new RuntimeException("eek");
            }

    }

    public void method106(int i, long l)
    {
        try
        {
            if(l == 0L)
                return;
            if(anInt1190 >= 100 && anInt1232 != 1)
            {
                sendMessage((byte)-83, "Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
                return;
            }
            if(anInt1190 >= 200)
            {
                sendMessage((byte)-83, "Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
                return;
            }
            String s = Class37.method372(Class37.method369(-39, l), false);
            for(int j = 0; j < anInt1190; j++)
                if(aLongArray1050[j] == l)
                {
                    sendMessage((byte)-83, s + " is already on your friend list", 0, "");
                    return;
                }

            for(int k = 0; k < anInt1168; k++)
                if(aLongArray879[k] == l)
                {
                    sendMessage((byte)-83, "Please remove " + s + " from your ignore list first", 0, "");
                    return;
                }

            if(i <= 0)
                aClass5ArrayArrayArray950 = null;
            if(s.equals(myPlayer.aString1754))
            {
                return;
            } else
            {
                aStringArray1216[anInt1190] = s;
                aLongArray1050[anInt1190] = l;
                anIntArray895[anInt1190] = 0;
                anInt1190++;
                needDrawTabArea = true;
                outgoingVector.writeOpcode(73);
                outgoingVector.putLong(l);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("8652, " + i + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public boolean method107(RSInterface class34, int i)
    {
        if(i != 1203)
        {
            for(int j = 1; j > 0; j++);
        }
        int k = class34.anInt632;
        if(anInt1191 == 2)
        {
            if(k == 201)
            {
                aBoolean993 = true;
                anInt1169 = 0;
                aBoolean1001 = true;
                aString1023 = "";
                anInt1180 = 1;
                aString1152 = "Enter name of friend to add to list";
            }
            if(k == 202)
            {
                aBoolean993 = true;
                anInt1169 = 0;
                aBoolean1001 = true;
                aString1023 = "";
                anInt1180 = 2;
                aString1152 = "Enter name of friend to delete from list";
            }
        }
        if(k == 205)
        {
            anInt1176 = 250;
            return true;
        }
        if(k == 501)
        {
            aBoolean993 = true;
            anInt1169 = 0;
            aBoolean1001 = true;
            aString1023 = "";
            anInt1180 = 4;
            aString1152 = "Enter name of player to add to list";
        }
        if(k == 502)
        {
            aBoolean993 = true;
            anInt1169 = 0;
            aBoolean1001 = true;
            aString1023 = "";
            anInt1180 = 5;
            aString1152 = "Enter name of player to delete from list";
        }
        if(k >= 300 && k <= 313)
        {
            int l = (k - 300) / 2;
            int k1 = k & 1;
            int j2 = anIntArray1117[l];
            if(j2 != -1)
            {
                do
                {
                    if(k1 == 0 && --j2 < 0)
                        j2 = IDK.anInt229 - 1;
                    if(k1 == 1 && ++j2 >= IDK.anInt229)
                        j2 = 0;
                } while(IDK.aClass15Array230[j2].aBoolean236 || IDK.aClass15Array230[j2].anInt231 != l + (aBoolean1286 ? 0 : 7));
                anIntArray1117[l] = j2;
                aBoolean1202 = true;
            }
        }
        if(k >= 314 && k <= 323)
        {
            int i1 = (k - 314) / 2;
            int l1 = k & 1;
            int k2 = anIntArray852[i1];
            if(l1 == 0 && --k2 < 0)
                k2 = anIntArrayArray1020[i1].length - 1;
            if(l1 == 1 && ++k2 >= anIntArrayArray1020[i1].length)
                k2 = 0;
            anIntArray852[i1] = k2;
            aBoolean1202 = true;
        }
        if(k == 324 && !aBoolean1286)
        {
            aBoolean1286 = true;
            method76(268);
        }
        if(k == 325 && aBoolean1286)
        {
            aBoolean1286 = false;
            method76(268);
        }
        if(k == 326)
        {
            outgoingVector.writeOpcode(140);
            outgoingVector.putByte(aBoolean1286 ? 0 : 1);
            for(int j1 = 0; j1 < 7; j1++)
                outgoingVector.putByte(anIntArray1117[j1]);

            for(int i2 = 0; i2 < 5; i2++)
                outgoingVector.putByte(anIntArray852[i2]);

            return true;
        }
        if(k == 620)
            aBoolean1319 = !aBoolean1319;
        if(k >= 601 && k <= 613)
        {
            method34(0);
            if(aString1012.length() > 0)
            {
                outgoingVector.writeOpcode(187);
                outgoingVector.putLong(Class37.stringToLong(aString1012));
                outgoingVector.putByte(k - 601);
                outgoingVector.putByte(aBoolean1319 ? 1 : 0);
            }
        }
        return false;
    }

    public void method108(int i, Class39_Sub3_Sub2_Sub5 class39_sub3_sub2_sub5, int j)
    {
        if(i != 0)
        {
            return;
        } else
        {
            method109(class39_sub3_sub2_sub5.anInt1622, j, false, class39_sub3_sub2_sub5.anInt1621);
            return;
        }
    }

    public void method109(int i, int j, boolean flag, int k)
    {
        if(k < 128 || i < 128 || k > 13056 || i > 13056)
        {
            anInt934 = -1;
            anInt935 = -1;
            return;
        }
        int l = method21(k, i, myHeightLevel, 43591) - j;
        k -= anInt1209;
        l -= anInt1210;
        i -= anInt1211;
        int i1 = Class39_Sub3_Sub2_Sub4.anIntArray1588[anInt1212];
        int j1 = Class39_Sub3_Sub2_Sub4.anIntArray1589[anInt1212];
        int k1 = Class39_Sub3_Sub2_Sub4.anIntArray1588[anInt1213];
        int l1 = Class39_Sub3_Sub2_Sub4.anIntArray1589[anInt1213];
        int i2 = i * k1 + k * l1 >> 16;
        i = i * l1 - k * k1 >> 16;
        k = i2;
        i2 = l * j1 - i * i1 >> 16;
        i = l * i1 + i * j1 >> 16;
        if(flag)
            aBoolean890 = !aBoolean890;
        l = i2;
        if(i >= 50)
        {
            anInt934 = Class39_Sub3_Sub4_Sub1.anInt1674 + (k << 9) / i;
            anInt935 = Class39_Sub3_Sub4_Sub1.anInt1675 + (l << 9) / i;
            return;
        } else
        {
            anInt934 = -1;
            anInt935 = -1;
            return;
        }
    }

    public void method110(Class39_Sub3_Sub4_Sub4 class39_sub3_sub4_sub4, boolean flag, int i, int j) {
        if(!flag)
            method6();
        int k = i * i + j * j;
        if(k > 4225 && k < 0x15f90)
        {
            int l = anInt928 + anInt1234 & 0x7ff;
            int i1 = Class39_Sub3_Sub2_Sub4.anIntArray1588[l];
            int j1 = Class39_Sub3_Sub2_Sub4.anIntArray1589[l];
            i1 = (i1 * 256) / (anInt881 + 256);
            j1 = (j1 * 256) / (anInt881 + 256);
            int k1 = j * i1 + i * j1 >> 16;
            int l1 = j * j1 - i * i1 >> 16;
            double d = Math.atan2(k1, l1);
            int i2 = (int)(Math.sin(d) * 63D);
            int j2 = (int)(Math.cos(d) * 57D);
            aClass39_Sub3_Sub4_Sub4_1025.method535(d, 83 - j2 - 20, false, (94 + i2 + 4) - 10, 20, 15, 256, 20, 15);
            return;
        } else
        {
            method140(46599, j, i, class39_sub3_sub4_sub4);
            return;
        }
    }

    public void run() {
    	if(aBoolean1303) {
    		method68(0);
    		return;
    	} else {
    		super.run();
    		return;
    	}
    }

    public static void initializeHighMemory() {
    	Class31.aBoolean477 = false;
    	Class39_Sub3_Sub4_Sub1.aBoolean1669 = false;
    	highMemory = false;
    	Class22.aBoolean318 = false;
    	Class27.aBoolean375 = false;
    	return;
    }

    public void method112(int i, int j)
    {
        if(i < 0)
            return;
        int k = anIntArray1120[i];
        int l = anIntArray1121[i];
        int i1 = anIntArray1122[i];
        int j1 = anIntArray1123[i];
        if(i1 >= 2000)
            i1 -= 2000;
        if(anInt1169 != 0 && i1 != 1033)
        {
            anInt1169 = 0;
            aBoolean993 = true;
        }
        if(i1 == 695 && method124(l, j1, k, -41819))
        {
            outgoingVector.writeOpcode(106);
            outgoingVector.putLEShortA(anInt908);
            outgoingVector.putShort(l + anInt990);
            outgoingVector.putLEShort(k + anInt989);
            outgoingVector.putShortA(anInt907);
            outgoingVector.putLEShort(anInt906);
            outgoingVector.putShortA(j1 >> 14 & 0x7fff);
        }
        if(i1 == 822)
        {
            Player player = players[j1];
            if(player != null)
            {
                calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 1, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 1, 0, false, 2, ((Class39_Sub3_Sub2_Sub5) (player)).anIntArray1629[0], ((Class39_Sub3_Sub2_Sub5) (player)).anIntArray1630[0]);
                anInt919 = super.anInt30;
                anInt920 = super.anInt31;
                anInt922 = 2;
                anInt921 = 0;
                outgoingVector.writeOpcode(190);
                outgoingVector.putShortA(anInt1324);
                outgoingVector.putLEShortA(j1);
            }
        }
        if(i1 == 716)
        {
            Player player = players[j1];
            if(player != null)
            {
                calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 1, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 1, 0, false, 2, ((Class39_Sub3_Sub2_Sub5) (player)).anIntArray1629[0], ((Class39_Sub3_Sub2_Sub5) (player)).anIntArray1630[0]);
                anInt919 = super.anInt30;
                anInt920 = super.anInt31;
                anInt922 = 2;
                anInt921 = 0;
                outgoingVector.writeOpcode(169);
                outgoingVector.putLEShort(j1);
            }
        }
        if(i1 == 549)
            if(!aBoolean1293)
                aClass31_868.method329(super.anInt31 - 4, -923, super.anInt30 - 4);
            else
                aClass31_868.method329(l - 4, -923, k - 4);
        if(i1 == 598)
        {
            RSInterface class34 = RSInterface.getInterface(l);
            anInt1323 = 1;
            anInt1324 = l;
            anInt1325 = class34.anInt629;
            anInt905 = 0;
            needDrawTabArea = true;
            String s4 = class34.aString611;
            if(s4.indexOf(" ") != -1)
                s4 = s4.substring(0, s4.indexOf(" "));
            String s7 = class34.aString611;
            if(s7.indexOf(" ") != -1)
                s7 = s7.substring(s7.indexOf(" ") + 1);
            aString1326 = s4 + " " + class34.aString591 + " " + s7;
            if(anInt1325 == 16)
            {
                needDrawTabArea = true;
                tabId = 3;
                aBoolean1188 = true;
            }
            return;
        }
        if(i1 == 960)
        {
            anInt905 = 1;
            anInt906 = k;
            anInt907 = l;
            anInt908 = j1;
            aString909 = String.valueOf(Class4.method174(j1).aString105);
            anInt1323 = 0;
            needDrawTabArea = true;
            return;
        }
        if(i1 == 144)
        {
            Class39_Sub3_Sub2_Sub5_Sub2 class39_sub3_sub2_sub5_sub2 = aClass39_Sub3_Sub2_Sub5_Sub2Array899[j1];
            if(class39_sub3_sub2_sub5_sub2 != null)
            {
                calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 1, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 1, 0, false, 2, ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anIntArray1629[0], ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anIntArray1630[0]);
                anInt919 = super.anInt30;
                anInt920 = super.anInt31;
                anInt922 = 2;
                anInt921 = 0;
                if((j1 & 3) == 0)
                    anInt1171++;
                if(anInt1171 >= 106)
                {
                    outgoingVector.writeOpcode(32);
                    outgoingVector.putShort(55586);
                    anInt1171 = 0;
                }
                outgoingVector.writeOpcode(18);
                outgoingVector.putShortA(j1);
            }
        }
        if(i1 == 480)
        {
            Player class39_sub3_sub2_sub5_sub1_2 = players[j1];
            if(class39_sub3_sub2_sub5_sub1_2 != null)
            {
                calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 1, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 1, 0, false, 2, ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub1_2)).anIntArray1629[0], ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub1_2)).anIntArray1630[0]);
                anInt919 = super.anInt30;
                anInt920 = super.anInt31;
                anInt922 = 2;
                anInt921 = 0;
                anInt1335 += j1;
                if(anInt1335 >= 89)
                {
                    outgoingVector.writeOpcode(85);
                    outgoingVector.putInt(0);
                    anInt1335 = 0;
                }
                outgoingVector.writeOpcode(113);
                outgoingVector.putShort(j1);
            }
        }
        if(i1 == 744)
        {
            Class39_Sub3_Sub2_Sub5_Sub2 class39_sub3_sub2_sub5_sub2_1 = aClass39_Sub3_Sub2_Sub5_Sub2Array899[j1];
            if(class39_sub3_sub2_sub5_sub2_1 != null)
            {
                calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 1, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 1, 0, false, 2, ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2_1)).anIntArray1629[0], ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2_1)).anIntArray1630[0]);
                anInt919 = super.anInt30;
                anInt920 = super.anInt31;
                anInt922 = 2;
                anInt921 = 0;
                outgoingVector.writeOpcode(105);
                outgoingVector.putShort(j1);
            }
        }
        if(i1 == 651)
        {
            Player class39_sub3_sub2_sub5_sub1_3 = players[j1];
            if(class39_sub3_sub2_sub5_sub1_3 != null)
            {
                calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 1, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 1, 0, false, 2, ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub1_3)).anIntArray1629[0], ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub1_3)).anIntArray1630[0]);
                anInt919 = super.anInt30;
                anInt920 = super.anInt31;
                anInt922 = 2;
                anInt921 = 0;
                outgoingVector.writeOpcode(138);
                outgoingVector.putLEShort(j1);
            }
        }
        if(i1 == 541)
        {
            String s = aStringArray965[i];
            int l1 = s.indexOf("@whi@");
            if(l1 != -1)
                if(anInt1113 == -1)
                {
                    method34(0);
                    aString1012 = s.substring(l1 + 5).trim();
                    aBoolean1319 = false;
                    anInt850 = anInt1113 = RSInterface.anInt616;
                } else
                {
                    sendMessage((byte)-83, "Please close the interface you have open before using 'report abuse'", 0, "");
                }
        }
        if(i1 == 881)
        {
            Class39_Sub3_Sub2_Sub5_Sub2 class39_sub3_sub2_sub5_sub2_2 = aClass39_Sub3_Sub2_Sub5_Sub2Array899[j1];
            if(class39_sub3_sub2_sub5_sub2_2 != null)
            {
                calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 1, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 1, 0, false, 2, ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2_2)).anIntArray1629[0], ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2_2)).anIntArray1630[0]);
                anInt919 = super.anInt30;
                anInt920 = super.anInt31;
                anInt922 = 2;
                anInt921 = 0;
                anInt1290 += j1;
                if(anInt1290 >= 132)
                {
                    outgoingVector.writeOpcode(20);
                    outgoingVector.putInt(0);
                    anInt1290 = 0;
                }
                outgoingVector.writeOpcode(148);
                outgoingVector.putLEShortA(j1);
            }
        }
        if(i1 == 125)
        {
            outgoingVector.writeOpcode(90);
            outgoingVector.putLEShortA(j1);
            outgoingVector.putLEShort(k);
            outgoingVector.putLEShort(l);
            anInt960 = 0;
            anInt961 = l;
            anInt962 = k;
            anInt963 = 2;
            if(RSInterface.getInterface(l).parentId == anInt1113)
                anInt963 = 1;
            if(RSInterface.getInterface(l).parentId == anInt1208)
                anInt963 = 3;
        }
        if(i1 == 579)
            method34(0);
        if(i1 == 183 && method124(l, j1, k, -41819))
        {
            outgoingVector.writeOpcode(55);
            outgoingVector.putLEShortA(j1 >> 14 & 0x7fff);
            outgoingVector.putShort(k + anInt989);
            outgoingVector.putLEShort(l + anInt990);
            outgoingVector.putShortA(anInt1324);
        }
        if(i1 == 138 || i1 == 997 || i1 == 154 || i1 == 837)
        {
            String s1 = aStringArray965[i];
            int i2 = s1.indexOf("@whi@");
            if(i2 != -1)
            {
                long l3 = Class37.stringToLong(s1.substring(i2 + 5).trim());
                if(i1 == 138)
                    method106(842, l3);
                if(i1 == 997)
                    method145(0, l3);
                if(i1 == 154)
                    method122(l3, false);
                if(i1 == 837)
                    method91(l3, anInt1153);
            }
        }
        if(i1 == 322 && !aBoolean896)
        {
            outgoingVector.writeOpcode(185);
            outgoingVector.putShort(l);
            aBoolean896 = true;
        }
        if(i1 == 669)
        {
            boolean flag = calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 0, 0, false, 2, k, l);
            if(!flag)
                flag = calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 1, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 1, 0, false, 2, k, l);
            anInt919 = super.anInt30;
            anInt920 = super.anInt31;
            anInt922 = 2;
            anInt921 = 0;
            outgoingVector.writeOpcode(172);
            outgoingVector.putLEShortA(j1);
            outgoingVector.putLEShortA(k + anInt989);
            outgoingVector.putShort(l + anInt990);
        }
        if(i1 == 551)
        {
            outgoingVector.writeOpcode(8);
            outgoingVector.putShortA(j1);
            outgoingVector.putLEShort(k);
            outgoingVector.putShort(l);
            anInt960 = 0;
            anInt961 = l;
            anInt962 = k;
            anInt963 = 2;
            if(RSInterface.getInterface(l).parentId == anInt1113)
                anInt963 = 1;
            if(RSInterface.getInterface(l).parentId == anInt1208)
                anInt963 = 3;
        }
        if(i1 == 559)
        {
            method15((byte)6, anInt1106);
            anInt1106 = -1;
            aBoolean993 = true;
        }
        if(i1 == 264)
        {
            Player player_4 = players[j1];
            if(player_4 != null)
            {
                calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 1, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 1, 0, false, 2, ((Class39_Sub3_Sub2_Sub5) (player_4)).anIntArray1629[0], ((Class39_Sub3_Sub2_Sub5) (player_4)).anIntArray1630[0]);
                anInt919 = super.anInt30;
                anInt920 = super.anInt31;
                anInt922 = 2;
                anInt921 = 0;
                outgoingVector.writeOpcode(75);
                outgoingVector.putLEShort(j1);
            }
        }
        if(i1 == 78)
        {
            boolean flag1 = calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 0, 0, false, 2, k, l);
            if(!flag1)
                flag1 = calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 1, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 1, 0, false, 2, k, l);
            anInt919 = super.anInt30;
            anInt920 = super.anInt31;
            anInt922 = 2;
            anInt921 = 0;
            outgoingVector.writeOpcode(119);
            outgoingVector.putShortA(k + anInt989);
            outgoingVector.putLEShortA(j1);
            outgoingVector.putLEShortA(l + anInt990);
        }
        if(i1 == 59)
        {
            Class39_Sub3_Sub2_Sub5_Sub2 class39_sub3_sub2_sub5_sub2_3 = aClass39_Sub3_Sub2_Sub5_Sub2Array899[j1];
            if(class39_sub3_sub2_sub5_sub2_3 != null)
            {
                calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 1, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 1, 0, false, 2, ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2_3)).anIntArray1629[0], ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2_3)).anIntArray1630[0]);
                anInt919 = super.anInt30;
                anInt920 = super.anInt31;
                anInt922 = 2;
                anInt921 = 0;
                outgoingVector.writeOpcode(57);
                outgoingVector.putLEShortA(j1);
            }
        }
        if(i1 == 1103)
        {
            method124(l, j1, k, -41819);
            outgoingVector.writeOpcode(109);
            outgoingVector.putLEShort(l + anInt990);
            outgoingVector.putLEShort(k + anInt989);
            outgoingVector.putShortA(j1 >> 14 & 0x7fff);
        }
        if(i1 == 354)
        {
            Class39_Sub3_Sub2_Sub5_Sub2 class39_sub3_sub2_sub5_sub2_4 = aClass39_Sub3_Sub2_Sub5_Sub2Array899[j1];
            if(class39_sub3_sub2_sub5_sub2_4 != null)
            {
                calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 1, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 1, 0, false, 2, ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2_4)).anIntArray1629[0], ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2_4)).anIntArray1630[0]);
                anInt919 = super.anInt30;
                anInt920 = super.anInt31;
                anInt922 = 2;
                anInt921 = 0;
                outgoingVector.writeOpcode(49);
                outgoingVector.putShortA(j1);
            }
        }
        if(i1 == 1977)
        {
            Class4 class4 = Class4.method174(j1);
            String s5;
            if(class4.aByteArray85 != null)
                s5 = new String(class4.aByteArray85);
            else
                s5 = "It's a " + class4.aString105 + ".";
            sendMessage((byte)-83, s5, 0, "");
        }
        if(i1 == 891)
        {
            RSInterface class34_1 = RSInterface.getInterface(l);
            boolean flag7 = true;
            if(class34_1.anInt632 > 0)
                flag7 = method107(class34_1, 1203);
            if(flag7)
            {
                outgoingVector.writeOpcode(211);
                outgoingVector.putShort(l);
            }
        }
        if(i1 == 163)
        {
            boolean flag2 = calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 0, 0, false, 2, k, l);
            if(!flag2)
                flag2 = calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 1, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 1, 0, false, 2, k, l);
            anInt919 = super.anInt30;
            anInt920 = super.anInt31;
            anInt922 = 2;
            anInt921 = 0;
            outgoingVector.writeOpcode(86);
            outgoingVector.putShort(anInt906);
            outgoingVector.putLEShortA(j1);
            outgoingVector.putLEShort(anInt908);
            outgoingVector.putShort(anInt907);
            outgoingVector.putLEShort(k + anInt989);
            outgoingVector.putLEShort(l + anInt990);
        }
        if(i1 == 288)
        {
            if((anInt989 & 3) == 0)
                anInt1276++;
            if(anInt1276 >= 107)
            {
                outgoingVector.writeOpcode(156);
                outgoingVector.putInt(0);
                anInt1276 = 0;
            }
            method124(l, j1, k, -41819);
            outgoingVector.writeOpcode(7);
            outgoingVector.putLEShort(l + anInt990);
            outgoingVector.putLEShort(j1 >> 14 & 0x7fff);
            outgoingVector.putShort(k + anInt989);
        }
        if(i1 == 405)
        {
            Player class39_sub3_sub2_sub5_sub1_5 = players[j1];
            if(class39_sub3_sub2_sub5_sub1_5 != null)
            {
                calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 1, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 1, 0, false, 2, ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub1_5)).anIntArray1629[0], ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub1_5)).anIntArray1630[0]);
                anInt919 = super.anInt30;
                anInt920 = super.anInt31;
                anInt922 = 2;
                anInt921 = 0;
                outgoingVector.writeOpcode(130);
                outgoingVector.putShort(anInt907);
                outgoingVector.putLEShortA(j1);
                outgoingVector.putLEShortA(anInt908);
                outgoingVector.putLEShort(anInt906);
            }
        }
        if(i1 == 740)
        {
            boolean flag3 = calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 0, 0, false, 2, k, l);
            if(!flag3)
                flag3 = calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 1, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 1, 0, false, 2, k, l);
            anInt919 = super.anInt30;
            anInt920 = super.anInt31;
            anInt922 = 2;
            anInt921 = 0;
            outgoingVector.writeOpcode(192);
            outgoingVector.putLEShortA(l + anInt990);
            outgoingVector.putLEShortA(k + anInt989);
            outgoingVector.putLEShortA(j1);
        }
        if(i1 == 708)
        {
            Class39_Sub3_Sub2_Sub5_Sub2 class39_sub3_sub2_sub5_sub2_5 = aClass39_Sub3_Sub2_Sub5_Sub2Array899[j1];
            if(class39_sub3_sub2_sub5_sub2_5 != null)
            {
                calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 1, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 1, 0, false, 2, ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2_5)).anIntArray1629[0], ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2_5)).anIntArray1630[0]);
                anInt919 = super.anInt30;
                anInt920 = super.anInt31;
                anInt922 = 2;
                anInt921 = 0;
                outgoingVector.writeOpcode(235);
                outgoingVector.putLEShortA(anInt907);
                outgoingVector.putLEShortA(anInt906);
                outgoingVector.putLEShortA(j1);
                outgoingVector.putShort(anInt908);
            }
        }
        if(i1 == 840)
        {
            outgoingVector.writeOpcode(131);
            outgoingVector.putLEShortA(k);
            outgoingVector.putShort(l);
            outgoingVector.putShortA(j1);
            anInt960 = 0;
            anInt961 = l;
            anInt962 = k;
            anInt963 = 2;
            if(RSInterface.getInterface(l).parentId == anInt1113)
                anInt963 = 1;
            if(RSInterface.getInterface(l).parentId == anInt1208)
                anInt963 = 3;
        }
        if(i1 == 1219)
        {
            Class39_Sub3_Sub2_Sub5_Sub2 class39_sub3_sub2_sub5_sub2_6 = aClass39_Sub3_Sub2_Sub5_Sub2Array899[j1];
            if(class39_sub3_sub2_sub5_sub2_6 != null)
            {
                Class47 class47 = class39_sub3_sub2_sub5_sub2_6.aClass47_1772;
                if(class47.anIntArray785 != null)
                    class47 = class47.method593(0);
                if(class47 != null)
                {
                    String s8;
                    if(class47.aByteArray789 != null)
                        s8 = new String(class47.aByteArray789);
                    else
                        s8 = "It's a " + class47.aString821 + ".";
                    sendMessage((byte)-83, s8, 0, "");
                }
            }
        }
        if(i1 == 769)
        {
            anInt1164 += l;
            if(anInt1164 >= 97)
            {
                outgoingVector.writeOpcode(16);
                outgoingVector.putShort(43274);
                anInt1164 = 0;
            }
            method124(l, j1, k, -41819);
            outgoingVector.writeOpcode(145);
            outgoingVector.putLEShortA(k + anInt989);
            outgoingVector.putLEShort(l + anInt990);
            outgoingVector.putLEShort(j1 >> 14 & 0x7fff);
        }
        if(i1 == 682)
        {
            outgoingVector.writeOpcode(211);
            outgoingVector.putShort(l);
            RSInterface class34_2 = RSInterface.getInterface(l);
            if(class34_2.anIntArrayArray654 != null && class34_2.anIntArrayArray654[0][0] == 5)
            {
                int j2 = class34_2.anIntArrayArray654[0][1];
                anIntArray943[j2] = 1 - anIntArray943[j2];
                method97(j2, aByte1243);
                needDrawTabArea = true;
            }
        }
        if(i1 == 330)
        {
            outgoingVector.writeOpcode(78);
            outgoingVector.putShort(j1);
            outgoingVector.putLEShort(l);
            outgoingVector.putShort(k);
            anInt960 = 0;
            anInt961 = l;
            anInt962 = k;
            anInt963 = 2;
            if(RSInterface.getInterface(l).parentId == anInt1113)
                anInt963 = 1;
            if(RSInterface.getInterface(l).parentId == anInt1208)
                anInt963 = 3;
        }
        if(i1 == 283)
        {
            Player player_6 = players[j1];
            if(player_6 != null)
            {
                calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 1, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 1, 0, false, 2, ((Class39_Sub3_Sub2_Sub5) (player_6)).anIntArray1629[0], ((Class39_Sub3_Sub2_Sub5) (player_6)).anIntArray1630[0]);
                anInt919 = super.anInt30;
                anInt920 = super.anInt31;
                anInt922 = 2;
                anInt921 = 0;
                anInt1002 += j1;
                if(anInt1002 >= 88)
                {
                    outgoingVector.writeOpcode(163);
                    outgoingVector.putShort(5996);
                    anInt1002 = 0;
                }
                outgoingVector.writeOpcode(99);
                outgoingVector.putShort(j1);
            }
        }
        if(i1 == 688)
        {
            anInt1236 += j1;
            if(anInt1236 >= 119)
            {
                outgoingVector.writeOpcode(205);
                outgoingVector.putShort(11544);
                anInt1236 = 0;
            }
            outgoingVector.writeOpcode(242);
            outgoingVector.putShortA(k);
            outgoingVector.putLEShort(j1);
            outgoingVector.putLEShort(l);
            anInt960 = 0;
            anInt961 = l;
            anInt962 = k;
            anInt963 = 2;
            if(RSInterface.getInterface(l).parentId == anInt1113)
                anInt963 = 1;
            if(RSInterface.getInterface(l).parentId == anInt1208)
                anInt963 = 3;
        }
        if(i1 == 261)
        {
            outgoingVector.writeOpcode(183);
            outgoingVector.putShortA(k);
            outgoingVector.putShortA(l);
            outgoingVector.putLEShortA(j1);
            outgoingVector.putLEShort(anInt1324);
            anInt960 = 0;
            anInt961 = l;
            anInt962 = k;
            anInt963 = 2;
            if(RSInterface.getInterface(l).parentId == anInt1113)
                anInt963 = 1;
            if(RSInterface.getInterface(l).parentId == anInt1208)
                anInt963 = 3;
        }
        if(i1 == 946)
        {
            String s2 = aStringArray965[i];
            int k2 = s2.indexOf("@whi@");
            if(k2 != -1)
            {
                long l4 = Class37.stringToLong(s2.substring(k2 + 5).trim());
                int j3 = -1;
                for(int i4 = 0; i4 < anInt1190; i4++)
                {
                    if(aLongArray1050[i4] != l4)
                        continue;
                    j3 = i4;
                    break;
                }

                if(j3 != -1 && anIntArray895[j3] > 0)
                {
                    aBoolean993 = true;
                    anInt1169 = 0;
                    aBoolean1001 = true;
                    aString1023 = "";
                    anInt1180 = 3;
                    aLong841 = aLongArray1050[j3];
                    aString1152 = "Enter message to send to " + aStringArray1216[j3];
                }
            }
        }
        if(i1 == 459)
        {
            if((l & 3) == 0)
                anInt1221++;
            if(anInt1221 >= 78)
            {
                outgoingVector.writeOpcode(72);
                outgoingVector.putByte(127);
                anInt1221 = 0;
            }
            outgoingVector.writeOpcode(28);
            outgoingVector.putLEShortA(l);
            outgoingVector.putLEShort(j1);
            outgoingVector.putLEShortA(k);
            anInt960 = 0;
            anInt961 = l;
            anInt962 = k;
            anInt963 = 2;
            if(RSInterface.getInterface(l).parentId == anInt1113)
                anInt963 = 1;
            if(RSInterface.getInterface(l).parentId == anInt1208)
                anInt963 = 3;
        }
        if(i1 == 550)
        {
            boolean flag4 = calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 0, 0, false, 2, k, l);
            if(!flag4)
                flag4 = calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 1, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 1, 0, false, 2, k, l);
            anInt919 = super.anInt30;
            anInt920 = super.anInt31;
            anInt922 = 2;
            anInt921 = 0;
            outgoingVector.writeOpcode(250);
            outgoingVector.putLEShortA(anInt1324);
            outgoingVector.putLEShort(k + anInt989);
            outgoingVector.putLEShort(l + anInt990);
            outgoingVector.putLEShortA(j1);
        }
        if(i1 == 1415)
        {
            int k1 = j1 >> 14 & 0x7fff;
            Class27 class27 = Class27.method272(k1);
            String s9;
            if(class27.aByteArray406 != null)
                s9 = new String(class27.aByteArray406);
            else
                s9 = "It's a " + class27.aString392 + ".";
            sendMessage((byte)-83, s9, 0, "");
        }
        if(i1 == 119 || i1 == 875)
        {
            String s3 = aStringArray965[i];
            int l2 = s3.indexOf("@whi@");
            if(l2 != -1)
            {
                s3 = s3.substring(l2 + 5).trim();
                String s10 = Class37.method372(Class37.method369(-39, Class37.stringToLong(s3)), false);
                boolean flag8 = false;
                for(int k3 = 0; k3 < playerCount; k3++)
                {
                    Player player_7 = players[playerIndices[k3]];
                    if(player_7 == null || player_7.aString1754 == null || !player_7.aString1754.equalsIgnoreCase(s10))
                        continue;
                    calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 1, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 1, 0, false, 2, ((Class39_Sub3_Sub2_Sub5) (player_7)).anIntArray1629[0], ((Class39_Sub3_Sub2_Sub5) (player_7)).anIntArray1630[0]);
                    if(i1 == 119)
                    {
                        anInt1002 += j1;
                        if(anInt1002 >= 88)
                        {
                            outgoingVector.writeOpcode(163);
                            outgoingVector.putShort(5996);
                            anInt1002 = 0;
                        }
                        outgoingVector.writeOpcode(99);
                        outgoingVector.putShort(playerIndices[k3]);
                    }
                    if(i1 == 875)
                    {
                        outgoingVector.writeOpcode(75);
                        outgoingVector.putLEShort(playerIndices[k3]);
                    }
                    flag8 = true;
                    break;
                }

                if(!flag8)
                    sendMessage((byte)-83, "Unable to find " + s10, 0, "");
            }
        }
        if(i1 == 813)
        {
            outgoingVector.writeOpcode(243);
            outgoingVector.putShort(l);
            outgoingVector.putShortA(k);
            outgoingVector.putShortA(j1);
            anInt960 = 0;
            anInt961 = l;
            anInt962 = k;
            anInt963 = 2;
            if(RSInterface.getInterface(l).parentId == anInt1113)
                anInt963 = 1;
            if(RSInterface.getInterface(l).parentId == anInt1208)
                anInt963 = 3;
        }
        if(i1 == 1985)
        {
            Class4 class4_1 = Class4.method174(j1);
            RSInterface class34_4 = RSInterface.getInterface(l);
            String s6;
            if(class34_4 != null && class34_4.anIntArray603[k] >= 0x186a0)
                s6 = class34_4.anIntArray603[k] + " x " + class4_1.aString105;
            else
            if(class4_1.aByteArray85 != null)
                s6 = new String(class4_1.aByteArray85);
            else
                s6 = "It's a " + class4_1.aString105 + ".";
            sendMessage((byte)-83, s6, 0, "");
        }
        if(i1 == 548)
        {
            outgoingVector.writeOpcode(211);
            outgoingVector.putShort(l);
            RSInterface class34_3 = RSInterface.getInterface(l);
            if(class34_3.anIntArrayArray654 != null && class34_3.anIntArrayArray654[0][0] == 5)
            {
                int i3 = class34_3.anIntArrayArray654[0][1];
                if(anIntArray943[i3] != class34_3.anIntArray645[0])
                {
                    anIntArray943[i3] = class34_3.anIntArray645[0];
                    method97(i3, aByte1243);
                    needDrawTabArea = true;
                }
            }
        }
        if(i1 == 301)
        {
            method124(l, j1, k, -41819);
            outgoingVector.writeOpcode(41);
            outgoingVector.putShortA(j1 >> 14 & 0x7fff);
            outgoingVector.putLEShort(l + anInt990);
            outgoingVector.putShortA(k + anInt989);
        }
        if(i1 == 773)
        {
            outgoingVector.writeOpcode(35);
            outgoingVector.putLEShortA(k);
            outgoingVector.putLEShort(l);
            outgoingVector.putShortA(j1);
            anInt960 = 0;
            anInt961 = l;
            anInt962 = k;
            anInt963 = 2;
            if(RSInterface.getInterface(l).parentId == anInt1113)
                anInt963 = 1;
            if(RSInterface.getInterface(l).parentId == anInt1208)
                anInt963 = 3;
        }
        if(i1 == 6)
        {
            if((j1 & 3) == 0)
                anInt1328++;
            if(anInt1328 >= 93)
            {
                outgoingVector.writeOpcode(144);
                outgoingVector.putInt(0);
                anInt1328 = 0;
            }
            outgoingVector.writeOpcode(33);
            outgoingVector.putLEShort(j1);
            outgoingVector.putLEShortA(k);
            outgoingVector.putShort(l);
            anInt960 = 0;
            anInt961 = l;
            anInt962 = k;
            anInt963 = 2;
            if(RSInterface.getInterface(l).parentId == anInt1113)
                anInt963 = 1;
            if(RSInterface.getInterface(l).parentId == anInt1208)
                anInt963 = 3;
        }
        if(i1 == 126)
        {
            boolean flag5 = calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 0, 0, false, 2, k, l);
            if(!flag5)
                flag5 = calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 1, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 1, 0, false, 2, k, l);
            anInt919 = super.anInt30;
            anInt920 = super.anInt31;
            anInt922 = 2;
            anInt921 = 0;
            outgoingVector.writeOpcode(27);
            outgoingVector.putLEShort(j1);
            outgoingVector.putLEShort(k + anInt989);
            outgoingVector.putLEShort(l + anInt990);
        }
        if(i1 == 652)
        {
            method124(l, j1, k, -41819);
            outgoingVector.writeOpcode(189);
            outgoingVector.putLEShort(j1 >> 14 & 0x7fff);
            outgoingVector.putShort(l + anInt990);
            outgoingVector.putLEShort(k + anInt989);
        }
        if(i1 == 612)
        {
            outgoingVector.writeOpcode(69);
            outgoingVector.putLEShort(anInt908);
            outgoingVector.putLEShort(l);
            outgoingVector.putLEShort(anInt906);
            outgoingVector.putShortA(j1);
            outgoingVector.putShortA(anInt907);
            outgoingVector.putShortA(k);
            anInt960 = 0;
            anInt961 = l;
            anInt962 = k;
            anInt963 = 2;
            if(RSInterface.getInterface(l).parentId == anInt1113)
                anInt963 = 1;
            if(RSInterface.getInterface(l).parentId == anInt1208)
                anInt963 = 3;
        }
        if(i1 == 834)
        {
            Class39_Sub3_Sub2_Sub5_Sub2 class39_sub3_sub2_sub5_sub2_7 = aClass39_Sub3_Sub2_Sub5_Sub2Array899[j1];
            if(class39_sub3_sub2_sub5_sub2_7 != null)
            {
                calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 1, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 1, 0, false, 2, ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2_7)).anIntArray1629[0], ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2_7)).anIntArray1630[0]);
                anInt919 = super.anInt30;
                anInt920 = super.anInt31;
                anInt922 = 2;
                anInt921 = 0;
                outgoingVector.writeOpcode(83);
                outgoingVector.putLEShortA(j1);
                outgoingVector.putLEShortA(anInt1324);
            }
        }
        if(i1 == 922)
        {
            boolean flag6 = calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 0, 0, false, 2, k, l);
            if(!flag6)
                flag6 = calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 1, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 1, 0, false, 2, k, l);
            anInt919 = super.anInt30;
            anInt920 = super.anInt31;
            anInt922 = 2;
            anInt921 = 0;
            outgoingVector.writeOpcode(100);
            outgoingVector.putShort(j1);
            outgoingVector.putLEShortA(k + anInt989);
            outgoingVector.putLEShort(l + anInt990);
        }
        if(i1 == 616)
        {
            outgoingVector.writeOpcode(24);
            outgoingVector.putLEShortA(j1);
            outgoingVector.putLEShort(k);
            outgoingVector.putLEShort(l);
            anInt960 = 0;
            anInt961 = l;
            anInt962 = k;
            anInt963 = 2;
            if(RSInterface.getInterface(l).parentId == anInt1113)
                anInt963 = 1;
            if(RSInterface.getInterface(l).parentId == anInt1208)
                anInt963 = 3;
        }
        anInt905 = 0;
        anInt1323 = 0;
        needDrawTabArea = true;
        if(j != 19817)
            anInt1187 = 160;
    }

    public void method113(int i)
    {
        while(i >= 0) 
            aBoolean1124 = !aBoolean1124;
        if(anInt1237 > 1)
            anInt1237--;
        if(anInt1176 > 0)
            anInt1176--;
        for(int j = 0; j < 5; j++)
            if(!parseOpcode(0))
                break;

        if(!aBoolean952)
            return;
        synchronized(aClass8_1151.anObject158)
        {
            if(aBoolean1230)
            {
                if(super.anInt29 != 0 || aClass8_1151.anInt157 >= 40)
                {
                    outgoingVector.writeOpcode(80);
                    outgoingVector.putByte(0);
                    int k2 = outgoingVector.currentOffset;
                    int k3 = 0;
                    for(int k4 = 0; k4 < aClass8_1151.anInt157; k4++)
                    {
                        if(k2 - outgoingVector.currentOffset >= 240)
                            break;
                        k3++;
                        int i5 = aClass8_1151.anIntArray163[k4];
                        if(i5 < 0)
                            i5 = 0;
                        else
                        if(i5 > 502)
                            i5 = 502;
                        int l5 = aClass8_1151.anIntArray159[k4];
                        if(l5 < 0)
                            l5 = 0;
                        else
                        if(l5 > 764)
                            l5 = 764;
                        int j6 = i5 * 765 + l5;
                        if(aClass8_1151.anIntArray163[k4] == -1 && aClass8_1151.anIntArray159[k4] == -1)
                        {
                            l5 = -1;
                            i5 = -1;
                            j6 = 0x7ffff;
                        }
                        if(l5 == anInt1041 && i5 == anInt1042)
                        {
                            if(anInt856 < 2047)
                                anInt856++;
                        } else
                        {
                            int k6 = l5 - anInt1041;
                            anInt1041 = l5;
                            int l6 = i5 - anInt1042;
                            anInt1042 = i5;
                            if(anInt856 < 8 && k6 >= -32 && k6 <= 31 && l6 >= -32 && l6 <= 31)
                            {
                                k6 += 32;
                                l6 += 32;
                                outgoingVector.putShort((anInt856 << 12) + (k6 << 6) + l6);
                                anInt856 = 0;
                            } else
                            if(anInt856 < 8)
                            {
                                outgoingVector.putTribyte(0x800000 + (anInt856 << 19) + j6);
                                anInt856 = 0;
                            } else
                            {
                                outgoingVector.putInt(0xc0000000 + (anInt856 << 19) + j6);
                                anInt856 = 0;
                            }
                        }
                    }

                    outgoingVector.writePacketSize(outgoingVector.currentOffset - k2);
                    if(k3 >= aClass8_1151.anInt157)
                    {
                        aClass8_1151.anInt157 = 0;
                    } else
                    {
                        aClass8_1151.anInt157 -= k3;
                        for(int j5 = 0; j5 < aClass8_1151.anInt157; j5++)
                        {
                            aClass8_1151.anIntArray159[j5] = aClass8_1151.anIntArray159[j5 + k3];
                            aClass8_1151.anIntArray163[j5] = aClass8_1151.anIntArray163[j5 + k3];
                        }

                    }
                }
            } else
            {
                aClass8_1151.anInt157 = 0;
            }
        }
        if(super.anInt29 != 0)
        {
            long l = (super.aLong32 - aLong1185) / 50L;
            if(l > 4095L)
                l = 4095L;
            aLong1185 = super.aLong32;
            int l2 = super.anInt31;
            if(l2 < 0)
                l2 = 0;
            else
            if(l2 > 502)
                l2 = 502;
            int l3 = super.anInt30;
            if(l3 < 0)
                l3 = 0;
            else
            if(l3 > 764)
                l3 = 764;
            int l4 = l2 * 765 + l3;
            int k5 = 0;
            if(super.anInt29 == 2)
                k5 = 1;
            int i6 = (int)l;
            outgoingVector.writeOpcode(48);
            outgoingVector.method467((i6 << 20) + (k5 << 19) + l4);
        }
        if(anInt1227 > 0)
            anInt1227--;
        if(super.anIntArray33[1] == 1 || super.anIntArray33[2] == 1 || super.anIntArray33[3] == 1 || super.anIntArray33[4] == 1)
            aBoolean1228 = true;
        if(aBoolean1228 && anInt1227 <= 0)
        {
            anInt1227 = 20;
            aBoolean1228 = false;
            outgoingVector.writeOpcode(23);
            outgoingVector.putLEShort(anInt928);
            outgoingVector.putLEShortA(anInt927);
        }
        if(super.aBoolean20 && !aBoolean1287)
        {
            aBoolean1287 = true;
            outgoingVector.writeOpcode(240);
            outgoingVector.putByte(1);
        }
        if(!super.aBoolean20 && aBoolean1287)
        {
            aBoolean1287 = false;
            outgoingVector.writeOpcode(240);
            outgoingVector.putByte(0);
        }
        method92(-14);
        method90(aByte1294);
        method56(-607);
        anInt1174++;
        if(anInt1174 > 750)
            connectionLost(31790);
        method58(0);
        method43(aByte1059);
        method78(6);
        anInt1186++;
        if(anInt1186 > 1465)
        {
            anInt1186 = 0;
            outgoingVector.writeOpcode(2);
            outgoingVector.putByte(0);
            int k = outgoingVector.currentOffset;
            outgoingVector.putByte(49);
            if((int)(Math.random() * 2D) == 0)
                outgoingVector.putShort(39379);
            if((int)(Math.random() * 2D) == 0)
                outgoingVector.putShort(41943);
            outgoingVector.putShort(58974);
            outgoingVector.putByte((int)(Math.random() * 256D));
            outgoingVector.putByte((int)(Math.random() * 256D));
            outgoingVector.putShort((int)(Math.random() * 65536D));
            outgoingVector.putShort(51515);
            outgoingVector.putByte(17);
            if((int)(Math.random() * 2D) == 0)
                outgoingVector.putByte(167);
            outgoingVector.writePacketSize(outgoingVector.currentOffset - k);
        }
        anInt1111++;
        if(anInt922 != 0)
        {
            anInt921 += 20;
            if(anInt921 >= 400)
                anInt922 = 0;
        }
        if(anInt963 != 0)
        {
            anInt960++;
            if(anInt960 >= 15)
            {
                if(anInt963 == 2)
                    needDrawTabArea = true;
                if(anInt963 == 3)
                    aBoolean993 = true;
                anInt963 = 0;
            }
        }
        if(anInt1332 != 0)
        {
            anInt968++;
            if(super.anInt23 > anInt1333 + 5 || super.anInt23 < anInt1333 - 5 || super.anInt24 > anInt1334 + 5 || super.anInt24 < anInt1334 - 5)
                aBoolean1022 = true;
            if(super.anInt22 == 0)
            {
                if(anInt1332 == 2)
                    needDrawTabArea = true;
                if(anInt1332 == 3)
                    aBoolean993 = true;
                anInt1332 = 0;
                if(aBoolean1022 && anInt968 >= 5)
                {
                    anInt1014 = -1;
                    method41(false);
                    if(anInt1014 == anInt1330 && anInt1013 != anInt1331)
                    {
                        RSInterface class34 = RSInterface.getInterface(anInt1330);
                        int k1 = 0;
                        if(anInt1055 == 1 && class34.anInt632 == 206)
                            k1 = 1;
                        if(class34.anIntArray612[anInt1013] <= 0)
                            k1 = 0;
                        if(class34.aBoolean623)
                        {
                            int i3 = anInt1331;
                            int i4 = anInt1013;
                            class34.anIntArray612[i4] = class34.anIntArray612[i3];
                            class34.anIntArray603[i4] = class34.anIntArray603[i3];
                            class34.anIntArray612[i3] = -1;
                            class34.anIntArray603[i3] = 0;
                        } else
                        if(k1 == 1)
                        {
                            int j3 = anInt1331;
                            for(int j4 = anInt1013; j3 != j4;)
                                if(j3 > j4)
                                {
                                    class34.method355(j3 - 1, j3, false);
                                    j3--;
                                } else
                                if(j3 < j4)
                                {
                                    class34.method355(j3 + 1, j3, false);
                                    j3++;
                                }

                        } else
                        {
                            class34.method355(anInt1013, anInt1331, false);
                        }
                        outgoingVector.writeOpcode(207);
                        outgoingVector.putShort(anInt1013);
                        outgoingVector.putShortA(anInt1331);
                        outgoingVector.putByte(k1);
                        outgoingVector.putLEShort(anInt1330);
                    }
                } else
                if((anInt1079 == 1 || method121(anInt903 - 1, 33356)) && anInt903 > 2)
                    method18(-712);
                else
                if(anInt903 > 0)
                    method112(anInt903 - 1, anInt885);
                anInt960 = 10;
                super.anInt29 = 0;
            }
        }
        anInt838++;
        if(anInt838 > 61)
        {
            anInt838 = 0;
            outgoingVector.writeOpcode(166);
        }
        if(Class31.anInt511 != -1)
        {
            int i1 = Class31.anInt511;
            int l1 = Class31.anInt512;
            boolean flag = calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 0, 0, true, 0, i1, l1);
            Class31.anInt511 = -1;
            if(flag)
            {
                anInt919 = super.anInt30;
                anInt920 = super.anInt31;
                anInt922 = 1;
                anInt921 = 0;
            }
        }
        if(super.anInt29 == 1 && aString1131 != null)
        {
            aString1131 = null;
            aBoolean993 = true;
            super.anInt29 = 0;
        }
        method138(3);
        if(anInt1161 == -1)
        {
            method102(-872);
            method19((byte)6);
            reportAbuse(aBoolean916);
        }
        if(super.anInt22 == 1 || super.anInt29 == 1)
            anInt933++;
        if(anInt1263 != 0 || anInt1259 != 0 || anInt1143 != 0)
        {
            if(anInt1057 < 100)
            {
                anInt1057++;
                if(anInt1057 == 100)
                {
                    if(anInt1263 != 0)
                        aBoolean993 = true;
                    if(anInt1259 != 0)
                        needDrawTabArea = true;
                }
            }
        } else
        if(anInt1057 > 0)
            anInt1057--;
        if(anInt1203 == 2)
            method31(0);
        if(anInt1203 == 2 && aBoolean853)
            method30(-498);
        for(int j1 = 0; j1 < 5; j1++)
            anIntArray1087[j1]++;

        method141(-536);
        super.anInt21++;
        if(super.anInt21 > 4500)
        {
            anInt1176 = 250;
            super.anInt21 -= 500;
            outgoingVector.writeOpcode(46);
        }
        anInt1060++;
        if(anInt1060 > 500)
        {
            anInt1060 = 0;
            int i2 = (int)(Math.random() * 8D);
            if((i2 & 1) == 1)
                anInt1048 += anInt1049;
            if((i2 & 2) == 2)
                anInt1093 += anInt1094;
            if((i2 & 4) == 4)
                anInt1269 += anInt1270;
        }
        if(anInt1048 < -50)
            anInt1049 = 2;
        if(anInt1048 > 50)
            anInt1049 = -2;
        if(anInt1093 < -55)
            anInt1094 = 2;
        if(anInt1093 > 55)
            anInt1094 = -2;
        if(anInt1269 < -40)
            anInt1270 = 1;
        if(anInt1269 > 40)
            anInt1270 = -1;
        anInt1147++;
        if(anInt1147 > 500)
        {
            anInt1147 = 0;
            int j2 = (int)(Math.random() * 8D);
            if((j2 & 1) == 1)
                anInt1234 += anInt1235;
            if((j2 & 2) == 2)
                anInt881 += anInt882;
        }
        if(anInt1234 < -60)
            anInt1235 = 2;
        if(anInt1234 > 60)
            anInt1235 = -2;
        if(anInt881 < -20)
            anInt882 = 1;
        if(anInt881 > 10)
            anInt882 = -1;
        anInt1175++;
        if(anInt1175 > 50)
            outgoingVector.writeOpcode(30);
        try
        {
            if(socket != null && outgoingVector.currentOffset > 0)
            {
                socket.queueBytes((byte)68, 0, outgoingVector.currentOffset, outgoingVector.payload);
                outgoingVector.currentOffset = 0;
                anInt1175 = 0;
                return;
            }
        }
        catch(IOException _ex)
        {
            connectionLost(31790);
            return;
        }
        catch(Exception exception)
        {
            method70((byte)9);
        }
    }

    public int method114(boolean flag)
    {
        int i = 3;
        if(flag)
            return anInt1268;
        if(anInt1212 < 310)
        {
            int j = anInt1209 >> 7;
            int k = anInt1211 >> 7;
            int l = ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1621 >> 7;
            int i1 = ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1622 >> 7;
            if((aByteArrayArrayArray1076[myHeightLevel][j][k] & 4) != 0)
                i = myHeightLevel;
            int j1;
            if(l > j)
                j1 = l - j;
            else
                j1 = j - l;
            int k1;
            if(i1 > k)
                k1 = i1 - k;
            else
                k1 = k - i1;
            if(j1 > k1)
            {
                int l1 = (k1 * 0x10000) / j1;
                int j2 = 32768;
                while(j != l) 
                {
                    if(j < l)
                        j++;
                    else
                    if(j > l)
                        j--;
                    if((aByteArrayArrayArray1076[myHeightLevel][j][k] & 4) != 0)
                        i = myHeightLevel;
                    j2 += l1;
                    if(j2 >= 0x10000)
                    {
                        j2 -= 0x10000;
                        if(k < i1)
                            k++;
                        else
                        if(k > i1)
                            k--;
                        if((aByteArrayArrayArray1076[myHeightLevel][j][k] & 4) != 0)
                            i = myHeightLevel;
                    }
                }
            } else
            {
                int i2 = (j1 * 0x10000) / k1;
                int k2 = 32768;
                while(k != i1) 
                {
                    if(k < i1)
                        k++;
                    else
                    if(k > i1)
                        k--;
                    if((aByteArrayArrayArray1076[myHeightLevel][j][k] & 4) != 0)
                        i = myHeightLevel;
                    k2 += i2;
                    if(k2 >= 0x10000)
                    {
                        k2 -= 0x10000;
                        if(j < l)
                            j++;
                        else
                        if(j > l)
                            j--;
                        if((aByteArrayArrayArray1076[myHeightLevel][j][k] & 4) != 0)
                            i = myHeightLevel;
                    }
                }
            }
        }
        if((aByteArrayArrayArray1076[myHeightLevel][((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1621 >> 7][((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1622 >> 7] & 4) != 0)
            i = myHeightLevel;
        return i;
    }

    public int method115(boolean flag)
    {
        int i = method21(anInt1209, anInt1211, myHeightLevel, 43591);
        aBoolean952 &= flag;
        if(i - anInt1210 < 800 && (aByteArrayArrayArray1076[myHeightLevel][anInt1209 >> 7][anInt1211 >> 7] & 4) != 0)
            return myHeightLevel;
        else
            return 3;
    }

    public void method116(Class39_Sub1 class39_sub1, int i)
    {
        int j = 0;
        int k = -1;
        int l = 0;
        int i1 = 0;
        if(class39_sub1.anInt1385 == 0)
            j = aClass31_868.method317(class39_sub1.anInt1384, class39_sub1.anInt1386, class39_sub1.anInt1387);
        if(class39_sub1.anInt1385 == 1)
            j = aClass31_868.method318((byte)-87, class39_sub1.anInt1384, class39_sub1.anInt1386, class39_sub1.anInt1387);
        if(class39_sub1.anInt1385 == 2)
            j = aClass31_868.method319(class39_sub1.anInt1384, class39_sub1.anInt1386, class39_sub1.anInt1387);
        if(class39_sub1.anInt1385 == 3)
            j = aClass31_868.method320(class39_sub1.anInt1384, class39_sub1.anInt1386, class39_sub1.anInt1387);
        if(j != 0)
        {
            int j1 = aClass31_868.method321(class39_sub1.anInt1384, class39_sub1.anInt1386, class39_sub1.anInt1387, j);
            k = j >> 14 & 0x7fff;
            l = j1 & 0x1f;
            i1 = j1 >> 6;
        }
        class39_sub1.anInt1381 = k;
        class39_sub1.anInt1383 = l;
        if(i != 0)
            currentOpcode = -1;
        class39_sub1.anInt1382 = i1;
    }

    public void method117(byte byte0)
    {
        char c = '\u0100';
        if(byte0 != aByte1165)
            currentOpcode = -1;
        for(int i = 10; i < 117; i++)
        {
            int j = (int)(Math.random() * 100D);
            if(j < 50)
                anIntArray1027[i + (c - 2 << 7)] = 255;
        }

        for(int k = 0; k < 100; k++)
        {
            int l = (int)(Math.random() * 124D) + 2;
            int j1 = (int)(Math.random() * 128D) + 128;
            int j2 = l + (j1 << 7);
            anIntArray1027[j2] = 192;
        }

        for(int i1 = 1; i1 < c - 1; i1++)
        {
            for(int k1 = 1; k1 < 127; k1++)
            {
                int k2 = k1 + (i1 << 7);
                anIntArray1028[k2] = (anIntArray1027[k2 - 1] + anIntArray1027[k2 + 1] + anIntArray1027[k2 - 128] + anIntArray1027[k2 + 128]) / 4;
            }

        }

        anInt949 += 128;
        if(anInt949 > anIntArray910.length)
        {
            anInt949 -= anIntArray910.length;
            int l1 = (int)(Math.random() * 12D);
            method36(6718, aClass39_Sub3_Sub4_Sub3Array1260[l1]);
        }
        for(int i2 = 1; i2 < c - 1; i2++)
        {
            for(int l2 = 1; l2 < 127; l2++)
            {
                int j3 = l2 + (i2 << 7);
                int l3 = anIntArray1028[j3 + 128] - anIntArray910[j3 + anInt949 & anIntArray910.length - 1] / 5;
                if(l3 < 0)
                    l3 = 0;
                anIntArray1027[j3] = l3;
            }

        }

        for(int i3 = 0; i3 < c - 1; i3++)
            anIntArray1206[i3] = anIntArray1206[i3 + 1];

        anIntArray1206[c - 1] = (int)(Math.sin((double)loopCycle / 14D) * 16D + Math.sin((double)loopCycle / 15D) * 14D + Math.sin((double)loopCycle / 16D) * 12D);
        if(anInt1107 > 0)
            anInt1107 -= 4;
        if(anInt1108 > 0)
            anInt1108 -= 4;
        if(anInt1107 == 0 && anInt1108 == 0)
        {
            int k3 = (int)(Math.random() * 2000D);
            if(k3 == 0)
                anInt1107 = 1024;
            if(k3 == 1)
                anInt1108 = 1024;
        }
    }

    public static String method118(int i, int j, int k)
    {
        if(i != 32572)
            throw new NullPointerException();
        int l = j - k;
        if(l < -9)
            return "@red@";
        if(l < -6)
            return "@or3@";
        if(l < -3)
            return "@or2@";
        if(l < 0)
            return "@or1@";
        if(l > 9)
            return "@gre@";
        if(l > 6)
            return "@gr3@";
        if(l > 3)
            return "@gr2@";
        if(l > 0)
            return "@gr1@";
        else
            return "@yel@";
    }

    private void loadRSAKeys() {
        try {
            // final ObjectInputStream oin = new ObjectInputStream(new FileInputStream("./data/public.key"));
            InputStream is = getClass().getResourceAsStream("/data/public.key");
            if (is == null) {
                is = new FileInputStream("./data/public.key");
            }
            final ObjectInputStream oin = new ObjectInputStream(is);
            rsaModulus = (BigInteger) oin.readObject();
            rsaKey = (BigInteger) oin.readObject();
        } catch (final Exception ex) {
            System.err.println("Cannot find public RSA key file! Shutting down...");
            System.exit(1);
        }
    }

    public void login(String username, String password, boolean reconnecting) {
    	Signlink.errorname = username;
        try {
            if(!reconnecting) {
                loginScreenTextLine1 = "";
                loginScreenTextLine2 = "Connecting to server...";
                method67((byte)6, true);
            }
            socket = new RSSocket(this, -499, getSocket(43594 + portOffset));
            long nameLong = Class37.stringToLong(username);
            int namePart = (int)(nameLong >> 16 & 31L);
            outgoingVector.currentOffset = 0;
            outgoingVector.putByte(14);
            outgoingVector.putByte(namePart);
            socket.queueBytes((byte)68, 0, 2, outgoingVector.payload);
            for(int j = 0; j < 8; j++) {
            	socket.readByte();
            }
            int loginResponse = socket.readByte();
            int i1 = loginResponse;
            if(loginResponse == 0) {
                socket.fillBuffer(incommingVector.payload, 0, 8);
                incommingVector.currentOffset = 0;
                serverKey = incommingVector.getLong();
                int isaacSeed[] = new int[4];
                isaacSeed[0] = (int)(Math.random() * 99999999D);
                isaacSeed[1] = (int)(Math.random() * 99999999D);
                isaacSeed[2] = (int)(serverKey >> 32);
                isaacSeed[3] = (int)serverKey;
                outgoingVector.currentOffset = 0;
                outgoingVector.putByte(10);
                outgoingVector.putInt(isaacSeed[0]);
                outgoingVector.putInt(isaacSeed[1]);
                outgoingVector.putInt(isaacSeed[2]);
                outgoingVector.putInt(isaacSeed[3]);
                outgoingVector.putInt(Signlink.uid);
                outgoingVector.putString(username);
                outgoingVector.putString(password);
                outgoingVector.encrypt(rsaKey, rsaModulus);
                loginBlock.currentOffset = 0;
                loginBlock.putByte(reconnecting ? 18 : 16);
                loginBlock.putByte(outgoingVector.currentOffset + 36 + 1 + 1 + 2);
                loginBlock.putByte(255);
                loginBlock.putShort(Constants.BUILD_NUMBER);
                loginBlock.putByte(highMemory ? 1 : 0);
                for(int index = 0; index < 9; index++) {
                	loginBlock.putInt(archiveChecksums[index]);
                }
                loginBlock.putBytes(outgoingVector.payload, outgoingVector.currentOffset, 0);
                outgoingVector.encrypter = new ISAACCipher(isaacSeed, 0);
                for(int j2 = 0; j2 < 4; j2++) {
                	isaacSeed[j2] += 50;
                }
                decrypter = new ISAACCipher(isaacSeed, 0);
                socket.queueBytes((byte)68, 0, loginBlock.currentOffset, loginBlock.payload);
                loginResponse = socket.readByte();
            }
            if(loginResponse == 1) {
                try {
                    Thread.sleep(2000L);
                } catch(Exception _ex) { }
                login(username, password, reconnecting);
                return;
            } else if(loginResponse == 2) {
                anInt1155 = socket.readByte();
                aBoolean1230 = socket.readByte() == 1;
                aLong1185 = 0L;
                anInt856 = 0;
                aClass8_1151.anInt157 = 0;
                super.aBoolean20 = true;
                aBoolean1287 = true;
                aBoolean952 = true;
                outgoingVector.currentOffset = 0;
                incommingVector.currentOffset = 0;
                currentOpcode = -1;
                anInt969 = -1;
                anInt970 = -1;
                anInt971 = -1;
                opcodeSize = 0;
                anInt1174 = 0;
                anInt1237 = 0;
                anInt1176 = 0;
                anInt1149 = 0;
                anInt903 = 0;
                aBoolean1293 = false;
                super.anInt21 = 0;
                for(int j1 = 0; j1 < 100; j1++) {
                	aStringArray1194[j1] = null;
                }
                anInt905 = 0;
                anInt1323 = 0;
                anInt1203 = 0;
                anInt979 = 0;
                anInt1048 = (int)(Math.random() * 100D) - 50;
                anInt1093 = (int)(Math.random() * 110D) - 55;
                anInt1269 = (int)(Math.random() * 80D) - 40;
                anInt1234 = (int)(Math.random() * 120D) - 60;
                anInt881 = (int)(Math.random() * 30D) - 20;
                anInt928 = (int)(Math.random() * 20D) - 10 & 0x7ff;
                anInt923 = 0;
                anInt1306 = -1;
                anInt1218 = 0;
                anInt1219 = 0;
                playerCount = 0;
                anInt900 = 0;
                for(int i2 = 0; i2 < anInt871; i2++) {
                    players[i2] = null;
                    aClass39_Sub3_Sub3Array878[i2] = null;
                }
                for(int k2 = 0; k2 < 16384; k2++) {
                	aClass39_Sub3_Sub2_Sub5_Sub2Array899[k2] = null;
                }
                myPlayer = players[myPlayerIndex] = new Player();
                aClass5_1311.method189();
                aClass5_1305.method189();
                for(int l2 = 0; l2 < 4; l2++) {
                    for(int i3 = 0; i3 < 104; i3++)
                    {
                        for(int k3 = 0; k3 < 104; k3++)
                            aClass5ArrayArrayArray950[l2][i3][k3] = null;

                    }

                }
                aClass5_994 = new Class5(-7255);
                anInt1191 = 0;
                anInt1190 = 0;
                method15((byte)6, anInt1106);
                anInt1106 = -1;
                method15((byte)6, anInt1208);
                anInt1208 = -1;
                method15((byte)6, anInt1113);
                anInt1113 = -1;
                method15((byte)6, anInt1161);
                anInt1161 = -1;
                method15((byte)6, anInt846);
                anInt846 = -1;
                method15((byte)6, anInt951);
                anInt951 = -1;
                method15((byte)6, anInt1129);
                anInt1129 = -1;
                aBoolean896 = false;
                tabId = 3;
                anInt1169 = 0;
                aBoolean1293 = false;
                aBoolean1001 = false;
                aString1131 = null;
                anInt1336 = 0;
                anInt1019 = -1;
                aBoolean1286 = true;
                method76(268);
                for(int j3 = 0; j3 < 5; j3++) {
                	anIntArray852[j3] = 0;
                }
                for(int l3 = 0; l3 < 5; l3++) {
                    aStringArray980[l3] = null;
                    aBooleanArray981[l3] = false;
                }
                anInt1171 = 0;
                anInt1002 = 0;
                anInt1335 = 0;
                anInt1164 = 0;
                anInt1290 = 0;
                anInt1328 = 0;
                anInt1276 = 0;
                anInt1236 = 0;
                anInt1221 = 0;
                anInt884 = 0;
                method89(358);
                return;
            } else if(loginResponse == 3) {
                loginScreenTextLine1 = "";
                loginScreenTextLine2 = "Invalid username or password.";
                return;
            } else if(loginResponse == 4) {
                loginScreenTextLine1 = "Your account has been disabled.";
                loginScreenTextLine2 = "Please check your message-centre for details.";
                return;
            } else if(loginResponse == 5) {
                loginScreenTextLine1 = "Your account is already logged in.";
                loginScreenTextLine2 = "Try again in 60 secs...";
                return;
            } else if(loginResponse == 6) {
                loginScreenTextLine1 = "RuneScape has been updated!";
                loginScreenTextLine2 = "Please reload this page.";
                return;
            } else if(loginResponse == 7) {
                loginScreenTextLine1 = "This world is full.";
                loginScreenTextLine2 = "Please use a different world.";
                return;
            } else if(loginResponse == 8) {
                loginScreenTextLine1 = "Unable to connect.";
                loginScreenTextLine2 = "Login server offline.";
                return;
            } else if(loginResponse == 9) {
                loginScreenTextLine1 = "Login limit exceeded.";
                loginScreenTextLine2 = "Too many connections from your address.";
                return;
            } else if(loginResponse == 10) {
                loginScreenTextLine1 = "Unable to connect.";
                loginScreenTextLine2 = "Bad session id.";
                return;
            } else if(loginResponse == 11) {
                loginScreenTextLine1 = "Login server rejected session.";
                loginScreenTextLine2 = "Please try again.";
                return;
            } else if(loginResponse == 12) {
                loginScreenTextLine1 = "You need a members account to login to this world.";
                loginScreenTextLine2 = "Please subscribe, or use a different world.";
                return;
            } else if(loginResponse == 13) {
                loginScreenTextLine1 = "Could not complete login.";
                loginScreenTextLine2 = "Please try using a different world.";
                return;
            } else if(loginResponse == 14) {
                loginScreenTextLine1 = "The server is being updated.";
                loginScreenTextLine2 = "Please wait 1 minute and try again.";
                return;
            } else if(loginResponse == 15) {
                aBoolean952 = true;
                outgoingVector.currentOffset = 0;
                incommingVector.currentOffset = 0;
                currentOpcode = -1;
                anInt969 = -1;
                anInt970 = -1;
                anInt971 = -1;
                opcodeSize = 0;
                anInt1174 = 0;
                anInt1237 = 0;
                anInt903 = 0;
                aBoolean1293 = false;
                aLong1051 = System.currentTimeMillis();
                return;
            } else if(loginResponse == 16) {
                loginScreenTextLine1 = "Login attempts exceeded.";
                loginScreenTextLine2 = "Please wait 1 minute and try again.";
                return;
            } else if(loginResponse == 17) {
                loginScreenTextLine1 = "You are standing in a members-only area.";
                loginScreenTextLine2 = "To play on this world move to a free area first";
                return;
            } else if(loginResponse == 20) {
                loginScreenTextLine1 = "Invalid loginserver requested";
                loginScreenTextLine2 = "Please try using a different world.";
                return;
            } else if(loginResponse == 21) {
                int k1 = socket.readByte();
                for(k1 += 3; k1 >= 0; k1--)
                {
                    loginScreenTextLine1 = "You have only just left another world";
                    loginScreenTextLine2 = "Your profile will be transferred in: " + k1;
                    method67((byte)6, true);
                    try
                    {
                        Thread.sleep(1200L);
                    }
                    catch(Exception _ex) { }
                }

                login(username, password, reconnecting);
                return;
            } else if(loginResponse == 22) {
                loginScreenTextLine1 = "Malformed login packet.";
                loginScreenTextLine2 = "Please try again.";
                return;
            } else if(loginResponse == -1) {
                if(i1 == 0)
                {
                    if(anInt1261 < 2)
                    {
                        try
                        {
                            Thread.sleep(2000L);
                        }
                        catch(Exception _ex) { }
                        anInt1261++;
                        login(username, password, reconnecting);
                        return;
                    } else
                    {
                        loginScreenTextLine1 = "No response from loginserver";
                        loginScreenTextLine2 = "Please wait 1 minute and try again.";
                        return;
                    }
                } else
                {
                    loginScreenTextLine1 = "No response from server";
                    loginScreenTextLine2 = "Please try using a different world.";
                    return;
                }
            } else {
                System.out.println("response:" + loginResponse);
                loginScreenTextLine1 = "Unexpected server response";
                loginScreenTextLine2 = "Please try using a different world.";
                return;
            }
        }
        catch(IOException _ex)
        {
            loginScreenTextLine1 = "";
        }
        loginScreenTextLine2 = "Error connecting to server.";
    }

    public void method8(int i)
    {
        aClass5ArrayArrayArray950 = null;
        aClass5_994 = null;
        outgoingVector = null;
        loginBlock = null;
        incommingVector = null;
        i = 89 / i;
        aClass39_Sub3_Sub4_Sub3_953 = null;
        aClass39_Sub3_Sub4_Sub3_954 = null;
        aClass39_Sub3_Sub4_Sub3_955 = null;
        aClass14_1070 = null;
        aClass14_1071 = null;
        aClass14_1067 = null;
        aClass14_1068 = null;
        aClass14_1069 = null;
        aClass14_842 = null;
        aClass14_843 = null;
        aClass14_844 = null;
        aClass14_845 = null;
        aClass14_1248 = null;
        aClass14_1249 = null;
        aClass14_1250 = null;
        aClass14_1251 = null;
        aClass14_1252 = null;
        anIntArray943 = null;
        if(aClass8_1151 != null)
            aClass8_1151.aBoolean162 = false;
        aClass8_1151 = null;
        players = null;
        playerIndices = null;
        anIntArray877 = null;
        aClass39_Sub3_Sub3Array878 = null;
        anIntArray918 = null;
        aClass39_Sub3_Sub4_Sub4_1036 = null;
        aClass39_Sub3_Sub4_Sub4_1037 = null;
        aClass39_Sub3_Sub4_Sub4_1038 = null;
        aClass39_Sub3_Sub4_Sub4_1039 = null;
        aClass39_Sub3_Sub4_Sub4_1040 = null;
        try
        {
            if(socket != null)
                socket.method538();
        }
        catch(Exception _ex) { }
        socket = null;
        anIntArrayArrayArray1179 = null;
        aByteArrayArrayArray1076 = null;
        aClass31_868 = null;
        aClass3Array964 = null;
        aClass39_Sub3_Sub3_898 = null;
        aClass5_1311 = null;
        aClass5_1305 = null;
        aClass39_Sub3_Sub4_Sub3_984 = null;
        aClass39_Sub3_Sub4_Sub3_985 = null;
        aClass39_Sub3_Sub4_Sub3_986 = null;
        anIntArrayArray942 = null;
        aClass14_1240 = null;
        aClass14_1241 = null;
        aClass14_1242 = null;
        anIntArray936 = null;
        aByteArrayArray1239 = null;
        aByteArrayArray1167 = null;
        anIntArray937 = null;
        anIntArray938 = null;
        aStringArray1216 = null;
        aLongArray1050 = null;
        anIntArray895 = null;
        aClass39_Sub3_Sub4_Sub3_1138 = null;
        aClass39_Sub3_Sub4_Sub3_1139 = null;
        aClass39_Sub3_Sub4_Sub3_1140 = null;
        aClass39_Sub3_Sub4_Sub3_1141 = null;
        aClass39_Sub3_Sub4_Sub3_1142 = null;
        aClass39_Sub3_Sub4_Sub3Array869 = null;
        aClass14_1244 = null;
        aClass14_1245 = null;
        aClass14_1246 = null;
        aClass14_1247 = null;
        aClass39_Sub3_Sub4_Sub4_1157 = null;
        aClass39_Sub3_Sub4_Sub4Array1204 = null;
        aClass39_Sub3_Sub4_Sub4Array1086 = null;
        aClass39_Sub3_Sub4_Sub4Array1130 = null;
        aClass39_Sub3_Sub4_Sub4Array946 = null;
        aClass39_Sub3_Sub4_Sub4Array912 = null;
        if(aOnDemandClient_1273 != null)
            aOnDemandClient_1273.method223();
        aOnDemandClient_1273 = null;
        anIntArray1065 = null;
        anIntArray1066 = null;
        aClass39_Sub3_Sub4_Sub4Array1312 = null;
        aClass39_Sub3_Sub4_Sub4_925 = null;
        anIntArray1120 = null;
        anIntArray1121 = null;
        anIntArray1122 = null;
        anIntArray1123 = null;
        aStringArray965 = null;
        aByteArray840 = null;
        aClass14_1072 = null;
        aClass14_1073 = null;
        aClass14_1074 = null;
        aClass14_1075 = null;
        anIntArrayArray1101 = null;
        anIntArrayArray988 = null;
        anIntArray1222 = null;
        anIntArray1223 = null;
        method136(2);
        aClass39_Sub3_Sub2_Sub5_Sub2Array899 = null;
        anIntArray901 = null;
        aClass39_Sub3_Sub4_Sub4_1220 = null;
        aClass39_Sub3_Sub4_Sub3_1277 = null;
        aClass39_Sub3_Sub4_Sub3_1278 = null;
        aClass39_Sub3_Sub4_Sub3_1279 = null;
        aClass39_Sub3_Sub4_Sub3_1280 = null;
        aClass39_Sub3_Sub4_Sub3_1281 = null;
        aClass39_Sub3_Sub4_Sub3Array1301 = null;
        aClass39_Sub3_Sub4_Sub4Array1119 = null;
        method130(false);
        Class27.method280(-29497);
        Class47.method595(-29497);
        Class4.method181(-29497);
        RSInterface.method358(-29497);
        Class45.aClass45Array754 = null;
        IDK.aClass15Array230 = null;
        Class24.aClass24Array324 = null;
        SEQ.aClass20Array271 = null;
        SpotAnim.aClass11Array188 = null;
        SpotAnim.aClass35_200 = null;
        Class42.aClass42Array710 = null;
        super.aClass14_16 = null;
        Player.aClass35_1761 = null;
        Class39_Sub3_Sub4_Sub1.method485(-29497);
        Class31.method290(-29497);
        Class39_Sub3_Sub2_Sub4.method383(-29497);
        Class33.method348(-29497);
        System.gc();
    }

    public void method120(boolean flag)
    {
        method73(anInt1229);
        if(anInt922 == 1)
            aClass39_Sub3_Sub4_Sub4Array912[anInt921 / 100].method530(anInt919 - 8 - 4, 22912, anInt920 - 8 - 4);
        if(anInt922 == 2)
            aClass39_Sub3_Sub4_Sub4Array912[4 + anInt921 / 100].method530(anInt919 - 8 - 4, 22912, anInt920 - 8 - 4);
        if(anInt1129 != -1)
        {
            method51(anInt1111, anInt1129, anInt1268);
            method101(-7410, 0, 0, RSInterface.getInterface(anInt1129), 0);
        }
        if(anInt1113 != -1)
        {
            method51(anInt1111, anInt1113, anInt1268);
            method101(-7410, 0, 0, RSInterface.getInterface(anInt1113), 0);
        }
        method22(413);
        if(flag)
            currentOpcode = incommingVector.readUByte();
        if(!aBoolean1293)
        {
            method41(false);
            method77(aByte1231);
        } else
        if(anInt1253 == 0)
            method126(true);
        if(anInt1336 == 1)
            aClass39_Sub3_Sub4_Sub4_925.method530(472, 22912, 296);
        if(aBoolean888)
        {
            char c = '\u01FB';
            int j = 20;
            int l = 0xffff00;
            if(super.anInt11 < 30 && highMemory)
                l = 0xff0000;
            if(super.anInt11 < 20 && !highMemory)
                l = 0xff0000;
            aClass39_Sub3_Sub4_Sub2_1098.method502(j, c, "Fps:" + super.anInt11, -161, l);
            j += 15;
            Runtime runtime = Runtime.getRuntime();
            int i1 = (int)((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
            l = 0xffff00;
            if(i1 > 0x2000000 && highMemory)
                l = 0xff0000;
            if(i1 > 0x4000000 && !highMemory)
                l = 0xff0000;
            aClass39_Sub3_Sub4_Sub2_1098.method502(j, c, "Mem:" + i1 + "k", -161, 0xffff00);
            j += 15;
        }
        if(anInt1237 != 0)
        {
            int i = anInt1237 / 50;
            int k = i / 60;
            i %= 60;
            if(i < 10)
            {
                aClass39_Sub3_Sub4_Sub2_1098.method507(0xffff00, (byte)118, "System update in: " + k + ":0" + i, 329, 4);
                return;
            }
            aClass39_Sub3_Sub4_Sub2_1098.method507(0xffff00, (byte)118, "System update in: " + k + ":" + i, 329, 4);
        }
    }

    public boolean method121(int i, int j)
    {
        if(i < 0)
            return false;
        int k = anIntArray1122[i];
        if(j != 33356)
            aBoolean959 = !aBoolean959;
        if(k >= 2000)
            k -= 2000;
        return k == 138;
    }

    public void method122(long l, boolean flag)
    {
        try
        {
            if(l == 0L)
                return;
            for(int i = 0; i < anInt1190; i++)
            {
                if(aLongArray1050[i] != l)
                    continue;
                anInt1190--;
                needDrawTabArea = true;
                for(int j = i; j < anInt1190; j++)
                {
                    aStringArray1216[j] = aStringArray1216[j + 1];
                    anIntArray895[j] = anIntArray895[j + 1];
                    aLongArray1050[j] = aLongArray1050[j + 1];
                }

                outgoingVector.writeOpcode(176);
                outgoingVector.putLong(l);
                break;
            }

            if(flag)
                return;
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("44197, " + l + ", " + flag + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public void parseTrackedPlayerMovement(Buffer class39_sub3_sub3, int i) {
        int j = class39_sub3_sub3.readBits(8);
        if(j < playerCount)
        {
            for(int k = j; k < playerCount; k++)
                anIntArray918[anInt917++] = playerIndices[k];

        }
        if(j > playerCount) {
            Signlink.reporterror(enteredUsername + " Too many players");
            throw new RuntimeException("eek");
        }
        playerCount = 0;
        for(int l = 0; l < j; l++)
        {
            int i1 = playerIndices[l];
            Player player = players[i1];
            int j1 = class39_sub3_sub3.readBits(1);
            if(j1 == 0)
            {
                playerIndices[playerCount++] = i1;
                player.anInt1648 = loopCycle;
            } else
            {
                int k1 = class39_sub3_sub3.readBits(2);
                if(k1 == 0)
                {
                    playerIndices[playerCount++] = i1;
                    player.anInt1648 = loopCycle;
                    anIntArray877[anInt876++] = i1;
                } else
                if(k1 == 1)
                {
                    playerIndices[playerCount++] = i1;
                    player.anInt1648 = loopCycle;
                    int l1 = class39_sub3_sub3.readBits(3);
                    player.moveInDirection(l1, false);
                    int j2 = class39_sub3_sub3.readBits(1);
                    if(j2 == 1)
                        anIntArray877[anInt876++] = i1;
                } else
                if(k1 == 2)
                {
                    playerIndices[playerCount++] = i1;
                    player.anInt1648 = loopCycle;
                    int i2 = class39_sub3_sub3.readBits(3);
                    player.moveInDirection(i2, true);
                    int k2 = class39_sub3_sub3.readBits(3);
                    player.moveInDirection(k2, true);
                    int l2 = class39_sub3_sub3.readBits(1);
                    if(l2 == 1)
                        anIntArray877[anInt876++] = i1;
                } else
                if(k1 == 3)
                    anIntArray918[anInt917++] = i1;
            }
        }

    }

    public boolean method124(int i, int j, int k, int l)
    {
        if(l != -41819)
            throw new NullPointerException();
        int i1 = j >> 14 & 0x7fff;
        int j1 = aClass31_868.method321(myHeightLevel, k, i, j);
        if(j1 == -1)
            return false;
        int k1 = j1 & 0x1f;
        int l1 = j1 >> 6 & 3;
        if(k1 == 10 || k1 == 11 || k1 == 22)
        {
            Class27 class27 = Class27.method272(i1);
            int i2;
            int j2;
            if(l1 == 0 || l1 == 2)
            {
                i2 = class27.anInt405;
                j2 = class27.anInt395;
            } else
            {
                i2 = class27.anInt395;
                j2 = class27.anInt405;
            }
            int k2 = class27.anInt399;
            if(l1 != 0)
                k2 = (k2 << l1 & 0xf) + (k2 >> 4 - l1);
            calculateWalkingRoute(584, 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], i2, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], k2, j2, 0, false, 2, k, i);
        } else
        {
            calculateWalkingRoute(584, l1, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1630[0], 0, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anIntArray1629[0], 0, 0, k1 + 1, false, 2, k, i);
        }
        anInt919 = super.anInt30;
        anInt920 = super.anInt31;
        anInt922 = 2;
        anInt921 = 0;
        return true;
    }

    public void method125(int i, int j, int k, int l, int i1, int j1)
    {
        int k1 = aClass31_868.method317(j, i, l);
        if(k1 != 0)
        {
            int l1 = aClass31_868.method321(j, i, l, k1);
            int k2 = l1 >> 6 & 3;
            int i3 = l1 & 0x1f;
            int k3 = k;
            if(k1 > 0)
                k3 = j1;
            int ai[] = aClass39_Sub3_Sub4_Sub4_1220.anIntArray1731;
            int k4 = 24624 + i * 4 + (103 - l) * 512 * 4;
            int i5 = k1 >> 14 & 0x7fff;
            Class27 class27_2 = Class27.method272(i5);
            if(class27_2.anInt394 != -1)
            {
                Class39_Sub3_Sub4_Sub3 class39_sub3_sub4_sub3_2 = aClass39_Sub3_Sub4_Sub3Array1301[class27_2.anInt394];
                if(class39_sub3_sub4_sub3_2 != null)
                {
                    int i6 = (class27_2.anInt405 * 4 - class39_sub3_sub4_sub3_2.anInt1717) / 2;
                    int j6 = (class27_2.anInt395 * 4 - class39_sub3_sub4_sub3_2.anInt1718) / 2;
                    class39_sub3_sub4_sub3_2.method523(48 + i * 4 + i6, 22912, 48 + (104 - l - class27_2.anInt395) * 4 + j6);
                }
            } else
            {
                if(i3 == 0 || i3 == 2)
                    if(k2 == 0)
                    {
                        ai[k4] = k3;
                        ai[k4 + 512] = k3;
                        ai[k4 + 1024] = k3;
                        ai[k4 + 1536] = k3;
                    } else
                    if(k2 == 1)
                    {
                        ai[k4] = k3;
                        ai[k4 + 1] = k3;
                        ai[k4 + 2] = k3;
                        ai[k4 + 3] = k3;
                    } else
                    if(k2 == 2)
                    {
                        ai[k4 + 3] = k3;
                        ai[k4 + 3 + 512] = k3;
                        ai[k4 + 3 + 1024] = k3;
                        ai[k4 + 3 + 1536] = k3;
                    } else
                    if(k2 == 3)
                    {
                        ai[k4 + 1536] = k3;
                        ai[k4 + 1536 + 1] = k3;
                        ai[k4 + 1536 + 2] = k3;
                        ai[k4 + 1536 + 3] = k3;
                    }
                if(i3 == 3)
                    if(k2 == 0)
                        ai[k4] = k3;
                    else
                    if(k2 == 1)
                        ai[k4 + 3] = k3;
                    else
                    if(k2 == 2)
                        ai[k4 + 3 + 1536] = k3;
                    else
                    if(k2 == 3)
                        ai[k4 + 1536] = k3;
                if(i3 == 2)
                    if(k2 == 3)
                    {
                        ai[k4] = k3;
                        ai[k4 + 512] = k3;
                        ai[k4 + 1024] = k3;
                        ai[k4 + 1536] = k3;
                    } else
                    if(k2 == 0)
                    {
                        ai[k4] = k3;
                        ai[k4 + 1] = k3;
                        ai[k4 + 2] = k3;
                        ai[k4 + 3] = k3;
                    } else
                    if(k2 == 1)
                    {
                        ai[k4 + 3] = k3;
                        ai[k4 + 3 + 512] = k3;
                        ai[k4 + 3 + 1024] = k3;
                        ai[k4 + 3 + 1536] = k3;
                    } else
                    if(k2 == 2)
                    {
                        ai[k4 + 1536] = k3;
                        ai[k4 + 1536 + 1] = k3;
                        ai[k4 + 1536 + 2] = k3;
                        ai[k4 + 1536 + 3] = k3;
                    }
            }
        }
        k1 = aClass31_868.method319(j, i, l);
        if(i1 <= 0)
            method6();
        if(k1 != 0)
        {
            int i2 = aClass31_868.method321(j, i, l, k1);
            int l2 = i2 >> 6 & 3;
            int j3 = i2 & 0x1f;
            int l3 = k1 >> 14 & 0x7fff;
            Class27 class27_1 = Class27.method272(l3);
            if(class27_1.anInt394 != -1)
            {
                Class39_Sub3_Sub4_Sub3 class39_sub3_sub4_sub3_1 = aClass39_Sub3_Sub4_Sub3Array1301[class27_1.anInt394];
                if(class39_sub3_sub4_sub3_1 != null)
                {
                    int j5 = (class27_1.anInt405 * 4 - class39_sub3_sub4_sub3_1.anInt1717) / 2;
                    int k5 = (class27_1.anInt395 * 4 - class39_sub3_sub4_sub3_1.anInt1718) / 2;
                    class39_sub3_sub4_sub3_1.method523(48 + i * 4 + j5, 22912, 48 + (104 - l - class27_1.anInt395) * 4 + k5);
                }
            } else
            if(j3 == 9)
            {
                int l4 = 0xeeeeee;
                if(k1 > 0)
                    l4 = 0xee0000;
                int ai1[] = aClass39_Sub3_Sub4_Sub4_1220.anIntArray1731;
                int l5 = 24624 + i * 4 + (103 - l) * 512 * 4;
                if(l2 == 0 || l2 == 2)
                {
                    ai1[l5 + 1536] = l4;
                    ai1[l5 + 1024 + 1] = l4;
                    ai1[l5 + 512 + 2] = l4;
                    ai1[l5 + 3] = l4;
                } else
                {
                    ai1[l5] = l4;
                    ai1[l5 + 512 + 1] = l4;
                    ai1[l5 + 1024 + 2] = l4;
                    ai1[l5 + 1536 + 3] = l4;
                }
            }
        }
        k1 = aClass31_868.method320(j, i, l);
        if(k1 != 0)
        {
            int j2 = k1 >> 14 & 0x7fff;
            Class27 class27 = Class27.method272(j2);
            if(class27.anInt394 != -1)
            {
                Class39_Sub3_Sub4_Sub3 class39_sub3_sub4_sub3 = aClass39_Sub3_Sub4_Sub3Array1301[class27.anInt394];
                if(class39_sub3_sub4_sub3 != null)
                {
                    int i4 = (class27.anInt405 * 4 - class39_sub3_sub4_sub3.anInt1717) / 2;
                    int j4 = (class27.anInt395 * 4 - class39_sub3_sub4_sub3.anInt1718) / 2;
                    class39_sub3_sub4_sub3.method523(48 + i * 4 + i4, 22912, 48 + (104 - l - class27.anInt395) * 4 + j4);
                }
            }
        }
    }

    public void method126(boolean flag)
    {
        int i = anInt1254;
        int j = anInt1255;
        int k = anInt1256;
        int l = anInt1257;
        int i1 = 0x5d5447;
        Class39_Sub3_Sub4.method478((byte)4, j, i, i1, l, k);
        Class39_Sub3_Sub4.method478((byte)4, j + 1, i + 1, 0, 16, k - 2);
        if(!flag)
            anInt889 = -413;
        Class39_Sub3_Sub4.method479(l - 19, j + 18, 606, i + 1, 0, k - 2);
        aClass39_Sub3_Sub4_Sub2_1099.method507(i1, (byte)118, "Choose Option", j + 14, i + 3);
        int j1 = super.anInt23;
        int k1 = super.anInt24;
        if(anInt1253 == 0)
        {
            j1 -= 4;
            k1 -= 4;
        }
        if(anInt1253 == 1)
        {
            j1 -= 553;
            k1 -= 205;
        }
        if(anInt1253 == 2)
        {
            j1 -= 17;
            k1 -= 357;
        }
        for(int l1 = 0; l1 < anInt903; l1++)
        {
            int i2 = j + 31 + (anInt903 - 1 - l1) * 15;
            int j2 = 0xffffff;
            if(j1 > i && j1 < i + k && k1 > i2 - 13 && k1 < i2 + 3)
                j2 = 0xffff00;
            aClass39_Sub3_Sub4_Sub2_1099.method511(aStringArray965[l1], i + 3, i2, true, 0, j2);
        }

    }

    public void method127(int i, byte byte0)
    {
        int ai[] = aClass39_Sub3_Sub4_Sub4_1220.anIntArray1731;
        if(byte0 == 0)
            byte0 = 0;
        else
            return;
        int j = ai.length;
        for(int k = 0; k < j; k++)
            ai[k] = 0;

        for(int l = 1; l < 103; l++)
        {
            int i1 = 24628 + (103 - l) * 512 * 4;
            for(int l1 = 1; l1 < 103; l1++)
            {
                if((aByteArrayArrayArray1076[i][l1][l] & 0x18) == 0)
                    aClass31_868.method326(ai, i1, 512, i, l1, l);
                if(i < 3 && (aByteArrayArrayArray1076[i + 1][l1][l] & 8) != 0)
                    aClass31_868.method326(ai, i1, 512, i + 1, l1, l);
                i1 += 4;
            }

        }

        anInt855++;
        if(anInt855 > 1496)
        {
            anInt855 = 0;
            outgoingVector.writeOpcode(26);
            outgoingVector.putByte(0);
            int j1 = outgoingVector.currentOffset;
            outgoingVector.putShort((int)(Math.random() * 65536D));
            outgoingVector.putByte(189);
            outgoingVector.putShort(45212);
            outgoingVector.putShort((int)(Math.random() * 65536D));
            if((int)(Math.random() * 2D) == 0)
                outgoingVector.putByte(89);
            outgoingVector.putByte(94);
            outgoingVector.putByte(10);
            outgoingVector.putShort(54243);
            outgoingVector.putByte(88);
            if((int)(Math.random() * 2D) == 0)
                outgoingVector.putByte(32);
            outgoingVector.writePacketSize(outgoingVector.currentOffset - j1);
        }
        int k1 = ((238 + (int)(Math.random() * 20D)) - 10 << 16) + ((238 + (int)(Math.random() * 20D)) - 10 << 8) + ((238 + (int)(Math.random() * 20D)) - 10);
        int i2 = (238 + (int)(Math.random() * 20D)) - 10 << 16;
        aClass39_Sub3_Sub4_Sub4_1220.method525(-5281);
        for(int j2 = 1; j2 < 103; j2++)
        {
            for(int k2 = 1; k2 < 103; k2++)
            {
                if((aByteArrayArrayArray1076[i][k2][j2] & 0x18) == 0)
                    method125(k2, i, k1, j2, anInt1085, i2);
                if(i < 3 && (aByteArrayArrayArray1076[i + 1][k2][j2] & 8) != 0)
                    method125(k2, i + 1, k1, j2, anInt1085, i2);
            }

        }

        if(aClass14_844 != null)
        {
            aClass14_844.method207(-5281);
            Class39_Sub3_Sub4_Sub1.anIntArray1680 = anIntArray1317;
        }
        anInt1064 = 0;
        for(int l2 = 0; l2 < 104; l2++)
        {
            for(int i3 = 0; i3 < 104; i3++)
            {
                int j3 = aClass31_868.method320(myHeightLevel, l2, i3);
                if(j3 != 0)
                {
                    j3 = j3 >> 14 & 0x7fff;
                    int k3 = Class27.method272(j3).anInt398;
                    if(k3 >= 0)
                    {
                        int l3 = l2;
                        int i4 = i3;
                        if(k3 != 22 && k3 != 29 && k3 != 34 && k3 != 36 && k3 != 46 && k3 != 47 && k3 != 48)
                        {
                            byte byte1 = 104;
                            byte byte2 = 104;
                            int ai1[][] = aClass3Array964[myHeightLevel].anIntArrayArray59;
                            for(int j4 = 0; j4 < 10; j4++)
                            {
                                int k4 = (int)(Math.random() * 4D);
                                if(k4 == 0 && l3 > 0 && l3 > l2 - 3 && (ai1[l3 - 1][i4] & 0x1280108) == 0)
                                    l3--;
                                if(k4 == 1 && l3 < byte1 - 1 && l3 < l2 + 3 && (ai1[l3 + 1][i4] & 0x1280180) == 0)
                                    l3++;
                                if(k4 == 2 && i4 > 0 && i4 > i3 - 3 && (ai1[l3][i4 - 1] & 0x1280102) == 0)
                                    i4--;
                                if(k4 == 3 && i4 < byte2 - 1 && i4 < i3 + 3 && (ai1[l3][i4 + 1] & 0x1280120) == 0)
                                    i4++;
                            }

                        }
                        aClass39_Sub3_Sub4_Sub4Array1312[anInt1064] = aClass39_Sub3_Sub4_Sub4Array1119[k3];
                        anIntArray1065[anInt1064] = l3;
                        anIntArray1066[anInt1064] = i4;
                        anInt1064++;
                    }
                }
            }

        }

    }

    public void method128(String s)
    {
        System.out.println(s);
        try
        {
            getAppletContext().showDocument(new URL(getCodeBase(), "loaderror_" + s + ".html"));
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        do
            try
            {
                Thread.sleep(1000L);
            }
            catch(Exception _ex) { }
        while(true);
    }

    public void method129(int i, int j, Class47 class47, int k, int l)
    {
        opcodeSize += i;
        if(anInt903 >= 400)
            return;
        if(class47.anIntArray785 != null)
            class47 = class47.method593(0);
        if(class47 == null)
            return;
        if(!class47.aBoolean786)
            return;
        String s = class47.aString821;
        if(class47.anInt805 != 0)
            s = s + method118(32572, myPlayer.anInt1768, class47.anInt805) + " (level-" + class47.anInt805 + ")";
        if(anInt905 == 1)
        {
            aStringArray965[anInt903] = "Use " + aString909 + " with @yel@" + s;
            anIntArray1122[anInt903] = 708;
            anIntArray1123[anInt903] = j;
            anIntArray1120[anInt903] = l;
            anIntArray1121[anInt903] = k;
            anInt903++;
            return;
        }
        if(anInt1323 == 1)
        {
            if((anInt1325 & 2) == 2)
            {
                aStringArray965[anInt903] = aString1326 + " @yel@" + s;
                anIntArray1122[anInt903] = 834;
                anIntArray1123[anInt903] = j;
                anIntArray1120[anInt903] = l;
                anIntArray1121[anInt903] = k;
                anInt903++;
                return;
            }
        } else
        {
            if(class47.aStringArray790 != null)
            {
                for(int i1 = 4; i1 >= 0; i1--)
                    if(class47.aStringArray790[i1] != null && !class47.aStringArray790[i1].equalsIgnoreCase("attack"))
                    {
                        aStringArray965[anInt903] = class47.aStringArray790[i1] + " @yel@" + s;
                        if(i1 == 0)
                            anIntArray1122[anInt903] = 744;
                        if(i1 == 1)
                            anIntArray1122[anInt903] = 354;
                        if(i1 == 2)
                            anIntArray1122[anInt903] = 59;
                        if(i1 == 3)
                            anIntArray1122[anInt903] = 881;
                        if(i1 == 4)
                            anIntArray1122[anInt903] = 144;
                        anIntArray1123[anInt903] = j;
                        anIntArray1120[anInt903] = l;
                        anIntArray1121[anInt903] = k;
                        anInt903++;
                    }

            }
            if(class47.aStringArray790 != null)
            {
                for(int j1 = 4; j1 >= 0; j1--)
                    if(class47.aStringArray790[j1] != null && class47.aStringArray790[j1].equalsIgnoreCase("attack"))
                    {
                        char c = '\0';
                        if(class47.anInt805 > myPlayer.anInt1768)
                            c = '\u07D0';
                        aStringArray965[anInt903] = class47.aStringArray790[j1] + " @yel@" + s;
                        if(j1 == 0)
                            anIntArray1122[anInt903] = 744 + c;
                        if(j1 == 1)
                            anIntArray1122[anInt903] = 354 + c;
                        if(j1 == 2)
                            anIntArray1122[anInt903] = 59 + c;
                        if(j1 == 3)
                            anIntArray1122[anInt903] = 881 + c;
                        if(j1 == 4)
                            anIntArray1122[anInt903] = 144 + c;
                        anIntArray1123[anInt903] = j;
                        anIntArray1120[anInt903] = l;
                        anIntArray1121[anInt903] = k;
                        anInt903++;
                    }

            }
            aStringArray965[anInt903] = "Examine @yel@" + s;
            anIntArray1122[anInt903] = 1219;
            anIntArray1123[anInt903] = j;
            anIntArray1120[anInt903] = l;
            anIntArray1121[anInt903] = k;
            anInt903++;
        }
    }

    public void method130(boolean flag)
    {
        aBoolean1015 = false;
        while(aBoolean1162) 
        {
            aBoolean1015 = false;
            try
            {
                Thread.sleep(50L);
            }
            catch(Exception _ex) { }
        }
        aClass39_Sub3_Sub4_Sub3_1145 = null;
        aClass39_Sub3_Sub4_Sub3_1146 = null;
        aClass39_Sub3_Sub4_Sub3Array1260 = null;
        anIntArray1006 = null;
        anIntArray1007 = null;
        anIntArray1008 = null;
        anIntArray1009 = null;
        anIntArray910 = null;
        anIntArray911 = null;
        anIntArray1027 = null;
        anIntArray1028 = null;
        aClass39_Sub3_Sub4_Sub4_1264 = null;
        if(flag)
            aBoolean1124 = !aBoolean1124;
        aClass39_Sub3_Sub4_Sub4_1265 = null;
    }

    public static void initializeLowMemory() {
    	Class31.aBoolean477 = true;
    	Class39_Sub3_Sub4_Sub1.aBoolean1669 = true;
    	highMemory = true;
    	Class22.aBoolean318 = true;
    	Class27.aBoolean375 = true;
    	return;
    }

    public static void main(String args[]) {
        try {
            System.out.println("RS2 user client - release #" + Constants.BUILD_NUMBER);
            if(args.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                System.out.println("Using defaults: 1 0 highmem members 32");
                // return;
                args = new String[] {
                        "1", "0", "highmem", "members", "32"
                };
            }
            nodeId = Integer.parseInt(args[0]);
            portOffset = Integer.parseInt(args[1]);
            if(args[2].equals("lowmem")) {
            	initializeLowMemory();
            } else if(args[2].equals("highmem")) {
                initializeHighMemory();
            } else {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                return;
            }
            if(args[3].equals("free")) {
            	members = false;
            } else if(args[3].equals("members")) {
                members = true;
            } else {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                return;
            }
            Signlink.storeid = Integer.parseInt(args[4]);
            Signlink.startpriv(InetAddress.getLocalHost());
            Game localclient = new Game();
            localclient.method1((byte)3, 503, 765);
            localclient.loadRSAKeys();
            return;
        } catch(Exception exception) {
            return;
        }
    }

    public String getParameter(String s)
    {
        if(Signlink.mainapp != null)
            return Signlink.mainapp.getParameter(s);
        else
            return super.getParameter(s);
    }

    public void method9(int i)
    {
        if(aBoolean848 || aBoolean1132 || aBoolean1084)
        {
            method81((byte)1);
            return;
        }
        anInt956++;
        if(i <= 0)
            aBoolean1124 = !aBoolean1124;
        if(!aBoolean952)
            method67((byte)6, false);
        else
            method50((byte)4);
        anInt933 = 0;
    }

    public void method132(int i)
    {
        anInt857 = 0;
        if(i >= 0)
            method6();
        for(int j = -1; j < playerCount + anInt900; j++)
        {
            Object obj;
            if(j == -1)
                obj = myPlayer;
            else
            if(j < playerCount)
                obj = players[playerIndices[j]];
            else
                obj = aClass39_Sub3_Sub2_Sub5_Sub2Array899[anIntArray901[j - playerCount]];
            if(obj == null || !((Class39_Sub3_Sub2_Sub5) (obj)).method415(true))
                continue;
            if(obj instanceof Class39_Sub3_Sub2_Sub5_Sub2)
            {
                Class47 class47 = ((Class39_Sub3_Sub2_Sub5_Sub2)obj).aClass47_1772;
                if(class47.anIntArray785 != null)
                    class47 = class47.method593(0);
                if(class47 == null)
                    continue;
            }
            if(j < playerCount)
            {
                int l = 30;
                Player player = (Player)obj;
                if(player.anInt1765 != -1 || player.anInt1764 != -1)
                {
                    method108(0, ((Class39_Sub3_Sub2_Sub5) (obj)), ((Class39_Sub3_Sub2_Sub5) (obj)).anInt1606 + 15);
                    if(anInt934 > -1)
                    {
                        if(player.anInt1765 != -1)
                        {
                            aClass39_Sub3_Sub4_Sub4Array1086[player.anInt1765].method530(anInt934 - 12, 22912, anInt935 - l);
                            l += 25;
                        }
                        if(player.anInt1764 != -1)
                        {
                            aClass39_Sub3_Sub4_Sub4Array1130[player.anInt1764].method530(anInt934 - 12, 22912, anInt935 - l);
                            l += 25;
                        }
                    }
                }
                if(j >= 0 && anInt1149 == 10 && anInt1017 == playerIndices[j])
                {
                    method108(0, ((Class39_Sub3_Sub2_Sub5) (obj)), ((Class39_Sub3_Sub2_Sub5) (obj)).anInt1606 + 15);
                    if(anInt934 > -1)
                        aClass39_Sub3_Sub4_Sub4Array946[1].method530(anInt934 - 12, 22912, anInt935 - l);
                }
            } else
            {
                Class47 class47_1 = ((Class39_Sub3_Sub2_Sub5_Sub2)obj).aClass47_1772;
                if(class47_1.anInt799 >= 0 && class47_1.anInt799 < aClass39_Sub3_Sub4_Sub4Array1130.length)
                {
                    method108(0, ((Class39_Sub3_Sub2_Sub5) (obj)), ((Class39_Sub3_Sub2_Sub5) (obj)).anInt1606 + 15);
                    if(anInt934 > -1)
                        aClass39_Sub3_Sub4_Sub4Array1130[class47_1.anInt799].method530(anInt934 - 12, 22912, anInt935 - 30);
                }
                if(anInt1149 == 1 && anInt883 == anIntArray901[j - playerCount] && loopCycle % 20 < 10)
                {
                    method108(0, ((Class39_Sub3_Sub2_Sub5) (obj)), ((Class39_Sub3_Sub2_Sub5) (obj)).anInt1606 + 15);
                    if(anInt934 > -1)
                        aClass39_Sub3_Sub4_Sub4Array946[0].method530(anInt934 - 12, 22912, anInt935 - 28);
                }
            }
            if(((Class39_Sub3_Sub2_Sub5) (obj)).aString1605 != null && (j >= playerCount || anInt995 == 0 || anInt995 == 3 || anInt995 == 1 && method66(true, ((Player)obj).aString1754)))
            {
                method108(0, ((Class39_Sub3_Sub2_Sub5) (obj)), ((Class39_Sub3_Sub2_Sub5) (obj)).anInt1606);
                if(anInt934 > -1 && anInt857 < anInt858)
                {
                    anIntArray862[anInt857] = aClass39_Sub3_Sub4_Sub2_1099.method506(-16, ((Class39_Sub3_Sub2_Sub5) (obj)).aString1605) / 2;
                    anIntArray861[anInt857] = aClass39_Sub3_Sub4_Sub2_1099.anInt1703;
                    anIntArray859[anInt857] = anInt934;
                    anIntArray860[anInt857] = anInt935;
                    anIntArray863[anInt857] = ((Class39_Sub3_Sub2_Sub5) (obj)).anInt1607;
                    anIntArray864[anInt857] = ((Class39_Sub3_Sub2_Sub5) (obj)).anInt1643;
                    anIntArray865[anInt857] = ((Class39_Sub3_Sub2_Sub5) (obj)).anInt1628;
                    aStringArray866[anInt857++] = ((Class39_Sub3_Sub2_Sub5) (obj)).aString1605;
                    if(anInt1196 == 0 && ((Class39_Sub3_Sub2_Sub5) (obj)).anInt1643 >= 1 && ((Class39_Sub3_Sub2_Sub5) (obj)).anInt1643 <= 3)
                    {
                        anIntArray861[anInt857] += 10;
                        anIntArray860[anInt857] += 5;
                    }
                    if(anInt1196 == 0 && ((Class39_Sub3_Sub2_Sub5) (obj)).anInt1643 == 4)
                        anIntArray862[anInt857] = 60;
                    if(anInt1196 == 0 && ((Class39_Sub3_Sub2_Sub5) (obj)).anInt1643 == 5)
                        anIntArray861[anInt857] += 5;
                }
            }
            if(((Class39_Sub3_Sub2_Sub5) (obj)).anInt1593 > loopCycle)
            {
                method108(0, ((Class39_Sub3_Sub2_Sub5) (obj)), ((Class39_Sub3_Sub2_Sub5) (obj)).anInt1606 + 15);
                if(anInt934 > -1)
                {
                    int i1 = (((Class39_Sub3_Sub2_Sub5) (obj)).anInt1594 * 30) / ((Class39_Sub3_Sub2_Sub5) (obj)).anInt1595;
                    if(i1 > 30)
                        i1 = 30;
                    Class39_Sub3_Sub4.method478((byte)4, anInt935 - 3, anInt934 - 15, 65280, 5, i1);
                    Class39_Sub3_Sub4.method478((byte)4, anInt935 - 3, (anInt934 - 15) + i1, 0xff0000, 5, 30 - i1);
                }
            }
            for(int j1 = 0; j1 < 4; j1++)
                if(((Class39_Sub3_Sub2_Sub5) (obj)).anIntArray1612[j1] > loopCycle)
                {
                    method108(0, ((Class39_Sub3_Sub2_Sub5) (obj)), ((Class39_Sub3_Sub2_Sub5) (obj)).anInt1606 / 2);
                    if(anInt934 > -1)
                    {
                        if(j1 == 1)
                            anInt935 -= 20;
                        if(j1 == 2)
                        {
                            anInt934 -= 15;
                            anInt935 -= 10;
                        }
                        if(j1 == 3)
                        {
                            anInt934 += 15;
                            anInt935 -= 10;
                        }
                        aClass39_Sub3_Sub4_Sub4Array1204[((Class39_Sub3_Sub2_Sub5) (obj)).anIntArray1611[j1]].method530(anInt934 - 12, 22912, anInt935 - 12);
                        aClass39_Sub3_Sub4_Sub2_1097.method503(anInt934, 41480, 0, String.valueOf(((Class39_Sub3_Sub2_Sub5) (obj)).anIntArray1610[j1]), anInt935 + 4);
                        aClass39_Sub3_Sub4_Sub2_1097.method503(anInt934 - 1, 41480, 0xffffff, String.valueOf(((Class39_Sub3_Sub2_Sub5) (obj)).anIntArray1610[j1]), anInt935 + 3);
                    }
                }

        }

        for(int k = 0; k < anInt857; k++)
        {
            int k1 = anIntArray859[k];
            int l1 = anIntArray860[k];
            int i2 = anIntArray862[k];
            int j2 = anIntArray861[k];
            boolean flag = true;
            while(flag) 
            {
                flag = false;
                for(int k2 = 0; k2 < k; k2++)
                    if(l1 + 2 > anIntArray860[k2] - anIntArray861[k2] && l1 - j2 < anIntArray860[k2] + 2 && k1 - i2 < anIntArray859[k2] + anIntArray862[k2] && k1 + i2 > anIntArray859[k2] - anIntArray862[k2] && anIntArray860[k2] - anIntArray861[k2] < l1)
                    {
                        l1 = anIntArray860[k2] - anIntArray861[k2];
                        flag = true;
                    }

            }
            anInt934 = anIntArray859[k];
            anInt935 = anIntArray860[k] = l1;
            String s = aStringArray866[k];
            if(anInt1196 == 0)
            {
                int l2 = 0xffff00;
                if(anIntArray863[k] < 6)
                    l2 = anIntArray1183[anIntArray863[k]];
                if(anIntArray863[k] == 6)
                    l2 = anInt1200 % 20 >= 10 ? 0xffff00 : 0xff0000;
                if(anIntArray863[k] == 7)
                    l2 = anInt1200 % 20 >= 10 ? 65535 : 255;
                if(anIntArray863[k] == 8)
                    l2 = anInt1200 % 20 >= 10 ? 0x80ff80 : 45056;
                if(anIntArray863[k] == 9)
                {
                    int i3 = 150 - anIntArray865[k];
                    if(i3 < 50)
                        l2 = 0xff0000 + 1280 * i3;
                    else
                    if(i3 < 100)
                        l2 = 0xffff00 - 0x50000 * (i3 - 50);
                    else
                    if(i3 < 150)
                        l2 = 65280 + 5 * (i3 - 100);
                }
                if(anIntArray863[k] == 10)
                {
                    int j3 = 150 - anIntArray865[k];
                    if(j3 < 50)
                        l2 = 0xff0000 + 5 * j3;
                    else
                    if(j3 < 100)
                        l2 = 0xff00ff - 0x50000 * (j3 - 50);
                    else
                    if(j3 < 150)
                        l2 = (255 + 0x50000 * (j3 - 100)) - 5 * (j3 - 100);
                }
                if(anIntArray863[k] == 11)
                {
                    int k3 = 150 - anIntArray865[k];
                    if(k3 < 50)
                        l2 = 0xffffff - 0x50005 * k3;
                    else
                    if(k3 < 100)
                        l2 = 65280 + 0x50005 * (k3 - 50);
                    else
                    if(k3 < 150)
                        l2 = 0xffffff - 0x50000 * (k3 - 100);
                }
                if(anIntArray864[k] == 0)
                {
                    aClass39_Sub3_Sub4_Sub2_1099.method503(anInt934, 41480, 0, s, anInt935 + 1);
                    aClass39_Sub3_Sub4_Sub2_1099.method503(anInt934, 41480, l2, s, anInt935);
                }
                if(anIntArray864[k] == 1)
                {
                    aClass39_Sub3_Sub4_Sub2_1099.method508(s, 0, anInt934, anInt935 + 1, (byte)1, anInt1200);
                    aClass39_Sub3_Sub4_Sub2_1099.method508(s, l2, anInt934, anInt935, (byte)1, anInt1200);
                }
                if(anIntArray864[k] == 2)
                {
                    aClass39_Sub3_Sub4_Sub2_1099.method509(anInt935 + 1, anInt934, anInt1200, anInt1187, s, 0);
                    aClass39_Sub3_Sub4_Sub2_1099.method509(anInt935, anInt934, anInt1200, anInt1187, s, l2);
                }
                if(anIntArray864[k] == 3)
                {
                    aClass39_Sub3_Sub4_Sub2_1099.method510((byte)102, 150 - anIntArray865[k], 0, anInt935 + 1, anInt934, anInt1200, s);
                    aClass39_Sub3_Sub4_Sub2_1099.method510((byte)102, 150 - anIntArray865[k], l2, anInt935, anInt934, anInt1200, s);
                }
                if(anIntArray864[k] == 4)
                {
                    int l3 = aClass39_Sub3_Sub4_Sub2_1099.method506(-16, s);
                    int j4 = ((150 - anIntArray865[k]) * (l3 + 100)) / 150;
                    Class39_Sub3_Sub4.method475(anInt934 - 50, (byte)-98, 334, anInt934 + 50, 0);
                    aClass39_Sub3_Sub4_Sub2_1099.method507(0, (byte)118, s, anInt935 + 1, (anInt934 + 50) - j4);
                    aClass39_Sub3_Sub4_Sub2_1099.method507(l2, (byte)118, s, anInt935, (anInt934 + 50) - j4);
                    Class39_Sub3_Sub4.method474((byte)0);
                }
                if(anIntArray864[k] == 5)
                {
                    int i4 = 150 - anIntArray865[k];
                    int k4 = 0;
                    if(i4 < 25)
                        k4 = i4 - 25;
                    else
                    if(i4 > 125)
                        k4 = i4 - 125;
                    Class39_Sub3_Sub4.method475(0, (byte)-98, anInt935 + 5, 512, anInt935 - aClass39_Sub3_Sub4_Sub2_1099.anInt1703 - 1);
                    aClass39_Sub3_Sub4_Sub2_1099.method503(anInt934, 41480, 0, s, anInt935 + 1 + k4);
                    aClass39_Sub3_Sub4_Sub2_1099.method503(anInt934, 41480, l2, s, anInt935 + k4);
                    Class39_Sub3_Sub4.method474((byte)0);
                }
            } else
            {
                aClass39_Sub3_Sub4_Sub2_1099.method503(anInt934, 41480, 0, s, anInt935 + 1);
                aClass39_Sub3_Sub4_Sub2_1099.method503(anInt934, 41480, 0xffff00, s, anInt935);
            }
        }

    }

    /**
     * @param addOn The string addon. Eg Names for dueling / trading.
     */
    public void sendMessage(byte byte0, String message, int i, String addOn)
    {
        if(i == 0 && anInt1106 != -1)
        {
            aString1131 = message;
            super.anInt29 = 0;
        }
        if(anInt1208 == -1)
            aBoolean993 = true;
        for(int j = 99; j > 0; j--)
        {
            anIntArray1192[j] = anIntArray1192[j - 1];
            aStringArray1193[j] = aStringArray1193[j - 1];
            aStringArray1194[j] = aStringArray1194[j - 1];
        }

        anIntArray1192[0] = i;
        aStringArray1193[0] = addOn;
        if(byte0 != -83)
        {
            return;
        } else
        {
            aStringArray1194[0] = message;
            return;
        }
    }

    public boolean calculateWalkingRoute(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, boolean flag, int i2, int j2, int k2)
    {
        byte byte0 = 104;
        byte byte1 = 104;
        for(int l2 = 0; l2 < byte0; l2++)
        {
            for(int i3 = 0; i3 < byte1; i3++)
            {
                anIntArrayArray1101[l2][i3] = 0;
                anIntArrayArray988[l2][i3] = 0x5f5e0ff;
            }

        }

        int j3 = i1;
        int k3 = k;
        anIntArrayArray1101[i1][k] = 99;
        anIntArrayArray988[i1][k] = 0;
        int l3 = 0;
        int i4 = 0;
        anIntArray1222[l3] = i1;
        anIntArray1223[l3++] = k;
        boolean flag1 = false;
        int j4 = anIntArray1222.length;
        if(i <= 0)
        {
            for(int l4 = 1; l4 > 0; l4++);
        }
        int ai[][] = aClass3Array964[myHeightLevel].anIntArrayArray59;
        while(i4 != l3) 
        {
            j3 = anIntArray1222[i4];
            k3 = anIntArray1223[i4];
            i4 = (i4 + 1) % j4;
            if(j3 == j2 && k3 == k2)
            {
                flag1 = true;
                break;
            }
            if(l1 != 0)
            {
                if((l1 < 5 || l1 == 10) && aClass3Array964[myHeightLevel].method166(k2, j, k3, l1 - 1, j3, anInt891, j2))
                {
                    flag1 = true;
                    break;
                }
                if(l1 < 10 && aClass3Array964[myHeightLevel].method167(k3, k2, l1 - 1, 36084, j2, j3, j))
                {
                    flag1 = true;
                    break;
                }
            }
            if(l != 0 && k1 != 0 && aClass3Array964[myHeightLevel].method168(k3, k1, j1, l, k2, 119, j3, j2))
            {
                flag1 = true;
                break;
            }
            int i5 = anIntArrayArray988[j3][k3] + 1;
            if(j3 > 0 && anIntArrayArray1101[j3 - 1][k3] == 0 && (ai[j3 - 1][k3] & 0x1280108) == 0)
            {
                anIntArray1222[l3] = j3 - 1;
                anIntArray1223[l3] = k3;
                l3 = (l3 + 1) % j4;
                anIntArrayArray1101[j3 - 1][k3] = 2;
                anIntArrayArray988[j3 - 1][k3] = i5;
            }
            if(j3 < byte0 - 1 && anIntArrayArray1101[j3 + 1][k3] == 0 && (ai[j3 + 1][k3] & 0x1280180) == 0)
            {
                anIntArray1222[l3] = j3 + 1;
                anIntArray1223[l3] = k3;
                l3 = (l3 + 1) % j4;
                anIntArrayArray1101[j3 + 1][k3] = 8;
                anIntArrayArray988[j3 + 1][k3] = i5;
            }
            if(k3 > 0 && anIntArrayArray1101[j3][k3 - 1] == 0 && (ai[j3][k3 - 1] & 0x1280102) == 0)
            {
                anIntArray1222[l3] = j3;
                anIntArray1223[l3] = k3 - 1;
                l3 = (l3 + 1) % j4;
                anIntArrayArray1101[j3][k3 - 1] = 1;
                anIntArrayArray988[j3][k3 - 1] = i5;
            }
            if(k3 < byte1 - 1 && anIntArrayArray1101[j3][k3 + 1] == 0 && (ai[j3][k3 + 1] & 0x1280120) == 0)
            {
                anIntArray1222[l3] = j3;
                anIntArray1223[l3] = k3 + 1;
                l3 = (l3 + 1) % j4;
                anIntArrayArray1101[j3][k3 + 1] = 4;
                anIntArrayArray988[j3][k3 + 1] = i5;
            }
            if(j3 > 0 && k3 > 0 && anIntArrayArray1101[j3 - 1][k3 - 1] == 0 && (ai[j3 - 1][k3 - 1] & 0x128010e) == 0 && (ai[j3 - 1][k3] & 0x1280108) == 0 && (ai[j3][k3 - 1] & 0x1280102) == 0)
            {
                anIntArray1222[l3] = j3 - 1;
                anIntArray1223[l3] = k3 - 1;
                l3 = (l3 + 1) % j4;
                anIntArrayArray1101[j3 - 1][k3 - 1] = 3;
                anIntArrayArray988[j3 - 1][k3 - 1] = i5;
            }
            if(j3 < byte0 - 1 && k3 > 0 && anIntArrayArray1101[j3 + 1][k3 - 1] == 0 && (ai[j3 + 1][k3 - 1] & 0x1280183) == 0 && (ai[j3 + 1][k3] & 0x1280180) == 0 && (ai[j3][k3 - 1] & 0x1280102) == 0)
            {
                anIntArray1222[l3] = j3 + 1;
                anIntArray1223[l3] = k3 - 1;
                l3 = (l3 + 1) % j4;
                anIntArrayArray1101[j3 + 1][k3 - 1] = 9;
                anIntArrayArray988[j3 + 1][k3 - 1] = i5;
            }
            if(j3 > 0 && k3 < byte1 - 1 && anIntArrayArray1101[j3 - 1][k3 + 1] == 0 && (ai[j3 - 1][k3 + 1] & 0x1280138) == 0 && (ai[j3 - 1][k3] & 0x1280108) == 0 && (ai[j3][k3 + 1] & 0x1280120) == 0)
            {
                anIntArray1222[l3] = j3 - 1;
                anIntArray1223[l3] = k3 + 1;
                l3 = (l3 + 1) % j4;
                anIntArrayArray1101[j3 - 1][k3 + 1] = 6;
                anIntArrayArray988[j3 - 1][k3 + 1] = i5;
            }
            if(j3 < byte0 - 1 && k3 < byte1 - 1 && anIntArrayArray1101[j3 + 1][k3 + 1] == 0 && (ai[j3 + 1][k3 + 1] & 0x12801e0) == 0 && (ai[j3 + 1][k3] & 0x1280180) == 0 && (ai[j3][k3 + 1] & 0x1280120) == 0)
            {
                anIntArray1222[l3] = j3 + 1;
                anIntArray1223[l3] = k3 + 1;
                l3 = (l3 + 1) % j4;
                anIntArrayArray1101[j3 + 1][k3 + 1] = 12;
                anIntArrayArray988[j3 + 1][k3 + 1] = i5;
            }
        }
        anInt1082 = 0;
        if(!flag1)
        {
            if(flag)
            {
                int j5 = 100;
                for(int l5 = 1; l5 < 2; l5++)
                {
                    for(int j6 = j2 - l5; j6 <= j2 + l5; j6++)
                    {
                        for(int l6 = k2 - l5; l6 <= k2 + l5; l6++)
                            if(j6 >= 0 && l6 >= 0 && j6 < 104 && l6 < 104 && anIntArrayArray988[j6][l6] < j5)
                            {
                                j5 = anIntArrayArray988[j6][l6];
                                j3 = j6;
                                k3 = l6;
                                anInt1082 = 1;
                                flag1 = true;
                            }

                    }

                    if(flag1)
                        break;
                }

            }
            if(!flag1)
                return false;
        }
        i4 = 0;
        anIntArray1222[i4] = j3;
        anIntArray1223[i4++] = k3;
        int i6;
        for(int k5 = i6 = anIntArrayArray1101[j3][k3]; j3 != i1 || k3 != k; k5 = anIntArrayArray1101[j3][k3])
        {
            if(k5 != i6)
            {
                i6 = k5;
                anIntArray1222[i4] = j3;
                anIntArray1223[i4++] = k3;
            }
            if((k5 & 2) != 0)
                j3++;
            else
            if((k5 & 8) != 0)
                j3--;
            if((k5 & 1) != 0)
                k3++;
            else
            if((k5 & 4) != 0)
                k3--;
        }

        if(i4 > 0)
        {
            int k4 = i4;
            if(k4 > 25)
                k4 = 25;
            i4--;
            int k6 = anIntArray1222[i4];
            int i7 = anIntArray1223[i4];
            if(i2 == 0)
            {
                outgoingVector.writeOpcode(66);
                outgoingVector.putByte(k4 + k4 + 3);
            }
            if(i2 == 1)
            {
                outgoingVector.writeOpcode(77);
                outgoingVector.putByte(k4 + k4 + 3 + 14);
            }
            if(i2 == 2)
            {
                outgoingVector.writeOpcode(213);
                outgoingVector.putByte(k4 + k4 + 3);
            }
            anInt1218 = anIntArray1222[0];
            anInt1219 = anIntArray1223[0];
            for(int j7 = 1; j7 < k4; j7++)
            {
                i4--;
                outgoingVector.putByte(anIntArray1222[i4] - k6);
                outgoingVector.putByteA(anIntArray1223[i4] - i7);
            }

            outgoingVector.putShortA(k6 + anInt989);
            outgoingVector.putLEShort(i7 + anInt990);
            outgoingVector.putByte(super.anIntArray33[5] != 1 ? 0 : 1); //Isrunning
            return true;
        }
        return i2 != 1;
    }

    public boolean method135(int i, RSInterface class34)
    {
        if(class34.anIntArray651 == null)
            return false;
        for(int j = 0; j < class34.anIntArray651.length; j++)
        {
            int k = method37(j, (byte)60, class34);
            int l = class34.anIntArray645[j];
            if(class34.anIntArray651[j] == 2)
            {
                if(k >= l)
                    return false;
            } else
            if(class34.anIntArray651[j] == 3)
            {
                if(k <= l)
                    return false;
            } else
            if(class34.anIntArray651[j] == 4)
            {
                if(k == l)
                    return false;
            } else
            if(k != l)
                return false;
        }

        i = 46 / i;
        return true;
    }

    public void method136(int i)
    {
        Signlink.midiplay = false;
        if(i != 2)
            anInt1266 = decrypter.getNextKey();
        Signlink.midifade = 0;
        Signlink.midi = "stop";
    }

    public void method137(int i)
    {
        if(anInt905 == 0 && anInt1323 == 0)
        {
            aStringArray965[anInt903] = "Walk here";
            anIntArray1122[anInt903] = 549;
            anIntArray1120[anInt903] = super.anInt23;
            anIntArray1121[anInt903] = super.anInt24;
            anInt903++;
        }
        int j = -1;
        while(i >= 0) 
            method6();
        for(int k = 0; k < Class39_Sub3_Sub2_Sub4.anInt1586; k++)
        {
            int l = Class39_Sub3_Sub2_Sub4.anIntArray1587[k];
            int i1 = l & 0x7f;
            int j1 = l >> 7 & 0x7f;
            int k1 = l >> 29 & 3;
            int l1 = l >> 14 & 0x7fff;
            if(l == j)
                continue;
            j = l;
            if(k1 == 2 && aClass31_868.method321(myHeightLevel, i1, j1, l) >= 0)
            {
                Class27 class27 = Class27.method272(l1);
                if(class27.anIntArray367 != null)
                    class27 = class27.method279(true);
                if(class27 == null)
                    continue;
                if(anInt905 == 1)
                {
                    aStringArray965[anInt903] = "Use " + aString909 + " with @cya@" + class27.aString392;
                    anIntArray1122[anInt903] = 695;
                    anIntArray1123[anInt903] = l;
                    anIntArray1120[anInt903] = i1;
                    anIntArray1121[anInt903] = j1;
                    anInt903++;
                } else
                if(anInt1323 == 1)
                {
                    if((anInt1325 & 4) == 4)
                    {
                        aStringArray965[anInt903] = aString1326 + " @cya@" + class27.aString392;
                        anIntArray1122[anInt903] = 183;
                        anIntArray1123[anInt903] = l;
                        anIntArray1120[anInt903] = i1;
                        anIntArray1121[anInt903] = j1;
                        anInt903++;
                    }
                } else
                {
                    if(class27.aStringArray380 != null)
                    {
                        for(int i2 = 4; i2 >= 0; i2--)
                            if(class27.aStringArray380[i2] != null)
                            {
                                aStringArray965[anInt903] = class27.aStringArray380[i2] + " @cya@" + class27.aString392;
                                if(i2 == 0)
                                    anIntArray1122[anInt903] = 652;
                                if(i2 == 1)
                                    anIntArray1122[anInt903] = 769;
                                if(i2 == 2)
                                    anIntArray1122[anInt903] = 288;
                                if(i2 == 3)
                                    anIntArray1122[anInt903] = 301;
                                if(i2 == 4)
                                    anIntArray1122[anInt903] = 1103;
                                anIntArray1123[anInt903] = l;
                                anIntArray1120[anInt903] = i1;
                                anIntArray1121[anInt903] = j1;
                                anInt903++;
                            }

                    }
                    aStringArray965[anInt903] = "Examine @cya@" + class27.aString392;
                    anIntArray1122[anInt903] = 1415;
                    anIntArray1123[anInt903] = class27.anInt365 << 14;
                    anIntArray1120[anInt903] = i1;
                    anIntArray1121[anInt903] = j1;
                    anInt903++;
                }
            }
            if(k1 == 1)
            {
                Class39_Sub3_Sub2_Sub5_Sub2 class39_sub3_sub2_sub5_sub2 = aClass39_Sub3_Sub2_Sub5_Sub2Array899[l1];
                if(class39_sub3_sub2_sub5_sub2.aClass47_1772.aByte820 == 1 && (((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1621 & 0x7f) == 64 && (((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1622 & 0x7f) == 64)
                {
                    for(int j2 = 0; j2 < anInt900; j2++)
                    {
                        Class39_Sub3_Sub2_Sub5_Sub2 class39_sub3_sub2_sub5_sub2_1 = aClass39_Sub3_Sub2_Sub5_Sub2Array899[anIntArray901[j2]];
                        if(class39_sub3_sub2_sub5_sub2_1 != null && class39_sub3_sub2_sub5_sub2_1 != class39_sub3_sub2_sub5_sub2 && class39_sub3_sub2_sub5_sub2_1.aClass47_1772.aByte820 == 1 && ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2_1)).anInt1621 == ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1621 && ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2_1)).anInt1622 == ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1622)
                            method129(0, anIntArray901[j2], class39_sub3_sub2_sub5_sub2_1.aClass47_1772, j1, i1);
                    }

                    for(int l2 = 0; l2 < playerCount; l2++)
                    {
                        Player player = players[playerIndices[l2]];
                        if(player != null && ((Class39_Sub3_Sub2_Sub5) (player)).anInt1621 == ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1621 && ((Class39_Sub3_Sub2_Sub5) (player)).anInt1622 == ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2)).anInt1622)
                            method150(i1, j1, playerIndices[l2], -810, player);
                    }

                }
                method129(0, l1, class39_sub3_sub2_sub5_sub2.aClass47_1772, j1, i1);
            }
            if(k1 == 0)
            {
                Player player = players[l1];
                if((((Class39_Sub3_Sub2_Sub5) (player)).anInt1621 & 0x7f) == 64 && (((Class39_Sub3_Sub2_Sub5) (player)).anInt1622 & 0x7f) == 64)
                {
                    for(int k2 = 0; k2 < anInt900; k2++)
                    {
                        Class39_Sub3_Sub2_Sub5_Sub2 class39_sub3_sub2_sub5_sub2_2 = aClass39_Sub3_Sub2_Sub5_Sub2Array899[anIntArray901[k2]];
                        if(class39_sub3_sub2_sub5_sub2_2 != null && class39_sub3_sub2_sub5_sub2_2.aClass47_1772.aByte820 == 1 && ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2_2)).anInt1621 == ((Class39_Sub3_Sub2_Sub5) (player)).anInt1621 && ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub2_2)).anInt1622 == ((Class39_Sub3_Sub2_Sub5) (player)).anInt1622)
                            method129(0, anIntArray901[k2], class39_sub3_sub2_sub5_sub2_2.aClass47_1772, j1, i1);
                    }

                    for(int i3 = 0; i3 < playerCount; i3++)
                    {
                        Player class39_sub3_sub2_sub5_sub1_2 = players[playerIndices[i3]];
                        if(class39_sub3_sub2_sub5_sub1_2 != null && class39_sub3_sub2_sub5_sub1_2 != player && ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub1_2)).anInt1621 == ((Class39_Sub3_Sub2_Sub5) (player)).anInt1621 && ((Class39_Sub3_Sub2_Sub5) (class39_sub3_sub2_sub5_sub1_2)).anInt1622 == ((Class39_Sub3_Sub2_Sub5) (player)).anInt1622)
                            method150(i1, j1, playerIndices[i3], -810, class39_sub3_sub2_sub5_sub1_2);
                    }

                }
                method150(i1, j1, l1, -810, player);
            }
            if(k1 == 3)
            {
                Class5 class5 = aClass5ArrayArrayArray950[myHeightLevel][i1][j1];
                if(class5 != null)
                {
                    for(Class39_Sub3_Sub2_Sub3 class39_sub3_sub2_sub3 = (Class39_Sub3_Sub2_Sub3)class5.method186(36418); class39_sub3_sub2_sub3 != null; class39_sub3_sub2_sub3 = (Class39_Sub3_Sub2_Sub3)class5.method188(0))
                    {
                        Class4 class4 = Class4.method174(class39_sub3_sub2_sub3.anInt1511);
                        if(anInt905 == 1)
                        {
                            aStringArray965[anInt903] = "Use " + aString909 + " with @lre@" + class4.aString105;
                            anIntArray1122[anInt903] = 163;
                            anIntArray1123[anInt903] = class39_sub3_sub2_sub3.anInt1511;
                            anIntArray1120[anInt903] = i1;
                            anIntArray1121[anInt903] = j1;
                            anInt903++;
                        } else
                        if(anInt1323 == 1)
                        {
                            if((anInt1325 & 1) == 1)
                            {
                                aStringArray965[anInt903] = aString1326 + " @lre@" + class4.aString105;
                                anIntArray1122[anInt903] = 550;
                                anIntArray1123[anInt903] = class39_sub3_sub2_sub3.anInt1511;
                                anIntArray1120[anInt903] = i1;
                                anIntArray1121[anInt903] = j1;
                                anInt903++;
                            }
                        } else
                        {
                            for(int j3 = 4; j3 >= 0; j3--)
                                if(class4.aStringArray83 != null && class4.aStringArray83[j3] != null)
                                {
                                    aStringArray965[anInt903] = class4.aStringArray83[j3] + " @lre@" + class4.aString105;
                                    if(j3 == 0)
                                        anIntArray1122[anInt903] = 740;
                                    if(j3 == 1)
                                        anIntArray1122[anInt903] = 126;
                                    if(j3 == 2)
                                        anIntArray1122[anInt903] = 669;
                                    if(j3 == 3)
                                        anIntArray1122[anInt903] = 922;
                                    if(j3 == 4)
                                        anIntArray1122[anInt903] = 78;
                                    anIntArray1123[anInt903] = class39_sub3_sub2_sub3.anInt1511;
                                    anIntArray1120[anInt903] = i1;
                                    anIntArray1121[anInt903] = j1;
                                    anInt903++;
                                } else
                                if(j3 == 2)
                                {
                                    aStringArray965[anInt903] = "Take @lre@" + class4.aString105;
                                    anIntArray1122[anInt903] = 669;
                                    anIntArray1123[anInt903] = class39_sub3_sub2_sub3.anInt1511;
                                    anIntArray1120[anInt903] = i1;
                                    anIntArray1121[anInt903] = j1;
                                    anInt903++;
                                }

                            aStringArray965[anInt903] = "Examine @lre@" + class4.aString105;
                            anIntArray1122[anInt903] = 1977;
                            anIntArray1123[anInt903] = class39_sub3_sub2_sub3.anInt1511;
                            anIntArray1120[anInt903] = i1;
                            anIntArray1121[anInt903] = j1;
                            anInt903++;
                        }
                    }

                }
            }
        }

    }

    public void method138(int i)
    {
        if(i != 3)
            aClass5ArrayArrayArray950 = null;
        if(anInt1332 != 0)
            return;
        int j = super.anInt29;
        if(anInt1323 == 1 && super.anInt30 >= 516 && super.anInt31 >= 160 && super.anInt30 <= 765 && super.anInt31 <= 205)
            j = 0;
        if(aBoolean1293)
        {
            if(j != 1)
            {
                int k = super.anInt23;
                int j1 = super.anInt24;
                if(anInt1253 == 0)
                {
                    k -= 4;
                    j1 -= 4;
                }
                if(anInt1253 == 1)
                {
                    k -= 553;
                    j1 -= 205;
                }
                if(anInt1253 == 2)
                {
                    k -= 17;
                    j1 -= 357;
                }
                if(k < anInt1254 - 10 || k > anInt1254 + anInt1256 + 10 || j1 < anInt1255 - 10 || j1 > anInt1255 + anInt1257 + 10)
                {
                    aBoolean1293 = false;
                    if(anInt1253 == 1)
                        needDrawTabArea = true;
                    if(anInt1253 == 2)
                        aBoolean993 = true;
                }
            }
            if(j == 1)
            {
                int l = anInt1254;
                int k1 = anInt1255;
                int i2 = anInt1256;
                int k2 = super.anInt30;
                int l2 = super.anInt31;
                if(anInt1253 == 0)
                {
                    k2 -= 4;
                    l2 -= 4;
                }
                if(anInt1253 == 1)
                {
                    k2 -= 553;
                    l2 -= 205;
                }
                if(anInt1253 == 2)
                {
                    k2 -= 17;
                    l2 -= 357;
                }
                int i3 = -1;
                for(int j3 = 0; j3 < anInt903; j3++)
                {
                    int k3 = k1 + 31 + (anInt903 - 1 - j3) * 15;
                    if(k2 > l && k2 < l + i2 && l2 > k3 - 13 && l2 < k3 + 3)
                        i3 = j3;
                }

                if(i3 != -1)
                    method112(i3, anInt885);
                aBoolean1293 = false;
                if(anInt1253 == 1)
                    needDrawTabArea = true;
                if(anInt1253 == 2)
                {
                    aBoolean993 = true;
                    return;
                }
            }
        } else
        {
            if(j == 1 && anInt903 > 0)
            {
                int i1 = anIntArray1122[anInt903 - 1];
                if(i1 == 551 || i1 == 688 || i1 == 125 || i1 == 459 || i1 == 6 || i1 == 616 || i1 == 330 || i1 == 840 || i1 == 773 || i1 == 813 || i1 == 960 || i1 == 1985)
                {
                    int l1 = anIntArray1120[anInt903 - 1];
                    int j2 = anIntArray1121[anInt903 - 1];
                    RSInterface class34 = RSInterface.getInterface(j2);
                    if(class34.aBoolean580 || class34.aBoolean623)
                    {
                        aBoolean1022 = false;
                        anInt968 = 0;
                        anInt1330 = j2;
                        anInt1331 = l1;
                        anInt1332 = 2;
                        anInt1333 = super.anInt30;
                        anInt1334 = super.anInt31;
                        if(RSInterface.getInterface(j2).parentId == anInt1113)
                            anInt1332 = 1;
                        if(RSInterface.getInterface(j2).parentId == anInt1208)
                            anInt1332 = 3;
                        return;
                    }
                }
            }
            if(j == 1 && (anInt1079 == 1 || method121(anInt903 - 1, 33356)) && anInt903 > 2)
                j = 2;
            if(j == 1 && anInt903 > 0)
                method112(anInt903 - 1, anInt885);
            if(j == 2 && anInt903 > 0)
                method18(-712);
        }
    }

    public void method139(int i, int j, int k, int l, int i1, int j1, int k1, 
            RSInterface class34)
    {
        opcodeSize += j;
        if(class34.anInt638 != 0 || class34.anIntArray650 == null || class34.aBoolean613)
            return;
        if(k1 < k || i < i1 || k1 > k + class34.anInt595 || i > i1 + class34.anInt610)
            return;
        int l1 = class34.anIntArray650.length;
        for(int i2 = 0; i2 < l1; i2++)
        {
            int j2 = class34.anIntArray582[i2] + k;
            int k2 = (class34.anIntArray647[i2] + i1) - l;
            RSInterface class34_1 = RSInterface.getInterface(class34.anIntArray650[i2]);
            j2 += class34_1.anInt631;
            k2 += class34_1.anInt586;
            if((class34_1.anInt614 >= 0 || class34_1.anInt605 != 0) && k1 >= j2 && i >= k2 && k1 < j2 + class34_1.anInt595 && i < k2 + class34_1.anInt610)
                if(class34_1.anInt614 >= 0)
                    anInt1184 = class34_1.anInt614;
                else
                    anInt1184 = class34_1.anInt620;
            if(class34_1.anInt638 == 8 && k1 >= j2 && i >= k2 && k1 < j2 + class34_1.anInt595 && i < k2 + class34_1.anInt610)
                anInt987 = class34_1.anInt620;
            if(class34_1.anInt638 == 0)
            {
                method139(i, 0, j2, class34_1.anInt609, k2, j1, k1, class34_1);
                if(class34_1.anInt607 > class34_1.anInt610)
                    method26(-333, class34_1.anInt610, k1, class34_1.anInt607, j2 + class34_1.anInt595, class34_1, i, k2, j1);
            } else
            {
                if(class34_1.anInt621 == 1 && k1 >= j2 && i >= k2 && k1 < j2 + class34_1.anInt595 && i < k2 + class34_1.anInt610)
                {
                    boolean flag = false;
                    if(class34_1.anInt632 != 0)
                        flag = method152(class34_1, true);
                    if(!flag)
                    {
                        aStringArray965[anInt903] = class34_1.aString634;
                        anIntArray1122[anInt903] = 891;
                        anIntArray1121[anInt903] = class34_1.anInt620;
                        anInt903++;
                    }
                }
                if(class34_1.anInt621 == 2 && anInt1323 == 0 && k1 >= j2 && i >= k2 && k1 < j2 + class34_1.anInt595 && i < k2 + class34_1.anInt610)
                {
                    String s = class34_1.aString611;
                    if(s.indexOf(" ") != -1)
                        s = s.substring(0, s.indexOf(" "));
                    aStringArray965[anInt903] = s + " @gre@" + class34_1.aString591;
                    anIntArray1122[anInt903] = 598;
                    anIntArray1121[anInt903] = class34_1.anInt620;
                    anInt903++;
                }
                if(class34_1.anInt621 == 3 && k1 >= j2 && i >= k2 && k1 < j2 + class34_1.anInt595 && i < k2 + class34_1.anInt610)
                {
                    aStringArray965[anInt903] = "Close";
                    if(j1 == 3)
                        anIntArray1122[anInt903] = 559;
                    else
                        anIntArray1122[anInt903] = 579;
                    anIntArray1121[anInt903] = class34_1.anInt620;
                    anInt903++;
                }
                if(class34_1.anInt621 == 4 && k1 >= j2 && i >= k2 && k1 < j2 + class34_1.anInt595 && i < k2 + class34_1.anInt610)
                {
                    aStringArray965[anInt903] = class34_1.aString634;
                    anIntArray1122[anInt903] = 682;
                    anIntArray1121[anInt903] = class34_1.anInt620;
                    anInt903++;
                }
                if(class34_1.anInt621 == 5 && k1 >= j2 && i >= k2 && k1 < j2 + class34_1.anInt595 && i < k2 + class34_1.anInt610)
                {
                    aStringArray965[anInt903] = class34_1.aString634;
                    anIntArray1122[anInt903] = 548;
                    anIntArray1121[anInt903] = class34_1.anInt620;
                    anInt903++;
                }
                if(class34_1.anInt621 == 6 && !aBoolean896 && k1 >= j2 && i >= k2 && k1 < j2 + class34_1.anInt595 && i < k2 + class34_1.anInt610)
                {
                    aStringArray965[anInt903] = class34_1.aString634;
                    anIntArray1122[anInt903] = 322;
                    anIntArray1121[anInt903] = class34_1.anInt620;
                    anInt903++;
                }
                if(class34_1.anInt638 == 2)
                {
                    int l2 = 0;
                    for(int i3 = 0; i3 < class34_1.anInt610; i3++)
                    {
                        for(int j3 = 0; j3 < class34_1.anInt595; j3++)
                        {
                            int k3 = j2 + j3 * (32 + class34_1.anInt615);
                            int l3 = k2 + i3 * (32 + class34_1.anInt627);
                            if(l2 < 20)
                            {
                                k3 += class34_1.anIntArray583[l2];
                                l3 += class34_1.anIntArray577[l2];
                            }
                            if(k1 >= k3 && i >= l3 && k1 < k3 + 32 && i < l3 + 32)
                            {
                                anInt1013 = l2;
                                anInt1014 = class34_1.anInt620;
                                if(class34_1.anIntArray612[l2] > 0)
                                {
                                    Class4 class4 = Class4.method174(class34_1.anIntArray612[l2] - 1);
                                    if(anInt905 == 1 && class34_1.aBoolean639)
                                    {
                                        if(class34_1.anInt620 != anInt907 || l2 != anInt906)
                                        {
                                            aStringArray965[anInt903] = "Use " + aString909 + " with @lre@" + class4.aString105;
                                            anIntArray1122[anInt903] = 612;
                                            anIntArray1123[anInt903] = class4.anInt89;
                                            anIntArray1120[anInt903] = l2;
                                            anIntArray1121[anInt903] = class34_1.anInt620;
                                            anInt903++;
                                        }
                                    } else
                                    if(anInt1323 == 1 && class34_1.aBoolean639)
                                    {
                                        if((anInt1325 & 0x10) == 16)
                                        {
                                            aStringArray965[anInt903] = aString1326 + " @lre@" + class4.aString105;
                                            anIntArray1122[anInt903] = 261;
                                            anIntArray1123[anInt903] = class4.anInt89;
                                            anIntArray1120[anInt903] = l2;
                                            anIntArray1121[anInt903] = class34_1.anInt620;
                                            anInt903++;
                                        }
                                    } else
                                    {
                                        if(class34_1.aBoolean639)
                                        {
                                            for(int i4 = 4; i4 >= 3; i4--)
                                                if(class4.aStringArray84 != null && class4.aStringArray84[i4] != null)
                                                {
                                                    aStringArray965[anInt903] = class4.aStringArray84[i4] + " @lre@" + class4.aString105;
                                                    if(i4 == 3)
                                                        anIntArray1122[anInt903] = 773;
                                                    if(i4 == 4)
                                                        anIntArray1122[anInt903] = 813;
                                                    anIntArray1123[anInt903] = class4.anInt89;
                                                    anIntArray1120[anInt903] = l2;
                                                    anIntArray1121[anInt903] = class34_1.anInt620;
                                                    anInt903++;
                                                } else
                                                if(i4 == 4)
                                                {
                                                    aStringArray965[anInt903] = "Drop @lre@" + class4.aString105;
                                                    anIntArray1122[anInt903] = 813;
                                                    anIntArray1123[anInt903] = class4.anInt89;
                                                    anIntArray1120[anInt903] = l2;
                                                    anIntArray1121[anInt903] = class34_1.anInt620;
                                                    anInt903++;
                                                }

                                        }
                                        if(class34_1.aBoolean581)
                                        {
                                            aStringArray965[anInt903] = "Use @lre@" + class4.aString105;
                                            anIntArray1122[anInt903] = 960;
                                            anIntArray1123[anInt903] = class4.anInt89;
                                            anIntArray1120[anInt903] = l2;
                                            anIntArray1121[anInt903] = class34_1.anInt620;
                                            anInt903++;
                                        }
                                        if(class34_1.aBoolean639 && class4.aStringArray84 != null)
                                        {
                                            for(int j4 = 2; j4 >= 0; j4--)
                                                if(class4.aStringArray84[j4] != null)
                                                {
                                                    aStringArray965[anInt903] = class4.aStringArray84[j4] + " @lre@" + class4.aString105;
                                                    if(j4 == 0)
                                                        anIntArray1122[anInt903] = 616;
                                                    if(j4 == 1)
                                                        anIntArray1122[anInt903] = 330;
                                                    if(j4 == 2)
                                                        anIntArray1122[anInt903] = 840;
                                                    anIntArray1123[anInt903] = class4.anInt89;
                                                    anIntArray1120[anInt903] = l2;
                                                    anIntArray1121[anInt903] = class34_1.anInt620;
                                                    anInt903++;
                                                }

                                        }
                                        if(class34_1.aStringArray630 != null)
                                        {
                                            for(int k4 = 4; k4 >= 0; k4--)
                                                if(class34_1.aStringArray630[k4] != null)
                                                {
                                                    aStringArray965[anInt903] = class34_1.aStringArray630[k4] + " @lre@" + class4.aString105;
                                                    if(k4 == 0)
                                                        anIntArray1122[anInt903] = 551;
                                                    if(k4 == 1)
                                                        anIntArray1122[anInt903] = 688;
                                                    if(k4 == 2)
                                                        anIntArray1122[anInt903] = 125;
                                                    if(k4 == 3)
                                                        anIntArray1122[anInt903] = 459;
                                                    if(k4 == 4)
                                                        anIntArray1122[anInt903] = 6;
                                                    anIntArray1123[anInt903] = class4.anInt89;
                                                    anIntArray1120[anInt903] = l2;
                                                    anIntArray1121[anInt903] = class34_1.anInt620;
                                                    anInt903++;
                                                }

                                        }
                                        aStringArray965[anInt903] = "Examine @lre@" + class4.aString105;
                                        anIntArray1122[anInt903] = 1985;
                                        anIntArray1123[anInt903] = class4.anInt89;
                                        anIntArray1120[anInt903] = l2;
                                        anIntArray1121[anInt903] = class34_1.anInt620;
                                        anInt903++;
                                    }
                                }
                            }
                            l2++;
                        }

                    }

                }
            }
        }

    }

    public void method140(int i, int j, int k, Class39_Sub3_Sub4_Sub4 class39_sub3_sub4_sub4)
    {
        int l = anInt928 + anInt1234 & 0x7ff;
        int i1 = k * k + j * j;
        if(i1 > 6400)
            return;
        int j1 = Class39_Sub3_Sub2_Sub4.anIntArray1588[l];
        int k1 = Class39_Sub3_Sub2_Sub4.anIntArray1589[l];
        j1 = (j1 * 256) / (anInt881 + 256);
        k1 = (k1 * 256) / (anInt881 + 256);
        if(i != 46599)
            return;
        int l1 = j * j1 + k * k1 >> 16;
        int i2 = j * k1 - k * j1 >> 16;
        if(i1 > 2500)
        {
            class39_sub3_sub4_sub4.method536(22290, aClass39_Sub3_Sub4_Sub3_954, ((94 + l1) - class39_sub3_sub4_sub4.anInt1736 / 2) + 4, 83 - i2 - class39_sub3_sub4_sub4.anInt1737 / 2 - 4);
            return;
        } else
        {
            class39_sub3_sub4_sub4.method530(((94 + l1) - class39_sub3_sub4_sub4.anInt1736 / 2) + 4, 22912, 83 - i2 - class39_sub3_sub4_sub4.anInt1737 / 2 - 4);
            return;
        }
    }

    public void method141(int i)
    {
        if(i >= 0)
            return;
        do
        {
            int j = method5(aByte1182);
            if(j == -1)
                break;
            if(anInt1113 != -1 && anInt1113 == anInt850)
            {
                if(j == 8 && aString1012.length() > 0)
                    aString1012 = aString1012.substring(0, aString1012.length() - 1);
                if((j >= 97 && j <= 122 || j >= 65 && j <= 90 || j >= 48 && j <= 57 || j == 32) && aString1012.length() < 12)
                    aString1012 += (char)j;
            } else
            if(aBoolean1001)
            {
                if(j >= 32 && j <= 122 && aString1023.length() < 80)
                {
                    aString1023 += (char)j;
                    aBoolean993 = true;
                }
                if(j == 8 && aString1023.length() > 0)
                {
                    aString1023 = aString1023.substring(0, aString1023.length() - 1);
                    aBoolean993 = true;
                }
                if(j == 13 || j == 10)
                {
                    aBoolean1001 = false;
                    aBoolean993 = true;
                    if(anInt1180 == 1)
                    {
                        long l = Class37.stringToLong(aString1023);
                        method106(842, l);
                    }
                    if(anInt1180 == 2 && anInt1190 > 0)
                    {
                        long l1 = Class37.stringToLong(aString1023);
                        method122(l1, false);
                    }
                    if(anInt1180 == 3 && aString1023.length() > 0)
                    {
                        outgoingVector.writeOpcode(56);
                        outgoingVector.putByte(0);
                        int k = outgoingVector.currentOffset;
                        outgoingVector.putLong(aLong841);
                        Class50.method602(outgoingVector, 8378, aString1023);
                        outgoingVector.writePacketSize(outgoingVector.currentOffset - k);
                        aString1023 = Class50.method603(aString1023, true);
                        aString1023 = Class44.method556(aString1023, true);
                        sendMessage((byte)-83, aString1023, 6, Class37.method372(Class37.method369(-39, aLong841), false));
                        if(anInt1103 == 2)
                        {
                            anInt1103 = 1;
                            aBoolean887 = true;
                            outgoingVector.writeOpcode(50);
                            outgoingVector.putByte(anInt995);
                            outgoingVector.putByte(anInt1103);
                            outgoingVector.putByte(anInt1195);
                        }
                    }
                    if(anInt1180 == 4 && anInt1168 < 100)
                    {
                        long l2 = Class37.stringToLong(aString1023);
                        method145(0, l2);
                    }
                    if(anInt1180 == 5 && anInt1168 > 0)
                    {
                        long l3 = Class37.stringToLong(aString1023);
                        method91(l3, anInt1153);
                    }
                }
            } else
            if(anInt1169 == 1)
            {
                if(j >= 48 && j <= 57 && aString958.length() < 10)
                {
                    aString958 += (char)j;
                    aBoolean993 = true;
                }
                if(j == 8 && aString958.length() > 0)
                {
                    aString958 = aString958.substring(0, aString958.length() - 1);
                    aBoolean993 = true;
                }
                if(j == 13 || j == 10)
                {
                    if(aString958.length() > 0)
                    {
                        int i1 = 0;
                        try
                        {
                            i1 = Integer.parseInt(aString958);
                        }
                        catch(Exception _ex) { }
                        outgoingVector.writeOpcode(175);
                        outgoingVector.putInt(i1);
                    }
                    anInt1169 = 0;
                    aBoolean993 = true;
                }
            } else
            if(anInt1169 == 2)
            {
                if(j >= 32 && j <= 122 && aString958.length() < 12)
                {
                    aString958 += (char)j;
                    aBoolean993 = true;
                }
                if(j == 8 && aString958.length() > 0)
                {
                    aString958 = aString958.substring(0, aString958.length() - 1);
                    aBoolean993 = true;
                }
                if(j == 13 || j == 10)
                {
                    if(aString958.length() > 0)
                    {
                        outgoingVector.writeOpcode(147);
                        outgoingVector.putLong(Class37.stringToLong(aString958));
                    }
                    anInt1169 = 0;
                    aBoolean993 = true;
                }
            } else
            if(anInt1169 == 3)
            {
                if(j >= 32 && j <= 122 && aString958.length() < 40)
                {
                    aString958 += (char)j;
                    aBoolean993 = true;
                }
                if(j == 8 && aString958.length() > 0)
                {
                    aString958 = aString958.substring(0, aString958.length() - 1);
                    aBoolean993 = true;
                }
            } else
            if(anInt1208 == -1 && anInt1161 == -1)
            {
                if(j >= 32 && j <= 122 && aString1125.length() < 80)
                {
                    aString1125 += (char)j;
                    aBoolean993 = true;
                }
                if(j == 8 && aString1125.length() > 0)
                {
                    aString1125 = aString1125.substring(0, aString1125.length() - 1);
                    aBoolean993 = true;
                }
                if((j == 13 || j == 10) && aString1125.length() > 0)
                {
                    if(anInt1155 == 2)
                    {
                        if(aString1125.equals("::clientdrop"))
                            connectionLost(31790);
                        if(aString1125.equals("::lag"))
                            method100(-26728);
                        if(aString1125.equals("::prefetchmusic"))
                        {
                            for(int j1 = 0; j1 < aOnDemandClient_1273.method238(2, false); j1++)
                                aOnDemandClient_1273.method235(2, (byte)1, j1, 462);

                        }
                        if(aString1125.equals("::fpson"))
                            aBoolean888 = true;
                        if(aString1125.equals("::fpsoff"))
                            aBoolean888 = false;
                        if(aString1125.equals("::noclip"))
                        {
                            for(int k1 = 0; k1 < 4; k1++)
                            {
                                for(int i2 = 1; i2 < 103; i2++)
                                {
                                    for(int k2 = 1; k2 < 103; k2++)
                                        aClass3Array964[k1].anIntArrayArray59[i2][k2] = 0;

                                }

                            }

                        }
                    }
                    if(aString1125.startsWith("::"))
                    {
                        outgoingVector.writeOpcode(225);
                        outgoingVector.putByte(aString1125.length() - 1);
                        outgoingVector.putString(aString1125.substring(2));
                    } else
                    {
                        String s = aString1125.toLowerCase();
                        int j2 = 0;
                        if(s.startsWith("yellow:"))
                        {
                            j2 = 0;
                            aString1125 = aString1125.substring(7);
                        } else
                        if(s.startsWith("red:"))
                        {
                            j2 = 1;
                            aString1125 = aString1125.substring(4);
                        } else
                        if(s.startsWith("green:"))
                        {
                            j2 = 2;
                            aString1125 = aString1125.substring(6);
                        } else
                        if(s.startsWith("cyan:"))
                        {
                            j2 = 3;
                            aString1125 = aString1125.substring(5);
                        } else
                        if(s.startsWith("purple:"))
                        {
                            j2 = 4;
                            aString1125 = aString1125.substring(7);
                        } else
                        if(s.startsWith("white:"))
                        {
                            j2 = 5;
                            aString1125 = aString1125.substring(6);
                        } else
                        if(s.startsWith("flash1:"))
                        {
                            j2 = 6;
                            aString1125 = aString1125.substring(7);
                        } else
                        if(s.startsWith("flash2:"))
                        {
                            j2 = 7;
                            aString1125 = aString1125.substring(7);
                        } else
                        if(s.startsWith("flash3:"))
                        {
                            j2 = 8;
                            aString1125 = aString1125.substring(7);
                        } else
                        if(s.startsWith("glow1:"))
                        {
                            j2 = 9;
                            aString1125 = aString1125.substring(6);
                        } else
                        if(s.startsWith("glow2:"))
                        {
                            j2 = 10;
                            aString1125 = aString1125.substring(6);
                        } else
                        if(s.startsWith("glow3:"))
                        {
                            j2 = 11;
                            aString1125 = aString1125.substring(6);
                        }
                        s = aString1125.toLowerCase();
                        int i3 = 0;
                        if(s.startsWith("wave:"))
                        {
                            i3 = 1;
                            aString1125 = aString1125.substring(5);
                        } else
                        if(s.startsWith("wave2:"))
                        {
                            i3 = 2;
                            aString1125 = aString1125.substring(6);
                        } else
                        if(s.startsWith("shake:"))
                        {
                            i3 = 3;
                            aString1125 = aString1125.substring(6);
                        } else
                        if(s.startsWith("scroll:"))
                        {
                            i3 = 4;
                            aString1125 = aString1125.substring(7);
                        } else
                        if(s.startsWith("slide:"))
                        {
                            i3 = 5;
                            aString1125 = aString1125.substring(6);
                        }
                        outgoingVector.writeOpcode(91);
                        outgoingVector.putByte(0);
                        int j3 = outgoingVector.currentOffset;
                        outgoingVector.putByteA(i3);
                        aClass39_Sub3_Sub3_898.currentOffset = 0;
                        Class50.method602(aClass39_Sub3_Sub3_898, 8378, aString1125);
                        outgoingVector.getBytesA(aClass39_Sub3_Sub3_898.payload, aClass39_Sub3_Sub3_898.currentOffset, 0);
                        outgoingVector.putByteS(j2);
                        outgoingVector.writePacketSize(outgoingVector.currentOffset - j3);
                        aString1125 = Class50.method603(aString1125, true);
                        aString1125 = Class44.method556(aString1125, true);
                        myPlayer.aString1605 = aString1125;
                        myPlayer.anInt1607 = j2;
                        myPlayer.anInt1643 = i3;
                        myPlayer.anInt1628 = 150;
                        if(anInt1155 == 2)
                            sendMessage((byte)-83, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).aString1605, 2, "@cr2@" + myPlayer.aString1754);
                        else
                        if(anInt1155 == 1)
                            sendMessage((byte)-83, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).aString1605, 2, "@cr1@" + myPlayer.aString1754);
                        else
                            sendMessage((byte)-83, ((Class39_Sub3_Sub2_Sub5) (myPlayer)).aString1605, 2, myPlayer.aString1754);
                        if(anInt995 == 2)
                        {
                            anInt995 = 3;
                            aBoolean887 = true;
                            outgoingVector.writeOpcode(50);
                            outgoingVector.putByte(anInt995);
                            outgoingVector.putByte(anInt1103);
                            outgoingVector.putByte(anInt1195);
                        }
                    }
                    aString1125 = "";
                    aBoolean993 = true;
                }
            }
        } while(true);
    }

    public void method142(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        if(j >= 0)
            return;
        int l1 = 2048 - i1 & 0x7ff;
        int i2 = 2048 - k & 0x7ff;
        int j2 = 0;
        int k2 = 0;
        int l2 = k1;
        if(l1 != 0)
        {
            int i3 = Class39_Sub3_Sub2_Sub4.anIntArray1588[l1];
            int k3 = Class39_Sub3_Sub2_Sub4.anIntArray1589[l1];
            int i4 = k2 * k3 - l2 * i3 >> 16;
            l2 = k2 * i3 + l2 * k3 >> 16;
            k2 = i4;
        }
        if(i2 != 0)
        {
            int j3 = Class39_Sub3_Sub2_Sub4.anIntArray1588[i2];
            int l3 = Class39_Sub3_Sub2_Sub4.anIntArray1589[i2];
            int j4 = l2 * j3 + j2 * l3 >> 16;
            l2 = l2 * l3 - j2 * j3 >> 16;
            j2 = j4;
        }
        anInt1209 = l - j2;
        anInt1210 = i - k2;
        anInt1211 = j1 - l2;
        anInt1212 = i1;
        anInt1213 = k;
    }

    public void method143(int i, int j)
    {
        if(j < 1 || j > 1)
            aBoolean890 = !aBoolean890;
        RSInterface class34 = RSInterface.getInterface(i);
        for(int k = 0; k < class34.anIntArray650.length; k++)
        {
            if(class34.anIntArray650[k] == -1)
                break;
            RSInterface class34_1 = RSInterface.getInterface(class34.anIntArray650[k]);
            if(class34_1.anInt638 == 1)
                method143(class34_1.anInt620, 1);
            class34_1.anInt649 = 0;
            class34_1.anInt587 = 0;
        }

    }

    @Override
    public void drawLoadingString(String s, int i, int j) {
        anInt1026 = j;
        aString1201 = s;
        method84(-453);
        if(aClass10_1077 == null)
        {
            super.drawLoadingString(s, 27936, j);
            return;
        }
        aClass14_1069.method207(-5281);
        char c = '\u0168';
        char c1 = '\310';
        byte byte0 = 20;
        aClass39_Sub3_Sub4_Sub2_1099.method503(c / 2, 41480, 0xffffff, "RuneScape is loading - please wait...", c1 / 2 - 26 - byte0);
        int k = c1 / 2 - 18 - byte0;
        Class39_Sub3_Sub4.method479(34, k, 606, c / 2 - 152, 0x8c1111, 304);
        Class39_Sub3_Sub4.method479(32, k + 1, 606, c / 2 - 151, 0, 302);
        Class39_Sub3_Sub4.method478((byte)4, k + 2, c / 2 - 150, 0x8c1111, 30, j * 3);
        if(i != 27936)
            aClass5ArrayArrayArray950 = null;
        Class39_Sub3_Sub4.method478((byte)4, k + 2, (c / 2 - 150) + j * 3, 0, 30, 300 - j * 3);
        aClass39_Sub3_Sub4_Sub2_1099.method503(c / 2, 41480, 0xffffff, s, (c1 / 2 + 5) - byte0);
        aClass14_1069.method208(super.graphics, 966, 171, 202);
        if(aBoolean1148)
        {
            aBoolean1148 = false;
            if(!aBoolean1015)
            {
                aClass14_1070.method208(super.graphics, 966, 0, 0);
                aClass14_1071.method208(super.graphics, 966, 0, 637);
            }
            aClass14_1067.method208(super.graphics, 966, 0, 128);
            aClass14_1068.method208(super.graphics, 966, 371, 202);
            aClass14_1072.method208(super.graphics, 966, 265, 0);
            aClass14_1073.method208(super.graphics, 966, 265, 562);
            aClass14_1074.method208(super.graphics, 966, 171, 128);
            aClass14_1075.method208(super.graphics, 966, 171, 562);
        }
    }

    public String method144(int i, int j)
    {
        if(j < 7 || j > 7)
        {
            for(int k = 1; k > 0; k++);
        }
        if(i < 0x3b9ac9ff)
            return String.valueOf(i);
        else
            return "*";
    }

    public void method145(int i, long l)
    {
        try
        {
            if(l == 0L)
                return;
            if(anInt1168 >= 100)
            {
                sendMessage((byte)-83, "Your ignore list is full. Max of 100 hit", 0, "");
                return;
            }
            String s = Class37.method372(Class37.method369(-39, l), false);
            for(int j = 0; j < anInt1168; j++)
                if(aLongArray879[j] == l)
                {
                    sendMessage((byte)-83, s + " is already on your ignore list", 0, "");
                    return;
                }

            for(int k = 0; k < anInt1190; k++)
                if(aLongArray1050[k] == l)
                {
                    sendMessage((byte)-83, "Please remove " + s + " from your friend list first", 0, "");
                    return;
                }

            if(i != 0)
            {
                return;
            } else
            {
                aLongArray879[anInt1168++] = l;
                needDrawTabArea = true;
                outgoingVector.writeOpcode(195);
                outgoingVector.putLong(l);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            Signlink.reporterror("4898, " + i + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void method146(boolean flag, int i)
    {
        if(((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1621 >> 7 == anInt1218 && ((Class39_Sub3_Sub2_Sub5) (myPlayer)).anInt1622 >> 7 == anInt1219)
            anInt1218 = 0;
        int j = playerCount;
        if(i != 0)
            outgoingVector.putByte(151);
        if(flag)
            j = 1;
        for(int k = 0; k < j; k++)
        {
            Player player;
            int l;
            if(flag)
            {
                player = myPlayer;
                l = myPlayerIndex << 14;
            } else
            {
                player = players[playerIndices[k]];
                l = playerIndices[k] << 14;
            }
            if(player == null || !player.method415(true))
                continue;
            player.aBoolean1757 = false;
            if((highMemory && playerCount > 50 || playerCount > 200) && !flag && ((Class39_Sub3_Sub2_Sub5) (player)).anInt1624 == ((Class39_Sub3_Sub2_Sub5) (player)).anInt1640)
                player.aBoolean1757 = true;
            int i1 = ((Class39_Sub3_Sub2_Sub5) (player)).anInt1621 >> 7;
            int j1 = ((Class39_Sub3_Sub2_Sub5) (player)).anInt1622 >> 7;
            if(i1 < 0 || i1 >= 104 || j1 < 0 || j1 >= 104)
                continue;
            if(player.aClass39_Sub3_Sub2_Sub4_1743 != null && loopCycle >= player.anInt1738 && loopCycle < player.anInt1739)
            {
                player.aBoolean1757 = false;
                player.anInt1762 = method21(((Class39_Sub3_Sub2_Sub5) (player)).anInt1621, ((Class39_Sub3_Sub2_Sub5) (player)).anInt1622, myHeightLevel, 43591);
                aClass31_868.method303(player.anInt1752, player, player.anInt1749, myHeightLevel, ((Class39_Sub3_Sub2_Sub5) (player)).anInt1622, ((Class39_Sub3_Sub2_Sub5) (player)).anInt1623, 60, l, player.anInt1751, player.anInt1750, player.anInt1762, ((Class39_Sub3_Sub2_Sub5) (player)).anInt1621, -16624);
                continue;
            }
            if((((Class39_Sub3_Sub2_Sub5) (player)).anInt1621 & 0x7f) == 64 && (((Class39_Sub3_Sub2_Sub5) (player)).anInt1622 & 0x7f) == 64)
            {
                if(anIntArrayArray942[i1][j1] == anInt1200)
                    continue;
                anIntArrayArray942[i1][j1] = anInt1200;
            }
            player.anInt1762 = method21(((Class39_Sub3_Sub2_Sub5) (player)).anInt1621, ((Class39_Sub3_Sub2_Sub5) (player)).anInt1622, myHeightLevel, 43591);
            aClass31_868.method302(((Class39_Sub3_Sub2_Sub5) (player)).anInt1622, player.anInt1762, l, ((Class39_Sub3_Sub2_Sub5) (player)).anInt1623, myHeightLevel, ((Class39_Sub3_Sub2_Sub5) (player)).aBoolean1592, ((Class39_Sub3_Sub2_Sub5) (player)).anInt1621, false, player, 60);
        }

    }

    public void method147(int i) {
        int j = 5;
        archiveChecksums[8] = 0;
        int k = 0;
        if(i != -31374)
        {
            for(int l = 1; l > 0; l++);
        }
        while(archiveChecksums[8] == 0)
        {
            String s = "Unknown problem";
            drawLoadingString("Connecting to web server", 27936, 20);
            try
            {
                DataInputStream dataInputStream = method57("crc" + (int)(Math.random() * 99999999D) + "-" + Constants.BUILD_NUMBER);
                Buffer buffer = new Buffer(new byte[40]);
                dataInputStream.readFully(buffer.payload, 0, 40);
                dataInputStream.close();
                for(int j1 = 0; j1 < 9; j1++)
                    archiveChecksums[j1] = buffer.readIntBE();

                int k1 = buffer.readIntBE();
                int l1 = 1234;
                for(int i2 = 0; i2 < 9; i2++)
                    l1 = (l1 << 1) + archiveChecksums[i2];

                if(k1 != l1)
                {
                    s = "checksum problem";
                    archiveChecksums[8] = 0;
                }
            }
            catch(EOFException _ex)
            {
                s = "EOF problem";
                archiveChecksums[8] = 0;
            }
            catch(IOException _ex)
            {
                s = "connection problem";
                archiveChecksums[8] = 0;
            }
            catch(Exception _ex)
            {
                s = "logic problem";
                archiveChecksums[8] = 0;
                if(!Signlink.reporterror)
                    return;
            }
            if(archiveChecksums[8] == 0)
            {
                k++;
                for(int i1 = j; i1 > 0; i1--)
                {
                    if(k >= 10)
                    {
                        drawLoadingString("Game updated - please reload page", 27936, 10);
                        i1 = 10;
                    } else
                    {
                        drawLoadingString(s + " - Will retry in " + i1 + " secs.", 27936, 10);
                    }
                    try
                    {
                        Thread.sleep(1000L);
                    }
                    catch(Exception _ex) { }
                }

                j *= 2;
                if(j > 60)
                    j = 60;
                aBoolean1105 = !aBoolean1105;
            }
        }
    }

    public void method148(int i, int j)
    {
        while(i >= 0) 
            outgoingVector.putByte(239);
        Signlink.wavevol = j;
    }

    public void method7(int i)
    {
        if(aBoolean848 || aBoolean1132 || aBoolean1084)
            return;
        loopCycle++;
        while(i >= 0) 
            anInt1275 = -65;
        if(!aBoolean952)
            method88(false);
        else
            method113(-43);
        method28((byte)3);
    }

    public void method149(int i)
    {
        aClass14_842.method207(-5281);
        Class39_Sub3_Sub4_Sub1.anIntArray1680 = anIntArray1316;
        if(i != 42590)
            anInt1275 = -140;
        aClass39_Sub3_Sub4_Sub3_953.method523(0, 22912, 0);
        if(anInt951 != -1)
            method101(-7410, 0, 0, RSInterface.getInterface(anInt951), 0);
        else
        if(tabInterfaceIds[tabId] != -1)
            method101(-7410, 0, 0, RSInterface.getInterface(tabInterfaceIds[tabId]), 0);
        if(aBoolean1293 && anInt1253 == 1)
            method126(true);
        aClass14_842.method208(super.graphics, 966, 205, 553);
        aClass14_844.method207(-5281);
        Class39_Sub3_Sub4_Sub1.anIntArray1680 = anIntArray1317;
    }

    public void method150(int i, int j, int k, int l, Player player)
    {
        if(player == myPlayer)
            return;
        if(anInt903 >= 400)
            return;
        while(l >= 0) 
            anInt889 = 79;
        String s;
        if(player.anInt1759 == 0)
            s = player.aString1754 + method118(32572, myPlayer.anInt1768, player.anInt1768) + " (level-" + player.anInt1768 + ")";
        else
            s = player.aString1754 + " (skill-" + player.anInt1759 + ")";
        if(anInt905 == 1)
        {
            aStringArray965[anInt903] = "Use " + aString909 + " with @whi@" + s;
            anIntArray1122[anInt903] = 405;
            anIntArray1123[anInt903] = k;
            anIntArray1120[anInt903] = i;
            anIntArray1121[anInt903] = j;
            anInt903++;
        } else
        if(anInt1323 == 1)
        {
            if((anInt1325 & 8) == 8)
            {
                aStringArray965[anInt903] = aString1326 + " @whi@" + s;
                anIntArray1122[anInt903] = 822;
                anIntArray1123[anInt903] = k;
                anIntArray1120[anInt903] = i;
                anIntArray1121[anInt903] = j;
                anInt903++;
            }
        } else
        {
            for(int i1 = 4; i1 >= 0; i1--)
                if(aStringArray980[i1] != null)
                {
                    aStringArray965[anInt903] = aStringArray980[i1] + " @whi@" + s;
                    char c = '\0';
                    if(aStringArray980[i1].equalsIgnoreCase("attack"))
                    {
                        if(player.anInt1768 > myPlayer.anInt1768)
                            c = '\u07D0';
                        if(myPlayer.anInt1753 != 0 && player.anInt1753 != 0)
                            if(myPlayer.anInt1753 == player.anInt1753)
                                c = '\u07D0';
                            else
                                c = '\0';
                    } else
                    if(aBooleanArray981[i1])
                        c = '\u07D0';
                    if(i1 == 0)
                        anIntArray1122[anInt903] = 264 + c;
                    if(i1 == 1)
                        anIntArray1122[anInt903] = 480 + c;
                    if(i1 == 2)
                        anIntArray1122[anInt903] = 651 + c;
                    if(i1 == 3)
                        anIntArray1122[anInt903] = 283 + c;
                    if(i1 == 4)
                        anIntArray1122[anInt903] = 716 + c;
                    anIntArray1123[anInt903] = k;
                    anIntArray1120[anInt903] = i;
                    anIntArray1121[anInt903] = j;
                    anInt903++;
                }

        }
        for(int j1 = 0; j1 < anInt903; j1++)
            if(anIntArray1122[j1] == 549)
            {
                aStringArray965[j1] = "Walk here @whi@" + s;
                return;
            }

    }

    public Class10 method151(int i, String s, int j, String s1, byte byte0, int k)
    {
        if(byte0 != -83)
            currentOpcode = -1;
        byte abyte0[] = null;
        int l = 5;
        try
        {
            if(aClass13Array1062[0] != null)
                abyte0 = aClass13Array1062[0].method203(5, i);
        }
        catch(Exception _ex) { }
        if(abyte0 != null)
        {
            crc32.reset();
        	crc32.update(abyte0);
        	int i1 = (int) crc32.getValue();
        	if(i1 != k)
        	   abyte0 = null;
        }
        if(abyte0 != null)
        {
            Class10 class10 = new Class10((byte)6, abyte0);
            return class10;
        }
        int j1 = 0;
        while(abyte0 == null) 
        {
            String s2 = "Unknown error";
            drawLoadingString("Requesting " + s, 27936, j);
            Object obj = null;
            try
            {
                int k1 = 0;
                DataInputStream datainputstream = method57(s1 + k);
                byte abyte1[] = new byte[6];
                datainputstream.readFully(abyte1, 0, 6);
                Buffer class39_sub3_sub3 = new Buffer(abyte1);
                class39_sub3_sub3.currentOffset = 3;
                int i2 = class39_sub3_sub3.getTribyte() + 6;
                int j2 = 6;
                abyte0 = new byte[i2];
                for(int k2 = 0; k2 < 6; k2++)
                    abyte0[k2] = abyte1[k2];

                while(j2 < i2) 
                {
                    int l2 = i2 - j2;
                    if(l2 > 1000)
                        l2 = 1000;
                    int j3 = datainputstream.read(abyte0, j2, l2);
                    if(j3 < 0)
                    {
                        s2 = "Length error: " + j2 + "/" + i2;
                        throw new IOException("EOF");
                    }
                    j2 += j3;
                    int k3 = (j2 * 100) / i2;
                    if(k3 != k1)
                        drawLoadingString("Loading " + s + " - " + k3 + "%", 27936, j);
                    k1 = k3;
                }
                datainputstream.close();
                try
                {
                    if(aClass13Array1062[0] != null)
                        aClass13Array1062[0].method204(false, abyte0.length, i, abyte0);
                }
                catch(Exception _ex)
                {
                    aClass13Array1062[0] = null;
                }
                if(abyte0 != null)
                {
                    crc32.reset();
                	crc32.update(abyte0);
                	int i3 = (int) crc32.getValue();
                	if(i3 != k)
                    {
                	  abyte0 = null;
                	  j1++;
                	  s2 = "Checksum error: " + i3;
                	}
                }
            } catch(IOException ioexception) {
                if(s2.equals("Unknown error"))
                    s2 = "Connection error";
                abyte0 = null;
            } catch(NullPointerException _ex) {
                s2 = "Null error";
                abyte0 = null;
                if(!Signlink.reporterror)
                    return null;
            } catch(ArrayIndexOutOfBoundsException _ex) {
                s2 = "Bounds error";
                abyte0 = null;
                if(!Signlink.reporterror)
                    return null;
            } catch(Exception _ex) {
                s2 = "Unexpected error";
                abyte0 = null;
                if(!Signlink.reporterror)
                    return null;
            }
            if(abyte0 == null) {
                for(int l1 = l; l1 > 0; l1--)
                {
                    if(j1 >= 3) {
                        drawLoadingString("Game updated - please reload page", 27936, j);
                        l1 = 10;
                    } else {
                        drawLoadingString(s2 + " - Retrying in " + l1, 27936, j);
                    }
                    try {
                        Thread.sleep(1000L);
                    } catch(Exception _ex) { }
                }

                l *= 2;
                if(l > 60)
                    l = 60;
                aBoolean1105 = !aBoolean1105;
            }
        }
        Class10 class10_1 = new Class10((byte)6, abyte0);
        return class10_1;
    }

    public boolean method152(RSInterface class34, boolean flag)
    {
        aBoolean952 &= flag;
        int i = class34.anInt632;
        if(i >= 1 && i <= 200 || i >= 701 && i <= 900)
        {
            if(i >= 801)
                i -= 701;
            else
            if(i >= 701)
                i -= 601;
            else
            if(i >= 101)
                i -= 101;
            else
                i--;
            aStringArray965[anInt903] = "Remove @whi@" + aStringArray1216[i];
            anIntArray1122[anInt903] = 154;
            anInt903++;
            aStringArray965[anInt903] = "Message @whi@" + aStringArray1216[i];
            anIntArray1122[anInt903] = 946;
            anInt903++;
            return true;
        }
        if(i >= 401 && i <= 500)
        {
            aStringArray965[anInt903] = "Remove @whi@" + class34.message;
            anIntArray1122[anInt903] = 837;
            anInt903++;
            return true;
        } else
        {
            return false;
        }
    }

    public Game()
    {
        loginBlock = Buffer.makeBuffer(7, 1);
        aByteArray840 = new byte[16384];
        anInt846 = -1;
        anIntArray847 = new int[50];
        aBoolean848 = false;
        aBoolean849 = false;
        anInt850 = -1;
        aByte851 = 5;
        anIntArray852 = new int[5];
        aBoolean853 = false;
        anIntArray854 = new int[151];
        anInt858 = 50;
        anIntArray859 = new int[anInt858];
        anIntArray860 = new int[anInt858];
        anIntArray861 = new int[anInt858];
        anIntArray862 = new int[anInt858];
        anIntArray863 = new int[anInt858];
        anIntArray864 = new int[anInt858];
        anIntArray865 = new int[anInt858];
        aStringArray866 = new String[anInt858];
        aBoolean867 = true;
        aClass39_Sub3_Sub4_Sub3Array869 = new Class39_Sub3_Sub4_Sub3[13];
        anIntArray870 = new int[2000];
        anInt871 = 2048;
        myPlayerIndex = 2047;
        players = new Player[anInt871];
        playerIndices = new int[anInt871];
        anIntArray877 = new int[anInt871];
        aClass39_Sub3_Sub3Array878 = new Buffer[anInt871];
        aLongArray879 = new long[100];
        anInt882 = 1;
        anInt885 = 19817;
        anInt886 = -124;
        aBoolean887 = false;
        anInt889 = 672;
        aBoolean890 = false;
        anInt891 = 793;
        aBoolean892 = true;
        anIntArray893 = new int[33];
        anIntArray895 = new int[200];
        aBoolean896 = false;
        aClass39_Sub3_Sub3_898 = new Buffer(new byte[5000]);
        aClass39_Sub3_Sub2_Sub5_Sub2Array899 = new Class39_Sub3_Sub2_Sub5_Sub2[16384];
        anIntArray901 = new int[16384];
        anInt902 = 229;
        aClass39_Sub3_Sub4_Sub4Array912 = new Class39_Sub3_Sub4_Sub4[8];
        anInt915 = 639;
        aBoolean916 = true;
        anIntArray918 = new int[1000];
        aByte924 = -111;
        aBoolean926 = true;
        anInt927 = 128;
        aBoolean932 = false;
        anInt934 = -1;
        anInt935 = -1;
        aBoolean940 = true;
        anIntArray941 = new int[5];
        anIntArrayArray942 = new int[104][104];
        anIntArray943 = new int[2000];
        aClass39_Sub3_Sub4_Sub4Array946 = new Class39_Sub3_Sub4_Sub4[32];
        anIntArray947 = new int[5];
        aClass5ArrayArrayArray950 = new Class5[4][104][104];
        anInt951 = -1;
        aBoolean952 = false;
        aByte957 = 7;
        aString958 = "";
        aBoolean959 = false;
        aClass3Array964 = new Class3[4];
        aStringArray965 = new String[500];
        aBoolean966 = false;
        anInt967 = 612;
        anInt974 = 0x766654;
        anInt977 = 951;
        aStringArray980 = new String[5];
        aBooleanArray981 = new boolean[5];
        aByte983 = 4;
        anIntArrayArray988 = new int[104][104];
        aBoolean993 = false;
        aClass5_994 = new Class5(-7255);
        aString996 = "";
        aStringArray998 = new String[100];
        anIntArray999 = new int[100];
        aBoolean1001 = false;
        anInt1004 = -26728;
        anInt1010 = -1;
        aString1012 = "";
        aBoolean1015 = false;
        anInt1016 = -712;
        aBooleanArray1018 = new boolean[5];
        anInt1019 = -1;
        anIntArray1021 = new int[33];
        aBoolean1022 = false;
        aString1023 = "";
        anIntArray1024 = new int[Class40.anInt691];
        aBoolean1035 = false;
        anInt1043 = -1;
        anInt1049 = 2;
        aLongArray1050 = new long[200];
        anIntArray1052 = new int[151];
        anInt1054 = 0x332d25;
        anInt1058 = 987;
        aByte1059 = 2;
        anIntArrayArrayArray1061 = new int[4][13][13];
        aClass13Array1062 = new Class13[5];
        needDrawTabArea = false;
        anIntArray1065 = new int[1000];
        anIntArray1066 = new int[1000];
        anIntArray1080 = new int[50];
        anInt1083 = 23894;
        aBoolean1084 = false;
        anInt1085 = 408;
        aClass39_Sub3_Sub4_Sub4Array1086 = new Class39_Sub3_Sub4_Sub4[32];
        anIntArray1087 = new int[5];
        loginScreenTextLine1 = "";
        loginScreenTextLine2 = "";
        anInt1094 = 2;
        anIntArray1096 = new int[Class40.anInt691];
        anIntArrayArray1101 = new int[104][104];
        aBoolean1102 = false;
        aBoolean1105 = false;
        anInt1106 = -1;
        anIntArray1110 = new int[Class40.anInt691];
        anInt1113 = -1;
        anIntArray1117 = new int[7];
        anInt1118 = 78;
        aClass39_Sub3_Sub4_Sub4Array1119 = new Class39_Sub3_Sub4_Sub4[100];
        anIntArray1120 = new int[500];
        anIntArray1121 = new int[500];
        anIntArray1122 = new int[500];
        anIntArray1123 = new int[500];
        aBoolean1124 = false;
        aString1125 = "";
        aClass39_Sub3_Sub4_Sub3Array1126 = new Class39_Sub3_Sub4_Sub3[2];
        anInt1127 = 0x23201b;
        anInt1129 = -1;
        aClass39_Sub3_Sub4_Sub4Array1130 = new Class39_Sub3_Sub4_Sub4[32];
        aBoolean1132 = false;
        aBoolean1148 = false;
        aString1152 = "";
        anInt1153 = -135;
        aBoolean1156 = false;
        incommingVector = Buffer.makeBuffer(7, 1);
        anInt1160 = -1;
        anInt1161 = -1;
        aBoolean1162 = false;
        aBoolean1163 = false;
        aByte1165 = 2;
        enteredUsername = "";
        aString1178 = "";
        aClass34_1181 = new RSInterface();
        aByte1182 = 9;
        anInt1187 = 18;
        aBoolean1188 = false;
        anInt1189 = 8;
        anIntArray1192 = new int[100];
        aStringArray1193 = new String[100];
        aStringArray1194 = new String[100];
        aByte1197 = 28;
        aBoolean1198 = false;
        anIntArray1199 = new int[50];
        aBoolean1202 = false;
        aClass39_Sub3_Sub4_Sub4Array1204 = new Class39_Sub3_Sub4_Sub4[20];
        anIntArray1206 = new int[256];
        anInt1208 = -1;
        crc32 = new CRC32();
        aStringArray1216 = new String[200];
        anIntArray1222 = new int[4000];
        anIntArray1223 = new int[4000];
        aBoolean1228 = false;
        anInt1229 = 58;
        aByte1231 = 7;
        anInt1233 = 22761;
        anInt1235 = 2;
        anInt1238 = 0x4d4233;
        aByte1243 = 87;
        anInt1266 = -43;
        anInt1268 = -1109;
        anInt1270 = 1;
        anInt1274 = 374;
        anInt1282 = -1;
        anIntArray1285 = new int[100];
        aBoolean1286 = true;
        aBoolean1287 = true;
        outgoingVector = Buffer.makeBuffer(7, 1);
        tabId = 3;
        aByte1291 = 4;
        aBoolean1293 = false;
        aByte1294 = 0;
        aBoolean1295 = false;
        aClass39_Sub3_Sub4_Sub3Array1301 = new Class39_Sub3_Sub4_Sub3[100];
        aBoolean1303 = false;
        aClass5_1305 = new Class5(-7255);
        anInt1306 = -1;
        anIntArray1308 = new int[5];
        archiveChecksums = new int[9];
        aClass5_1311 = new Class5(-7255);
        aClass39_Sub3_Sub4_Sub4Array1312 = new Class39_Sub3_Sub4_Sub4[1000];
        aBoolean1319 = false;
        aBoolean1321 = true;
        aByte1322 = 60;
    }

    public static int anInt838;
    public Buffer loginBlock;
    public byte aByteArray840[];
    public long aLong841;
    public Class14 aClass14_842;
    public Class14 aClass14_843;
    public Class14 aClass14_844;
    public Class14 aClass14_845;
    public int anInt846;
    public int anIntArray847[];
    public boolean aBoolean848;
    public boolean aBoolean849;
    public int anInt850;
    public byte aByte851;
    public int anIntArray852[];
    public boolean aBoolean853;
    public int anIntArray854[];
    public static int anInt855;
    public int anInt856;
    public int anInt857;
    public int anInt858;
    public int anIntArray859[];
    public int anIntArray860[];
    public int anIntArray861[];
    public int anIntArray862[];
    public int anIntArray863[];
    public int anIntArray864[];
    public int anIntArray865[];
    public String aStringArray866[];
    public boolean aBoolean867;
    public Class31 aClass31_868;
    public Class39_Sub3_Sub4_Sub3 aClass39_Sub3_Sub4_Sub3Array869[];
    public int anIntArray870[];
    public int anInt871;
    public int myPlayerIndex;
    public Player players[];
    public int playerCount;
    public int playerIndices[]; //Pl. of index :o
    public int anInt876;
    public int anIntArray877[];
    public Buffer aClass39_Sub3_Sub3Array878[];
    public long aLongArray879[];
    public static int anIntArray880[];
    public int anInt881;
    public int anInt882;
    public int anInt883;
    public static int anInt884;
    public int anInt885;
    public int anInt886;
    public boolean aBoolean887;
    public static boolean aBoolean888;
    public int anInt889;
    public boolean aBoolean890;
    public int anInt891;
    public boolean aBoolean892;
    public int anIntArray893[];
    public static int anInt894;
    public int anIntArray895[];
    public boolean aBoolean896;
    public int anInt897;
    public Buffer aClass39_Sub3_Sub3_898;
    public Class39_Sub3_Sub2_Sub5_Sub2 aClass39_Sub3_Sub2_Sub5_Sub2Array899[];
    public int anInt900;
    public int anIntArray901[];
    public int anInt902;
    public int anInt903;
    public int anInt904;
    public int anInt905;
    public int anInt906;
    public int anInt907;
    public int anInt908;
    public String aString909;
    public int anIntArray910[];
    public int anIntArray911[];
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4Array912[];
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4_913;
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4_914;
    public int anInt915;
    public boolean aBoolean916;
    public int anInt917;
    public int anIntArray918[];
    public int anInt919;
    public int anInt920;
    public int anInt921;
    public int anInt922;
    public int anInt923;
    public byte aByte924;
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4_925;
    public boolean aBoolean926;
    public int anInt927;
    public int anInt928;
    public int anInt929;
    public int anInt930;
    public static int anInt931;
    public boolean aBoolean932;
    public int anInt933;
    public int anInt934;
    public int anInt935;
    public int anIntArray936[];
    public int anIntArray937[];
    public int anIntArray938[];
    public int anInt939;
    public boolean aBoolean940;
    public int anIntArray941[];
    public int anIntArrayArray942[][];
    public int anIntArray943[];
    public int anInt944;
    public static boolean aBoolean945;
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4Array946[];
    public int anIntArray947[];
    public int anInt948;
    public int anInt949;
    public Class5 aClass5ArrayArrayArray950[][][];
    public int anInt951;
    public boolean aBoolean952;
    public Class39_Sub3_Sub4_Sub3 aClass39_Sub3_Sub4_Sub3_953;
    public Class39_Sub3_Sub4_Sub3 aClass39_Sub3_Sub4_Sub3_954;
    public Class39_Sub3_Sub4_Sub3 aClass39_Sub3_Sub4_Sub3_955;
    public static int anInt956;
    public byte aByte957;
    public String aString958;
    public boolean aBoolean959;
    public int anInt960;
    public int anInt961;
    public int anInt962;
    public int anInt963;
    public Class3 aClass3Array964[];
    public String aStringArray965[];
    public boolean aBoolean966;
    public int anInt967;
    public int anInt968;
    public int anInt969;
    public int anInt970;
    public int anInt971;
    public Class39_Sub3_Sub4_Sub3 aClass39_Sub3_Sub4_Sub3_972;
    public Class39_Sub3_Sub4_Sub3 aClass39_Sub3_Sub4_Sub3_973;
    public int anInt974;
    public static Player myPlayer;
    public long aLong976;
    public int anInt977;
    public int anInt978;
    public int anInt979;
    public String aStringArray980[];
    public boolean aBooleanArray981[];
    public int anInt982;
    public byte aByte983;
    public Class39_Sub3_Sub4_Sub3 aClass39_Sub3_Sub4_Sub3_984;
    public Class39_Sub3_Sub4_Sub3 aClass39_Sub3_Sub4_Sub3_985;
    public Class39_Sub3_Sub4_Sub3 aClass39_Sub3_Sub4_Sub3_986;
    public int anInt987;
    public int anIntArrayArray988[][];
    public int anInt989;
    public int anInt990;
    public int anInt991;
    public int anInt992;
    public boolean aBoolean993;
    public Class5 aClass5_994;
    public int anInt995;
    public String aString996;
    public int anInt997;
    public String aStringArray998[];
    public int anIntArray999[];
    public int anInt1000;
    public boolean aBoolean1001;
    public static int anInt1002;
    public static int loopCycle;
    public int anInt1004;
    public int anInt1005;
    public int anIntArray1006[];
    public int anIntArray1007[];
    public int anIntArray1008[];
    public int anIntArray1009[];
    public int anInt1010;
    public int anInt1011;
    public String aString1012;
    public int anInt1013;
    public int anInt1014;
    public volatile boolean aBoolean1015;
    public int anInt1016;
    public int anInt1017;
    public boolean aBooleanArray1018[];
    public int anInt1019;
    public static final int anIntArrayArray1020[][] = {
        {
            6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 
            2983, 54193
        }, {
            8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 
            56621, 4783, 1341, 16578, 35003, 25239
        }, {
            25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 
            10153, 56621, 4783, 1341, 16578, 35003
        }, {
            4626, 11146, 6439, 12, 4758, 10270
        }, {
            4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574
        }
    };
    public int anIntArray1021[];
    public boolean aBoolean1022;
    public String aString1023;
    public int anIntArray1024[];
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4_1025;
    public int anInt1026;
    public int anIntArray1027[];
    public int anIntArray1028[];
    public int anInt1029;
    public int anInt1030;
    public int anInt1031;
    public int anInt1032;
    public int anInt1033;
    public int anInt1034;
    public boolean aBoolean1035;
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4_1036;
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4_1037;
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4_1038;
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4_1039;
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4_1040;
    public int anInt1041;
    public int anInt1042;
    public int anInt1043;
    public static int nodeId = 10;
    public static int portOffset;
    public static boolean members = true;
    public static boolean highMemory;
    public int anInt1048;
    public int anInt1049;
    public long aLongArray1050[];
    public long aLong1051;
    public int anIntArray1052[];
    public int anInt1053;
    public int anInt1054;
    public int anInt1055;
    public int anInt1056;
    public int anInt1057;
    public int anInt1058;
    public byte aByte1059;
    public int anInt1060;
    public int anIntArrayArrayArray1061[][][];
    public Class13 aClass13Array1062[];
    public boolean needDrawTabArea;
    public int anInt1064;
    public int anIntArray1065[];
    public int anIntArray1066[];
    public Class14 aClass14_1067;
    public Class14 aClass14_1068;
    public Class14 aClass14_1069;
    public Class14 aClass14_1070;
    public Class14 aClass14_1071;
    public Class14 aClass14_1072;
    public Class14 aClass14_1073;
    public Class14 aClass14_1074;
    public Class14 aClass14_1075;
    public byte aByteArrayArrayArray1076[][][];
    public Class10 aClass10_1077;
    public int anInt1078;
    public int anInt1079;
    public int anIntArray1080[];
    public static int anInt1081 = 523;
    public int anInt1082;
    public int anInt1083;
    public boolean aBoolean1084;
    public int anInt1085;
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4Array1086[];
    public int anIntArray1087[];
    public int anInt1088;
    public int anInt1089;
    public String loginScreenTextLine1;
    public String loginScreenTextLine2;
    public int anInt1092;
    public int anInt1093;
    public int anInt1094;
    public int anIntArray1096[];
    public Class39_Sub3_Sub4_Sub2 aClass39_Sub3_Sub4_Sub2_1097;
    public Class39_Sub3_Sub4_Sub2 aClass39_Sub3_Sub4_Sub2_1098;
    public Class39_Sub3_Sub4_Sub2 aClass39_Sub3_Sub4_Sub2_1099;
    public Class39_Sub3_Sub4_Sub2 aClass39_Sub3_Sub4_Sub2_1100;
    public int anIntArrayArray1101[][];
    public boolean aBoolean1102;
    public int anInt1103;
    public RSSocket socket;
    public boolean aBoolean1105;
    public int anInt1106;
    public int anInt1107;
    public int anInt1108;
    public long serverKey;
    public int anIntArray1110[];
    public int anInt1111;
    public static BigInteger rsaModulus = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
    public int anInt1113;
    public final int anIntArray1114[] = {
        0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 
        2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
        2, 2, 3
    };
    public Socket aSocket1115;
    public int anInt1116;
    public int anIntArray1117[];
    public int anInt1118;
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4Array1119[];
    public int anIntArray1120[];
    public int anIntArray1121[];
    public int anIntArray1122[];
    public int anIntArray1123[];
    public boolean aBoolean1124;
    public String aString1125;
    public Class39_Sub3_Sub4_Sub3 aClass39_Sub3_Sub4_Sub3Array1126[];
    public int anInt1127;
    public int myHeightLevel;
    public int anInt1129;
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4Array1130[];
    public String aString1131;
    public boolean aBoolean1132;
    public int anInt1133;
    public int anInt1134;
    public int anInt1135;
    public int anInt1136;
    public int anInt1137;
    public Class39_Sub3_Sub4_Sub3 aClass39_Sub3_Sub4_Sub3_1138;
    public Class39_Sub3_Sub4_Sub3 aClass39_Sub3_Sub4_Sub3_1139;
    public Class39_Sub3_Sub4_Sub3 aClass39_Sub3_Sub4_Sub3_1140;
    public Class39_Sub3_Sub4_Sub3 aClass39_Sub3_Sub4_Sub3_1141;
    public Class39_Sub3_Sub4_Sub3 aClass39_Sub3_Sub4_Sub3_1142;
    public int anInt1143;
    public int anInt1144;
    public Class39_Sub3_Sub4_Sub3 aClass39_Sub3_Sub4_Sub3_1145;
    public Class39_Sub3_Sub4_Sub3 aClass39_Sub3_Sub4_Sub3_1146;
    public int anInt1147;
    public boolean aBoolean1148;
    public int anInt1149;
    public int anInt1150;
    public Class8 aClass8_1151;
    public String aString1152;
    public int anInt1153;
    public int anInt1154;
    public int anInt1155;
    public boolean aBoolean1156;
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4_1157;
    public Buffer incommingVector;
    public int anInt1159;
    public int anInt1160;
    public int anInt1161;
    public volatile boolean aBoolean1162;
    public boolean aBoolean1163;
    public static int anInt1164;
    public byte aByte1165;
    public int anInt1166;
    public byte aByteArrayArray1167[][];
    public int anInt1168;
    public int anInt1169;
    public int anInt1170;
    public static int anInt1171;
    public int opcodeSize;
    public int currentOpcode;
    public int anInt1174;
    public int anInt1175;
    public int anInt1176;
    public String enteredUsername;
    public String aString1178;
    public int anIntArrayArrayArray1179[][][];
    public int anInt1180;
    public RSInterface aClass34_1181;
    public byte aByte1182;
    public int anIntArray1183[] = {
        0xffff00, 0xff0000, 65280, 65535, 0xff00ff, 0xffffff
    };
    public int anInt1184;
    public long aLong1185;
    public static int anInt1186;
    public int anInt1187;
    public boolean aBoolean1188;
    public int anInt1189;
    public int anInt1190;
    public int anInt1191;
    public int anIntArray1192[];
    public String aStringArray1193[];
    public String aStringArray1194[];
    public int anInt1195;
    public int anInt1196;
    public byte aByte1197;
    public boolean aBoolean1198;
    public int anIntArray1199[];
    public int anInt1200;
    public String aString1201;
    public boolean aBoolean1202;
    public int anInt1203;
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4Array1204[];
    public static int anIntArray1205[];
    public int anIntArray1206[];
    public static int anInt1207;
    public int anInt1208;
    public int anInt1209;
    public int anInt1210;
    public int anInt1211;
    public int anInt1212;
    public int anInt1213;
    public CRC32 crc32;
    public int anInt1215;
    public String aStringArray1216[];
    public static int anInt1217 = 388;
    public int anInt1218;
    public int anInt1219;
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4_1220;
    public static int anInt1221;
    public int anIntArray1222[];
    public int anIntArray1223[];
    public static String aString1224 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\243$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
    public int anInt1225;
    public int anInt1226;
    public int anInt1227;
    public boolean aBoolean1228;
    public int anInt1229;
    public static boolean aBoolean1230;
    public byte aByte1231;
    public int anInt1232;
    public int anInt1233;
    public int anInt1234;
    public int anInt1235;
    public static int anInt1236;
    public int anInt1237;
    public int anInt1238;
    public byte aByteArrayArray1239[][];
    public Class14 aClass14_1240;
    public Class14 aClass14_1241;
    public Class14 aClass14_1242;
    public byte aByte1243;
    public Class14 aClass14_1244;
    public Class14 aClass14_1245;
    public Class14 aClass14_1246;
    public Class14 aClass14_1247;
    public Class14 aClass14_1248;
    public Class14 aClass14_1249;
    public Class14 aClass14_1250;
    public Class14 aClass14_1251;
    public Class14 aClass14_1252;
    public int anInt1253;
    public int anInt1254;
    public int anInt1255;
    public int anInt1256;
    public int anInt1257;
    public int anInt1258;
    public int anInt1259;
    public Class39_Sub3_Sub4_Sub3 aClass39_Sub3_Sub4_Sub3Array1260[];
    public int anInt1261;
    public int anIntArray1262[] = {
        17, 24, 34, 40
    };
    public int anInt1263;
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4_1264;
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4_1265;
    public int anInt1266;
    public static BigInteger rsaKey = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
    public int anInt1268;
    public int anInt1269;
    public int anInt1270;
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4_1271;
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4_1272;
    public OnDemandClient aOnDemandClient_1273;
    public int anInt1274;
    public static int anInt1275 = 9;
    public static int anInt1276;
    public Class39_Sub3_Sub4_Sub3 aClass39_Sub3_Sub4_Sub3_1277;
    public Class39_Sub3_Sub4_Sub3 aClass39_Sub3_Sub4_Sub3_1278;
    public Class39_Sub3_Sub4_Sub3 aClass39_Sub3_Sub4_Sub3_1279;
    public Class39_Sub3_Sub4_Sub3 aClass39_Sub3_Sub4_Sub3_1280;
    public Class39_Sub3_Sub4_Sub3 aClass39_Sub3_Sub4_Sub3_1281;
    public int anInt1282;
    public int anInt1283;
    public final int anInt1284 = 100;
    public int anIntArray1285[];
    public boolean aBoolean1286;
    public boolean aBoolean1287;
    public Buffer outgoingVector;
    public int tabId;
    public static int anInt1290;
    public byte aByte1291;
    public int anInt1292;
    public boolean aBoolean1293;
    public byte aByte1294;
    public boolean aBoolean1295;
    public int anInt1296;
    public int anInt1297;
    public int anInt1298;
    public int anInt1299;
    public int anInt1300;
    public Class39_Sub3_Sub4_Sub3 aClass39_Sub3_Sub4_Sub3Array1301[];
    public int anInt1302;
    public volatile boolean aBoolean1303;
    public int anInt1304;
    public Class5 aClass5_1305;
    public int anInt1306;
    public ISAACCipher decrypter;
    public int anIntArray1308[];
    public int archiveChecksums[];
    public int anInt1310;
    public Class5 aClass5_1311;
    public Class39_Sub3_Sub4_Sub4 aClass39_Sub3_Sub4_Sub4Array1312[];
    public int anInt1313;
    public int anInt1314;
    public int anIntArray1315[];
    public int anIntArray1316[];
    public int anIntArray1317[];
    public int anIntArray1318[];
    public boolean aBoolean1319;
    public static final int anIntArray1320[] = {
        9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 
        58654, 5027, 1457, 16565, 34991, 25486
    };
    public boolean aBoolean1321;
    public byte aByte1322;
    public int anInt1323;
    public int anInt1324;
    public int anInt1325;
    public String aString1326;
    public int tabInterfaceIds[] = {
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1
    };
    public static int anInt1328;
    public int anInt1329;
    public int anInt1330;
    public int anInt1331;
    public int anInt1332;
    public int anInt1333;
    public int anInt1334;
    public static int anInt1335;
    public int anInt1336;
    public static int anInt1337;

    static 
    {
        anIntArray880 = new int[32];
        int i = 2;
        for(int j = 0; j < 32; j++)
        {
            anIntArray880[j] = i - 1;
            i += i;
        }

        anIntArray1205 = new int[99];
        i = 0;
        for(int k = 0; k < 99; k++)
        {
            int l = k + 1;
            int i1 = (int)((double)l + 300D * Math.pow(2D, (double)l / 7D));
            i += i1;
            anIntArray1205[k] = i / 4;
        }

    }
}
