public class calculo_varias_cargas {
    double k = 8.89*Math.pow(10, 9);
    private double distancia;
    private double carga_puntual;

    public calculo_varias_cargas(double distancia, double carga_puntual){
        this.distancia = distancia;
        this.carga_puntual = carga_puntual;
    }

    public double getDistancia(){
        return distancia;
    }

    public double getCarga_puntual(){
        return carga_puntual;
    }

    public void setDistancia(double distancia){
        this.distancia = distancia;
    }

    public void setCarga_puntual(double carga_puntual){
        this.carga_puntual = carga_puntual;
    }
    
    //Potencial electrico para una carga puntual
    public double Calculo_V_qpuntual(double carga_puntual, double distancia){
        double resultado;
        resultado = k*(carga_puntual / distancia);
        return resultado;
    }
}
