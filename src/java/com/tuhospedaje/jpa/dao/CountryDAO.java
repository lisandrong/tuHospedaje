/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuhospedaje.jpa.dao;

import com.tuhospedaje.model.domain.Country;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Cristian
 */
public class CountryDAO implements ICrudDAO {

    EntityManagerFactory emf;
    EntityManager em;

    public CountryDAO(EntityManagerFactory emf) {
        this.emf = emf;
        this.em = emf.createEntityManager();
    }

    @Override
    public List getAll() {
        List<Country> countries;
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery cq = cb.createQuery(Country.class);
        Root<Country> country = cq.from(Country.class);
        cq.select(country);
        TypedQuery<Country> q = em.createQuery(cq);
        countries = q.getResultList();

        return countries;
    }

    @Override
    public Object get(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean exist(Object object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void save(Object object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Object object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Object object) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
