package com.tw.screenshot.data;

public class Constant {
    
    public static final String ChromeUserAgent = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/32.0.1700.76 Safari/537.36";
    
    public static final String DATE_FORMAT      = "yyyy-MM-dd";
    public static final String TIME_FORMAT      = "HH:mm";
    public static final String FULL_TIME_FORMAT = DATE_FORMAT + " " + TIME_FORMAT;
    public static final int    ONE_DAY_MS       = 3600 * 24 * 1000;
    public static final int    ONE_MINUTE_MS    = 60 * 1000;
    public static final int    ONE_WEEK_MS      = ONE_DAY_MS * 7;
    public static final String IMAGE_PATHS      = "image_paths";
    public static final String IMAGE_URLS       = "image_urls";
    public static final String IMAGE_POSITION   = "image_position";
    public static final String DELETED_IMAGE_PATHS  = "delelted_image_paths";
    public static final String FILE_SCHEME      = "file://";
}
