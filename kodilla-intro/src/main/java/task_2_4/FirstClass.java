package task_2_4;

public class FirstClass {
    public static void main(String[] args) {
        String notebookWeightText = "Notebook weight: ";
        String notebookPriceText = " Notebook price: ";
        String notebookYearText = " Notebook year: ";

        Notebook notebook = new Notebook(800, 1000, 2000);
        System.out.println(notebookWeightText + notebook.getWeight() + notebookPriceText + notebook.getPrice() + notebookYearText + notebook.getYear());
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
        notebook.checkPriceYear();

        Notebook heavyNotebook = new Notebook(2000, 2000, 2005);
        System.out.println(notebookWeightText + heavyNotebook.getWeight() + notebookPriceText + heavyNotebook.getPrice() + notebookYearText + heavyNotebook.getYear());
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();
        heavyNotebook.checkPriceYear();

        Notebook oldNotebook = new Notebook (1200, 1000, 2006);
        System.out.println(notebookWeightText + oldNotebook.getWeight() + notebookPriceText + oldNotebook.getPrice() + notebookYearText + oldNotebook.getYear());
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
        oldNotebook.checkPriceYear();

        Grades grades = new Grades();
        grades.add(4);
        grades.add(5);
        int last = grades.checkLastAddedGrade();
        double average = grades.calculateAverageGrade();
        System.out.println("Last: " + last);
        System.out.println("Average: " + average);
    }
}
