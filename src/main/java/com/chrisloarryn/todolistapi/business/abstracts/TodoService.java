package com.chrisloarryn.todolistapi.business.abstracts;

import com.chrisloarryn.todolistapi.business.dto.requests.create.CreateTodoRequest;
import com.chrisloarryn.todolistapi.business.dto.requests.update.UpdateTodoRequest;
import com.chrisloarryn.todolistapi.business.dto.responses.create.CreateTodoResponse;
import com.chrisloarryn.todolistapi.business.dto.responses.get.GetAllTodosResponse;
import com.chrisloarryn.todolistapi.business.dto.responses.get.GetTodoResponse;
import com.chrisloarryn.todolistapi.business.dto.responses.update.UpdateTodoResponse;

import java.util.List;

public interface TodoService {
    List<GetAllTodosResponse> getAll();

    GetTodoResponse getById(String id);

    CreateTodoResponse add(CreateTodoRequest todo);

    UpdateTodoResponse update(String id, UpdateTodoRequest todo);

    void delete(String id);
}
