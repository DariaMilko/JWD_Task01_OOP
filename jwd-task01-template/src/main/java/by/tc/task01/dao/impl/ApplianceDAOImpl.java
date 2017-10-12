package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.dao.creator.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO{

	ApplianceCreator creator = new ApplianceCreator();
	private final static String FILEWAY = "src/main/resources/appliances_db.txt";
	public <E> Appliance find(Criteria<E> criteria) {
		boolean fistInList = true;
		Appliance appliance = null;
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(FILEWAY))) {
			String readedLine;
			while ((readedLine = bufferedReader.readLine()) != null) {	
				continue;
				}
			String applianceName = readedLine.substring(0,readedLine.indexOf(" "));
			if (applianceName.equals(criteria.getApplianceType())) {
				List<String> listCriteria = criteria.getListCriteria();
				Map <String, String> mapTmp = new HashMap<>();
				String[] splittedLine = readedLine.split("[:;\\s,=]");
				
				for (int i=1; i<splittedLine.length; i = i + 2){
					mapTmp.put(splittedLine[i],splittedLine[i+1]);
					}
				
				for (String readiedCriteria : listCriteria) {
					String criteriaName = readiedCriteria.substring(0,readiedCriteria.indexOf('='));
					String criteriaValue = readiedCriteria.substring(readiedCriteria.indexOf('=') + 1, readiedCriteria.length());
					if (mapTmp.get(criteriaName).equals(criteriaValue) && fistInList) {
						Command command = creator.getCommand(applianceName);
						appliance = command.create(readedLine);
						fistInList = false;
						}
					}
				}
			}
		catch (IOException e) {
			e.printStackTrace();
			}
		return appliance;
		}
}

//you may add your own new classes