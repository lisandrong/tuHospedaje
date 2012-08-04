/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuhospedaje.jpa.dao;

import java.util.List;

/**
 *
 * @author Cristian
 */
public interface ICrudDAO<T> {

    /**
     * Lista de todos los elementos
     *
     * @return T
     */
    public List<T> getAll();

    /**
     * Un elemento
     *
     * @return T
     */
    public T get(Integer id);

    /**
     * Un elemento
     *
     * @return T
     */
    public boolean exist(T object);

    /**
     * Guarda un objecto en la base de datos
     *
     * @param object
     */
    public void save(T object);

    /**
     * Actualiza un objecto en la base de datos
     *
     * @param object
     */
    public void update(T object);

    /**
     * Borra un objecto en la base de datos
     *
     * @param object
     */
    public void delete(T object);
}
