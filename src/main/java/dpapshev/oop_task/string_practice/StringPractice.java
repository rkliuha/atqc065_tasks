package dpapshev.oop_task.string_practice;


public class StringPractice {
    public static void main(String[] args) {
        final StringPractice practiceWithStrings = new StringPractice();
        practiceWithStrings.printRandomStrings();
        practiceWithStrings.letterCounter("a");
        practiceWithStrings.printLetterCounter();
        practiceWithStrings.addStrings();
        practiceWithStrings.printCombinedStrings();
        practiceWithStrings.replaceVowels();
        practiceWithStrings.printStringWithoutVowels();
        practiceWithStrings.countQuestions();
        practiceWithStrings.printQuestionsQuantity();

    }

    private final String text = "Grabbing the pinch and holding his body tight to the wall," +
            " Mikey danced his feet up and stabbed" +
            " for a crimpy ear of granite. A thousand feet of plutonic rock on Yosemite’s" +
            " Middle Cathedral swept out below him" +
            " as he fought for the first free ascent of the foot Father ";

    private int letterCounter = 0;
    private int questionsCounter = 0;
    private String randomStrings[] = text.split(" ");    //an array of 50 Strings. Maybe I needed to do a separate method?
    private String combinedStrings = randomStrings[0];
    private String stringWithoutVowels;

    private void printRandomStrings() {
        for (int i = 0; i < randomStrings.length; i++) {
            System.out.println(randomStrings[i]);
        }
    }

    // Count the number of strings that have “a” in them
    private void letterCounter(final String letter) {
        boolean stringContainsLetter;
        for (int i = 0; i < randomStrings.length; i++) {
            stringContainsLetter = randomStrings[i].contains(letter);
            if (stringContainsLetter) {
                letterCounter++;
            }
        }
    }

    private void printLetterCounter() {
        System.out.println("Numbers of Strings contains a = " + letterCounter);
    }

    //Combine all the strings from the randomStrings array into one string
    private void addStrings() {
        for (int i = 1; i < 50; i++) {
            combinedStrings = combinedStrings.concat(randomStrings[i]);
        }
    }

    private void printCombinedStrings() {
        System.out.println(combinedStrings);
    }

    // Replace all vowels (u, i, o, a, y, e) with question marks
    private void replaceVowels() {
        stringWithoutVowels = combinedStrings.replaceAll("[aeiouy]", "?");
    }

    private void printStringWithoutVowels() {
        System.out.println(stringWithoutVowels);
    }

    //Count question marks number
    private void countQuestions() {
        for (int i = 0; i < stringWithoutVowels.toCharArray().length; i++) {
            if (stringWithoutVowels.toCharArray()[i] == '?') {
                questionsCounter++;
            }
        }
    }

    private void printQuestionsQuantity() {
        System.out.println(questionsCounter);
    }
}

