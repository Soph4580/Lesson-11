public class Task {

    private String name;
    private String description;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    
    public boolean validate(){
        if(name==null || description==null || name.equals("") || description.equals(""))
            return false;
        else 
            return true;
    }

    @Override
    public String toString() {
        return  "Name: " + name + "\ndescription=" + description + "\n======\n";
    }
        

}
