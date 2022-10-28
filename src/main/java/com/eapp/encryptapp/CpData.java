package com.eapp.encryptapp;

public class CpData implements CpInterface{
  protected static char[] encoder;
  protected static char[] decoder;
  private int rotation;
  private int coderSize;

  public void arSize(int y) throws ArrayIndexOutOfBoundsException {
    if(y==94) {
      coderSize = y;
      encoder = new char[y];
      decoder = new char[y];
    }else {
      throw new ArrayIndexOutOfBoundsException("Index must be 26");
    }
  }
  public String decrypt(String message) {
    return transform(message,decoder);
  }

  public String encrypt(String secret) {
    return transform(secret, encoder);
  }

  public void rotationSpec(int x) {
    rotation = x;

  }

  public void rotate() {
    for (int k=0; k <= coderSize-1; k++)
    {
      encoder[k] = (char)('!' + (k + rotation) % coderSize );
      decoder[k] = (char)('!' + (k - rotation + coderSize) % coderSize);

    }
  }

 public String transform(String original, char[] code) {
    char[] msg = original.toCharArray();
    for (int k = 0; k < msg.length; k++)
      if(msg[k] > 32)  {
        int j = msg[k] - '!';
        msg[k] = code[j];
      }
    return new String(msg);
  }
}
