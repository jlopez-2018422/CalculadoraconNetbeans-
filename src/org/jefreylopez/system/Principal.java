/*
Nombre: Jefrey Eduardo López Ampérez
Código Técnico: IN5AM
Carné:2018422
Fecha de creación: 16-03-2022
Fecha de modificaciones: 25-03-2022
 */

package org.jefreylopez.system;


import javax.swing.JOptionPane;
import org.jefreylopez.bean.Division;
import org.jefreylopez.bean.Multiplicacion;
import org.jefreylopez.bean.Resta;
import org.jefreylopez.bean.Salir;
import org.jefreylopez.bean.Suma;

public class Principal {

    private static int menuP;

    public static void main(String[] args) {
        
            do{ 
                int menu  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opción: \n"
                  +"1.Suma \n"
                  +"2.Resta \n"
                  +"3.Multiplicación \n"
                  +"4.División \n"
                  +"5.Salir \n"));
                   
           switch (menu){
            case 1 :
                Suma suma = new Suma(0,0);
                suma.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese primer valor")));
                suma.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo valor")));
                JOptionPane.showMessageDialog(null, "La suma es "+ String.valueOf(suma.sumatoria(suma.getNum1(), suma.getNum2())));
        
                break;

            case 2:
                Resta resta = new Resta(0,0);
                resta.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese primer valor ")));
                resta.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese segudno valor ")));
                JOptionPane.showMessageDialog(null, "La resta es " + String.valueOf(resta.resto(resta.getNum1(), resta.getNum2())));
                break;
            
            case 3:
                Multiplicacion multi = new Multiplicacion (0,0);
                multi.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese primer valor")));
                multi.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo valor")));
                JOptionPane.showMessageDialog(null, "La multiplicacion es " + String.valueOf(multi.producto(multi.getNum1 (), multi.getNum2())));
                break;
            
            case 4:
                Division divi = new Division (0,0);
                divi.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer valor")));
                divi.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo valor")));
                JOptionPane.showMessageDialog(null, "La división es " + String.valueOf(divi.resultado(divi.getNum1(), divi.getNum2())));
                break;            
            
            case 5:
                  Salir salir = new Salir();
                  salir.salir(); 
                  break;
                  
            default:
                JOptionPane.showMessageDialog(null, "Opción incorrecta, vuelve a poner una opción del 1 al 5");
                
           }
          }while( menuP != 5);
    }
}