package com.upn.sistemas.capsof_project.service.dto;

import java.util.Date;

public class UserApplicationOfferDTO {

	private long idUserApplicationOffer;

	private Date applicationDate;

	private Date desapplicationDate;

	private String applicationState;

	private CompanyOfferDTO companyOfferDTO;

	private UserDTO userDTO;

	private String responseStatus;

	public long getIdUserApplicationOffer() {
		return idUserApplicationOffer;
	}

	public void setIdUserApplicationOffer(long idUserApplicationOffer) {
		this.idUserApplicationOffer = idUserApplicationOffer;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}

	public Date getDesapplicationDate() {
		return desapplicationDate;
	}

	public void setDesapplicationDate(Date desapplicationDate) {
		this.desapplicationDate = desapplicationDate;
	}

	public String getApplicationState() {
		return applicationState;
	}

	public void setApplicationState(String applicationState) {
		this.applicationState = applicationState;
	}

	public CompanyOfferDTO getCompanyOfferDTO() {
		return companyOfferDTO;
	}

	public void setCompanyOfferDTO(CompanyOfferDTO companyOfferDTO) {
		this.companyOfferDTO = companyOfferDTO;
	}

	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}

	public String getResponseStatus() {
		return responseStatus;
	}

	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}

}
