package task;

/**
 * Handles Todo Task with description.
 */
public class Todo extends Task {

    public Todo(String description) {
        super(description);
    }

    @Override
    public String getType() {
        return "T";
    }

    @Override
    public String toString() {
        return "[T]"  + super.toString();
    }
}
