package com.jagex;

import java.math.BigInteger;

public class Buffer extends Class39_Sub3 {

	public byte[] payload;
	public int position;
	public int bitPosition;
	public static final int[] BIT_MASKS = {
			0, 1, 3, 7, 15, 31, 63, 127, 255, 511,
			1023, 2047, 4095, 8191, 16383, 32767, 65535, 0x1ffff, 0x3ffff, 0x7ffff,
			0xfffff, 0x1fffff, 0x3fffff, 0x7fffff, 0xffffff, 0x1ffffff, 0x3ffffff, 0x7ffffff, 0xfffffff, 0x1fffffff,
			0x3fffffff, 0x7fffffff, -1
	};
	public ISAACCipher isaacCipher;
	public static Class5 aClass5_1450 = new Class5(-7255);

    public static Buffer allocate(int sizeMode) {
        Buffer buffer = new Buffer();
        buffer.position = 0;
        if (sizeMode == 0)
            buffer.payload = new byte[100];
        else if (sizeMode == 1)
            buffer.payload = new byte[5000];
        else
            buffer.payload = new byte[30000];
        return buffer;
    }

    public Buffer() { }

    public Buffer(byte[] data) {
        payload = data;
        position = 0;
    }

    public void writeOpcode(int opcode) {
        payload[position++] = (byte) (opcode + isaacCipher.getNextKey());
    }

    public void putByte(int i) {
        payload[position++] = (byte) i;
    }

    public void writeShortBE(int value) {
        payload[position++] = (byte) (value >> 8);
        payload[position++] = (byte) value;
    }

    public void writeShortLE(int value) {
        payload[position++] = (byte) value;
        payload[position++] = (byte) (value >> 8);
    }

    public void writeMiddleBE(int value) {
        payload[position++] = (byte) (value >> 16);
        payload[position++] = (byte) (value >> 8);
        payload[position++] = (byte) value;
    }

    public void writeIntBE(int value) {
        payload[position++] = (byte) (value >> 24);
        payload[position++] = (byte) (value >> 16);
        payload[position++] = (byte) (value >> 8);
        payload[position++] = (byte) value;
    }

    public void writeIntLE(int value) {
        payload[position++] = (byte) value;
        payload[position++] = (byte) (value >> 8);
        payload[position++] = (byte) (value >> 16);
        payload[position++] = (byte) (value >> 24);
    }

    public void writeLongBE(long value) {
        payload[position++] = (byte) (int) (value >> 56);
        payload[position++] = (byte) (int) (value >> 48);
        payload[position++] = (byte) (int) (value >> 40);
        payload[position++] = (byte) (int) (value >> 32);
        payload[position++] = (byte) (int) (value >> 24);
        payload[position++] = (byte) (int) (value >> 16);
        payload[position++] = (byte) (int) (value >> 8);
        payload[position++] = (byte) (int) value;
    }

    public void writeString(String string) {
        for (int i = 0; i < string.length(); i++) {
            payload[position++] = string.getBytes()[i];
        }
        payload[position++] = 10;
    }

    public void writeBytes(byte[] data, int offset, int length) {
        for (int i = offset; i < offset + length; i++) {
            payload[position++] = data[i];
        }
    }

    public void writeSizeByte(int length) {
        payload[position - length - 1] = (byte) length;
    }

    public int readUByte() {
        return payload[position++] & 0xff;
    }

    public byte readByte() {
        return payload[position++];
    }

    public int readUShortBE() {
        position += 2;
        return ((payload[position - 2] & 0xff) << 8) + (payload[position - 1] & 0xff);
    }

    public int writeSmart() {
        position += 2;
        int i = ((payload[position - 2] & 0xff) << 8) + (payload[position - 1] & 0xff);
        if (i > 32767)
            i -= 0x10000;
        return i;
    }

    public int readMediumBE() {
        position += 3;
        return ((payload[position - 3] & 0xff) << 16) + ((payload[position - 2] & 0xff) << 8) + (payload[position - 1] & 0xff);
    }

    public int readIntBE() {
        position += 4;
        return ((payload[position - 4] & 0xff) << 24) + ((payload[position - 3] & 0xff) << 16) + ((payload[position - 2] & 0xff) << 8) + (payload[position - 1] & 0xff);
    }

    public long readLongBE() {
        long l = (long) readIntBE() & 0xffffffffL;
        long l1 = (long) readIntBE() & 0xffffffffL;
        return (l << 32) + l1;
    }

    public String readString() {
        int i = position;
        while (payload[position++] != 10) ;
        return new String(payload, i, position - i - 1);
    }

    public byte[] readStringBytes() {
        int start = position;

        while (payload[position++] != 10) ;
        byte bytes[] = new byte[position - start - 1];
        for (int j = start; j < position - 1; j++) {
            bytes[j - start] = payload[j];
        }
        return bytes;
    }

