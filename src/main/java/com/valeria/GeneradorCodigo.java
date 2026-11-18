package com.valeria;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.Code128Writer;

import java.nio.file.Path;
import java.nio.file.Paths;

public class GeneradorCodigo {
    public static void generar(String codigo) throws Exception{
     
        Code128Writer escritor = new Code128Writer();
        BitMatrix matriz = escritor.encode(codigo, BarcodeFormat.CODE_128, 300, 100);
        Path ruta = Paths.get(codigo + ".png");
        MatrixToImageWriter.writeToPath(matriz, "PNG", ruta);
  
    }

}
