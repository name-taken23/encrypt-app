package com.eapp.encryptapp;

interface CpInterface {
  String decrypt(String string);
  String encrypt(String string);
  void arSize(int x);
  void rotationSpec(int y);
  void rotate();

  String transform(String original, char[] code);
}