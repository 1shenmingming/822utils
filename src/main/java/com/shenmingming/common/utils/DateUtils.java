package com.shenmingming.common.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {
  public static Date getDateByInitMonth(Date src) {
    //TODO 实现代码
    Calendar cc = Calendar.getInstance();
    cc.setTime(src);
    cc.set(Calendar.DAY_OF_MONTH, 1);
    cc.set(Calendar.HOUR_OF_DAY, 0);
    cc.set(Calendar.MINUTE, 0);
    cc.set(Calendar.SECOND, 0);

    return cc.getTime();

  }

  public static Date getDateByFullMonth(Date src) {
    Calendar c = Calendar.getInstance();
    c.setTime(src);
    c.add(Calendar.MONTH, 1);
    c.set(Calendar.DAY_OF_MONTH, 1);
    c.set(Calendar.HOUR_OF_DAY, 0);
    c.set(Calendar.MINUTE, 0);
    c.set(Calendar.SECOND, 0);
    c.add(Calendar.SECOND, -1);
    return c.getTime();
  }
}
