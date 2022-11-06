package com.jagex;

import java.math.BigInteger;

import com.jagex.sign.Signlink;

public class Buffer extends Class39_Sub3 {

	public byte payload[];
	public int currentOffset;
	public int bitPosition;
	public static final int BIT_MASKS[] = {
			0, 1, 3, 7, 15, 31, 63, 127, 255, 511,
			1023, 2047, 4095, 8191, 16383, 32767, 65535, 0x1ffff, 0x3ffff, 0x7ffff,
			0xfffff, 0x1fffff, 0x3fffff, 0x7fffff, 0xffffff, 0x1ffffff, 0x3ffffff, 0x7ffffff, 0xfffffff, 0x1fffffff,
			0x3fffffff, 0x7fffffff, -1
	};
	public ISAACCipher encrypter;
	public static int anInt1447;
	public static int anInt1448;
	public static int anInt1449;
	public static Class5 aClass5_1450 = new Class5(-7255);
	public static Class5 aClass5_1451 = new Class5(-7255);
	public static Class5 aClass5_1452 = new Class5(-7255);

    public static Buffer makeBuffer(int i, int j) {
        synchronized (aClass5_1451) {
            Buffer class39_sub3_sub3_2 = null;
            if (j == 0 && anInt1447 > 0) {
                anInt1447--;
                class39_sub3_sub3_2 = (Buffer) aClass5_1450.method184();
            } else if (j == 1 && anInt1448 > 0) {
                anInt1448--;
                class39_sub3_sub3_2 = (Buffer) aClass5_1451.method184();
            } else if (j == 2 && anInt1449 > 0) {
                anInt1449--;
                class39_sub3_sub3_2 = (Buffer) aClass5_1452.method184();
            }
            if (class39_sub3_sub3_2 != null) {
                class39_sub3_sub3_2.currentOffset = 0;
                Buffer class39_sub3_sub3 = class39_sub3_sub3_2;
                return class39_sub3_sub3;
            }
        }
        Buffer class39_sub3_sub3_1 = new Buffer();
        if (i < 7 || i > 7)
            throw new NullPointerException();
        class39_sub3_sub3_1.currentOffset = 0;
        if (j == 0)
            class39_sub3_sub3_1.payload = new byte[100];
        else if (j == 1)
            class39_sub3_sub3_1.payload = new byte[5000];
        else
            class39_sub3_sub3_1.payload = new byte[30000];
        return class39_sub3_sub3_1;
    }

    public Buffer() {
        //Empty constructor.
    }

    public Buffer(byte data[]) {
        payload = data;
        currentOffset = 0;
    }

    public void writeOpcode(int opcode) {
        payload[currentOffset++] = (byte) (opcode + encrypter.getNextKey());
    }

    public void putByte(int i) {
        payload[currentOffset++] = (byte) i;
    }

    public void putShort(int i) {
        payload[currentOffset++] = (byte) (i >> 8);
        payload[currentOffset++] = (byte) i;
    }

    public void putLEShort(int i) {
        payload[currentOffset++] = (byte) i;
        payload[currentOffset++] = (byte) (i >> 8);
    }

    public void putTribyte(int i) {
        payload[currentOffset++] = (byte) (i >> 16);
        payload[currentOffset++] = (byte) (i >> 8);
        payload[currentOffset++] = (byte) i;
    }

    public void putInt(int i) {
        payload[currentOffset++] = (byte) (i >> 24);
        payload[currentOffset++] = (byte) (i >> 16);
        payload[currentOffset++] = (byte) (i >> 8);
        payload[currentOffset++] = (byte) i;
    }

    public void putLEInt(int i) {
        payload[currentOffset++] = (byte) i;
        payload[currentOffset++] = (byte) (i >> 8);
        payload[currentOffset++] = (byte) (i >> 16);
        payload[currentOffset++] = (byte) (i >> 24);
    }

