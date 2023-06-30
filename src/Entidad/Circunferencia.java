package Entidad;

public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }



    //Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
    public void crearCircunferencia(double radio){
        this.radio = radio;
    }
    //Método area(): para calcular el área de la circunferencia (Area = π ∗ radio^2).
    public double area(){
        return Math.PI * Math.pow(this.radio, 2);
    }
    //Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
    public double perimetro(){
        return 2 * Math.PI * this.radio;
    }



}
