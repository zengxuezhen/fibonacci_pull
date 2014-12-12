package ie.gmit;

public class FibonacciRequest {
	private int jobNum;
    private int parameter;
    
    public FibonacciRequest(int jobNum, int parameter){
    	super();
    	this.jobNum=jobNum;
    	this.parameter=parameter;
    }
	public int getJobNum() {
		return jobNum;
	}
	public void setJobNum(int jobNum) {
		this.jobNum = jobNum;
	}
	public int getParameter() {
		return parameter;
	}
	public void setParameter(int parameter) {
		this.parameter = parameter;
	}

    

}
