public class SensorTemperatura extends Sensor{

    private double valorActual;

    public SensorTemperatura(String modelo, String fabricante,double consumoEnergia){
        super(modelo,fabricante,consumoEnergia,"°C");
    }

    @Override
    public double leervalor() {
        System.out.println("Leyendo la temperatura del sensor");
        this.valorActual = 20.0 + (Math.random()*15);
        return this.valorActual;
    }
}
