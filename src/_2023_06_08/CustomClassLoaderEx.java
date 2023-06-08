package _2023_06_08;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class CustomClassLoaderEx extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) {
        File file = new File("target\\classes\\_2023_06_08\\CLE.class");
        byte[] byteCode = loadClassBytes(file);
        return defineClass(name, byteCode, 0, byteCode.length);
    }

    private byte[] loadClassBytes(File file) {
        try (InputStream inputStream = new FileInputStream(file);
             ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            int data;
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
            }

            return outputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return new byte[0];
        }
    }

    public static void main(String[] args) {
        CustomClassLoaderEx customClassLoaderEx = new CustomClassLoaderEx();
        try {
            Class<?> clazz = customClassLoaderEx.loadClass("_2023_06_08.CLE");
            Object instance = clazz.getDeclaredConstructor().newInstance();
            clazz.getMethod("get").invoke(null);
        } catch (ClassNotFoundException
                 | InstantiationException
                 | InvocationTargetException
                 | IllegalAccessException |
                 NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}