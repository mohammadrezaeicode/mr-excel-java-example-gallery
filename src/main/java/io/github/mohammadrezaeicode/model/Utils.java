package io.github.mohammadrezaeicode.model;

import io.github.mohammadrezaeicode.excel.model.ImageInput;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.Imaging;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.function.Function;

public class Utils {
    public static Function<ImageInput, ImageInput> fetch() {

        return (ImageInput imageInput) -> {
            String imageUrl = (String) imageInput.getData();
            String imageType = imageUrl.substring(imageUrl.lastIndexOf(".") + 1);
            var result = ImageInput.builder();
            result.type(ImageInput.AcceptType.BUFFERED_IMAGE);
            result.extension(ImageInput.ImageExtension.getExtensionByName(imageType.toLowerCase()));
            try {
                URL url = new URL(imageUrl);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                    var res=httpURLConnection.getInputStream();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    BufferedImage image = Imaging.getBufferedImage(inputStream);
                    result.data(image);
                } else {
                    System.out.println("Failed to fetch image: " + httpURLConnection.getResponseMessage());
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("image gets" + ImageInput.ImageExtension.getExtensionByName(imageType.toLowerCase()));
            return result.build();
        };
    }
}
