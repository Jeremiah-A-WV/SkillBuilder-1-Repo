import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        String userName = input.nextLine();
        System.out.println("Enter a floating-point number:");
        Float spice = input.nextFloat();
        System.out.println("Well " + userName + ", the spice value resulted in " + (4.0/3.0)*Math.pow(2.0, Math.sqrt(5)/Math.pow(spice, 3)));
        System.out.println("And the converted value is ");
    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        // TODO: Calculate and output the wall's area

        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall

        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
    }
}
