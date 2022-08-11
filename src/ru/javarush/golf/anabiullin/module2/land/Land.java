package ru.javarush.golf.anabiullin.module2.land;

public class Land {
    public Cell[][] cells;

    public Land(int x, int y) {
        cells = new Cell[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                cells[i][j] = new Cell(i, j);
            }
        }
    }
}
