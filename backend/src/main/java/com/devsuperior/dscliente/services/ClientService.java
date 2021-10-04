package com.devsuperior.dscliente.services;

import com.devsuperior.dscliente.dto.ClientDto;
import com.devsuperior.dscliente.entities.Client;
import com.devsuperior.dscliente.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Transactional(readOnly = true)
    public List<ClientDto> findAll() {

        List<Client> list = clientRepository.findAll();

        List<ClientDto> listDto =
                list.stream()
                        .map(x -> new ClientDto(x))
                        .collect(Collectors.toList());
        return listDto;
    }

    @Transactional(readOnly = true)
    public ClientDto findById(Long id) {
        Optional<Client> objEntity = clientRepository.findById(id);
        Client entity = objEntity.get();
        return new ClientDto(entity);
    }


}
