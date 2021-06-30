package com.codeit.ex2;

import java.util.ArrayList;
import java.util.HashMap;

public class PokeBag {

    private final ArrayList<Pokemon> pokemons = new ArrayList<>();

    public ArrayList<Pokemon> getPokemons(String name) {
        ArrayList<Pokemon> findPoke = new ArrayList<>();
        for(Pokemon data: pokemons){
            if(data.name.equals(name)){
                findPoke.add(data);
            }
        }
        return findPoke;
    }

    public void add(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    public Pokemon getStrongest(String name) {
        ArrayList<Pokemon> nameList = new ArrayList<>();
        if (name!=null){
            for(Pokemon data: pokemons){
                if(data.name.equals(name)){
                    nameList.add(data);
                }
            }
        }
        else{
            nameList=pokemons;
        }
        if(nameList.size()!=0){
            Pokemon strongest = new Pokemon(name,nameList.get(0).cp);
            for(Pokemon data: nameList){
                if(strongest.cp<data.cp){
                    strongest = data;
                }
            }
            return strongest;
        }
        else return null;

    }

    public Pokemon getStrongest() {
        return getStrongest(null);
    }

}
