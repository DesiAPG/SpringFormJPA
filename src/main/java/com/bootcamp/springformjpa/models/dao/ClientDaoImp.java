package com.bootcamp.springformjpa.models.dao;

import com.bootcamp.springformjpa.models.entity.Client;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ClientDaoImp implements IClientDAO {

    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true)
    @Override
    public List<Client> findAll() {
        return em.createQuery("from Client").getResultList();
    }
}
