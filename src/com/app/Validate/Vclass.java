package com.app.Validate;

import com.app.CustomException.Eclass;
import com.app.Plan.Service;

public class Vclass {
	public static Service validatePlan (String s) throws Eclass{
		for (Service sv : Service.values()) {
			if (sv.name().equalsIgnoreCase(s)) {
				return sv;
			}
		}
		throw new Eclass ("INVALID PLAN");
	}

}
