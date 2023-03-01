package dataImport.exchange.service;

import org.springframework.beans.factory.annotation.Autowired;

import dataImport.exchange.dao.StockRepository;
import dataImport.exchange.model.TCS_Stock;

public interface StockService {

	public TCS_Stock saveStock(TCS_Stock tcsStock);

}
