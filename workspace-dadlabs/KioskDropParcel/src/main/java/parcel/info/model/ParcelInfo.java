package parcel.info.model;

public class ParcelInfo {
	
	private String senderName;
	private String senderAddress;
	private String senderPhoneNo;
	
	private String receiverName;
	private String receiverAddress;
	private String receiverPhoneNo;

	private String weightParcel;
	private String shippingState;	
	
	private String cost;
	
	public ParcelInfo() {
		super();
	}
	
	public ParcelInfo(String senderName, String senderAddress, String senderPhoneNo, String receiverName,
			String receiverAddress, String receiverPhoneNo, String weightParcel, String shippingState, String cost) {
		super();
		this.senderName = senderName;
		this.senderAddress = senderAddress;
		this.senderPhoneNo = senderPhoneNo;
		this.receiverName = receiverName;
		this.receiverAddress = receiverAddress;
		this.receiverPhoneNo = receiverPhoneNo;
		this.weightParcel = weightParcel;
		this.shippingState = shippingState;
		this.cost = cost;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getShippingState() {
		
		return shippingState;
	}

	public void setShippingState(String shippingState) {
		
		this.shippingState = shippingState;
	}

	public String getWeightParcel() {
		return weightParcel;
	}

	public void setWeightParcel(String weightParcel) {
		this.weightParcel = weightParcel;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getSenderAddress() {
		return senderAddress;
	}

	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}

	public String getSenderPhoneNo() {
		return senderPhoneNo;
	}

	public void setSenderPhoneNo(String senderPhoneNo) {
		this.senderPhoneNo = senderPhoneNo;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverAddress() {
		return receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverPhoneNo() {
		return receiverPhoneNo;
	}

	public void setReceiverPhoneNo(String receiverPhoneNo) {
		this.receiverPhoneNo = receiverPhoneNo;
	}

}
