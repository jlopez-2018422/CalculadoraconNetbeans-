package org.jefreylopez.bean;

public class Multiplicacion {
     //Atributos
        private double num1;
        private double num2;
        
    //Constructor Nulo
        public Multiplicacion (){
        }
        
    //Constructor con paramentros
        public Multiplicacion(double num1, double num2){
            this.num1 = num1;
            this.num2 = num2;
       }
        
        //Métodoa de acceso
        public double getNum1(){
            return num1;
        }
        
        public void setNum1(double num1){
            this.num1 = num1;
        }
        
        public double getNum2(){
            return num2;
        }
        
        public void setNum2(double num2){
            this.num2 = num2;
        }
        
        public double producto (double num1, double num2){
            double result = num1*num2;
            return result;
            
        }
}
