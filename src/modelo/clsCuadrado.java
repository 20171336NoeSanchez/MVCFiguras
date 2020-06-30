package modelo;
/**
 * @author noe_s
 */
public class clsCuadrado extends clsFiguras{
    public void calcularArea(){
        this.setResultado(this.getLadoA() * this.getLadoA());
    }
    public void calcularPerimetro(){
        this.setResultado(this.getLadoA() * 4);
    }
}
