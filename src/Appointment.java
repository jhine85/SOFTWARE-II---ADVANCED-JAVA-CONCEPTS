/**
 * the appointment classs which allows users to create appointments and get/set values of their appointments
 */

public class Appointment {

    private int id;
    private String title;
    private String location;
    private String description;
    private String type;
    private String start;
    private String end;
    private String creationDate;
    private String createdBy;
    private String updated;
    private String updatedBy;
    private int customerID;
    private int userID;
    private int contactID;

    /**
     * Overloaded constructor
     * @param id the appointment id to set
     * @param title the appointment title to set
     * @param description the appointment description to set
     * @param location the appointment location to set
     * @param type the appointment type to set
     * @param start the appointment start to set
     * @param end the appointment end to set
     * @param creationDate the appointment creation date to set
     * @param createdBy the appointment created by to set
     * @param updated the appointment updated dated to set
     * @param updatedBy the appointment updater to set
     * @param customerID the appointment customer id to set
     * @param userID the appointment user id to set
     * @param contactID the appointment contact id to set
     */

    Appointment(int id, String title, String description, String location, String type, String start, String end,
                String creationDate, String createdBy, String updated, String updatedBy, int customerID, int userID,
                int contactID) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.location = location;
        this.type = type;
        this.start = start;
        this.end = end;
        this.creationDate = creationDate;
        this.createdBy = createdBy;
        this.updated = updated;
        this.updatedBy = updatedBy;
        this.customerID = customerID;
        this.userID = userID;
        this.contactID = contactID;

    }

    /**
     * Default constructor
     */

    Appointment() {

    }

    /**
     * Get the appointment id of the appointment object
     * @return the appointment id
     */
    public int getID() {
        return id;
    }

    /**
     * Set the appointment id of the appointment object
     * @param id the id value to be set
     */
    public void setID(int id) {
        this.id = id;
    }

    /**
     * Get the appointment title of the appointment object
     * @return the appointment title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the appointment title of the appointment object
     * @param title the appointment title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get the appointment description of the appointment object
     * @return the appointment description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Get the appointment description of the appointment object
     * @param description the appointment description to be set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the appointment location of the appointment object
     * @return location of appointment
     */
    public String getLocation() {
        return location;
    }

    /**
     * set the appointment location of the appointment object
     * @param location the location to be set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * get the appointment type of the appointment object
     * @return  appointment type
    */
    public String getType() {
        return type;
    }

    /**
     * set the appointment type of the appointment object
     * @param type the type to be set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * get the appointment start of the appointment object
     * @return the appointment start
     */
    public String getStart() {
        return start;
    }

    /**
     * set the appointment start of the appointment object
     * @param start the appointment start to be set
     */
    public void setStart(String start) {
        this.start = start;
    }

    /**
     * get the appointment end of the appointment object
     * @return the appointment end
     */
    public String getEnd() {
        return end;
    }

    /**
     * set the appointment end of the appointment object
     * @param end the appointment end to be set
     */
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * get the appointment creation date of the appointment object
     * @return the appointment creation date
     */
    public String getCreation() {
        return creationDate;
    }

    /**
     * set the appointment creation date for the appointment object
     * @param creationDate the appointment creation date to be set
     */
    public void setCreation(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * get the appointment creator for the appointment object
     * @return the appointment creator
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * set the appointment creator for the appointment object
     * @param createdBy the appointment creator to be set
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * get the appointment updated date for the appointment object
     * @return the appointment updated date
     */
    public String getUpdated() {
        return updated;
    }

    /**
     * set the appointment updated date for the appointment object
     * @param updated the appointment updated date to be set
     */
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    /**
     * get the appointment updater for the appointment object
     * @return appointment updater
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * set the appointment updater for the appointment object
     * @param updatedBy appointment updater to be set
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * get the appointment customer id for the appointment object
     * @return appointment customer id
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * set the appointment customer id for the appointment object
     * @param customerID appointment customer id to be set
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     * get appointment user id for the appointment object
     * @return appointment user id
     */
    public int getUserID() {
        return userID;
    }

    /**
     * set the appointment user id for the appointment object
     * @param userID appointment user id to be set
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /**
     * get the appointment contact id for the appointment object
     * @return contact id
     */
    public int getContactID() {
        return contactID;
    }

    /**
     * set the appointment contact id for the appointment object
     * @param contactID appointment contact id to be set
     */
    public void setContactID(int contactID) {
        this.contactID = contactID;
    }
}
