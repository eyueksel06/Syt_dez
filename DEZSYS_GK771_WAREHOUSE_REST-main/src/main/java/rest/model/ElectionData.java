package rest.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ElectionData {
	
	private String regionID;
	private String regionName;
	private String regionAddress;
	private String regionPostalCode;
	private String federalState;
	private String timestamp;
	private List<Party> partys = new ArrayList<>();

	/**
	 * Constructor
	 */
	public ElectionData() {
		this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
	}
	/**
	 * Setter and Getter Methods
	 */
	public void setPartys(List<Party> partys) {
		this.partys = partys;
	}
	public String getPartys(){
		String txt = "";
		for (Party party : partys) {
			txt += ""+party.getPartyID()+" Votes:"+party.getAmountVotes()+", Vorzugsstimmen: "+party.getVorzugspersonen().toString();
		}
		return txt;
	}
	public String getRegionID() {
		return regionID;
	}
	public void setRegionID(String regionID) {
		this.regionID = regionID;
	}
	public String getRegionName() {
		return regionName;
	}
	public String getRegionAddress() {
		return regionAddress;
	}
	public String getRegionPostalCode() {
		return regionPostalCode;
	}
	public String getFederalState() {
		return federalState;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public void setRegionAddress(String regionAddress) {
		this.regionAddress = regionAddress;
	}
	public void setRegionPostalCode(String regionPostalCode) {
		this.regionPostalCode = regionPostalCode;
	}
	public void setFederalState(String federalState) {
		this.federalState = federalState;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	/**
	 * Methods
	 */
	@Override
	public String toString() {
		String info = String.format("Election Info: ID = %s, Region Name = %s, Region Address = %s, Region Postal Code = %s, Federal State = %s, timestamp = %s, Partys = %s", regionID, regionName, regionAddress, regionPostalCode, federalState, timestamp, partys );
		return info;
	}
}
