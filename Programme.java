
public class Programme {
	protected String description;
	protected String closedCaption;
	protected String markStatus;
	protected String title;
	protected String length;
	
	public Programme(){
		description="";
		closedCaption="";
		markStatus="";
		title="";
		length="";
	}
	public Programme(String description,String closedCaption,String markStatus,String title,String length)
	{
		this.description=description;
		this.closedCaption=closedCaption;
		this.markStatus=markStatus;
		this.title=title;
		this.length=length;
	}
	public Programme(Programme p){
		this.description=p.description;
		this.closedCaption=p.closedCaption;
		this.markStatus=p.markStatus;
		this.title=p.title;
		this.length=p.length;
		
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getClosedCaption() {
		return closedCaption;
	}
	public void setClosedCaption(String closedCaption) {
		this.closedCaption = closedCaption;
	}
	public String getMarkStatus() {
		return markStatus;
	}
	public void setMarkStatus(String markStatus) {
		this.markStatus = markStatus;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
}
