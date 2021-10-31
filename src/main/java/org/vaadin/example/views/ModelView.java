package org.vaadin.example.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import org.vaadin.example.forms.ModelForm;
import org.vaadin.example.models.Model;

public class ModelView extends VerticalLayout {
    private Grid tasks = new Grid(Model.class);


    public ModelView(){
        tasks.addThemeVariants(GridVariant.LUMO_NO_BORDER, GridVariant.LUMO_NO_ROW_BORDERS, GridVariant.LUMO_ROW_STRIPES);
        tasks.removeColumnByKey("id");
        Button addModelButton = new Button("Добавить модель");
        Dialog modelAddForm = new Dialog();
        ModelForm modelForm = new ModelForm();
        modelAddForm.add(modelForm);



        addModelButton.addClickListener(event -> modelAddForm.open());
        //tasks.setItems(clientDao.findAll());
        tasks.getColumnByKey("name").setHeader("название");
        tasks.getColumnByKey("version").setHeader("Версия");
        tasks.getColumnByKey("price").setHeader("Цена");
        tasks.getColumnByKey("dataRegister").setHeader("Поле данных");
        tasks.getColumnByKey("dataContent").setHeader("Значение");
        //tasks.setColumns("name", "phone", "city", "address", "model");
        add(
                addModelButton,
                tasks

        );
    }

}