    public void readBytes(byte[] data, int length, int offset) {
        for (int i = offset; i < offset + length; i++) {
            data[i] = payload[position++];
        }
    }

    public void initBitAccess() {
        bitPosition = position * 8;
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
        position = (bitPosition + 7) / 8;
    }

    public int readSmart() {
        int peek = payload[position] & 0xff;
        if (peek < 128) {
            return readUByte() - 64;
        } else {
            return readUShortBE() - 49152;
        }
    }

    public int readUSmart() {
        int peek = payload[position] & 0xff;
        if (peek < 128)
            return readUByte();
        else
            return readUShortBE() - 32768;
    }

    public void encrypt(BigInteger key, BigInteger modulus) {
        int length = position;
        position = 0;
        byte[] data = new byte[length];
        readBytes(data, length, 0);
        BigInteger raw = new BigInteger(data);
        BigInteger encrypted = raw.modPow(key, modulus);
        byte[] finalData = encrypted.toByteArray();
        position = 0;
        putByte(finalData.length);
        writeBytes(finalData, 0, finalData.length);
    }

    public void writeByteA(int value) {
        payload[position++] = (byte) (value + 128);
    }

    public void writeByteS(int value) {
        payload[position++] = (byte) (128 - value);
    }

    public int readUByteA() {
        return payload[position++] - 128 & 0xff;
    }

    public int readUByteC() {
        return -payload[position++] & 0xff;
    }

    public byte readByteC() {
        return (byte) (-payload[position++]);
    }

    public byte readByteS() {
        return (byte) (128 - payload[position++]);
    }

    public void writeShortBEA(int value) {
        payload[position++] = (byte) (value >> 8);
        payload[position++] = (byte) (value + 128);
    }

    public void writeShortLEA(int value) {
        payload[position++] = (byte) (value + 128);
        payload[position++] = (byte) (value >> 8);
    }

    public int readUShortLE() {
        position += 2;
        return ((payload[position - 1] & 0xff) << 8) + (payload[position - 2] & 0xff);
    }

    public int readUShortA() {
        position += 2;
        return ((payload[position - 2] & 0xff) << 8) + (payload[position - 1] - 128 & 0xff);
    }

    public int readUShortLEA() {
        position += 2;
        return ((payload[position - 1] & 0xff) << 8) + (payload[position - 2] - 128 & 0xff);
    }

    public int readShortLE() {
        position += 2;
        int value = ((payload[position - 1] & 0xff) << 8) + (payload[position - 2] & 0xff);
        if (value > 32767)
            value -= 0x10000;
        return value;
    }

    public int readShortLEA() {
        position += 2;
        int j = ((payload[position - 1] & 0xff) << 8) + (payload[position - 2] - 128 & 0xff);
        if (j > 32767)
            j -= 0x10000;
        return j;
    }

    public int readUMediumBE() { //FIXME: Fucked up offsets.
        position += 3;
        return ((payload[position - 3] & 0xff) << 16) + ((payload[position - 1] & 0xff) << 8) + (payload[position - 2] & 0xff);
    }

    public void method467(int i) { //FIXME: int 1 or int 2. (Only used once for packet 48, so it doesn't really matter)
        payload[position++] = (byte) (i >> 8);
        payload[position++] = (byte) i;
        payload[position++] = (byte) (i >> 24);
        payload[position++] = (byte) (i >> 16);
    }

    public int readIntLE() {
        position += 4;
        return ((payload[position - 1] & 0xff) << 24) + ((payload[position - 2] & 0xff) << 16) + ((payload[position - 3] & 0xff) << 8) + (payload[position - 4] & 0xff);
    }

    public int method469() { //FIXME: GetInt1 or getInt2.
        position += 4;
        return ((payload[position - 2] & 0xff) << 24) + ((payload[position - 1] & 0xff) << 16) + ((payload[position - 4] & 0xff) << 8) + (payload[position - 3] & 0xff);
    }

    public int method470(byte byte0) { //FIXME: getInt1 or getInt2.
        position += 4;
        return ((payload[position - 3] & 0xff) << 24) + ((payload[position - 4] & 0xff) << 16) + ((payload[position - 1] & 0xff) << 8) + (payload[position - 2] & 0xff);
    }

    public void writeBytesA(byte[] data, int offset, int length) {
        for (int index = offset; index < offset + length; index++) {
            payload[position++] = (byte) (data[index] + 128);
        }
    }

    public void getReverseBytes(byte[] data, int offset, int length) {
        for (int index = (offset + length) - 1; index >= offset; index--) {
            data[index] = payload[position++];
        }
    }
}
