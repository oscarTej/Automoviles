public class Vehiculo {
    private String marca;
    private String matricula;
    private String modelo;
    private String color;
    private String combustible;
    private String motor;
    private String caballos;
    private Ficha ficha;



    public Vehiculo(String marca, String matricula, String modelo, String color, String combustible, String motor, String caballos, Ficha ficha) {
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.combustible = combustible;
        this.motor = motor;
        this.caballos = caballos;
        this.ficha = ficha;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCaballos() {
        return caballos;
    }

    public void setCaballos(String caballos) {
        this.caballos = caballos;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }


}
