package baithi;



public class Customer {
	private String FullName ;
	private String Address;
	private String Phone;
	protected int luongCoBan;
	private Float tax;
	
	public Customer(String Fullname, String Address, String Phone, int luongCoBan, Float tax) {
		this.FullName = Fullname;
		this.Address= Address;
		this.Phone =Phone;
//		this.luong = luong;
		this.luongCoBan = luongCoBan;
		this.tax = tax;
	}
	
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		this.FullName = fullName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}
	
//	public int tinhLuong() {
//		this.luong = this.luongCoBan - this.luongCoBan * this.tax ;
//		return this.luong;
//	}
//	
	@Override
	public String toString() {
		return "Fullname: " + this.FullName + ", Address: " + this.Address + 
	            ", số điện thoại: " + this.Phone + ", lương cơ bản: " + this.luongCoBan +",Thuế:" +this.tax;
	}
	
}