package com.shenmingming.common.utils;

public class FileUtils {
  public static String getExtendName(String fileName) {
    //TODO 实现代码
    String substring = fileName.substring(fileName.lastIndexOf("."));
    System.out.println(substring);
    return substring;
  }
}
