package POne;


public class DanceDisplay extends Grandpa{

    public static void main(String[] args) {
        // Create an instance of the Grandpa class
        Grandpa grandpa = new Grandpa();
        
        // Search for dances by year
        int searchYear = 1975; // Example year to search for
        String[] dancesByYear = grandpa.privateDanceAccess(searchYear);
        
        // Print the dances found for the year
        System.out.println("Dances for year " + searchYear + ":");
        for (String dance : dancesByYear) {
            System.out.println(dance);
        }
        
        // Search for dances by genre
        String searchGenre = "rock"; // Example genre to search for
        String[] dancesByGenre = grandpa.privateDanceAccess(searchGenre);
        
        // Print the dances found for the genre
        System.out.println("\nDances for genre '" + searchGenre + "':");
        for (String dance : dancesByGenre) {
            System.out.println(dance);
        }
    }
}