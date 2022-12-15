package ui;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class UI {

    GamePanel gp;
    private final BufferedImage background;

    public UI(GamePanel gp){
        this.gp = gp;

        background = loadImage("background");
    }
    public void update(){

    }
    public void draw(Graphics2D g2){
        g2.drawImage(background,0, 0, null);
    }
    private BufferedImage loadImage(String name){
        BufferedImage img = null;
        try{
            img = ImageIO.read(getClass().getResourceAsStream("/" + name + ".png"));
        }catch (IOException e){
            e.printStackTrace();
        }
        return img;
    }
}
