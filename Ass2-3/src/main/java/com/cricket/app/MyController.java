package com.cricket.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
@Autowired
CricketMatchesRepo cricketmatchesRepo;

@Autowired
CricketSeriesRepo cricketseriesRepo;

//Get the schedule for a specific series.
@RequestMapping("getAllMatches/{sid}")
 public CricketSeries getAllMatches(@PathVariable int sid)
{
	try {
	return cricketseriesRepo.findById(sid).get();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return null;
	}
}


//Get the schedule for all series.
@RequestMapping("getAllSeries")
public List<CricketSeries> getAllSeries()
{
	try {
		return cricketseriesRepo.findAll();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return null;
	}
}


//Create a schedule for a series.
@RequestMapping("createSeries")
public CricketSeries createSeries(@RequestBody CricketSeries series)
{
	try {
		return cricketseriesRepo.save(series);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return null;
	}
}


//Delete a schedule for a series.
@RequestMapping("deleteSeries/{sid}")
public String deleteSeries(@PathVariable int sid)
{
	try {
		cricketseriesRepo.deleteById(sid);
	
		return "Series Deleted";
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return "Series Not Deleted";
	}
}

//   Modify a schedule for a series.
@RequestMapping("updateSeries/{sid}")
public CricketSeries updateSeries(@PathVariable int sid)
{
	try {
		CricketSeries series=cricketseriesRepo.findById(sid).get();
		series.setTeamA("Neverland");
		series.setTeamB("Wonderland");
		cricketseriesRepo.save(series);
		return series;
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return null;
	}
}

}
