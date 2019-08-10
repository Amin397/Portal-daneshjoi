package com.example.portaldaneshjo.Model;

public class RecyclerItem_Entekhabvahed {

    String name ;
    int vahed ;

    public RecyclerItem_Entekhabvahed(String name, int vahed) {
        this.name = name;
        this.vahed = vahed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVahed() {
        return vahed;
    }

    public void setVahed(int vahed) {
        this.vahed = vahed;
    }
}
