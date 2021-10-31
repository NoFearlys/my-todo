package org.vaadin.example.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import org.vaadin.example.forms.CityForm;
import org.vaadin.example.models.City;

public class CityView extends VerticalLayout {
    private Grid tasks = new Grid(City.class);

    public CityView(){
        tasks.addThemeVariants(GridVariant.LUMO_NO_BORDER, GridVariant.LUMO_NO_ROW_BORDERS, GridVariant.LUMO_ROW_STRIPES);
        tasks.removeColumnByKey("id");
        Button addCityButton = new Button("Добавить город");
        Dialog cityAddForm = new Dialog();
        CityForm cityForm = new CityForm();
        cityAddForm.add(cityForm);

        addCityButton.addClickListener(event -> cityAddForm.open());

        //tasks.setItems(clientDao.findAll());
        tasks.getColumnByKey("name").setHeader("Имя");



        add(
                addCityButton,
                tasks
        );
    }

}