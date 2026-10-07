public class SensorPresion extends Sensor{

    private double valorActual;

    public SensorPresion(String modelo, String fabricante,double consumoEnergia){
        super(modelo,fabricante,consumoEnergia,"hPa");
    }

    @Override
    public double leervalor() {
        System.out.println("Leyendo presion");
        this.valorActual = 900.0+(Math.random()*100.0);
        return 0;
    }
}
