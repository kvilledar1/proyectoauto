/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kim Villeda
 */
public class Principal {
    public static void main(String[] args) {
        // Crear un objeto de la clase Auto
        Auto miAuto = new Auto("Toyota", "Rojo", "SUV", "RAV4", 5);

        // Mostrar la información del auto
        miAuto.mostrarInformacion();

        // Cambiar algunos valores
        miAuto.setColor("Azul");
        miAuto.setCantidadPasajeros(7);

        // Mostrar la información actualizada del auto
        miAuto.mostrarInformacion();
    }
}
