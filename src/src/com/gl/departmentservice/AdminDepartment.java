package com.gl.departmentservice;

public class AdminDepartment  extends SuperDepartment{ 
	@Override
    public String departmentName()
    {
    	return "Welcome to Admin Department";
    }
	@Override
     public String getTodayswork()
     {
    	 return "Complete your documents Submission";
     }
	@Override
     public String getWorkDeadline()
     {
    	 return "Complete by EOD";
     }

}
