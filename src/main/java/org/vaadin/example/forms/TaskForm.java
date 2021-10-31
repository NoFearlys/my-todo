package org.vaadin.example.forms;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class TaskForm extends FormLayout {


    private Button addClientButton = new Button("Новый клиент");
    private ComboBox client = new ComboBox("Клиент");
    private TextField quantity = new TextField("Количество");
    private TextField trackNumber = new TextField("Трек-номер");

    Dialog clientAddForm = new Dialog();
    ClientForm clientForm = new ClientForm();




    private Button save = new Button("Сохранить");
    private Button cancel = new Button("Отмена");

    public TaskForm(){
        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        addClientButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        clientAddForm.add(clientForm);
        addClientButton.addClickListener(event -> clientAddForm.open());
        HorizontalLayout buttons = new HorizontalLayout(save, cancel);

        FormItem clientField = new FormItem(addClientButton, client);


        add(
                clientField,
                quantity,
                trackNumber,
                buttons
        );
    }
}