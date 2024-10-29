package com.app.vehiclerental.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.app.vehiclerental.model.RoadsideAssistance;
import com.app.vehiclerental.model.Verfication;
import com.app.vehiclerental.model.Payment;
import com.app.vehiclerental.model.ServiceCrew;
import com.app.vehiclerental.model.Insurance;
import com.app.vehiclerental.model.ExtendBooking;
import com.app.vehiclerental.model.Booking;
import com.app.vehiclerental.model.RentalCompany;
import com.app.vehiclerental.model.ReturnBikeInspection;
import com.app.vehiclerental.model.Customer;
import com.app.vehiclerental.model.Bike;
import com.app.vehiclerental.model.ReturnRentedBike;
import com.app.vehiclerental.enums.IDTypes;
import com.app.vehiclerental.converter.IDTypesConverter;
import com.app.vehiclerental.converter.DurationConverter;
import com.app.vehiclerental.converter.UUIDToByteConverter;
import com.app.vehiclerental.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "ServiceCrew")
@Table(name = "\"ServiceCrew\"", schema =  "\"vehiclerental\"")
@Data
                        
public class ServiceCrew {
	public ServiceCrew () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"ServiceID\"", nullable = true )
  private Integer serviceID;
	  
  @Column(name = "\"ServiceguyName\"", nullable = true )
  private String serviceguyName;
  
	  
  @Column(name = "\"CustomerID\"", nullable = true )
  private Integer customerID;
  
	  
  @Column(name = "\"BikeID\"", nullable = true )
  private Integer bikeID;
  
	  
  @Column(name = "\"CurrentBikeAddress\"", nullable = true )
  private String currentBikeAddress;
  
	  
  @Column(name = "\"ProblemIdentified\"", nullable = true )
  private Boolean problemIdentified;
  
	  
  @Column(name = "\"SolutionProvided\"", nullable = true )
  private Boolean solutionProvided;
  
	  
  @Column(name = "\"ReturntoManufacturer\"", nullable = true )
  private Boolean returntoManufacturer;
  
	  
  @Column(name = "\"InsuranceCovered\"", nullable = true )
  private Boolean insuranceCovered;
  
	  
  @Column(name = "\"Issueby\"", nullable = true )
  private Boolean issueby;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "ServiceCrew [" 
  + "ServiceID= " + serviceID  + ", " 
  + "ServiceguyName= " + serviceguyName  + ", " 
  + "CustomerID= " + customerID  + ", " 
  + "BikeID= " + bikeID  + ", " 
  + "CurrentBikeAddress= " + currentBikeAddress  + ", " 
  + "ProblemIdentified= " + problemIdentified  + ", " 
  + "SolutionProvided= " + solutionProvided  + ", " 
  + "ReturntoManufacturer= " + returntoManufacturer  + ", " 
  + "InsuranceCovered= " + insuranceCovered  + ", " 
  + "Issueby= " + issueby 
 + "]";
	}
	
}