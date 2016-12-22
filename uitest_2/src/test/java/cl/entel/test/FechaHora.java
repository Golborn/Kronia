package cl.entel.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FechaHora {
public static void fecha(String[] args) {
Date date = new Date();
DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
System.out.println(hourdateFormat.format(date));
/*String fecha2 = hourdateFormat.format(date);
System.out.println(fecha2);*/
return;
}
}
