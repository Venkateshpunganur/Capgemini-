package sprin;

public class Customer {

	//customerId, customerName,
	               //customerContact, customerAddress.

	private int customerId;
	private String customerName;
	private Address customerAddress;
	private int customerContact;
	
	
	
	public int getCustomerId() {
		return customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public int getCustomerContact() {
		return customerContact;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
    public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

    public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}

    public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", customerContact=" + customerContact + "]";
	}

    
	
	
}
