package ru.vsu.cs.okshina_v_a.utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageUtils {

    public static void printImageToFile(File file, BufferedImage image) throws IOException {
        ImageIO.write(image, "jpg", file);
    }
}