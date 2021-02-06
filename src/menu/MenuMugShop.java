package menu;

import characteristics.Colour;
import entity.Cup;
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
        System.out.println("3) Найти кружку по цене");
        System.out.println("4) Купить кружку");
        System.out.println("0) Покинуть это пиздатое заведение");
        int userChoice = in.nextInt();
        if(userChoice == 0){
            return;
        }
        if(userChoice == 1){
            service.addCup(dataCirclesFromUser());
        }
        if(userChoice == 2){
            service.getAllCups();
        }
        if(userChoice == 3){
            Cup cup = service.searchCupByPrice(getWhoresNameFromConsole());
            System.out.println(cup.getPrice());
        }
        if(userChoice == 4){
            Cup cup = service.searchCupByPrice(getWhoresNameFromConsole());
            service.removeCup(cup);
        }


        printSrviceMenu();
    }

    private Cup dataCirclesFromUser() {
        Cup cup = new Cup();
        System.out.println("Укажите цвет кружки: ");
        Colour color = new Colour(in.next());
        cup.setColor(color);
        System.out.println("Укажите стоимость кружки: ");
        cup.setPrice(in.nextInt());
        System.out.println("Укажите её объём: ");
        cup.setVolume(in.nextInt());
        return cup;
    }

    private int getWhoresNameFromConsole() {
        System.out.println("Введите цену кружки: ");
        in = new Scanner(System.in);
        return in.nextInt();
    }
}
