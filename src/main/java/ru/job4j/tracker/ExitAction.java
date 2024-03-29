package ru.job4j.tracker;

public class ExitAction implements UserAction {
    @Override
    public String name() {
        return "Exit Program";
    }

    private final Output out;

    public ExitAction(Output out) {
        this.out = out;
    }

    @Override
    public boolean execute(Input input, Store store) {
        out.println("=== Exit Program ===");
        return false;
    }
}
