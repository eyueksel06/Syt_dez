package rest.election;

import rest.model.*;


import java.util.ArrayList;
import java.util.List;

public class ElectionSimulation {
	
	private double getRandomDouble( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum; 
		double rounded = Math.round(number * 100.0) / 100.0; 
		return rounded;
		
	}

	private int getRandomInt( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum; 
		Long rounded = Math.round(number); 
		return rounded.intValue();

	}
	
	public ElectionData getData(String inID ) {
		
		ElectionData data = new ElectionData();
		data.setRegionID( inID );
		data.setRegionName("Wien Ottakring");
		data.setRegionAddress("Maroltingergasse 69-71");
		data.setRegionPostalCode("Wien");
		data.setFederalState("Oesterreich");

		Party fpoe = new Party("FPOE",getRandomInt(200,300));
		Party oevp = new Party("OEVP",getRandomInt(150,250));
		Party spoe = new Party("SPOE",getRandomInt(100,200));
		Party gruene = new Party("GRUENE",getRandomInt(25,100));
		Party neos = new Party("NEOS",getRandomInt(50,150));
		Party bierpartei = new Party("BIERPARTEI",getRandomInt(12,50));

		List<Party> partys = new ArrayList<>();

		List<Vorzugsperson> vorzugFPOE = new ArrayList<>();
		List<Vorzugsperson> vorzugOEVP = new ArrayList<>();
		List<Vorzugsperson> vorzugSPOE = new ArrayList<>();
		List<Vorzugsperson> vorzugGRUENE = new ArrayList<>();
		List<Vorzugsperson> vorzugNEOS = new ArrayList<>();
		List<Vorzugsperson> vorzugBIERPARTEI = new ArrayList<>();

		Vorzugsperson eyueksel = new Vorzugsperson("Eren Yüksel", getRandomInt(0, bierpartei.getAmountVotes()));
		vorzugBIERPARTEI.add(eyueksel);
		bierpartei.setVorzugspersonen(vorzugBIERPARTEI);
		Vorzugsperson yeren = new Vorzugsperson("Yunus Eren",getRandomInt(0,fpoe.getAmountVotes()));
		vorzugFPOE.add(yeren);
		fpoe.setVorzugspersonen(vorzugFPOE);
		Vorzugsperson lbulic = new Vorzugsperson("Lazar Bulic",getRandomInt(0,neos.getAmountVotes()));
		vorzugNEOS.add(lbulic);
		neos.setVorzugspersonen(vorzugNEOS);
		Vorzugsperson cparushev = new Vorzugsperson("Christian Parushev",getRandomInt(0,gruene.getAmountVotes()));
		vorzugGRUENE.add(cparushev);
		gruene.setVorzugspersonen(vorzugGRUENE);
		Vorzugsperson ashemsidini = new Vorzugsperson("Adem Shemsidini",getRandomInt(0,spoe.getAmountVotes()));
		vorzugSPOE.add(ashemsidini);
		spoe.setVorzugspersonen(vorzugSPOE);
		Vorzugsperson fandrae = new Vorzugsperson("Florian Andrä",getRandomInt(0,oevp.getAmountVotes()));
		vorzugOEVP.add(fandrae);
		oevp.setVorzugspersonen(vorzugOEVP);

		Vorzugsperson dwojtasik = new Vorzugsperson("Daniel Wojtasik",getRandomInt(0,neos.getAmountVotes()));
		vorzugNEOS.add(dwojtasik);
		Vorzugsperson fbayerl = new Vorzugsperson("Felix Bayerl",getRandomInt(0,bierpartei.getAmountVotes()));
		vorzugBIERPARTEI.add(fbayerl);

		partys.add(fpoe);
		partys.add(oevp);
		partys.add(spoe);
		partys.add(gruene);
		partys.add(neos);
		partys.add(bierpartei);

		data.setPartys(partys);

		return data;
		
	}

}
