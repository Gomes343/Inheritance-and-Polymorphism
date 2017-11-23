package Question8;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main{
    public static void main (String [] args){
        Calendar calendar = new GregorianCalendar();
        int ano,idade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Em que Ano você Nasceu?");
        ano = sc.nextInt();
        idade = calendar.get(Calendar.YEAR) - ano;
        System.out.println("Sua idade em dias é de: " + (idade * 365));
    }
}
