package com.example.jh.gsondemo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jinhui on 2018/6/13.
 * email: 1004260403@qq.com
 */

public class TimeUtil {

    /**
     * 时间日期格式化到年月日.
     */
    public static String dateFormatYMD = "yyyy-MM-dd";

    /**
     * 时间戳转特定格式时间
     * @param dataFormat
     * @param timeStamp
     * @return
     */
    public static String formatData(String dataFormat, long timeStamp) {
        if (timeStamp == 0) {
            return "";
        }
        SimpleDateFormat format = new SimpleDateFormat(dataFormat);
        return format.format(new Date(timeStamp));
    }

}
