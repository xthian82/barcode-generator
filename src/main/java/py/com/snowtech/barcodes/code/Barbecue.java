package py.com.snowtech.barcodes.code;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;

import java.awt.Font;
import java.awt.image.BufferedImage;

public class Barbecue {

    public static BufferedImage generatePdf417(String barcodeText) throws Exception {
        Barcode barcode = BarcodeFactory.createPDF417(barcodeText);
        barcode.setFont(Font.getFont("Consolas"));

        return BarcodeImageHandler.getImage(barcode);
    }

    public static BufferedImage generateCode128(String barcodeText) throws Exception {
        Barcode barcode = BarcodeFactory.createCode128(barcodeText);
        barcode.setFont(Font.getFont("Consolas"));

        return BarcodeImageHandler.getImage(barcode);
    }

    public static BufferedImage generateEan13(String barcodeText) throws Exception {
        Barcode barcode = BarcodeFactory.createEAN13(barcodeText);
        //BarcodeFactory.createUPCA()
        barcode.setFont(Font.getFont("Consolas"));

        return BarcodeImageHandler.getImage(barcode);
    }

    public static BufferedImage generateUpca(String barcodeText) throws Exception {
        Barcode barcode = BarcodeFactory.createUPCA(barcodeText);
        barcode.setFont(Font.getFont("Consolas"));

        return BarcodeImageHandler.getImage(barcode);
    }
}
