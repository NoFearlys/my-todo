package org.vaadin.example.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import org.vaadin.example.forms.ClientForm;
import org.vaadin.example.models.Client;

public class ClientsView extends VerticalLayout {
    private Grid tasks = new Grid(Client.class);

    public ClientsView(){
        tasks.addThemeVariants(GridVariant.LUMO_NO_BORDER, GridVariant.LUMO_NO_ROW_BORDERS, GridVariant.LUMO_ROW_STRIPES);
        tasks.removeColumnByKey("id");
        Button addClientButton = new Button("Добавить клиента");
        Dialog clientAddForm = new Dialog();
        ClientForm clientForm = new ClientForm();
        clientAddForm.add(clientForm);

        addClientButton.addClickListener(event -> clientAddForm.open());

        //tasks.setItems(clientDao.findAll());
        tasks.getColumnByKey("name").setHeader("Имя");
        tasks.getColumnByKey("city").setHeader("Город");
        tasks.getColumnByKey("address").setHeader("Адресс");
        tasks.getColumnByKey("model").setHeader("Модель");
        tasks.getColumnByKey("phone").setHeader("Телефон");

        add(
                addClientButton,
                tasks
        );
    }

}