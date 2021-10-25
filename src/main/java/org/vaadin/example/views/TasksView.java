package org.vaadin.example.views;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import org.vaadin.example.models.Task;

public class TasksView extends VerticalLayout {
    private Grid tasks = new Grid(Task.class);

    public TasksView(){
        tasks.addThemeVariants(GridVariant.LUMO_NO_BORDER, GridVariant.LUMO_NO_ROW_BORDERS, GridVariant.LUMO_ROW_STRIPES);
        add(
                tasks
        );
    }

}
