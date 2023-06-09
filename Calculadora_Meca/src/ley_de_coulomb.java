public class ley_de_coulomb {
    double k = 8.89*Math.pow(10, 9); //Constante de Coulomb
    private double Fe; //Fuerza electrica
    private double q1; //Carga 1
    private double q2; //Carga 2
    private double r; //Es la distancia entre las cargas

    public ley_de_coulomb(double Fe, double q1, double q2, double r){
        this.Fe = Fe;
        this.Fe = q1;
        this.q2 = q2;
        this.r = r;
    }
    //Estamos pidiendo los datos al usuario
    public double getFe(){
        return Fe;
    }

    public double getQ1() {
        return q1;
    }

    public double getQ2() {
        return q2;
    }

    public double getR() {
        return r;
    }

    //Debemos mostrarlo
    public void setFe(double fe) {
        Fe = fe;
    }

    public void setQ1(double q1) {
        this.q1 = q1;
    }

    public void setQ2(double q2) {
        this.q2 = q2;
    }

    public void setR(double r) {
        this.r = r;
    }
    //Para calcular la fuerza electrica
    public double Fuerza_Electrica_calculo(double q1, double q2, double r){
        double fuerza_electrica_1 = 0, fuerza_electrica_2;
        fuerza_electrica_1 = (q1 * q2) / Math.pow(r, 2);
        fuerza_electrica_2 = k * fuerza_electrica_1;
        return fuerza_electrica_2;
    }
    //Para cuando las cargas son iguales
    public double Carga_electrica_q1_calculo(double Fe,double r){
        double carga_calculo = 0;
        carga_calculo = Fe*Math.pow(r, 2) / k;
        return Math.sqrt(carga_calculo);
    }
    //Para cuando la carga son difrentes
    public double CargaCalculo(double fe, double q2, double distancia){
        double carga_q1 =0;
        carga_q1 = fe * Math.pow(distancia, 2) / k * q2;
        return carga_q1;
    }
    //Para calcular la distancia
    public double Distancia(double fe, double q1, double q2){
        double distancia_cal = 0;
        distancia_cal = (k * q1 * q2) / fe;
        return Math.sqrt(distancia_cal);
    }
}
