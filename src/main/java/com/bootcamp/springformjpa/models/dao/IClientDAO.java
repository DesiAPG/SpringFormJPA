package com.bootcamp.springformjpa.models.dao;

import com.bootcamp.springformjpa.models.entity.Client;

import java.util.List;

public interface IClientDAO {
    public List<Client> findAll();
}
