package RooMateServices.adv_filters_service;

import java.sql.*;
import java.io.*;
//import oracle.jdbc.*;
import java.util.*;

public class DatabaseManager {
	
	public static ArrayList<UserProfile> getFilterResults(Filters filter){
		ArrayList<UserProfile> FilterResults = new ArrayList<UserProfile>();
		
		boolean whereCondition = false;
		int conditionPlecParamIndex = 0; //0 - płec nie podana, 1 -płeć znana
		int conditionAnimalParamIndex = 0;
		int conditionPartyParamIndex = 0;
		int conditionSmokingParamIndex = 0;
		int conditionAlkoholParamIndex = 0;
		int conditionDistrictParamIndex = 0;
		int conditionAgeParamIndex = 0;
		int conditionRoomPriceParamIndex = 0;
		String query = "SELECT * FROM users";
		
		
		if(filter.getPlec()!=Plec.doesntMatter){
			whereCondition = true;
			query+=" WHERE users.Plec = ?"; //? - parametr
			conditionPlecParamIndex = 1;
		}
		
		if(filter.getAnimals()!=Preference.doesntMatter){
			if(whereCondition == true){
				query += " AND users.animals = ?"; 
			}
			else{
				whereCondition = true;
				query += " WHERE users.animals = ? ";
			}
			conditionAnimalParamIndex = conditionPlecParamIndex + 1;
		}
		
		if(filter.getParty()!=null){
			if(whereCondition == true){
				query += " AND users.party = ?"; 
			}
			else{
				whereCondition = true;
				query += " WHERE users.party = ? ";
			}
			conditionPartyParamIndex = conditionPlecParamIndex + conditionAnimalParamIndex + 1;
		}
		
		if(filter.getSmoking()!= Preference.doesntMatter){
			if(whereCondition == true){
				query += " AND users.smoking = ?"; 
			}
			else{
				whereCondition = true;
				query += " WHERE users.smoking = ? ";
			}
			conditionSmokingParamIndex = conditionPlecParamIndex + conditionAnimalParamIndex + conditionPartyParamIndex + 1;
		}
		
		if(filter.getAlkohol()!= null){
			if(whereCondition == true){
				query += " AND users.alkohol = ?"; 
			}
			else{
				whereCondition = true;
				query += " WHERE users.alkohol = ? ";
			}
			conditionAlkoholParamIndex = conditionPlecParamIndex + conditionAnimalParamIndex + conditionPartyParamIndex + conditionSmokingParamIndex + 1;
		}
		
		if(filter.getDistrict()!= null){
			if(whereCondition == true){
				query += " AND users.district = ?"; 
			}
			else{
				whereCondition = true;
				query += " WHERE users.district = ? ";
			}
			conditionDistrictParamIndex	 = conditionPlecParamIndex + conditionAnimalParamIndex + conditionPartyParamIndex + conditionSmokingParamIndex + conditionAlkoholParamIndex + 1;
		}
		
		if(filter.getMinAge()>0 || filter.getMaxAge()<99){
			if(whereCondition == true){
				query += " AND  users.age BETWEEN ? AND ?"; 
			}
			else{
				whereCondition = true;
				query += " WHERE users.age BETWEEN ? AND ?"; 
			}
			conditionAgeParamIndex	 = conditionPlecParamIndex + conditionAnimalParamIndex + conditionPartyParamIndex + conditionSmokingParamIndex + conditionAlkoholParamIndex + conditionDistrictParamIndex + 1;
		}
		
		if(filter.getMinRoomPrice()>0 || filter.getMaxRoomPrice()<10000){
			if(whereCondition == true){
				query += " AND  users.roomPrice BETWEEN ? AND ?"; 
			}
			else{
				whereCondition = true;
				query += " WHERE users.roomPrice BETWEEN ? AND ?"; 
			}
			conditionRoomPriceParamIndex = conditionPlecParamIndex + conditionAnimalParamIndex + conditionPartyParamIndex + conditionSmokingParamIndex + conditionAlkoholParamIndex + conditionDistrictParamIndex + conditionAgeParamIndex + 1 + 1;
		}
		
		
		
		try {
			Connection connection = DriverManager.getConnection("Default");
			PreparedStatement statement = connection.prepareStatement(query);
			if(conditionPlecParamIndex>0){
				statement.setString(conditionPlecParamIndex, filter.getPlec().toString() );
			}
			if(conditionAnimalParamIndex>0){
				statement.setString(conditionAnimalParamIndex, filter.getAnimals().toString());
			}
			if(conditionPartyParamIndex>0){
				statement.setString(conditionPlecParamIndex, filter.getParty().toString());
			}
			if(conditionSmokingParamIndex>0){
				statement.setString(conditionSmokingParamIndex, filter.getSmoking().toString());
			}
			if(conditionAlkoholParamIndex>0){
				statement.setString(conditionAlkoholParamIndex, filter.getAlkohol().toString());
			}
			if(conditionDistrictParamIndex>0){
				statement.setString(conditionDistrictParamIndex, filter.getAlkohol().toString());
			}
			if(conditionAgeParamIndex>0){
				statement.setInt(conditionAgeParamIndex, filter.getMinAge());
				statement.setInt(conditionAgeParamIndex + 1, filter.getMaxAge());
			}
			
			if(conditionAgeParamIndex>0){
				statement.setDouble(conditionRoomPriceParamIndex, filter.getMinRoomPrice());
				statement.setDouble(conditionRoomPriceParamIndex + 1, filter.getMaxRoomPrice());
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return FilterResults;
	}
	
}
