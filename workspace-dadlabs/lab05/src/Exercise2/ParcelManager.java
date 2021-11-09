package Exercise2;

public class ParcelManager {
	
	public Parcel createParcel (Parcel parcel) {
		
		// Get graduate level
		double WeightKG = this.WeightKG(parcel.getWeight());
		parcel.setWeight(WeightKG);
		
		Double weight = parcel.getWeight();
		parcel.setWeight(weight);
		
		String name1 = parcel.getName1().toUpperCase();
		parcel.setName1(name1);
		
		String name2 = parcel.getName2().toUpperCase();
		parcel.setName2(name2);

		
		return parcel;
		
	}
	
private double WeightKG () {
	
	int WeightKG = 0;
		
		switch (WeightKG) {
		
		case 0:
		case 'T':
			return 'U';
		
		case 'M':
		case 'A':
			return 'P';
		
		default:
			return 'X';
		}
		
	}

}
