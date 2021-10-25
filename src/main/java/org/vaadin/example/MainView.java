package org.vaadin.example;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.Route;
import org.vaadin.example.forms.ClientForm;

@Route("")
public class MainView extends VerticalLayout {

    public MainView() {

        VerticalLayout mainLayout = new VerticalLayout();
        Tabs tabs = new Tabs();
        tabs.setOrientation(Tabs.Orientation.HORIZONTAL);
        tabs.setFlexGrowForEnclosedTabs(100);

        tabs.add(new Tab("Задачи"));
        tabs.add(new Tab("Клиенты"));
        tabs.add(new Tab("Аппараты"));
        tabs.add(new Tab("Города"));


        Button button = new Button("Кнопка");
        ClientForm form1 = new ClientForm();

        Dialog dialog = new Dialog();
        dialog.add(form1);

        dialog.setWidth("800px");
        dialog.setHeight("500px");

        button.addClickListener(event -> dialog.open());


        add(
                tabs,
                button
        );
    }
}