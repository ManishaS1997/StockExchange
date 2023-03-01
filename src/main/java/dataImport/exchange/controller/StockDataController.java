package dataImport.exchange.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.opencsv.CSVWriter;

import dataImport.exchange.model.TCS_Stock;
import dataImport.exchange.service.StockServiceImpl;

@RestController
public class StockDataController {
	
	@Autowired
	StockServiceImpl stockServiceImpl;

	@PostMapping("/save")
	public ResponseEntity<TCS_Stock> saveStock(@RequestBody TCS_Stock tCS_Stock )  
	{     
		TCS_Stock Updated_tcs_stock=stockServiceImpl.saveStock(tCS_Stock);
		
		return ResponseEntity.ok().body(Updated_tcs_stock);
		
	}
	
	@PostMapping("/saveDataToCSV")
	public void saveCSV() throws IOException
	{
		
		// Get the data from the API endpoint using the RestTemplate
		
		
		  String apiURL = "https://eodhistoricaldata.com/api/eod/TCS.NSE";
		  String apiToken="63ef56d24343a3.83583376";
		  
	      RestTemplate restTemplate = new RestTemplate();
	        ResponseEntity<String> response = restTemplate.getForEntity(apiURL + "?api_token=" + apiToken, String.class);
	        
	        
	        // Process the response data and save it in a CSV file
	        String data = response.getBody();
	        List<String[]> lines = dataCSV(data);
	        String[] header = {"Date", "Open", "High", "Low", "Close", "Adj_Close", "Volume"};
	        lines.add(0, header);
	        //by adding maven dependency opencsv
	        CSVWriter writer = new CSVWriter(new FileWriter("data.csv"));
	        writer.writeAll(lines);
	        writer.close();
		
	}
	
	  private List<String[]> dataCSV(String data) {
		return null;
	        // Process the CSV data and return a list of string arrays
	        // ...
	    }
	
	

}