    public void putLong(long l) {
        try {
            payload[currentOffset++] = (byte) (int) (l >> 56);
            payload[currentOffset++] = (byte) (int) (l >> 48);
            payload[currentOffset++] = (byte) (int) (l >> 40);
            payload[currentOffset++] = (byte) (int) (l >> 32);
            payload[currentOffset++] = (byte) (int) (l >> 24);
            payload[currentOffset++] = (byte) (int) (l >> 16);
            payload[currentOffset++] = (byte) (int) (l >> 8);
            payload[currentOffset++] = (byte) (int) l;
            return;
        } catch (RuntimeException runtimeexception) {
            Signlink.reporterror("88135, " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public void putString(final String s) {
        // fuck deprecation
        for (int i = 0; i < s.length(); i++) {
            payload[currentOffset++] = s.getBytes()[i];
        }
        payload[currentOffset++] = 10;
    }

    public void putBytes(byte data[], int length, int offset) {
        for (int i = offset; i < offset + length; i++) {
            payload[currentOffset++] = data[i];
        }
    }

    public void writePacketSize(int offset) { //I think.
        payload[currentOffset - offset - 1] = (byte) offset;
    }

    public int readUByte() {
        return payload[currentOffset++] & 0xff;
    }

    public byte getByte() {
        return payload[currentOffset++];
    }

    public int readShort() {
        currentOffset += 2;
        return ((payload[currentOffset - 2] & 0xff) << 8) + (payload[currentOffset - 1] & 0xff);
    }

    public int getSmart() {
        currentOffset += 2;
        int i = ((payload[currentOffset - 2] & 0xff) << 8) + (payload[currentOffset - 1] & 0xff);
        if (i > 32767)
            i -= 0x10000;
        return i;
    }

    public int getTribyte() {
        currentOffset += 3;
        return ((payload[currentOffset - 3] & 0xff) << 16) + ((payload[currentOffset - 2] & 0xff) << 8) + (payload[currentOffset - 1] & 0xff);
    }

    public int readIntBE() {
        currentOffset += 4;
        return ((payload[currentOffset - 4] & 0xff) << 24) + ((payload[currentOffset - 3] & 0xff) << 16) + ((payload[currentOffset - 2] & 0xff) << 8) + (payload[currentOffset - 1] & 0xff);
    }

    public long getLong() {
        long l = (long) readIntBE() & 0xffffffffL;
        long l1 = (long) readIntBE() & 0xffffffffL;
        return (l << 32) + l1;
    }

    public String readString() {
        int i = currentOffset;
        while (payload[currentOffset++] != 10) ;
        return new String(payload, i, currentOffset - i - 1);
    }

    public byte[] getRs2StringBytes() {
        int i = currentOffset;
        while (payload[currentOffset++] != 10) ;
        byte abyte0[] = new byte[currentOffset - i - 1];
        for (int j = i; j < currentOffset - 1; j++) {
            abyte0[j - i] = payload[j];
        }
        return abyte0;
    }

    public void readBytes(byte[] data, int length, int offset) {
        for (int i = offset; i < offset + length; i++) {
            data[i] = payload[currentOffset++];
        }
    }

    public void initBitAccess() {
        bitPosition = currentOffset * 8;
    }

    public int readBits(int numBits) {
        int j = bitPosition >> 3;
        int k = 8 - (bitPosition & 7);
        int value = 0;
        bitPosition += numBits;

        for (; numBits > k; k = 8) {
            value += (payload[j++] & BIT_MASKS[k]) << numBits - k;
            numBits -= k;
        }

        if (numBits == k) {
            value += payload[j] & BIT_MASKS[k];
        } else {
            value += payload[j] >> k - numBits & BIT_MASKS[numBits];
        }

        return value;
    }

    public void finishBitAccess() {
        currentOffset = (bitPosition + 7) / 8;
    }

    public int method448() //FIXME
    {
        int i = payload[currentOffset] & 0xff;
        if (i < 128)
            return readUByte() - 64;
        else
            return readShort() - 49152;
    }

    public int getByteOrShortC() {
        int i = payload[currentOffset] & 0xff;
        if (i < 128)
            return readUByte();
        else
            return readShort() - 32768;
    }

    public void encrypt(BigInteger key, BigInteger modulus) {
        int length = currentOffset;
        currentOffset = 0;
        byte data[] = new byte[length];
        readBytes(data, length, 0);
        BigInteger raw = new BigInteger(data);
        BigInteger encrypted = raw.modPow(key, modulus);
        byte finalData[] = encrypted.toByteArray();
        currentOffset = 0;
        putByte(finalData.length);
        putBytes(finalData, finalData.length, 0);
        return;
    }

    public void putByteA(int i) {
        payload[currentOffset++] = (byte) (i + 128);
    }

    public void putByteS(int i) {
        payload[currentOffset++] = (byte) (128 - i);
    }

    public int getUnsignedByteA() {
        return payload[currentOffset++] - 128 & 0xff;
    }

    public int getUnsignedByteC() {
        return -payload[currentOffset++] & 0xff;
    }

    public byte getByteC() {
        return (byte) (-payload[currentOffset++]);
    }

    public byte getByteS() {
        return (byte) (128 - payload[currentOffset++]);
    }

    public void putShortA(int i) {
        payload[currentOffset++] = (byte) (i >> 8);
        payload[currentOffset++] = (byte) (i + 128);
    }

    public void putLEShortA(int j) {
        payload[currentOffset++] = (byte) (j + 128);
        payload[currentOffset++] = (byte) (j >> 8);
    }

    public int readShortLE() {
        currentOffset += 2;
        return ((payload[currentOffset - 1] & 0xff) << 8) + (payload[currentOffset - 2] & 0xff);
    }

    public int getShortA() {
        currentOffset += 2;
        return ((payload[currentOffset - 2] & 0xff) << 8) + (payload[currentOffset - 1] - 128 & 0xff);
    }

    public int getLEShortA() {
        currentOffset += 2;
        return ((payload[currentOffset - 1] & 0xff) << 8) + (payload[currentOffset - 2] - 128 & 0xff);
    }

    public int getLESmart() {
        currentOffset += 2;
        int j = ((payload[currentOffset - 1] & 0xff) << 8) + (payload[currentOffset - 2] & 0xff);
        if (j > 32767)
            j -= 0x10000;
        return j;
    }

    public int getLESmartA() {
        currentOffset += 2;
        int j = ((payload[currentOffset - 1] & 0xff) << 8) + (payload[currentOffset - 2] - 128 & 0xff);
        if (j > 32767)
            j -= 0x10000;
        return j;
    }

    public int method466() { //FIXME: Fucked up offsets.
        currentOffset += 3;
        return ((payload[currentOffset - 3] & 0xff) << 16) + ((payload[currentOffset - 1] & 0xff) << 8) + (payload[currentOffset - 2] & 0xff);
    }

    public void method467(int i) { //FIXME: int 1 or int 2. (Only used once for packet 48, so it doesn't really matter)
        payload[currentOffset++] = (byte) (i >> 8);
        payload[currentOffset++] = (byte) i;
        payload[currentOffset++] = (byte) (i >> 24);
        payload[currentOffset++] = (byte) (i >> 16);
    }

    public int getLEInt() {
        currentOffset += 4;
        return ((payload[currentOffset - 1] & 0xff) << 24) + ((payload[currentOffset - 2] & 0xff) << 16) + ((payload[currentOffset - 3] & 0xff) << 8) + (payload[currentOffset - 4] & 0xff);
    }

    public int method469() { //FIXME: GetInt1 or getInt2.
        currentOffset += 4;
        return ((payload[currentOffset - 2] & 0xff) << 24) + ((payload[currentOffset - 1] & 0xff) << 16) + ((payload[currentOffset - 4] & 0xff) << 8) + (payload[currentOffset - 3] & 0xff);
    }

    public int method470(byte byte0) { //FIXME: getInt1 or getInt2.
        currentOffset += 4;
        return ((payload[currentOffset - 3] & 0xff) << 24) + ((payload[currentOffset - 4] & 0xff) << 16) + ((payload[currentOffset - 1] & 0xff) << 8) + (payload[currentOffset - 2] & 0xff);
    }

    public void getBytesA(byte data[], int length, int offset) {
        for (int index = offset; index < offset + length; index++) {
            payload[currentOffset++] = (byte) (data[index] + 128);
        }
    }

    public void getReverseBytes(byte data[], int length, int offset) {
        for (int index = (offset + length) - 1; index >= offset; index--) {
            data[index] = payload[currentOffset++];
        }
    }

}
