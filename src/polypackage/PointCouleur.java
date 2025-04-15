/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polypackage;

/**
 *
 * @author dell
 */
public class PointCouleur extends Point{
    private String couleur;
    
    // Constructeur

    public PointCouleur(String couleur) {
        super(); // la méthode Super: appelle le constructeur de la classe mère
        this.couleur = couleur;
    }

    public PointCouleur(int x, int y, String couleur) {
        super(x, y);
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    
    @Override
    public String afficher(){
        super.afficher(); // opérateur super: appelle une méthode à partir de la classe mère
        return this.couleur;
    }
    
}
