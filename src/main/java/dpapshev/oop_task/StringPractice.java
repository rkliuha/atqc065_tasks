package dpapshev.oop_task;


public class StringPractice {

    private String text = new String("Grabbing the pinch and holding his body tight to the wall, Mikey danced his feet up and stabbed" +
            " for a crimpy ear of granite. A thousand feet of plutonic rock on Yosemite’s Middle Cathedral swept out below him" +
            " as he fought for the first free ascent of the foot Father ");

    private int aCounter = 0;
    private int questionsCounter = 0;
    private String randomStrings[] = text.split(" ");    //an array of 50 Strings. Maybe I needed to do a separate method?
    private String combinedStrings = randomStrings[0];
    private String stringWithoutVowels;

    public void printRandomStrings() {
        for (int i = 0; i < randomStrings.length; i++) {
            System.out.println(randomStrings[i]);
        }
    }

    // Count the number of string that have “a” in them
    public void letterCounter() {
        boolean a;
        for (int i = 0; i < randomStrings.length; i++) {
            a = randomStrings[i].contains("a");
            if (a == true) {
                aCounter++;
            }
        }
    }

    public void printLetterCounter() {
        System.out.println("Numbers of Strings contains a = " + aCounter);
    }

    //Combine all the strings from the randomStrings array into one string
    public void addStrings() {
        for (int i = 1; i < 50; i++) {
            combinedStrings = combinedStrings.concat(randomStrings[i]);
        }
    }

    public void printCombinedStrings() {
        System.out.println(combinedStrings);
    }

    // Replace all vowels (u, i, o, a, y, e) with question marks
    public void replaceVowels() {
        stringWithoutVowels = combinedStrings.replaceAll("[aeiouy]", "?");
    }

    public void printStringWithoutVowels() {
        System.out.println(stringWithoutVowels);
    }

    //Count question marks number
    public void countQuestions() {
        for (int i = 0; i < stringWithoutVowels.toCharArray().length; i++) {
            if (stringWithoutVowels.toCharArray()[i] == '?') {
                questionsCounter++;
            }
        }
    }

    public void printQuestionsQuantity() {
        System.out.println(questionsCounter);
    }
}

