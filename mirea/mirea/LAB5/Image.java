package mirea.LAB5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

    public class Image extends JFrame {
        public Image(String href) throws IOException {
            super("Image");
            setSize(1000, 600);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            // чтение изображения по ссылке(абсолютному пути)
            BufferedImage img = ImageIO.read(new File(href));
            // добавление изображения в графический интерфейс
            JLabel label = new JLabel(new ImageIcon(img));
            add(label);
        }

        public static void main(String[] args) throws IOException {
            // если есть аргумент командной строки, то берем путь оттуда
            new Image(args.length != 0 ? args[0] : "src/mirea.lab5/rat.jpg").setVisible(true);
        }
    }
