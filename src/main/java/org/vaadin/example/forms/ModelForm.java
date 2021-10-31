package org.vaadin.example.forms;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class ModelForm extends FormLayout {


    private TextField name = new TextField("Название");
    private TextField version = new TextField("Версия");
    private TextField price = new TextField("Цена");
    private TextField dataRegister = new TextField("Поле данных");
    private TextField dataContent = new TextField("Значение");

    private Button save = new Button("Сохранить");
    private Button cancel = new Button("Отмена");

    public ModelForm(){
        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        HorizontalLayout buttons = new HorizontalLayout(save, cancel);

        add(
                name,
                version,
                price,
                dataRegister,
                dataContent,
                buttons
        );
    }
}