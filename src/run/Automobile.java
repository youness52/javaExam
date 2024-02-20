/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

/**
 *
 * @author jonas
 */
public class Automobile extends Vehicule implements Ivehicule {

    public int nombrePassager;
    private String categorie;

    @Override
    public void afficherMarque() {
        System.out.println("La marque est : " + this.getMarque());
    }

}
