/**
 * The customer class which allows users to create customers and get/set values of their customers
 */

public class Customer {

    private int customerID;
    private String customerName;
    private String customerAddress;
    private String customerPostalCode;
    private String customerPhoneNumber;
    private String customerCreationDate;
    private String customerCreatedBy;
    private String customerLastUpdate;
    private String customerLastUpdatedBy;
    private int customerDivisionID;
    private String customerCountry;

    /**
     * Default constructor
     */
    Customer() {}

    /**
     * Overloaded contructor
     * @param customerID customer id to be set
     * @param customerName customer name to be set
     * @param customerAddress customer address to be set
     * @param customerPostalCode customer postal code to be set
     * @param customerPhoneNumber customer phone number to be set
     * @param customerCreationDate customer creation date to be set
     * @param customerCreatedBy customer creator to be set
     * @param customerLastUpdate customer last update to be set
     * @param customerLastUpdatedBy customer last updated by to be set
     * @param customerDivisionID customer division id to be set
     * @param customerCountry  customer country to be set
     */
    Customer(int customerID, String customerName, String customerAddress, String customerPostalCode, String customerPhoneNumber,
             String customerCreationDate, String customerCreatedBy, String customerLastUpdate, String customerLastUpdatedBy,
             int customerDivisionID, String customerCountry) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPostalCode = customerPostalCode;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerCreationDate = customerCreationDate;
        this.customerCreatedBy = customerCreatedBy;
        this.customerLastUpdate = customerLastUpdate;
        this.customerLastUpdatedBy = customerLastUpdatedBy;
        this.customerDivisionID = customerDivisionID;
        this.customerCountry = customerCountry;
    }

    /**
     * get the customer id of the customer object
     * @return customer id
     */
    public int getId() {
        return customerID;
    }

    /**
     * set the customer id of the customer object
     * @param customerID the customer id to be set
     */
    public void setId(int customerID) {
        this.customerID = customerID;
    }

    /**
     * get the customer name of the customer object
     * @return customer name
     */
    public String getName() {
        return customerName;
    }

    /**
     * set the customer name of the customer object
     * @param customerName customer name to be set
     */
    public void setName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * get the customer address of the customer object
     * @return customer address
     */
    public String getAddress() {
        return customerAddress;
    }

    /**
     * set the customer address of the customer object
     * @param customerAddress customer address to be set
     */
    public void setAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    /**
     * get the customer postal code of the customer object
     * @return customer postal code
     */
    public String getPostalCode() {
        return customerPostalCode;
    }

    /**
     * set the customer postal code of the customer object
     * @param customerPostalCode the customer postal code to be set
     */
    public void setPostalCode(String customerPostalCode) {
        this.customerPostalCode = customerPostalCode;
    }

    /**
     * get the customer phone number of the customer object
     * @return customer phone number
     */
    public String getPhoneNumber() {
        return customerPhoneNumber;
    }

    /**
     * set the customer phone number of the customer object
     * @param customerPhoneNumber customer phone number to be set
     */
    public void setPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    /**
     * get the customer creation date of the customer object
     * @return customer creation date
     */
    public String getCreationDate() {
        return customerCreationDate;
    }

    /**
     * set the customer creation date of the customer object
     * @param customerCreationDate the customer creation date to be set
     */
    public void setCreationDate(String customerCreationDate) {
        this.customerCreationDate = customerCreationDate;
    }

    /**
     * get the customer creator for the customer object
     * @return customer created by
     */
    public String getCreatedBy() {
        return customerCreatedBy;
    }

    /**
     * set the customer creator for the customer object
     * @param customerCreatedBy customer creator to be set
     */
    public void setCreatedBy(String customerCreatedBy) {
        this.customerCreatedBy = customerCreatedBy;
    }

    /**
     * get the customer last update for the customer object
     * @return last customer update
     */
    public String getLastUpdate() {
        return customerLastUpdate;
    }

    /**
     * set the last update for a customer for customer object
     * @param customerLastUpdate last update for customer to be set
     */
    public void setLastUpdate(String customerLastUpdate) {
        this.customerLastUpdate = customerLastUpdate;
    }

    /**
     * get the last user who updated customer for customer object
     * @return last user who updated customer
     */
    public String getLastUpdatedBy() {
        return customerLastUpdatedBy;
    }

    /**
     * set the last user to update customer for customer object
     * @param customerLastUpdatedBy last user to update customer to be set
     */
    public void setLastUpdatedBy(String customerLastUpdatedBy) {
        this.customerLastUpdatedBy = customerLastUpdatedBy;
    }

    /**
     * get the customer division id for customer object
     * @return customer divsion id
     */
    public int getDivisionID() {
        return customerDivisionID;
    }

    /**
     * set the customer division id for customer object
     * @param customerDivisionID the customer division id to be set
     */
    public void setDivisionID(int customerDivisionID) {
        this.customerDivisionID = customerDivisionID;
    }

    /**
     * get the customer country for customer object
     * @return customer country
     */
    public String getCountry() {
        return customerCountry;
    }

    /**
     * set the customer country for customer object
     * @param customerCountry customer country to be set
     */
    public void setCountry(String customerCountry) {
        this.customerCountry = customerCountry;
    }
}
