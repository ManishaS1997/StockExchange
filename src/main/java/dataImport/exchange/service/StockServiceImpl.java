package dataImport.exchange.service;

import org.springframework.beans.factory.annotation.Autowired;

import dataImport.exchange.dao.StockRepository;
import dataImport.exchange.model.TCS_Stock;

public class StockServiceImpl implements StockService{
	
	@Autowired
	StockRepository stockRepository;

	@Override
	public TCS_Stock saveStock(TCS_Stock tcsStock) {
		
	TCS_Stock saveStock=stockRepository.save(tcsStock);
		
		return saveStock;
	}

}
