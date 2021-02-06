package repo;

import entity.Cup;

import java.util.ArrayList;

public class CupRepo {
    private ArrayList<Cup> cups;

    public CupRepo() {
        this.cups = new ArrayList<>();
    }

    public void add(Cup cup){
        this.cups.add(cup);

    }
    public ArrayList<Cup> getAll(){
        return cups;
    }

    public void remove(Cup cup) {
        this.cups.remove(cup);
    }
}
