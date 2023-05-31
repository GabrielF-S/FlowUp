package br.com.a3anhembimorumbi.flowup.model.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;

public interface Repositorio extends ListPagingAndSortingRepository<Object, Integer>, CrudRepository<Object, Integer>{

}
