package com.mrjaffesclass.apcs.todolist;
/**
 * To do item
 * 
 * @author Roger Jaffe
 * @version 1.0
 */
public class ToDoItem {

  /**
   * id:          ID number of to do item. Assigned when added to list
   * description: Description of to do item
   * done:        True if to do item is complete
   * deadline:    Deadline of the to so item
   */
  private int id;               
  private String description;
  private boolean done;
  private String deadline;
  
  /**
   * Constructor with done set to false in constructor
   * @param _id           ID number of to do item
   * @param _description  Description of to do item
   * @param _deadline     Deadline of the to do item
   */
  public ToDoItem(int _id, String _description, String _deadline) {
    description = _description;
    id = _id;
    deadline= _deadline;
    done = false;     // Default to not completed
  }

  /**
   * Constructor
   * @param _id           ID number of to do item
   * @param _description  Description of to do item
   * @param _done         Done flag
   */
  public ToDoItem(int _id, String _description, String _deadline, boolean _done) {
    description = _description;
    id = _id;
    deadline = _deadline;
    done = _done;     // Default to not completed
  }
  /**
   * Get the deadline of the item
   * @return deadline
   */
  public String getDeadline(){
  return deadline;
  }
  
  /**
   *  Set the deadline for the item
   * @param date The value to be set
   */
  public void setDeadline(String date){
  this.deadline = date;
  }
  
  /**
   * Get the to do item description
   * @return The description of to do item
   */
  public String getDescription() {
    return description;
  }

  /**
   * Set the to do item description
   * @param description The value to be set
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Get the done flag
   * @return The done flag
   */
  public boolean isDone() {
    return done;
  }

  /**
   * Set the done flag
   * @param done The value to be set
   */
  public void setDone(boolean done) {
    this.done = done;
  }
  
  /**
   * Toggles the done flag
   */
  public void toggleDone() {
    this.done = !this.done;
  }

  /**
   * Get the to do item ID
   * @return ID of the to do item
   */
  public int getId() {
    return id;
  }
  
  /**
   * Sets the ID of the to do item. Can only be called from inside this class
   * @param id ID value to set
   */
  public void setId(int id) {
    this.id = id;
  }
  
  /**
   * Transfer the date, description and done flag of another to do item into this one
   * @param anotherItem Item whose data values we are copying
   */
  public void merge(ToDoItem anotherItem) {
    this.setDescription(anotherItem.getDescription());
    this.setDone(anotherItem.isDone());
    this.setDeadline(anotherItem.getDeadline());
  }

 
}
