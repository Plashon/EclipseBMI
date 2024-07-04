package com.npru.se65.id011;

public class HealthAnalyzer {
	public String analyzBmi(double bmi) {
		if(bmi <= 18.9) {
			return "Underweight";
		}else if(bmi <= 24.9){
			return "normal weight";
		}else if(bmi <= 29.9){
			return "Overweght";
		}else{
			return "Obesity";
		}
		
	}
}
