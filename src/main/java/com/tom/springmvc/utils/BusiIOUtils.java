package com.tom.springmvc.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName BusiIOUtils.java
 * @Description TODO
 * @createTime 2024年09月22日 20:54:00
 */
public class BusiIOUtils {

    public static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, len);
        }
    }

    /**
     * @description 保存到本地磁盘文件
     * @author admin
     */
    public static void saveToDiskFile(MultipartFile multipartFile, String path) throws IOException {
        BufferedOutputStream targetBufferedOutputStream = new BufferedOutputStream(new FileOutputStream(path));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(multipartFile.getInputStream());
        byte[] bufferArr = new byte[1024];
        while (bufferedInputStream.read(bufferArr, 0, bufferArr.length) != -1) {
            targetBufferedOutputStream.write(bufferArr);
        }
        targetBufferedOutputStream.flush();
        targetBufferedOutputStream.close();
        bufferedInputStream.close();
    }

    private BusiIOUtils() {
        // do nothing.
    }
}
