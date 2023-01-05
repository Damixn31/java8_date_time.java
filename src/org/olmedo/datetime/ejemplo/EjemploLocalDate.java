package org.olmedo.datetime.ejemplo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalDate {
    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now();
        System.out.println("La fecha actual es: " + fechaActual);
        System.out.println("Dia: " + fechaActual.getDayOfMonth()); //obtengo el dia
        Month mes = fechaActual.getMonth();
        System.out.println("Mes: " + mes); // obtengo el mes
        System.out.println("Numero del mes: " + mes.getValue());
        System.out.println("Mes espaniol: " + mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));

        DayOfWeek diaSemana = fechaActual.getDayOfWeek();
        System.out.println("Numero del dia: " + diaSemana.getValue());
        System.out.println("Nombre del dia: " + diaSemana.getDisplayName(TextStyle.FULL,new Locale("es", "ES")));
        System.out.println("Anio: " + fechaActual.getYear());
        System.out.println("Dia del anio: " + fechaActual.getDayOfYear());
        System.out.println("Era: " + fechaActual.getEra());

        // con esto modificamos la fecha
        fechaActual = LocalDate.of(2023, 1, 2);
        System.out.println("la fecha actual es: " + fechaActual);

        // esta es otra forma
        fechaActual = LocalDate.of(2023, Month.FEBRUARY, 4);
        System.out.println("La fecha actual es: " + fechaActual);

        // esta es otra forma
        fechaActual = LocalDate.parse("2023-01-04");
        System.out.println("La fecha actual es: " + fechaActual);

        LocalDate diaDemaniana = LocalDate.now().plusDays(1);
        System.out.println("suma un dia: " + diaDemaniana);

        LocalDate mesAnteriosMismoDia = LocalDate.now().minusMonths(1);
        System.out.println("resta un mes el anterior: " + mesAnteriosMismoDia);

        // otra manera de restar el mes
        LocalDate mesAnteriosMismoDia2 = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("resta un mes el anterior: " + mesAnteriosMismoDia2);

        DayOfWeek miercoles = LocalDate.parse("2020-11-11").getDayOfWeek();
        System.out.println("miercoles = " + miercoles);

        // dia del mes
        int once = LocalDate.of(2020,11,11).getDayOfMonth();
        System.out.println(once);

        // para saber si es bisiesto o no el anio
        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println("esBisiesto = " + esBisiesto);

        // comparar fechas
        boolean esAntes = LocalDate.of(2023, 01, 04).isBefore(LocalDate.parse("2020-06-12"));
        System.out.println("esAntes = " + esAntes);

        boolean esDespues = LocalDate.parse("2020-11-11").isAfter(LocalDate.parse("2020-11-10"));
        System.out.println("esDespues = " + esDespues);

        esDespues = LocalDate.now().isAfter(LocalDate.now().minusDays(1));
        System.out.println("esDespues = " + esDespues);
    }


}
