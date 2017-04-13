public class SalesTaxLookup {
private  static String[][] zipcodes = {
	{"75087","8.25"},
	{"30080","6.0"},
	{"61761","8.75"},
	{"85001","8.60"},
	};

public static double lookup(String zipcode){
	double returnVal = 0;
	for(String[] vals : zipcodes){
		if(vals[0].equalsIgnoreCase(zipcode)){
			returnVal = Double.parseDouble(vals[1]);
		}
	}
	return returnVal;
}

}