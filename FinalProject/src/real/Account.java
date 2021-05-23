package real;

import java.io.Serializable;

public class Account implements Serializable {
	private int ano;
	private String name;
	private int price;
	private int stock;
	private int popular;
	
	
	public int getAno() {return ano;}
	public void setAno(int ano) {this.ano = ano;}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public int getPrice() {return price;}
	public void setPrice(int price) {this.price=price;}
	
	public int getStock() {return stock;}
	public void setStock(int stock) {this.stock=stock;}
	
	public int getPopular() {return popular;}
	public void setPopular(int popular) {this.popular=popular;}
	
	
}
