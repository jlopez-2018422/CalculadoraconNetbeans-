package org.jefreylopez.bean;

public class Suma {
        //Atributos
        private double num1;
        private double num2;
        
        //Constructor Nulo
        public Suma() {
        }
        
        //Constructor con paramentros
        public Suma(double num1, double num2){
            this.num1 = num1;
            this.num2= num2;
        }

        //Métodoa de acceso
        public double getNum1() {
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
    
        public double sumatoria(double num1, double num2){
            double result = num1 + num2;
            return result;
        }

    public Object sumatoria(double num1, double num2, String suma, int menuP) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
