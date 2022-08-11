package ru.javarush.golf.anabiullin.module2.land;

import ru.javarush.golf.anabiullin.module2.life.Life;
import ru.javarush.golf.anabiullin.module2.life.carnivore.*;
import ru.javarush.golf.anabiullin.module2.life.herbivore.*;
import ru.javarush.golf.anabiullin.module2.life.plant.Plant;
import ru.javarush.golf.anabiullin.module2.settings.Settings;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Cell {
    public final int X;
    public final int Y;
    public final HashMap<String, ArrayList<Life>> inhabitants;

    private void populate() {
        int lifeCount;
        ArrayList<Life> lives;
        //PLANTS
        lifeCount = ThreadLocalRandom.current().nextInt(Settings.CELL_CAPACITY_PLANT);
        lives = new ArrayList<>(lifeCount);
        for (int i = 0; i < lifeCount; i++)
            lives.add(new Plant());
        inhabitants.put("Plant", lives);
        //CARNIVORES
        lifeCount = ThreadLocalRandom.current().nextInt(Settings.CELL_CAPACITY_WOLF);
        lives = new ArrayList<>(lifeCount);
        for (int i = 0; i < lifeCount; i++)
            lives.add(new Wolf());
        inhabitants.put("Wolf", lives);

        lifeCount = ThreadLocalRandom.current().nextInt(Settings.CELL_CAPACITY_FOX);
        lives = new ArrayList<>(lifeCount);
        for (int i = 0; i < lifeCount; i++)
            lives.add(new Fox());
        inhabitants.put("Fox", lives);

        lifeCount = ThreadLocalRandom.current().nextInt(Settings.CELL_CAPACITY_BEAR);
        lives = new ArrayList<>(lifeCount);
        for (int i = 0; i < lifeCount; i++)
            lives.add(new Bear());
        inhabitants.put("Bear", lives);

        lifeCount = ThreadLocalRandom.current().nextInt(Settings.CELL_CAPACITY_BOA);
        for (int i = 0; i < lifeCount; i++)
            lives.add(new Boa());
        inhabitants.put("Boa", lives);

        lifeCount = ThreadLocalRandom.current().nextInt(Settings.CELL_CAPACITY_EAGLE);
        lives = new ArrayList<>(lifeCount);
        for (int i = 0; i < lifeCount; i++)
            lives.add(new Eagle());
        inhabitants.put("Eagle", lives);
        //HERBIVORES
        lifeCount = ThreadLocalRandom.current().nextInt(Settings.CELL_CAPACITY_BOAR);
        lives = new ArrayList<>(lifeCount);
        for (int i = 0; i < lifeCount; i++)
            lives.add(new Boar());
        inhabitants.put("Boar", lives);

        lifeCount = ThreadLocalRandom.current().nextInt(Settings.CELL_CAPACITY_BUFFALO);
        lives = new ArrayList<>(lifeCount);
        for (int i = 0; i < lifeCount; i++)
            lives.add(new Buffalo());
        inhabitants.put("Buffalo", lives);

        lifeCount = ThreadLocalRandom.current().nextInt(Settings.CELL_CAPACITY_CATERPILLAR);
        lives = new ArrayList<>(lifeCount);
        for (int i = 0; i < lifeCount; i++)
            lives.add(new Caterpillar());
        inhabitants.put("Caterpillar", lives);

        lifeCount = ThreadLocalRandom.current().nextInt(Settings.CELL_CAPACITY_DEER);
        lives = new ArrayList<>(lifeCount);
        for (int i = 0; i < lifeCount; i++)
            lives.add(new Deer());
        inhabitants.put("Deer", lives);

        lifeCount = ThreadLocalRandom.current().nextInt(Settings.CELL_CAPACITY_DUCK);
        lives = new ArrayList<>(lifeCount);
        for (int i = 0; i < lifeCount; i++)
            lives.add(new Duck());
        inhabitants.put("Duck", lives);

        lifeCount = ThreadLocalRandom.current().nextInt(Settings.CELL_CAPACITY_GOAT);
        lives = new ArrayList<>(lifeCount);
        for (int i = 0; i < lifeCount; i++)
            lives.add(new Goat());
        inhabitants.put("Goat", lives);

        lifeCount = ThreadLocalRandom.current().nextInt(Settings.CELL_CAPACITY_HORSE);
        lives = new ArrayList<>(lifeCount);
        for (int i = 0; i < lifeCount; i++)
            lives.add(new Horse());
        inhabitants.put("Horse", lives);

        lifeCount = ThreadLocalRandom.current().nextInt(Settings.CELL_CAPACITY_MOUSE);
        lives = new ArrayList<>(lifeCount);
        for (int i = 0; i < lifeCount; i++)
            lives.add(new Mouse());
        inhabitants.put("Mouse", lives);

        lifeCount = ThreadLocalRandom.current().nextInt(Settings.CELL_CAPACITY_RABBIT);
        lives = new ArrayList<>(lifeCount);
        for (int i = 0; i < lifeCount; i++)
            lives.add(new Rabbit());
        inhabitants.put("Rabbit", lives);

        lifeCount = ThreadLocalRandom.current().nextInt(Settings.CELL_CAPACITY_SHEEP);
        lives = new ArrayList<>(lifeCount);
        for (int i = 0; i < lifeCount; i++)
            lives.add(new Sheep());
        inhabitants.put("Sheep", lives);
    }

    public Cell(int x, int y) {
        X = x;
        Y = y;
        System.out.printf("Cell coords (%d, %d)\n", X, Y);
        inhabitants = new HashMap<String, ArrayList<Life>>();
        populate();
        for (Map.Entry<String, ArrayList<Life>> e : inhabitants.entrySet()
             ) {
            System.out.println(e.getKey() + " " + e.getValue().size());
        }
    }
}

