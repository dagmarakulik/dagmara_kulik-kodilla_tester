public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("This notebook is very light");
        } else if (this.weight >= 700 && this.weight <= 1200) {
            System.out.println("This notebook is not very heavy");
        } else {
            System.out.println("This notebook is very heavy");
        }
    }

    public void checkYear() {
        if (this.year < 2005) {
            System.out.println("This notebook is old");
        } else if (this.year >= 2005 && this.year <= 2015) {
            System.out.println("This notebook is not very old");
        } else {
            System.out.println("This notebook is quite new");
        }
    }

    public void checkPriceYear() {
        if (this.year < 2000 && this.price < 600) {
            System.out.println("This notebook is very old and very cheap");
        } else if (this.year >= 2000 && this.year < 2010 && this.price >= 600 && this.price < 1000) {
            System.out.println("This notebook is quite old and quite cheap");
        } else if (this.year >= 2010 && this.year < 2015 && this.price >=1000 && this.price <2000) {
            System.out.println("This notebook is not very old and not very expensive");
        } else if (this.year >= 2015 && this.year < 2018 && this.price >=2000 && this.price <3000) {
            System.out.println("This notebook is quite new and quite expensive");
        } else if (this.year >= 2018 && this.price >= 3000) {
            System.out.println("This notebook is new and expensive");
        } else {
            System.out.println("Based on the collected data it is impossible to define features of this notebook");
        }
    }
}

