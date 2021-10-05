package com.devsuperior.dscliente.services;

import com.devsuperior.dscliente.dto.ClientDto;
import com.devsuperior.dscliente.entities.Client;
import com.devsuperior.dscliente.repositories.ClientRepository;
import com.devsuperior.dscliente.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
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
        Client entity = objEntity.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
        return new ClientDto(entity);
    }

    @Transactional
    public ClientDto insert(ClientDto dto) {
        Client entity = new Client();
        entity.setName(dto.getName());
        entity.setCpf(dto.getCpf());
        entity.setIncome(dto.getIncome());
        entity.setBirthDate(dto.getBirthDate());
        entity.setChildren(dto.getChildren());
        return new ClientDto(entity);
    }

    @Transactional
    public ClientDto update(Long id, ClientDto dto) {
        try {
            Client entity = clientRepository.getOne(id);
            entity.setName(dto.getName());
            entity.setCpf(dto.getCpf());
            entity.setIncome(dto.getIncome());
            entity.setBirthDate(dto.getBirthDate());
            entity.setChildren(dto.getChildren());
            entity = clientRepository.save(entity);
            return new ClientDto(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("Id not found " +id);
        }
    }
}
