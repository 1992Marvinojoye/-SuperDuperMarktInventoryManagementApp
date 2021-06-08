package SuperDuperMarkt.Inventory.Management.ObjectHandlers;

import com.opencsv.bean.CsvBindByName;

public class User {

    @CsvBindByName
    public int id;
    @CsvBindByName
    public String name;
    @CsvBindByName
    public String email;
    @CsvBindByName(column = "country")
    public String countryCode;
    
	public User(int id, String name, String email, String contry) {
		setId(id);
		setName(name);
		setEmail(email);
		setCountryCode(contry);
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", countryCode=" + countryCode + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

    // getters and setters omitted for brevity
}