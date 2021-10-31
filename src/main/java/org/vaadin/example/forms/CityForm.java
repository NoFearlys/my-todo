package org.vaadin.example.forms;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.vaadin.example.models.services.CityServiceImpl;

public class CityForm extends FormLayout {

    @Autowired
    CityServiceImpl cityService;

    private TextField name = new TextField("Название");

    private Button save = new Button("Сохранить");
    private Button cancel = new Button("Отмена");


    public CityForm(){
        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        save.addClickListener(buttonClickEvent -> {
            cityService.addCity(name.getValue());

        });
        HorizontalLayout buttons = new HorizontalLayout(save, cancel);

        add(
                name,
                buttons
        );
    }
}