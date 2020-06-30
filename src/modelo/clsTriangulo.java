package modelo;
/**
 * @author noe_s
 */
public class clsTriangulo extends clsFiguras{
    public void calcularArea(){
        this.setResultado(this.getBase() * this.getAltura() / 2);
    }
    public void calcularPerimetro(){
        this.setResultado(this.getLadoA() + this.getLadoB() + this.getLadoC());
    }
}
