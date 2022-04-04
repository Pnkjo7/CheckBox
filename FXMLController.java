package application;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class FXMLController implements Initializable {

    @FXML
    private Button actionButton;
    
    @FXML
    private TableView<Lab> tableview;

    @FXML
    private TableColumn<Lab, CheckBox> actionCol;

    @FXML
    private TableColumn<Lab, String> id;

    @FXML
    private TableColumn<Lab, String> lab;

    @FXML
    private CheckBox selectall;

    @FXML
    private TableColumn<Lab, String> test;
	@FXML
	private TextField filterField;
    
    
    @FXML
    private TableView<Lab> stableview;

    @FXML
    private TableColumn<Lab, String> sid;

    @FXML
    private TableColumn<Lab, String> stest;

    @FXML
    private TableColumn<Lab, String> slab;

    
//    ObservableList<Lab> data;
//    
    ObservableList<Lab> items;
//    
	private final ObservableList<Lab> list = FXCollections.observableArrayList();
    
    
    public void  initialize(URL url, ResourceBundle rb) {
    	
    	for(int i=0;i<15;i++) {
    	CheckBox ch = new CheckBox("");
    	list.add(new Lab("1001","cbc","lab",ch));
    	
    	} 
    	
    	tableview.setItems(list);
    	
    	
    	
    
    	
    	
    	
    	selectall.selectedProperty().addListener(new ChangeListener<Boolean>() {
    		@Override
    		public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue ) {
    			System.out.println("Selected All Selected");
    			items=tableview.getItems();
    			
    			for(Lab item:items) {
    				if(selectall.isSelected())
    					item.getRemark().setSelected(true);
    				else
    					item.getRemark().setSelected(false);
    				
    			}
    			
    			
    		}
    	});
//    	
//    	data = FXCollections.observableArrayList(
//    			new Lab("1001","CBC","Hameogolobin",""),
//    			new Lab("1002","X-Ray","Radiology",""),
//    			new Lab("1003","CBC","Hameogolobin",""),
//    			new Lab("1004","CBC","Hameogolobin",""),
//    			new Lab("1005","CBC","Hameogolobin",""),
//    			new Lab("1006","CBC","Hameogolobin","")
//    			);
//    	
    	id.setCellValueFactory(new PropertyValueFactory<Lab,String>("Id"));
    	test.setCellValueFactory(new PropertyValueFactory<Lab,String>("Test"));
    	lab.setCellValueFactory(new PropertyValueFactory<Lab,String>("Lab"));
    	actionCol.setCellValueFactory(new PropertyValueFactory<Lab, CheckBox>("remark"));
    
  	
    	sid.setCellValueFactory(new PropertyValueFactory<Lab,String>("Id"));
    	stest.setCellValueFactory(new PropertyValueFactory<Lab,String>("Test"));
    	slab.setCellValueFactory(new PropertyValueFactory<Lab,String>("Lab"));
    }
//    	
//    	
//    	
//    	
//    	tableview.setItems(data);
//    	
//    }
//    
//    @FXML
//	private void displaySelected(MouseEvent event) {
//		Lab person = tableview.getSelectionModel().getSelectedItem();
//		if (person == null) {
//			filterField.setText(" ");
//		} else {
//			String code = person.getId();
//			String name = person.getTest();
//			String lab = person.getLab();
//			filterField.setText(name);
//		}
//	}
    	@FXML
    	private void handleButtonAction(ActionEvent ae) {
    		for(Lab lb : tableview.getItems()) {
    			if(lb.getRemark().isSelected()) {
    				Platform.runLater(()->{
    				stableview.getItems().add(lb);
    			});
    		}
    		}
	   

		}
//		
//
}
    
