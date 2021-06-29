
package ucf.assignments;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class ToDoListController implements Initializable {

    @FXML
    private Label label;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        sc.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                                Number old_val, Number new_val) {
                accordion.translateYProperty().bindBidirectional(sc.valueProperty());
            }
        });    }

    @FXML
    private Accordion accordion;

    @FXML
    private ScrollBar sc;

    @FXML
    private Button addListButton;

    @FXML
    private Button removeListButton;

    @FXML
    private Button editListTitleButton;

    @FXML
    private Button importButton;

    @FXML
    private Button exportButton;

    @FXML
    private Button showAllButton;

    @FXML
    private Button showCompleteButton;

    @FXML
    private Button showIncompleteButton;

    @FXML
    void addListClicked(ActionEvent actionEvent)
    {
        //prompt user for title
        //create new entry in arraylist and accordion
        //adding entry shouldn't effect accordion height unless scrollbar needs to be reassessed but it should be fine
    }
    @FXML
    void removeListClicked(ActionEvent actionEvent)
    {
        //prompt user for entry index to edit
        //if index exists, ask for confirmation
            //if doesn't exist prompt again or cancellation
        //if confirmed remove entry from arraylist and remove entry in accordion
        //if removing entry in accordion doesn't revaluate the height, create a new accordion with correlating height
    }
    @FXML
    void editListTitleClicked(ActionEvent actionEvent)
    {
        //prompt user for entry index to edit
        //if index exists, ask user for new title
            //if doesn't exist prompt again
        //set class.title to user prompt at prompted index
    }
    @FXML
    void importListClicked(ActionEvent actionEvent)
    {
        //prompt user in new window if they want to import one or several
        //get to path through file explorer (or if have to; ask for path)
        //load file as File and send to parse
    }
    @FXML
    void exportListClicked(ActionEvent actionEvent)
    {
        //prompt user in new window if they want to export one or several
        //get to save path through file explorer (or if have to; ask for path)
        //save as txt or json
    }
    @FXML
    void allListsClicked(ActionEvent actionEvent)
    {
        //increment through all entries of accordion
        //if entry is disabled, re-enable it
    }
    @FXML
    void completeListClicked(ActionEvent actionEvent)
    {
        //increment through all entries of accordion
        //if entry class.complete = false then disable it
        //if disabling an entry in an accordian doesn't revaluate the height then create a new accordian in accordance to new height and display that instead //do this in seperate method
    }
    @FXML
    void incompleteListClicked(ActionEvent actionEvent)
    {
        //increment through all entries of accordion
        //if entry class.complete = true then disable it
        //if disabling an entry in an accordian doesn't revaluate the height then create a new accordian in accordance to new height and display that instead //do this in seperate method
    }
}