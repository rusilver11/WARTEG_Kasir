/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siperpus;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class pbill {
      
     pbill(String[] judul,
       String[][] oo, int bar, int kol, String dom, String nama, String tran, String bayar, String kembali) throws DocumentException, FileNotFoundException, IOException, InterruptedException {
        Document d = new Document();
        PdfWriter.getInstance(d, new FileOutputStream("Struck.pdf"));
        PdfPTable pt = new PdfPTable(judul.length);
        d.open();

        Image img;
        img = Image.getInstance("D:\\NetBeansProjects\\SIPerpus\\warteg1.jpg");
        img.setAlignment(Image.MIDDLE);
        img.scaleToFit(d.getPageSize().getWidth() - d.leftMargin() - d.rightMargin(), 110);
        d.add(img);
        d.add(new Paragraph("Nama_____________: " + nama));
        d.add(new Paragraph("No. Transaksi_______: " + tran));
        Paragraph p = new Paragraph("-------------------------------------------------------------------------------------------------------------");
        p.setAlignment(Paragraph.ALIGN_CENTER);
        p.setSpacingAfter(10);
        d.add(p);
        for (int i = 0; i < judul.length; i++) {
            pt.addCell(judul[i]);
        }
        for (int i = 0; i < bar; i++) {
            for (int j = 0; j < kol; j++) {
                pt.addCell(oo[i][j]);
            }
        }
       
        d.add(pt);
        Paragraph l = new Paragraph("-------------------------------------------------------------------------------------------------------------");
        l.setAlignment(Paragraph.ALIGN_CENTER);
        l.setSpacingAfter(10);
        d.add(l);
        Paragraph t = new Paragraph("Total = " + dom);
        t.setAlignment(Paragraph.ALIGN_RIGHT);
        t.setSpacingAfter(10);
        d.add(t);
        Paragraph b = new Paragraph("Bayar = " + bayar);
        b.setAlignment(Paragraph.ALIGN_RIGHT);
        b.setSpacingAfter(10);
        d.add(b);
        Paragraph r = new Paragraph("---------------------------------------");
        r.setAlignment(Paragraph.ALIGN_RIGHT);
        r.setSpacingAfter(10);
        d.add(r);
        Paragraph k = new Paragraph("Kembali = " + kembali);
        k.setAlignment(Paragraph.ALIGN_RIGHT);
        k.setSpacingAfter(10);
        d.add(k);
        Paragraph s = new Paragraph("-------------------------------------------------------------------------------------------------------------");
        s.setAlignment(Paragraph.ALIGN_CENTER);
        s.setSpacingAfter(10);
        d.add(s);
        Paragraph n = new Paragraph("Terima Kasih, Atas Kunjungan Anda");
        n.setAlignment(Paragraph.ALIGN_CENTER);
        n.setSpacingAfter(10);
        d.add(n);
        Paragraph m = new Paragraph("**" + nama + "**");
        m.setAlignment(Paragraph.ALIGN_CENTER);
        m.setSpacingAfter(10);
        d.add(m);
        d.close();

        Process pr = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "Struck.pdf");
        pr.waitFor();
    }
}


