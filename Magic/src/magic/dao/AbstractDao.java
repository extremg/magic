/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.dao;

/**
 *
 * @author maxime
 * @param <T>
 */
public interface AbstractDao<T> {
    
    void createEntity(T card);
    void updateEntity(T card);
    void deleteEntiry(String name);
}
