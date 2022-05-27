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
	public TourInformationSystem getTour() {
		return tour;
	}
	public void setTour(TourInformationSystem tour) {
		this.tour = tour;
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
	

}