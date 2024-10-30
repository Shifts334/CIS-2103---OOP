/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imageprocessinged;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
 
public class ImageprocessingEd {
    public static void main(String args[])
            throws IOException {
        BufferedImage img = null;
        File f = null;
 
        
        // read image
        try {
            f = new File("/Users/user/Downloads/spacemarine.jpeg");
            img = ImageIO.read(f);
        } catch (IOException e) {
            System.out.println(e);
        }
 
        // get image's width and height
        int width = img.getWidth();
        int height = img.getHeight();
        int[] pixels = img.getRGB(0, 0, width, height, null, 0, width);
        // convert to grayscale
        for (int i = 0; i < pixels.length; i++) {
 
            // Here i denotes the index of array of pixels
            // for modifying the pixel value.
            int p = pixels[i];
 
            int a = (p >> 24) & 0xff;
            int r = (p >> 16) & 0xff;
            int g = (p >> 8) & 0xff;
            int b = p & 0xff;
 
            // calculate average
            
            //int avg = (r + g + b) / 3;
 
            // replace RGB value with avg
            //p = (a << 24) | (avg << 16) | (avg <<  | avg;
            p = (a << 24) | (0<<16) | (1<<16) | r;
 
            pixels[i] = p;
        }
        img.setRGB(0, 0, width, height, pixels, 0, width);
        // write image
        try {
            f = new File(
                    "/Users/user/Downloads/greyspacemarine.jpeg");
            ImageIO.write(img, "png", f);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}