package com.xworkz.politician.dao;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.xworkz.politician.costant.PartyNames;
import com.xworkz.politician.costant.PartySymbols;
import com.xworkz.politician.dto.PoliticianDTO;
import static com.xworkz.politician.costant.MysqlProperties.*;

public class PoliticianDAOImpl implements PoliticianDAO {



	@Override
	public Boolean save(PoliticianDTO politicianDTO) {
		try(Connection connection =DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());) {

			String insert="INSERT into  politician.politicion_info values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement= connection.prepareStatement(insert);
			preparedStatement.setInt(1, politicianDTO.getId());
			preparedStatement.setString(2, politicianDTO.getName());
			preparedStatement.setString(3, politicianDTO.getPartyName().getPartyName());
			preparedStatement.setString(4, politicianDTO.getPartyOfficeLocation());
			preparedStatement.setDouble(5, politicianDTO.getTotalMembers());
			preparedStatement.setDouble(6, politicianDTO.getPartyBudget());
			preparedStatement.setString(7, politicianDTO.getPresident());
			preparedStatement.setString(8, politicianDTO.getHeadquarter());
			preparedStatement.setString(9, politicianDTO.getPartySymbol().getPartySymbol());
			int noOfrowAffected = preparedStatement.executeUpdate(); 

			if(noOfrowAffected > 0){
				System.out.println("the values inserted are:"+insert);
			}else {
				System.err.println("Unable to insert");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;

	}

	@Override
	public PoliticianDTO findById(int id) {
		try {
			Connection connection =DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String query="SELECT * from politician.politicion_info where id=?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				Integer id1 = rs.getInt(1);
				String name = rs.getString(2);
				String partyName = rs.getString(3);
				String location = rs.getString(4);
				Integer totalMembers = rs.getInt(5);
				Double budjet = rs.getDouble(6);
				String president1 = rs.getString(7);
				String headQuatress = rs.getString(8);
				String partySymbol = rs.getString(9);

				PoliticianDTO politicianDto = new PoliticianDTO();
				politicianDto.setId(id1);
				politicianDto.setName(name);
				politicianDto.setPartyName(PartyNames.getByPartyName(partyName));
				politicianDto.setPartyOfficeLocation(location);
				politicianDto.setTotalMembers(totalMembers);
				politicianDto.setPartyBudget(budjet);
				politicianDto.setPresident(president1);
				politicianDto.setHeadquarter(headQuatress);
				politicianDto.setPartySymbol(PartySymbols.getPartySymbolById(partySymbol));

				return politicianDto;

			}


		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null; 
	}

	@Override
	public PoliticianDTO findByIdAndPresident(Integer id, String president) {
             try {
				Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
				String query="SELECT * from politician.politicion_info where id=? and President=?";
				PreparedStatement statement = connection.prepareStatement(query);
				statement.setInt(1, id);
				statement.setString(2, president);
				
				ResultSet resultSet = statement.executeQuery();

				while (resultSet.next()) {
					Integer id1 = resultSet.getInt(1);
					String name = resultSet.getString(2);
					String partyName = resultSet.getString(3);
					String location = resultSet.getString(4);
					Integer totalMembers = resultSet.getInt(5);
					Double budjet = resultSet.getDouble(6);
					String president1 = resultSet.getString(7);
					String headQuatress = resultSet.getString(8);
					String partySymbol = resultSet.getString(9);
					PoliticianDTO politicianDto = new PoliticianDTO();
					
					politicianDto.setId(id1);
					politicianDto.setName(name);
					politicianDto.setPartyName(PartyNames.getByPartyName(partyName));
					politicianDto.setPartyOfficeLocation(location);
					politicianDto.setTotalMembers(totalMembers);
					politicianDto.setPartyBudget(budjet);
					politicianDto.setPresident(president1);
					politicianDto.setHeadquarter(headQuatress);
					politicianDto.setPartySymbol(PartySymbols.getPartySymbolById(partySymbol));

					return politicianDto;
				
				
			} 
             }
				catch (SQLException e) {
				e.printStackTrace();
			}
             
		return null;
	}

	@Override
	public PoliticianDTO findByIdAndNameAndPresident(Integer id, String name, String president) {
		try {
			Connection connection= DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String query="SELECT * from politician.politicion_info where id=? and name=? and president=?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			statement.setString(2, name);
			statement.setString(3, president);
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				Integer id1 = resultSet.getInt(1);
				String name2 = resultSet.getString(2);
				String partyName = resultSet.getString(3);
				String location = resultSet.getString(4);
				Integer totalMembers = resultSet.getInt(5);
				Double budjet = resultSet.getDouble(6);
				String president3 = resultSet.getString(7);
				String headQuatress = resultSet.getString(8);
				String partySymbol = resultSet.getString(9);
				
				PoliticianDTO politicianDto = new PoliticianDTO();
				
				politicianDto.setId(id1);
				politicianDto.setName(name2);
				politicianDto.setPartyName(PartyNames.getByPartyName(partyName));
				politicianDto.setPartyOfficeLocation(location);
				politicianDto.setTotalMembers(totalMembers);
				politicianDto.setPartyBudget(budjet);
				politicianDto.setPresident(president3);
				politicianDto.setHeadquarter(headQuatress);
				politicianDto.setPartySymbol(PartySymbols.getPartySymbolById(partySymbol));

				return politicianDto;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PoliticianDTO findByIdAndName(Integer id, String name) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String query = " SELECT * from politician.politicion_info where id=? and name=?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			statement.setString(2, name);

			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {
				Integer id3 = resultSet.getInt(1);
				String name3 = resultSet.getString(2);
				String partyName = resultSet.getString(3);
				String location = resultSet.getString(4);
				Integer totalMembers = resultSet.getInt(5);
				Double budjet = resultSet.getDouble(6);
				String president1 = resultSet.getString(7);
				String headQuatress = resultSet.getString(8);
				String partySymbol = resultSet.getString(9);
				
				PoliticianDTO politicianDto = new PoliticianDTO();
				
				politicianDto.setId(id3);
				politicianDto.setName(name3);
				politicianDto.setPartyName(PartyNames.getByPartyName(partyName));
				politicianDto.setPartyOfficeLocation(location);
				politicianDto.setTotalMembers(totalMembers);
				politicianDto.setPartyBudget(budjet);
				politicianDto.setPresident(president1);
				politicianDto.setHeadquarter(headQuatress);
				politicianDto.setPartySymbol(PartySymbols.getPartySymbolById(partySymbol));

				return politicianDto;
			}
		}
			
			
		catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String findNameById(Integer id) {
		try {
			Connection connection = DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}


