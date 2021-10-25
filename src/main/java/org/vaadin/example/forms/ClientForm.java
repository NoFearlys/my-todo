package org.vaadin.example.forms;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class ClientForm extends FormLayout {


    private TextField name = new TextField("Имя");
    private TextField phone = new TextField("Телефон");
    private ComboBox city = new ComboBox("Город");
    private TextField address = new TextField("Адрес");
    private ComboBox model = new ComboBox("Модель");

    private Button save = new Button("Сохранить");
    private Button cancel = new Button("Отмена");

    public ClientForm(){
        HorizontalLayout buttons = new HorizontalLayout(save, cancel);

        add(
                name,
                phone,
                city,
                address,
                model,
                buttons
        );
    }
}
