
package com.company.classWork7;
import com.company.classWork7.*;
public class Book {
     private int inventoryNumber;

    public Book(int inventoryNumber, String title, String autor, String content) {
        setInventoryNumber(inventoryNumber);
        Title.setTitle(title);
        Autor.setNameAutor(autor);
        Content.setText(content);
    }

    public int getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(int inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    @Override
    public String toString() {
        return "Book:" +
                "\n Инвентарный номер: " + inventoryNumber +
                "\n Описание: "+ Title.getTitle()+"\n Автор книги: "+ Autor.getNameAutor()+"\n Кратное содержание: "+Content.getText();
    }
}
