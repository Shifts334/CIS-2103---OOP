/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POne;

import PTwo.Dances;
import java.util.ArrayList;
import java.util.List;

public class Grandpa extends Dances {
    
    // Method to find dances based on year
    private String[] dance(int year) {
        String[][] danceList = getDanceList();
        List<String> foundDances = new ArrayList<>();
        
        for (int i = 0; i < danceList[0].length; i++) {
            // Check if the year matches the element in the first row
            if (danceList[0][i].equals(String.valueOf(year))) {
                foundDances.add(danceList[1][i]); // Add the corresponding dance from the second row
            }
        }
        
        // Convert the list to an array and return
        return foundDances.toArray(new String[0]);
    }
    
    // Method to find dances based on genre
    private String[] dance(String genre) {
        String[][] danceList = getDanceList();
        List<String> foundDances = new ArrayList<>();
        
        for (int i = 0; i < danceList[0].length; i++) {
            // Check if the genre matches the element in the first row
            if (danceList[0][i].equalsIgnoreCase(genre)) {
                foundDances.add(danceList[1][i]); // Add the corresponding dance from the second row
            }
        }
        
        // Convert the list to an array and return
        return foundDances.toArray(new String[0]);
    }

    // Method with package-private access to find dances based on genre
    String[] privateDanceAccess(String genre) {
        return dance(genre); // Reuse the private method
    }
    
    // Method with package-private access to find dances based on year
    String[] privateDanceAccess(int year) {
        return dance(year); // Reuse the private method
    }
}
