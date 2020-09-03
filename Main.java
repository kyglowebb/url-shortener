package kyleewebb;

// Java program that takes in user input, stores as int id,
// and converts int id into a shortened url.

import java.util.*; 
import java.lang.*; 
import java.io.*;
import java.util.Scanner; 

public class Main
{ 
	// Generates a short url from integer ID/hash code 
	static String idToShortURL(int n) 
	{ 
		// Map to store 62 possible characters 
		char map[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray(); 
	
		// Creates string buffer
		StringBuffer shorturl = new StringBuffer(); 
	
		// Convert given integer id to a base 62 number 
		while (n > 0) { 
			// Converts hash to base 62 shortened url from map[]
			shorturl.append(map[n % 62]); 
			n = n / 62; 
		} 
		// Reverse shortURL to complete base conversion 
		return shorturl.reverse().toString(); 
		
	} 
	
	static void promptA() {
		System.out.println("Please enter the url you would like to have shortened: ");
	}
	
	static void promptB() {
		System.out.println("Please re-enter to verify correct url: ");
	}
	
	public static void main (String[] args) throws IOException 
	{ 
		Scanner scanner = new Scanner(System.in);
		
		int counter = 0;
		 while (counter <= 9) {
			promptA();
			String url = scanner.next();							
			promptB();
			String shortUrl = scanner.next();
			// Close scanner
			//scanner.close();
			
			// Create a hash code for the string entered by user
			int hash_code = (shortUrl.hashCode() & 0xfffffff);		// Make sure hash is positive for method


	        // Display the string id/hash code
	        System.out.println("The string id for " + shortUrl + " is " + hash_code);		
			System.out.println("Your original url was: " + url);
			
			// Set n equal to unique string id/hash
			int n = hash_code; 
			
			// Pass n into idToShortURL
			String shorturl = idToShortURL(n); 
			
			// Output onto screen shortened url 
			System.out.println("The generated short url is " + shorturl + ".io\n"); 
			
			 counter++;
	            if (counter > 9) {
	                System.out.println("You have exceeded the amount of tries possible, goodbye. ");
	                break;
	            }
	            
	        }
	} 
} 

