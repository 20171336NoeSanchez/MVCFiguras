package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.clsCuadrado;
import modelo.clsRectangulo;
import modelo.clsTriangulo;
import vista.frmFiguras;

/**
 * @author noe_s
 */
public class controladorFiguras implements ActionListener{
 
    private frmFiguras frm;
    private clsCuadrado modC;
    private clsTriangulo modT;
    private clsRectangulo modR;
    
    public controladorFiguras (frmFiguras frm, clsCuadrado modC, clsTriangulo modT, clsRectangulo modR){
        this.frm = frm;
        this.modC = modC;
        this.modT = modT;
        this.modR = modR;
        this.frm.btnCuadrado.addActionListener(this);
        this.frm.btnTriangulo.addActionListener(this);
        this.frm.btnRectangulo.addActionListener(this);
        this.frm.btnCalcularA.addActionListener(this);
        this.frm.btnCalcularP.addActionListener(this);
    }

    public void iniciar(){
        frm.setTitle("Figuras");
        frm.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == frm.btnCuadrado){
            frm.txtLadoA.setVisible(true);
            frm.lblLadoA.setVisible(true);
            frm.txtLadoB.setVisible(false);
            frm.lblLadoB.setVisible(false);
            frm.txtLadoC.setVisible(false);
            frm.lblLadoC.setVisible(false);
            frm.txtAltura.setVisible(false);
            frm.txtBase.setVisible(false);
            frm.lblAltura.setVisible(false);
            frm.lblBase.setVisible(false);
            frm.txtTitulo.setText("Cuadrado");
        }
        if(e.getSource() == frm.btnTriangulo){
            frm.txtAltura.setVisible(true);
            frm.txtBase.setVisible(true);
            frm.lblAltura.setVisible(true);
            frm.lblBase.setVisible(true);
            frm.txtLadoA.setVisible(true);
            frm.lblLadoA.setVisible(true);
            frm.txtLadoB.setVisible(true);
            frm.lblLadoB.setVisible(true);
            frm.txtLadoC.setVisible(true);
            frm.lblLadoC.setVisible(true);
            frm.txtTitulo.setText("Triangulo");
        }
        if(e.getSource() == frm.btnRectangulo){
            frm.txtLadoA.setVisible(false);
            frm.lblLadoA.setVisible(false);
            frm.txtLadoB.setVisible(false);
            frm.lblLadoB.setVisible(false);
            frm.txtAltura.setVisible(true);
            frm.txtBase.setVisible(true);
            frm.lblAltura.setVisible(true);
            frm.lblBase.setVisible(true);
            frm.txtLadoC.setVisible(false);
            frm.lblLadoC.setVisible(false);
            frm.txtTitulo.setText("Rectangulo");
        }
        
        if(e.getSource() == frm.btnCalcularA){
            
            switch(frm.txtTitulo.getText()){
                case "Cuadrado":
                        modC.setLadoA(Float.parseFloat(frm.txtLadoA.getText()));
                        modC.calcularArea();
                        frm.txtResultado.setText(String.valueOf(modC.getResultado()));
                    break;
                    
                case "Triangulo":
                        modT.setAltura(Float.parseFloat(frm.txtAltura.getText()));
                        modT.setBase(Float.parseFloat(frm.txtBase.getText()));
                        modT.calcularArea();
                        frm.txtResultado.setText(String.valueOf(modT.getResultado()));
                    break;
                    
                case "Rectangulo":
                        modR.setAltura(Float.parseFloat(frm.txtAltura.getText()));
                        modR.setBase(Float.parseFloat(frm.txtBase.getText()));
                        modR.calcularArea();
                        frm.txtResultado.setText(String.valueOf(modR.getResultado()));
                    break;
            }
        }
        if(e.getSource() == frm.btnCalcularP){
           
            switch(frm.txtTitulo.getText()){
                case "Cuadrado":
                        modC.setLadoA(Float.parseFloat(frm.txtLadoA.getText()));
                        modC.calcularPerimetro();
                        frm.txtResultado.setText(String.valueOf(modC.getResultado()));
                    break;
                    
                case "Triangulo":
                        modT.setLadoA(Float.parseFloat(frm.txtLadoA.getText()));
                        modT.setLadoB(Float.parseFloat(frm.txtLadoB.getText()));
                        modT.setLadoC(Float.parseFloat(frm.txtLadoC.getText()));
                        modT.calcularPerimetro();
                        frm.txtResultado.setText(String.valueOf(modT.getResultado()));
                    break;
                    
                case "Rectangulo":
                        modR.setAltura(Float.parseFloat(frm.txtAltura.getText()));
                        modR.setBase(Float.parseFloat(frm.txtBase.getText()));
                        modR.calcularPerimetro();
                        frm.txtResultado.setText(String.valueOf(modR.getResultado()));
                    break;
            }
        }
    }
}
