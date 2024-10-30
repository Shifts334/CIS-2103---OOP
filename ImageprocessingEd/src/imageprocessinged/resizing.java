/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imageprocessinged;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class resizing {


    public static void main(String args[]) throws IOException {
        BufferedImage img = null;
        File f = null;

        // Read image
        try {
            f = new File("/Users/user/Downloads/spacemarine.jpeg");
            img = ImageIO.read(f);
        } catch (IOException e) {
            System.out.println(e);
            return; // Exit if there's an error reading the image
        }

        // Get image's width and height
        int width = img.getWidth();
        int height = img.getHeight();
        
        int resizedW = width * 4;
        int resizedH = height * 4;

        BufferedImage resizedImg = new BufferedImage(resizedW,resizedH,BufferedImage.TYPE_INT_RGB);
        
        for(int x = 0; x < width; x++){
            for(int y = 0; y < height; y++){
                
                int rgb = img.getRGB(x, y);
                
                for(int qx = 0; qx < 4; qx++){
                    for(int qy = 0; qy <4; qy++){
                        
                        int dx = x * 4 + qx;
                        int dy = y * 4 + qy;
                        
                        if(dx)
                    }
                }
            }
        }
            
        // Write image
        try {
            f = new File("/Users/user/Downloads/greyspacemarine.jpeg");
            ImageIO.write(img, "png", f);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
