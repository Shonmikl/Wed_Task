//package mockit.test;
//
//import mockit.dummy.*;
//import org.mockito.Mockito;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class DummyObjectTest {
//
//    //1.Standard use case
//
//    public Customer createDummyCustomer() {
//        State state = new State("CA");
//        City city = new City("Alicante", state);
//        Address address = new Address("West", city);
//        return new Customer("John", "Nikolson", address);
//    }
//
//    @Test
//    void addCustomerTest() {
//        Customer dummy = createDummyCustomer();
//        AddressBook addressBook = new AddressBook();
//        addressBook.addCustomer(dummy);
//        Assert.assertEquals(1, addressBook.getNumberOfCustomers());
//    }
//
//    //2.Null
//    @Test
//    void addNullCustomerTest() {
//        Customer dummy = null;
//        AddressBook addressBook = new AddressBook();
//        Assert.assertThrows(NullPointerException.class, ()-> addressBook.addCustomer(dummy));
//    }
//
//    //3.Inject mock
//    @Test
//    void addCustomerWithDummyObjectTest() {
//        Customer dummy = Mockito.mock(Customer.class);
//        AddressBook addressBook = new AddressBook();
//        addressBook.addCustomer(dummy);
//        Assert.assertEquals(1, addressBook.getNumberOfCustomers());
//    }
//}