package com.example.test.cn;

import lombok.Data;

import java.io.File;


@Data
public class JiaXianHao<T> {

    private String name;


    public static <E> void show(E t) {
        System.out.println(t);
    }


    public void delete(File file) {
        if (file.exists() && file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null && files.length > 0) {
                for (File file1 : files) {
                    if (file1.isDirectory()) {
                        delete(file1);
                    }
                    file1.delete();
                }
            }
        }
    }
}
