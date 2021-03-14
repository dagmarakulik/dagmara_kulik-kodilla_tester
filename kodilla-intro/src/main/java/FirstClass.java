public class FirstClass {
    public static void main(String[] args) {
        String notebookWeightText = "Notebook weight: ";
        String notebookPriceText = " Notebook price: ";
        String notebookYearText = " Notebook year: ";

        Notebook notebook = new Notebook(800, 1000, 2000);
        System.out.println(notebookWeightText + notebook.weight + notebookPriceText + notebook.price + notebookYearText + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
        notebook.checkPriceYear();

        Notebook heavyNotebook = new Notebook(2000, 2000, 2005);
        System.out.println(notebookWeightText + heavyNotebook.weight + notebookPriceText + heavyNotebook.price + notebookYearText + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();
        heavyNotebook.checkPriceYear();

        Notebook oldNotebook = new Notebook (1200, 1000, 2006);
        System.out.println(notebookWeightText + oldNotebook.weight + notebookPriceText + oldNotebook.price + notebookYearText + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
        oldNotebook.checkPriceYear();

    }
}
