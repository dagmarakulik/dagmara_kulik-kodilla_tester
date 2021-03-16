public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;

    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public void checkLastAddedGrade() {
        if (this.size == 0) {
            System.out.println("Grades table is empty");
        } else {
            System.out.println("Last added grade: " + this.grades[this.size - 1]);
        }
    }

    public void calculateAverageGrade() {
        double sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += this.grades[i] ;
        }
        System.out.println("Average is " + sum/size);
    }
}
