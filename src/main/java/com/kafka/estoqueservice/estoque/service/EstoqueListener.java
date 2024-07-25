package com.kafka.estoqueservice.estoque.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EstoqueListener {

    @KafkaListener(topics = "estoque-topico", groupId = "estoque-group")
    public void processarVendar(String mensagem) {
        // lógica para atualizar o estoque
        System.out.println("Venda recebida: " + mensagem);
    }
}
