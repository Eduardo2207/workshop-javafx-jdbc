module workshopjavafx {
	requires javafx.controls;
	requires javafx.fxml;
	opens  model.entities;
	opens application to javafx.graphics, javafx.fxml;
	opens gui to javafx.fxml;
}
