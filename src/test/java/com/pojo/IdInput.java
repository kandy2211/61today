package com.pojo;

public class IdInput {


	    public String  id;
	    
	    public String  petId;
	    
	    public String quantity;
	    public String shipDate;
	    public String status;
	    public String complete;
		public IdInput(String id, String petId, String quantity, String shipDate, String status, String complete) {
			super();
			this.id = id;
			this.petId = petId;
			this.quantity = quantity;
			this.shipDate = shipDate;
			this.status = status;
			this.complete = complete;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getPetId() {
			return petId;
		}
		public void setPetId(String petId) {
			this.petId = petId;
		}
		public String getQuantity() {
			return quantity;
		}
		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}
		public String getShipDate() {
			return shipDate;
		}
		public void setShipDate(String shipDate) {
			this.shipDate = shipDate;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getComplete() {
			return complete;
		}
		public void setComplete(String complete) {
			this.complete = complete;
		}
	    
	    
	    
		
}
