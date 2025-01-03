package InventoryManagementSystem;

public class DuplicateItemException extends RuntimeException {
    DuplicateItemException(String message) {
        super(message);
    }
}
