public abstract class Sensor extends DispositivoElectronico{

    protected String unidadDeMedida;
    protected boolean estaCalibrado= false;

    public Sensor(String modelo, String fabricante, Double consumoEnergia, String unidadDeMedida) {
        super(modelo, fabricante, consumoEnergia);
        this.unidadDeMedida = unidadDeMedida;
        this.estaCalibrado= false;

    }

    public void calibrar(){
        this.estaCalibrado = true;
        System.out.println("Se calibro el sensor"+modelo);
    }

    public abstract double leervalor();

}
