import java.util.Scanner;

import tp6java.Car;

public class Main {

    static void showOffers(Offer[] OffersTable) {
        for (int i = 0; i < OffersTable.length; i++) {
            System.out
                    .println(i + " " + OffersTable[i].Description + ", price: " + OffersTable[i].Price + ", duration: "
                            + OffersTable[i].Duration);
        }
    }

    public static void main(String[] args) {

        // part one
        // task three
        Person Okba = new Person("Okba", "2002", "24 rue Bt 5001-Oran");
        Person Aek = new Person("Aek", "2012", "29 rue – sba");
        Person Mahmoud = new Person("Mahmoud", "1999", "59 Bt 5000 - Chlef");
        // task four
        Car Picanto = new Car("Peugeut", 2020, "");
        System.out.println(Picanto.remark);
        // task five
        Address Alger = new Address("rue moudjahid", "ouled fayet", 65112,
                "Algeria");
        Student Said = new Student("Said", "0777777777", "said@ddd.com", 15, 18.4,
                Alger);
        Said.showInfo();
        // // task six
        Scanner scan = new Scanner(System.in);
        boolean stop = false;
        int repeatCpt = 0;
        while (!stop) {
            System.out.println("Do you want to create an instance y/n?");
            String answer = scan.nextLine();
            stop = answer.equals("y");
            repeatCpt++;
            Custom instance = new Custom();
            System.out.println("Number of created instances is: " + repeatCpt);
        }
        /// part two
        // task one
        Operator Djezzy = new Operator("Djezzy", 15, "07");
        Operator Mobilis = new Operator("Mobilis", 24, "06");
        Operator Ooredoo = new Operator("Ooredoo", 30, "05");

        Offer DjezzyOne = new Offer(30, "100Mo/new", "24h", Djezzy);
        Offer DjezzyTwo = new Offer(100, "free calls", "24h", Djezzy);
        Offer DjezzyThree = new Offer(200, "free calls + net", "7days", Djezzy);
        Offer DjezzyFour = new Offer(500, "free calls all + net", "15days", Djezzy);
        Offer DjezzyFive = new Offer(1000, "free calls all + net", "1month", Djezzy);
        Offer[] DjezzyOffers = { DjezzyOne, DjezzyTwo, DjezzyThree, DjezzyFour, DjezzyFive };

        Offer MobilisOne = new Offer(40, "200Mo/new", "24h", Mobilis);
        Offer MobilisTwo = new Offer(100, "free calls + net", "24h", Mobilis);
        Offer MobilisThree = new Offer(200, "free calls + 1G", "7days", Mobilis);
        Offer MobilisFour = new Offer(500, "free calls all + net", "15days", Mobilis);
        Offer MobilisFive = new Offer(1000, "free calls all + net", "1month", Mobilis);
        Offer[] MobilisOffers = { MobilisOne, MobilisTwo, MobilisThree, MobilisFour, MobilisFive };

        Offer OoredooOne = new Offer(100, "1G internet", "24h", Ooredoo);
        Offer OoredooTwo = new Offer(200, "free calls + net", "48h", Ooredoo);
        Offer OoredooThree = new Offer(500, "free calls + 10G", "15days", Ooredoo);
        Offer OoredooFour = new Offer(1000, "free calls all + 40G", "1month", Ooredoo);
        Offer OoredooFive = new Offer(3000, "free calls all + net", "2month", Ooredoo);
        Offer[] OoredooOffers = { OoredooOne, OoredooTwo, OoredooThree, OoredooFour, OoredooFive };

        System.out.println("enter your phone nunmber");
        String clientNumber = scan.nextLine();
        System.out.println("enter your credit");
        int clientCredit = scan.nextInt();
        String prefixClientNumber = clientNumber.substring(0, 2);
        Offer[] currentOffers = {};
        if (prefixClientNumber.equals("07")) {
            showOffers(DjezzyOffers);
            currentOffers = DjezzyOffers;
        } else if (prefixClientNumber.equals("06")) {
            showOffers(MobilisOffers);
            currentOffers = MobilisOffers;
        } else {
            showOffers(OoredooOffers);
            currentOffers = OoredooOffers;
        }
        System.out.println("enter your offer?");
        int offerChoosed = scan.nextInt();
        if (clientCredit >= currentOffers[offerChoosed].Price) {
            System.out.println("congratulations offer " +
                    currentOffers[offerChoosed].Description + ", price: "
                    + currentOffers[offerChoosed].Price + "DA" + ", duration: "
                    + currentOffers[offerChoosed].Duration + " has been activated successfuly");
            clientCredit -= currentOffers[offerChoosed].Price;
            System.out.println("you still have now " + clientCredit);
        } else {
            System.out.println("You can't benifit the offer!, no enought credit");
        }
    }
}

class Operator {
    public String commercialName;
    public int numberOfCoverStats;
    public String prefixNumber;

    Operator(String commercialName, int numberOfCoverStats, String prefixNumber) {
        this.commercialName = commercialName;
        this.numberOfCoverStats = numberOfCoverStats;
        this.prefixNumber = prefixNumber;
    }
}

class Offer {
    public int Price;
    public String Description;
    public String Duration;
    public Operator Operator;
    public int Number;

    Offer(int Price, String Description, String Duration, Operator Operator) {
        this.Price = Price;
        this.Description = Description;
        this.Duration = Duration;
        this.Operator = Operator;
    }
}

// part one classes
class Person {
    public String Name;
    public String YearOfJoin;
    public String Address;

    Person(String Name, String YearOfJoin, String Address) {
        this.Name = Name;
        this.Address = Address;
        this.YearOfJoin = YearOfJoin;
    }
}

class Car {
    public String car_type;
    public int year;
    public String remark;

    Car(String carType, int year, String remark) {
        this.car_type = carType;
        this.year = year;
        this.remark = ((this.year < 2019) ? "This car needs scanner verification"
                : "This car doesn't need a scanner verification");
    }

    void showCar() {
        System.out.printf("the car is a " + this.car_type + " mark from the year " + this.year + " and has a remark: "
                + this.remark);
    }

}

class Address {
    public String streetName;
    public String city;
    public int postalCode;
    public String country;

    Address(String streetName, String city, int postalCode, String country) {
        this.streetName = streetName;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }
}

class Student {
    public String Name;
    public String Phone;
    public String Email;
    public int Id;
    public double averageMark;
    public Address Address;

    Student(String Name, String Phone, String Email, int Id, double averageMark, Address Address) {
        this.Name = Name;
        this.Phone = Phone;
        this.Email = Email;
        this.Id = Id;
        this.averageMark = averageMark;
        this.Address = Address;
    }

    void showInfo() {
        System.out.println(this.Name);
        System.out.println(this.Phone);
        System.out.println(this.Email);
        System.out.println(this.Id);
        System.out.println(this.averageMark);
        System.out.println(this.Address.city);
        System.out.println(this.Address.country);
        System.out.println(this.Address.postalCode);
        System.out.println(this.Address.streetName);
    }
}

class Custom {
    static int num;

    Custom() {
        num++;
    }
}
