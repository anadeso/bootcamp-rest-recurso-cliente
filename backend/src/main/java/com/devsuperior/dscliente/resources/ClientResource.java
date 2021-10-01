package com.devsuperior.dscliente.resources;

import com.devsuperior.dscliente.entities.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

    @GetMapping
    public ResponseEntity<List<Client>> findAll() {
        List<Client> list = new ArrayList<>();
        list.add(new Client(1L, "Ana Maria", "387.000.333-18", 5000d, Instant.parse("1995-10-23T10:12:35Z"), 2));
        list.add(new Client(2L, "Carlos Henrique", "333.000.333-18", 2000d, Instant.parse("1980-02-23T10:50:35Z"), 2));
        return ResponseEntity.ok().body(list);
    }
}
