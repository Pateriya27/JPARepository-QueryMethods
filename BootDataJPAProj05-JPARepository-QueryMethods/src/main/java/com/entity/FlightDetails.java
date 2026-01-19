package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "FLIGHT_DETAILS")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor
public class FlightDetails {
	@Column(name = "FNO")
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//@GeneratedValue
	//@SequenceGenerator(name="seq1",sequenceName = "FLIGHT_SEQ1",initialValue = 1000,allocationSize = 1)
	//@GeneratedValue(generator = "seq1",strategy = GenerationType.SEQUENCE)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer fno;
	@Column(name = "FNAME", length = 30)
	//@NonNull
	private String fname;
	@Column(name = "COMPANY", length = 30)
	//@NonNull
	private String company;
	@Column(name = "TYPE", length = 30)
	//@NonNull
	private String type;
	@Column(name = "CAPACITY")
	//@NonNull
	private Integer capacity;
	

}
