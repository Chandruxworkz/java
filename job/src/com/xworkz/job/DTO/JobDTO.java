package com.xworkz.job.DTO;

import java.io.Serializable;

import com.xworkz.job.constants.JobDesignation;
import com.xworkz.job.constants.Qualification;





public class JobDTO implements Serializable {
	
	

	
	private int jid;
	private JobDesignation designation;
	private double packagee;
    private Qualification qualification;
    private double percentage ;
   private  String fresher;
   
   
   public JobDTO() {
	// TODO Auto-generated constructor stub
}
   
   
   
public int getJid() {
	return jid;
}
public void setJid(int jid) {
	this.jid = jid;
}
public JobDesignation getDesignation() {
	return designation;
}
public void setDesignation(JobDesignation string) {
	this.designation = string;
}
public double getPackagee() {
	return packagee;
}
public void setPackagee(double packagee) {
	this.packagee = packagee;
}
public Qualification getQualification() {
	return qualification;
}
public void setQualification(Qualification qualification) {
	this.qualification = qualification;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
public String isFresher() {
	return fresher;
}
public void setFresher(String fresher) {
	this.fresher = fresher;
}
	
   
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
   
   
   
}
