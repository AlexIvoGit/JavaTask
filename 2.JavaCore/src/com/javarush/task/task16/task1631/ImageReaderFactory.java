package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes jpg) {
        if (jpg == null) {
            throw new IllegalArgumentException();
        } else if (jpg == ImageTypes.JPG) {
            return new JpgReader();
        } else if (jpg == ImageTypes.BMP) {
            return new BmpReader();
        } else if (jpg == ImageTypes.PNG) {
            return new PngReader();
        }
        return null;
    }
}
