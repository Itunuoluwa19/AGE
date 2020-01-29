
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// computing your age provided you input your year of birth
package age;
import java.util.Scanner;
/**
 *
 * @author ITUNU
 */
public class AGE {
// including an io exception after d main method
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("your year of birth please e.g 1976: ");
        int k= input.nextInt();
        System.out.print("supply this current year e.g 2009 : ");
        int h= input.nextInt();
        int age = h-k;
        System.out.println("your age is :" +  age  + " with respect to the year of birth you supplied");
        System.out.println("Thanks for using this little age calculator. Pray you more years in health");
        System.out.println("written: ITUNUOLUWA, VERSION 1.0, DATE: 08-04-2014");
        // TODO code application logic here
    }
}
