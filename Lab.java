package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.CheckBox;

public class Lab {
	private final SimpleStringProperty id;
	private final SimpleStringProperty test;
	private final SimpleStringProperty lab;
	private CheckBox remark;
	
	Lab(String Id, String Test, String Lab, CheckBox checkBox){
		this.id = new SimpleStringProperty(Id);
		this.test = new SimpleStringProperty(Test);
		this.lab = new SimpleStringProperty(Lab);
		this.remark =  checkBox;
		
	}

	public CheckBox getRemark() {
		return remark;
	}

	public void setRemark(CheckBox remark) {
		this.remark = remark;
	}

	public String getId() {
		return id.get();
	}
	public void setId(String Id) {
		id.set(Id);
	}

	public String getTest() {
		return test.get();
	}

	public void setTest(String Test) {
		test.set(Test);
	}


	public String getLab() {
		return lab.get();
	}

	public void setLab(String Lab) {
		lab.set(Lab);
	}


	
	
	
}
