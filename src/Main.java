import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        // Scanner class ka object banaya
        Scanner scanner = new Scanner(System.in);

        // User se input lene ke liye prompt
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();  // Input ko read karte hain

        // Vowel aur consonant counters initialize karte hain
        int vowelCount = 0;
        int consonantCount = 0;

        // String ke har character ko check karte hain
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);  // Current character ko extract karte hain

            // Vowel check
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelCount++;  // Agar vowel hai, toh count badha denge
            }
            // Consonant check
            else if (Character.isLetter(ch)) {  // Agar alphabetic letter hai
                consonantCount++;  // Agar consonant hai, toh count badha denge
            }
        }

        // Result display karte hain
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }
}

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Scanner class ka object banaya
        Scanner scanner = new Scanner(System.in);

        // User se input lene ke liye prompt
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();  // Input ko read karte hain

        // Empty string to store the reversed string
        String reversed = "";

        // String ko reverse karte hain
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);  // Har character ko reverse order mein add karte hain
        }

        // Reversed string ko print karte hain
        System.out.println("Reversed string: " + reversed);
    }
}

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        // Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // User se string input karwana
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();  // User se input

        // Reversed string ko store karne ke liye empty string
        String reversed = "";

        // String ko reverse karte hain
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);  // Reversed string mein characters ko add karte hain
        }

        // Palindrome check karte hain
        if (input.equals(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // User se string input karwana
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();  // User se input

        // HashSet to store unique characters
        Set<Character> charSet = new HashSet<>();
        StringBuilder result = new StringBuilder(); // To store the final result

        // String ke har character ko loop karte hain
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i); // Character extract karte hain
            if (!charSet.contains(ch)) {  // Agar Set mein nahi hai
                charSet.add(ch);  // Add the character to Set
                result.append(ch);  // Add the character to result
            }
        }

        // Final result display karte hain
        System.out.println("String after removing duplicates: " + result.toString());
    }
}

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        // Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // User se sentence input karwana
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();  // User se input

        // Sentence ko words mein split karte hain
        String[] words = sentence.split(" ");

        // Variables to store the longest word and its length
        String maxWord = "";
        int maxLength = 0;

        // Har word ko loop karte hain
        for (String word : words) {
            if (word.length() > maxLength) {  // Agar current word ka length zyada hai
                maxWord = word;  // Longest word ko update karenge
                maxLength = word.length();  // Longest word ki length ko update karenge
            }
        }

        // Final result ko print karte hain
        System.out.println("The longest word is: " + maxWord);
    }
}

import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        // Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // User se main string aur substring input karwana
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();  // Main string input

        System.out.print("Enter the substring: ");
        String substring = scanner.nextLine();  // Substring input

        // Variable to store the count of substring occurrences
        int count = 0;
        int index = 0;

        // Loop to find all occurrences of the substring
        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++;  // Substring mil gayi, count ko increment karte hain
            index += substring.length();  // Next occurrence ke liye index ko update karte hain
        }

        // Final count ko print karte hain
        System.out.println("The substring occurs " + count + " times.");
    }
}

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        // Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // User se string input karwana
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();  // User se input string

        // StringBuilder object to store the result
        StringBuilder result = new StringBuilder();

        // Loop through the input string
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);  // Current character ko fetch karna

            // Agar character lowercase hai, toh uppercase mein convert karenge
            if (Character.isLowerCase(currentChar)) {
                result.append(Character.toUpperCase(currentChar));
            }
            // Agar character uppercase hai, toh lowercase mein convert karenge
            else if (Character.isUpperCase(currentChar)) {
                result.append(Character.toLowerCase(currentChar));
            }
            // Agar character non-alphabetic hai, toh usko waise hi add karenge
            else {
                result.append(currentChar);
            }
        }

        // Modified string ko print karenge
        System.out.println("Modified string: " + result.toString());
    }
}

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        // Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // User se first string input karwana
        System.out.print("Enter first string: ");
        String string1 = scanner.nextLine();

        // User se second string input karwana
        System.out.print("Enter second string: ");
        String string2 = scanner.nextLine();

        // Compare karte waqt, dono strings ki length check karte hain
        int minLength = Math.min(string1.length(), string2.length());

        // Loop through the characters of both strings
        for (int i = 0; i < minLength; i++) {
            char char1 = string1.charAt(i);  // Pehli string ka i-th character
            char char2 = string2.charAt(i);  // Doosri string ka i-th character

            if (char1 < char2) {
                System.out.println("\"" + string1 + "\" comes before \"" + string2 + "\" in lexicographical order");
                return;  // Agar pehla string chhota hai, toh result print kar do aur program end kar do
            } else if (char1 > char2) {
                System.out.println("\"" + string2 + "\" comes before \"" + string1 + "\" in lexicographical order");
                return;  // Agar doosra string chhota hai, toh result print kar do aur program end kar do
            }
        }

        // Agar ab tak koi difference nahi aaya, toh dono strings same length ki hain aur sabhi characters same hain
        if (string1.length() == string2.length()) {
            System.out.println("Both strings are equal.");
        } else if (string1.length() < string2.length()) {
            System.out.println("\"" + string1 + "\" comes before \"" + string2 + "\" in lexicographical order");
        } else {
            System.out.println("\"" + string2 + "\" comes before \"" + string1 + "\" in lexicographical order");
        }
    }
}

import java.util.Scanner;
import java.util.HashMap;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        // Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // User se string input karwana
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // HashMap to store character frequencies
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);  // Current character

            // Agar character already map mein hai, toh uska frequency increment karenge
            if (frequencyMap.containsKey(ch)) {
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            } else {
                // Agar character pehli baar aa raha hai, toh usko map mein add karenge
                frequencyMap.put(ch, 1);
            }
        }

        // Variables to store the most frequent character and its frequency
        char mostFrequentChar = input.charAt(0);
        int maxFrequency = 1;

        // Iterate through the frequency map to find the character with maximum frequency
        for (char key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);

            // Update most frequent character if current character has higher frequency
            if (frequency > maxFrequency) {
                mostFrequentChar = key;
                maxFrequency = frequency;
            }
        }

        // Print the result
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }
}

import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        // Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // User se string input karwana
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // User se character input karwana jise remove karna hai
        System.out.print("Enter character to remove: ");
        char charToRemove = scanner.next().charAt(0);

        // StringBuilder ka use karke string ko modify karna
        StringBuilder modifiedString = new StringBuilder(input);

        // Loop through each character of the string
        for (int i = 0; i < modifiedString.length(); i++) {
            if (modifiedString.charAt(i) == charToRemove) {
                modifiedString.deleteCharAt(i); // Character ko remove karte hain
                i--; // Hum index ko adjust karenge taaki string shift hone par next character skip na ho
            }
        }

        // Modified string print karte hain
        System.out.println("Modified String: " + modifiedString.toString());
    }
}

import java.util.Scanner;
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        // Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // User se do strings input karwana
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Strings ko character arrays mein convert karna
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        // Arrays ko sort karna
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        // Sorted arrays ko compare karna
        if (Arrays.equals(str1Array, str2Array)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}

public class WordReplace {

    // Method to replace oldWord with newWord in the sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        // Replace the oldWord with the newWord using replace() method
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
        // Sample sentence
        String sentence = "Java is fun and Java is powerful!";

        // Word to be replaced and new word
        String oldWord = "Java";
        String newWord = "Python";

        // Replace word and print result
        String updatedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println(updatedSentence);
    }
}
