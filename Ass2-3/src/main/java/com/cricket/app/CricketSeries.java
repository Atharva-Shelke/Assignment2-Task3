package com.cricket.app;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
public class CricketSeries {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int s_id;
	String s_name;
	String start_date;
	String end_date;
	String teamA;
	String teamB;
	
	@ManyToMany
	List<CricketMatches> matches;

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getTeamA() {
		return teamA;
	}

	public void setTeamA(String teamA) {
		this.teamA = teamA;
	}

	public String getTeamB() {
		return teamB;
	}

	public void setTeamB(String teamB) {
		this.teamB = teamB;
	}

	public List<CricketMatches> getMatches() {
		return matches;
	}

	public void setMatches(List<CricketMatches> matches) {
		this.matches = matches;
	}

	public CricketSeries(int s_id, String s_name, String start_date, String end_date, String teamA, String teamB,
			List<CricketMatches> matches) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.start_date = start_date;
		this.end_date = end_date;
		this.teamA = teamA;
		this.teamB = teamB;
		this.matches = matches;
	}

	public CricketSeries() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Series [s_id=" + s_id + ", s_name=" + s_name + ", start_date=" + start_date + ", end_date=" + end_date
				+ ", teamA=" + teamA + ", teamB=" + teamB + ", matches=" + matches + "]";
	}
	

}
