import java.util.Scanner;

class Main {
  public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);

    // part one
    // // task one

    // float examMark = Integer.parseInt(args[0]);
    // if (examMark >= 17) {
    // System.out.println("Excellent");
    // } else if (examMark >= 15) {
    // System.out.println("Tres bien");
    // } else if (examMark >= 13) {
    // System.out.println("bien");
    // } else if (examMark >= 10) {
    // System.out.println("satisfaisant");
    // } else if (examMark >= 8) {
    // System.out.println("suffisant");
    // } else if (examMark >= 5) {
    // System.out.println("mediocre");
    // } else {
    // System.out.println("insuffisant");
    // }

    // // task two
    // int N = 1;
    // while (N <= 32) {
    // N *= 2;
    // System.out.println(N);
    // }

    // int x = 5;
    // int y = 1;
    // while (x > 0) {
    // x--;
    // y *= x;
    // System.out.println(y);
    // }

    // // task three
    // System.out.println("enter n to calculate the series: ");
    // double n = scan.nextDouble();
    // double totalSum = 0;
    // while (n > 0) {
    // totalSum = totalSum + (1 / n);
    // n--;
    // }
    // System.out.print("the series summ is: " + totalSum);

    // // task four
    // System.out.print("guess a number: ");
    // int guessedNum = scan.nextInt();
    // if (guessedNum == Math.floor(Math.random() * 10)) {
    // System.out.print("guessed correctly");
    // } else if (guessedNum > Math.floor(Math.random() * 10)) {
    // System.out.print("too Low!");
    // } else {
    // System.out.print("too Hight!");
    // }

    // // task five
    // System.out.print("guess a number: ");
    // int guessedNum2 = scan.nextInt();
    // while (guessedNum2 != Math.floor(Math.random() * 10)) {
    // System.out.println("fetching: " + Math.floor(Math.random() * 10));
    // }
    // System.out.println("founded successfuly");

    // task six
    // int tryNum = 0;

    // System.out.print("enter your email: ");
    // String userMail = scan.nextLine();
    // System.out.print("enter your password: ");
    // String userPassword = scan.nextLine();

    // while (tryNum < 2) {
    // if ((userMail != "o.allaoua@esi-sba.dz") && (userPassword != "123")) {
    // // if (tryNum == 0) {
    // // System.out.print("locked for security reasons");
    // // return;
    // // }
    // tryNum++;
    // System.out.println("wrong information try again");
    // System.out.println("attempts left: " + (3 - tryNum));
    // System.out.println("---------");
    // System.out.print("enter your email: ");
    // userMail = scan.nextLine();
    // System.out.print("enter your password: ");
    // userPassword = scan.nextLine();
    // } else {
    // System.out.print("Logged in");
    // }
    // }

    // part two
    // task one
    // System.out.println("welcome to the mini calculator program:");
    // System.out.print("enter the first num: ");
    // int firstNum = scan.nextInt();
    // System.out.print("enter the second num: ");
    // int secondNum = scan.nextInt();
    // System.out.println("choose an operation:");
    // System.out.println("1- +");
    // System.out.println("2- -");
    // System.out.println("3- *");
    // System.out.println("4- /");
    // int operation = scan.nextInt();

    // switch (operation) {
    // case 1:
    // System.out.println(firstNum + secondNum);
    // break;

    // case 2:
    // System.out.println(firstNum - secondNum);
    // break;

    // case 3:
    // System.out.println(firstNum * secondNum);
    // break;

    // case 4:
    // System.out.println(firstNum / secondNum);
    // break;
    // }

    // task two
    // System.out.println("enter your client number");
    // String DjezzyNum = scan.nextLine();

    // while (DjezzyNum != "*444#") {
    // System.out.println("enter your client number correctly");
    // DjezzyNum = scan.nextLine();
    // }

    System.out.println("enter your credit: ");
    int DjezzyCredit = scan.nextInt();
    System.out.println("bienvenu a Imtyaz");
    System.out.println("choose your offer: ");
    System.out.println("4: 190DA: 3GO");
    System.out.println("44: 1500DA: 40GO");
    System.out.println("45: 1200DA: 20GO");
    System.out.println("46: 1000DA: 15GO");
    System.out.println("41: Settings");
    System.out.println("0: Return");
    int DjezzyCodeChosen = scan.nextInt();
    switch (DjezzyCodeChosen) {
      case 4:
        System.out.println(4);
        while (DjezzyCredit < 190) {
          System.out.println("no enough credit to choose the offer choose another offre");
          DjezzyCodeChosen = scan.nextInt();
        }
        System.out.println("perfect, you have 3GO now");
        DjezzyCredit -= 190;
        System.out.println("remaining credit is: " + DjezzyCredit);
        break;

      case 44:
        System.out.println(44);
        while (DjezzyCredit < 1500) {
          System.out.println("no enough credit to choose the offer choose another offre");
          DjezzyCodeChosen = scan.nextInt();
        }
        System.out.println("perfect, you have 40GO now");
        DjezzyCredit -= 1500;
        System.out.println("remaining credit is: " + DjezzyCredit);
        break;

      case 45:
        System.out.println(45);
        while (DjezzyCredit < 1200) {
          System.out.println("no enough credit to choose the offer choose another offre");
          DjezzyCodeChosen = scan.nextInt();
        }
        System.out.println("perfect, you have 20GO now");
        DjezzyCredit -= 1200;
        System.out.println("remaining credit is: " + DjezzyCredit);
        break;

      case 46:
        System.out.println(46);
        while (DjezzyCredit < 190) {
          System.out.println("no enough credit to choose the offer choose another offre");
          DjezzyCodeChosen = scan.nextInt();
        }
        System.out.println("perfect, you have 15GO now");
        DjezzyCredit -= 1000;
        System.out.println("remaining credit is: " + DjezzyCredit);
        break;
    }
  }
}