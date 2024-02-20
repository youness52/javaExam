/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

/**
 *
 * @author jonas
 */
public class Camion extends Vehicule implements Ivehicule {

    private static String categorieCamion;

    @Override
    public void afficherMarque() {
        System.out.println("La marque est : " + this.getMarque());
    }

    public static String getCategorieCamion() {
        return categorieCamion;
    }

}
