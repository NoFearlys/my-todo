package org.vaadin.example;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.Route;
import org.vaadin.example.views.ClientsView;
import org.vaadin.example.views.ModelView;
import org.vaadin.example.views.TasksView;

import java.util.HashMap;
import java.util.Map;

@Route("")
public class MainView extends VerticalLayout {

    public MainView() {

        VerticalLayout mainLayout = new VerticalLayout();

        Tab tab1 = new Tab("Задачи");
        VerticalLayout page1 = new TasksView();
        Button addTaskButton = new Button();



        page1.add( addTaskButton);

        Tab tab2 = new Tab("Клиенты");
        VerticalLayout page2 = new ClientsView();

        page2.setVisible(false);

        Tab tab3 = new Tab("Модели");
        VerticalLayout page3 = new ModelView();
        page3.setVisible(false);

        Map<Tab, Component> tabsToPages = new HashMap<>();
        tabsToPages.put(tab1, page1);
        tabsToPages.put(tab2, page2);
        tabsToPages.put(tab3, page3);
        Tabs tabs = new Tabs(tab1, tab2, tab3);
        VerticalLayout pages = new VerticalLayout(page1, page2, page3);
        tabs.setOrientation(Tabs.Orientation.HORIZONTAL);
        tabs.setFlexGrowForEnclosedTabs(100);
        tabs.addSelectedChangeListener(event -> {
            tabsToPages.values().forEach(page -> page.setVisible(false));
            Component selectedPage = tabsToPages.get(tabs.getSelectedTab());
            selectedPage.setVisible(true);
        });

        add(
                tabs,
                pages
        );
    }
}