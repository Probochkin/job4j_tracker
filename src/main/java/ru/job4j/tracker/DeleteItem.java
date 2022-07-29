package ru.job4j.tracker;

public class DeleteItem implements UserAction {

    private final Output out;

    public DeleteItem(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Store store) {
        int id = Integer.parseInt(input.askStr("Enter id: "));
        if (store.delete(id)) {
            System.out.println("Заявка удалена успешно.");
        } else {
            System.out.println("Ошибка удаления заявки.");
        }
        return true;
    }
}
