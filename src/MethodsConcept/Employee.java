package MethodsConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee {

	// WAF: getEmpDevices(String name)
	// return : ArrayList<String>

	public ArrayList<String> getEmpDevices(String name) {
		ArrayList<String> devicesList = new ArrayList<String>();

		System.out.println("emp name : " + name);

		if (name.equals("sri")) {
			devicesList.add("iph12");
			devicesList.add("iph11");
			devicesList.add("iph13");
		} else if (name.equals("shashi")) {
			devicesList.add("sg12");
			devicesList.add("sg13");
			devicesList.add("sg11");
		} else {
			System.out.println("emp is not found...." + name);
		}

		return devicesList;
	}

	public String[] getCompInfo(String compName) {
		String dept[] = new String[5];
		System.out.println("comp name : " + compName);

		if (compName.equals("IBM")) {
			dept[0] = "HR";
			dept[1] = "admin";
			dept[2] = "finance";
		}

		else if (compName.equals("TCS")) {
			dept[0] = "HR";
			dept[1] = "admin";
			dept[2] = "finance";
			dept[3] = "QA";
			dept[4] = "Product";
		}

		else {
			System.out.println("comp is not found...." + compName);
		}

		return dept;

	}

	public static void main(String[] args) {

		Employee obj = new Employee();
		ArrayList<String> empDevList = obj.getEmpDevices("naveen");
		System.out.println(empDevList);

		String deptArr[] = obj.getCompInfo("IBM");
		System.out.println(Arrays.toString(deptArr));

	}

}
