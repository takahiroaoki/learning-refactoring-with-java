package com.example.chapter10;

import java.util.*;

public abstract class Command {
    public static final Command FORWARD = new Command("forward") {
        @Override
        public void execute(Robot robot) {
            robot.forward();
        }
    };
    public static final Command BACKWARD = new Command("backward") {
        @Override
        public void execute(Robot robot) {
            robot.backward();;
        }
    };
    public static final Command TURN_RIGHT = new Command("right") {
        @Override
        public void execute(Robot robot) {
            robot.turnRight();
        }
    };
    public static final Command TURN_LEFT = new Command("left") {
        @Override
        public void execute(Robot robot) {
            robot.turnLeft();
        }
    };
    private static final Map<String,Command> _commandNameMap = new HashMap<String,Command>();
    static {
        _commandNameMap.put(FORWARD._name, FORWARD);
        _commandNameMap.put(BACKWARD._name, BACKWARD);
        _commandNameMap.put(TURN_RIGHT._name, TURN_RIGHT);
        _commandNameMap.put(TURN_LEFT._name, TURN_LEFT);
    }
    private final String _name;
    private Command(String name) {
        _name = name;
    }
    public abstract void execute(Robot robot);
    public static Command parseCommand(String name) throws InvalidCommandException {
        if (!_commandNameMap.containsKey(name)) {
            throw new InvalidCommandException(name);
        }
        return _commandNameMap.get(name);
    }
}
