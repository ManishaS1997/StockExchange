package dataImport.exchange.model;

import java.util.Date;

public class TCS_Stock {
	public int stock_id;
	private Date date;
	
	private double Open;
	private double High;
	private double Low;
	private double Close;
	private double Adjusted_close;
	private long Volume;
	
	
	
	public TCS_Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public int getStock_id() {
		return stock_id;
	}

	public void setStock_id(int stock_id) {
		this.stock_id = stock_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	public double getOpen() {
		return Open;
	}
	public void setOpen(double open) {
		Open = open;
	}
	public double getHigh() {
		return High;
	}
	public void setHigh(double high) {
		High = high;
	}
	public double getLow() {
		return Low;
	}
	public void setLow(double low) {
		Low = low;
	}
	public double getClose() {
		return Close;
	}
	public void setClose(double close) {
		Close = close;
	}
	public double getAdjusted_close() {
		return Adjusted_close;
	}
	public void setAdjusted_close(double adjusted_close) {
		Adjusted_close = adjusted_close;
	}
	public long getVolume() {
		return Volume;
	}
	public void setVolume(long volume) {
		Volume = volume;
	}
	
	@Override
	public String toString() {
		return "TCS_Stock [Date=" + date + ", Open=" + Open + ", High=" + High + ", Low=" + Low + ", Close=" + Close
				+ ", Adjusted_close=" + Adjusted_close + ", Volume=" + Volume + "]";
	}


	public TCS_Stock(int stock_id, Date date, double open, double high, double low, double close, double adjusted_close,
			long volume) {
		super();
		this.stock_id = stock_id;
		this.date = date;
		Open = open;
		High = high;
		Low = low;
		Close = close;
		Adjusted_close = adjusted_close;
		Volume = volume;
	}
	
	
	


}
