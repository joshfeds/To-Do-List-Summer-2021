package ucf.assignments;


import java.text.MessageFormat;

public class Item{
    private String name;
    private String description;
    private String dueDate;
    private boolean isComplete;

    public Item(String name){
        this.name = name;
        this.description = "";
        this.dueDate = "";
        this.isComplete = false;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return MessageFormat.format("Name: {0}\nDescription: {1}\n" +
                "Due Date: {2}\nStatus: {3}", getName(), getDescription(), getDueDate(), isComplete() ? "Complete" : "Incomplete");

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
