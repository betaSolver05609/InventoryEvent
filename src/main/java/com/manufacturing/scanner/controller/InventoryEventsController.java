package com.manufacturing.scanner.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.manufacturing.scanner.domain.InventoryEvent;
import com.manufacturing.scanner.producer.InventoryEventProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryEventsController {
    @Autowired
    InventoryEventProducer inventoryEventProducer;
    @PostMapping("/v1/inventoryevent")
    public ResponseEntity<InventoryEvent> postInventoryEvent(@RequestBody InventoryEvent inventoryEvent) throws JsonProcessingException {
        inventoryEventProducer.sendInventoryEvent(inventoryEvent);
        return ResponseEntity.status(HttpStatus.CREATED).body(inventoryEvent);
    }
}
