package org.example.memoryandgc.chapter02;

import java.io.FileNotFoundException;

/**
 * @author jason
 * @description
 * @create 2024/3/18 16:40
 **/
public class CustomClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        try {
            byte[] result = getClassFromCustomPath(name);
            if (result == null) {
                throw new FileNotFoundException();
            } else {
                //defineClass和findClass搭配使用
                return defineClass(name, result, 0, result.length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        throw new ClassNotFoundException(name);
    }
    //自定義流的獲取方式
    private byte[] getClassFromCustomPath(String name) {
        //從自定義路徑加載類，這邊忽略細節
        //如果指定路徑的字節碼文件進行加密，則需要在此方法進行解密
        return null;
    }

    public static void main(String[] args) {
        CustomClassLoader customClassLoader = new CustomClassLoader();
        try {
            Class<?> clazz = Class.forName("One", true, customClassLoader);
            Object obj = clazz.newInstance();
            System.out.println(obj.getClass().getClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}