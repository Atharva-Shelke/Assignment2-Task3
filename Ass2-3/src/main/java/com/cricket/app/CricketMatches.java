package com.cricket.app;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
public class CricketMatches {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int m_id;
	String m_date;
	String m_time;
	String m_place;
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public String getM_date() {
		return m_date;
	}
	public void setM_date(String m_date) {
		this.m_date = m_date;
	}
	public String getM_time() {
		return m_time;
	}
	public void setM_time(String m_time) {
		this.m_time = m_time;
	}
	public String getM_place() {
		return m_place;
	}
	public void setM_place(String m_place) {
		this.m_place = m_place;
	}
	public CricketMatches(int m_id, String m_date, String m_time, String m_place) {
		super();
		this.m_id = m_id;
		this.m_date = m_date;
		this.m_time = m_time;
		this.m_place = m_place;
	}
	public CricketMatches() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Matches [m_id=" + m_id + ", m_date=" + m_date + ", m_time=" + m_time + ", m_place=" + m_place + "]";
	}
	

}
