package dpapshev.oop_task;


class Test {
    public static void main(String[] args) {

        Employee max = new HourRateEmployee("Max", "male", 12, 34);
        Employee bob = new FixedSalaryEmployee("Bob", "male", 10);
        bob.printSalary();
        max.printSalary();


        StringPractice b = new StringPractice();
        b.printRandomStrings();
        b.letterCounter();
        b.printLetterCounter();
        b.addStrings();
        b.printCombinedStrings();
        b.replaceVowels();
        b.printStringWithoutVowels();
        b.countQuestions();
        b.printQuestionsQuantity();
    }
}
