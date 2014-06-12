package com.vf.restaurants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NewDoctor {

	@Autowired 
	private DoctorValidation docVal;
	@Autowired 
	private DoctorDAO  docDAO;
	
	public NewDoctor() {		
	}
	
	public DocResult addDoctor( Doctor doc ) {
		DocResult docResult = new DocResult();
		if( docVal.validated( doc ) ) {
			if( docDAO.persist( doc ) ) {
				docResult.setSuccess( true );
				docResult.setMessage( "success");
			}
		} 
		return docResult;
	}
	
	public DoctorValidation getDocVal() {
		return docVal;
	}

	public void setDocVal(DoctorValidation docVal) {
		this.docVal = docVal;
	}

	public DoctorDAO getDocDAO() {
		return docDAO;
	}

	public void setDocDAO(DoctorDAO docDAO) {
		this.docDAO = docDAO;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
