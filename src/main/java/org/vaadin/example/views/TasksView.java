package org.vaadin.example.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import org.vaadin.example.forms.TaskForm;
import org.vaadin.example.models.DAO.TaskDao;
import org.vaadin.example.models.Task;

public class TasksView extends VerticalLayout {
    private Grid tasks = new Grid(Task.class);

    TaskDao taskDao;

    public TasksView(){
        tasks.addThemeVariants(GridVariant.LUMO_NO_BORDER, GridVariant.LUMO_NO_ROW_BORDERS, GridVariant.LUMO_ROW_STRIPES);
        tasks.removeColumnByKey("id");
        Button addTaskButton = new Button("Добавить задачу");
        Dialog taskAddForm = new Dialog();
        TaskForm taskForm = new TaskForm();
        taskAddForm.add(taskForm);

        addTaskButton.addClickListener(event -> taskAddForm.open());

        //tasks.setItems(taskDao.findAll());
        tasks.getColumnByKey("client").setHeader("Клиент");
        tasks.getColumnByKey("quantity").setHeader("Количество");
        tasks.getColumnByKey("trackNumber").setHeader("Трек-номер");
        tasks.getColumnByKey("trackNumberOut").setHeader("Исходящий трек-номер");
        tasks.getColumnByKey("status").setHeader("Статус");

        add(
                addTaskButton,
                tasks
        );
    }

}
