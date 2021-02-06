package service;

import entity.Cup;
import repo.CupRepo;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceCup {
    private CupRepo cupRepo;
    private Scanner in;
    public ServiceCup(){
        cupRepo = new CupRepo();
    }

    public void addCup(Cup cup){
        cupRepo.add(cup);
    }

    public void getAllCups(){
        ArrayList<Cup> cups = cupRepo.getAll();
        for(Cup cup : cups){
            System.out.println(cup.getPrice());
        }
    }

    public Cup searchCupByPrice(int getWhoresNameFromConsole) {
        int price = getWhoresNameFromConsole;
        ArrayList<Cup> cupsFromRepo = cupRepo.getAll();
        if(!cupsFromRepo.isEmpty()){
            for(Cup cup: cupsFromRepo){
                if(price == cup.getPrice()){
                    return cup;
                }
            }
        }
        return null;
    }

    public void removeCup(Cup cup) {
        cupRepo.remove(cup);
    }
}
