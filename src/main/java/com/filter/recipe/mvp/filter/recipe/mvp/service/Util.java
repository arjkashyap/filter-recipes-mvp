package com.filter.recipe.mvp.filter.recipe.mvp.service;


import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Util {

    public static String readResource(final String resourcePath) {
        try {
            URL url = Util.class.getClassLoader().getResource(resourcePath);
            File file = FileUtils.toFile(url);
            if (file == null) {
                return "";
            }
            return FileUtils.readFileToString(file, "UTF-8");
        } catch (IOException e) {
            return "";
        }
    }
}