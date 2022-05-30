package com.cg.tourmanagement.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tourinfo")
public class TourInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reserevdPackageId;
	@Column(name="packagename",length=30)
	private String  packageName;
	@Column(name="description",length=30)
	private String description;
	@Column(name="startdate",length=10)
	private Date startDate;
	@Column(name="enddate",length=10)
	private Date endDate;
	@Column(name="no_of_persons",length=10)
	private int noOfPersons;
	@Column(name="no_of_days",length=10)
	private int numberOfDays;
	@Column(name="amount_per_person",length=30)
	private double amountPerPerson;
	@Column(name="transportation",length=10)
	private String modeOfTransportation;
	@Column(name="hotel",length=30)
	private String hotel;
	
	@Column(name="PayMode",length=30)
	private String PayMode; //Payment method usued to book the hotels or any other resources
	//Online, Cash, Card, Upi
	
	@Column(name="Status",length=30)
	private String Status; //Booking Status
	
	@OneToOne
	@JoinColumn(name="packageId")
	private  TourInformationSystem tour;
	
	public int getReserevdPackageId() {
		return reserevdPackageId;
	}
	
	public void setReserevdPackageId(int reserevdPackageId) {
		this.reserevdPackageId = reserevdPackageId;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getNoOfPersons() {
		return noOfPersons;
	}
	
	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	
	public int getNumberOfDays() {
		return numberOfDays;
	}
	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	public double getAmountPerPerson() {
		return amountPerPerson;
	}
	public void setAmountPerPerson(double amountPerPerson) {
		this.amountPerPerson = amountPerPerson;
	}
	public String getModeOfTransportation() {
		return modeOfTransportation;
	}
	public void setModeOfTransportation(String modeOfTransportation) {
		this.modeOfTransportation = modeOfTransportation;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public TourInformationSystem getTour() {
		return tour;
	}
	public void setTour(TourInformationSystem tour) {
		this.tour = tour;
	}
	public TourInfo(int reserevdPackageId) {
		super();
		this.reserevdPackageId = reserevdPackageId;
	}
	public String getPayMode() {
		return PayMode;
	}
	public void setPayMode(String payMode) {
		PayMode = payMode;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public TourInfo(int reserevdPackageId, String packageName, String description, Date startDate, Date endDate,
			int noOfPersons, int numberOfDays, double amountPerPerson, String modeOfTransportation, String hotel,
			String payMode, String status, TourInformationSystem tour) {
		super();
		this.reserevdPackageId = reserevdPackageId;
		this.packageName = packageName;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.noOfPersons = noOfPersons;
		this.numberOfDays = numberOfDays;
		this.amountPerPerson = amountPerPerson;
		this.modeOfTransportation = modeOfTransportation;
		this.hotel = hotel;
		PayMode = payMode;
		Status = status;
		this.tour = tour;
	}
}