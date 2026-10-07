public class SensorAceleracion extends Sensor{

    private double valorEjeX;
    private double valorEjeY;
    private double valorEjeZ;

    public SensorAceleracion(String modelo, String fabricante,double consumoEnergia){
        super(modelo,fabricante,consumoEnergia,"m/s^2");
    }

    @Override
    public double leervalor() {
        System.out.println("Leyendo acelaracion en los ejes");
        this.valorEjeX=-10.0+(Math.random()*20);
        this.valorEjeY=-10.0+(Math.random()*20);
        this.valorEjeZ=-10.0+(Math.random()*20);

        System.out.printf("Lecturas: X= %.2f, Y=%.2f, Z=%.2f", valorEjeX, valorEjeY, valorEjeZ);
        
        return Math.sqrt(Math.pow(valorEjeX,2)+Math.pow(valorEjeY,2)+Math.pow(valorEjeZ,2));
    }
}
