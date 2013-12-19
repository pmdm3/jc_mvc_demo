package jc_mvc_demo;
 
 import controler.Controlador;
 import model.Model;
 import view.Vista;
 /**
 *  @web http://jc-mouse.blogspot.com/
  * @author Mouse
  */
 public class Main {
     
     public static void main(String[] args) {
 
         //nuevas instancias de clase
         Model modelo = new Model();
         Vista vista = new Vista();        
         Controlador controlador = new Controlador( vista , modelo );
         //se inicia la vista
         controlador.iniciar_vista();
 
         vista.setVisible(true);
 
     }
 
 }