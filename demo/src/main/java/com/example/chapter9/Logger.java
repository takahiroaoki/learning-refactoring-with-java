package com.example.chapter9;

public class Logger {
    private enum State {
        STOPPED {
            @Override
            public void start() {
                System.out.println("** START LOGGING **");
            }
    
            @Override
            public void stop() {
                return;
            }
    
            @Override
            public void log(String info) {
                System.out.println("Ignoring: " + info);
            }
        },
        LOGGING {
            @Override
            public void start() {
                return;
            }
    
            @Override
            public void stop() {
                System.out.println("** STOP LOGGING **");
            }
    
            @Override
            public void log(String info) {
                System.out.println("Logging: " + info);
            }
        };
        public abstract void start();
        public abstract void stop();
        public abstract void log(String info);
    }

    private State _state;
    
    public Logger() {
        setState(State.STOPPED);
    }

    public void start() {
        _state.start();
        setState(State.LOGGING);
    }

    public void stop() {
        _state.stop();
        setState(State.STOPPED);
    }

    public void log(String info) {
        _state.log(info);
    }

    public void setState(State state) {
        _state = state;
    }
}
