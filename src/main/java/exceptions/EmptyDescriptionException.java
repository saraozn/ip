package exceptions;

public class EmptyDescriptionException extends DukeException {
    public EmptyDescriptionException() {
        super("OOPS!!! The description cannot be empty.");
    }
}
