package org.example;

public class Wall extends Obstacle{
    public int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean pass(Creature creature1) {
        return creature1.jump(height);
    }
}
