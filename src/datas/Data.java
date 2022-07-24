package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date y1 = sdf1.parse("23/07/2022");
        Date y2 = sdf2.parse("23/07/2022 12:35:00");

        System.out.println(y1);
        System.out.println(y2);

        System.out.println();

        System.out.println(sdf1.format(y1));
        System.out.println(sdf2.format(y2));

        Date dataAtual = new Date();
        System.out.println();
        System.out.println(dataAtual);
        System.out.println(sdf1.format(dataAtual));
        System.out.println(sdf2.format(dataAtual));
        
        System.out.println("Git");
    }
    
}
