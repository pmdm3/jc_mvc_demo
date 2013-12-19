package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Model;
import view.Vista;
/**
 * @web http://jc-mouse.blogspot.com/
 * @author Mouse
 */
public class Controlador implements ActionListener{

    private Vista vista;
    private Model modelo;
    //En el constructor inicializamos nuestros objetos y tambien
    //añadimos el ActionListener al boton "cmdsumar" de la VISTA
    public Controlador( Vista vista , Model modelo){
        this.vista = vista;
        this.modelo = modelo;
        this.vista.cmdsumar.addActionListener(this);
    }

    //Inicia los valores del jFrame VISTA con los datos del MODELO
    public void iniciar_vista(){
        vista.setTitle( "Demo MVC * jc-mouse.net" );
        vista.setLocationRelativeTo(null);
        vista.vtxt1.setText( String.valueOf(modelo.get_valor1()) );
        vista.vtxt2.setText( String.valueOf(modelo.get_valor2()) );
        vista.vtxt3.setText( String.valueOf(modelo.get_total()) );
    }

    //La accion del boton de la VISTA es capturado, asi como los valores de
    //los jtextbox, entonces se realiza la funcion SUMAR y se actualiza
    //el jtextbox correspondiente al resultado
    public void actionPerformed(ActionEvent e) {
        modelo.set_valor1( Integer.valueOf( vista.vtxt1.getText() ) );
        modelo.set_valor2( Integer.valueOf( vista.vtxt2.getText() ) );
        modelo.sumar();
        vista.vtxt3.setText( String.valueOf(modelo.get_total()) );
    }

}