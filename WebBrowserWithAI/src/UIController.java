import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class UIController {

    @FXML
    private ListView<BusSchedule> scheduleListView;

    @FXML
    private Button uploadButton;

    private ScheduleParser scheduleParser = new ScheduleParser();

    @FXML
    public void initialize() {
        // Set up UI interactions and event handlers
        uploadButton.setOnAction(event -> uploadSchedule());
    }

    private void uploadSchedule() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF Files", "*.pdf"));
        File selectedFile = fileChooser.showOpenDialog(null);

        if (selectedFile != null) {
            try {
                List<BusSchedule> schedules = scheduleParser.parseSchedulesFromFile(selectedFile);
                scheduleListView.getItems().addAll(schedules);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
