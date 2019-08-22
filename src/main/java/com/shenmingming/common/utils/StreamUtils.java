package com.shenmingming.common.utils;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

public class StreamUtils {
  public static void closeAll(Closeable... closeable) throws IOException {
    if (closeable != null || closeable.length > 0) {
      for (Closeable clo : closeable) {
        clo.close();
      }
    }
  }

  public static String readTextFile(InputStream src) throws IOException {
    ByteArrayOutputStream by = new ByteArrayOutputStream();
    byte[] b = new byte[1024];
    int len = 0;
    while ((len = src.read(b)) != -1) {
      by.write(b);
    }
    StreamUtils.closeAll(src, by);
    String string = by.toString("utf-8");
    return string;

  }
}
