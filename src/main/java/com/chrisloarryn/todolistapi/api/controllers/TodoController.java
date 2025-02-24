package com.chrisloarryn.todolistapi.api.controllers;

import com.chrisloarryn.todolistapi.business.abstracts.TodoService;
import com.chrisloarryn.todolistapi.business.dto.requests.create.CreateTodoRequest;
import com.chrisloarryn.todolistapi.business.dto.requests.update.UpdateTodoRequest;
import com.chrisloarryn.todolistapi.business.dto.responses.create.CreateTodoResponse;
import com.chrisloarryn.todolistapi.business.dto.responses.get.GetAllTodosResponse;
import com.chrisloarryn.todolistapi.business.dto.responses.get.GetTodoResponse;
import com.chrisloarryn.todolistapi.business.dto.responses.update.UpdateTodoResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/todos")
public class TodoController {
    @Autowired
    private TodoService service;

    @GetMapping
    public List<GetAllTodosResponse> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public GetTodoResponse getById(@PathVariable String id) {
        return service.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateTodoResponse add(@Valid @RequestBody CreateTodoRequest request) throws InterruptedException {
        return service.add(request);
    }

    @PutMapping("/{id}")
    public UpdateTodoResponse update(@PathVariable String id, @Valid @RequestBody UpdateTodoRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
