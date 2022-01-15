package com.example.chapter10;

import java.util.*;

public class Robot {
    private final String _name;
    private final Position _position = new Position(0, 0);
    private final Direction _direction = new Direction(0, 1);

    public Robot(String name) {
        _name = name;
    }
    public void execute(String commandSequence) {
        StringTokenizer tokenizer = new StringTokenizer(commandSequence);
        try {
            while (tokenizer.hasMoreTokens()) {
                String token = tokenizer.nextToken();
                Command command = Command.parseCommand(token);
                command.execute(this);
            }
        } catch (InvalidCommandException e) {
            System.out.println("Invalid command: " + e.getMessage());
        }
    }
    public void forward() {
        _position.setX(_position.getX() + _direction.getX()).setY(_position.getY() + _direction.getY());
    }
    public void backward() {
        _position.setX(_position.getX() - _direction.getX()).setY(_position.getY() - _direction.getY());
    }
    public void turnRight() {
        int prevX = _direction.getX();
        int prevY = _direction.getY();
        _direction.setX(prevY).setY(prevX);
    }
    public void turnLeft() {
        int prevX = _direction.getX();
        int prevY = _direction.getY();
        _direction.setX(-prevY).setY(prevX);
    }
    public String toString() {
        return "[ Robot: " + _name + " "
            + _position.toString() + ", "
            + _direction.toString() + " ]";
    }
}
