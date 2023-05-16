package mockit.stub;

import java.util.*;

public class CustomerRepository {
	
	Map<Long, Customer> customers = new HashMap<>();

// No need for this method because we're using the Test Stub pattern
//	public void addCustomer(long id, Customer customer) {
//		customers.put(id, customer);
//	}
	
	public Customer getCustomerById(long id) {
		if (!customers.containsKey(id))
			throw new CustomerNotFoundException();
		return customers.get(id);
	}
}