package org.example;

public class Road extends Obstacle{
    public int distance;

    public Road(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean pass(Creature creature1) {
        return creature1.run(distance);
    }
}


