package ru.javarush.golf.anabiullin.module2;

import ru.javarush.golf.anabiullin.module2.land.Land;
import ru.javarush.golf.anabiullin.module2.settings.Settings;

public class Island {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello Island");
        Land land = new Land(Settings.LAND_SIZE_X, Settings.LAND_SIZE_Y);
    }
}
