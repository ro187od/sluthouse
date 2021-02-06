package menu;

import service.ServiceCup;

import java.util.Scanner;

public class MenuMugShop {
    private Scanner in;
    private ServiceCup service;

    public MenuMugShop(){
        in = new Scanner(System.in);
        service = new ServiceCup();
        printMenu();

    }

    private void printMenu() {
        System.out.println("Привет, вы попали в наш магазин кружек.");
        System.out.println("Наши услуги: ");
        printSrviceMenu();
    }

    private void printSrviceMenu() {
        System.out.println("1) Добавить кружку");
        System.out.println("2) Показать все кружки");
        System.out.println("3) Найти кружку по цвету");
        System.out.println("4) Купить кружку");
        System.out.println("5) Вывести кружки по цене");
        System.out.println("0) Покинуть это пиздатое заведение");
        int userChoice = in.nextInt();
//        if(userChoice == 1){
//            service.getCupFromConsole();
//        }
    }
}
