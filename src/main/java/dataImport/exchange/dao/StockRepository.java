package dataImport.exchange.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dataImport.exchange.model.TCS_Stock;

@Repository
public interface StockRepository extends CrudRepository<TCS_Stock, Integer>{

	
	
}
