package modelo;
/**
 * @author noe_s
 */
public class clsRectangulo extends clsFiguras{
    public void calcularArea(){
        this.setResultado(this.getBase() * this.getAltura());
    }
    public void calcularPerimetro(){
        this.setResultado((this.getBase() * 2) + (this.getAltura() * 2));
    }
}
