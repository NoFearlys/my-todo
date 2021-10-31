package org.vaadin.example.forms;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class ClientForm extends FormLayout {


    private TextField name = new TextField("Имя");
    private TextField phone = new TextField("Телефон");
    private Button addCityButton = new Button("Добавить город");
    private ComboBox city = new ComboBox("Город");
    private TextField address = new TextField("Адрес");
    private Button addModelButton = new Button("Добавить модель");
    private ComboBox model = new ComboBox("Модель");

    private Button save = new Button("Сохранить");
    private Button cancel = new Button("Отмена");

    Dialog cityAddForm = new Dialog();
    CityForm cityForm = new CityForm();

    Dialog modelAddForm = new Dialog();
    ModelForm modelForm = new ModelForm();

    public ClientForm(){
        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        cityAddForm.add(cityForm);
        addCityButton.addClickListener(event -> cityAddForm.open());

        modelAddForm.add(modelForm);
        addModelButton.addClickListener(event -> modelAddForm.open());

        HorizontalLayout buttons = new HorizontalLayout(save, cancel);

        FormItem cityField = new FormItem(addCityButton, city);
        FormItem modelField = new FormItem(addModelButton, model);
        add(
                name,
                phone,
                cityField,
                address,
                modelField,
                buttons
        );
    }
}
