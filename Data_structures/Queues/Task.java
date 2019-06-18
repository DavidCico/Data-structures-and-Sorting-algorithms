/**
 * Class to create a task, with String job and in priority
 */
public class Task {
	
	private String job;
	private int priority;
	
	// Constructor
	public Task(String jb, int p){
		this.job = jb;
		this.priority = p;
		}
	
	
	public void setJob(String jb){
		job = jb;
	}
	
	public void setPriority(int p){
		priority = p;
	}
	
	public String getJob(){
		return job;
	}
	
	public int getPriority(){
		return priority;
	}
	
    // toString() //
    public String toString() 
    {
        return "Job Name: "+ job +"; Priority: "+ priority;
    }

}
