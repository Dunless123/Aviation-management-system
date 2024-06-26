package edu.wtbu.service;

import java.util.HashMap;
import java.util.List;

import edu.wtbu.dao.CityDao;
import edu.wtbu.pojo.Result;

public class CityService {
	public static Result getCityNames(){
		List<HashMap<String, Object>> list = CityDao.getCityNames();
		Result result = new Result("success", null, list);
		return result;
	}
}
