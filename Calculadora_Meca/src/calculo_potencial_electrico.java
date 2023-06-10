public class calculo_potencial_electrico {
    double k = 8.89*Math.pow(10, 9); //Constante de Coulomb
    private double carga_puntual;
    private double distancia;
    private double potencial_electrico;

    public calculo_potencial_electrico(double carga_puntual, double distancia, double potencial_electrico){
        this.carga_puntual = carga_puntual;
        this.distancia = distancia;
        this.potencial_electrico = potencial_electrico;
    }
    //Declaracion de los return
    public double getCarga_puntual(){
        return carga_puntual;
    }

    public double getDistancia(){
        return distancia;
    }

    public double getPotencial_electrico(){
        return potencial_electrico;
    }
    //Delcaracion de los get

    public void setCarga_puntual(double carga_puntual) {
        this.carga_puntual = carga_puntual;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setPotencial_electrico(double potencial_electrico) {
        this.potencial_electrico = potencial_electrico;
    }

    //Potencial electrico para una carga puntual
    public double Calculo_V_qpuntual(double carga_puntual, double distancia){
        double resultado;
        resultado = k*(carga_puntual / distancia);
        return resultado;
    }
}
