public abstract class Sensor extends DispositivoElectronico{

    protected String unidadDeMedida;
    protected boolean estaCalibrado= false;

    public Sensor(String modelo, String fabricante, Double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia);
    }

    public void calibrar(){
        this.estaCalibrado = true;
        System.out.println("Esta calibrado");
    }

    public abstract double leervalor();

}
