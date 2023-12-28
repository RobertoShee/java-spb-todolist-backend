package com.chrisloarryn.todolistapi.business.dto.responses.get;

import com.chrisloarryn.todolistapi.entities.enums.Priority;
import com.chrisloarryn.todolistapi.entities.enums.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GetAllTodosResponse {
    private String id;
    private String title;
    private String description;
    private Date dueDate;
    private State state;
    private Boolean active;
    private Priority priority;
    private String author;
}
