package org.jefreylopez.bean;

public class Resta {
    //Atributos
    private double num1;
    private double num2;
    
    //Constructor Nulo
     public Resta() {
    }
          
    //Constructor con paramentros
        public Resta(double num1, double num2){
            this.num1 = num1;
            this.num2 = num2;
        }

    //Métodoa de acceso
        public double getNum1 (){
            return num1;
        }
     
        public void setNum1 (double num1){
           this.num1 = num1; 
        }

        public double getNum2(){
            return num2; 
        }
        
         public void setNum2(double num2){
             this.num2 = num2 ;
         }

         public double resto (double num1, double num2){
             double result = num1 - num2;
             return result;
         }
}
