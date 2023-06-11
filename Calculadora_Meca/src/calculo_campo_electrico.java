public class calculo_campo_electrico {
    private double fuerza_electrica;
    private double cargas_prueba;
    private double campo_electrico;
    private double distancia;
    double k = 8.89*Math.pow(10, 9); //Constante de Coulomb


    public calculo_campo_electrico(double fuerza_electrica, double cargas_prueba, double campo_electrico, double distancia) {
        this.fuerza_electrica = fuerza_electrica;
        this.cargas_prueba = cargas_prueba;
        this.campo_electrico = campo_electrico;
        this.distancia = distancia;
    }
    //Pedimos los datos
    public double getFuerza_electrica() {
        return fuerza_electrica;
    }
    public double getCargas_prueba() {
        return cargas_prueba;
    }
    public double getCampo_electrico(){
        return campo_electrico;
    }
    public double getDistancia(){
        return distancia;
    }
    //Modificar
    public void setFuerza_electrica(double fuerza_electrica){
        fuerza_electrica = fuerza_electrica;
    }

    public void setCarga_prueba(double carga_prueba){
        carga_prueba = carga_prueba;
    }

    public void setCampo_electrico(double campo_electrico){
        campo_electrico = campo_electrico;
    }

    public void setDistancia(double distancia){
        distancia = distancia;
    }
    //Para calcular la fuerza electrica sin la constante de Coulomb
    public double campo_electrico_sink(double fuerza_electrica, double carga_prueba){
        double magnitud_CE =0;
        magnitud_CE = fuerza_electrica / carga_prueba;
        return magnitud_CE;
    }
    //Para calcular el campo electrico de una carga puntual aislada
    public double campo_electrico_carga_aisalada(double carga_prueba, double distancia){
        double paso1 = 0, paso2 = 0;
        paso1 = (carga_prueba / Math.pow(distancia, 2));
        paso2 = k * paso1;
        return paso2;
    }
    //Para calcular la fuerza electrica
    public double fuerza_electrica_calculo(double campo_electrico, double carga_prueba){
        double fuerza_electrica_c = 0;
        fuerza_electrica_c = carga_prueba * campo_electrico;
        return fuerza_electrica_c;
    }
    //Para calcular la carga de prueba
    public double carga_prueba_calculo(double fuerza_electrica, double campo_electrico) {
        double carga_prueba_c = 0;
        carga_prueba_c = fuerza_electrica / campo_electrico;
        return carga_prueba_c;
    }
}
