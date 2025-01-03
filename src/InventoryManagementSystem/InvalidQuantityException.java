package InventoryManagementSystem;

public class InvalidQuantityException extends Exception{
    InvalidQuantityException(String message){
        super(message);
    }
}
