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
        float spice = input.nextFloat();
        float spiceValue = (float)((4.0/3)*Math.pow(2, Math.sqrt(5)/Math.pow(spice, 3)));
        System.out.println("Well " + userName + ", the spice value resulted in " + spiceValue);
        System.out.println("And the converted value is " + ((int)(spiceValue*100)/100.0));
        calcWallPaint();
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
        int wallArea = (int)(wallHeight * wallWidth);
        System.out.println("Wall area: " + (double)wallArea + " square feet");

        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall
        double paintNeeded = wallArea / squareFeetPerGallons;
        System.out.printf("Paint needed: %.2f gallons\n", paintNeeded);

        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
        System.out.println("Cans needed: " + (int)Math.ceil(paintNeeded/gallonsPerCan) + " can(s)");

    }
}
