package Week19.RetailItem;

public class RetailItem {
	private String description;
	private int unitsOnHand;
	private double price;

	public RetailItem(String desc, int unit, double cost) {
		description = desc;
		unitsOnHand = unit;
		price = cost;
	}

	public void setDescription(String desc) {
		description = desc;
	}
	public void setUnitsOnHand(int unit) {
		unitsOnHand = unit;
	}

	public void setPrice(double cost) {
		price = cost;
	}

	public String getDescription() {
		return description;
	}

	public int getUnitsOnHand() {
		return unitsOnHand;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Description: " + getDescription() + "\n" +
				"Units on hands: " + getUnitsOnHand() + "\n" +
				"Price: " + getPrice() + "\n";
	}
	
}
