package py.com.snowtech.barcodes.controller;

import static org.springframework.http.MediaType.IMAGE_PNG_VALUE;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import py.com.snowtech.barcodes.code.Barbecue;
import py.com.snowtech.barcodes.code.QRGen;

import java.awt.image.BufferedImage;

@RestController
@RequestMapping(value = "/barcodes", produces = IMAGE_PNG_VALUE)
public class QRController {

    @GetMapping(value = "/barbecue/ean13/{barcode}")
    public ResponseEntity<BufferedImage> barbecueEAN13Barcode(@PathVariable("barcode") String barcode)
            throws Exception {

        return ResponseEntity.ok(Barbecue.generateEan13(barcode));
    }

    @GetMapping(value = "/barbecue/upca/{barcode}")
    public ResponseEntity<BufferedImage> barbecueUpcaBarcode(@PathVariable("barcode") String barcode)
            throws Exception {

        return ResponseEntity.ok(Barbecue.generateUpca(barcode));
    }

    @GetMapping(value = "/barbecue/code128/{barcode}")
    public ResponseEntity<BufferedImage> barbecueCode128Barcode(@PathVariable("barcode") String barcode)
            throws Exception {

        return ResponseEntity.ok(Barbecue.generateCode128(barcode));
    }

    @GetMapping(value = "/barbecue/pdf417/{barcode}")
    public ResponseEntity<BufferedImage> barbecuePdf417Barcode(@PathVariable("barcode") String barcode)
            throws Exception {

        return ResponseEntity.ok(Barbecue.generatePdf417(barcode));
    }

    @GetMapping(value = "/zxing/qrcode/{barcode}")
    public ResponseEntity<BufferedImage> barbecueQRGenCode(@PathVariable("barcode") String barcode)
            throws Exception {

        return ResponseEntity.ok(QRGen.generateQRCodeImage(barcode));
    }

}
