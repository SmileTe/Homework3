public class Main {
    public static void main(String[] args) {


        Exercise1(false);
        Exercise2(true, 2055);
        Exercise3(2003);
        Exercise4(95);
        Exercise5(3);
    }

    //Задание 1
    public static void Exercise1(boolean ClientType) {
     //boolean ClientType = Type == "iOS";
     if (ClientType) {
         System.out.println("Установите версию приложения для iOS по ссылке");
     }
     else
         System.out.println("Установите версию приложения для Android по ссылке");
    }


    //Задание 2
    public static void Exercise2(boolean ClientType, int clientDeviceYear) {

        if (ClientType&&clientDeviceYear <2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else if  (ClientType){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientDeviceYear<2015)
        {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else
            System.out.println("Установите версию приложения для Android по ссылке");
    }

    //Задание 3
    public static void Exercise3( int NumberYear) {
        if (NumberYear%400==0){
            System.out.println("Год является високосным!");
        }
        else if (NumberYear%100==0){
            System.out.println("Год не является високосным!");
        }
        else if (NumberYear%4==0){
            System.out.println("Год является високосным!");

        }
        else
            System.out.println("Год не является високосным!");

    }

    //Задание 4
    public static void Exercise4( int deliveryDistance) {
    //Доставка в пределах 20 км занимает сутки.
    //Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
    //Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
    byte Days = 0;
    boolean Maximum = deliveryDistance >=60;
    boolean Average = deliveryDistance >=20;
    boolean Minimum = deliveryDistance >0;
    if (Minimum) {
        Days += 1;
    }
    if (Average) {
        Days += 1;
    }
    if (Maximum) {
                Days += 1;
    }
    System.out.println("Потребуется дней: " + Days);
    }

    public static void Exercise5(int monthNumber) {
      switch (monthNumber) {
          case 1:
              System.out.println("Зима");
              break;
          case 2:
              System.out.println("Зима");
              break;
          case 3:
              System.out.println("Весна");
              break;
          case 4:
              System.out.println("Весна");
              break;
          case 5:
              System.out.println("Весна");
              break;
          case 6:
              System.out.println("Лето");
              break;
          case 7:
              System.out.println("Лето");
              break;
          case 8:
              System.out.println("Лето");
              break;
          case 9:
              System.out.println("Осень");
              break;
          case 10:
              System.out.println("Осень");
              break;
          case 11:
              System.out.println("Осень");
              break;
          case 12:
              System.out.println("Зима");
              break;
          default:
              System.out.println("Такого меcяца не существует");

      }



    }



}

