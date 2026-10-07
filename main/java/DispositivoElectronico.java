public class DispositivoElectronico {

    protected String modelo;
    protected String fabricante;
    protected Double consumoEnergia;
    protected boolean encendido;

    public DispositivoElectronico(String modelo, String fabricante, Double consumoEnergia) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.consumoEnergia = consumoEnergia;
        this.encendido = false;
    }

    public void encender(){
        this.encendido = true;
        System.out.println("Dispositivo encendido");
    }

    public void apagar(){
        this.encendido = false;
        System.out.println("Dispositivo apagado");
    }

    public String obtenerEstado(){
        String estado = encendido ? "Encendido" : "Desencendido";
        return "Modelo:"+modelo+"\nFabricante:"+fabricante+
                "\nConsumoEnergia:"+consumoEnergia+"\nEstado:"+estado;
    }


}
