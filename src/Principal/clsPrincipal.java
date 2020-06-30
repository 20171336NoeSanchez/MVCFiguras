package Principal;

import controlador.controladorFiguras;
import modelo.clsCuadrado;
import modelo.clsRectangulo;
import modelo.clsTriangulo;
import vista.frmFiguras;

/**
 * @author noe_s
 */
public class clsPrincipal {
    public static void main(String[] args){
        
        clsCuadrado modC = new clsCuadrado();
        clsTriangulo modT = new clsTriangulo();
        clsRectangulo modR = new clsRectangulo();
        frmFiguras frm = new frmFiguras();
        
        controladorFiguras ctrl = new controladorFiguras(frm, modC, modT, modR);
        ctrl.iniciar();
        frm.setVisible(true);
    }
}
